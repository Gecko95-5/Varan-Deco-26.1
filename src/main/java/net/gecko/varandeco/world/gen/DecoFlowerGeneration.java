package net.gecko.varandeco.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko.varandeco.world.feature.DecoPlacedFeatures;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class DecoFlowerGeneration {
    public static void generateFlowers(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_FLOWER_FOREST_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_TULIPS_FOREST_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MEADOW_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_TULIPS_MEADOW_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_PLAINS_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_PLAINS_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SAVANNA_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_PEAKS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SAVANNA_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SWAMP_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.RIVER),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_RIVER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA_PLATEAU),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_GRAVELLY_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.RIVER),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_RIVER),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_RED_SUNFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ENDER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ENDER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ENDER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_NOVA_STARFLOWER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_NOVA_STARFLOWER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_NOVA_STARFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_BIRCH_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_BIRCH_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_JUNGLE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_JUNGLE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SPARSE_JUNGLE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MESA_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_BIRCH_WILDFLOWER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_BIRCH_WILDFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MEADOW_WILDFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MESA_WILDFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DESERT_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DESERT_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ERODED_BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DESERT_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PALE_GARDEN),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_PALE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROOFED_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MEGA_TULIP_PLACED);
    }
}
