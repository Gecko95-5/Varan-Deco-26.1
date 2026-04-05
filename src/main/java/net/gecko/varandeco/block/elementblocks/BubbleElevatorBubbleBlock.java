package net.gecko.varandeco.block.elementblocks;


import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.redstone.Orientation;
import org.jspecify.annotations.Nullable;

public class BubbleElevatorBubbleBlock extends Block {
    public BubbleElevatorBubbleBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block sourceBlock, @Nullable Orientation wireOrientation, boolean notify) {
        if (world.hasNeighborSignal(pos) || world.hasNeighborSignal(pos.above(1))) {
            world.playSound(null, pos, SoundEvents.PISTON_EXTEND, SoundSource.BLOCKS, 0.5F, world.getRandom().nextFloat() * 0.25F + 0.6F);
            world.setBlock(pos, DecoBlocks.BUBBLE_ELEVATOR_BLOCK_MAGMA.defaultBlockState(), Block.UPDATE_CLIENTS);
        }
    }
}
