package net.gecko.varandeco.world.feature.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.gecko.varandeco.world.feature.tree.DecoTruckPlacerType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class DriftwoodTreePlacer extends TrunkPlacer {
    public static final MapCodec<DriftwoodTreePlacer> CODEC = RecordCodecBuilder.mapCodec(
            instance -> trunkPlacerParts(instance).apply(instance, DriftwoodTreePlacer::new));

    public DriftwoodTreePlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return DecoTruckPlacerType.DRIFTWOOD_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, int height, BlockPos startPos, TreeConfiguration config) {

        setDirtAt(world, replacer, random, startPos.below(), config);

        for (int i = 0; i < height; i++) {
            this.placeLog(world, replacer, random, startPos.above(i), config);

            if (i == 0){
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.above(i).relative(Direction.NORTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .getState(random, startPos.above(i).relative(Direction.NORTH, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.above(i).relative(Direction.SOUTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .getState(random, startPos.above(i).relative(Direction.SOUTH, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.above(i).relative(Direction.EAST, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .getState(random, startPos.above(i).relative(Direction.EAST, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.above(i).relative(Direction.WEST, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .getState(random, startPos.above(i).relative(Direction.WEST, x))));
                }
            }
            if (i == 0){
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.above(i).relative(Direction.NORTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .getState(random, startPos.above(i).relative(Direction.NORTH, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.above(i).relative(Direction.SOUTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .getState(random, startPos.above(i).relative(Direction.SOUTH, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.above(i).relative(Direction.EAST, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .getState(random, startPos.above(i).relative(Direction.EAST, x))));
                }
                for (int x = 1; x == 1; x++) {
                    replacer.accept(startPos.above(i).relative(Direction.WEST, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .getState(random, startPos.above(i).relative(Direction.WEST, x))));
                }
            }
            if (i == 1){
                if(random.nextFloat() > 0.5f) {
                    for (int x = 1; x == 1; x++) {
                        replacer.accept(startPos.above(i).relative(Direction.NORTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                                .getState(random, startPos.above(i).relative(Direction.NORTH, x))));
                    }
                }
                if(random.nextFloat() > 0.5f) {
                    for (int x = 1; x == 1; x++) {
                        replacer.accept(startPos.above(i).relative(Direction.SOUTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                                .getState(random, startPos.above(i).relative(Direction.SOUTH, x))));
                    }
                }
                if(random.nextFloat() > 0.5f) {
                    for (int x = 1; x == 1; x++) {
                        replacer.accept(startPos.above(i).relative(Direction.EAST, x), (BlockState) Function.identity().apply(config.trunkProvider
                                .getState(random, startPos.above(i).relative(Direction.EAST, x))));
                    }
                }
                if(random.nextFloat() > 0.5f) {
                    for (int x = 1; x == 1; x++) {
                        replacer.accept(startPos.above(i).relative(Direction.WEST, x), (BlockState) Function.identity().apply(config.trunkProvider
                                .getState(random, startPos.above(i).relative(Direction.WEST, x))));
                    }
                }
            }
        }


        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(startPos.above(height),0,false));
    }
}
