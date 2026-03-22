package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.util.DecoTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class DecoItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DecoItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        valueLookupBuilder(ItemTags.PLANKS)
                .add(DecoBlocks.CACTUS_PLANKS.asItem())
                .add(DecoBlocks.MUSHROOM_PLANKS.asItem())
                .add(DecoBlocks.IRON_CAP_PLANKS.asItem())
                .add(DecoBlocks.WOODEN_PLANKS.asItem())
                .add(DecoBlocks.DRIFTWOOD_PLANKS.asItem());

        valueLookupBuilder(ItemTags.WOODEN_STAIRS)
                .add(DecoBlocks.CACTUS_PLANK_STAIRS.asItem())
                .add(DecoBlocks.MUSHROOM_STAIRS.asItem())
                .add(DecoBlocks.IRON_CAP_STAIRS.asItem())
                .add(DecoBlocks.WOODEN_STAIRS.asItem())
                .add(DecoBlocks.DRIFTWOOD_STAIRS.asItem());

        valueLookupBuilder(ItemTags.WOODEN_SLABS)
                .add(DecoBlocks.CACTUS_PLANK_SLAB.asItem())
                .add(DecoBlocks.MUSHROOM_SLAB.asItem())
                .add(DecoBlocks.IRON_CAP_SLAB.asItem())
                .add(DecoBlocks.WOODEN_SLAB.asItem())
                .add(DecoBlocks.DRIFTWOOD_SLAB.asItem());

        valueLookupBuilder(ItemTags.WOODEN_FENCES)
                .add(DecoBlocks.CACTUS_PLANK_FENCE.asItem())
                .add(DecoBlocks.MUSHROOM_FENCE.asItem())
                .add(DecoBlocks.IRON_CAP_FENCE.asItem())
                .add(DecoBlocks.WOODEN_FENCE.asItem())
                .add(DecoBlocks.DRIFTWOOD_FENCE.asItem());

        valueLookupBuilder(ItemTags.WOODEN_BUTTONS)
                .add(DecoBlocks.CACTUS_PLANK_BUTTON.asItem())
                .add(DecoBlocks.MUSHROOM_BUTTON.asItem())
                .add(DecoBlocks.IRON_CAP_BUTTON.asItem())
                .add(DecoBlocks.WOODEN_BUTTON.asItem())
                .add(DecoBlocks.DRIFTWOOD_BUTTON.asItem());

        valueLookupBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE.asItem())
                .add(DecoBlocks.MUSHROOM_PRESSURE_PLATE.asItem())
                .add(DecoBlocks.IRON_CAP_PRESSURE_PLATE.asItem())
                .add(DecoBlocks.WOODEN_PRESSURE_PLATE.asItem())
                .add(DecoBlocks.DRIFTWOOD_PRESSURE_PLATE.asItem());

        valueLookupBuilder(ItemTags.STONE_BUTTONS)
                .add(DecoBlocks.POLISHED_DEEPSLATE_BUTTON.asItem())
                .add(DecoBlocks.DEEPSLATE_BUTTON.asItem())
                .add(DecoBlocks.COBBLED_DEEPSLATE_BUTTON.asItem())
                .add(DecoBlocks.COBBLESTONE_BUTTON.asItem())
                .add(DecoBlocks.BLACKSTONE_BUTTON.asItem())
                .add(DecoBlocks.POLISHED_STONE_BUTTON.asItem())
                .add(DecoBlocks.TUFF_BUTTON.asItem())
                .add(DecoBlocks.POLISHED_TUFF_BUTTON.asItem())
                .add(DecoBlocks.END_STONE_BUTTON.asItem())
                .add(DecoBlocks.POLISHED_END_STONE_BUTTON.asItem());

        valueLookupBuilder(DecoTags.Items.METAL_BUTTONS)
                .add(DecoBlocks.IRON_BUTTON.asItem())
                .add(DecoBlocks.GOLD_BUTTON.asItem())
                .add(DecoBlocks.COPPER_BUTTON.asItem())
                .add(DecoBlocks.EXPOSED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.WEATHERED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.OXIDIZED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.WAXED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.WAXED_EXPOSED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.WAXED_WEATHERED_COPPER_BUTTON.asItem())
                .add(DecoBlocks.WAXED_OXIDIZED_COPPER_BUTTON.asItem());

        valueLookupBuilder(ItemTags.BUTTONS)
                .addTag(DecoTags.Items.METAL_BUTTONS);

        valueLookupBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(DecoTags.Items.WOODEN_LOGS)
                .addTag(DecoTags.Items.DRIED_DRIFTWOOD_LOGS);

        valueLookupBuilder(ItemTags.LOGS)
                .addTag(DecoTags.Items.WET_DRIFTWOOD_LOGS);

        valueLookupBuilder(DecoTags.Items.DRIFTWOOD_LOGS)
                .addTag(DecoTags.Items.DRIED_DRIFTWOOD_LOGS)
                .addTag(DecoTags.Items.WET_DRIFTWOOD_LOGS);

        valueLookupBuilder(DecoTags.Items.WOODEN_LOGS)
                .add(DecoBlocks.WOODEN_LOG.asItem())
                .add(DecoBlocks.WOODEN_WOOD.asItem())
                .add(DecoBlocks.STRIPPED_WOODEN_LOG.asItem())
                .add(DecoBlocks.STRIPPED_WOODEN_WOOD.asItem());

        valueLookupBuilder(DecoTags.Items.WET_DRIFTWOOD_LOGS)
                .add(DecoBlocks.DRIFTWOOD_LOG.asItem())
                .add(DecoBlocks.DRIFTWOOD.asItem());

        valueLookupBuilder(DecoTags.Items.DRIED_DRIFTWOOD_LOGS)
                .add(DecoBlocks.DRIED_DRIFTWOOD_LOG.asItem())
                .add(DecoBlocks.DRIED_DRIFTWOOD.asItem())
                .add(DecoBlocks.STRIPPED_DRIFTWOOD_LOG.asItem())
                .add(DecoBlocks.STRIPPED_DRIFTWOOD.asItem());

        valueLookupBuilder(DecoTags.Items.IRON_CAP_STEM)
                .add(DecoBlocks.IRON_CAP_STEM.asItem())
                .add(DecoBlocks.IRON_CAP_HYPHAE.asItem())
                .add(DecoBlocks.STRIPPED_IRON_CAP_STEM.asItem())
                .add(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE.asItem());

        valueLookupBuilder(DecoTags.Items.LOG_STAIRS)
                .add(DecoBlocks.BIRCH_WOOD_STAIRS.asItem())
                .add(DecoBlocks.SPRUCE_WOOD_STAIRS.asItem())
                .add(DecoBlocks.JUNGLE_WOOD_STAIRS.asItem())
                .add(DecoBlocks.ACACIA_WOOD_STAIRS.asItem())
                .add(DecoBlocks.DARK_OAK_WOOD_STAIRS.asItem())
                .add(DecoBlocks.MANGROVE_WOOD_STAIRS.asItem())
                .add(DecoBlocks.OAK_WOOD_STAIRS.asItem())
                .add(DecoBlocks.WOODEN_WOOD_STAIRS.asItem());

        valueLookupBuilder(DecoTags.Items.LOG_SLABS)
                .add(DecoBlocks.BIRCH_WOOD_SLAB.asItem())
                .add(DecoBlocks.SPRUCE_WOOD_SLAB.asItem())
                .add(DecoBlocks.JUNGLE_WOOD_SLAB.asItem())
                .add(DecoBlocks.ACACIA_WOOD_SLAB.asItem())
                .add(DecoBlocks.DARK_OAK_WOOD_SLAB.asItem())
                .add(DecoBlocks.MANGROVE_WOOD_SLAB.asItem())
                .add(DecoBlocks.OAK_WOOD_SLAB.asItem())
                .add(DecoBlocks.WOODEN_WOOD_SLAB.asItem());

        valueLookupBuilder(DecoTags.Items.LOG_WALLS)
                .add(DecoBlocks.BIRCH_WOOD_WALL.asItem())
                .add(DecoBlocks.SPRUCE_WOOD_WALL.asItem())
                .add(DecoBlocks.JUNGLE_WOOD_WALL.asItem())
                .add(DecoBlocks.ACACIA_WOOD_WALL.asItem())
                .add(DecoBlocks.DARK_OAK_WOOD_WALL.asItem())
                .add(DecoBlocks.MANGROVE_WOOD_WALL.asItem())
                .add(DecoBlocks.OAK_WOOD_WALL.asItem())
                .add(DecoBlocks.WOODEN_WOOD_WALL.asItem());

        valueLookupBuilder(ItemTags.WOODEN_DOORS)
                .add(DecoBlocks.CACTUS_DOOR.asItem())
                .add(DecoBlocks.MUSHROOM_DOOR.asItem())
                .add(DecoBlocks.WOODEN_DOOR.asItem())
                .add(DecoBlocks.OAK_PALLET_DOOR.asItem())
                .add(DecoBlocks.SPRUCE_PALLET_DOOR.asItem())
                .add(DecoBlocks.BIRCH_PALLET_DOOR.asItem())
                .add(DecoBlocks.JUNGLE_PALLET_DOOR.asItem())
                .add(DecoBlocks.ACACIA_PALLET_DOOR.asItem())
                .add(DecoBlocks.DARK_OAK_PALLET_DOOR.asItem())
                .add(DecoBlocks.MANGROVE_PALLET_DOOR.asItem())
                .add(DecoBlocks.CACTUS_PALLET_DOOR.asItem())
                .add(DecoBlocks.MUSHROOM_PALLET_DOOR.asItem())
                .add(DecoBlocks.WOODEN_PALLET_DOOR.asItem())
                .add(DecoBlocks.CHERRY_PALLET_DOOR.asItem())
                .add(DecoBlocks.PALE_OAK_PALLET_DOOR.asItem())
                .add(DecoBlocks.DRIFTWOOD_PALLET_DOOR.asItem())
                .add(DecoBlocks.BAMBOO_PALLET_DOOR.asItem())
                .add(DecoBlocks.DRIFTWOOD_DOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(DecoBlocks.CACTUS_TRAPDOOR.asItem())
                .add(DecoBlocks.MUSHROOM_TRAPDOOR.asItem())
                .add(DecoBlocks.WOODEN_TRAPDOOR.asItem())
                .add(DecoBlocks.OAK_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.SPRUCE_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.BIRCH_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.JUNGLE_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.ACACIA_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.MANGROVE_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.CACTUS_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.WOODEN_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.CHERRY_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.PALE_OAK_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.DRIFTWOOD_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.BAMBOO_PALLET_TRAPDOOR.asItem())
                .add(DecoBlocks.DRIFTWOOD_TRAPDOOR.asItem());

        valueLookupBuilder(ItemTags.SAPLINGS)
                .add(DecoBlocks.WOODEN_SAPLING.asItem())
                .add(DecoBlocks.DRIFTWOOD_SAPLING.asItem());

        valueLookupBuilder(ItemTags.LEAVES)
                .add(DecoBlocks.WOODEN_LEAVES.asItem());

        valueLookupBuilder(DecoTags.Items.DECO_CRAFTING_TABLES)
                .add(Blocks.CRAFTING_TABLE.asItem())
                .add(DecoBlocks.CRIMSON_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.WARPED_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.IRON_CAP_CRAFTING_TABLE.asItem())
                .addTag(DecoTags.Items.WOODEN_CRAFTING_TABLES);

        valueLookupBuilder(DecoTags.Items.DECO_BOOKSHELVES)
                .add(DecoBlocks.CRIMSON_BOOKSHELF.asItem())
                .add(DecoBlocks.WARPED_BOOKSHELF.asItem())
                .add(DecoBlocks.IRON_CAP_BOOKSHELF.asItem())
                .addTag(DecoTags.Items.WOODEN_BOOKSHELVES);

        valueLookupBuilder(DecoTags.Items.DECO_BARRELS)
                .add(Blocks.BARREL.asItem())
                .add(DecoBlocks.CRIMSON_BARREL.asItem())
                .add(DecoBlocks.WARPED_BARREL.asItem())
                .add(DecoBlocks.IRON_CAP_BARREL.asItem())
                .addTag(DecoTags.Items.WOODEN_BARRELS);

        valueLookupBuilder(DecoTags.Items.DECO_CARTOGRAPHY_TABLES)
                .add(Blocks.CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.WARPED_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.IRON_CAP_CARTOGRAPHY_TABLE.asItem())
                .addTag(DecoTags.Items.WOODEN_CARTOGRAPHY_TABLES);

        valueLookupBuilder(DecoTags.Items.DECO_SMITHING_TABLES)
                .add(Blocks.SMITHING_TABLE.asItem())
                .add(DecoBlocks.CRIMSON_SMITHING_TABLE.asItem())
                .add(DecoBlocks.WARPED_SMITHING_TABLE.asItem())
                .add(DecoBlocks.IRON_CAP_SMITHING_TABLE.asItem())
                .addTag(DecoTags.Items.WOODEN_SMITHING_TABLES);

        valueLookupBuilder(DecoTags.Items.WOODEN_CRAFTING_TABLES)
                .add(DecoBlocks.BIRCH_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.JUNGLE_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.ACACIA_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.CACTUS_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.OAK_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.CHERRY_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.PALE_OAK_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.BAMBOO_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.MUSHROOM_CRAFTING_TABLE.asItem())
                .add(DecoBlocks.DRIFTWOOD_CRAFTING_TABLE.asItem());

        valueLookupBuilder(DecoTags.Items.DECO_LADDER)
                .add(Blocks.LADDER.asItem())
                .add(DecoBlocks.BIRCH_LADDER.asItem())
                .add(DecoBlocks.SPRUCE_LADDER.asItem())
                .add(DecoBlocks.JUNGLE_LADDER.asItem())
                .add(DecoBlocks.ACACIA_LADDER.asItem())
                .add(DecoBlocks.DARK_OAK_LADDER.asItem())
                .add(DecoBlocks.MANGROVE_LADDER.asItem())
                .add(DecoBlocks.CACTUS_LADDER.asItem())
                .add(DecoBlocks.WOODEN_LADDER.asItem())
                .add(DecoBlocks.MUSHROOM_LADDER.asItem())
                .add(DecoBlocks.IRON_CAP_LADDER.asItem())
                .add(DecoBlocks.BAMBOO_LADDER.asItem())
                .add(DecoBlocks.CHERRY_LADDER.asItem())
                .add(DecoBlocks.PALE_OAK_LADDER.asItem())
                .add(DecoBlocks.DRIFTWOOD_LADDER.asItem());

        valueLookupBuilder(DecoTags.Items.DECO_NOTE_BLOCKS)
                .add(Blocks.NOTE_BLOCK.asItem())
                .addTag(DecoTags.Items.WOODEN_NOTE_BLOCKS);

        valueLookupBuilder(DecoTags.Items.WOODEN_CARTOGRAPHY_TABLES)
                .add(DecoBlocks.OAK_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.BIRCH_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.ACACIA_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.CACTUS_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.CHERRY_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.BAMBOO_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.PALE_OAK_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.MUSHROOM_CARTOGRAPHY_TABLE.asItem())
                .add(DecoBlocks.DRIFTWOOD_CARTOGRAPHY_TABLE.asItem());

        valueLookupBuilder(DecoTags.Items.WOODEN_BOOKSHELVES)
                .add(Blocks.BOOKSHELF.asItem())
                .add(DecoBlocks.BIRCH_BOOKSHELF.asItem())
                .add(DecoBlocks.SPRUCE_BOOKSHELF.asItem())
                .add(DecoBlocks.JUNGLE_BOOKSHELF.asItem())
                .add(DecoBlocks.ACACIA_BOOKSHELF.asItem())
                .add(DecoBlocks.DARK_OAK_BOOKSHELF.asItem())
                .add(DecoBlocks.MANGROVE_BOOKSHELF.asItem())
                .add(DecoBlocks.CACTUS_BOOKSHELF.asItem())
                .add(DecoBlocks.OAK_BOOKSHELF.asItem())
                .add(DecoBlocks.BAMBOO_BOOKSHELF.asItem())
                .add(DecoBlocks.CHERRY_BOOKSHELF.asItem())
                .add(DecoBlocks.PALE_OAK_BOOKSHELF.asItem())
                .add(DecoBlocks.MUSHROOM_BOOKSHELF.asItem())
                .add(DecoBlocks.DRIFTWOOD_BOOKSHELF.asItem());

        valueLookupBuilder(DecoTags.Items.DECO_BOOKSHELF_STAIRS)
                .forceAddTag(DecoTags.Items.WOODEN_BOOKSHELF_STAIRS)
                .add(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.WARPED_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.IRON_CAP_BOOKSHELF_STAIRS.asItem());

        valueLookupBuilder(DecoTags.Items.WOODEN_BOOKSHELF_STAIRS)
                .add(DecoBlocks.BIRCH_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.ACACIA_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.CACTUS_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.OAK_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.CHERRY_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.PALE_OAK_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.DRIFTWOOD_BOOKSHELF_STAIRS.asItem())
                .add(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS.asItem());

        valueLookupBuilder(DecoTags.Items.DECO_BOOKSHELF_SLABS)
                .forceAddTag(DecoTags.Items.WOODEN_BOOKSHELF_SLABS)
                .add(DecoBlocks.CRIMSON_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.WARPED_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.IRON_CAP_BOOKSHELF_SLAB.asItem());

        valueLookupBuilder(DecoTags.Items.WOODEN_BOOKSHELF_SLABS)
                .add(DecoBlocks.BIRCH_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.SPRUCE_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.JUNGLE_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.ACACIA_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.DARK_OAK_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.MANGROVE_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.CACTUS_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.OAK_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.BAMBOO_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.CHERRY_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.PALE_OAK_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.DRIFTWOOD_BOOKSHELF_SLAB.asItem())
                .add(DecoBlocks.MUSHROOM_BOOKSHELF_SLAB.asItem());

        valueLookupBuilder(DecoTags.Items.WOODEN_SMITHING_TABLES)
                .add(DecoBlocks.OAK_SMITHING_TABLE.asItem())
                .add(DecoBlocks.SPRUCE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.BIRCH_SMITHING_TABLE.asItem())
                .add(DecoBlocks.ACACIA_SMITHING_TABLE.asItem())
                .add(DecoBlocks.DARK_OAK_SMITHING_TABLE.asItem())
                .add(DecoBlocks.MANGROVE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.JUNGLE_SMITHING_TABLE.asItem())
                .add(DecoBlocks.CACTUS_SMITHING_TABLE.asItem())
                .add(DecoBlocks.BAMBOO_SMITHING_TABLE.asItem())
                .add(DecoBlocks.CHERRY_SMITHING_TABLE.asItem())
                .add(DecoBlocks.PALE_OAK_SMITHING_TABLE.asItem())
                .add(DecoBlocks.MUSHROOM_SMITHING_TABLE.asItem())
                .add(DecoBlocks.DRIFTWOOD_SMITHING_TABLE.asItem());

        valueLookupBuilder(DecoTags.Items.WOODEN_BARRELS)
                .add(DecoBlocks.OAK_BARREL.asItem())
                .add(DecoBlocks.SPRUCE_BARREL.asItem())
                .add(DecoBlocks.BIRCH_BARREL.asItem())
                .add(DecoBlocks.JUNGLE_BARREL.asItem())
                .add(DecoBlocks.ACACIA_BARREL.asItem())
                .add(DecoBlocks.DARK_OAK_BARREL.asItem())
                .add(DecoBlocks.MANGROVE_BARREL.asItem())
                .add(DecoBlocks.MUSHROOM_BARREL.asItem())
                .add(DecoBlocks.CACTUS_BARREL.asItem())
                .add(DecoBlocks.CHERRY_BARREL.asItem())
                .add(DecoBlocks.BAMBOO_BARREL.asItem())
                .add(DecoBlocks.PALE_OAK_BARREL.asItem())
                .add(DecoBlocks.DRIFTWOOD_BARREL.asItem());

        valueLookupBuilder(DecoTags.Items.WOODEN_NOTE_BLOCKS)
                .add(DecoBlocks.MUSHROOM_NOTE_BLOCK.asItem())
                .add(DecoBlocks.OAK_NOTE_BLOCK.asItem())
                .add(DecoBlocks.SPRUCE_NOTE_BLOCK.asItem())
                .add(DecoBlocks.BIRCH_NOTE_BLOCK.asItem())
                .add(DecoBlocks.JUNGLE_NOTE_BLOCK.asItem())
                .add(DecoBlocks.DARK_OAK_NOTE_BLOCK.asItem())
                .add(DecoBlocks.ACACIA_NOTE_BLOCK.asItem())
                .add(DecoBlocks.MANGROVE_NOTE_BLOCK.asItem())
                .add(DecoBlocks.CRIMSON_NOTE_BLOCK.asItem())
                .add(DecoBlocks.WARPED_NOTE_BLOCK.asItem())
                .add(DecoBlocks.CACTUS_NOTE_BLOCK.asItem())
                .add(DecoBlocks.CHERRY_NOTE_BLOCK.asItem())
                .add(DecoBlocks.BAMBOO_NOTE_BLOCK.asItem())
                .add(DecoBlocks.PALE_OAK_NOTE_BLOCK.asItem())
                .add(DecoBlocks.DRIFTWOOD_NOTE_BLOCK.asItem())
                .add(DecoBlocks.IRON_CAP_NOTE_BLOCK.asItem());

        valueLookupBuilder(DecoTags.Items.FURNACES)
                .add(Items.FURNACE.asItem())
                .add(DecoBlocks.DEEPSLATE_FURNACE.asItem())
                .add(DecoBlocks.BLACKSTONE_FURNACE.asItem())
                .add(DecoBlocks.TUFF_FURNACE.asItem())
                .add(DecoBlocks.END_STONE_FURNACE.asItem());

        valueLookupBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(Blocks.STONE.asItem())
                .add(Blocks.DEEPSLATE.asItem())
                .add(Blocks.END_STONE.asItem())
                .add(Blocks.TUFF.asItem());

        valueLookupBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(Blocks.STONE.asItem())
                .add(Blocks.DEEPSLATE.asItem())
                .add(Blocks.TUFF.asItem())
                .add(Blocks.END_STONE.asItem());

        valueLookupBuilder(ItemTags.BOATS)
                .add(DecoItems.CACTUS_BOAT)
                .add(DecoItems.WOODEN_BOAT)
                .add(DecoItems.CRIMSON_BOAT)
                .add(DecoItems.WARPED_BOAT)
                .add(DecoItems.DRIFTWOOD_RAFT);

        valueLookupBuilder(ItemTags.CHEST_BOATS)
                .add(DecoItems.CACTUS_CHEST_BOAT)
                .add(DecoItems.WOODEN_CHEST_BOAT)
                .add(DecoItems.CRIMSON_CHEST_BOAT)
                .add(DecoItems.WARPED_CHEST_BOAT)
                .add(DecoItems.DRIFTWOOD_CHEST_RAFT);

        valueLookupBuilder(DecoTags.Items.MOSAIC_WOOD)
                .add(DecoBlocks.OAK_MOSAIC.asItem())
                .add(DecoBlocks.BIRCH_MOSAIC.asItem())
                .add(DecoBlocks.SPRUCE_MOSAIC.asItem())
                .add(DecoBlocks.JUNGLE_MOSAIC.asItem())
                .add(DecoBlocks.ACACIA_MOSAIC.asItem())
                .add(DecoBlocks.DARK_OAK_MOSAIC.asItem())
                .add(DecoBlocks.MANGROVE_MOSAIC.asItem())
                .add(DecoBlocks.CHERRY_MOSAIC.asItem())
                .add(DecoBlocks.CACTUS_MOSAIC.asItem())
                .add(DecoBlocks.WOODEN_MOSAIC.asItem())
                .add(DecoBlocks.PALE_OAK_MOSAIC.asItem())
                .add(DecoBlocks.MUSHROOM_MOSAIC.asItem())
                .add(DecoBlocks.DRIFTWOOD_MOSAIC.asItem());

        valueLookupBuilder(DecoTags.Items.MOSAIC_STAIRS)
                .add(DecoBlocks.OAK_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.BIRCH_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.SPRUCE_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.JUNGLE_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.ACACIA_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.DARK_OAK_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.MANGROVE_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.CHERRY_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.CACTUS_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.WOODEN_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.PALE_OAK_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.DRIFTWOOD_MOSAIC_STAIRS.asItem())
                .add(DecoBlocks.MUSHROOM_MOSAIC_STAIRS.asItem());

        valueLookupBuilder(DecoTags.Items.MOSAIC_SLABS)
                .add(DecoBlocks.OAK_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.BIRCH_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.SPRUCE_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.JUNGLE_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.ACACIA_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.DARK_OAK_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.MANGROVE_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.CHERRY_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.CACTUS_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.WOODEN_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.PALE_OAK_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.MUSHROOM_MOSAIC_SLAB.asItem())
                .add(DecoBlocks.DRIFTWOOD_MOSAIC_SLAB.asItem());

        valueLookupBuilder(ItemTags.SMALL_FLOWERS)
                .add(DecoBlocks.YELLOW_TULIP.asItem())
                .add(DecoBlocks.PURPLE_TULIP.asItem())
                .add(DecoBlocks.MAGENTA_TULIP.asItem())
                .add(DecoBlocks.BLUE_TULIP.asItem())
                .add(DecoBlocks.BLACK_TULIP.asItem())
                .add(DecoBlocks.GREEN_TULIP.asItem())
                .add(DecoBlocks.CYAN_TULIP.asItem())
                .add(DecoBlocks.BARBERTON_DAISY.asItem())
                .add(DecoBlocks.BLUE_EYED_DAISY.asItem())
                .add(DecoBlocks.GERBERA_DAISY.asItem())
                .add(DecoBlocks.MICHAELMAS_DAISY.asItem())
                .add(DecoBlocks.PUFFY_DANDELION.asItem())
                .add(DecoBlocks.CALIFORNIA_POPPY.asItem())
                .add(DecoBlocks.SALMON_POPPY.asItem())
                .add(DecoBlocks.YELLOW_ORCHID.asItem())
                .add(DecoBlocks.WHITE_ORCHID.asItem())
                .add(DecoBlocks.PINK_ORCHID.asItem())
                .add(DecoBlocks.ROSE.asItem())
                .add(DecoBlocks.ENDER_ROSE.asItem())
                .add(DecoBlocks.PAEONIA.asItem())
                .add(DecoBlocks.LAVENDER.asItem())
                .add(DecoBlocks.ANCIENT_ROSE.asItem())
                .add(DecoBlocks.BLUE_HIBISCUS.asItem())
                .add(DecoBlocks.BROMELIAD.asItem())
                .add(DecoBlocks.NIGHTSHADE.asItem())
                .add(DecoBlocks.ENDERSHADE.asItem())
                .add(DecoBlocks.BUTTERCUP.asItem())
                .add(DecoBlocks.ALPINE_POPPY.asItem())
                .add(DecoBlocks.POPPED_BLUET.asItem())
                .add(DecoBlocks.DEAD_EYE_DAISY.asItem())
                .add(DecoBlocks.HAZZY_BLUET.asItem())
                .add(DecoBlocks.DRILL_LAVENDER.asItem());

        valueLookupBuilder(DecoTags.Items.WATER_ITEMS)
                .add(Items.WATER_BUCKET)
                .add(DecoItems.BUBBLE_ORB);

        valueLookupBuilder(DecoTags.Items.MUSHROOMS)
                .add(Items.RED_MUSHROOM.asItem())
                .add(Items.BROWN_MUSHROOM.asItem());

        valueLookupBuilder(DecoTags.Items.GIANT_MUSHROOM_BLOCKS)
                .add(Items.RED_MUSHROOM_BLOCK.asItem())
                .add(Items.BROWN_MUSHROOM_BLOCK.asItem());

        valueLookupBuilder(DecoTags.Items.SOUL_GROUND_BLOCKS)
                .add(Items.SOUL_SAND.asItem())
                .add(Items.SOUL_SOIL.asItem());

        valueLookupBuilder(DecoTags.Items.COLOURED_LAMPS)
                .add(DecoBlocks.WHITE_LAMP.asItem())
                .add(DecoBlocks.LIGHT_GRAY_LAMP.asItem())
                .add(DecoBlocks.GRAY_LAMP.asItem())
                .add(DecoBlocks.BLACK_LAMP.asItem())
                .add(DecoBlocks.BROWN_LAMP.asItem())
                .add(DecoBlocks.RED_LAMP.asItem())
                .add(DecoBlocks.ORANGE_LAMP.asItem())
                .add(DecoBlocks.YELLOW_LAMP.asItem())
                .add(DecoBlocks.LIME_LAMP.asItem())
                .add(DecoBlocks.GREEN_LAMP.asItem())
                .add(DecoBlocks.CYAN_LAMP.asItem())
                .add(DecoBlocks.LIGHT_BLUE_LAMP.asItem())
                .add(DecoBlocks.BLUE_LAMP.asItem())
                .add(DecoBlocks.PURPLE_LAMP.asItem())
                .add(DecoBlocks.MAGENTA_LAMP.asItem())
                .add(DecoBlocks.PINK_LAMP.asItem());

        valueLookupBuilder(DecoTags.Items.SEEDS)
                .add(Items.WHEAT_SEEDS.asItem())
                .add(Items.BEETROOT_SEEDS.asItem())
                .add(Items.PUMPKIN_SEEDS.asItem())
                .add(Items.MELON_SEEDS.asItem())
                .add(Items.TORCHFLOWER_SEEDS.asItem())
                .add(Items.PITCHER_POD.asItem())
                .add(DecoItems.ANCIENT_ROSE_SEEDS.asItem());

        valueLookupBuilder(DecoTags.Items.WILDFLOWERS)
                .add(Items.WILDFLOWERS)
                .add(DecoBlocks.ROUGE_WILDFLOWERS.asItem())
                .add(DecoBlocks.SWEET_WILDFLOWERS.asItem())
                .add(DecoBlocks.GECKO_WILDFLOWERS.asItem());
    }
}
