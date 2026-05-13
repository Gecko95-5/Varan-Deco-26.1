package net.gecko.varandeco.block.elementblocks;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

public class BubbleSlabBlock extends SlabBlock {
    public BubbleSlabBlock(Properties settings) {
        super(settings);
    }
    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.isSteppingCarefully() && entity.isOnFire()) {
            if (entity.isAlwaysTicking()) {
                entity.playSound(SoundEvents.FIRE_EXTINGUISH, 1.0f, 1.0f);
            }
            entity.clearFire();
        }
        if (!entity.isSteppingCarefully() && entity.isUnderWater()) {
            entity.setAirSupply(300);
        }

        super.stepOn(world, pos, state, entity);
    }
}
