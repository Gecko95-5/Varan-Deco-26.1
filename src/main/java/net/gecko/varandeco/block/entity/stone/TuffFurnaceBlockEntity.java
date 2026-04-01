package net.gecko.varandeco.block.entity.stone;

import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class TuffFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
	public TuffFurnaceBlockEntity(BlockPos pos, BlockState state) {
		super(DecoBlockEntities.TUFF_FURNACE_BE, pos, state, RecipeType.SMELTING);
	}

	@Override
	protected Component getDefaultName() {
		return Component.translatable("container.furnace");
	}

	@Override
	protected AbstractContainerMenu createMenu(int syncId, Inventory playerInventory) {
		return new FurnaceMenu(syncId, playerInventory, this, this.dataAccess);
	}
}
