package net.gecko.varandeco.block.stonemadeblocks;

import com.mojang.serialization.MapCodec;
import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.gecko.varandeco.block.entity.stone.DeepslateBlastFurnaceBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class DeepslateBlastFurnaceBlock extends AbstractFurnaceBlock {
	public static final MapCodec<DeepslateBlastFurnaceBlock> CODEC = simpleCodec(DeepslateBlastFurnaceBlock::new);

	@Override
	public MapCodec<DeepslateBlastFurnaceBlock> codec() {
		return CODEC;
	}
	public DeepslateBlastFurnaceBlock(Properties settings) {
		super(settings);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DeepslateBlastFurnaceBlockEntity(pos, state);
	}

	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level world, BlockState state, BlockEntityType<T> type) {
		return createFurnaceTicker(world, type, DecoBlockEntities.DEEPSLATE_BLAST_FURNACE_BE);
	}

	@Override
	protected void openContainer(Level world, BlockPos pos, Player player) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity instanceof DeepslateBlastFurnaceBlockEntity) {
			player.openMenu((MenuProvider)blockEntity);
			player.awardStat(Stats.INTERACT_WITH_BLAST_FURNACE);
		}
	}

	@Override
	public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
		if ((Boolean)state.getValue(LIT)) {
			double d = pos.getX() + 0.5;
			double e = pos.getY();
			double f = pos.getZ() + 0.5;
			if (random.nextDouble() < 0.1) {
				world.playLocalSound(d, e, f, SoundEvents.BLASTFURNACE_FIRE_CRACKLE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
			}

			Direction direction = state.getValue(FACING);
			Direction.Axis axis = direction.getAxis();
			double g = 0.52;
			double h = random.nextDouble() * 0.6 - 0.3;
			double i = axis == Direction.Axis.X ? direction.getStepX() * 0.52 : h;
			double j = random.nextDouble() * 9.0 / 16.0;
			double k = axis == Direction.Axis.Z ? direction.getStepZ() * 0.52 : h;
			world.addParticle(ParticleTypes.SMOKE, d + i, e + j, f + k, 0.0, 0.0, 0.0);
		}
	}
}
