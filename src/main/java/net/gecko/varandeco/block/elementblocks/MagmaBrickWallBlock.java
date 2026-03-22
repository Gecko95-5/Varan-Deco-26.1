package net.gecko.varandeco.block.elementblocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WallBlock;

public class MagmaBrickWallBlock extends WallBlock {
    public MagmaBrickWallBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(final Level level, final BlockPos pos, final net.minecraft.world.level.block.state.BlockState onState, final net.minecraft.world.entity.Entity entity) {
        if (!entity.isSteppingCarefully() && entity instanceof net.minecraft.world.entity.LivingEntity) {
            entity.hurt(level.damageSources().hotFloor(), 0.5F);
        }

        super.stepOn(level, pos, onState, entity);
    }
}
