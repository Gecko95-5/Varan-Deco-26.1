package net.gecko.varandeco.block.elementblocks;


import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.redstone.Orientation;
import org.jspecify.annotations.Nullable;

public class BubbleElevatorMagmaBlock extends Block {


    public BubbleElevatorMagmaBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void neighborChanged(
            final BlockState state, final Level level, final BlockPos pos, final Block block, @Nullable final Orientation orientation, final boolean movedByPiston
    ) {
        if (state.isRedstoneConductor(level, pos)) {
            level.playSound(null, pos, SoundEvents.PISTON_EXTEND, SoundSource.BLOCKS, 0.5F, level.getRandom().nextFloat() * 0.25F + 0.6F);
            level.updatePOIOnBlockStateChange(pos, DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE.defaultBlockState(), DecoBlocks.BUBBLE_ELEVATOR_BLOCK_MAGMA.defaultBlockState());
        }
    }
}
