package net.gecko.varandeco.block.nature.flowers;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class PuffyDandelionBlock extends FlowerBlock implements BonemealableBlock {


    public PuffyDandelionBlock(Holder<MobEffect> stewEffect, float effectLengthInSeconds, Properties settings) {
        super(stewEffect, effectLengthInSeconds, settings);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {
        if (world.getBiome(pos).is(Biomes.TAIGA) && world.getBiome(pos).is(Biomes.OLD_GROWTH_PINE_TAIGA) &&
                world.getBiome(pos).is(Biomes.OLD_GROWTH_SPRUCE_TAIGA) &&
                    world.getBiome(pos).is(Biomes.WINDSWEPT_FOREST)) {
            world.setBlock(pos, DecoBlocks.TAIGA_DANDELION.defaultBlockState(), Block.UPDATE_ALL);
        } else {
            world.setBlock(pos, Blocks.DANDELION.defaultBlockState(), Block.UPDATE_ALL);
        }
    }
}
