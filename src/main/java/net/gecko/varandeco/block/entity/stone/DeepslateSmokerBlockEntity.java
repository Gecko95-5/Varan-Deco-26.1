package net.gecko.varandeco.block.entity.stone;

import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SmokerScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class DeepslateSmokerBlockEntity extends AbstractFurnaceBlockEntity {
	public DeepslateSmokerBlockEntity(BlockPos pos, BlockState state) {
		super(DecoBlockEntities.DEEPSLATE_SMOKER_BE, pos, state, RecipeType.SMOKING);
	}

	@Override
	protected Text getContainerName() {
		return Text.translatable("container.smoker");
	}

	@Override
	protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
		return new SmokerScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
	}
}
