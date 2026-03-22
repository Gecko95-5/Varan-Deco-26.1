package net.gecko.varandeco.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StairBlock;

public class HayStairsBlock extends StairBlock {

    public HayStairsBlock(net.minecraft.world.level.block.state.BlockState baseState, Properties properties) {
        super(baseState, properties);
    }

    @Override
    public void fallOn(final Level level, final net.minecraft.world.level.block.state.BlockState state, final BlockPos pos, final net.minecraft.world.entity.Entity entity, final double fallDistance) {
        entity.causeFallDamage(fallDistance, 0.2F, level.damageSources().fall());
    }
}
