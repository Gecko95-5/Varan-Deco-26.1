package net.gecko.varandeco.block.nature;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class IronCapBlock extends SaplingBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);

    public IronCapBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.BASE_STONE_OVERWORLD) || floor.isOf(Blocks.COBBLESTONE) ||
                floor.isOf(Blocks.COBBLED_DEEPSLATE) || floor.isOf(Blocks.SCULK) || floor.isOf(DecoBlocks.SPORE_IRON_ORE) || super.canPlantOnTop(floor, world, pos);
    }
}
