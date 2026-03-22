package net.gecko.varandeco.block.entity.stone;

import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.FurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class TuffFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
	public TuffFurnaceBlockEntity(BlockPos pos, BlockState state) {
		super(DecoBlockEntities.TUFF_FURNACE_BE, pos, state, RecipeType.SMELTING);
	}

	@Override
	protected Text getContainerName() {
		return Text.translatable("container.furnace");
	}

	@Override
	protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
		return new FurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
	}
}
