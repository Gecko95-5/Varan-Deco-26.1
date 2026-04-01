package net.gecko.varandeco.block.nature.underwater;

import com.mojang.serialization.MapCodec;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;

public class DriftwoodBlock extends RotatedPillarBlock {
    public static final MapCodec<DriftwoodBlock> CODEC = simpleCodec(DriftwoodBlock::new);
    public DriftwoodBlock(Properties settings) {
        super(settings);
    }
    @Override
    public MapCodec<DriftwoodBlock> codec() {
        return CODEC;
    }
    @Override
    protected void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean notify) {
        if ((world.environmentAttributes().getValue(EnvironmentAttributes.WATER_EVAPORATES, pos))) {
            world.setBlock(pos, DecoBlocks.DRIED_DRIFTWOOD.defaultBlockState().setValue(DriftwoodBlock.AXIS, state.getValue(DriftwoodBlock.AXIS)), Block.UPDATE_ALL);
            world.levelEvent(LevelEvent.PARTICLES_WATER_EVAPORATING, pos, 0);
            world.playSound(null, pos, SoundEvents.WET_SPONGE_DRIES, SoundSource.BLOCKS, 1.0F, (1.0F + world.getRandom().nextFloat() * 0.2F) * 0.7F);
        }
    }
    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        Direction direction = Direction.getRandom(random);
        if (direction != Direction.UP) {
            BlockPos blockPos = pos.relative(direction);
            BlockState blockState = world.getBlockState(blockPos);
            if (!state.canOcclude() || !blockState.isFaceSturdy(world, blockPos, direction.getOpposite())) {
                double d = pos.getX();
                double e = pos.getY();
                double f = pos.getZ();
                if (direction == Direction.DOWN) {
                    e -= 0.05;
                    d += random.nextDouble();
                    f += random.nextDouble();
                } else {
                    e += random.nextDouble() * 0.8;
                    if (direction.getAxis() == Direction.Axis.X) {
                        f += random.nextDouble();
                        if (direction == Direction.EAST) {
                            d++;
                        } else {
                            d += 0.05;
                        }
                    } else {
                        d += random.nextDouble();
                        if (direction == Direction.SOUTH) {
                            f++;
                        } else {
                            f += 0.05;
                        }
                    }
                }

                world.addParticle(ParticleTypes.DRIPPING_WATER, d, e, f, 0.0, 0.0, 0.0);
            }
        }
    }
}
