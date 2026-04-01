package net.gecko.varandeco.block.nature;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;

public class PackedGrassBlock extends Block implements BonemealableBlock {
    public PackedGrassBlock(Properties settings) {
        super(settings);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos, BlockState state) {
        return world.getBlockState(pos.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {
        world.registryAccess()
                .lookup(Registries.PLACED_FEATURE)
                .flatMap(registry -> registry.get(VegetationPlacements.GRASS_BONEMEAL))
                .ifPresent(reference -> reference.value().placeWithBiomeCheck(world, world.getChunkSource().getGenerator(), random, pos.above()));
    }
}
