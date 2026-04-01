package net.gecko.varandeco.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

public class MovablePumpkinBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<MovablePumpkinBlock> CODEC = simpleCodec(MovablePumpkinBlock::new);
    public MovablePumpkinBlock(Properties settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends MovablePumpkinBlock> codec() {
        return CODEC;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
