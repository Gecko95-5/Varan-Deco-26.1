package net.gecko.varandeco.block.nature;

import com.mojang.serialization.MapCodec;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.VegetationBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WarpedWartBlock extends VegetationBlock {
	public static final MapCodec<WarpedWartBlock> CODEC = simpleCodec(WarpedWartBlock::new);
	public static final int field_31199 = 3;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
	private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]{
		Block.box(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
		Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
		Block.box(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
		Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
	};
	@Override
	public MapCodec<WarpedWartBlock> codec() {
		return CODEC;
	}

	public WarpedWartBlock(Properties settings) {
		super(settings);
		this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return AGE_TO_SHAPE[state.getValue(AGE)];
	}

	@Override
	protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
		return floor.is(Blocks.SOUL_SAND);
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return (Integer)state.getValue(AGE) < 3;
	}

	@Override
	public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
		int i = (Integer)state.getValue(AGE);
		if (i < 3 && random.nextInt(10) == 0) {
			state = state.setValue(AGE, i + 1);
			world.setBlock(pos, state, Block.UPDATE_CLIENTS);
		}
	}

	@Override
	protected ItemStack getCloneItemStack(LevelReader world, BlockPos pos, BlockState state, boolean includeData) {
		return new ItemStack(DecoItems.WARPED_WART);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}
}
