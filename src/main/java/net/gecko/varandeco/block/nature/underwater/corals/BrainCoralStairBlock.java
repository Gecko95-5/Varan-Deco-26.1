package net.gecko.varandeco.block.nature.underwater.corals;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;

public class BrainCoralStairBlock extends StairBlock {
    public BrainCoralStairBlock(BlockState baseBlockState, Properties settings) {
        super(baseBlockState, settings);
    }
    @Override
    protected void onPlace(final BlockState state, final Level level, final BlockPos pos, final BlockState oldState, final boolean movedByPiston) {
        this.tryScheduleDieTick(state, level, level, level.getRandom(), pos);
    }

    @Override
    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!scanForWater(state, world, pos)) {
            world.setBlock(pos, DecoBlocks.DEAD_BRAIN_CORAL_STAIRS.defaultBlockState().setValue(WATERLOGGED, false).setValue(FACING, state.getValue(FACING)), Block.UPDATE_CLIENTS);
        }
    }

    @Override
    protected BlockState updateShape(
            BlockState state,
            LevelReader world,
            ScheduledTickAccess tickView,
            BlockPos pos,
            Direction direction,
            BlockPos neighborPos,
            BlockState neighborState,
            RandomSource random
    ) {
        if (direction == Direction.DOWN && !state.canSurvive(world, pos)) {
            return Blocks.AIR.defaultBlockState();
        } else {
            this.tryScheduleDieTick(state, world, tickView, random, pos);
            if (state.getValue(WATERLOGGED)) {
                tickView.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
            }

            return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
        }
    }
    protected static boolean scanForWater(final BlockState state, final BlockGetter level, final BlockPos blockPos) {
        if (state.getValue(WATERLOGGED)) {
            return true;
        } else {
            for (Direction direction : Direction.values()) {
                if (level.getFluidState(blockPos.relative(direction)).is(FluidTags.WATER)) {
                    return true;
                }
            }

            return false;
        }
    }
    protected void tryScheduleDieTick(
            final BlockState state, final BlockGetter level, final ScheduledTickAccess ticks, final RandomSource random, final BlockPos pos
    ) {
        if (!scanForWater(state, level, pos)) {
            ticks.scheduleTick(pos, this, 60 + random.nextInt(40));
        }
    }
}
