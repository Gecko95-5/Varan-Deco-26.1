package net.gecko.varandeco.block.nature.underwater.corals;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

public class TubeCoralStairBlock extends StairsBlock {
    public TubeCoralStairBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    protected void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        this.checkLivingConditions(state, world, world, world.random, pos);
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!isInWater(state, world, pos)) {
            world.setBlockState(pos, DecoBlocks.DEAD_TUBE_CORAL_STAIRS.getDefaultState().with(WATERLOGGED, false).with(FACING, state.get(FACING)), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state,
            WorldView world,
            ScheduledTickView tickView,
            BlockPos pos,
            Direction direction,
            BlockPos neighborPos,
            BlockState neighborState,
            Random random
    ) {
        if (direction == Direction.DOWN && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        } else {
            this.checkLivingConditions(state, world, tickView, random, pos);
            if (state.get(WATERLOGGED)) {
                tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
            }

            return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
        }
    }
    protected static boolean isInWater(BlockState state, BlockView world, BlockPos pos) {
        if (state.get(WATERLOGGED)) {
            return true;
        } else {
            for (Direction direction : Direction.values()) {
                if (world.getFluidState(pos.offset(direction)).isIn(FluidTags.WATER)) {
                    return true;
                }
            }

            return false;
        }
    }
    protected void checkLivingConditions(BlockState state, BlockView world, ScheduledTickView tickView, Random random, BlockPos pos) {
        if (!isInWater(state, world, pos)) {
            tickView.scheduleBlockTick(pos, this, 60 + random.nextInt(40));
        }
    }
}
