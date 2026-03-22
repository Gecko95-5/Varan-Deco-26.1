package net.gecko.varandeco.block.entity.stone;

import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.BlastFurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class BlackstoneBlastFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
	public BlackstoneBlastFurnaceBlockEntity(BlockPos pos, BlockState state) {
		super(DecoBlockEntities.BLACKSTONE_BLAST_FURNACE_BE, pos, state, RecipeType.BLASTING);
	}

	@Override
	protected Text getContainerName() {
		return Text.translatable("container.blast_furnace");
	}


	@Override
	protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
		return new BlastFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
	}
}
