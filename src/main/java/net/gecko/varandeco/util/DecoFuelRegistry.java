package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.gecko.varandeco.block.DecoBlocks;

public class DecoFuelRegistry {
    public static void registerFuels() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(DecoBlocks.CHARCOAL_BLOCK,16000);
            builder.add(DecoTags.Items.WOODEN_CRAFTING_TABLES,300);
            builder.add(DecoTags.Items.DECO_LADDER,300);
            builder.add(DecoTags.Items.WOODEN_CARTOGRAPHY_TABLES,300);
            builder.add(DecoTags.Items.WOODEN_SMITHING_TABLES,300);
            builder.add(DecoTags.Items.WOODEN_BARRELS,300);
            builder.add(DecoTags.Items.WOODEN_BOOKSHELVES,300);
            builder.add(DecoTags.Items.MOSAIC_WOOD,300);
            builder.add(DecoTags.Items.MOSAIC_STAIRS,300);
            builder.add(DecoTags.Items.MOSAIC_SLABS,150);
            builder.add(DecoBlocks.DRIED_LEAVES,400);
            builder.add(DecoBlocks.COAL_BRICKS,3200);
            builder.add(DecoBlocks.CHISELED_COAL_BRICKS,3200);
            builder.add(DecoBlocks.COAL_BRICK_STAIRS,3200);
            builder.add(DecoBlocks.COAL_BRICK_SLAB,1600);
            builder.add(DecoBlocks.COAL_BRICK_WALL,3200);
            builder.add(DecoBlocks.COAL_STAIRS,16000);
            builder.add(DecoBlocks.COAL_SLAB,8000);
            builder.add(DecoBlocks.COAL_WALL,16000);
            builder.add(DecoBlocks.CHARCOAL_STAIRS,16000);
            builder.add(DecoBlocks.CHARCOAL_SLAB,8000);
            builder.add(DecoBlocks.CHARCOAL_WALL,16000);
        });
    }
}
