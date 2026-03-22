package net.gecko.varandeco.block.elementblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagmaWallBlock extends WallBlock {
    public MagmaWallBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects() && entity instanceof LivingEntity) {
            entity.serverDamage(world.getDamageSources().hotFloor(), 1.0F);
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
