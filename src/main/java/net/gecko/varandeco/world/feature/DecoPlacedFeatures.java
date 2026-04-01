package net.gecko.varandeco.world.feature;

import net.gecko.varandeco.VaranDeco;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import java.util.List;

public class DecoPlacedFeatures {

    public static final ResourceKey<PlacedFeature> DECO_FLOWER_FOREST_PLACED = registerKey("deco_flower_forest_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_TULIPS_FOREST_PLACED = registerKey("deco_flower_forest_tulips_placed");
    public static final ResourceKey<PlacedFeature> DECO_MEADOW_PLACED = registerKey("deco_meadow_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_TULIPS_MEADOW_PLACED = registerKey("deco_meadow_tulips_placed");
    public static final ResourceKey<PlacedFeature> DECO_PLAINS_PLACED = registerKey("deco_plains_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_SAVANNA_PLACED = registerKey("deco_savanna_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_SWAMP_PLACED = registerKey("deco_swamp_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_RIVER_PLACED = registerKey("deco_river_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_ROSE_PLACED = registerKey("deco_rose_placed");
    public static final ResourceKey<PlacedFeature> DECO_ENDER_PLACED = registerKey("deco_ender_placed");
    public static final ResourceKey<PlacedFeature> DECO_RED_SUNFLOWER_PLACED = registerKey("deco_red_sunflower_placed");
    public static final ResourceKey<PlacedFeature> DECO_NOVA_STARFLOWER_PLACED = registerKey("deco_nova_starflower_placed");
    public static final ResourceKey<PlacedFeature> DECO_BIRCH_PLACED = registerKey("deco_birch_placed");
    public static final ResourceKey<PlacedFeature> DECO_JUNGLE_PLACED = registerKey("deco_jungle_placed");
    public static final ResourceKey<PlacedFeature> DECO_SPARSE_JUNGLE_PLACED = registerKey("deco_sparse_jungle_placed");
    public static final ResourceKey<PlacedFeature> DECO_MESA_PLACED = registerKey("deco_mesa_placed");
    public static final ResourceKey<PlacedFeature> DECO_MESA_WILDFLOWER_PLACED = registerKey("deco_mesa_wildflower_placed");
    public static final ResourceKey<PlacedFeature> DECO_MEADOW_WILDFLOWER_PLACED = registerKey("deco_meadow_wildflower_placed");
    public static final ResourceKey<PlacedFeature> DECO_BIRCH_WILDFLOWER_PLACED = registerKey("deco_birch_wildflower_placed");
    public static final ResourceKey<PlacedFeature> DECO_DESERT_PLACED = registerKey("deco_desert_placed");
    public static final ResourceKey<PlacedFeature> DECO_PALE_PLACED = registerKey("deco_pale_placed");
    public static final ResourceKey<PlacedFeature> DECO_BUBBLE_ORE_PLACED = registerKey("deco_bubble_ore_placed");
    public static final ResourceKey<PlacedFeature> DECO_DEEP_BUBBLE_ORE_PLACED = registerKey("deco_deep_bubble_ore_placed");
    public static final ResourceKey<PlacedFeature> DECO_DRIFTWOOD_SPROUT_PLACED = registerKey("deco_driftwood_sprout_placed");
    public static final ResourceKey<PlacedFeature> DECO_DRIED_FALLEN_DRIFTWOOD_PLACED = registerKey("deco_dried_fallen_driftwood_placed");
    public static final ResourceKey<PlacedFeature> DECO_VOID_PATCH_PLACED = registerKey("deco_void_patch_placed");
    public static final ResourceKey<PlacedFeature> DECO_VOID_BIG_PATCH_PLACED = registerKey("deco_void_big_patch_placed");
    public static final ResourceKey<PlacedFeature> DECO_ROOFED_PLACED = registerKey("deco_roofed_placed");
    public static final ResourceKey<PlacedFeature> DECO_MEGA_TULIP_PLACED = registerKey("deco_mega_tulip_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.lookup(Registries.CONFIGURED_FEATURE);

register(context,DECO_FLOWER_FOREST_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_FLOWER_FOREST_KEY),
        CountPlacement.of(3), RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(),
        PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context,DECO_TULIPS_FOREST_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_TULIPS_FOREST_KEY),
                CountPlacement.of(3), RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context,DECO_MEADOW_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_MEADOW_KEY),
        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context,DECO_TULIPS_MEADOW_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_TULIPS_MEADOW_KEY),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());register(context,DECO_PLAINS_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_PLAINS_KEY), NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome());

register(context,DECO_SAVANNA_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_SAVANNA_KEY), NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome());

