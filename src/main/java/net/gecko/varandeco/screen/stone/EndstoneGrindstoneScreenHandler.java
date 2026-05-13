package net.gecko.varandeco.screen.stone;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.phys.Vec3;

public class EndstoneGrindstoneScreenHandler extends AbstractContainerMenu {
	public static final int field_30793 = 35;
	public static final int field_30794 = 0;
	public static final int field_30795 = 1;
	public static final int field_30796 = 2;
	private static final int field_30797 = 3;
	private static final int field_30798 = 30;
	private static final int field_30799 = 30;
	private static final int field_30800 = 39;
	private final Container result = new ResultContainer();
	final Container input = new SimpleContainer(2) {
		@Override
		public void setChanged() {
			super.setChanged();
			EndstoneGrindstoneScreenHandler.this.slotsChanged(this);
		}
	};
	private final ContainerLevelAccess context;

	public EndstoneGrindstoneScreenHandler(int syncId, Inventory playerInventory) {
		this(syncId, playerInventory, ContainerLevelAccess.NULL);
	}

	public EndstoneGrindstoneScreenHandler(int syncId, Inventory playerInventory, ContainerLevelAccess context) {
        super(MenuType.GRINDSTONE, syncId);
        this.context = context;
        this.addSlot(new Slot(this.input, 0, 49, 19) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.isDamageableItem() || EnchantmentHelper.hasAnyEnchantments(stack);
            }
        });
        this.addSlot(new Slot(this.input, 1, 49, 40) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.isDamageableItem() || EnchantmentHelper.hasAnyEnchantments(stack);
            }
        });
        this.addSlot(new Slot(this.result, 2, 129, 34) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }

            @Override
            public void onTake(Player player, ItemStack stack) {
                context.execute((world, pos) -> {
                    if (world instanceof ServerLevel) {
                        ExperienceOrb.award((ServerLevel)world, Vec3.atCenterOf(pos), this.getExperience(world));
                    }

                    world.levelEvent(LevelEvent.SOUND_GRINDSTONE_USED, pos, 0);
                });
                EndstoneGrindstoneScreenHandler.this.input.setItem(0, ItemStack.EMPTY);
                EndstoneGrindstoneScreenHandler.this.input.setItem(1, ItemStack.EMPTY);
            }

            private int getExperience(Level world) {
                int i = 0;
                i += this.getExperience(EndstoneGrindstoneScreenHandler.this.input.getItem(0));
                i += this.getExperience(EndstoneGrindstoneScreenHandler.this.input.getItem(1));
                if (i > 0) {
                    int j = (int)Math.ceil(i / 2.0);
                    return j + world.random.nextInt(j);
                } else {
                    return 0;
                }
            }

            private int getExperience(ItemStack stack) {
                int i = 0;
                ItemEnchantments itemEnchantmentsComponent = EnchantmentHelper.getEnchantmentsForCrafting(stack);

                for (Object2IntMap.Entry<Holder<Enchantment>> entry : itemEnchantmentsComponent.entrySet()) {
                    Holder<Enchantment> registryEntry = (Holder<Enchantment>)entry.getKey();
                    int j = entry.getIntValue();
                    if (!registryEntry.is(EnchantmentTags.CURSE)) {
                        i += registryEntry.value().getMinCost(j);
                    }
                }

                return i;
            }
        });

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    @Override
    public void slotsChanged(Container inventory) {
        super.slotsChanged(inventory);
        if (inventory == this.input) {
            this.updateResult();
        }
    }

    private void updateResult() {
        this.result.setItem(0, this.getOutputStack(this.input.getItem(0), this.input.getItem(1)));
        this.broadcastChanges();
    }

    private ItemStack getOutputStack(ItemStack firstInput, ItemStack secondInput) {
        boolean bl = !firstInput.isEmpty() || !secondInput.isEmpty();
        if (!bl) {
            return ItemStack.EMPTY;
        } else if (firstInput.getCount() <= 1 && secondInput.getCount() <= 1) {
            boolean bl2 = !firstInput.isEmpty() && !secondInput.isEmpty();
            if (!bl2) {
                ItemStack itemStack = !firstInput.isEmpty() ? firstInput : secondInput;
                return !EnchantmentHelper.hasAnyEnchantments(itemStack) ? ItemStack.EMPTY : this.grind(itemStack.copy());
            } else {
                return this.combineItems(firstInput, secondInput);
            }
        } else {
            return ItemStack.EMPTY;
        }
    }

    private ItemStack combineItems(ItemStack firstInput, ItemStack secondInput) {
        if (!firstInput.is(secondInput.getItem())) {
            return ItemStack.EMPTY;
        } else {
            int i = Math.max(firstInput.getMaxDamage(), secondInput.getMaxDamage());
            int j = firstInput.getMaxDamage() - firstInput.getDamageValue();
            int k = secondInput.getMaxDamage() - secondInput.getDamageValue();
            int l = j + k + i * 5 / 100;
            int m = 1;
            if (!firstInput.isDamageableItem()) {
                if (firstInput.getMaxStackSize() < 2 || !ItemStack.matches(firstInput, secondInput)) {
                    return ItemStack.EMPTY;
                }

                m = 2;
            }

            ItemStack itemStack = firstInput.copyWithCount(m);
            if (itemStack.isDamageableItem()) {
                itemStack.set(DataComponents.MAX_DAMAGE, i);
                itemStack.setDamageValue(Math.max(i - l, 0));
            }

            this.transferEnchantments(itemStack, secondInput);
            return this.grind(itemStack);
        }
    }

    private void transferEnchantments(ItemStack target, ItemStack source) {
        EnchantmentHelper.updateEnchantments(target, components -> {
            ItemEnchantments itemEnchantmentsComponent = EnchantmentHelper.getEnchantmentsForCrafting(source);

            for (Object2IntMap.Entry<Holder<Enchantment>> entry : itemEnchantmentsComponent.entrySet()) {
                Holder<Enchantment> registryEntry = (Holder<Enchantment>)entry.getKey();
                if (!registryEntry.is(EnchantmentTags.CURSE) || components.getLevel(registryEntry) == 0) {
                    components.upgrade(registryEntry, entry.getIntValue());
                }
            }
        });
    }

    private ItemStack grind(ItemStack item) {
        ItemEnchantments itemEnchantmentsComponent = EnchantmentHelper.updateEnchantments(
                item, components -> components.removeIf(enchantment -> !enchantment.is(EnchantmentTags.CURSE))
        );
        if (item.is(Items.ENCHANTED_BOOK) && itemEnchantmentsComponent.isEmpty()) {
            item = item.transmuteCopy(Items.BOOK);
        }

        int i = 0;

        for (int j = 0; j < itemEnchantmentsComponent.size(); j++) {
            i = AnvilMenu.calculateIncreasedRepairCost(i);
        }

        item.set(DataComponents.REPAIR_COST, i);
        return item;
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        this.context.execute((world, pos) -> this.clearContainer(player, this.input));
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(this.context, player, DecoBlocks.END_STONE_GRINDSTONE);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int slot) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot2 = this.slots.get(slot);
        if (slot2 != null && slot2.hasItem()) {
            ItemStack itemStack2 = slot2.getItem();
            itemStack = itemStack2.copy();
            ItemStack itemStack3 = this.input.getItem(0);
            ItemStack itemStack4 = this.input.getItem(1);
            if (slot == 2) {
                if (!this.moveItemStackTo(itemStack2, 3, 39, true)) {
                    return ItemStack.EMPTY;
                }

                slot2.onQuickCraft(itemStack2, itemStack);
            } else if (slot != 0 && slot != 1) {
                if (!itemStack3.isEmpty() && !itemStack4.isEmpty()) {
                    if (slot >= 3 && slot < 30) {
                        if (!this.moveItemStackTo(itemStack2, 30, 39, false)) {
                            return ItemStack.EMPTY;
                        }
                    } else if (slot >= 30 && slot < 39 && !this.moveItemStackTo(itemStack2, 3, 30, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (!this.moveItemStackTo(itemStack2, 0, 2, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemStack2, 3, 39, false)) {
                return ItemStack.EMPTY;
            }

            if (itemStack2.isEmpty()) {
                slot2.setByPlayer(ItemStack.EMPTY);
            } else {
                slot2.setChanged();
            }

            if (itemStack2.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot2.onTake(player, itemStack2);
        }

        return itemStack;
    }
}
