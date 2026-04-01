package net.gecko.varandeco.block.entity.stone;

import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.SmokerMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlackstoneSmokerBlockEntity extends AbstractFurnaceBlockEntity {
	public BlackstoneSmokerBlockEntity(BlockPos pos, BlockState state) {
		super(DecoBlockEntities.BLACKSTONE_SMOKER_BE, pos, state, RecipeType.SMOKING);
	}

	@Override
	protected Component getDefaultName() {
		return Component.translatable("container.smoker");
	}


	@Override
	protected AbstractContainerMenu createMenu(int syncId, Inventory playerInventory) {
		return new SmokerMenu(syncId, playerInventory, this, this.dataAccess);
	}
}
