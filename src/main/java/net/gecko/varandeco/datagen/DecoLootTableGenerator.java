package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.IntRange;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.LimitCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;


public class DecoLootTableGenerator extends FabricBlockLootSubProvider {

    protected DecoLootTableGenerator(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        HolderLookup.RegistryLookup<Enchantment> impl = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        dropSelf(DecoBlocks.POLISHED_STONE);
        dropSelf(DecoBlocks.POLISHED_STONE_STAIRS);
        add(DecoBlocks.POLISHED_STONE_SLAB, createSlabItemTable(DecoBlocks.POLISHED_STONE_SLAB));
        dropSelf(DecoBlocks.POLISHED_STONE_WALL);

        dropSelf(DecoBlocks.STONE_WALL);
        dropSelf(DecoBlocks.POLISHED_ANDESITE_WALL);
        dropSelf(DecoBlocks.POLISHED_DIORITE_WALL);
        dropSelf(DecoBlocks.POLISHED_GRANITE_WALL);

        dropSelf(DecoBlocks.SMOOTH_STONE_STAIRS);
        dropSelf(DecoBlocks.SMOOTH_STONE_WALL);

        dropSelf(DecoBlocks.DRIPSTONE_STAIRS);
        add(DecoBlocks.DRIPSTONE_SLAB, createSlabItemTable(DecoBlocks.DRIPSTONE_SLAB));
        dropSelf(DecoBlocks.DRIPSTONE_WALL);
        dropSelf(DecoBlocks.CALCITE_STAIRS);
        add(DecoBlocks.CALCITE_SLAB, createSlabItemTable(DecoBlocks.CALCITE_SLAB));
        dropSelf(DecoBlocks.CALCITE_WALL);

        dropSelf(DecoBlocks.STONE_TILES);
        dropSelf(DecoBlocks.STONE_TILE_STAIRS);
        add(DecoBlocks.STONE_TILE_SLAB, createSlabItemTable(DecoBlocks.STONE_TILE_SLAB));
        dropSelf(DecoBlocks.STONE_TILE_WALL);
        dropSelf(DecoBlocks.CRACKED_STONE_TILES);

        dropSelf(DecoBlocks.TUFF_TILES);
        dropSelf(DecoBlocks.TUFF_TILE_STAIRS);
        add(DecoBlocks.TUFF_TILE_SLAB, createSlabItemTable(DecoBlocks.TUFF_TILE_SLAB));
        dropSelf(DecoBlocks.TUFF_TILE_WALL);

        dropSelf(DecoBlocks.PACKED_MUD_STAIRS);
        add(DecoBlocks.PACKED_MUD_SLAB, createSlabItemTable(DecoBlocks.PACKED_MUD_SLAB));
        dropSelf(DecoBlocks.PACKED_MUD_WALL);

        dropSelf(DecoBlocks.RED_NETHER_BRICK_FENCE);
        dropSelf(DecoBlocks.NETHER_BRICK_FENCE_GATE);
        dropSelf(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE);

        dropSelf(DecoBlocks.NETHERRACK_STAIRS);
        add(DecoBlocks.NETHERRACK_SLAB, createSlabItemTable(DecoBlocks.NETHERRACK_SLAB));
        dropSelf(DecoBlocks.NETHERRACK_WALL);

        dropSelf(DecoBlocks.MAGMA_STAIRS);
        add(DecoBlocks.MAGMA_SLAB, createSlabItemTable(DecoBlocks.MAGMA_SLAB));
        dropSelf(DecoBlocks.MAGMA_WALL);

        dropSelf(DecoBlocks.MAGMA_BRICKS);
        dropSelf(DecoBlocks.CHISELED_MAGMA_BRICKS);
        dropSelf(DecoBlocks.MAGMA_BRICK_STAIRS);
        add(DecoBlocks.MAGMA_BRICK_SLAB, createSlabItemTable(DecoBlocks.MAGMA_BRICK_SLAB));
        dropSelf(DecoBlocks.MAGMA_BRICK_WALL);

        dropSelf(DecoBlocks.POLISHED_BLACKSTONE_TILES);
        dropSelf(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        add(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, createSlabItemTable(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB));
        dropSelf(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL);
        dropSelf(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);

        dropWhenSilkTouch(DecoBlocks.POLISHED_GLIDED_BLACKSTONE);
        dropWhenSilkTouch(DecoBlocks.CHISELED_GLIDED_BLACKSTONE);

        dropSelf(DecoBlocks.SNOW_STAIRS);
        add(DecoBlocks.SNOW_SLAB, createSlabItemTable(DecoBlocks.SNOW_SLAB));
        dropSelf(DecoBlocks.SNOW_WALL);

        dropSelf(DecoBlocks.PACKED_ICE_STAIRS);
        add(DecoBlocks.PACKED_ICE_SLAB, createSlabItemTable(DecoBlocks.PACKED_ICE_SLAB));
        dropSelf(DecoBlocks.PACKED_ICE_WALL);

        dropSelf(DecoBlocks.BLUE_ICE_STAIRS);
        add(DecoBlocks.BLUE_ICE_SLAB, createSlabItemTable(DecoBlocks.BLUE_ICE_SLAB));
        dropSelf(DecoBlocks.BLUE_ICE_WALL);

        add(DecoBlocks.SNOW_BRICKS, block -> this.createSingleItemTableWithSilkTouch(block, DecoItems.SNOW_BRICK, ConstantValue.exactly(4.0F)));
        add(DecoBlocks.CHISELED_SNOW_BRICKS, block -> this.createSingleItemTableWithSilkTouch(block, DecoItems.SNOW_BRICK, ConstantValue.exactly(8.0F)));
        dropSelf(DecoBlocks.SNOW_BRICK_STAIRS);
        add(DecoBlocks.SNOW_BRICK_SLAB, createSlabItemTable(DecoBlocks.SNOW_BRICK_SLAB));
        dropSelf(DecoBlocks.SNOW_BRICK_WALL);

        dropSelf(DecoBlocks.ICE_BRICKS);
        dropSelf(DecoBlocks.ICE_BRICK_STAIRS);
        add(DecoBlocks.ICE_BRICK_SLAB, createSlabItemTable(DecoBlocks.ICE_BRICK_SLAB));
        dropSelf(DecoBlocks.ICE_BRICK_WALL);

        dropWhenSilkTouch(DecoBlocks.BLACK_ICE);

        dropSelf(DecoBlocks.CUT_SANDSTONE_STAIRS);
        dropSelf(DecoBlocks.CUT_SANDSTONE_WALL);

        dropSelf(DecoBlocks.CUT_RED_SANDSTONE_STAIRS);
        dropSelf(DecoBlocks.CUT_RED_SANDSTONE_WALL);

        dropSelf(DecoBlocks.SMOOTH_SANDSTONE_WALL);
        dropSelf(DecoBlocks.SMOOTH_RED_SANDSTONE_WALL);

        dropSelf(DecoBlocks.CUT_SANDSTONE_BRICKS);
        dropSelf(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS);
        add(DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.CUT_SANDSTONE_BRICK_SLAB));
        dropSelf(DecoBlocks.CUT_SANDSTONE_BRICK_WALL);

        dropSelf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        dropSelf(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS);
        add(DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB));
        dropSelf(DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL);

        dropSelf(DecoBlocks.CACTUS_PLANKS);
        dropSelf(DecoBlocks.CACTUS_PLANK_STAIRS);
        add(DecoBlocks.CACTUS_PLANK_SLAB, createSlabItemTable(DecoBlocks.CACTUS_PLANK_SLAB));
        dropSelf(DecoBlocks.CACTUS_PLANK_FENCE);
        dropSelf(DecoBlocks.CACTUS_PLANK_FENCE_GATE);
        dropSelf(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE);
        dropSelf(DecoBlocks.CACTUS_PLANK_BUTTON);

        add(DecoBlocks.CACTUS_DOOR, createDoorTable(DecoBlocks.CACTUS_DOOR));
        dropSelf(DecoBlocks.CACTUS_TRAPDOOR);

        dropSelf(DecoBlocks.STANDING_CACTUS_SIGN);

        dropSelf(DecoBlocks.PRISMARINE_BRICK_WALL);
        dropSelf(DecoBlocks.DARK_PRISMARINE_WALL);

        dropSelf(DecoBlocks.CRYSTALLIZED_PRISMARINE);
        dropSelf(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS);
        add(DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, createSlabItemTable(DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB));
        dropSelf(DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL);

