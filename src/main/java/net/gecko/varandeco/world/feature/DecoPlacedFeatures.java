package net.gecko.varandeco.world.feature;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class DecoPlacedFeatures {

    public static final RegistryKey<PlacedFeature> DECO_FLOWER_FOREST_PLACED = registerKey("deco_flower_forest_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_TULIPS_FOREST_PLACED = registerKey("deco_flower_forest_tulips_placed");
    public static final RegistryKey<PlacedFeature> DECO_MEADOW_PLACED = registerKey("deco_meadow_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_TULIPS_MEADOW_PLACED = registerKey("deco_meadow_tulips_placed");
    public static final RegistryKey<PlacedFeature> DECO_PLAINS_PLACED = registerKey("deco_plains_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_SAVANNA_PLACED = registerKey("deco_savanna_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_SWAMP_PLACED = registerKey("deco_swamp_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_RIVER_PLACED = registerKey("deco_river_flowers_placed");
    public static final RegistryKey<PlacedFeature> DECO_ROSE_PLACED = registerKey("deco_rose_placed");
    public static final RegistryKey<PlacedFeature> DECO_ENDER_PLACED = registerKey("deco_ender_placed");
    public static final RegistryKey<PlacedFeature> DECO_RED_SUNFLOWER_PLACED = registerKey("deco_red_sunflower_placed");
    public static final RegistryKey<PlacedFeature> DECO_NOVA_STARFLOWER_PLACED = registerKey("deco_nova_starflower_placed");
    public static final RegistryKey<PlacedFeature> DECO_BIRCH_PLACED = registerKey("deco_birch_placed");
    public static final RegistryKey<PlacedFeature> DECO_JUNGLE_PLACED = registerKey("deco_jungle_placed");
    public static final RegistryKey<PlacedFeature> DECO_SPARSE_JUNGLE_PLACED = registerKey("deco_sparse_jungle_placed");
    public static final RegistryKey<PlacedFeature> DECO_MESA_PLACED = registerKey("deco_mesa_placed");
    public static final RegistryKey<PlacedFeature> DECO_MESA_WILDFLOWER_PLACED = registerKey("deco_mesa_wildflower_placed");
    public static final RegistryKey<PlacedFeature> DECO_MEADOW_WILDFLOWER_PLACED = registerKey("deco_meadow_wildflower_placed");
    public static final RegistryKey<PlacedFeature> DECO_BIRCH_WILDFLOWER_PLACED = registerKey("deco_birch_wildflower_placed");
    public static final RegistryKey<PlacedFeature> DECO_DESERT_PLACED = registerKey("deco_desert_placed");
    public static final RegistryKey<PlacedFeature> DECO_PALE_PLACED = registerKey("deco_pale_placed");
    public static final RegistryKey<PlacedFeature> DECO_BUBBLE_ORE_PLACED = registerKey("deco_bubble_ore_placed");
    public static final RegistryKey<PlacedFeature> DECO_DEEP_BUBBLE_ORE_PLACED = registerKey("deco_deep_bubble_ore_placed");
    public static final RegistryKey<PlacedFeature> DECO_DRIFTWOOD_SPROUT_PLACED = registerKey("deco_driftwood_sprout_placed");
    public static final RegistryKey<PlacedFeature> DECO_DRIED_FALLEN_DRIFTWOOD_PLACED = registerKey("deco_dried_fallen_driftwood_placed");
    public static final RegistryKey<PlacedFeature> DECO_VOID_PATCH_PLACED = registerKey("deco_void_patch_placed");
    public static final RegistryKey<PlacedFeature> DECO_VOID_BIG_PATCH_PLACED = registerKey("deco_void_big_patch_placed");
    public static final RegistryKey<PlacedFeature> DECO_ROOFED_PLACED = registerKey("deco_roofed_placed");
    public static final RegistryKey<PlacedFeature> DECO_MEGA_TULIP_PLACED = registerKey("deco_mega_tulip_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

register(context,DECO_FLOWER_FOREST_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(DecoConfiguredFeatures.DECO_FLOWER_FOREST_KEY),
        CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(2), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context,DECO_TULIPS_FOREST_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(DecoConfiguredFeatures.DECO_TULIPS_FOREST_KEY),
                CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(2), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_MEADOW_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(DecoConfiguredFeatures.DECO_MEADOW_KEY),
        SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_TULIPS_MEADOW_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(DecoConfiguredFeatures.DECO_TULIPS_MEADOW_KEY),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());register(context,DECO_PLAINS_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_PLAINS_KEY), NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of());

register(context,DECO_SAVANNA_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_SAVANNA_KEY), NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of());

register(context,DECO_SWAMP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_SWAMP_KEY), RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_RIVER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_RIVER_KEY), NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of());

register(context,DECO_ROOFED_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
            DecoConfiguredFeatures.DECO_ROOFED), NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of());

        register(context,DECO_MEGA_TULIP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_MEGA_TULIP), RarityFilterPlacementModifier.of(24),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());register(context,DECO_ROSE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_ROSE_KEY), RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_ENDER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_ENDER_KEY), RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_RED_SUNFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_RED_SUNFLOWER_KEY), RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_NOVA_STARFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_NOVA_STARFLOWER_KEY), RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context, DECO_BIRCH_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_BIRCH_KEY), RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context, DECO_JUNGLE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_JUNGLE_KEY), RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context, DECO_SPARSE_JUNGLE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_JUNGLE_KEY), RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context, DECO_MESA_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_MESA_KEY), RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, DECO_BIRCH_WILDFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                        DecoConfiguredFeatures.DECO_BIRCH_WILDFLOWER_KEY),CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(2), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, DECO_MESA_WILDFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                        DecoConfiguredFeatures.DECO_MESA_WILDFLOWER_KEY),NoiseThresholdCountPlacementModifier.of
                        (-0.8, 5, 10), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, DECO_MEADOW_WILDFLOWER_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                        DecoConfiguredFeatures.DECO_MEADOW_WILDFLOWER_KEY),	NoiseThresholdCountPlacementModifier.of
                        (-0.8, 5, 10), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_BUBBLE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(DecoConfiguredFeatures.DECO_BUBBLE_ORE),
        OrePlacement.modifiersWithCount(5,
                HeightRangePlacementModifier.uniform(YOffset.fixed(8), YOffset.fixed(27))));

