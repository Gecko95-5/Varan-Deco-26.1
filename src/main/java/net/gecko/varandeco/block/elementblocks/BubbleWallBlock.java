package net.gecko.varandeco.block.elementblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.entity.Entity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BubbleWallBlock extends WallBlock {
    private static final Logger log = LoggerFactory.getLogger(BubbleWallBlock.class);

    public BubbleWallBlock(Settings settings) {
        super(settings);
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
