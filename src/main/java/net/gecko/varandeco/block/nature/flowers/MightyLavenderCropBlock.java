package net.gecko.varandeco.block.nature.flowers;

import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class MightyLavenderCropBlock extends CropBlock {
    public static final IntProperty AGE = Properties.AGE_4;
    private static final VoxelShape[] SHAPES = new VoxelShape[]{
            Block.createCuboidShape(6.0, 0.0, 6.0, 11.0, 9.0, 11.0),
            Block.createCuboidShape(6.0, 0.0, 6.0, 11.0, 13.0, 11.0),
            Block.createCuboidShape(5.0, 0.0, 5.0, 12.0, 16.0, 12.0),
            Block.createCuboidShape(5.0, 0.0, 5.0, 12.0, 16.0, 12.0),
            Block.createCuboidShape(5.0, 0.0, 5.0, 12.0, 16.0, 12.0)
    };

    public MightyLavenderCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES[this.getAge(state)];
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 4;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return DecoItems.MIGHTY_LAVENDER_FLOWER;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(3) != 0) {
            super.randomTick(state, world, pos, random);
        }
    }
}
