package net.gecko.varandeco.block.nature.ice;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class FragileIceBlock extends Block {
    public FragileIceBlock(Properties settings) {
        super(settings);
    }

    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        super.stepOn(world, pos, state, entity);
        if (!entity.isSteppingCarefully()) {
            if (!entity.is(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS))
                world.destroyBlock(pos, true);
        }
    }

    @Override
    public void fallOn(Level world, BlockState state, BlockPos pos, Entity entity, double fallDistance) {
        if (!entity.isSteppingCarefully()) {
            if (!entity.is(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS))
                world.destroyBlock(pos, true);
            entity.causeFallDamage(fallDistance, 1.5F, world.damageSources().fall());
        }
    }
}
