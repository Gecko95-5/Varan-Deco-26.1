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
    protected void neighborChanged(
            final BlockState state, final Level level, final BlockPos pos, final Block block, @Nullable final Orientation orientation, final boolean movedByPiston
    ) {
        if (state.isRedstoneConductor(level, pos)) {
            level.playSound(null, pos, SoundEvents.PISTON_EXTEND, SoundSource.BLOCKS, 0.5F, level.getRandom().nextFloat() * 0.25F + 0.6F);
            level.updatePOIOnBlockStateChange(pos, DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE.defaultBlockState(), DecoBlocks.BUBBLE_ELEVATOR_BLOCK_MAGMA.defaultBlockState());
        }
    }
}
