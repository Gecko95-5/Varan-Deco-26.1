package net.gecko.varandeco.block.elementblocks;


import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

public class MagmaBrickSlabBlock extends SlabBlock {
    public MagmaBrickSlabBlock(Properties properties) {
        super(properties);
    }
    @Override
    public void stepOn(final Level level, final BlockPos pos, final BlockState onState, final Entity entity) {
        if (!entity.isSteppingCarefully() && entity instanceof LivingEntity) {
            entity.hurt(level.damageSources().hotFloor(), 0.5F);
        }

        super.stepOn(level, pos, onState, entity);
    }
}