        dropSelf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        dropSelf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS);
        add(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, createSlabItemTable(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB));
        dropSelf(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL);

        dropSelf(DecoBlocks.LIGHT_PRISMARINE);
        dropSelf(DecoBlocks.LIGHT_PRISMARINE_STAIRS);
        add(DecoBlocks.LIGHT_PRISMARINE_SLAB, createSlabItemTable(DecoBlocks.LIGHT_PRISMARINE_SLAB));
        dropSelf(DecoBlocks.LIGHT_PRISMARINE_WALL);

        dropSelf(DecoBlocks.CHISELED_PRISMARINE_BRICKS);
        dropSelf(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS);

        add(DecoBlocks.BUBBLE_BLOCK, block -> this.createSingleItemTableWithSilkTouch(block, DecoItems.BUBBLE_ORB, ConstantValue.exactly(2.0F)));
        dropSelf(DecoBlocks.BUBBLE_STAIRS);
        add(DecoBlocks.BUBBLE_SLAB, createSlabItemTable(DecoBlocks.BUBBLE_SLAB));
        dropSelf(DecoBlocks.BUBBLE_WALL);

        dropSelf(DecoBlocks.BUBBLE_BRICKS);
        dropSelf(DecoBlocks.BUBBLE_BRICK_STAIRS);
        add(DecoBlocks.BUBBLE_BRICK_SLAB, createSlabItemTable(DecoBlocks.BUBBLE_BRICK_SLAB));
        dropSelf(DecoBlocks.BUBBLE_BRICK_WALL);
        dropSelf(DecoBlocks.CHISELED_BUBBLE_BRICKS);

        dropSelf(DecoBlocks.SOUL_SOILSTONE);
        dropSelf(DecoBlocks.SOUL_SOILSTONE_STAIRS);
        add(DecoBlocks.SOUL_SOILSTONE_SLAB, createSlabItemTable(DecoBlocks.SOUL_SOILSTONE_SLAB));
        dropSelf(DecoBlocks.SOUL_SOILSTONE_WALL);

        dropSelf(DecoBlocks.CUT_SOUL_SOILSTONE);
        dropSelf(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS);
        add(DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, createSlabItemTable(DecoBlocks.CUT_SOUL_SOILSTONE_SLAB));
        dropSelf(DecoBlocks.CUT_SOUL_SOILSTONE_WALL);

        dropSelf(DecoBlocks.CHISELED_SOUL_SOILSTONE);

        dropSelf(DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        dropSelf(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS);
        add(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, createSlabItemTable(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB));
        dropSelf(DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL);

        dropSelf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        dropSelf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS);
        add(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB));
        dropSelf(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL);

        dropSelf(DecoBlocks.QUARTZ_WALL);
        dropSelf(DecoBlocks.SMOOTH_QUARTZ_WALL);

        dropSelf(DecoBlocks.QUARTZ_BRICK_STAIRS);
        add(DecoBlocks.QUARTZ_BRICK_SLAB, createSlabItemTable(DecoBlocks.QUARTZ_BRICK_SLAB));
        dropSelf(DecoBlocks.QUARTZ_BRICK_WALL);

        dropSelf(DecoBlocks.CUT_QUARTZ);
        dropSelf(DecoBlocks.CUT_QUARTZ_STAIRS);
        add(DecoBlocks.CUT_QUARTZ_SLAB, createSlabItemTable(DecoBlocks.CUT_QUARTZ_SLAB));
        dropSelf(DecoBlocks.CUT_QUARTZ_WALL);

        dropSelf(DecoBlocks.CHISELED_RED_NETHER_BRICKS);
        dropSelf(DecoBlocks.CRACKED_RED_NETHER_BRICKS);

        dropSelf(DecoBlocks.BLUE_NETHER_BRICKS);
        dropSelf(DecoBlocks.BLUE_NETHER_BRICK_STAIRS);
        add(DecoBlocks.BLUE_NETHER_BRICK_SLAB, createSlabItemTable(DecoBlocks.BLUE_NETHER_BRICK_SLAB));
        dropSelf(DecoBlocks.BLUE_NETHER_BRICK_WALL);
        dropSelf(DecoBlocks.BLUE_NETHER_BRICK_FENCE);
        dropSelf(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE);

        dropSelf(DecoBlocks.CHISELED_BLUE_NETHER_BRICKS);
        dropSelf(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);

        dropSelf(DecoBlocks.BIRCH_CRAFTING_TABLE);
        dropSelf(DecoBlocks.SPRUCE_CRAFTING_TABLE);
        dropSelf(DecoBlocks.JUNGLE_CRAFTING_TABLE);
        dropSelf(DecoBlocks.ACACIA_CRAFTING_TABLE);
        dropSelf(DecoBlocks.DARK_OAK_CRAFTING_TABLE);
        dropSelf(DecoBlocks.PALE_OAK_CRAFTING_TABLE);
        dropSelf(DecoBlocks.MANGROVE_CRAFTING_TABLE);
        dropSelf(DecoBlocks.CRIMSON_CRAFTING_TABLE);
        dropSelf(DecoBlocks.WARPED_CRAFTING_TABLE);
        dropSelf(DecoBlocks.CACTUS_CRAFTING_TABLE);
        dropSelf(DecoBlocks.BAMBOO_CRAFTING_TABLE);
        dropSelf(DecoBlocks.CHERRY_CRAFTING_TABLE);
        dropSelf(DecoBlocks.DRIFTWOOD_CRAFTING_TABLE);

        dropSelf(DecoBlocks.OAK_BARREL);
        dropSelf(DecoBlocks.SPRUCE_BARREL);
        dropSelf(DecoBlocks.BIRCH_BARREL);
        dropSelf(DecoBlocks.JUNGLE_BARREL);
        dropSelf(DecoBlocks.ACACIA_BARREL);
        dropSelf(DecoBlocks.DARK_OAK_BARREL);
        dropSelf(DecoBlocks.PALE_OAK_BARREL);
        dropSelf(DecoBlocks.MANGROVE_BARREL);
        dropSelf(DecoBlocks.CRIMSON_BARREL);
        dropSelf(DecoBlocks.WARPED_BARREL);
        dropSelf(DecoBlocks.CACTUS_BARREL);
        dropSelf(DecoBlocks.BAMBOO_BARREL);
        dropSelf(DecoBlocks.CHERRY_BARREL);
        dropSelf(DecoBlocks.DRIFTWOOD_BARREL);

        dropSelf(DecoBlocks.BIRCH_LADDER);
        dropSelf(DecoBlocks.SPRUCE_LADDER);
        dropSelf(DecoBlocks.JUNGLE_LADDER);
        dropSelf(DecoBlocks.ACACIA_LADDER);
        dropSelf(DecoBlocks.DARK_OAK_LADDER);
        dropSelf(DecoBlocks.PALE_OAK_LADDER);
        dropSelf(DecoBlocks.MANGROVE_LADDER);
        dropSelf(DecoBlocks.CRIMSON_LADDER);
        dropSelf(DecoBlocks.WARPED_LADDER);
        dropSelf(DecoBlocks.CACTUS_LADDER);
        dropSelf(DecoBlocks.BAMBOO_LADDER);
        dropSelf(DecoBlocks.CHERRY_LADDER);
        dropSelf(DecoBlocks.DRIFTWOOD_LADDER);

        add(DecoBlocks.BIRCH_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.SPRUCE_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.JUNGLE_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.ACACIA_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.DARK_OAK_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.PALE_OAK_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.MANGROVE_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.CRIMSON_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.WARPED_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.CACTUS_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.BAMBOO_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.CHERRY_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        add(DecoBlocks.DRIFTWOOD_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));

        dropSelf(DecoBlocks.OAK_MOSAIC);
        dropSelf(DecoBlocks.BIRCH_MOSAIC);
        dropSelf(DecoBlocks.SPRUCE_MOSAIC);
        dropSelf(DecoBlocks.JUNGLE_MOSAIC);
        dropSelf(DecoBlocks.ACACIA_MOSAIC);
        dropSelf(DecoBlocks.DARK_OAK_MOSAIC);
        dropSelf(DecoBlocks.MANGROVE_MOSAIC);
        dropSelf(DecoBlocks.CHERRY_MOSAIC);
        dropSelf(DecoBlocks.CRIMSON_MOSAIC);
        dropSelf(DecoBlocks.WARPED_MOSAIC);
        dropSelf(DecoBlocks.CACTUS_MOSAIC);
        dropSelf(DecoBlocks.WOODEN_MOSAIC);
        dropSelf(DecoBlocks.PALE_OAK_MOSAIC);
        dropSelf(DecoBlocks.DRIFTWOOD_MOSAIC);

        dropSelf(DecoBlocks.OAK_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.BIRCH_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.SPRUCE_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.JUNGLE_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.ACACIA_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.DARK_OAK_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.MANGROVE_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.CHERRY_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.CRIMSON_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.WARPED_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.CACTUS_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.WOODEN_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.PALE_OAK_MOSAIC_STAIRS);
        dropSelf(DecoBlocks.DRIFTWOOD_MOSAIC_STAIRS);

        add(DecoBlocks.OAK_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.OAK_MOSAIC_SLAB));
        add(DecoBlocks.BIRCH_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.BIRCH_MOSAIC_SLAB));
        add(DecoBlocks.SPRUCE_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.SPRUCE_MOSAIC_SLAB));
        add(DecoBlocks.JUNGLE_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.JUNGLE_MOSAIC_SLAB));
        add(DecoBlocks.ACACIA_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.ACACIA_MOSAIC_SLAB));
        add(DecoBlocks.DARK_OAK_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.DARK_OAK_MOSAIC_SLAB));
        add(DecoBlocks.MANGROVE_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.MANGROVE_MOSAIC_SLAB));
        add(DecoBlocks.CHERRY_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.CHERRY_MOSAIC_SLAB));
        add(DecoBlocks.CRIMSON_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.CRIMSON_MOSAIC_SLAB));
        add(DecoBlocks.WARPED_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.WARPED_MOSAIC_SLAB));
        add(DecoBlocks.CACTUS_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.CACTUS_MOSAIC_SLAB));
        add(DecoBlocks.WOODEN_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.WOODEN_MOSAIC_SLAB));
        add(DecoBlocks.PALE_OAK_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.PALE_OAK_MOSAIC_SLAB));
        add(DecoBlocks.DRIFTWOOD_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.DRIFTWOOD_MOSAIC_SLAB));

        dropSelf(DecoBlocks.OAK_SMITHING_TABLE);
        dropSelf(DecoBlocks.SPRUCE_SMITHING_TABLE);
        dropSelf(DecoBlocks.BIRCH_SMITHING_TABLE);
        dropSelf(DecoBlocks.JUNGLE_SMITHING_TABLE);
        dropSelf(DecoBlocks.ACACIA_SMITHING_TABLE);
        dropSelf(DecoBlocks.DARK_OAK_SMITHING_TABLE);
        dropSelf(DecoBlocks.PALE_OAK_SMITHING_TABLE);
        dropSelf(DecoBlocks.MANGROVE_SMITHING_TABLE);
        dropSelf(DecoBlocks.CRIMSON_SMITHING_TABLE);
        dropSelf(DecoBlocks.WARPED_SMITHING_TABLE);
        dropSelf(DecoBlocks.CACTUS_SMITHING_TABLE);
        dropSelf(DecoBlocks.CHERRY_SMITHING_TABLE);
        dropSelf(DecoBlocks.BAMBOO_SMITHING_TABLE);
        dropSelf(DecoBlocks.DRIFTWOOD_SMITHING_TABLE);

        dropSelf(DecoBlocks.OAK_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.BIRCH_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.ACACIA_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.PALE_OAK_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.WARPED_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.CACTUS_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.BAMBOO_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.CHERRY_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.DRIFTWOOD_CARTOGRAPHY_TABLE);

        dropSelf(DecoBlocks.STANDING_STRIPPED_OAK_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_SPRUCE_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_BIRCH_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_JUNGLE_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_ACACIA_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_DARK_OAK_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_CHERRY_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_MANGROVE_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_CRIMSON_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_WARPED_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_WOODEN_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_PALE_OAK_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_DRIFTWOOD_SIGN);

        dropSelf(DecoBlocks.STANDING_OAK_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_SPRUCE_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_BIRCH_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_JUNGLE_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_ACACIA_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_DARK_OAK_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_CHERRY_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_MANGROVE_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_BAMBOO_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_CRIMSON_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_WARPED_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_CACTUS_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_WOODEN_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_PALE_OAK_MOSAIC_SIGN);
        dropSelf(DecoBlocks.STANDING_DRIFTWOOD_MOSAIC_SIGN);

        dropSelf(DecoBlocks.HANGING_WOODEN_SIGN);
        dropSelf(DecoBlocks.HANGING_DRIFTWOOD_SIGN);

        dropSelf(DecoBlocks.HANGING_OAK_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_SPRUCE_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_BIRCH_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_JUNGLE_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_ACACIA_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_DARK_OAK_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_MANGROVE_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_CHERRY_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_BAMBOO_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_CACTUS_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_WOODEN_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_CRIMSON_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_WARPED_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_PALE_OAK_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_DRIFTWOOD_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_OAK_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_SPRUCE_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_BIRCH_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_JUNGLE_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_ACACIA_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_DARK_OAK_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_MANGROVE_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_CHERRY_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_CACTUS_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_WOODEN_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_CRIMSON_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_WARPED_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_PALE_OAK_PLANKS_SIGN);
        dropSelf(DecoBlocks.HANGING_DRIFTWOOD_PLANKS_SIGN);

        dropSelf(DecoBlocks.TERRACOTTA_STAIRS);
        add(DecoBlocks.TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.TERRACOTTA_WALL);

        dropSelf(DecoBlocks.WHITE_TERRACOTTA_STAIRS);
        add(DecoBlocks.WHITE_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.WHITE_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.WHITE_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        add(DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.GRAY_TERRACOTTA_STAIRS);
        add(DecoBlocks.GRAY_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.GRAY_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.GRAY_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.BLACK_TERRACOTTA_STAIRS);
        add(DecoBlocks.BLACK_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.BLACK_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.BLACK_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.BROWN_TERRACOTTA_STAIRS);
        add(DecoBlocks.BROWN_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.BROWN_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.BROWN_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.RED_TERRACOTTA_STAIRS);
        add(DecoBlocks.RED_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.RED_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.RED_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.ORANGE_TERRACOTTA_STAIRS);
        add(DecoBlocks.ORANGE_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.ORANGE_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.ORANGE_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.YELLOW_TERRACOTTA_STAIRS);
        add(DecoBlocks.YELLOW_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.YELLOW_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.YELLOW_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.LIME_TERRACOTTA_STAIRS);
        add(DecoBlocks.LIME_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.LIME_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.LIME_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.GREEN_TERRACOTTA_STAIRS);
        add(DecoBlocks.GREEN_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.GREEN_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.GREEN_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.CYAN_TERRACOTTA_STAIRS);
        add(DecoBlocks.CYAN_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.CYAN_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.CYAN_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        add(DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.BLUE_TERRACOTTA_STAIRS);
        add(DecoBlocks.BLUE_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.BLUE_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.BLUE_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.PURPLE_TERRACOTTA_STAIRS);
        add(DecoBlocks.PURPLE_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.PURPLE_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.PURPLE_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS);
        add(DecoBlocks.MAGENTA_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.MAGENTA_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.MAGENTA_TERRACOTTA_WALL);
        dropSelf(DecoBlocks.PINK_TERRACOTTA_STAIRS);
        add(DecoBlocks.PINK_TERRACOTTA_SLAB, createSlabItemTable(DecoBlocks.PINK_TERRACOTTA_SLAB));
        dropSelf(DecoBlocks.PINK_TERRACOTTA_WALL);

        dropSelf(DecoBlocks.WHITE_CONCRETE_STAIRS);
        add(DecoBlocks.WHITE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.WHITE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.WHITE_CONCRETE_WALL);
        dropSelf(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        add(DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        dropSelf(DecoBlocks.LIGHT_GRAY_CONCRETE_WALL);
        dropSelf(DecoBlocks.GRAY_CONCRETE_STAIRS);
        add(DecoBlocks.GRAY_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.GRAY_CONCRETE_SLAB));
        dropSelf(DecoBlocks.GRAY_CONCRETE_WALL);
        dropSelf(DecoBlocks.BLACK_CONCRETE_STAIRS);
        add(DecoBlocks.BLACK_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.BLACK_CONCRETE_SLAB));
        dropSelf(DecoBlocks.BLACK_CONCRETE_WALL);
        dropSelf(DecoBlocks.BROWN_CONCRETE_STAIRS);
        add(DecoBlocks.BROWN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.BROWN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.BROWN_CONCRETE_WALL);
        dropSelf(DecoBlocks.RED_CONCRETE_STAIRS);
        add(DecoBlocks.RED_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.RED_CONCRETE_SLAB));
        dropSelf(DecoBlocks.RED_CONCRETE_WALL);
        dropSelf(DecoBlocks.ORANGE_CONCRETE_STAIRS);
        add(DecoBlocks.ORANGE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.ORANGE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.ORANGE_CONCRETE_WALL);
        dropSelf(DecoBlocks.YELLOW_CONCRETE_STAIRS);
        add(DecoBlocks.YELLOW_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.YELLOW_CONCRETE_SLAB));
        dropSelf(DecoBlocks.YELLOW_CONCRETE_WALL);
        dropSelf(DecoBlocks.LIME_CONCRETE_STAIRS);
        add(DecoBlocks.LIME_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.LIME_CONCRETE_SLAB));
        dropSelf(DecoBlocks.LIME_CONCRETE_WALL);
        dropSelf(DecoBlocks.GREEN_CONCRETE_STAIRS);
        add(DecoBlocks.GREEN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.GREEN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.GREEN_CONCRETE_WALL);
        dropSelf(DecoBlocks.CYAN_CONCRETE_STAIRS);
        add(DecoBlocks.CYAN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CYAN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CYAN_CONCRETE_WALL);
        dropSelf(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        add(DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.LIGHT_BLUE_CONCRETE_WALL);
        dropSelf(DecoBlocks.BLUE_CONCRETE_STAIRS);
        add(DecoBlocks.BLUE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.BLUE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.BLUE_CONCRETE_WALL);
        dropSelf(DecoBlocks.PURPLE_CONCRETE_STAIRS);
        add(DecoBlocks.PURPLE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.PURPLE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.PURPLE_CONCRETE_WALL);
        dropSelf(DecoBlocks.MAGENTA_CONCRETE_STAIRS);
        add(DecoBlocks.MAGENTA_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.MAGENTA_CONCRETE_SLAB));
        dropSelf(DecoBlocks.MAGENTA_CONCRETE_WALL);
        dropSelf(DecoBlocks.PINK_CONCRETE_STAIRS);
        add(DecoBlocks.PINK_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.PINK_CONCRETE_SLAB));
        dropSelf(DecoBlocks.PINK_CONCRETE_WALL);

        dropSelf(DecoBlocks.TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.RED_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.LIME_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        dropSelf(DecoBlocks.PINK_TERRACOTTA_BRICKS);

        dropSelf(DecoBlocks.CUT_WHITE_CONCRETE);
        dropSelf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        dropSelf(DecoBlocks.CUT_GRAY_CONCRETE);
        dropSelf(DecoBlocks.CUT_BLACK_CONCRETE);
        dropSelf(DecoBlocks.CUT_BROWN_CONCRETE);
        dropSelf(DecoBlocks.CUT_RED_CONCRETE);
        dropSelf(DecoBlocks.CUT_YELLOW_CONCRETE);
        dropSelf(DecoBlocks.CUT_ORANGE_CONCRETE);
        dropSelf(DecoBlocks.CUT_LIME_CONCRETE);
        dropSelf(DecoBlocks.CUT_GREEN_CONCRETE);
        dropSelf(DecoBlocks.CUT_CYAN_CONCRETE);
        dropSelf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        dropSelf(DecoBlocks.CUT_BLUE_CONCRETE);
        dropSelf(DecoBlocks.CUT_PURPLE_CONCRETE);
        dropSelf(DecoBlocks.CUT_MAGENTA_CONCRETE);
        dropSelf(DecoBlocks.CUT_PINK_CONCRETE);

        dropSelf(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.RED_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.RED_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.LIME_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);
        dropSelf(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        add(DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, createSlabItemTable(DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB));
        dropSelf(DecoBlocks.PINK_TERRACOTTA_BRICK_WALL);

        dropSelf(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_WHITE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_WHITE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_WHITE_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_GRAY_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_GRAY_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_GRAY_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_BLACK_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_BLACK_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_BLACK_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_BROWN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_BROWN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_BROWN_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_RED_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_RED_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_RED_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_RED_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_ORANGE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_ORANGE_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_YELLOW_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_YELLOW_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_LIME_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_LIME_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_LIME_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_LIME_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_GREEN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_GREEN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_GREEN_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_CYAN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_CYAN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_CYAN_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_BLUE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_BLUE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_BLUE_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_PURPLE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_PURPLE_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_MAGENTA_CONCRETE_WALL);
        dropSelf(DecoBlocks.CUT_PINK_CONCRETE_STAIRS);
        add(DecoBlocks.CUT_PINK_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CUT_PINK_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CUT_PINK_CONCRETE_WALL);

        dropSelf(DecoBlocks.WHITE_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.GRAY_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.BLACK_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.BROWN_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.RED_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.YELLOW_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.ORANGE_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.LIME_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.GREEN_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.CYAN_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.BLUE_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.PURPLE_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.MAGENTA_CONCRETE_PILLAR);
        dropSelf(DecoBlocks.PINK_CONCRETE_PILLAR);

        dropWhenSilkTouch(DecoBlocks.TINTED_GLASS_PANE);

        dropSelf(DecoBlocks.HARDENED_GLASS);
        dropSelf(DecoBlocks.HARDENED_TINTED_GLASS);
        dropSelf(DecoBlocks.HARDENED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_TINTED_GLASS_PANE);

        dropSelf(DecoBlocks.HARDENED_WHITE_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_GRAY_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_BLACK_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_BROWN_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_RED_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_LIME_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_GREEN_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_CYAN_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_BLUE_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS);
        dropSelf(DecoBlocks.HARDENED_PINK_STAINED_GLASS);

        dropSelf(DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE);
        dropSelf(DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE);

        dropWhenSilkTouch(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_RED_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_LIME_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_PINK_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS);

        dropWhenSilkTouch(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_RED_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_LIME_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_PINK_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS_PANE);
        dropWhenSilkTouch(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS_PANE);

        dropSelf(DecoBlocks.SMOOTH_DEEPSLATE);
        dropSelf(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS);
        add(DecoBlocks.SMOOTH_DEEPSLATE_SLAB, createSlabItemTable(DecoBlocks.SMOOTH_DEEPSLATE_SLAB));
        dropSelf(DecoBlocks.SMOOTH_DEEPSLATE_WALL);

        this.add(DecoBlocks.KELP_LEAVES, block -> this.createShearsDispatchTable(block, this.applyExplosionDecay(
                        block, LootItem.lootTableItem(Items.KELP).apply(SetItemCountFunction.setCount
                        (UniformGenerator.between(1.0F, 3.0F))))));
        add(DecoBlocks.DEAD_KELP_LEAVES, this::createShearsOnlyDrop);

        this.add(DecoBlocks.DRIED_LEAVES, block -> this.createShearsDispatchTable(block, this.applyExplosionDecay(
                block, LootItem.lootTableItem(Items.LEAF_LITTER).apply(SetItemCountFunction.setCount
                        (UniformGenerator.between(1.0F, 3.0F))))));

        dropSelf(DecoBlocks.DRIFTWOOD_SPROUT);
        dropSelf(DecoBlocks.DRIFTWOOD_SAPLING);

        dropSelf(DecoBlocks.DEEPSLATE_FURNACE);

        dropSelf(DecoBlocks.SMOOTH_BLACKSTONE);
        dropSelf(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS);
        add(DecoBlocks.SMOOTH_BLACKSTONE_SLAB, createSlabItemTable(DecoBlocks.SMOOTH_BLACKSTONE_SLAB));
        dropSelf(DecoBlocks.SMOOTH_BLACKSTONE_WALL);

        dropSelf(DecoBlocks.BLACKSTONE_FURNACE);

        dropSelf(DecoBlocks.SMOOTH_TUFF);
        dropSelf(DecoBlocks.SMOOTH_TUFF_STAIRS);
        add(DecoBlocks.SMOOTH_TUFF_SLAB, createSlabItemTable(DecoBlocks.SMOOTH_TUFF_SLAB));
        dropSelf(DecoBlocks.SMOOTH_TUFF_WALL);

        dropSelf(DecoBlocks.TUFF_FURNACE);

        dropSelf(DecoBlocks.DEEPSLATE_BLAST_FURNACE);
        dropSelf(DecoBlocks.BLACKSTONE_BLAST_FURNACE);
        dropSelf(DecoBlocks.TUFF_BLAST_FURNACE);

        dropSelf(DecoBlocks.DEEPSLATE_SMOKER);
        dropSelf(DecoBlocks.BLACKSTONE_SMOKER);
        dropSelf(DecoBlocks.TUFF_SMOKER);

        dropSelf(DecoBlocks.DEEPSLATE_STONECUTTER);
        dropSelf(DecoBlocks.BLACKSTONE_STONECUTTER);
        dropSelf(DecoBlocks.TUFF_STONECUTTER);

        dropSelf(DecoBlocks.DEEPSLATE_STAIRS);
        add(DecoBlocks.DEEPSLATE_SLAB, createSlabItemTable(DecoBlocks.DEEPSLATE_SLAB));
        dropSelf(DecoBlocks.DEEPSLATE_WALL);

        dropSelf(DecoBlocks.CHISELED_BRICKS);

        dropSelf(DecoBlocks.END_STONE_STAIRS);
        add(DecoBlocks.END_STONE_SLAB, createSlabItemTable(DecoBlocks.END_STONE_SLAB));
        dropSelf(DecoBlocks.END_STONE_WALL);

        dropSelf(DecoBlocks.CHISELED_END_STONE);

        dropSelf(DecoBlocks.SMOOTH_PURPUR);
        dropSelf(DecoBlocks.SMOOTH_PURPUR_STAIRS);
        add(DecoBlocks.SMOOTH_PURPUR_SLAB, createSlabItemTable(DecoBlocks.SMOOTH_PURPUR_SLAB));
        dropSelf(DecoBlocks.SMOOTH_PURPUR_WALL);

        dropSelf(DecoBlocks.PURPUR_BRICKS);
        dropSelf(DecoBlocks.PURPUR_BRICK_STAIRS);
        add(DecoBlocks.PURPUR_BRICK_SLAB, createSlabItemTable(DecoBlocks.PURPUR_BRICK_SLAB));
        dropSelf(DecoBlocks.PURPUR_BRICK_WALL);

        dropSelf(DecoBlocks.CHISELED_PURPUR);

        dropSelf(DecoBlocks.VOID_STONE);
        dropSelf(DecoBlocks.VOID_STONE_STAIRS);
        add(DecoBlocks.VOID_STONE_SLAB, createSlabItemTable(DecoBlocks.VOID_STONE_SLAB));
        dropSelf(DecoBlocks.VOID_STONE_WALL);

        dropSelf(DecoBlocks.VOID_STONE_BRICKS);
        dropSelf(DecoBlocks.VOID_STONE_BRICK_STAIRS);
        add(DecoBlocks.VOID_STONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.VOID_STONE_BRICK_SLAB));
        dropSelf(DecoBlocks.VOID_STONE_BRICK_WALL);

        dropSelf(DecoBlocks.CHISELED_VOID_STONE);

        dropSelf(DecoBlocks.OBSIDIAN_STAIRS);
        add(DecoBlocks.OBSIDIAN_SLAB, createSlabItemTable(DecoBlocks.OBSIDIAN_SLAB));
        dropSelf(DecoBlocks.OBSIDIAN_WALL);

        dropSelf(DecoBlocks.OBSIDIAN_BRICKS);
        dropSelf(DecoBlocks.OBSIDIAN_BRICK_STAIRS);
        add(DecoBlocks.OBSIDIAN_BRICK_SLAB, createSlabItemTable(DecoBlocks.OBSIDIAN_BRICK_SLAB));
        dropSelf(DecoBlocks.OBSIDIAN_BRICK_WALL);

        dropSelf(DecoBlocks.OBSIDIAN_PILLAR);
        dropSelf(DecoBlocks.CHISELED_OBSIDIAN);

        dropSelf(DecoBlocks.CHARCOAL_BLOCK);
        dropSelf(DecoBlocks.FLINT_BLOCK);
        dropSelf(DecoBlocks.ECHO_BLOCK);

        dropSelf(DecoBlocks.CUT_IRON);
        dropSelf(DecoBlocks.CUT_IRON_STAIRS);
        add(DecoBlocks.CUT_IRON_SLAB, createSlabItemTable(DecoBlocks.CUT_IRON_SLAB));

        dropSelf(DecoBlocks.LIGHT_IRON_BARS);
        dropSelf(DecoBlocks.HEAVY_IRON_BARS);

        add(DecoBlocks.GOLD_DOOR, createDoorTable(DecoBlocks.GOLD_DOOR));
        dropSelf(DecoBlocks.GOLD_TRAPDOOR);

        dropSelf(DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        dropSelf(DecoBlocks.POLISHED_DEEPSLATE_BUTTON);

        dropSelf(DecoBlocks.HEAVY_COPPER_BARS);
        dropSelf(DecoBlocks.WAXED_HEAVY_COPPER_BARS);
        dropSelf(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS);
        dropSelf(DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS);
        dropSelf(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS);
        dropSelf(DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS);
        dropSelf(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS);
        dropSelf(DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS);

        dropSelf(DecoBlocks.LIGHT_COPPER_BARS);
        dropSelf(DecoBlocks.WAXED_LIGHT_COPPER_BARS);
        dropSelf(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS);
        dropSelf(DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS);
        dropSelf(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS);
        dropSelf(DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS);
        dropSelf(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS);
        dropSelf(DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS);

        dropSelf(DecoBlocks.DEEPSLATE_PRESSURE_PLATE);
        dropSelf(DecoBlocks.DEEPSLATE_BUTTON);

        dropSelf(DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
        dropSelf(DecoBlocks.COBBLED_DEEPSLATE_BUTTON);

        dropSelf(DecoBlocks.COBBLESTONE_PRESSURE_PLATE);
        dropSelf(DecoBlocks.COBBLESTONE_BUTTON);

        dropSelf(DecoBlocks.BLACKSTONE_PRESSURE_PLATE);
        dropSelf(DecoBlocks.BLACKSTONE_BUTTON);

        dropSelf(DecoBlocks.POLISHED_STONE_PRESSURE_PLATE);
        dropSelf(DecoBlocks.POLISHED_STONE_BUTTON);

        dropSelf(DecoBlocks.TUFF_PRESSURE_PLATE);
        dropSelf(DecoBlocks.TUFF_BUTTON);

        dropSelf(DecoBlocks.POLISHED_TUFF_PRESSURE_PLATE);
        dropSelf(DecoBlocks.POLISHED_TUFF_BUTTON);

        dropSelf(DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS);
        dropSelf(DecoBlocks.CHISELED_STONE);
        dropSelf(DecoBlocks.CHISELED_DEEPSLATE_BRICKS);
        dropSelf(DecoBlocks.IRON_GRATE);
        dropSelf(DecoBlocks.CHISELED_IRON);

        dropSelf(DecoBlocks.SMOOTH_BASALT_STAIRS);
        createSlabItemTable(DecoBlocks.SMOOTH_BASALT_SLAB);
        dropSelf(DecoBlocks.SMOOTH_BASALT_WALL);
        dropSelf(DecoBlocks.PURPUR_WALL);

        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_STONE, DecoBlocks.POLISHED_STONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_STONE_TILES, DecoBlocks.STONE_TILES);
        otherWhenSilkTouch(DecoBlocks.INFESTED_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CRACKED_DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CRACKED_DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES);
        otherWhenSilkTouch(DecoBlocks.INFESTED_MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CHISELED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CALCITE, Blocks.CALCITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_DRIPSTONE_BLOCK, Blocks.DRIPSTONE_BLOCK);
        otherWhenSilkTouch(DecoBlocks.INFESTED_TUFF, Blocks.TUFF);
        otherWhenSilkTouch(DecoBlocks.INFESTED_GRANITE, Blocks.GRANITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_GRANITE, Blocks.POLISHED_GRANITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_DIORITE, Blocks.DIORITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_DIORITE, Blocks.POLISHED_DIORITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_ANDESITE, Blocks.ANDESITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_BLACKSTONE, Blocks.BLACKSTONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_BLACKSTONE_TILES, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CHISELED_POLISHED_BLACKSTONE, Blocks.CHISELED_POLISHED_BLACKSTONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CHISELED_STONE, DecoBlocks.CHISELED_STONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CHISELED_POLISHED_BLACKSTONE_BRICKS, DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CHISELED_DEEPSLATE_BRICKS, DecoBlocks.CHISELED_DEEPSLATE_BRICKS);

        dropSelf(DecoBlocks.YELLOW_TULIP);
        createPotFlowerItemTable(DecoBlocks.POTTED_YELLOW_TULIP);
        dropSelf(DecoBlocks.PURPLE_TULIP);
        createPotFlowerItemTable(DecoBlocks.POTTED_PURPLE_TULIP);
        dropSelf(DecoBlocks.MAGENTA_TULIP);
        createPotFlowerItemTable(DecoBlocks.POTTED_MAGENTA_TULIP);
        dropSelf(DecoBlocks.BLUE_TULIP);
        createPotFlowerItemTable(DecoBlocks.POTTED_BLUE_TULIP);
        dropSelf(DecoBlocks.BLACK_TULIP);
        createPotFlowerItemTable(DecoBlocks.POTTED_BLACK_TULIP);
        dropSelf(DecoBlocks.GREEN_TULIP);
        createPotFlowerItemTable(DecoBlocks.POTTED_GREEN_TULIP);
        dropSelf(DecoBlocks.CYAN_TULIP);
        createPotFlowerItemTable(DecoBlocks.POTTED_CYAN_TULIP);

        dropSelf(DecoBlocks.BARBERTON_DAISY);
        createPotFlowerItemTable(DecoBlocks.POTTED_BARBERTON_DAISY);
        dropSelf(DecoBlocks.BLUE_EYED_DAISY);
        createPotFlowerItemTable(DecoBlocks.POTTED_BLUE_EYED_DAISY);
        dropSelf(DecoBlocks.GERBERA_DAISY);
        createPotFlowerItemTable(DecoBlocks.POTTED_GERBERA_DAISY);
        dropSelf(DecoBlocks.MICHAELMAS_DAISY);
        createPotFlowerItemTable(DecoBlocks.POTTED_MICHAELMAS_DAISY);

        dropSelf(DecoBlocks.PUFFY_DANDELION);
        createPotFlowerItemTable(DecoBlocks.POTTED_PUFFY_DANDELION);

        dropSelf(DecoBlocks.CALIFORNIA_POPPY);
        createPotFlowerItemTable(DecoBlocks.POTTED_CALIFORNIA_POPPY);
        dropSelf(DecoBlocks.SALMON_POPPY);
        createPotFlowerItemTable(DecoBlocks.POTTED_SALMON_POPPY);

        dropSelf(DecoBlocks.WHITE_ORCHID);
        createPotFlowerItemTable(DecoBlocks.POTTED_WHITE_ORCHID);
        dropSelf(DecoBlocks.YELLOW_ORCHID);
        createPotFlowerItemTable(DecoBlocks.POTTED_YELLOW_ORCHID);
        dropSelf(DecoBlocks.PINK_ORCHID);
        createPotFlowerItemTable(DecoBlocks.POTTED_PINK_ORCHID);

        dropSelf(DecoBlocks.ROSE);
        createPotFlowerItemTable(DecoBlocks.POTTED_ROSE);
        dropSelf(DecoBlocks.ENDER_ROSE);
        createPotFlowerItemTable(DecoBlocks.POTTED_ENDER_ROSE);

        dropSelf(DecoBlocks.PAEONIA);
        createPotFlowerItemTable(DecoBlocks.POTTED_PAEONIA);
        dropSelf(DecoBlocks.LAVENDER);
        createPotFlowerItemTable(DecoBlocks.POTTED_LAVENDER);

        dropSelf(DecoBlocks.BLUE_HIBISCUS);
        createPotFlowerItemTable(DecoBlocks.POTTED_BLUE_HIBISCUS);
        dropSelf(DecoBlocks.BROMELIAD);
        createPotFlowerItemTable(DecoBlocks.POTTED_BROMELIAD);

        dropSelf(DecoBlocks.COPPER_SOUL_LANTERN);
        dropSelf(DecoBlocks.WAXED_COPPER_SOUL_LANTERN);
        dropSelf(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN);
        dropSelf(DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
        dropSelf(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN);
        dropSelf(DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
        dropSelf(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN);
        dropSelf(DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);

        dropSelf(DecoBlocks.PASTEL_LIGHT_GRAY_BLOCK);
        dropSelf(DecoBlocks.PASTEL_GRAY_BLOCK);
        dropSelf(DecoBlocks.PASTEL_BROWN_BLOCK);
        dropSelf(DecoBlocks.PASTEL_RED_BLOCK);
        dropSelf(DecoBlocks.PASTEL_ORANGE_BLOCK);
        dropSelf(DecoBlocks.PASTEL_YELLOW_BLOCK);
        dropSelf(DecoBlocks.PASTEL_LIME_BLOCK);
        dropSelf(DecoBlocks.PASTEL_GREEN_BLOCK);
        dropSelf(DecoBlocks.PASTEL_CYAN_BLOCK);
        dropSelf(DecoBlocks.PASTEL_LIGHT_BLUE_BLOCK);
        dropSelf(DecoBlocks.PASTEL_BLUE_BLOCK);
        dropSelf(DecoBlocks.PASTEL_PURPLE_BLOCK);
        dropSelf(DecoBlocks.PASTEL_MAGENTA_BLOCK);
        dropSelf(DecoBlocks.PASTEL_PINK_BLOCK);
        dropSelf(DecoBlocks.SHADED_LIGHT_GRAY_BLOCK);
        dropSelf(DecoBlocks.SHADED_GRAY_BLOCK);
        dropSelf(DecoBlocks.SHADED_BROWN_BLOCK);
        dropSelf(DecoBlocks.SHADED_RED_BLOCK);
        dropSelf(DecoBlocks.SHADED_ORANGE_BLOCK);
        dropSelf(DecoBlocks.SHADED_YELLOW_BLOCK);
        dropSelf(DecoBlocks.SHADED_LIME_BLOCK);
        dropSelf(DecoBlocks.SHADED_GREEN_BLOCK);
        dropSelf(DecoBlocks.SHADED_CYAN_BLOCK);
        dropSelf(DecoBlocks.SHADED_LIGHT_BLUE_BLOCK);
        dropSelf(DecoBlocks.SHADED_BLUE_BLOCK);
        dropSelf(DecoBlocks.SHADED_PURPLE_BLOCK);
        dropSelf(DecoBlocks.SHADED_MAGENTA_BLOCK);
        dropSelf(DecoBlocks.SHADED_PINK_BLOCK);

        dropSelf(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE);
        dropSelf(DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE);
        dropSelf(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
        dropSelf(DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
        dropSelf(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
        dropSelf(DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
        dropSelf(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);
        dropSelf(DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);

        dropSelf(DecoBlocks.COPPER_BUTTON);
        dropSelf(DecoBlocks.WAXED_COPPER_BUTTON);
        dropSelf(DecoBlocks.COPPER_BUTTON);
        dropSelf(DecoBlocks.WAXED_COPPER_BUTTON);
        dropSelf(DecoBlocks.EXPOSED_COPPER_BUTTON);
        dropSelf(DecoBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        dropSelf(DecoBlocks.WEATHERED_COPPER_BUTTON);
        dropSelf(DecoBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        dropSelf(DecoBlocks.OXIDIZED_COPPER_BUTTON);
        dropSelf(DecoBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

        dropSelf(DecoBlocks.IRON_BUTTON);
        dropSelf(DecoBlocks.GOLD_BUTTON);

        dropSelf(DecoBlocks.WHITE_BLOCK);
        dropSelf(DecoBlocks.LIGHT_GRAY_BLOCK);
        dropSelf(DecoBlocks.GRAY_BLOCK);
        dropSelf(DecoBlocks.BLACK_BLOCK);
        dropSelf(DecoBlocks.BROWN_BLOCK);
        dropSelf(DecoBlocks.RED_BLOCK);
        dropSelf(DecoBlocks.ORANGE_BLOCK);
        dropSelf(DecoBlocks.YELLOW_BLOCK);
        dropSelf(DecoBlocks.LIME_BLOCK);
        dropSelf(DecoBlocks.GREEN_BLOCK);
        dropSelf(DecoBlocks.CYAN_BLOCK);
        dropSelf(DecoBlocks.LIGHT_BLUE_BLOCK);
        dropSelf(DecoBlocks.BLUE_BLOCK);
        dropSelf(DecoBlocks.PURPLE_BLOCK);
        dropSelf(DecoBlocks.MAGENTA_BLOCK);
        dropSelf(DecoBlocks.PINK_BLOCK);

        dropSelf(DecoBlocks.WOODEN_PLANKS);
        dropSelf(DecoBlocks.WOODEN_STAIRS);
        add(DecoBlocks.WOODEN_SLAB, createSlabItemTable(DecoBlocks.WOODEN_SLAB));
        dropSelf(DecoBlocks.WOODEN_FENCE);
        dropSelf(DecoBlocks.WOODEN_FENCE_GATE);
        dropSelf(DecoBlocks.WOODEN_PRESSURE_PLATE);
        dropSelf(DecoBlocks.WOODEN_BUTTON);

        dropSelf(DecoBlocks.WOODEN_LOG);
        dropSelf(DecoBlocks.WOODEN_WOOD);
        dropSelf(DecoBlocks.STRIPPED_WOODEN_LOG);
        dropSelf(DecoBlocks.STRIPPED_WOODEN_WOOD);

        add(DecoBlocks.WOODEN_DOOR, createDoorTable(DecoBlocks.WOODEN_DOOR));
        dropSelf(DecoBlocks.WOODEN_TRAPDOOR);

        dropSelf(DecoBlocks.OAK_CRAFTING_TABLE);
        dropSelf(DecoBlocks.WOODEN_LADDER);

        dropSelf(DecoBlocks.STANDING_WOODEN_SIGN);

        dropSelf(DecoBlocks.STANDING_DRIFTWOOD_SIGN);

        dropSelf(DecoBlocks.WOODEN_SAPLING);
        createPotFlowerItemTable(DecoBlocks.POTTED_WOODEN_SAPLING);


        add(DecoBlocks.ANCIENT_ROSE_CROP,
                applyExplosionDecay(DecoBlocks.ANCIENT_ROSE_CROP,
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DecoItems.ANCIENT_ROSE_SEEDS)))));
        LootItemCondition.Builder builder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DecoBlocks.MIGHTY_LAVENDER_CROP)
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CarrotBlock.AGE, 4));

        dropSelf(DecoBlocks.ANCIENT_ROSE);
        createPotFlowerItemTable(DecoBlocks.POTTED_ANCIENT_ROSE);

        add(DecoBlocks.WITHER_ROSE_BUSH, block -> this.createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        add(DecoBlocks.ENDER_ROSE_BUSH, block -> this.createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        add(DecoBlocks.MIGHTY_LAVENDER, block -> this.createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        add(DecoBlocks.NOVA_STARFLOWER, block -> this.createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        add(DecoBlocks.RED_SUNFLOWER, block -> this.createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));

        add(DecoBlocks.WARPED_WART_PLANT, block -> LootTable.lootTable().withPool(this.applyExplosionDecay(block, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(DecoItems.WARPED_WART)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F))
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(NetherWartBlock.AGE, 3))))
                        .apply(ApplyBonusCount.addUniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(NetherWartBlock.AGE, 3))))))));

        add(DecoBlocks.MIGHTY_LAVENDER_CROP, this.applyExplosionDecay(DecoBlocks.MIGHTY_LAVENDER_CROP, LootTable.lootTable()
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(DecoItems.MIGHTY_LAVENDER_FLOWER)))
                .withPool(LootPool.lootPool()
                        .when(builder3)
                        .add(LootItem.lootTableItem(DecoItems.MIGHTY_LAVENDER_FLOWER).apply(ApplyBonusCount.addBonusBinomialDistributionCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))));

        dropSelf(DecoBlocks.SMOOTH_BASALT_STAIRS);
        add(DecoBlocks.SMOOTH_BASALT_SLAB, createSlabItemTable(DecoBlocks.SMOOTH_BASALT_SLAB));
        dropSelf(DecoBlocks.SMOOTH_BASALT_WALL);
        dropSelf(DecoBlocks.PURPUR_WALL);

        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_STONE, DecoBlocks.POLISHED_STONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_STONE_TILES, DecoBlocks.STONE_TILES);
        otherWhenSilkTouch(DecoBlocks.INFESTED_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CRACKED_DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CRACKED_DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES);
        otherWhenSilkTouch(DecoBlocks.INFESTED_MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CHISELED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CALCITE, Blocks.CALCITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_DRIPSTONE_BLOCK, Blocks.DRIPSTONE_BLOCK);
        otherWhenSilkTouch(DecoBlocks.INFESTED_TUFF, Blocks.TUFF);
        otherWhenSilkTouch(DecoBlocks.INFESTED_GRANITE, Blocks.GRANITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_GRANITE, Blocks.POLISHED_GRANITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_DIORITE, Blocks.DIORITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_DIORITE, Blocks.POLISHED_DIORITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_ANDESITE, Blocks.ANDESITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_BLACKSTONE, Blocks.BLACKSTONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_BLACKSTONE_TILES, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CHISELED_POLISHED_BLACKSTONE, Blocks.CHISELED_POLISHED_BLACKSTONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CHISELED_STONE, DecoBlocks.CHISELED_STONE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CHISELED_DEEPSLATE_BRICKS, DecoBlocks.CHISELED_DEEPSLATE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CHISELED_POLISHED_BLACKSTONE_BRICKS, DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CRACKED_STONE_TILES, DecoBlocks.CRACKED_STONE_TILES);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_TILES, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);

        dropSelf(DecoBlocks.DEEPSLATE_GRINDSTONE);
        dropSelf(DecoBlocks.BLACKSTONE_GRINDSTONE);
        dropSelf(DecoBlocks.TUFF_GRINDSTONE);

        dropSelf(DecoBlocks.COBBLED_SANDSTONE);
        dropSelf(DecoBlocks.COBBLED_RED_SANDSTONE);
        dropSelf(DecoBlocks.COBBLED_SOUL_SOILSTONE);
        dropSelf(DecoBlocks.POLISHED_SANDSTONE);
        dropSelf(DecoBlocks.POLISHED_RED_SANDSTONE);
        dropSelf(DecoBlocks.POLISHED_SOUL_SOILSTONE);
        dropSelf(DecoBlocks.SANDSTONE_BRICKS);
        dropSelf(DecoBlocks.RED_SANDSTONE_BRICKS);
        dropSelf(DecoBlocks.SOUL_SOILSTONE_BRICKS);
        dropSelf(DecoBlocks.COBBLED_SANDSTONE_STAIRS);
        add(DecoBlocks.COBBLED_SANDSTONE_SLAB, createSlabItemTable(DecoBlocks.COBBLED_SANDSTONE_SLAB));
        dropSelf(DecoBlocks.COBBLED_SANDSTONE_WALL);
        dropSelf(DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS);
        add(DecoBlocks.COBBLED_RED_SANDSTONE_SLAB, createSlabItemTable(DecoBlocks.COBBLED_RED_SANDSTONE_SLAB));
        dropSelf(DecoBlocks.COBBLED_RED_SANDSTONE_WALL);
        dropSelf(DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS);
        add(DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB, createSlabItemTable(DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB));
        dropSelf(DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL);
        dropSelf(DecoBlocks.POLISHED_SANDSTONE_STAIRS);
        add(DecoBlocks.POLISHED_SANDSTONE_SLAB, createSlabItemTable(DecoBlocks.POLISHED_SANDSTONE_SLAB));
        dropSelf(DecoBlocks.POLISHED_SANDSTONE_WALL);
        dropSelf(DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS);
        add(DecoBlocks.POLISHED_RED_SANDSTONE_SLAB, createSlabItemTable(DecoBlocks.POLISHED_RED_SANDSTONE_SLAB));
        dropSelf(DecoBlocks.POLISHED_RED_SANDSTONE_WALL);
        dropSelf(DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS);
        add(DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB, createSlabItemTable(DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB));
        dropSelf(DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL);
        dropSelf(DecoBlocks.SANDSTONE_BRICK_STAIRS);
        add(DecoBlocks.SANDSTONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.SANDSTONE_BRICK_SLAB));
        dropSelf(DecoBlocks.SANDSTONE_BRICK_WALL);
        dropSelf(DecoBlocks.RED_SANDSTONE_BRICK_STAIRS);
        add(DecoBlocks.RED_SANDSTONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.RED_SANDSTONE_BRICK_SLAB));
        dropSelf(DecoBlocks.RED_SANDSTONE_BRICK_WALL);
        dropSelf(DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS);
        add(DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB));
        dropSelf(DecoBlocks.SOUL_SOILSTONE_BRICK_WALL);

        add(DecoBlocks.FRAGILE_ICE, block -> this.createSingleItemTableWithSilkTouch(block, DecoItems.ICE_SHARD,
                        UniformGenerator.between(0.0F, 3.0f)));

        dropSelf(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE);
        dropOther(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_MAGMA, DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE);

        dropSelf(DecoBlocks.CHISELED_POLISHED_SANDSTONE);
        dropSelf(DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE);
        dropSelf(DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE);

        dropSelf(DecoBlocks.CRACKED_TUFF_TILES);
        dropSelf(DecoBlocks.CRACKED_TUFF_BRICKS);

        add(Blocks.MAGMA_BLOCK, block -> this.createSingleItemTableWithSilkTouch(block, Items.MAGMA_CREAM, ConstantValue.exactly(2.0F)));

        add(Blocks.ICE, block -> this.createSingleItemTableWithSilkTouch(block, DecoItems.ICE_SHARD,
                UniformGenerator.between(3.0F, 6.0f)));

        add(Blocks.BLUE_ICE, block -> this.createSingleItemTableWithSilkTouch(block, DecoItems.ICE_SHARD,
                UniformGenerator.between(9.0F, 12.0f)));

        dropSelf(DecoBlocks.DRIFTWOOD_LOG);
        dropSelf(DecoBlocks.DRIED_DRIFTWOOD_LOG);
        dropSelf(DecoBlocks.DRIFTWOOD);
        dropSelf(DecoBlocks.DRIED_DRIFTWOOD);
        dropSelf(DecoBlocks.STRIPPED_DRIFTWOOD_LOG);
        dropSelf(DecoBlocks.STRIPPED_DRIFTWOOD);

        dropSelf(DecoBlocks.DRIFTWOOD_PLANKS);
        dropSelf(DecoBlocks.DRIFTWOOD_STAIRS);
        add(DecoBlocks.DRIFTWOOD_SLAB, createSlabItemTable(DecoBlocks.DRIFTWOOD_SLAB));
        dropSelf(DecoBlocks.DRIFTWOOD_FENCE);
        dropSelf(DecoBlocks.DRIFTWOOD_FENCE_GATE);
        dropSelf(DecoBlocks.DRIFTWOOD_PRESSURE_PLATE);
        dropSelf(DecoBlocks.DRIFTWOOD_BUTTON);

        add(DecoBlocks.DRIFTWOOD_DOOR, createDoorTable(DecoBlocks.DRIFTWOOD_DOOR));
        dropSelf(DecoBlocks.DRIFTWOOD_TRAPDOOR);

        dropSelf(DecoBlocks.CUT_PURPUR);
        dropSelf(DecoBlocks.CUT_PURPUR_STAIRS);
        add(DecoBlocks.CUT_PURPUR_SLAB, createSlabItemTable(DecoBlocks.CUT_PURPUR_SLAB));
        dropSelf(DecoBlocks.CUT_PURPUR_WALL);

        dropSelf(DecoBlocks.OAK_WOOD_STAIRS);
        add(DecoBlocks.OAK_WOOD_SLAB, createSlabItemTable(DecoBlocks.OAK_WOOD_SLAB));
        dropSelf(DecoBlocks.OAK_WOOD_WALL);
        dropSelf(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS);
        add(DecoBlocks.STRIPPED_OAK_WOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_OAK_WOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_OAK_WOOD_WALL);

        dropSelf(DecoBlocks.SPRUCE_WOOD_STAIRS);
        add(DecoBlocks.SPRUCE_WOOD_SLAB, createSlabItemTable(DecoBlocks.SPRUCE_WOOD_SLAB));
        dropSelf(DecoBlocks.SPRUCE_WOOD_WALL);
        dropSelf(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS);
        add(DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_SPRUCE_WOOD_WALL);

        dropSelf(DecoBlocks.BIRCH_WOOD_STAIRS);
        add(DecoBlocks.BIRCH_WOOD_SLAB, createSlabItemTable(DecoBlocks.BIRCH_WOOD_SLAB));
        dropSelf(DecoBlocks.BIRCH_WOOD_WALL);
        dropSelf(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS);
        add(DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_BIRCH_WOOD_WALL);

        dropSelf(DecoBlocks.JUNGLE_WOOD_STAIRS);
        add(DecoBlocks.JUNGLE_WOOD_SLAB, createSlabItemTable(DecoBlocks.JUNGLE_WOOD_SLAB));
        dropSelf(DecoBlocks.JUNGLE_WOOD_WALL);
        dropSelf(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS);
        add(DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_JUNGLE_WOOD_WALL);

        dropSelf(DecoBlocks.ACACIA_WOOD_STAIRS);
        add(DecoBlocks.ACACIA_WOOD_SLAB, createSlabItemTable(DecoBlocks.ACACIA_WOOD_SLAB));
        dropSelf(DecoBlocks.ACACIA_WOOD_WALL);
        dropSelf(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS);
        add(DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_ACACIA_WOOD_WALL);

        dropSelf(DecoBlocks.DARK_OAK_WOOD_STAIRS);
        add(DecoBlocks.DARK_OAK_WOOD_SLAB, createSlabItemTable(DecoBlocks.DARK_OAK_WOOD_SLAB));
        dropSelf(DecoBlocks.DARK_OAK_WOOD_WALL);
        dropSelf(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS);
        add(DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_DARK_OAK_WOOD_WALL);

        dropSelf(DecoBlocks.MANGROVE_WOOD_STAIRS);
        add(DecoBlocks.MANGROVE_WOOD_SLAB, createSlabItemTable(DecoBlocks.MANGROVE_WOOD_SLAB));
        dropSelf(DecoBlocks.MANGROVE_WOOD_WALL);
        dropSelf(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS);
        add(DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_MANGROVE_WOOD_WALL);

        dropSelf(DecoBlocks.CRIMSON_HYPHAE_STAIRS);
        add(DecoBlocks.CRIMSON_HYPHAE_SLAB, createSlabItemTable(DecoBlocks.CRIMSON_HYPHAE_SLAB));
        dropSelf(DecoBlocks.CRIMSON_HYPHAE_WALL);
        dropSelf(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS);
        add(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB));
        dropSelf(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_WALL);

        dropSelf(DecoBlocks.WARPED_HYPHAE_STAIRS);
        add(DecoBlocks.WARPED_HYPHAE_SLAB, createSlabItemTable(DecoBlocks.WARPED_HYPHAE_SLAB));
        dropSelf(DecoBlocks.WARPED_HYPHAE_WALL);
        dropSelf(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS);
        add(DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB));
        dropSelf(DecoBlocks.STRIPPED_WARPED_HYPHAE_WALL);

        dropSelf(DecoBlocks.WOODEN_WOOD_STAIRS);
        add(DecoBlocks.WOODEN_WOOD_SLAB, createSlabItemTable(DecoBlocks.WOODEN_WOOD_SLAB));
        dropSelf(DecoBlocks.WOODEN_WOOD_WALL);
        dropSelf(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS);
        add(DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_WOODEN_WOOD_WALL);

        dropSelf(DecoBlocks.PACKED_NETHERRACK);
        dropSelf(DecoBlocks.PACKED_NETHERRACK_STAIRS);
        add(DecoBlocks.PACKED_NETHERRACK_SLAB, createSlabItemTable(DecoBlocks.PACKED_NETHERRACK_SLAB));
        dropSelf(DecoBlocks.PACKED_NETHERRACK_WALL);

        dropSelf(DecoBlocks.NETHERRACK_BRICKS);
        dropSelf(DecoBlocks.NETHERRACK_BRICK_STAIRS);
        add(DecoBlocks.NETHERRACK_BRICK_SLAB, createSlabItemTable(DecoBlocks.NETHERRACK_BRICK_SLAB));
        dropSelf(DecoBlocks.NETHERRACK_BRICK_WALL);

        dropSelf(DecoBlocks.CHISELED_MUD_BRICKS);
        dropSelf(DecoBlocks.CHISELED_NETHERRACK_BRICKS);
        dropSelf(DecoBlocks.CHISELED_ICE_BRICKS);

        dropSelf(DecoBlocks.SMOOTH_GLOWSTONE);
        dropSelf(DecoBlocks.BASALT_BRICKS);

        dropSelf(DecoBlocks.PACKED_CACTUS);
        dropSelf(DecoBlocks.STRIPPED_CACTUS);

        add(DecoBlocks.OAK_PALLET_DOOR, createDoorTable(DecoBlocks.OAK_PALLET_DOOR));
        add(DecoBlocks.SPRUCE_PALLET_DOOR, createDoorTable(DecoBlocks.SPRUCE_PALLET_DOOR));
        add(DecoBlocks.BIRCH_PALLET_DOOR, createDoorTable(DecoBlocks.BIRCH_PALLET_DOOR));
        add(DecoBlocks.JUNGLE_PALLET_DOOR, createDoorTable(DecoBlocks.JUNGLE_PALLET_DOOR));
        add(DecoBlocks.ACACIA_PALLET_DOOR, createDoorTable(DecoBlocks.ACACIA_PALLET_DOOR));
        add(DecoBlocks.DARK_OAK_PALLET_DOOR, createDoorTable(DecoBlocks.DARK_OAK_PALLET_DOOR));
        add(DecoBlocks.MANGROVE_PALLET_DOOR, createDoorTable(DecoBlocks.MANGROVE_PALLET_DOOR));
        add(DecoBlocks.CRIMSON_PALLET_DOOR, createDoorTable(DecoBlocks.CRIMSON_PALLET_DOOR));
        add(DecoBlocks.WARPED_PALLET_DOOR, createDoorTable(DecoBlocks.WARPED_PALLET_DOOR));
        add(DecoBlocks.CACTUS_PALLET_DOOR, createDoorTable(DecoBlocks.CACTUS_PALLET_DOOR));
        add(DecoBlocks.WOODEN_PALLET_DOOR, createDoorTable(DecoBlocks.WOODEN_PALLET_DOOR));

        dropSelf(DecoBlocks.OAK_PALLET_TRAPDOOR);
        dropSelf(DecoBlocks.SPRUCE_PALLET_TRAPDOOR);
        dropSelf(DecoBlocks.BIRCH_PALLET_TRAPDOOR);
        dropSelf(DecoBlocks.JUNGLE_PALLET_TRAPDOOR);
        dropSelf(DecoBlocks.ACACIA_PALLET_TRAPDOOR);
        dropSelf(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR);
        dropSelf(DecoBlocks.MANGROVE_PALLET_TRAPDOOR);
        dropSelf(DecoBlocks.CRIMSON_PALLET_TRAPDOOR);
        dropSelf(DecoBlocks.WARPED_PALLET_TRAPDOOR);
        dropSelf(DecoBlocks.CACTUS_PALLET_TRAPDOOR);
        dropSelf(DecoBlocks.WOODEN_PALLET_TRAPDOOR);

        dropOther(DecoBlocks.WHITE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.LIGHT_GRAY_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.GRAY_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.BLACK_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.BROWN_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.RED_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.ORANGE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.YELLOW_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.LIME_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.GREEN_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.CYAN_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.LIGHT_BLUE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.BLUE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.PURPLE_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.MAGENTA_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);
        dropOther(DecoBlocks.PINK_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);

        dropSelf(DecoBlocks.MUSHROOM_PLANKS);
        dropSelf(DecoBlocks.MUSHROOM_STAIRS);
        add(DecoBlocks.MUSHROOM_SLAB, createSlabItemTable(DecoBlocks.MUSHROOM_SLAB));
        dropSelf(DecoBlocks.MUSHROOM_FENCE);
        dropSelf(DecoBlocks.MUSHROOM_FENCE_GATE);
        dropSelf(DecoBlocks.MUSHROOM_PRESSURE_PLATE);
        dropSelf(DecoBlocks.MUSHROOM_BUTTON);

        add(DecoBlocks.MUSHROOM_DOOR, createDoorTable(DecoBlocks.MUSHROOM_DOOR));
        dropSelf(DecoBlocks.MUSHROOM_TRAPDOOR);

        add(DecoBlocks.MUSHROOM_PALLET_DOOR, createDoorTable(DecoBlocks.MUSHROOM_PALLET_DOOR));
        dropSelf(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR);

        dropSelf(DecoBlocks.STANDING_MUSHROOM_SIGN);

        dropSelf(DecoBlocks.MUSHROOM_CRAFTING_TABLE);
        dropSelf(DecoBlocks.MUSHROOM_BARREL);
        dropSelf(DecoBlocks.MUSHROOM_LADDER);
        dropSelf(DecoBlocks.MUSHROOM_SMITHING_TABLE);
        dropSelf(DecoBlocks.MUSHROOM_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.MUSHROOM_NOTE_BLOCK);

        dropSelf(DecoBlocks.OAK_NOTE_BLOCK);
        dropSelf(DecoBlocks.SPRUCE_NOTE_BLOCK);
        dropSelf(DecoBlocks.BIRCH_NOTE_BLOCK);
        dropSelf(DecoBlocks.JUNGLE_NOTE_BLOCK);
        dropSelf(DecoBlocks.DARK_OAK_NOTE_BLOCK);
        dropSelf(DecoBlocks.ACACIA_NOTE_BLOCK);
        dropSelf(DecoBlocks.MANGROVE_NOTE_BLOCK);
        dropSelf(DecoBlocks.CRIMSON_NOTE_BLOCK);
        dropSelf(DecoBlocks.WARPED_NOTE_BLOCK);
        dropSelf(DecoBlocks.CACTUS_NOTE_BLOCK);

        dropSelf(DecoBlocks.POLISHED_CALCITE);
        dropSelf(DecoBlocks.CUT_CALCITE);
        dropSelf(DecoBlocks.CALCITE_BRICKS);

        dropSelf(DecoBlocks.CUT_ANDESITE);
        dropSelf(DecoBlocks.ANDESITE_BRICKS);
        dropSelf(DecoBlocks.CUT_GRANITE);
        dropSelf(DecoBlocks.GRANITE_BRICKS);
        dropSelf(DecoBlocks.CUT_DIORITE);
        dropSelf(DecoBlocks.DIORITE_BRICKS);

        dropSelf(DecoBlocks.POLISHED_CALCITE_STAIRS);
        dropSelf(DecoBlocks.CUT_CALCITE_STAIRS);
        dropSelf(DecoBlocks.CALCITE_BRICK_STAIRS);

        dropSelf(DecoBlocks.CUT_ANDESITE_STAIRS);
        dropSelf(DecoBlocks.ANDESITE_BRICK_STAIRS);
        dropSelf(DecoBlocks.CUT_GRANITE_STAIRS);
        dropSelf(DecoBlocks.GRANITE_BRICK_STAIRS);
        dropSelf(DecoBlocks.CUT_DIORITE_STAIRS);
        dropSelf(DecoBlocks.DIORITE_BRICK_STAIRS);

        add(DecoBlocks.POLISHED_CALCITE_SLAB, createSlabItemTable(DecoBlocks.POLISHED_CALCITE_SLAB));
        add(DecoBlocks.CUT_CALCITE_SLAB, createSlabItemTable(DecoBlocks.CUT_CALCITE_SLAB));
        add(DecoBlocks.CALCITE_BRICK_SLAB, createSlabItemTable(DecoBlocks.CALCITE_BRICK_SLAB));

        add(DecoBlocks.CUT_ANDESITE_SLAB, createSlabItemTable(DecoBlocks.CUT_ANDESITE_SLAB));
        add(DecoBlocks.ANDESITE_BRICK_SLAB, createSlabItemTable(DecoBlocks.ANDESITE_BRICK_SLAB));
        add(DecoBlocks.CUT_GRANITE_SLAB, createSlabItemTable(DecoBlocks.CUT_GRANITE_SLAB));
        add(DecoBlocks.GRANITE_BRICK_SLAB, createSlabItemTable(DecoBlocks.GRANITE_BRICK_SLAB));
        add(DecoBlocks.CUT_DIORITE_SLAB, createSlabItemTable(DecoBlocks.CUT_DIORITE_SLAB));
        add(DecoBlocks.DIORITE_BRICK_SLAB, createSlabItemTable(DecoBlocks.DIORITE_BRICK_SLAB));

        dropSelf(DecoBlocks.POLISHED_CALCITE_WALL);
        dropSelf(DecoBlocks.CUT_CALCITE_WALL);
        dropSelf(DecoBlocks.CALCITE_BRICK_WALL);

        dropSelf(DecoBlocks.CUT_ANDESITE_WALL);
        dropSelf(DecoBlocks.ANDESITE_BRICK_WALL);
        dropSelf(DecoBlocks.CUT_GRANITE_WALL);
        dropSelf(DecoBlocks.GRANITE_BRICK_WALL);
        dropSelf(DecoBlocks.CUT_DIORITE_WALL);
        dropSelf(DecoBlocks.DIORITE_BRICK_WALL);

        dropSelf(DecoBlocks.CUT_GOLD);
        dropSelf(DecoBlocks.CUT_GOLD_STAIRS);
        add(DecoBlocks.CUT_GOLD_SLAB, createSlabItemTable(DecoBlocks.CUT_GOLD_SLAB));

        dropSelf(DecoBlocks.IRON_STAIRS);
        add(DecoBlocks.IRON_SLAB, createSlabItemTable(DecoBlocks.IRON_SLAB));

        dropSelf(DecoBlocks.GOLD_STAIRS);
        add(DecoBlocks.GOLD_SLAB, createSlabItemTable(DecoBlocks.GOLD_SLAB));

        dropSelf(DecoBlocks.COPPER_STAIRS);
        add(DecoBlocks.COPPER_SLAB, createSlabItemTable(DecoBlocks.COPPER_SLAB));

        dropSelf(DecoBlocks.EXPOSED_COPPER_STAIRS);
        add(DecoBlocks.EXPOSED_COPPER_SLAB, createSlabItemTable(DecoBlocks.EXPOSED_COPPER_SLAB));

        dropSelf(DecoBlocks.WEATHERED_COPPER_STAIRS);
        add(DecoBlocks.WEATHERED_COPPER_SLAB, createSlabItemTable(DecoBlocks.WEATHERED_COPPER_SLAB));

        dropSelf(DecoBlocks.OXIDIZED_COPPER_STAIRS);
        add(DecoBlocks.OXIDIZED_COPPER_SLAB, createSlabItemTable(DecoBlocks.OXIDIZED_COPPER_SLAB));

        dropSelf(DecoBlocks.WAXED_COPPER_STAIRS);
        add(DecoBlocks.WAXED_COPPER_SLAB, createSlabItemTable(DecoBlocks.WAXED_COPPER_SLAB));

        dropSelf(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        add(DecoBlocks.WAXED_EXPOSED_COPPER_SLAB, createSlabItemTable(DecoBlocks.WAXED_EXPOSED_COPPER_SLAB));

        dropSelf(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        add(DecoBlocks.WAXED_WEATHERED_COPPER_SLAB, createSlabItemTable(DecoBlocks.WAXED_WEATHERED_COPPER_SLAB));

        dropSelf(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
        add(DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB, createSlabItemTable(DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB));

        dropSelf(DecoBlocks.RAW_IRON_STAIRS);
        add(DecoBlocks.RAW_IRON_SLAB, createSlabItemTable(DecoBlocks.RAW_IRON_SLAB));

        dropSelf(DecoBlocks.RAW_GOLD_STAIRS);
        add(DecoBlocks.RAW_GOLD_SLAB, createSlabItemTable(DecoBlocks.RAW_GOLD_SLAB));

        dropSelf(DecoBlocks.RAW_COPPER_STAIRS);
        add(DecoBlocks.RAW_COPPER_SLAB, createSlabItemTable(DecoBlocks.RAW_COPPER_SLAB));

        dropSelf(DecoBlocks.DEEPSLATE_LEVER);
        dropSelf(DecoBlocks.COBBLED_DEEPSLATE_LEVER);
        dropSelf(DecoBlocks.POLISHED_DEEPSLATE_LEVER);

        dropSelf(DecoBlocks.STONE_LEVER);
        dropSelf(DecoBlocks.POLISHED_STONE_LEVER);

        dropSelf(DecoBlocks.BLACKSTONE_LEVER);
        dropSelf(DecoBlocks.POLISHED_BLACKSTONE_LEVER);

        dropSelf(DecoBlocks.LIGHT_GOLD_BARS);
        dropSelf(DecoBlocks.GOLD_BARS);
        dropSelf(DecoBlocks.HEAVY_GOLD_BARS);

        dropSelf(DecoBlocks.SANDED_OBSIDIAN);
        dropSelf(DecoBlocks.SANDED_OBSIDIAN_STAIRS);
        add(DecoBlocks.SANDED_OBSIDIAN_SLAB, createSlabItemTable(DecoBlocks.SANDED_OBSIDIAN_SLAB));
        dropSelf(DecoBlocks.SANDED_OBSIDIAN_WALL);

        dropSelf(DecoBlocks.SMOOTH_OBSIDIAN);
        dropSelf(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS);
        add(DecoBlocks.SMOOTH_OBSIDIAN_SLAB, createSlabItemTable(DecoBlocks.SMOOTH_OBSIDIAN_SLAB));
        dropSelf(DecoBlocks.SMOOTH_OBSIDIAN_WALL);

        dropSelf(DecoBlocks.CUT_OBSIDIAN);
        dropSelf(DecoBlocks.CUT_OBSIDIAN_STAIRS);
        add(DecoBlocks.CUT_OBSIDIAN_SLAB, createSlabItemTable(DecoBlocks.CUT_OBSIDIAN_SLAB));
        dropSelf(DecoBlocks.CUT_OBSIDIAN_WALL);

        dropSelf(DecoBlocks.CHISELED_MAGMA_BLOCK);
        dropSelf(DecoBlocks.CHISELED_BUBBLE_BLOCK);

        dropSelf(DecoBlocks.BUTTERCUP);
        createPotFlowerItemTable(DecoBlocks.POTTED_BUTTERCUP);

        dropSelf(DecoBlocks.NIGHTSHADE);
        createPotFlowerItemTable(DecoBlocks.POTTED_NIGHTSHADE);
        dropSelf(DecoBlocks.ENDERSHADE);
        createPotFlowerItemTable(DecoBlocks.POTTED_ENDERSHADE);

        dropSelf(DecoBlocks.POLISHED_END_STONE);
        dropSelf(DecoBlocks.SMOOTH_END_STONE);
        dropSelf(DecoBlocks.END_STONE_TILES);
        dropSelf(DecoBlocks.CRACKED_END_STONE_TILES);
        dropSelf(DecoBlocks.CRACKED_END_STONE_BRICKS);

        dropSelf(DecoBlocks.POLISHED_END_STONE_STAIRS);
        dropSelf(DecoBlocks.SMOOTH_END_STONE_STAIRS);
        dropSelf(DecoBlocks.END_STONE_TILE_STAIRS);

        add(DecoBlocks.POLISHED_END_STONE_SLAB, createSlabItemTable(DecoBlocks.POLISHED_END_STONE_SLAB));
        add(DecoBlocks.SMOOTH_END_STONE_SLAB, createSlabItemTable(DecoBlocks.SMOOTH_END_STONE_SLAB));
        add(DecoBlocks.END_STONE_TILE_SLAB, createSlabItemTable(DecoBlocks.END_STONE_TILE_SLAB));

        dropSelf(DecoBlocks.POLISHED_END_STONE_WALL);
        dropSelf(DecoBlocks.SMOOTH_END_STONE_WALL);
        dropSelf(DecoBlocks.END_STONE_TILE_WALL);

        dropSelf(DecoBlocks.END_STONE_PRESSURE_PLATE);
        dropSelf(DecoBlocks.END_STONE_BUTTON);
        dropSelf(DecoBlocks.END_STONE_LEVER);

        dropSelf(DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE);
        dropSelf(DecoBlocks.POLISHED_END_STONE_BUTTON);
        dropSelf(DecoBlocks.POLISHED_END_STONE_LEVER);

        dropSelf(DecoBlocks.END_STONE_FURNACE);
        dropSelf(DecoBlocks.END_STONE_BLAST_FURNACE);
        dropSelf(DecoBlocks.END_STONE_SMOKER);
        dropSelf(DecoBlocks.END_STONE_STONECUTTER);
        dropSelf(DecoBlocks.END_STONE_GRINDSTONE);

        dropSelf(DecoBlocks.CHERRY_WOOD_STAIRS);
        add(DecoBlocks.CHERRY_WOOD_SLAB, createSlabItemTable(DecoBlocks.CHERRY_WOOD_SLAB));
        dropSelf(DecoBlocks.CHERRY_WOOD_WALL);

        dropSelf(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS);
        add(DecoBlocks.STRIPPED_CHERRY_WOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_CHERRY_WOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_CHERRY_WOOD_WALL);

        dropSelf(DecoBlocks.CHERRY_NOTE_BLOCK);
        dropSelf(DecoBlocks.BAMBOO_NOTE_BLOCK);

        add(DecoBlocks.CHERRY_PALLET_DOOR, createDoorTable(DecoBlocks.CHERRY_PALLET_DOOR));
        dropSelf(DecoBlocks.CHERRY_PALLET_TRAPDOOR);

        add(DecoBlocks.BAMBOO_PALLET_DOOR, createDoorTable(DecoBlocks.BAMBOO_PALLET_DOOR));
        dropSelf(DecoBlocks.BAMBOO_PALLET_TRAPDOOR);

        dropSelf(DecoBlocks.MUSHROOM_BOOKSHELF);

        dropSelf(DecoBlocks.MUSHROOM_MOSAIC);
        dropSelf(DecoBlocks.MUSHROOM_MOSAIC_STAIRS);
        add(DecoBlocks.MUSHROOM_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.MUSHROOM_MOSAIC_SLAB));

        dropSelf(DecoBlocks.STANDING_MUSHROOM_STEM_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_CACTUS_SIGN);
        dropSelf(DecoBlocks.STANDING_MUSHROOM_MOSAIC_SIGN);

        dropSelf(DecoBlocks.HANGING_MUSHROOM_SIGN);
        dropSelf(DecoBlocks.HANGING_CACTUS_SIGN);
        dropSelf(DecoBlocks.HANGING_MUSHROOM_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_MUSHROOM_PLANKS_SIGN);

        dropSelf(DecoBlocks.OAK_BOOKSHELF_STAIRS);
        add(DecoBlocks.OAK_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.OAK_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS);
        add(DecoBlocks.SPRUCE_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.SPRUCE_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.BIRCH_BOOKSHELF_STAIRS);
        add(DecoBlocks.BIRCH_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.BIRCH_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS);
        add(DecoBlocks.JUNGLE_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.JUNGLE_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.ACACIA_BOOKSHELF_STAIRS);
        add(DecoBlocks.ACACIA_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.ACACIA_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS);
        add(DecoBlocks.DARK_OAK_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.DARK_OAK_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS);
        add(DecoBlocks.MANGROVE_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.MANGROVE_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.CHERRY_BOOKSHELF_STAIRS);
        add(DecoBlocks.CHERRY_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.CHERRY_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS);
        add(DecoBlocks.BAMBOO_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.BAMBOO_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS);
        add(DecoBlocks.CRIMSON_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.CRIMSON_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.WARPED_BOOKSHELF_STAIRS);
        add(DecoBlocks.WARPED_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.WARPED_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.CACTUS_BOOKSHELF_STAIRS);
        add(DecoBlocks.CACTUS_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.CACTUS_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS);
        add(DecoBlocks.MUSHROOM_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.MUSHROOM_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.WOODEN_BOOKSHELF_STAIRS);
        add(DecoBlocks.WOODEN_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.WOODEN_BOOKSHELF_SLAB));

        dropSelf(DecoBlocks.IRON_CAP_PLANKS);
        dropSelf(DecoBlocks.IRON_CAP_STAIRS);
        add(DecoBlocks.IRON_CAP_SLAB, createSlabItemTable(DecoBlocks.IRON_CAP_SLAB));
        dropSelf(DecoBlocks.IRON_CAP_FENCE);
        dropSelf(DecoBlocks.IRON_CAP_FENCE_GATE);
        dropSelf(DecoBlocks.IRON_CAP_PRESSURE_PLATE);
        dropSelf(DecoBlocks.IRON_CAP_BUTTON);

        add(DecoBlocks.IRON_CAP_DOOR, createDoorTable(DecoBlocks.IRON_CAP_DOOR));
        dropSelf(DecoBlocks.IRON_CAP_TRAPDOOR);
        dropSelf(DecoBlocks.IRON_CAP_MOSAIC);
        dropSelf(DecoBlocks.IRON_CAP_MOSAIC_STAIRS);
        add(DecoBlocks.IRON_CAP_MOSAIC_SLAB, createSlabItemTable(DecoBlocks.IRON_CAP_MOSAIC_SLAB));
        dropSelf(DecoBlocks.IRON_CAP_HYPHAE_STAIRS);
        add(DecoBlocks.IRON_CAP_HYPHAE_SLAB, createSlabItemTable(DecoBlocks.IRON_CAP_HYPHAE_SLAB));
        dropSelf(DecoBlocks.IRON_CAP_HYPHAE_WALL);

        dropSelf(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS);
        add(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_SLAB));
        dropSelf(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_WALL);

        dropSelf(DecoBlocks.IRON_CAP_MUSHROOM);
        createPotFlowerItemTable(DecoBlocks.POTTED_IRON_CAP_MUSHROOM);

        add(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK, block -> this.capMushroomBlockDrops(block, DecoBlocks.IRON_CAP_MUSHROOM));

        add(DecoBlocks.SPORE_IRON_ORE, block -> createSilkTouchDispatchTable(block, this.applyExplosionDecay(block,
                        LootItem.lootTableItem(Items.IRON_NUGGET)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));

        dropSelf(DecoBlocks.IRON_CAP_CRAFTING_TABLE);
        dropSelf(DecoBlocks.IRON_CAP_BARREL);
        dropSelf(DecoBlocks.IRON_CAP_LADDER);
        dropSelf(DecoBlocks.IRON_CAP_SMITHING_TABLE);
        dropSelf(DecoBlocks.IRON_CAP_CARTOGRAPHY_TABLE);
        dropSelf(DecoBlocks.IRON_CAP_NOTE_BLOCK);

        dropSelf(DecoBlocks.IRON_CAP_BOOKSHELF);

        dropSelf(DecoBlocks.IRON_CAP_BOOKSHELF_STAIRS);
        add(DecoBlocks.IRON_CAP_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.IRON_CAP_BOOKSHELF_SLAB));

        add(DecoBlocks.IRON_CAP_PALLET_DOOR, createDoorTable(DecoBlocks.IRON_CAP_PALLET_DOOR));
        dropSelf(DecoBlocks.IRON_CAP_PALLET_TRAPDOOR);

        dropSelf(DecoBlocks.STANDING_IRON_CAP_SIGN);
        dropSelf(DecoBlocks.STANDING_STRIPPED_IRON_CAP_SIGN);
        dropSelf(DecoBlocks.STANDING_IRON_CAP_MOSAIC_SIGN);

        dropSelf(DecoBlocks.HANGING_IRON_CAP_SIGN);
        dropSelf(DecoBlocks.HANGING_IRON_CAP_MOSAIC_SIGN);
        dropSelf(DecoBlocks.HANGING_IRON_CAP_PLANKS_SIGN);

        dropSelf(DecoBlocks.GOLD_GRATE);
        dropSelf(DecoBlocks.CHISELED_GOLD);

        dropSelf(DecoBlocks.TUFF_LEVER);
        dropSelf(DecoBlocks.POLISHED_TUFF_LEVER);

        dropSelf(DecoBlocks.CHISELED_END_STONE_BRICKS);

        add(DecoBlocks.WIND_BLOCK, block -> this.createSingleItemTableWithSilkTouch(block, Items.WIND_CHARGE, ConstantValue.exactly(2.0F)));
        add(DecoBlocks.EARTH_BLOCK, block -> this.createSingleItemTableWithSilkTouch(block, DecoItems.EARTH_SPHERE, ConstantValue.exactly(2.0F))); dropSelf(DecoBlocks.IRON_CAP_PLANKS);

        dropSelf(DecoBlocks.CHISELED_WIND_BLOCK);
        dropSelf(DecoBlocks.CHISELED_EARTH_BLOCK);
        dropSelf(DecoBlocks.WIND_BRICKS);
        dropSelf(DecoBlocks.EARTH_BRICKS);
        dropSelf(DecoBlocks.CHISELED_WIND_BRICKS);
        dropSelf(DecoBlocks.CHISELED_EARTH_BRICKS);

        dropSelf(DecoBlocks.WIND_STAIRS);
        add(DecoBlocks.WIND_SLAB, createSlabItemTable(DecoBlocks.WIND_SLAB));
        dropSelf(DecoBlocks.WIND_WALL);
        dropSelf(DecoBlocks.WIND_BRICK_STAIRS);
        add(DecoBlocks.WIND_BRICK_SLAB, createSlabItemTable(DecoBlocks.WIND_BRICK_SLAB));
        dropSelf(DecoBlocks.WIND_BRICK_WALL);

        dropSelf(DecoBlocks.EARTH_STAIRS);
        add(DecoBlocks.EARTH_SLAB, createSlabItemTable(DecoBlocks.EARTH_SLAB));
        dropSelf(DecoBlocks.EARTH_WALL);
        dropSelf(DecoBlocks.EARTH_BRICK_STAIRS);
        add(DecoBlocks.EARTH_BRICK_SLAB, createSlabItemTable(DecoBlocks.EARTH_BRICK_SLAB));
        dropSelf(DecoBlocks.EARTH_BRICK_WALL);

        dropSelf(DecoBlocks.PALE_OAK_NOTE_BLOCK);

        dropSelf(DecoBlocks.PALE_OAK_BOOKSHELF_STAIRS);
        add(DecoBlocks.PALE_OAK_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.PALE_OAK_BOOKSHELF_SLAB));

        add(DecoBlocks.PALE_OAK_PALLET_DOOR, createDoorTable(DecoBlocks.PALE_OAK_PALLET_DOOR));
        dropSelf(DecoBlocks.PALE_OAK_PALLET_TRAPDOOR);

        dropSelf(DecoBlocks.PALE_OAK_WOOD_STAIRS);
        add(DecoBlocks.PALE_OAK_WOOD_SLAB, createSlabItemTable(DecoBlocks.PALE_OAK_WOOD_SLAB));
        dropSelf(DecoBlocks.PALE_OAK_WOOD_WALL);

        dropSelf(DecoBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS);
        add(DecoBlocks.STRIPPED_PALE_OAK_WOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_PALE_OAK_WOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_PALE_OAK_WOOD_WALL);

        dropSelf(DecoBlocks.DRIFTWOOD_NOTE_BLOCK);

        dropSelf(DecoBlocks.DRIFTWOOD_BOOKSHELF_STAIRS);
        add(DecoBlocks.DRIFTWOOD_BOOKSHELF_SLAB, createSlabItemTable(DecoBlocks.DRIFTWOOD_BOOKSHELF_SLAB));

        add(DecoBlocks.DRIFTWOOD_PALLET_DOOR, createDoorTable(DecoBlocks.DRIFTWOOD_PALLET_DOOR));
        dropSelf(DecoBlocks.DRIFTWOOD_PALLET_TRAPDOOR);

        dropSelf(DecoBlocks.DRIFTWOOD_LOG_STAIRS);
        add(DecoBlocks.DRIFTWOOD_LOG_SLAB, createSlabItemTable(DecoBlocks.DRIFTWOOD_LOG_SLAB));
        dropSelf(DecoBlocks.DRIFTWOOD_LOG_WALL);

        dropSelf(DecoBlocks.DRIED_DRIFTWOOD_STAIRS);
        add(DecoBlocks.DRIED_DRIFTWOOD_SLAB, createSlabItemTable(DecoBlocks.DRIED_DRIFTWOOD_SLAB));
        dropSelf(DecoBlocks.DRIED_DRIFTWOOD_WALL);

        dropSelf(DecoBlocks.STRIPPED_DRIFTWOOD_STAIRS);
        add(DecoBlocks.STRIPPED_DRIFTWOOD_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_DRIFTWOOD_SLAB));
        dropSelf(DecoBlocks.STRIPPED_DRIFTWOOD_WALL);

        add(DecoBlocks.ROUGE_WILDFLOWERS, this.createSegmentedBlockDrops(DecoBlocks.ROUGE_WILDFLOWERS));
        add(DecoBlocks.SWEET_WILDFLOWERS, this.createSegmentedBlockDrops(DecoBlocks.SWEET_WILDFLOWERS));
        add(DecoBlocks.GECKO_WILDFLOWERS, this.createSegmentedBlockDrops(DecoBlocks.GECKO_WILDFLOWERS));

        dropSelf(DecoBlocks.PACKED_GRASS);
        dropSelf(DecoBlocks.PACKED_MYCELIUM);
        dropSelf(DecoBlocks.PACKED_PODZOL);
        dropSelf(DecoBlocks.PACKED_CRIMSON_NYLIUM);
        dropSelf(DecoBlocks.PACKED_WARPED_NYLIUM);

        dropSelf(DecoBlocks.GRASS_CARPET);
        dropSelf(DecoBlocks.MYCELIUM_CARPET);
        dropSelf(DecoBlocks.PODZOL_CARPET);
        dropSelf(DecoBlocks.CRIMSON_NYLIUM_CARPET);
        dropSelf(DecoBlocks.WARPED_NYLIUM_CARPET);

        dropSelf(DecoBlocks.GRASS_STAIRS);
        dropSelf(DecoBlocks.PODZOL_STAIRS);
        dropSelf(DecoBlocks.MYCELIUM_STAIRS);
        dropSelf(DecoBlocks.CRIMSON_NYLIUM_STAIRS);
        dropSelf(DecoBlocks.WARPED_NYLIUM_STAIRS);
        dropSelf(DecoBlocks.DIRT_STAIRS);
        dropSelf(DecoBlocks.COARSE_DIRT_STAIRS);
        dropSelf(DecoBlocks.ROOTED_DIRT_STAIRS);
        dropSelf(DecoBlocks.MUD_STAIRS);
        dropSelf(DecoBlocks.CLAY_STAIRS);
        dropSelf(DecoBlocks.BONE_STAIRS);
        dropSelf(DecoBlocks.MOSS_STAIRS);

        add(DecoBlocks.GRASS_SLAB, createSlabItemTable(DecoBlocks.GRASS_SLAB));
        add(DecoBlocks.PODZOL_SLAB, createSlabItemTable(DecoBlocks.PODZOL_SLAB));
        add(DecoBlocks.MYCELIUM_SLAB, createSlabItemTable(DecoBlocks.MYCELIUM_SLAB));
        add(DecoBlocks.CRIMSON_NYLIUM_SLAB, createSlabItemTable(DecoBlocks.CRIMSON_NYLIUM_SLAB));
        add(DecoBlocks.WARPED_NYLIUM_SLAB, createSlabItemTable(DecoBlocks.WARPED_NYLIUM_SLAB));
        add(DecoBlocks.MOSS_SLAB, createSlabItemTable(DecoBlocks.MOSS_SLAB));
        add(DecoBlocks.DIRT_SLAB, createSlabItemTable(DecoBlocks.DIRT_SLAB));
        add(DecoBlocks.COARSE_DIRT_SLAB, createSlabItemTable(DecoBlocks.COARSE_DIRT_SLAB));
        add(DecoBlocks.ROOTED_DIRT_SLAB, createSlabItemTable(DecoBlocks.ROOTED_DIRT_SLAB));
        add(DecoBlocks.MUD_SLAB, createSlabItemTable(DecoBlocks.MUD_SLAB));
        add(DecoBlocks.CLAY_SLAB, createSlabItemTable(DecoBlocks.CLAY_SLAB));
        add(DecoBlocks.BONE_SLAB, createSlabItemTable(DecoBlocks.BONE_SLAB));

        dropSelf(DecoBlocks.DIRT_WALL);
        dropSelf(DecoBlocks.COARSE_DIRT_WALL);
        dropSelf(DecoBlocks.ROOTED_DIRT_WALL);
        dropSelf(DecoBlocks.MUD_WALL);
        dropSelf(DecoBlocks.CLAY_WALL);
        dropSelf(DecoBlocks.BONE_WALL);

        dropSelf(DecoBlocks.CLOUD_BLOCK);

        dropSelf(DecoBlocks.SOLID_CLOUD);
        dropSelf(DecoBlocks.CLOUD_STAIRS);
        add(DecoBlocks.CLOUD_SLAB, createSlabItemTable(DecoBlocks.BEDROCK_SLAB));
        dropSelf(DecoBlocks.CLOUD_WALL);

        dropSelf(DecoBlocks.CLOUD_BRICKS);
        dropSelf(DecoBlocks.CLOUD_BRICK_STAIRS);
        add(DecoBlocks.CLOUD_BRICK_SLAB, createSlabItemTable(DecoBlocks.BEDROCK_SLAB));
        dropSelf(DecoBlocks.CLOUD_BRICK_WALL);

        dropSelf(DecoBlocks.CHISELED_CLOUD_BRICKS);

        dropSelf(DecoBlocks.IRON_LADDER);
        dropSelf(DecoBlocks.GOLDEN_LADDER);

        dropSelf(DecoBlocks.COPPER_LADDER);
        dropSelf(DecoBlocks.WAXED_COPPER_LADDER);

        dropSelf(DecoBlocks.EXPOSED_COPPER_LADDER);
        dropSelf(DecoBlocks.WAXED_EXPOSED_COPPER_LADDER);

        dropSelf(DecoBlocks.WEATHERED_COPPER_LADDER);
        dropSelf(DecoBlocks.WAXED_WEATHERED_COPPER_LADDER);

        dropSelf(DecoBlocks.OXIDIZED_COPPER_LADDER);
        dropSelf(DecoBlocks.WAXED_OXIDIZED_COPPER_LADDER);

        dropSelf(DecoBlocks.ALPINE_POPPY);
        createPotFlowerItemTable(DecoBlocks.POTTED_ALPINE_POPPY);
        dropSelf(DecoBlocks.DEAD_EYE_DAISY);
        createPotFlowerItemTable(DecoBlocks.POTTED_DEAD_EYE_DAISY);
        dropSelf(DecoBlocks.POPPED_BLUET);
        createPotFlowerItemTable(DecoBlocks.POTTED_POPPED_BLUET);

        dropSelf(DecoBlocks.WHITE_WOOL_STAIRS);
        add(DecoBlocks.WHITE_WOOL_SLAB, createSlabItemTable(DecoBlocks.WHITE_WOOL_SLAB));
        dropSelf(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS);
        add(DecoBlocks.LIGHT_GRAY_WOOL_SLAB, createSlabItemTable(DecoBlocks.LIGHT_GRAY_WOOL_SLAB));
        dropSelf(DecoBlocks.GRAY_WOOL_STAIRS);
        add(DecoBlocks.GRAY_WOOL_SLAB, createSlabItemTable(DecoBlocks.GRAY_WOOL_SLAB));
        dropSelf(DecoBlocks.BLACK_WOOL_STAIRS);
        add(DecoBlocks.BLACK_WOOL_SLAB, createSlabItemTable(DecoBlocks.BLACK_WOOL_SLAB));
        dropSelf(DecoBlocks.BROWN_WOOL_STAIRS);
        add(DecoBlocks.BROWN_WOOL_SLAB, createSlabItemTable(DecoBlocks.BROWN_WOOL_SLAB));
        dropSelf(DecoBlocks.RED_WOOL_STAIRS);
        add(DecoBlocks.RED_WOOL_SLAB, createSlabItemTable(DecoBlocks.RED_WOOL_SLAB));
        dropSelf(DecoBlocks.ORANGE_WOOL_STAIRS);
        add(DecoBlocks.ORANGE_WOOL_SLAB, createSlabItemTable(DecoBlocks.ORANGE_WOOL_SLAB));
        dropSelf(DecoBlocks.YELLOW_WOOL_STAIRS);
        add(DecoBlocks.YELLOW_WOOL_SLAB, createSlabItemTable(DecoBlocks.YELLOW_WOOL_SLAB));
        dropSelf(DecoBlocks.LIME_WOOL_STAIRS);
        add(DecoBlocks.LIME_WOOL_SLAB, createSlabItemTable(DecoBlocks.LIME_WOOL_SLAB));
        dropSelf(DecoBlocks.GREEN_WOOL_STAIRS);
        add(DecoBlocks.GREEN_WOOL_SLAB, createSlabItemTable(DecoBlocks.GREEN_WOOL_SLAB));
        dropSelf(DecoBlocks.CYAN_WOOL_STAIRS);
        add(DecoBlocks.CYAN_WOOL_SLAB, createSlabItemTable(DecoBlocks.CYAN_WOOL_SLAB));
        dropSelf(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS);
        add(DecoBlocks.LIGHT_BLUE_WOOL_SLAB, createSlabItemTable(DecoBlocks.LIGHT_BLUE_WOOL_SLAB));
        dropSelf(DecoBlocks.BLUE_WOOL_STAIRS);
        add(DecoBlocks.BLUE_WOOL_SLAB, createSlabItemTable(DecoBlocks.BLUE_WOOL_SLAB));
        dropSelf(DecoBlocks.PURPLE_WOOL_STAIRS);
        add(DecoBlocks.PURPLE_WOOL_SLAB, createSlabItemTable(DecoBlocks.PURPLE_WOOL_SLAB));
        dropSelf(DecoBlocks.MAGENTA_WOOL_STAIRS);
        add(DecoBlocks.MAGENTA_WOOL_SLAB, createSlabItemTable(DecoBlocks.MAGENTA_WOOL_SLAB));
        dropSelf(DecoBlocks.PINK_WOOL_STAIRS);
        add(DecoBlocks.PINK_WOOL_SLAB, createSlabItemTable(DecoBlocks.PINK_WOOL_SLAB));

        dropSelf(DecoBlocks.CRACKED_STONE_BRICK_STAIRS);
        add(DecoBlocks.CRACKED_STONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.CRACKED_STONE_BRICK_SLAB));
        dropSelf(DecoBlocks.CRACKED_STONE_BRICK_WALL);

        dropSelf(DecoBlocks.CRACKED_STONE_TILE_STAIRS);
        add(DecoBlocks.CRACKED_STONE_TILE_SLAB, createSlabItemTable(DecoBlocks.CRACKED_STONE_TILE_SLAB));
        dropSelf(DecoBlocks.CRACKED_STONE_TILE_WALL);

        dropSelf(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        add(DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, createSlabItemTable(DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB));
        dropSelf(DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL);

        dropSelf(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        add(DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB, createSlabItemTable(DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB));
        dropSelf(DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL);

        dropSelf(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS);
        add(DecoBlocks.CRACKED_END_STONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.CRACKED_END_STONE_BRICK_SLAB));
        dropSelf(DecoBlocks.CRACKED_END_STONE_BRICK_WALL);

        dropSelf(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS);
        add(DecoBlocks.CRACKED_END_STONE_TILE_SLAB, createSlabItemTable(DecoBlocks.CRACKED_END_STONE_TILE_SLAB));
        dropSelf(DecoBlocks.CRACKED_END_STONE_TILE_WALL);

        dropSelf(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        add(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB));
        dropSelf(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);

        dropSelf(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS);
        add(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB, createSlabItemTable(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB));
        dropSelf(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL);

        dropSelf(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS);
        add(DecoBlocks.CRACKED_NETHER_BRICK_SLAB, createSlabItemTable(DecoBlocks.CRACKED_NETHER_BRICK_SLAB));
        dropSelf(DecoBlocks.CRACKED_NETHER_BRICK_WALL);

        dropSelf(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS);
        add(DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB, createSlabItemTable(DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB));
        dropSelf(DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL);

        dropSelf(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS);
        add(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, createSlabItemTable(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB));
        dropSelf(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL);

        dropSelf(DecoBlocks.CRACKED_NETHER_BRICK_FENCE);
        dropSelf(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE);
        dropSelf(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE);

        dropSelf(DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);
        dropSelf(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE);
        dropSelf(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE);

        dropSelf(DecoBlocks.CRACKED_TUFF_BRICK_STAIRS);
        add(DecoBlocks.CRACKED_TUFF_BRICK_SLAB, createSlabItemTable(DecoBlocks.CRACKED_TUFF_BRICK_SLAB));
        dropSelf(DecoBlocks.CRACKED_TUFF_BRICK_WALL);

        dropSelf(DecoBlocks.CRACKED_TUFF_TILE_STAIRS);
        add(DecoBlocks.CRACKED_TUFF_TILE_SLAB, createSlabItemTable(DecoBlocks.CRACKED_TUFF_TILE_SLAB));
        dropSelf(DecoBlocks.CRACKED_TUFF_TILE_WALL);

        dropSelf(DecoBlocks.PALE_MOSS_STAIRS);
        add(DecoBlocks.PALE_MOSS_SLAB, createSlabItemTable(DecoBlocks.PALE_MOSS_SLAB));

        dropSelf(DecoBlocks.RESIN_STAIRS);
        add(DecoBlocks.RESIN_SLAB, createSlabItemTable(DecoBlocks.RESIN_SLAB));
        dropSelf(DecoBlocks.RESIN_WALL);

        dropSelf(DecoBlocks.SMOOTH_RESIN);
        dropSelf(DecoBlocks.SMOOTH_RESIN_STAIRS);
        add(DecoBlocks.SMOOTH_RESIN_SLAB, createSlabItemTable(DecoBlocks.SMOOTH_RESIN_SLAB));
        dropSelf(DecoBlocks.SMOOTH_RESIN_WALL);

        dropSelf(DecoBlocks.HAZZY_BLUET);
        createPotFlowerItemTable(DecoBlocks.POTTED_HAZZY_BLUET);
        dropSelf(DecoBlocks.DRILL_LAVENDER);
        createPotFlowerItemTable(DecoBlocks.POTTED_DRILL_LAVENDER);

        add(DecoBlocks.DRY_GRASS_BLOCK,block -> this.createSingleItemTableWithSilkTouch(block, Blocks.DIRT));

        dropSelf(DecoBlocks.PACKED_DRY_GRASS);
        dropSelf(DecoBlocks.DRY_GRASS_CARPET);
        dropSelf(DecoBlocks.DRY_GRASS_STAIRS);
        add(DecoBlocks.DRY_GRASS_SLAB, createSlabItemTable(DecoBlocks.DRY_GRASS_SLAB));

        dropSelf(DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
        dropSelf(DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
        add(DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, createSlabItemTable(DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB));
        dropSelf(DecoBlocks.MOSSY_DEEPSLATE_BRICK_WALL);

        dropSelf(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        dropSelf(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS);
        add(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB));
        dropSelf(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL);

        dropSelf(DecoBlocks.MOSSY_END_STONE_BRICKS);
        dropSelf(DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS);
        add(DecoBlocks.MOSSY_END_STONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.MOSSY_END_STONE_BRICK_SLAB));
        dropSelf(DecoBlocks.MOSSY_END_STONE_BRICK_WALL);

        dropSelf(DecoBlocks.LAPIS_STAIRS);
        add(DecoBlocks.LAPIS_SLAB, createSlabItemTable(DecoBlocks.LAPIS_SLAB));
        dropSelf(DecoBlocks.LAPIS_WALL);

        dropSelf(DecoBlocks.LAPIS_BRICKS);
        dropSelf(DecoBlocks.LAPIS_BRICK_STAIRS);
        add(DecoBlocks.LAPIS_BRICK_SLAB, createSlabItemTable(DecoBlocks.LAPIS_BRICK_SLAB));
        dropSelf(DecoBlocks.LAPIS_BRICK_WALL);

        dropSelf(DecoBlocks.CUT_LAPIS);
        dropSelf(DecoBlocks.CUT_LAPIS_STAIRS);
        add(DecoBlocks.CUT_LAPIS_SLAB, createSlabItemTable(DecoBlocks.CUT_LAPIS_SLAB));
        dropSelf(DecoBlocks.CUT_LAPIS_WALL);

        dropSelf(DecoBlocks.SMOOTH_LAPIS);
        dropSelf(DecoBlocks.SMOOTH_LAPIS_STAIRS);
        add(DecoBlocks.SMOOTH_LAPIS_SLAB, createSlabItemTable(DecoBlocks.SMOOTH_LAPIS_SLAB));
        dropSelf(DecoBlocks.SMOOTH_LAPIS_WALL);

        dropSelf(DecoBlocks.CHISELED_LAPIS);
        dropSelf(DecoBlocks.LAPIS_PILLAR);

        otherWhenSilkTouch(DecoBlocks.INFESTED_MOSSY_DEEPSLATE_BRICKS, DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
        otherWhenSilkTouch(DecoBlocks.INFESTED_MOSSY_POLISHED_BLACKSTONE_BRICKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);

        otherWhenSilkTouch(DecoBlocks.INFESTED_CUT_ANDESITE, DecoBlocks.CUT_ANDESITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_ANDESITE_BRICKS, DecoBlocks.ANDESITE_BRICKS);

        otherWhenSilkTouch(DecoBlocks.INFESTED_CUT_GRANITE, DecoBlocks.CUT_GRANITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_GRANITE_BRICKS, DecoBlocks.GRANITE_BRICKS);

        otherWhenSilkTouch(DecoBlocks.INFESTED_CUT_DIORITE, DecoBlocks.CUT_DIORITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_DIORITE_BRICKS, DecoBlocks.DIORITE_BRICKS);

        otherWhenSilkTouch(DecoBlocks.INFESTED_POLISHED_CALCITE, DecoBlocks.POLISHED_CALCITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CUT_CALCITE, DecoBlocks.CUT_CALCITE);
        otherWhenSilkTouch(DecoBlocks.INFESTED_CALCITE_BRICKS, DecoBlocks.CALCITE_BRICKS);

        dropSelf(DecoBlocks.IRIS);
        createPotFlowerItemTable(DecoBlocks.POTTED_IRIS);
        dropSelf(DecoBlocks.BLUE_DELPHINIUM);
        createPotFlowerItemTable(DecoBlocks.POTTED_BLUE_DELPHINIUM);
        dropSelf(DecoBlocks.CYAN_ORCHID);
        createPotFlowerItemTable(DecoBlocks.POTTED_CYAN_ORCHID);
        dropSelf(DecoBlocks.FELICIA_DAISY);
        createPotFlowerItemTable(DecoBlocks.POTTED_FELICIA_DAISY);

        dropSelf(DecoBlocks.JACK_O_SOUL_LANTERN);

        dropSelf(DecoBlocks.NETHER_BRICK_PILLAR);
        dropSelf(DecoBlocks.RED_NETHER_BRICK_PILLAR);
        dropSelf(DecoBlocks.BLUE_NETHER_BRICK_PILLAR);

        dropSelf(DecoBlocks.DRIPSTONE_BRICKS);
        dropSelf(DecoBlocks.DRIPSTONE_BRICK_PILLAR);
        dropSelf(DecoBlocks.VOID_STONE_BRICK_PILLAR);

        dropSelf(DecoBlocks.CASTED_IRON);
        dropSelf(DecoBlocks.CASTED_IRON_STAIRS);
        add(DecoBlocks.CASTED_IRON_SLAB, createSlabItemTable(DecoBlocks.CASTED_IRON_SLAB));

        dropSelf(DecoBlocks.DRIPSTONE_BRICK_STAIRS);
        dropSelf(DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS);
        dropSelf(DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS);

        add(DecoBlocks.DRIPSTONE_BRICK_SLAB, createSlabItemTable(DecoBlocks.DRIPSTONE_BRICK_SLAB));
        add(DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB, createSlabItemTable(DecoBlocks.DRIPSTONE_BRICK_SLAB));
        add(DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB, createSlabItemTable(DecoBlocks.DRIPSTONE_BRICK_SLAB));

        dropSelf(DecoBlocks.DRIPSTONE_BRICK_WALL);
        dropSelf(DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL);
        dropSelf(DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL);

        dropSelf(DecoBlocks.CHISELED_DRIPSTONE);

        dropSelf(DecoBlocks.TUBE_CORAL_STAIRS);
        add(DecoBlocks.TUBE_CORAL_SLAB, createSlabItemTable(DecoBlocks.TUBE_CORAL_SLAB));
        dropSelf(DecoBlocks.TUBE_CORAL_WALL);

        dropSelf(DecoBlocks.BRAIN_CORAL_STAIRS);
        add(DecoBlocks.BRAIN_CORAL_SLAB, createSlabItemTable(DecoBlocks.BRAIN_CORAL_SLAB));
        dropSelf(DecoBlocks.BRAIN_CORAL_WALL);

        dropSelf(DecoBlocks.BUBBLE_CORAL_STAIRS);
        add(DecoBlocks.BUBBLE_CORAL_SLAB, createSlabItemTable(DecoBlocks.BUBBLE_CORAL_SLAB));
        dropSelf(DecoBlocks.BUBBLE_CORAL_WALL);

        dropSelf(DecoBlocks.FIRE_CORAL_STAIRS);
        add(DecoBlocks.FIRE_CORAL_SLAB, createSlabItemTable(DecoBlocks.FIRE_CORAL_SLAB));
        dropSelf(DecoBlocks.FIRE_CORAL_WALL);

        dropSelf(DecoBlocks.HORN_CORAL_STAIRS);
        add(DecoBlocks.HORN_CORAL_SLAB, createSlabItemTable(DecoBlocks.HORN_CORAL_SLAB));
        dropSelf(DecoBlocks.HORN_CORAL_WALL);

        dropSelf(DecoBlocks.DEAD_TUBE_CORAL_STAIRS);
        add(DecoBlocks.DEAD_TUBE_CORAL_SLAB, createSlabItemTable(DecoBlocks.DEAD_TUBE_CORAL_SLAB));
        dropSelf(DecoBlocks.DEAD_TUBE_CORAL_WALL);

        dropSelf(DecoBlocks.DEAD_BRAIN_CORAL_STAIRS);
        add(DecoBlocks.DEAD_BRAIN_CORAL_SLAB, createSlabItemTable(DecoBlocks.DEAD_BRAIN_CORAL_SLAB));
        dropSelf(DecoBlocks.DEAD_BRAIN_CORAL_WALL);

        dropSelf(DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS);
        add(DecoBlocks.DEAD_BUBBLE_CORAL_SLAB, createSlabItemTable(DecoBlocks.DEAD_BUBBLE_CORAL_SLAB));
        dropSelf(DecoBlocks.DEAD_BUBBLE_CORAL_WALL);

        dropSelf(DecoBlocks.DEAD_FIRE_CORAL_STAIRS);
        add(DecoBlocks.DEAD_FIRE_CORAL_SLAB, createSlabItemTable(DecoBlocks.DEAD_FIRE_CORAL_SLAB));
        dropSelf(DecoBlocks.DEAD_FIRE_CORAL_WALL);

        dropSelf(DecoBlocks.DEAD_HORN_CORAL_STAIRS);
        add(DecoBlocks.DEAD_HORN_CORAL_SLAB, createSlabItemTable(DecoBlocks.DEAD_HORN_CORAL_SLAB));
        dropSelf(DecoBlocks.DEAD_HORN_CORAL_WALL);

        otherWhenSilkTouch(DecoBlocks.HYDRATED_TUBE_CORAL, Blocks.TUBE_CORAL);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_BRAIN_CORAL, Blocks.BRAIN_CORAL);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_BUBBLE_CORAL, Blocks.BUBBLE_CORAL);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_FIRE_CORAL, Blocks.FIRE_CORAL);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_HORN_CORAL, Blocks.HORN_CORAL);

        otherWhenSilkTouch(DecoBlocks.HYDRATED_TUBE_CORAL_FAN, Blocks.TUBE_CORAL_FAN);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_BRAIN_CORAL_FAN, Blocks.BRAIN_CORAL_FAN);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_BUBBLE_CORAL_FAN, Blocks.BUBBLE_CORAL_FAN);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_FIRE_CORAL_FAN, Blocks.FIRE_CORAL_FAN);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_HORN_CORAL_FAN, Blocks.HORN_CORAL_FAN);

        otherWhenSilkTouch(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK, Blocks.TUBE_CORAL_BLOCK);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK, Blocks.BRAIN_CORAL_BLOCK);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK, Blocks.BUBBLE_CORAL_BLOCK);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK, Blocks.FIRE_CORAL_BLOCK);
        otherWhenSilkTouch(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK, Blocks.HORN_CORAL_BLOCK);

        dropSelf(DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS);
        add(DecoBlocks.HYDRATED_TUBE_CORAL_SLAB, createSlabItemTable(DecoBlocks.HYDRATED_TUBE_CORAL_SLAB));
        dropSelf(DecoBlocks.HYDRATED_TUBE_CORAL_WALL);

        dropSelf(DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS);
        add(DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB, createSlabItemTable(DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB));
        dropSelf(DecoBlocks.HYDRATED_BRAIN_CORAL_WALL);

        dropSelf(DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS);
        add(DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB, createSlabItemTable(DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB));
        dropSelf(DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL);

        dropSelf(DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS);
        add(DecoBlocks.HYDRATED_FIRE_CORAL_SLAB, createSlabItemTable(DecoBlocks.HYDRATED_FIRE_CORAL_SLAB));
        dropSelf(DecoBlocks.HYDRATED_FIRE_CORAL_WALL);

        dropSelf(DecoBlocks.HYDRATED_HORN_CORAL_STAIRS);
        add(DecoBlocks.HYDRATED_HORN_CORAL_SLAB, createSlabItemTable(DecoBlocks.HYDRATED_HORN_CORAL_SLAB));
        dropSelf(DecoBlocks.HYDRATED_HORN_CORAL_WALL);

        dropSelf(DecoBlocks.HAY_STAIRS);
        add(DecoBlocks.HAY_SLAB, createSlabItemTable(DecoBlocks.HAY_SLAB));
        dropSelf(DecoBlocks.HAY_CARPET);

        dropSelf(DecoBlocks.NETHER_WART_STAIRS);
        add(DecoBlocks.NETHER_WART_SLAB, createSlabItemTable(DecoBlocks.NETHER_WART_SLAB));
        dropSelf(DecoBlocks.WARPED_WART_STAIRS);
        add(DecoBlocks.WARPED_WART_SLAB, createSlabItemTable(DecoBlocks.WARPED_WART_SLAB));

        dropSelf(DecoBlocks.SCULK_STAIRS);
        add(DecoBlocks.SCULK_SLAB, createSlabItemTable(DecoBlocks.SCULK_SLAB));
        dropSelf(DecoBlocks.SCULK_CARPET);

        dropSelf(DecoBlocks.HONEYCOMB_STAIRS);
        add(DecoBlocks.HONEYCOMB_SLAB, createSlabItemTable(DecoBlocks.HONEYCOMB_SLAB));
        dropSelf(DecoBlocks.HONEYCOMB_WALL);

        dropSelf(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_GRAY_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_BLACK_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_BROWN_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_RED_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_LIME_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_GREEN_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_CYAN_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_BLUE_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);
        dropSelf(DecoBlocks.DUEL_CUT_PINK_CONCRETE);

        dropSelf(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_RED_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_LIME_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_WALL);
        dropSelf(DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS);
        add(DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB));
        dropSelf(DecoBlocks.DUEL_CUT_PINK_CONCRETE_WALL);

        dropSelf(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_GRAY_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_BLACK_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_BROWN_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_RED_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_YELLOW_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_ORANGE_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_LIME_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_GREEN_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_CYAN_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_BLUE_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_PURPLE_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_MAGENTA_CONCRETE);
        dropSelf(DecoBlocks.CHECKERED_PINK_CONCRETE);

        dropSelf(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_GRAY_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_BLACK_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_BROWN_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_RED_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_RED_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_RED_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_ORANGE_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_YELLOW_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_LIME_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_GREEN_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_CYAN_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_BLUE_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_PURPLE_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_WALL);
        dropSelf(DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS);
        add(DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB, createSlabItemTable(DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB));
        dropSelf(DecoBlocks.CHECKERED_PINK_CONCRETE_WALL);

        dropSelf(DecoBlocks.BAMBOO_BLOCK_STAIRS);
        add(DecoBlocks.BAMBOO_BLOCK_SLAB, createSlabItemTable(DecoBlocks.BAMBOO_BLOCK_SLAB));
        dropSelf(DecoBlocks.BAMBOO_BLOCK_WALL);

        dropSelf(DecoBlocks.STRIPPED_BAMBOO_STAIRS);
        add(DecoBlocks.STRIPPED_BAMBOO_SLAB, createSlabItemTable(DecoBlocks.STRIPPED_BAMBOO_SLAB));
        dropSelf(DecoBlocks.STRIPPED_BAMBOO_WALL);

        add(DecoBlocks.MEGA_BROWN_TULIP, block -> this.createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));

        dropSelf(DecoBlocks.MOSSY_TUFF_BRICKS);
        dropSelf(DecoBlocks.MOSSY_TUFF_BRICK_STAIRS);
        add(DecoBlocks.MOSSY_TUFF_BRICK_SLAB, createSlabItemTable(DecoBlocks.MOSSY_TUFF_BRICK_SLAB));
        dropSelf(DecoBlocks.MOSSY_TUFF_BRICK_WALL);
    }
    public LootTable.Builder capMushroomBlockDrops(Block dropWithSilkTouch, ItemLike drop) {
        return createSilkTouchDispatchTable(
                dropWithSilkTouch,
                this.applyExplosionDecay(
                        dropWithSilkTouch,
                        LootItem.lootTableItem(drop)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(-2.0F, 1.0F)))
                                .apply(LimitCount.limitCount(IntRange.lowerBound(0)))
                )
        );
    }
}
