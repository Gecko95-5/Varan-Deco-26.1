package net.gecko.varandeco.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Fallable;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FallingStairBlock extends StairBlock implements Fallable {
    private final int color;
    public FallingStairBlock(int color, BlockState baseBlockState, Properties settings) {
        super(baseBlockState, settings);
        this.color = color;
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean notify) {
        world.scheduleTick(pos, this, this.getFallDelay());
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
        tickView.scheduleTick(pos, this, this.getFallDelay());
        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (canFallThrough(world.getBlockState(pos.below())) && pos.getY() >= world.getMinY()) {
            FallingBlockEntity fallingBlockEntity = FallingBlockEntity.fall(world, pos, state);
            this.configureFallingBlockEntity(fallingBlockEntity);
        }
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
    }

    /**
     * Gets the amount of time in ticks this block will wait before attempting to start falling.
     */
    protected int getFallDelay() {
        return 2;
    }

    public static boolean canFallThrough(BlockState state) {
        return state.isAir() || state.is(BlockTags.FIRE) || state.liquid() || state.canBeReplaced();
    }

    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        if (random.nextInt(16) == 0) {
            BlockPos blockPos = pos.below();
            if (canFallThrough(world.getBlockState(blockPos))) {
                double d = pos.getX() + random.nextDouble();
                double e = pos.getY() - 0.05;
                double f = pos.getZ() + random.nextDouble();
                world.addParticle(new BlockParticleOption(ParticleTypes.FALLING_DUST, state), d, e, f, 0.0, 0.0, 0.0);
            }
        }
    }

    public int getColor(BlockState state, BlockGetter world, BlockPos pos) {
        return this.color;
    }
}
