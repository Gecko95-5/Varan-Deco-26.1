package net.gecko.varandeco.block.nature;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class IronCapBlock extends SaplingBlock {
    protected static final VoxelShape SHAPE = Block.box(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);

    public IronCapBlock(TreeGrower generator, Properties settings) {
        super(generator, settings);
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
        return floor.is(BlockTags.BASE_STONE_OVERWORLD) || floor.is(Blocks.COBBLESTONE) ||
                floor.is(Blocks.COBBLED_DEEPSLATE) || floor.is(Blocks.SCULK) || floor.is(DecoBlocks.SPORE_IRON_ORE) || super.mayPlaceOn(floor, world, pos);
    }
}