register(context, DECO_DESERT_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_DESERT), RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context, DECO_PALE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_PALE), RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

register(context,DECO_DEEP_BUBBLE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(DecoConfiguredFeatures.DECO_BUBBLE_ORE),
        OrePlacement.modifiersWithCount(5,
                HeightRangePlacementModifier.uniform(YOffset.fixed(8), YOffset.fixed(45))));

register(context, DECO_DRIED_FALLEN_DRIFTWOOD_PLACED,configuredFeatureRegistryEntryLookup.getOrThrow
        (DecoConfiguredFeatures.DECO_FALLEN_DRIED_DRIFTWOOD_KEY), BlockFilterPlacementModifier.of
        (BlockPredicate.wouldSurvive(Blocks.CACTUS.getDefaultState(), BlockPos.ORIGIN)));

        register(context, DECO_VOID_PATCH_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_VOID_PATCH),RarityFilterPlacementModifier.of(8),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(-1)),
                BlockFilterPlacementModifier.of(BlockPredicate.matchingBlocks(Blocks.SNOW_BLOCK)), BiomePlacementModifier.of());

        register(context, DECO_VOID_BIG_PATCH_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(
                DecoConfiguredFeatures.DECO_VOID_PATCH),CountPlacementModifier.of(2),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(-1)),
                BlockFilterPlacementModifier.of(BlockPredicate.matchingBlocks(Blocks.SNOW_BLOCK)), BiomePlacementModifier.of());

        register(context,DECO_DRIFTWOOD_SPROUT_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(DecoConfiguredFeatures.DECO_DRIFTWOOD_SPROUT),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP,
                    BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(VaranDeco.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
