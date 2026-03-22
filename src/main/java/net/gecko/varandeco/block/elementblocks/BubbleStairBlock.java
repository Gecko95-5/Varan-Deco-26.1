package net.gecko.varandeco.block.elementblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.Entity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BubbleStairBlock extends StairsBlock {
    public BubbleStairBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects() && entity.isOnFire()) {
            if (entity.isPlayer()) {
                entity.playSound(SoundEvents.BLOCK_FIRE_EXTINGUISH, 1.0f, 1.0f);
            }
            entity.extinguish();
        }
        if (!entity.bypassesSteppingEffects() && entity.isSubmergedInWater()) {
            entity.setAir(300);
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
