package net.gecko.varandeco.block.elementblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagmaBrickStairBlock extends StairsBlock {
    public MagmaBrickStairBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects() && entity instanceof LivingEntity) {
            entity.serverDamage(world.getDamageSources().hotFloor(), 0.5F);
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
