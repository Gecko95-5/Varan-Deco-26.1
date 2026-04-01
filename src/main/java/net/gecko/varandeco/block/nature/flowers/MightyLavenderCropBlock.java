package net.gecko.varandeco.block.nature.flowers;

import net.gecko.varandeco.item.DecoItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MightyLavenderCropBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_4;
    private static final VoxelShape[] SHAPES = new VoxelShape[]{
            Block.box(6.0, 0.0, 6.0, 11.0, 9.0, 11.0),
            Block.box(6.0, 0.0, 6.0, 11.0, 13.0, 11.0),
            Block.box(5.0, 0.0, 5.0, 12.0, 16.0, 12.0),
            Block.box(5.0, 0.0, 5.0, 12.0, 16.0, 12.0),
            Block.box(5.0, 0.0, 5.0, 12.0, 16.0, 12.0)
    };

    public MightyLavenderCropBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPES[this.getAge(state)];
    }

    @Override
    protected IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 4;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return DecoItems.MIGHTY_LAVENDER_FLOWER;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (random.nextInt(3) != 0) {
            super.randomTick(state, world, pos, random);
        }
    }
}
