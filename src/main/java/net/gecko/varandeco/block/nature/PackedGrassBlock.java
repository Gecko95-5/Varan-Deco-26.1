package net.gecko.varandeco.block.nature;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class PackedGrassBlock extends Block implements Fertilizable {
    public PackedGrassBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return world.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.getRegistryManager()
                .getOptional(RegistryKeys.PLACED_FEATURE)
                .flatMap(registry -> registry.getOptional(VegetationPlacedFeatures.GRASS_BONEMEAL))
                .ifPresent(reference -> reference.value().generate(world, world.getChunkManager().getChunkGenerator(), random, pos.up()));
    }
}
