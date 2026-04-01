package net.gecko.varandeco.util;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.world.level.block.Blocks;

import java.util.List;

public class DecoBlockColours {
    private static final BlockTintSource BLANK_LAYER = BlockTintSources.constant(-1);
    public static void createDefault() {
        BlockColors colors = new BlockColors();
        colors.register(List.of(BlockTintSources.grassBlock()), DecoBlocks.PACKED_GRASS, DecoBlocks.GRASS_CARPET,
                DecoBlocks.GRASS_SLAB, DecoBlocks.GRASS_STAIRS);
        colors.register(List.of(BlockTintSources.foliage()), DecoBlocks.WOODEN_LEAVES);
        colors.register(List.of(BlockTintSources.dryFoliage()), DecoBlocks.DRIED_LEAVES);
        colors.register(List.of(BLANK_LAYER, BlockTintSources.grass()), Blocks.PINK_PETALS, Blocks.WILDFLOWERS);
    }
}
