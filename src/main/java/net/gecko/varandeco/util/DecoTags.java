package net.gecko.varandeco.util;

import net.gecko.varandeco.VaranDeco;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DecoTags {
    public static class Blocks {

        public static final TagKey<Block> DECO_CRAFTING_TABLES =
                createTag("deco_crafting_tables");

        public static final TagKey<Block> DECO_BARRELS =
                createTag("deco_barrels");

        public static final TagKey<Block> DECO_LADDERS =
                createTag("deco_ladders");

        public static final TagKey<Block> DECO_SMITHING_TABLES =
                createTag("deco_smithing_tables");

        public static final TagKey<Block> DECO_CARTOGRAPHY_TABLES =
                createTag("deco_cartography_tables");

        public static final TagKey<Block> DECO_BOOKSHELVES =
                createTag("deco_bookshelves");

        public static final TagKey<Block> DECO_BOOKSHELF_STAIRS =
                createTag("deco_bookshelf_stairs");

        public static final TagKey<Block> DECO_BOOKSHELF_SLABS =
                createTag("deco_bookshelf_slab");

        public static final TagKey<Block> WOODEN_BOOKSHELVES =
                createTag("wooden_bookshelves");

        public static final TagKey<Block> WOODEN_BOOKSHELF_STAIRS =
                createTag("wooden_bookshelf_stairs");

        public static final TagKey<Block> WOODEN_BOOKSHELF_SLABS =
                createTag("wooden_bookshelf_slab");

        public static final TagKey<Block> DECO_NOTE_BLOCKS =
                createTag("deco_note_blocks");

        public static final TagKey<Block> WOODEN_LOGS =
                createTag("wooden_logs");

        public static final TagKey<Block> DRIFTWOOD_LOGS =
                createTag("driftwood_logs");

        public static final TagKey<Block> WET_DRIFTWOOD_LOGS =
                createTag("wet_driftwood_logs");

        public static final TagKey<Block> DRIED_DRIFTWOOD_LOGS =
                createTag("dried_driftwood_logs");

        public static final TagKey<Block> IRON_CAP_STEM =
                createTag("iron_cap_stem");

        public static final TagKey<Block> TERRACOTTA_STAIRS =
                createTag("terracotta_stairs");

        public static final TagKey<Block> TERRACOTTA_SLABS =
                createTag("terracotta_slabs");

        public static final TagKey<Block> TERRACOTTA_WALLS =
                createTag("terracotta_walls");

        public static final TagKey<Block> CONCRETE_STAIRS =
                createTag("concrete_stairs");

        public static final TagKey<Block> CONCRETE_SLABS =
                createTag("concrete_slabs");

        public static final TagKey<Block> CONCRETE_WALLS =
                createTag("concrete_walls");

        public static final TagKey<Block> CORAL_STAIRS =
                createTag("coral_stairs");

        public static final TagKey<Block> CORAL_SLABS =
                createTag("coral_slabs");

        public static final TagKey<Block> CORAL_WALLS =
                createTag("coral_walls");

        public static final TagKey<Block> HYDRATED_CORALS =
                createTag("hydrated_corals");

        public static final TagKey<Block> WOOL_STAIRS =
                createTag("wool_stairs");

        public static final TagKey<Block> WOOL_SLABS =
                createTag("wool_slabs");

        public static final TagKey<Block> HARDENED_GLASS =
                createTag("hardened_glass");

        public static final TagKey<Block> HARDENED_GLASS_PANES =
                createTag("hardened_glass_panes");

        public static final TagKey<Block> MOSAIC_GLASS =
                createTag("mosaic_glass");

        public static final TagKey<Block> MOSAIC_GLASS_PANES =
                createTag("mosaic_glass_panes");

        public static final TagKey<Block> DECO_FURNACES =
                createTag("deco_furnaces");

        public static final TagKey<Block> COPPER_BARS =
                createTag("copper_bars");

        public static final TagKey<Block> COPPER_LANTERN =
                createTag("copper_lantern");

        public static final TagKey<Block> METAL_BUTTONS =
                createTag("metal_buttons");

        public static final TagKey<Block> MOSAIC_WOOD =
                createTag("mosaic_wood");

        public static final TagKey<Block> MOSAIC_STAIRS =
                createTag("mosaic_stairs");

        public static final TagKey<Block> MOSAIC_SLABS =
                createTag("mosaic_slab");

        public static final TagKey<Block> INFESTED_BLOCKS =
                createTag("infested_blocks");

        public static final TagKey<Block> DYE_BLOCKS =
                createTag("dye_blocks");

        public static final TagKey<Block> COLOURED_LAMPS =
                createTag("coloured_lamps");

        public static final TagKey<Block> LEVERS =
                createTag("levers");

        public static final TagKey<Block> LOG_STAIRS =
                createTag("log_stairs");

        public static final TagKey<Block> LOG_SLABS =
                createTag("log_slabs");

        public static final TagKey<Block> LOG_WALLS =
                createTag("log_walls");

        private static TagKey<Block> createTag(String name){
            return TagKey.create(BuiltInRegistries.BLOCK.key(), Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> DECO_SMITHING_TABLES =
                createTag("deco_smithing_tables");

        public static final TagKey<Item> DECO_CRAFTING_TABLES =
                createTag("deco_crafting_tables");

        public static final TagKey<Item> DECO_BARRELS =
                createTag("deco_barrels");

        public static final TagKey<Item> DECO_BOOKSHELVES =
                createTag("deco_bookshelves");

        public static final TagKey<Item> DECO_BOOKSHELF_STAIRS =
                createTag("deco_bookshelf_stairs");

        public static final TagKey<Item> DECO_BOOKSHELF_SLABS =
                createTag("deco_bookshelf_slab");

        public static final TagKey<Item> WOODEN_BOOKSHELF_STAIRS =
                createTag("wooden_bookshelf_stairs");

        public static final TagKey<Item> WOODEN_BOOKSHELF_SLABS =
                createTag("wooden_bookshelf_slab");

        public static final TagKey<Item> DECO_CARTOGRAPHY_TABLES =
                createTag("deco_cartography_tables");

        public static final TagKey<Item> DECO_NOTE_BLOCKS =
                createTag("deco_note_blocks");

        public static final TagKey<Item> WOODEN_SMITHING_TABLES =
                createTag("wooden_smithing_tables");

        public static final TagKey<Item> WOODEN_BARRELS =
                createTag("wooden_barrels");

        public static final TagKey<Item> WOODEN_CRAFTING_TABLES =
                createTag("wooden_crafting_tables");

        public static final TagKey<Item> WOODEN_BOOKSHELVES =
                createTag("wooden_bookshelves");

        public static final TagKey<Item> WOODEN_CARTOGRAPHY_TABLES =
                createTag("wooden_cartography_tables");

        public static final TagKey<Item> DRIFTWOOD_LOGS =
                createTag("driftwood_logs");

        public static final TagKey<Item> WET_DRIFTWOOD_LOGS =
                createTag("wet_driftwood_logs");

        public static final TagKey<Item> DRIED_DRIFTWOOD_LOGS =
                createTag("dried_driftwood_logs");

        public static final TagKey<Item> WOODEN_NOTE_BLOCKS =
                createTag("wooden_note_blocks");

        public static final TagKey<Item> DECO_LADDER =
                createTag("deco_ladder");

        public static final TagKey<Item> FURNACES =
                createTag("furnaces");

        public static final TagKey<Item> WOODEN_LOGS =
                createTag("wooden_logs");

        public static final TagKey<Item> METAL_BUTTONS =
                createTag("metal_buttons");

        public static final TagKey<Item> MOSAIC_WOOD =
                createTag("mosaic_wood");

        public static final TagKey<Item> MOSAIC_STAIRS =
                createTag("mosaic_stairs");

        public static final TagKey<Item> MOSAIC_SLABS =
                createTag("mosaic_slab");

        public static final TagKey<Item> WILDFLOWERS =
                createTag("wildflowers");

        public static final TagKey<Item> WATER_ITEMS =
                createTag("water_items");

        public static final TagKey<Item> MUSHROOMS =
                createTag("mushrooms");

        public static final TagKey<Item> GIANT_MUSHROOM_BLOCKS =
                createTag("giant_mushroom_blocks");

        public static final TagKey<Item> SOUL_GROUND_BLOCKS =
                createTag("soul_ground_blocks");

        public static final TagKey<Item> COLOURED_LAMPS =
                createTag("coloured_lamps");

        public static final TagKey<Item> IRON_CAP_STEM =
                createTag("iron_cap_stem");

        public static final TagKey<Item> LOG_STAIRS =
                createTag("log_stairs");

        public static final TagKey<Item> LOG_SLABS =
                createTag("log_slabs");

        public static final TagKey<Item> LOG_WALLS =
                createTag("log_walls");

        public static final TagKey<Item> SEEDS =
                createTag("seeds");

        private static TagKey<Item> createTag(String name){
            return TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, name));
        }
    }
}
