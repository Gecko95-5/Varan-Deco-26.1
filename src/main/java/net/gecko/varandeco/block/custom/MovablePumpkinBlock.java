package net.gecko.varandeco.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;

public class MovablePumpkinBlock extends HorizontalFacingBlock {
    public static final MapCodec<MovablePumpkinBlock> CODEC = createCodec(MovablePumpkinBlock::new);
    public MovablePumpkinBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends MovablePumpkinBlock> getCodec() {
        return CODEC;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