register(context,DECO_SWAMP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_SWAMP_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context,DECO_RIVER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_RIVER_KEY), NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome());

register(context,DECO_ROOFED_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
            net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_ROOFED), NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome());

        register(context,DECO_MEGA_TULIP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_MEGA_TULIP), RarityFilter.onAverageOnceEvery(24),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());register(context,DECO_ROSE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_ROSE_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context,DECO_ENDER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_ENDER_KEY), RarityFilter.onAverageOnceEvery(64), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context,DECO_RED_SUNFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_RED_SUNFLOWER_KEY), RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context,DECO_NOVA_STARFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_NOVA_STARFLOWER_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context, DECO_BIRCH_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_BIRCH_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context, DECO_JUNGLE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_JUNGLE_KEY), RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context, DECO_SPARSE_JUNGLE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_JUNGLE_KEY), RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context, DECO_MESA_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_MESA_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, DECO_BIRCH_WILDFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                        net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_BIRCH_WILDFLOWER_KEY),CountPlacement.of(3), RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, DECO_MESA_WILDFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                        net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_MESA_WILDFLOWER_KEY),NoiseThresholdCountPlacement.of
                        (-0.8, 5, 10), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        register(context, DECO_MEADOW_WILDFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                        net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_MEADOW_WILDFLOWER_KEY),	NoiseThresholdCountPlacement.of
                        (-0.8, 5, 10), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context,DECO_BUBBLE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_BUBBLE_ORE),
        net.gecko.varandeco.world.feature.OrePlacement.modifiersWithCount(5,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(27))));

register(context, DECO_DESERT_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_DESERT), RarityFilter.onAverageOnceEvery(64), InSquarePlacement.spread(),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context, DECO_PALE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_PALE), RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

register(context,DECO_DEEP_BUBBLE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_BUBBLE_ORE),
        OrePlacement.modifiersWithCount(5,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(45))));

register(context, DECO_DRIED_FALLEN_DRIFTWOOD_PLACED,configuredFeatureRegistryEntryLookup.getOrThrow
        (net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_FALLEN_DRIED_DRIFTWOOD_KEY), BlockPredicateFilter.forPredicate
        (BlockPredicate.wouldSurvive(Blocks.CACTUS.defaultBlockState(), BlockPos.ZERO)));

        register(context, DECO_VOID_PATCH_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_VOID_PATCH),RarityFilter.onAverageOnceEvery(8),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                RandomOffsetPlacement.vertical(ConstantInt.of(-1)),
                BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(Blocks.SNOW_BLOCK)), BiomeFilter.biome());

        register(context, DECO_VOID_BIG_PATCH_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                net.gecko.varandeco.world.feature.DecoConfiguredFeatures.DECO_VOID_PATCH),CountPlacement.of(2),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                RandomOffsetPlacement.vertical(ConstantInt.of(-1)),
                BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(Blocks.SNOW_BLOCK)), BiomeFilter.biome());

        register(context,DECO_DRIFTWOOD_SPROUT_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(DecoConfiguredFeatures.DECO_DRIFTWOOD_SPROUT),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID,
                    BiomeFilter.biome());
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                                                                   Holder<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, InSquarePlacement.spread(), heightModifier, BiomeFilter.biome());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacement.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilter.onAverageOnceEvery(chance), heightModifier);
    }
}
