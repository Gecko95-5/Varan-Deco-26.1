package net.gecko.varandeco.block.nature.underwater;

import com.mojang.serialization.MapCodec;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Nullable;

public class KelpLeafBlock extends AbstractKelpLeafBlock {
    public static final MapCodec<KelpLeafBlock> CODEC = createCodec(KelpLeafBlock::new);
    public KelpLeafBlock(Settings settings) {
        super(settings);
    }
    @Override
    public MapCodec<KelpLeafBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.get(WATERLOGGED)) {
            if (!this.isInWater(world, pos)) {
             world.setBlockState(pos, DecoBlocks.DEAD_KELP_LEAVES.getDefaultState(), Block.NOTIFY_LISTENERS);
            }
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
        if (state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        else if (!this.isInWater(world, pos)) {
            tickView.scheduleBlockTick(pos, this, 60 + random.nextInt(40));
        }

        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }
    public boolean isInWater(BlockView world, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            FluidState fluidState = world.getFluidState(pos.offset(direction));
            if (fluidState.isIn(FluidTags.WATER)) {
                return true;
            }
        }

        return false;
    }
    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        if (!this.isInWater(ctx.getWorld(), ctx.getBlockPos())) {
            ctx.getWorld().scheduleBlockTick(ctx.getBlockPos(), this, 60 + ctx.getWorld().getRandom().nextInt(40));
    }

        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return super.getPlacementState(ctx).with(WATERLOGGED, fluidState.isOf(Fluids.WATER));
    }
}
