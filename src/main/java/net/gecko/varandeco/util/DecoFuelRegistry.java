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
        });
    }
}
