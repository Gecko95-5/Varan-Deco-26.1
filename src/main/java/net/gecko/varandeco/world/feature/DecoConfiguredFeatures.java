package net.gecko.varandeco.world.feature;

import com.google.common.collect.ImmutableList;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.util.DecoFeatures;
import net.gecko.varandeco.world.feature.tree.custom.DriftwoodTreePlacer;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.InclusiveRange;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.*;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.AttachedToLogsDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.List;
import java.util.OptionalInt;

public class DecoConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_FLOWER_FOREST_KEY = registerKey("deco_flower_forest");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_TULIPS_FOREST_KEY = registerKey("deco_tulips_forest");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_MEADOW_KEY = registerKey("deco_meadow");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_MEADOW_WILDFLOWER_KEY = registerKey("deco_meadow_wildflower");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_TULIPS_MEADOW_KEY = registerKey("deco_tulips_meadow");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_PLAINS_KEY = registerKey("deco_plains_flowers");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_SAVANNA_KEY = registerKey("deco_savanna_flowers");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_SWAMP_KEY = registerKey("deco_swamp_flower");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_RIVER_KEY = registerKey("deco_river_flowers");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_ROSE_KEY = registerKey("deco_rose_flower");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_ENDER_KEY = registerKey("deco_ender_flowers");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_RED_SUNFLOWER_KEY = registerKey("deco_red_sunflower");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_NOVA_STARFLOWER_KEY = registerKey("deco_nova_starflower");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_BIRCH_KEY = registerKey("deco_birch");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_BIRCH_WILDFLOWER_KEY = registerKey("deco_birch_wildflower");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_JUNGLE_KEY = registerKey("deco_jungle");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_MESA_KEY = registerKey("deco_mesa");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_MESA_WILDFLOWER_KEY = registerKey("deco_mesa_wildflower");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_WOODEN_TREE_KEY = registerKey("deco_wooden_tree");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_FANCY_WOODEN_TREE_KEY = registerKey("deco_fancy_wooden_tree");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_MEGA_WOODEN_TREE_KEY = registerKey("deco_mega_wooden_tree");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_DRIFTWOOD_TREE_KEY = registerKey("deco_driftwood_tree");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_FALLEN_DRIED_DRIFTWOOD_KEY = registerKey("deco_fallen_dried_driftwood");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_DRIFTWOOD_SPROUT = registerKey("deco_driftwood_sprout");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_BUBBLE_ORE = registerKey("deco_bubble_ore");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_VOID_PATCH = registerKey("deco_void_patch");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_IRON_CAP_MUSHROOM = registerKey("deco_iron_cap_mushroom");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_DESERT = registerKey("deco_desert");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_PALE = registerKey("deco_pale");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_ROOFED = registerKey("deco_roofed");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_MEGA_TULIP = registerKey("deco_mega_tulip");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_PALE_MEGA_TULIP = registerKey("deco_pale_mega_tulip");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_TAIGA = registerKey("deco_taiga_flowers");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_WINDSWEPT_FOREST = registerKey("deco_windswept_forest_flowers");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_WINDSWEPT = registerKey("deco_windswept_flowers");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_SILVER_ROSE = registerKey("deco_silver_rose");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_TAIGA_WILDFLOWER_KEY = registerKey("deco_taiga_wildflower");

    public static final ResourceKey<ConfiguredFeature<?,?>> DECO_JUNGLE_WILDFLOWER_KEY = registerKey("deco_jungle_wildflower");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacebles = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);


        List<OreConfiguration.TargetBlockState> overworldBubbleOre =
                List.of(OreConfiguration.target(stoneReplacebles, DecoBlocks.BUBBLE_BLOCK.defaultBlockState()));

        register(context, DECO_FLOWER_FOREST_KEY, Feature.FLOWER,
                FeatureUtils.simpleRandomPatchConfiguration(64, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new NoiseProvider(2345L,
                                new NormalNoise.NoiseParameters(0, 1.0),
                                0.020833334F, List.of(DecoBlocks.BARBERTON_DAISY.defaultBlockState(),
                                DecoBlocks.GERBERA_DAISY.defaultBlockState(), DecoBlocks.WHITE_ORCHID.defaultBlockState(),
                                DecoBlocks.PINK_ORCHID.defaultBlockState(), DecoBlocks.YELLOW_ORCHID.defaultBlockState(),
                                Blocks.BLUE_ORCHID.defaultBlockState(), DecoBlocks.SALMON_POPPY.defaultBlockState(),
                                DecoBlocks.ROSE.defaultBlockState(), DecoBlocks.PAEONIA.defaultBlockState()))))));

        register(context, DECO_TULIPS_FOREST_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                        (WeightedList.<BlockState>builder().add(DecoBlocks.YELLOW_TULIP.defaultBlockState(),1)
                                .add(DecoBlocks.PURPLE_TULIP.defaultBlockState(),2)
                                .add(DecoBlocks.BLUE_TULIP.defaultBlockState(),2)
                                .add(DecoBlocks.MAGENTA_TULIP.defaultBlockState(),1).build()),32));

        register(context, DECO_MEADOW_KEY, Feature.FLOWER,
                        FeatureUtils.simpleRandomPatchConfiguration(96, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(new DualNoiseProvider(new InclusiveRange<>(1, 3),
                                        new NormalNoise.NoiseParameters(-10, 1.0),
                                        1.0F, 2345L, new NormalNoise.NoiseParameters(-3, 1.0),
                                        1.0F, List.of(DecoBlocks.BARBERTON_DAISY.defaultBlockState(),
                                        DecoBlocks.ALPINE_POPPY.defaultBlockState(), DecoBlocks.ROSE.defaultBlockState()))))));

        register(context, DECO_MEADOW_WILDFLOWER_KEY, Feature.FLOWER, new RandomPatchConfiguration(
                32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration
                (new WeightedStateProvider(flowerbed(DecoBlocks.ROUGE_WILDFLOWERS))))));

        register(context, DECO_BIRCH_WILDFLOWER_KEY, Feature.FLOWER, new RandomPatchConfiguration(
                16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration
                (new WeightedStateProvider(flowerbed(DecoBlocks.SWEET_WILDFLOWERS))))));

        register(context, DECO_TAIGA_WILDFLOWER_KEY, Feature.FLOWER, new RandomPatchConfiguration(
                16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration
                (new WeightedStateProvider(flowerbed(DecoBlocks.MONOCHROME_WILDFLOWERS))))));

        register(context, DECO_JUNGLE_WILDFLOWER_KEY, Feature.FLOWER, new RandomPatchConfiguration(
                16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration
                (new WeightedStateProvider(flowerbed(DecoBlocks.SEA_WILDFLOWERS))))));

        register(context, DECO_TULIPS_MEADOW_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                        (WeightedList.<BlockState>builder().add(DecoBlocks.BLACK_TULIP.defaultBlockState(),1)
                                .add(DecoBlocks.GREEN_TULIP.defaultBlockState(),5)
                                        .add(DecoBlocks.CYAN_TULIP.defaultBlockState(),5).build()),48));

        register(context, DECO_PLAINS_KEY, Feature.FLOWER,
                FeatureUtils.simpleRandomPatchConfiguration(32, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new DualNoiseProvider(new InclusiveRange<>(1, 3),
                                new NormalNoise.NoiseParameters(-20, 2.0),
                                0.5F, 2345L, new NormalNoise.NoiseParameters(-3, 1.0),
                                0.005F, List.of(DecoBlocks.BARBERTON_DAISY.defaultBlockState(), DecoBlocks.GERBERA_DAISY.defaultBlockState()))))));


        FeatureUtils.register(context, DECO_SAVANNA_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                        (WeightedList.<BlockState>builder().add(DecoBlocks.GERBERA_DAISY.defaultBlockState(),2)
                                .add(DecoBlocks.MICHAELMAS_DAISY.defaultBlockState(),2)
                                .add(DecoBlocks.BLUE_EYED_DAISY.defaultBlockState(),1)
                                .add(DecoBlocks.CALIFORNIA_POPPY.defaultBlockState(),1).build()),24));

        FeatureUtils.register(context, DECO_JUNGLE_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                        (WeightedList.<BlockState>builder().add(DecoBlocks.BLUE_HIBISCUS.defaultBlockState(),2)
                                .add(DecoBlocks.BROMELIAD.defaultBlockState(),2)
                                .add(DecoBlocks.SALMON_POPPY.defaultBlockState(),1)
                                .add(DecoBlocks.MICHAELMAS_DAISY.defaultBlockState(),1).build()),96));

        FeatureUtils.register(context, DECO_MESA_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                        (WeightedList.<BlockState>builder().add(DecoBlocks.ROSE.defaultBlockState(),5)
                                .add(DecoBlocks.BARBERTON_DAISY.defaultBlockState(),3)
                                .add(DecoBlocks.CALIFORNIA_POPPY.defaultBlockState(),1).build()),16));

        register(context, DECO_MESA_WILDFLOWER_KEY, Feature.FLOWER, new RandomPatchConfiguration(
                        16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration
                (new WeightedStateProvider(flowerbed(DecoBlocks.GECKO_WILDFLOWERS))))));

        FeatureUtils.register(context, DECO_TAIGA,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                            (WeightedList.<BlockState>builder().add(DecoBlocks.TAIGA_DANDELION.defaultBlockState(),2)
                                    .add(DecoBlocks.PUFFY_DANDELION.defaultBlockState(),2)
                                    .add(DecoBlocks.FERN_LAVENDER.defaultBlockState(),1)
                                    .add(DecoBlocks.CARAMEL_BUTTERCUP.defaultBlockState(),1).build()),24));

        FeatureUtils.register(context, DECO_WINDSWEPT_FOREST,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                            (WeightedList.<BlockState>builder().add(DecoBlocks.TAIGA_DANDELION.defaultBlockState(),2)
                                    .add(DecoBlocks.PUFFY_DANDELION.defaultBlockState(),2)
                                    .add(DecoBlocks.CARAMEL_BUTTERCUP.defaultBlockState(),2)
                                    .add(DecoBlocks.ALPINE_POPPY.defaultBlockState(),1)
                                    .add(DecoBlocks.ALPINE_SPEEDWELL.defaultBlockState(),1).build()),24));

        FeatureUtils.register(context, DECO_WINDSWEPT,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                            (WeightedList.<BlockState>builder().add(DecoBlocks.ALPINE_POPPY.defaultBlockState(),2)
                                    .add(DecoBlocks.ALPINE_SPEEDWELL.defaultBlockState(),1).build()),16));

        FeatureUtils.register(context, DECO_SILVER_ROSE, Feature.FLOWER, new RandomPatchConfiguration(16, 6, 2,
                    PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(DecoBlocks.SILVER_ROSE)))));

        register(context, DECO_SWAMP_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2,
                        PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(DecoBlocks.YELLOW_ORCHID)))));

        register(context, DECO_DESERT, Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                            (WeightedList.<BlockState>builder().add(DecoBlocks.POPPED_BLUET.defaultBlockState(),1)
                                    .add(DecoBlocks.DEAD_EYE_DAISY.defaultBlockState(),1).build()),16));

        register(context, DECO_PALE, Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                            (WeightedList.<BlockState>builder().add(DecoBlocks.HAZZY_BLUET.defaultBlockState(),5)
                                    .add(DecoBlocks.DRILL_LAVENDER.defaultBlockState(),1).build()),64));

        FeatureUtils.register(context, DECO_RIVER_KEY, Feature.FLOWER,
                        DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                                        (WeightedList.<BlockState>builder().add(DecoBlocks.PINK_ORCHID.defaultBlockState(),3)
                                        .add(DecoBlocks.SALMON_POPPY.defaultBlockState(),2)
                                .add(DecoBlocks.LAVENDER.defaultBlockState(),1)
                                .add(DecoBlocks.WHITE_ORCHID.defaultBlockState(),3).build()),32));

        FeatureUtils.register(context,DECO_ROOFED, Feature.FLOWER,
                    DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                            (WeightedList.<BlockState>builder().add(DecoBlocks.IRIS.defaultBlockState(),2)
                                    .add(DecoBlocks.BLUE_DELPHINIUM.defaultBlockState(),2)
                                    .add(DecoBlocks.CYAN_ORCHID.defaultBlockState(),1)
                                    .add(DecoBlocks.LAVENDER.defaultBlockState(),1).build()),32));

    FeatureUtils.register(
            context, DECO_MEGA_TULIP, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(DecoBlocks.MEGA_BROWN_TULIP))));

    FeatureUtils.register(
            context, DECO_PALE_MEGA_TULIP, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(DecoBlocks.MEGA_GRAY_TULIP))));

            FeatureUtils.register(context, DECO_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 6, 2,
                        PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(DecoBlocks.ROSE)))));

        register(context, DECO_ENDER_KEY, Feature.FLOWER,
                FeatureUtils.simpleRandomPatchConfiguration(64,
                        PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new DualNoiseProvider(new InclusiveRange<>(1, 3),
                                    new NormalNoise.NoiseParameters(-10, 1.0),
                                    1.0F, 2345L, new NormalNoise.NoiseParameters(-3, 1.0),
                                    1.0F, List.of(DecoBlocks.ENDER_ROSE.defaultBlockState(), DecoBlocks.ENDERSHADE.defaultBlockState()))))));

        register(context, DECO_RED_SUNFLOWER_KEY, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(DecoBlocks.RED_SUNFLOWER))));
        register(context, DECO_NOVA_STARFLOWER_KEY, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(DecoBlocks.NOVA_STARFLOWER))));

        FeatureUtils.register(context, DECO_BIRCH_KEY,
                Feature.FLOWER, DecoConfiguredFeatures.createRandomPatchFeatureConfig(new WeightedStateProvider
                        (WeightedList.<BlockState>builder().add(DecoBlocks.PAEONIA.defaultBlockState(),3)
                                .add(DecoBlocks.BUTTERCUP.defaultBlockState(),3)
                                .add(DecoBlocks.NIGHTSHADE.defaultBlockState(),1)
                                .add(DecoBlocks.FELICIA_DAISY.defaultBlockState(),2).build()),48));

        register(context, DECO_WOODEN_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(DecoBlocks.WOODEN_LOG), new ForkingTrunkPlacer(5, 2, 2),
                        BlockStateProvider.simple(DecoBlocks.WOODEN_LEAVES),
                        new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                        new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).build());

        register(context, DECO_FANCY_WOODEN_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(DecoBlocks.WOODEN_LOG), new StraightTrunkPlacer(6, 4, 0),
                        BlockStateProvider.simple(DecoBlocks.WOODEN_LEAVES),
                        new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2),
                                UniformInt.of(1, 2)), new TwoLayersFeatureSize(2, 0, 2)).build());

        register(context, DECO_MEGA_WOODEN_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(DecoBlocks.WOODEN_LOG), new DarkOakTrunkPlacer(13, 2, 14),
                        BlockStateProvider.simple(DecoBlocks.WOODEN_LEAVES),
                        new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                        new TwoLayersFeatureSize(1, 1, 2)).decorators
                                (ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL))))
                        .build());

        register(context, DECO_DRIFTWOOD_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DecoBlocks.DRIFTWOOD_LOG), new DriftwoodTreePlacer(5, 2, 2),
                BlockStateProvider.simple(DecoBlocks.KELP_LEAVES),
                new SpruceFoliagePlacer(ConstantInt.of(1), ConstantInt.of(4), UniformInt.of(3, 4)),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).decorators
                (ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(DecoBlocks.DRIFTWOOD_LOG)))).build());

        register(context, DECO_BUBBLE_ORE, Feature.ORE, new OreConfiguration(overworldBubbleOre, 5));

        FeatureUtils.register(context, DECO_VOID_PATCH, Feature.DISK,
                new DiskConfiguration(RuleBasedBlockStateProvider.simple(DecoBlocks.VOID_STONE),
                        BlockPredicate.matchesBlocks(List.of(Blocks.END_STONE)), UniformInt.of(2, 3), 1));

        register(context, DECO_IRON_CAP_MUSHROOM, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DecoBlocks.IRON_CAP_STEM), new StraightTrunkPlacer(2, 4, 0),
                BlockStateProvider.simple(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 2)).decorators
                        (ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(DecoBlocks.SPORE_IRON_ORE))))
                .build());

        register(context, DECO_DRIFTWOOD_SPROUT, DecoFeatures.DRIFTWOOD_SPROUT, new CountConfiguration(20));

        register(context, DECO_FALLEN_DRIED_DRIFTWOOD_KEY, Feature.FALLEN_TREE, fallenDriedDriftwood().build());
    }
    private static FallenTreeConfiguration.FallenTreeConfigurationBuilder fallenDriedDriftwood() {
        return driedFallen();
    }
    private static FallenTreeConfiguration.FallenTreeConfigurationBuilder driedFallen() {
        return new FallenTreeConfiguration.FallenTreeConfigurationBuilder(BlockStateProvider.simple(DecoBlocks.DRIED_DRIFTWOOD_LOG), UniformInt.of(4, 8))
                .logDecorators(ImmutableList.of(new AttachedToLogsDecorator(0.5F,
                                        new WeightedStateProvider(WeightedList.<BlockState>builder()
                                                .add(Blocks.MOSS_CARPET.defaultBlockState(), 2)), List.of(Direction.UP))));
    }
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, name));
    }

    private static RandomPatchConfiguration createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return FeatureUtils.simpleRandomPatchConfiguration(tries, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(block)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                   ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
    private static WeightedList.Builder<BlockState> flowerbed(Block flowerbed) {
        return segmentedBlock(flowerbed, 1, 4, FlowerBedBlock.AMOUNT, FlowerBedBlock.FACING);
    }
    private static WeightedList.Builder<BlockState> segmentedBlock(Block block, int min, int max, IntegerProperty amountProperty, EnumProperty<Direction> facingProperty) {
        WeightedList.Builder<BlockState> builder = WeightedList.builder();

        for (int i = min; i <= max; i++) {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                builder.add(block.defaultBlockState().setValue(amountProperty, i).setValue(facingProperty, direction), 1);
            }
        }

        return builder;
    }
}
