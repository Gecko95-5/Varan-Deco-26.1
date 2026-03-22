package net.gecko.varandeco.block.elementblocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class MagmaStairBlock extends StairBlock {
    public MagmaStairBlock(BlockState baseState, Properties properties) {
        super(baseState, properties);
    }
    @Override
    public void stepOn(final Level level, final BlockPos pos, final net.minecraft.world.level.block.state.BlockState onState, final Entity entity) {
        if (!entity.isSteppingCarefully() && entity instanceof LivingEntity) {
            entity.hurt(level.damageSources().hotFloor(), 1.0F);
        }

        super.stepOn(level, pos, onState, entity);
    }
}
