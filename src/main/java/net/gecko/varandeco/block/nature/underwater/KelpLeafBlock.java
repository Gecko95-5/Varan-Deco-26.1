package net.gecko.varandeco.block.nature.underwater;

import com.mojang.serialization.MapCodec;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.Nullable;

public class KelpLeafBlock extends AbstractKelpLeafBlock {
    public static final MapCodec<KelpLeafBlock> CODEC = simpleCodec(KelpLeafBlock::new);
    public KelpLeafBlock(Properties settings) {
        super(settings);
    }
    @Override
    public MapCodec<KelpLeafBlock> codec() {
        return CODEC;
    }

    @Override
    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!state.getValue(WATERLOGGED)) {
            if (!this.isInWater(world, pos)) {
             world.setBlock(pos, DecoBlocks.DEAD_KELP_LEAVES.defaultBlockState(), Block.UPDATE_CLIENTS);
            }
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
        if (state.getValue(WATERLOGGED)) {
            tickView.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        else if (!this.isInWater(world, pos)) {
            tickView.scheduleTick(pos, this, 60 + random.nextInt(40));
        }

        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }
    public boolean isInWater(BlockGetter world, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            FluidState fluidState = world.getFluidState(pos.relative(direction));
            if (fluidState.is(FluidTags.WATER)) {
                return true;
            }
        }

        return false;
    }
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        if (!this.isInWater(ctx.getLevel(), ctx.getClickedPos())) {
            ctx.getLevel().scheduleTick(ctx.getClickedPos(), this, 60 + ctx.getLevel().getRandom().nextInt(40));
    }

        FluidState fluidState = ctx.getLevel().getFluidState(ctx.getClickedPos());
        return super.getStateForPlacement(ctx).setValue(WATERLOGGED, fluidState.is(Fluids.WATER));
    }
}
