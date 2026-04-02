package net.gecko.varandeco.world.feature;

import net.gecko.varandeco.VaranDeco;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
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
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DecoPlacedFeatures {

    public static final ResourceKey<PlacedFeature> DECO_FLOWER_FOREST_PLACED = PlacementUtils.createKey("deco_flower_forest_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_TULIPS_FOREST_PLACED = PlacementUtils.createKey("deco_flower_forest_tulips_placed");
    public static final ResourceKey<PlacedFeature> DECO_MEADOW_PLACED = PlacementUtils.createKey("deco_meadow_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_TULIPS_MEADOW_PLACED = PlacementUtils.createKey("deco_meadow_tulips_placed");
    public static final ResourceKey<PlacedFeature> DECO_PLAINS_PLACED = PlacementUtils.createKey("deco_plains_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_SAVANNA_PLACED = PlacementUtils.createKey("deco_savanna_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_SWAMP_PLACED = PlacementUtils.createKey("deco_swamp_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_RIVER_PLACED = PlacementUtils.createKey("deco_river_flowers_placed");
    public static final ResourceKey<PlacedFeature> DECO_ROSE_PLACED = PlacementUtils.createKey("deco_rose_placed");
    public static final ResourceKey<PlacedFeature> DECO_ENDER_PLACED = PlacementUtils.createKey("deco_ender_placed");
    public static final ResourceKey<PlacedFeature> DECO_RED_SUNFLOWER_PLACED = PlacementUtils.createKey("deco_red_sunflower_placed");
    public static final ResourceKey<PlacedFeature> DECO_NOVA_STARFLOWER_PLACED = PlacementUtils.createKey("deco_nova_starflower_placed");
    public static final ResourceKey<PlacedFeature> DECO_BIRCH_PLACED = PlacementUtils.createKey("deco_birch_placed");
    public static final ResourceKey<PlacedFeature> DECO_JUNGLE_PLACED = PlacementUtils.createKey("deco_jungle_placed");
    public static final ResourceKey<PlacedFeature> DECO_SPARSE_JUNGLE_PLACED = PlacementUtils.createKey("deco_sparse_jungle_placed");
    public static final ResourceKey<PlacedFeature> DECO_MESA_PLACED = PlacementUtils.createKey("deco_mesa_placed");
    public static final ResourceKey<PlacedFeature> DECO_MESA_WILDFLOWER_PLACED = PlacementUtils.createKey("deco_mesa_wildflower_placed");
    public static final ResourceKey<PlacedFeature> DECO_MEADOW_WILDFLOWER_PLACED = PlacementUtils.createKey("deco_meadow_wildflower_placed");
    public static final ResourceKey<PlacedFeature> DECO_BIRCH_WILDFLOWER_PLACED = PlacementUtils.createKey("deco_birch_wildflower_placed");
    public static final ResourceKey<PlacedFeature> DECO_DESERT_PLACED = PlacementUtils.createKey("deco_desert_placed");
    public static final ResourceKey<PlacedFeature> DECO_PALE_PLACED = PlacementUtils.createKey("deco_pale_placed");
    public static final ResourceKey<PlacedFeature> DECO_BUBBLE_ORE_PLACED = PlacementUtils.createKey("deco_bubble_ore_placed");
    public static final ResourceKey<PlacedFeature> DECO_DEEP_BUBBLE_ORE_PLACED = PlacementUtils.createKey("deco_deep_bubble_ore_placed");
    public static final ResourceKey<PlacedFeature> DECO_DRIFTWOOD_SPROUT_PLACED = PlacementUtils.createKey("deco_driftwood_sprout_placed");
    public static final ResourceKey<PlacedFeature> DECO_DRIED_FALLEN_DRIFTWOOD_PLACED = PlacementUtils.createKey("deco_dried_fallen_driftwood_placed");
    public static final ResourceKey<PlacedFeature> DECO_VOID_PATCH_PLACED = PlacementUtils.createKey("deco_void_patch_placed");
    public static final ResourceKey<PlacedFeature> DECO_VOID_BIG_PATCH_PLACED = PlacementUtils.createKey("deco_void_big_patch_placed");
    public static final ResourceKey<PlacedFeature> DECO_ROOFED_PLACED = PlacementUtils.createKey("deco_roofed_placed");
    public static final ResourceKey<PlacedFeature> DECO_MEGA_TULIP_PLACED = PlacementUtils.createKey("deco_mega_tulip_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<@NotNull ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        PlacementUtils.register(context,DECO_FLOWER_FOREST_PLACED,
                configuredFeatures.getOrThrow(DecoConfiguredFeatures.DECO_FLOWER_FOREST_KEY),
                CountPlacement.of(3), RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome(), CountPlacement.of(96),
                RandomOffsetPlacement.ofTriangle(6, 2),
                BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)
        );

        PlacementUtils.register(context,DECO_TULIPS_FOREST_PLACED, configuredFeatures.getOrThrow(DecoConfiguredFeatures.DECO_TULIPS_FOREST_KEY),
                CountPlacement.of(3), RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context,DECO_MEADOW_PLACED, configuredFeatures.getOrThrow(DecoConfiguredFeatures.DECO_MEADOW_KEY),
        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context,DECO_TULIPS_MEADOW_PLACED, configuredFeatures.getOrThrow(DecoConfiguredFeatures.DECO_TULIPS_MEADOW_KEY),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context,DECO_PLAINS_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_PLAINS_KEY), NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome());

        PlacementUtils.register(context,DECO_SAVANNA_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_SAVANNA_KEY), NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome());

        PlacementUtils.register(context,DECO_SWAMP_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_SWAMP_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context,DECO_RIVER_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_RIVER_KEY), NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome());

        PlacementUtils.register(context,DECO_ROOFED_PLACED, configuredFeatures.getOrThrow(
            DecoConfiguredFeatures.DECO_ROOFED), NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome());

        PlacementUtils.register(context,DECO_MEGA_TULIP_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_MEGA_TULIP), RarityFilter.onAverageOnceEvery(24),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
        PlacementUtils.register(context,DECO_ROSE_PLACED,
                configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_ROSE_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context,DECO_ENDER_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_ENDER_KEY), RarityFilter.onAverageOnceEvery(64), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context,DECO_RED_SUNFLOWER_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_RED_SUNFLOWER_KEY), RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context,DECO_NOVA_STARFLOWER_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_NOVA_STARFLOWER_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context, DECO_BIRCH_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_BIRCH_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context, DECO_JUNGLE_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_JUNGLE_KEY), RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context, DECO_SPARSE_JUNGLE_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_JUNGLE_KEY), RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context, DECO_MESA_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_MESA_KEY), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context, DECO_BIRCH_WILDFLOWER_PLACED, configuredFeatures.getOrThrow(
                        DecoConfiguredFeatures.DECO_BIRCH_WILDFLOWER_KEY),CountPlacement.of(3), RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context, DECO_MESA_WILDFLOWER_PLACED, configuredFeatures.getOrThrow(
                        DecoConfiguredFeatures.DECO_MESA_WILDFLOWER_KEY),NoiseThresholdCountPlacement.of
                        (-0.8, 5, 10), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context, DECO_MEADOW_WILDFLOWER_PLACED, configuredFeatures.getOrThrow(
                        DecoConfiguredFeatures.DECO_MEADOW_WILDFLOWER_KEY),	NoiseThresholdCountPlacement.of
                        (-0.8, 5, 10), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context,DECO_BUBBLE_ORE_PLACED, configuredFeatures.getOrThrow(DecoConfiguredFeatures.DECO_BUBBLE_ORE),
        OrePlacement.modifiersWithCount(5,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(27))));

        PlacementUtils.register(context, DECO_DESERT_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_DESERT), RarityFilter.onAverageOnceEvery(64), InSquarePlacement.spread(),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context, DECO_PALE_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_PALE), RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(),
            PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        PlacementUtils.register(context,DECO_DEEP_BUBBLE_ORE_PLACED, configuredFeatures.getOrThrow(DecoConfiguredFeatures.DECO_BUBBLE_ORE),
        OrePlacement.modifiersWithCount(5,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(45))));

        PlacementUtils.register(context, DECO_DRIED_FALLEN_DRIFTWOOD_PLACED,configuredFeatures.getOrThrow
        (DecoConfiguredFeatures.DECO_FALLEN_DRIED_DRIFTWOOD_KEY), BlockPredicateFilter.forPredicate
        (BlockPredicate.wouldSurvive(Blocks.CACTUS.defaultBlockState(), BlockPos.ZERO)));

        PlacementUtils.register(context, DECO_VOID_PATCH_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_VOID_PATCH),RarityFilter.onAverageOnceEvery(8),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                RandomOffsetPlacement.vertical(ConstantInt.of(-1)),
                BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(Blocks.SNOW_BLOCK)), BiomeFilter.biome());

        PlacementUtils.register(context, DECO_VOID_BIG_PATCH_PLACED, configuredFeatures.getOrThrow(
                DecoConfiguredFeatures.DECO_VOID_PATCH),CountPlacement.of(2),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
                RandomOffsetPlacement.vertical(ConstantInt.of(-1)),
                BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(Blocks.SNOW_BLOCK)), BiomeFilter.biome());

        PlacementUtils.register(context,DECO_DRIFTWOOD_SPROUT_PLACED, configuredFeatures.getOrThrow(DecoConfiguredFeatures.DECO_DRIFTWOOD_SPROUT),
                RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID,
                    BiomeFilter.biome());
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
