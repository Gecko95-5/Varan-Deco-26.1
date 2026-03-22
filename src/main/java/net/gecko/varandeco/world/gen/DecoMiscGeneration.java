package net.gecko.varandeco.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko.varandeco.world.feature.DecoPlacedFeatures;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class DecoMiscGeneration {

    public static void generateMiscellaneous() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_BUBBLE_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.COLD_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_BUBBLE_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_BUBBLE_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_DEEP_BUBBLE_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_COLD_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_DEEP_BUBBLE_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_FROZEN_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_DEEP_BUBBLE_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
                GenerationStep.Feature.SURFACE_STRUCTURES, DecoPlacedFeatures.DECO_VOID_PATCH_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
                GenerationStep.Feature.SURFACE_STRUCTURES, DecoPlacedFeatures.DECO_VOID_PATCH_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
                GenerationStep.Feature.SURFACE_STRUCTURES, DecoPlacedFeatures.DECO_VOID_BIG_PATCH_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DRIED_FALLEN_DRIFTWOOD_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DRIED_FALLEN_DRIFTWOOD_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_SHORE),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DRIED_FALLEN_DRIFTWOOD_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OCEAN),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DRIFTWOOD_SPROUT_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DRIFTWOOD_SPROUT_PLACED);
    }
}
