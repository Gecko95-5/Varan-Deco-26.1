package net.gecko.varandeco.block.entity.stone;

import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class EndstoneBlastFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
	public EndstoneBlastFurnaceBlockEntity(BlockPos pos, BlockState state) {
		super(DecoBlockEntities.END_STONE_BLAST_FURNACE_BE, pos, state, RecipeType.BLASTING);
	}

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.blast_furnace");
    }


    @Override
    protected AbstractContainerMenu createMenu(int syncId, Inventory playerInventory) {
        return new BlastFurnaceMenu(syncId, playerInventory, this, this.dataAccess);
    }
}
