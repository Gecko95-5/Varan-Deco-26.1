package net.gecko.varandeco.block.woodmadeblocks.craftingtables;

import net.gecko.varandeco.screen.wood.craftingtables.MushroomCraftingMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MushroomCraftingTableBlock extends Block {
	private static final Component TITLE = Component.translatable("container.crafting");

	public MushroomCraftingTableBlock(Properties settings) {
		super(settings);
	}

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (!world.isClientSide()) {
            player.openMenu(state.getMenuProvider(world, pos));
            player.awardStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
        }

        return InteractionResult.SUCCESS;
    }

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level world, BlockPos pos) {
		return new SimpleMenuProvider(
			(syncId, inventory, player) -> new MushroomCraftingMenu(syncId, inventory, ContainerLevelAccess.create(world, pos)), TITLE
		);
	}
}
