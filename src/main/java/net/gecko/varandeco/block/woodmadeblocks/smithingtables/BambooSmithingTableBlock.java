package net.gecko.varandeco.block.woodmadeblocks.smithingtables;

import net.gecko.varandeco.screen.wood.smithingtables.BambooSmithingScreenHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class BambooSmithingTableBlock extends CraftingTableBlock {
	private static final Component SCREEN_TITLE = Component.translatable("container.upgrade");

	public BambooSmithingTableBlock(Properties settings) {
		super(settings);
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level world, BlockPos pos) {
		return new SimpleMenuProvider(
			(syncId, inventory, player) -> new BambooSmithingScreenHandler(syncId, inventory, ContainerLevelAccess.create(world, pos)), SCREEN_TITLE
		);
	}

	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
		if (!world.isClientSide()) {
			player.openMenu(state.getMenuProvider(world, pos));
			player.awardStat(Stats.INTERACT_WITH_SMITHING_TABLE);
		}

		return InteractionResult.SUCCESS;
	}
}
