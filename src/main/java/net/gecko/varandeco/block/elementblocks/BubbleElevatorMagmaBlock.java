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
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block sourceBlock, @Nullable Orientation wireOrientation, boolean notify) {
        if (world.hasNeighborSignal(pos)) {
            world.playSound(null, pos, SoundEvents.PISTON_EXTEND, SoundSource.BLOCKS, 0.5F, world.getRandom().nextFloat() * 0.25F + 0.6F);
            world.setBlock(pos, DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE.defaultBlockState(), Block.UPDATE_CLIENTS);
        }
    }
}
