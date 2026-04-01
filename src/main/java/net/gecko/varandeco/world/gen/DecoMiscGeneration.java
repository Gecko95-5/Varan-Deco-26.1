package net.gecko.varandeco.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko.varandeco.world.feature.DecoPlacedFeatures;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class DecoMiscGeneration {

    public static void generateMiscellaneous() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.OCEAN),
                GenerationStep.Decoration.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_BUBBLE_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.COLD_OCEAN),
                GenerationStep.Decoration.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_BUBBLE_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.FROZEN_OCEAN),
                GenerationStep.Decoration.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_BUBBLE_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DEEP_OCEAN),
                GenerationStep.Decoration.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_DEEP_BUBBLE_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DEEP_COLD_OCEAN),
                GenerationStep.Decoration.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_DEEP_BUBBLE_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DEEP_FROZEN_OCEAN),
                GenerationStep.Decoration.UNDERGROUND_ORES, DecoPlacedFeatures.DECO_DEEP_BUBBLE_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.END_MIDLANDS),
                GenerationStep.Decoration.SURFACE_STRUCTURES, DecoPlacedFeatures.DECO_VOID_PATCH_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.END_HIGHLANDS),
                GenerationStep.Decoration.SURFACE_STRUCTURES, DecoPlacedFeatures.DECO_VOID_PATCH_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.END_BARRENS),
                GenerationStep.Decoration.SURFACE_STRUCTURES, DecoPlacedFeatures.DECO_VOID_BIG_PATCH_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BEACH),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DRIED_FALLEN_DRIFTWOOD_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SNOWY_BEACH),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DRIED_FALLEN_DRIFTWOOD_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.STONY_SHORE),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DRIED_FALLEN_DRIFTWOOD_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.OCEAN),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DRIFTWOOD_SPROUT_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DEEP_OCEAN),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DRIFTWOOD_SPROUT_PLACED);
    }
}
