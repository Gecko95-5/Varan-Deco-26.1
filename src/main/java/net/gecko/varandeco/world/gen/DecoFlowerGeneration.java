package net.gecko.varandeco.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko.varandeco.world.feature.DecoPlacedFeatures;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class DecoFlowerGeneration {
    public static void generateFlowers(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.FLOWER_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_FLOWER_FOREST_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.FLOWER_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_TULIPS_FOREST_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.MEADOW),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MEADOW_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.MEADOW),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_TULIPS_MEADOW_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_PLAINS_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SUNFLOWER_PLAINS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_PLAINS_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_SAVANNA),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SAVANNA_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.STONY_PEAKS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SAVANNA_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SWAMP),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SWAMP_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.RIVER),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_RIVER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SUNFLOWER_PLAINS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SAVANNA),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SAVANNA_PLATEAU),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.WINDSWEPT_SAVANNA),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SNOWY_PLAINS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BIRCH_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.TAIGA),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_PINE_TAIGA),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BAMBOO_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SPARSE_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DARK_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.WINDSWEPT_HILLS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.WINDSWEPT_GRAVELLY_HILLS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.WINDSWEPT_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.RIVER),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.FROZEN_RIVER),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROSE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SUNFLOWER_PLAINS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_RED_SUNFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.END_MIDLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ENDER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.END_HIGHLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ENDER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.END_BARRENS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ENDER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.END_MIDLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_NOVA_STARFLOWER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.END_HIGHLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_NOVA_STARFLOWER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.END_BARRENS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_NOVA_STARFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BIRCH_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_BIRCH_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_BIRCH_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_JUNGLE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BAMBOO_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_JUNGLE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SPARSE_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_SPARSE_JUNGLE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.WOODED_BADLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MESA_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BIRCH_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_BIRCH_WILDFLOWER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_BIRCH_WILDFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.MEADOW),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MEADOW_WILDFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.WOODED_BADLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MESA_WILDFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DESERT),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DESERT_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BADLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DESERT_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.ERODED_BADLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_DESERT_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PALE_GARDEN),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_PALE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DARK_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_ROOFED_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DARK_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, DecoPlacedFeatures.DECO_MEGA_TULIP_PLACED);
    }
}
