package net.gecko.varandeco.screen.wood.smithingtables;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.DataSlot;
import net.minecraft.world.inventory.ItemCombinerMenu;
import net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeAccess;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipePropertySet;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SmithingRecipe;
import net.minecraft.world.item.crafting.SmithingRecipeInput;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;
import java.util.Optional;

public class IronCapSmithingScreenHandler extends ItemCombinerMenu {
    public static final int TEMPLATE_ID = 0;
    public static final int EQUIPMENT_ID = 1;
    public static final int MATERIAL_ID = 2;
    public static final int OUTPUT_ID = 3;
    public static final int TEMPLATE_X = 8;
    public static final int EQUIPMENT_X = 26;
    public static final int MATERIAL_X = 44;
    private static final int OUTPUT_X = 98;
    public static final int SLOT_Y = 48;
    private final Level world;
    private final RecipePropertySet basePropertySet;
    private final RecipePropertySet templatePropertySet;
    private final RecipePropertySet additionPropertySet;
    private final DataSlot invalidRecipe = DataSlot.standalone();

    public IronCapSmithingScreenHandler(int syncId, Inventory playerInventory) {
        this(syncId, playerInventory, ContainerLevelAccess.NULL);
    }

    public IronCapSmithingScreenHandler(int syncId, Inventory playerInventory, ContainerLevelAccess context) {
        this(syncId, playerInventory, context, playerInventory.player.level());
    }

    private IronCapSmithingScreenHandler(int syncId, Inventory playerInventory, ContainerLevelAccess context, Level world) {
        super(MenuType.SMITHING, syncId, playerInventory, context, createForgingSlotsManager(world.recipeAccess()));
        this.world = world;
        this.basePropertySet = world.recipeAccess().propertySet(RecipePropertySet.SMITHING_BASE);
        this.templatePropertySet = world.recipeAccess().propertySet(RecipePropertySet.SMITHING_TEMPLATE);
        this.additionPropertySet = world.recipeAccess().propertySet(RecipePropertySet.SMITHING_ADDITION);
        this.addDataSlot(this.invalidRecipe).set(0);
    }

    private static ItemCombinerMenuSlotDefinition createForgingSlotsManager(RecipeAccess recipeManager) {
        RecipePropertySet recipePropertySet = recipeManager.propertySet(RecipePropertySet.SMITHING_BASE);
        RecipePropertySet recipePropertySet2 = recipeManager.propertySet(RecipePropertySet.SMITHING_TEMPLATE);
        RecipePropertySet recipePropertySet3 = recipeManager.propertySet(RecipePropertySet.SMITHING_ADDITION);
        return ItemCombinerMenuSlotDefinition.create()
                .withSlot(0, 8, 48, recipePropertySet2::test)
                .withSlot(1, 26, 48, recipePropertySet::test)
                .withSlot(2, 44, 48, recipePropertySet3::test)
                .withResultSlot(3, 98, 48)
                .build();
    }

    @Override
    protected boolean isValidBlock(BlockState state) {
        return state.is(DecoBlocks.IRON_CAP_SMITHING_TABLE);
    }

    @Override
    protected void onTake(Player player, ItemStack stack) {
        stack.onCraftedBy(player, stack.getCount());
        this.resultSlots.awardUsedRecipes(player, this.getInputStacks());
        this.decrementStack(0);
        this.decrementStack(1);
        this.decrementStack(2);
        this.access.execute((world, pos) -> world.levelEvent(LevelEvent.SOUND_SMITHING_TABLE_USED, pos, 0));
    }

    private List<ItemStack> getInputStacks() {
        return List.of(this.inputSlots.getItem(0), this.inputSlots.getItem(1), this.inputSlots.getItem(2));
    }

    private SmithingRecipeInput createRecipeInput() {
        return new SmithingRecipeInput(this.inputSlots.getItem(0), this.inputSlots.getItem(1), this.inputSlots.getItem(2));
    }

    private void decrementStack(int slot) {
        ItemStack itemStack = this.inputSlots.getItem(slot);
        if (!itemStack.isEmpty()) {
            itemStack.shrink(1);
            this.inputSlots.setItem(slot, itemStack);
        }
    }

    @Override
    public void slotsChanged(Container inventory) {
        super.slotsChanged(inventory);
        if (this.world instanceof ServerLevel) {
            boolean bl = this.getSlot(0).hasItem() && this.getSlot(1).hasItem() && this.getSlot(2).hasItem() && !this.getSlot(this.getResultSlot()).hasItem();
            this.invalidRecipe.set(bl ? 1 : 0);
        }
    }

    @Override
    public void createResult() {
        SmithingRecipeInput smithingRecipeInput = this.createRecipeInput();
        Optional<RecipeHolder<SmithingRecipe>> optional;
        if (this.world instanceof ServerLevel serverWorld) {
            optional = serverWorld.recipeAccess().getRecipeFor(RecipeType.SMITHING, smithingRecipeInput, serverWorld);
        } else {
            optional = Optional.empty();
        }

        optional.ifPresentOrElse(recipe -> {
            ItemStack itemStack = ((SmithingRecipe)recipe.value()).assemble(smithingRecipeInput, this.world.registryAccess());
            this.resultSlots.setRecipeUsed(recipe);
            this.resultSlots.setItem(0, itemStack);
        }, () -> {
            this.resultSlots.setRecipeUsed(null);
            this.resultSlots.setItem(0, ItemStack.EMPTY);
        });
    }

    @Override
    public boolean canTakeItemForPickAll(ItemStack stack, Slot slot) {
        return slot.container != this.resultSlots && super.canTakeItemForPickAll(stack, slot);
    }

    @Override
    public boolean canMoveIntoInputSlots(ItemStack stack) {
        if (this.templatePropertySet.test(stack) && !this.getSlot(0).hasItem()) {
            return true;
        } else {
            return this.basePropertySet.test(stack) && !this.getSlot(1).hasItem() ? true : this.additionPropertySet.test(stack) && !this.getSlot(2).hasItem();
        }
    }

    public boolean hasInvalidRecipe() {
        return this.invalidRecipe.get() > 0;
    }
}