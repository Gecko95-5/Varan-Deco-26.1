package net.gecko.varandeco.block.elementblocks;


import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BubbleBlock extends Block {


    public BubbleBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(final Level level, final BlockPos pos, final BlockState onState, final Entity entity) {
        if (!entity.isPassenger() && entity.isOnFire()) {
            if (entity.hasExactlyOnePlayerPassenger()) {
                entity.playSound(SoundEvents.FIRE_EXTINGUISH, 1.0f, 1.0f);
            }
            entity.extinguishFire();
        }
        if (!entity.isPassenger() && entity.isUnderWater()) {
            entity.setAirSupply(300);
        }

        super.stepOn(level, pos, onState, entity);
    }
}
