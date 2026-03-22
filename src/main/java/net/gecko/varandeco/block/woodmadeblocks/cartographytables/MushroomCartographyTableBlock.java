package net.gecko.varandeco.block.woodmadeblocks.cartographytables;

import net.gecko.varandeco.screen.wood.cartographytables.MushroomCartographyTableScreenHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MushroomCartographyTableBlock extends Block {
	private static final Text TITLE = Text.translatable("container.cartography_table");

	public MushroomCartographyTableBlock(Settings settings) {
		super(settings);
	}

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient()) {
            player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
            player.incrementStat(Stats.INTERACT_WITH_CARTOGRAPHY_TABLE);
        }

        return ActionResult.SUCCESS;
    }

	@Nullable
	@Override
	public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
		return new SimpleNamedScreenHandlerFactory(
			(syncId, inventory, player) -> new MushroomCartographyTableScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, pos)), TITLE
		);
	}
}
