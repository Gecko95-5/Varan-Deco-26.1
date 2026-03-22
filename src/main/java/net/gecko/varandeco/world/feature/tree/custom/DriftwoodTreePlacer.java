package net.gecko.varandeco.world.feature.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.gecko.varandeco.world.feature.tree.DecoTruckPlacerType;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class DriftwoodTreePlacer extends TrunkPlacer {
    public static final MapCodec<DriftwoodTreePlacer> CODEC = RecordCodecBuilder.mapCodec(
            instance -> fillTrunkPlacerFields(instance).apply(instance, DriftwoodTreePlacer::new));

    public DriftwoodTreePlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return DecoTruckPlacerType.DRIFTWOOD_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {

        setToDirt(world, replacer, random, startPos.down(), config);

        for (int i = 0; i < height; i++) {
            this.getAndSetState(world, replacer, random, startPos.up(i), config);

            if (i == 0){
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.up(i).offset(Direction.NORTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(i).offset(Direction.NORTH, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.up(i).offset(Direction.SOUTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(i).offset(Direction.SOUTH, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.up(i).offset(Direction.EAST, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(i).offset(Direction.EAST, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.up(i).offset(Direction.WEST, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(i).offset(Direction.WEST, x))));
                }
            }
            if (i == 0){
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.up(i).offset(Direction.NORTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(i).offset(Direction.NORTH, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.up(i).offset(Direction.SOUTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(i).offset(Direction.SOUTH, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.up(i).offset(Direction.EAST, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(i).offset(Direction.EAST, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.up(i).offset(Direction.WEST, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(i).offset(Direction.WEST, x))));
                }
            }
            if (i == 1){
                if(random.nextFloat() > 0.5f) {
                    for (int x = 1; x == 1; x++) {
                        replacer.accept(startPos.up(i).offset(Direction.NORTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.NORTH, x))));
                    }
                }
                if(random.nextFloat() > 0.5f) {
                    for (int x = 1; x == 1; x++) {
                        replacer.accept(startPos.up(i).offset(Direction.SOUTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.SOUTH, x))));
                    }
                }
                if(random.nextFloat() > 0.5f) {
                    for (int x = 1; x == 1; x++) {
                        replacer.accept(startPos.up(i).offset(Direction.EAST, x), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.EAST, x))));
                    }
                }
                if(random.nextFloat() > 0.5f) {
                    for (int x = 1; x == 1; x++) {
                        replacer.accept(startPos.up(i).offset(Direction.WEST, x), (BlockState) Function.identity().apply(config.trunkProvider
                                .get(random, startPos.up(i).offset(Direction.WEST, x))));
                    }
                }
            }
        }


        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(height),0,false));
    }
}
