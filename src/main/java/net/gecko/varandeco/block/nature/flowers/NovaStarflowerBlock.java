package net.gecko.varandeco.block.nature.flowers;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class NovaStarflowerBlock extends TallFlowerBlock {
    public NovaStarflowerBlock(Properties settings) {
        super(settings);
    }
    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
        return super.mayPlaceOn(floor, world, pos) || floor.is(Blocks.END_STONE) || floor.is(DecoBlocks.VOID_STONE);
    }
}
