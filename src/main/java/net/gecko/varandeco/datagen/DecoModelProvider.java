package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.nature.WarpedWartBlock;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.world.level.block.Blocks;

public class DecoModelProvider extends FabricModelProvider {
    public DecoModelProvider(FabricPackOutput output) {
        super(output);
    }

    // Thanks to PedalHat29861 Packed Grass is now has a Colour Base on the Biomes


    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(DecoItems.SNOW_BRICK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.BUBBLE_ORB, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.EARTH_SPHERE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.ICE_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.ANCIENT_ROSE_SEEDS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.TALL_SEAGRASS, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(DecoItems.MIGHTY_LAVENDER_FLOWER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.LILAC_FLOWER, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerator.generateFlatItem(DecoItems.PASSTOL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.SHADDOL, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(DecoItems.CACTUS_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.CACTUS_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.MUSHROOM_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.MUSHROOM_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.WOODEN_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.WOODEN_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.CRIMSON_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.CRIMSON_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.WARPED_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.WARPED_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.DRIFTWOOD_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.DRIFTWOOD_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.DRIFTWOOD_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.DRIFTWOOD_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.BAMBOO_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.BAMBOO_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(DecoItems.OAK_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.OAK_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.BIRCH_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.BIRCH_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.SPRUCE_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.SPRUCE_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.JUNGLE_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.JUNGLE_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.ACACIA_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.ACACIA_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.DARK_OAK_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.DARK_OAK_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.MANGROVE_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.MANGROVE_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.CHERRY_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.CHERRY_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.PALE_OAK_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.PALE_OAK_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.CRIMSON_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.CRIMSON_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.WARPED_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.WARPED_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.CACTUS_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.CACTUS_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.MUSHROOM_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.MUSHROOM_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.WOODEN_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.WOODEN_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.IRON_CAP_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.IRON_CAP_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.IRON_CAP_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DecoItems.IRON_CAP_CHEST_RAFT, ModelTemplates.FLAT_ITEM);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createTrivialCube(DecoBlocks.POLISHED_GLIDED_BLACKSTONE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_GLIDED_BLACKSTONE);
        BlockModelGenerators.BlockFamilyProvider andesitepool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_ANDESITE_TEMP);
        BlockModelGenerators.BlockFamilyProvider dioritepool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_DIORITE_TEMP);
        BlockModelGenerators.BlockFamilyProvider granitepool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_GRANITE_TEMP);
        BlockModelGenerators.BlockFamilyProvider stonepool =
                blockStateModelGenerator.family(DecoBlocks.STONE_TEMP);
        BlockModelGenerators.BlockFamilyProvider smstonepool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_STONE_TEMP);
        BlockModelGenerators.BlockFamilyProvider calcitepool =
                blockStateModelGenerator.family(DecoBlocks.CALCITE_TEMP);
        BlockModelGenerators.BlockFamilyProvider dripstonepool =
                blockStateModelGenerator.family(DecoBlocks.DRIPSTONE_TEMP);
        BlockModelGenerators.BlockFamilyProvider packmudpool =
                blockStateModelGenerator.family(DecoBlocks.PACKED_MUD_TEMP);
        BlockModelGenerators.BlockFamilyProvider polistonepool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_STONE);
        BlockModelGenerators.BlockFamilyProvider stonetilepool =
                blockStateModelGenerator.family(DecoBlocks.STONE_TILES);
        BlockModelGenerators.BlockFamilyProvider netherbrickpool =
                blockStateModelGenerator.family(DecoBlocks.NETHER_BRICKS_TEMP);
        BlockModelGenerators.BlockFamilyProvider rednetherbrickpool =
                blockStateModelGenerator.family(DecoBlocks.RED_NETHER_BRICKS_TEMP);
        BlockModelGenerators.BlockFamilyProvider netherrackpool =
                blockStateModelGenerator.family(DecoBlocks.NETHERRACK_TEMP);
        BlockModelGenerators.BlockFamilyProvider magmapool =
                blockStateModelGenerator.family(DecoBlocks.MAGMA_TEMP);
        BlockModelGenerators.BlockFamilyProvider magmabrickpool =
                blockStateModelGenerator.family(DecoBlocks.MAGMA_BRICKS);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_MAGMA_BRICKS, TexturedModel.CUBE_TOP_BOTTOM);
        BlockModelGenerators.BlockFamilyProvider blackstonetilepool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_BLACKSTONE_TILES);
        BlockModelGenerators.BlockFamilyProvider snowpool =
                blockStateModelGenerator.family(DecoBlocks.SNOW_TEMP);
        BlockModelGenerators.BlockFamilyProvider packicepool =
                blockStateModelGenerator.family(DecoBlocks.PACKED_ICE_TEMP);
        BlockModelGenerators.BlockFamilyProvider blueicepool =
                blockStateModelGenerator.family(DecoBlocks.BLUE_ICE_TEMP);
        BlockModelGenerators.BlockFamilyProvider snowbrickpool =
                blockStateModelGenerator.family(DecoBlocks.SNOW_BRICKS);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_SNOW_BRICKS, TexturedModel.COLUMN);
        BlockModelGenerators.BlockFamilyProvider icebrickpool =
                blockStateModelGenerator.family(DecoBlocks.ICE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.BLACK_ICE);
        BlockModelGenerators.BlockFamilyProvider smoothsandstonepool =
                blockStateModelGenerator.family(DecoBlocks.SANDSTONE_TOP_TEMP);
        BlockModelGenerators.BlockFamilyProvider smoothredsandstonepool =
                blockStateModelGenerator.family(DecoBlocks.RED_SANDSTONE_TOP_TEMP);
        BlockModelGenerators.BlockFamilyProvider cactusplankpool =
                blockStateModelGenerator.family(DecoBlocks.CACTUS_PLANKS);
        BlockModelGenerators.BlockFamilyProvider prismarinebrickpool =
                blockStateModelGenerator.family(DecoBlocks.PRISMARINE_BRICKS_TEMP);
        BlockModelGenerators.BlockFamilyProvider darkprismarinepool =
                blockStateModelGenerator.family(DecoBlocks.DARK_PRISMARINE_TEMP);
        BlockModelGenerators.BlockFamilyProvider cryprismarinepool =
                blockStateModelGenerator.family(DecoBlocks.CRYSTALLIZED_PRISMARINE);
        BlockModelGenerators.BlockFamilyProvider cryprismarinebrickpool =
                blockStateModelGenerator.family(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider lightprismarinepool =
                blockStateModelGenerator.family(DecoBlocks.LIGHT_PRISMARINE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_PRISMARINE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider bubblepool =
                blockStateModelGenerator.family(DecoBlocks.BUBBLE_BLOCK);
        BlockModelGenerators.BlockFamilyProvider bubblebrickpool =
                blockStateModelGenerator.family(DecoBlocks.BUBBLE_BRICKS);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_BUBBLE_BRICKS, TexturedModel.CUBE_TOP_BOTTOM);
        BlockModelGenerators.BlockFamilyProvider smoothsoulsoilpool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        BlockModelGenerators.BlockFamilyProvider quartzpool =
                blockStateModelGenerator.family(DecoBlocks.QUARTZ_TEMP);
        BlockModelGenerators.BlockFamilyProvider smoothquartzpool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_QUARTZ_TEMP);
        BlockModelGenerators.BlockFamilyProvider quartzbrickpool =
                blockStateModelGenerator.family(DecoBlocks.QUARTZ_BRICKS_TEMP);
        BlockModelGenerators.BlockFamilyProvider cutquartzpool =
                blockStateModelGenerator.family(DecoBlocks.CUT_QUARTZ);
        BlockModelGenerators.BlockFamilyProvider cracknetherpool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_NETHER_BRICKS_TEMP);
        BlockModelGenerators.BlockFamilyProvider crackrednetherpool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_RED_NETHER_BRICKS);
        BlockModelGenerators.BlockFamilyProvider bluenetherpool =
                blockStateModelGenerator.family(DecoBlocks.BLUE_NETHER_BRICKS);
        BlockModelGenerators.BlockFamilyProvider crackbluenetherpool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_BLUE_NETHER_BRICKS);
        BlockModelGenerators.BlockFamilyProvider smoothdeepslatepool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_DEEPSLATE);
        BlockModelGenerators.BlockFamilyProvider smoothblackstonepool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_BLACKSTONE);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_BRICKS, TexturedModel.COLUMN);
        BlockModelGenerators.BlockFamilyProvider endstonepool =
                blockStateModelGenerator.family(DecoBlocks.END_STONE_TEMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_END_STONE);
        BlockModelGenerators.BlockFamilyProvider smoothpurpurpool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_PURPUR);
        BlockModelGenerators.BlockFamilyProvider purpurbrickpool =
                blockStateModelGenerator.family(DecoBlocks.PURPUR_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_PURPUR);
        BlockModelGenerators.BlockFamilyProvider voidstonepool =
                blockStateModelGenerator.family(DecoBlocks.VOID_STONE);
        BlockModelGenerators.BlockFamilyProvider voidstonebrickpool =
                blockStateModelGenerator.family(DecoBlocks.VOID_STONE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_VOID_STONE);
        BlockModelGenerators.BlockFamilyProvider obsidianpool =
                blockStateModelGenerator.family(DecoBlocks.OBSIDIAN_TEMP);
        BlockModelGenerators.BlockFamilyProvider obsidianbrickpool =
                blockStateModelGenerator.family(DecoBlocks.OBSIDIAN_BRICKS);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_OBSIDIAN, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.OBSIDIAN_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHARCOAL_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.FLINT_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.ECHO_BLOCK);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_STONE, TexturedModel.COLUMN);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_DEEPSLATE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.IRON_GRATE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_IRON);
        BlockModelGenerators.BlockFamilyProvider crackstonebrickpool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_STONE_BRICKS_TEMP);
        BlockModelGenerators.BlockFamilyProvider crackstonetilepool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_STONE_TILES);
        BlockModelGenerators.BlockFamilyProvider crackblackstonebrickpool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_TEMP);
        BlockModelGenerators.BlockFamilyProvider crackblackstonetilepool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        BlockModelGenerators.BlockFamilyProvider crackdeepbrickpool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_DEEPSLATE_BRICKS_TEMP);
        BlockModelGenerators.BlockFamilyProvider crackdeeptilepool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_DEEPSLATE_TILES_TEMP);
        BlockModelGenerators.BlockFamilyProvider cutironpool =
                blockStateModelGenerator.family(DecoBlocks.CUT_IRON);
        BlockModelGenerators.BlockFamilyProvider polishedeepslatepool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_DEEPSLATE_TEMP);
        BlockModelGenerators.BlockFamilyProvider deepslatepool =
                blockStateModelGenerator.family(DecoBlocks.DEEPSLATE_TEMP);
        BlockModelGenerators.BlockFamilyProvider cobbledeepslatepool =
                blockStateModelGenerator.family(DecoBlocks.COBBLED_DEEPSLATE_TEMP);
        BlockModelGenerators.BlockFamilyProvider cobblestonepool =
                blockStateModelGenerator.family(DecoBlocks.COBBLESTONE_TEMP);
        BlockModelGenerators.BlockFamilyProvider blackstonepool =
                blockStateModelGenerator.family(DecoBlocks.BLACKSTONE_TEMP);
        BlockModelGenerators.BlockFamilyProvider tuffpool =
                blockStateModelGenerator.family(DecoBlocks.TUFF_TEMP);
        BlockModelGenerators.BlockFamilyProvider polishedtuffpool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_TUFF_TEMP);
        BlockModelGenerators.BlockFamilyProvider tufftilepool =
                blockStateModelGenerator.family(DecoBlocks.TUFF_TILES);
        BlockModelGenerators.BlockFamilyProvider smoothtuffpool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_TUFF);

        BlockModelGenerators.BlockFamilyProvider purpurpool =
                blockStateModelGenerator.family(DecoBlocks.PURPUR_TEMP);
        BlockModelGenerators.BlockFamilyProvider smoothbasaltpool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_BASALT_TEMP);

        BlockModelGenerators.BlockFamilyProvider cobsandstonepool =
                blockStateModelGenerator.family(DecoBlocks.COBBLED_SANDSTONE);
        BlockModelGenerators.BlockFamilyProvider cobredsandstonepool =
                blockStateModelGenerator.family(DecoBlocks.COBBLED_RED_SANDSTONE);
        BlockModelGenerators.BlockFamilyProvider cobsoulsoilstonepool =
                blockStateModelGenerator.family(DecoBlocks.COBBLED_SOUL_SOILSTONE);

        BlockModelGenerators.BlockFamilyProvider polisandstonepool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_SANDSTONE);
        BlockModelGenerators.BlockFamilyProvider poliredsandstonepool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_RED_SANDSTONE);
        BlockModelGenerators.BlockFamilyProvider polisoulsoilstonepool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_SOUL_SOILSTONE);

        BlockModelGenerators.BlockFamilyProvider mossdeeppool =
                blockStateModelGenerator.family(DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider mossblackstonepool =
                blockStateModelGenerator.family(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider mossendstonepool =
                blockStateModelGenerator.family(DecoBlocks.MOSSY_END_STONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider sandstonebrickspool =
                blockStateModelGenerator.family(DecoBlocks.SANDSTONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider redsandstonebrickspool =
                blockStateModelGenerator.family(DecoBlocks.RED_SANDSTONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider soulsoilstonebrickspool =
                blockStateModelGenerator.family(DecoBlocks.SOUL_SOILSTONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider cutpurpurpool =
                blockStateModelGenerator.family(DecoBlocks.CUT_PURPUR);

        BlockModelGenerators.BlockFamilyProvider sandobsidianpool =
                blockStateModelGenerator.family(DecoBlocks.SANDED_OBSIDIAN);
        BlockModelGenerators.BlockFamilyProvider smobsidianpool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_OBSIDIAN);
        BlockModelGenerators.BlockFamilyProvider cutobsidianpool =
                blockStateModelGenerator.family(DecoBlocks.CUT_OBSIDIAN);

        BlockModelGenerators.BlockFamilyProvider lapispool =
                blockStateModelGenerator.family(DecoBlocks.LAPIS_TEMP);
        BlockModelGenerators.BlockFamilyProvider lapisbrickpool =
                blockStateModelGenerator.family(DecoBlocks.LAPIS_BRICKS);
        BlockModelGenerators.BlockFamilyProvider smlapispool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_LAPIS);
        BlockModelGenerators.BlockFamilyProvider cutlapispool =
                blockStateModelGenerator.family(DecoBlocks.CUT_LAPIS);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_LAPIS);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.LAPIS_PILLAR, TexturedModel.COLUMN);

        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.NETHER_BRICK_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.RED_NETHER_BRICK_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.BLUE_NETHER_BRICK_PILLAR, TexturedModel.COLUMN);

        BlockModelGenerators.BlockFamilyProvider castironpool =
                blockStateModelGenerator.family(DecoBlocks.CASTED_IRON);
        BlockModelGenerators.BlockFamilyProvider dripbrickpool =
                blockStateModelGenerator.family(DecoBlocks.DRIPSTONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider dripbrickpillarpool =
                blockStateModelGenerator.family(DecoBlocks.DRIPSTONE_BRICK_PILLAR_TEMP);
        BlockModelGenerators.BlockFamilyProvider voidstonebrickpillarpool =
                blockStateModelGenerator.family(DecoBlocks.VOID_STONE_BRICK_PILLAR_TEMP);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_DRIPSTONE);

        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.DRIPSTONE_BRICK_PILLAR, TexturedModel.CUBE);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.VOID_STONE_BRICK_PILLAR, TexturedModel.CUBE);

        BlockModelGenerators.BlockFamilyProvider oakwoodpool =
                blockStateModelGenerator.family(DecoBlocks.OAK_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider sprucewoodpool =
                blockStateModelGenerator.family(DecoBlocks.SPRUCE_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider birchwoodpool =
                blockStateModelGenerator.family(DecoBlocks.BIRCH_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider junglewoodpool =
                blockStateModelGenerator.family(DecoBlocks.JUNGLE_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider acaciawoodpool =
                blockStateModelGenerator.family(DecoBlocks.ACACIA_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider darkoakwoodpool =
                blockStateModelGenerator.family(DecoBlocks.DARK_OAK_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider mangrovewoodpool =
                blockStateModelGenerator.family(DecoBlocks.MANGROVE_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider crimsonhyphaepool =
                blockStateModelGenerator.family(DecoBlocks.CRIMSON_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider warpedhyphaepool =
                blockStateModelGenerator.family(DecoBlocks.WARPED_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider cherrywoodpool =
                blockStateModelGenerator.family(DecoBlocks.CHERRY_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider paleoakwoodpool =
                blockStateModelGenerator.family(DecoBlocks.PALE_OAK_WOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider driftwoodlogpool =
                blockStateModelGenerator.family(DecoBlocks.DRIFTWOOD_TEMP);
        BlockModelGenerators.BlockFamilyProvider drieddriftwoodpool =
                blockStateModelGenerator.family(DecoBlocks.DRIED_DRIFTWOOD_TEMP);

        BlockModelGenerators.BlockFamilyProvider strippedoakwoodpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_OAK_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedsprucewoodpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_SPRUCE_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedbirchwoodpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_BIRCH_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedjunglewoodpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_JUNGLE_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedacaciawoodpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_ACACIA_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippeddarkoakwoodpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_DARK_OAK_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedmangrovewoodpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_MANGROVE_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedcrimsonhyphaepool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_CRIMSON_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedwarpedhyphaepool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_WARPED_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedcherrywoodpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_CHERRY_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedpaleoakpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_PALE_OAK_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippeddriftwoodpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_DRIFTWOOD_TEMP);

        BlockModelGenerators.BlockFamilyProvider woodenwoodpool =
                blockStateModelGenerator.family(DecoBlocks.WOODEN_WOOD_TEMP);

        BlockModelGenerators.BlockFamilyProvider strippedwoodenwoodpool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_WOODEN_TEMP);

        BlockModelGenerators.BlockFamilyProvider ironcapstempool =
                blockStateModelGenerator.family(DecoBlocks.IRON_CAP_STEM_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedironcapstempool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_IRON_CAP_TEMP);

        BlockModelGenerators.BlockFamilyProvider bamboopool =
                blockStateModelGenerator.family(DecoBlocks.BAMBOO_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedbamboopool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_BAMBOO_TEMP);

        BlockModelGenerators.BlockFamilyProvider packednetherrackpool =
                blockStateModelGenerator.family(DecoBlocks.PACKED_NETHERRACK);
        BlockModelGenerators.BlockFamilyProvider netherrackbrickpool =
                blockStateModelGenerator.family(DecoBlocks.NETHERRACK_BRICKS);

        BlockModelGenerators.BlockFamilyProvider mushroomstempool =
                blockStateModelGenerator.family(DecoBlocks.MUSHROOM_STEM_TEMP);
        BlockModelGenerators.BlockFamilyProvider strippedcactuspool =
                blockStateModelGenerator.family(DecoBlocks.STRIPPED_CACTUS_TEMP);

        BlockModelGenerators.BlockFamilyProvider drygrasspool =
                blockStateModelGenerator.family(DecoBlocks.DRY_GRASS_TEMP);
        BlockModelGenerators.BlockFamilyProvider podzolpool =
                blockStateModelGenerator.family(DecoBlocks.PODZOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider myceliumpool =
                blockStateModelGenerator.family(DecoBlocks.MYCELIUM_TEMP);

        BlockModelGenerators.BlockFamilyProvider crimnylpool =
                blockStateModelGenerator.family(DecoBlocks.CRIMSON_NYLIUM_TEMP);
        BlockModelGenerators.BlockFamilyProvider warpnylpool =
                blockStateModelGenerator.family(DecoBlocks.WARPED_NYLIUM_TEMP);

        BlockModelGenerators.BlockFamilyProvider dirtpool =
                blockStateModelGenerator.family(DecoBlocks.DIRT_TEMP);
        BlockModelGenerators.BlockFamilyProvider coarsedirtpool =
                blockStateModelGenerator.family(DecoBlocks.COARSE_DIRT_TEMP);
        BlockModelGenerators.BlockFamilyProvider rooteddirtpool =
                blockStateModelGenerator.family(DecoBlocks.ROOTED_DIRT_TEMP);

        BlockModelGenerators.BlockFamilyProvider mudpool =
                blockStateModelGenerator.family(DecoBlocks.MUD_TEMP);
        BlockModelGenerators.BlockFamilyProvider claypool =
                blockStateModelGenerator.family(DecoBlocks.CLAY_TEMP);
        BlockModelGenerators.BlockFamilyProvider mosspool =
                blockStateModelGenerator.family(DecoBlocks.MOSS_TEMP);
        BlockModelGenerators.BlockFamilyProvider palemosspool =
                blockStateModelGenerator.family(DecoBlocks.PALE_MOSS_TEMP);

        BlockModelGenerators.BlockFamilyProvider bonepool =
                blockStateModelGenerator.family(DecoBlocks.BONE_TEMP);
        BlockModelGenerators.BlockFamilyProvider bedrockpool =
                blockStateModelGenerator.family(DecoBlocks.BEDROCK_TEMP);

        BlockModelGenerators.BlockFamilyProvider cloudpool =
                blockStateModelGenerator.family(DecoBlocks.SOLID_CLOUD);
        BlockModelGenerators.BlockFamilyProvider cloudbrickpool =
                blockStateModelGenerator.family(DecoBlocks.CLOUD_BRICKS);

        BlockModelGenerators.BlockFamilyProvider resinpool =
                blockStateModelGenerator.family(DecoBlocks.RESIN_TEMP);
        BlockModelGenerators.BlockFamilyProvider smoothresinpool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_RESIN);

        BlockModelGenerators.BlockFamilyProvider tubecoralpool =
                blockStateModelGenerator.family(DecoBlocks.TUBE_CORAL_TEMP);
        BlockModelGenerators.BlockFamilyProvider braincoralpool =
                blockStateModelGenerator.family(DecoBlocks.BRAIN_CORAL_TEMP);
        BlockModelGenerators.BlockFamilyProvider bubblecoralpool =
                blockStateModelGenerator.family(DecoBlocks.BUBBLE_CORAL_TEMP);
        BlockModelGenerators.BlockFamilyProvider firecoralpool =
                blockStateModelGenerator.family(DecoBlocks.FIRE_CORAL_TEMP);
        BlockModelGenerators.BlockFamilyProvider horncoralpool =
                blockStateModelGenerator.family(DecoBlocks.HORN_CORAL_TEMP);

        BlockModelGenerators.BlockFamilyProvider deadtubecoralpool =
                blockStateModelGenerator.family(DecoBlocks.DEAD_TUBE_CORAL_TEMP);
        BlockModelGenerators.BlockFamilyProvider deadbraincoralpool =
                blockStateModelGenerator.family(DecoBlocks.DEAD_BRAIN_CORAL_TEMP);
        BlockModelGenerators.BlockFamilyProvider deadbubblecoralpool =
                blockStateModelGenerator.family(DecoBlocks.DEAD_BUBBLE_CORAL_TEMP);
        BlockModelGenerators.BlockFamilyProvider deadfirecoralpool =
                blockStateModelGenerator.family(DecoBlocks.DEAD_FIRE_CORAL_TEMP);
        BlockModelGenerators.BlockFamilyProvider deadhorncoralpool =
                blockStateModelGenerator.family(DecoBlocks.DEAD_HORN_CORAL_TEMP);

        BlockModelGenerators.BlockFamilyProvider mossytuffbrickpool =
                blockStateModelGenerator.family(DecoBlocks.MOSSY_TUFF_BRICKS);

        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_ICE_BRICKS, TexturedModel.COLUMN);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_MUD_BRICKS, TexturedModel.COLUMN);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_NETHERRACK_BRICKS, TexturedModel.COLUMN);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_CLOUD_BRICKS, TexturedModel.COLUMN);

        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.PACKED_CACTUS, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.STRIPPED_CACTUS, TexturedModel.COLUMN);

        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_MAGMA);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.FRAGILE_ICE);

        blockStateModelGenerator.createFullAndCarpetBlocks(DecoBlocks.PACKED_DRY_GRASS, DecoBlocks.DRY_GRASS_CARPET);
        blockStateModelGenerator.createFullAndCarpetBlocks(DecoBlocks.PACKED_PODZOL, DecoBlocks.PODZOL_CARPET);
        blockStateModelGenerator.createFullAndCarpetBlocks(DecoBlocks.PACKED_MYCELIUM, DecoBlocks.MYCELIUM_CARPET);
        blockStateModelGenerator.createFullAndCarpetBlocks(DecoBlocks.PACKED_CRIMSON_NYLIUM, DecoBlocks.CRIMSON_NYLIUM_CARPET);
        blockStateModelGenerator.createFullAndCarpetBlocks(DecoBlocks.PACKED_WARPED_NYLIUM, DecoBlocks.WARPED_NYLIUM_CARPET);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_POLISHED_SANDSTONE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE);

        BlockModelGenerators.BlockFamilyProvider cracktuffbrickpool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_TUFF_BRICKS);
        BlockModelGenerators.BlockFamilyProvider cracktufftilepool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_TUFF_TILES);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.GOLD_GRATE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_GOLD);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_END_STONE_BRICKS);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_WIND_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_EARTH_BLOCK);

        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_WIND_BRICKS, TexturedModel.CUBE_TOP_BOTTOM);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.CHISELED_EARTH_BRICKS, TexturedModel.CUBE_TOP_BOTTOM);

        BlockModelGenerators.BlockFamilyProvider windpool =
                blockStateModelGenerator.family(DecoBlocks.WIND_BLOCK);
        BlockModelGenerators.BlockFamilyProvider windbrickpool =
                blockStateModelGenerator.family(DecoBlocks.WIND_BRICKS);

        BlockModelGenerators.BlockFamilyProvider earthpool =
                blockStateModelGenerator.family(DecoBlocks.EARTH_BLOCK);
        BlockModelGenerators.BlockFamilyProvider earthbrickpool =
                blockStateModelGenerator.family(DecoBlocks.EARTH_BRICKS);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_POLISHED_STONE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_STONE_TILES);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_COBBLED_DEEPSLATE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_POLISHED_DEEPSLATE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_DEEPSLATE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_DEEPSLATE_TILES);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CRACKED_DEEPSLATE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CRACKED_DEEPSLATE_TILES);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_MOSSY_COBBLESTONE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CHISELED_DEEPSLATE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CALCITE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_DRIPSTONE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_TUFF);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_GRANITE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_POLISHED_GRANITE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_DIORITE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_POLISHED_DIORITE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_ANDESITE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_POLISHED_ANDESITE);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.INFESTED_BLACKSTONE, TexturedModel.COLUMN);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_POLISHED_BLACKSTONE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_POLISHED_BLACKSTONE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_POLISHED_BLACKSTONE_TILES);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CHISELED_POLISHED_BLACKSTONE);
        blockStateModelGenerator.createTrivialBlock(DecoBlocks.INFESTED_CHISELED_STONE, TexturedModel.COLUMN);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CHISELED_DEEPSLATE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CHISELED_POLISHED_BLACKSTONE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CRACKED_STONE_TILES);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CRACKED_POLISHED_BLACKSTONE_TILES);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.YELLOW_TULIP, DecoBlocks.POTTED_YELLOW_TULIP,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.PURPLE_TULIP, DecoBlocks.POTTED_PURPLE_TULIP,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.MAGENTA_TULIP, DecoBlocks.POTTED_MAGENTA_TULIP,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.BLACK_TULIP, DecoBlocks.POTTED_BLACK_TULIP,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.GREEN_TULIP, DecoBlocks.POTTED_GREEN_TULIP,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.BLUE_TULIP, DecoBlocks.POTTED_BLUE_TULIP,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.CYAN_TULIP, DecoBlocks.POTTED_CYAN_TULIP,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.BARBERTON_DAISY, DecoBlocks.POTTED_BARBERTON_DAISY,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.BLUE_EYED_DAISY, DecoBlocks.POTTED_BLUE_EYED_DAISY,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.GERBERA_DAISY, DecoBlocks.POTTED_GERBERA_DAISY,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.MICHAELMAS_DAISY, DecoBlocks.POTTED_MICHAELMAS_DAISY,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.PUFFY_DANDELION, DecoBlocks.POTTED_PUFFY_DANDELION,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.CALIFORNIA_POPPY, DecoBlocks.POTTED_CALIFORNIA_POPPY,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.SALMON_POPPY, DecoBlocks.POTTED_SALMON_POPPY,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.YELLOW_ORCHID, DecoBlocks.POTTED_YELLOW_ORCHID,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.WHITE_ORCHID, DecoBlocks.POTTED_WHITE_ORCHID,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.PINK_ORCHID, DecoBlocks.POTTED_PINK_ORCHID,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.ROSE, DecoBlocks.POTTED_ROSE,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.ENDER_ROSE, DecoBlocks.POTTED_ENDER_ROSE,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createDoublePlant(DecoBlocks.WITHER_ROSE_BUSH,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlant(DecoBlocks.ENDER_ROSE_BUSH,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createDoublePlant(DecoBlocks.MIGHTY_LAVENDER,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.PAEONIA, DecoBlocks.POTTED_PAEONIA,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.LAVENDER, DecoBlocks.POTTED_LAVENDER,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.BLUE_HIBISCUS, DecoBlocks.POTTED_BLUE_HIBISCUS,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.BROMELIAD, DecoBlocks.POTTED_BROMELIAD,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.WOODEN_SAPLING, DecoBlocks.POTTED_WOODEN_SAPLING,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createCrossBlock(DecoBlocks.DRIFTWOOD_SPROUT,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createCrossBlock(DecoBlocks.DRIFTWOOD_SAPLING,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.ANCIENT_ROSE, DecoBlocks.POTTED_ANCIENT_ROSE,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.BUTTERCUP, DecoBlocks.POTTED_BUTTERCUP,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.NIGHTSHADE, DecoBlocks.POTTED_NIGHTSHADE,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.ENDERSHADE, DecoBlocks.POTTED_ENDERSHADE,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.DEAD_EYE_DAISY, DecoBlocks.POTTED_DEAD_EYE_DAISY,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.ALPINE_POPPY, DecoBlocks.POTTED_ALPINE_POPPY,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.POPPED_BLUET, DecoBlocks.POTTED_POPPED_BLUET,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.IRIS, DecoBlocks.POTTED_IRIS,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.BLUE_DELPHINIUM, DecoBlocks.POTTED_BLUE_DELPHINIUM,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.CYAN_ORCHID, DecoBlocks.POTTED_CYAN_ORCHID,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.FELICIA_DAISY, DecoBlocks.POTTED_FELICIA_DAISY,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createDoublePlant(DecoBlocks.MEGA_BROWN_TULIP,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.HAZZY_BLUET, DecoBlocks.POTTED_HAZZY_BLUET,
                BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.DRILL_LAVENDER, DecoBlocks.POTTED_DRILL_LAVENDER,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(DecoBlocks.IRON_CAP_MUSHROOM, DecoBlocks.POTTED_IRON_CAP_MUSHROOM,
                BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SPORE_IRON_ORE);

        BlockModelGenerators.BlockFamilyProvider woodenpool =
                blockStateModelGenerator.family(DecoBlocks.WOODEN_PLANKS);

        BlockModelGenerators.BlockFamilyProvider driftwoodpool =
                blockStateModelGenerator.family(DecoBlocks.DRIFTWOOD_PLANKS);

        blockStateModelGenerator.woodProvider(DecoBlocks.WOODEN_LOG).logWithHorizontal(DecoBlocks.WOODEN_LOG).wood(DecoBlocks.WOODEN_WOOD);
        blockStateModelGenerator.woodProvider(DecoBlocks.STRIPPED_WOODEN_LOG).logWithHorizontal(DecoBlocks.STRIPPED_WOODEN_LOG).wood(DecoBlocks.STRIPPED_WOODEN_WOOD);

        blockStateModelGenerator.woodProvider(DecoBlocks.DRIFTWOOD_LOG).logWithHorizontal(DecoBlocks.DRIFTWOOD_LOG).wood(DecoBlocks.DRIFTWOOD);
        blockStateModelGenerator.woodProvider(DecoBlocks.DRIED_DRIFTWOOD_LOG).logWithHorizontal(DecoBlocks.DRIED_DRIFTWOOD_LOG).wood(DecoBlocks.DRIED_DRIFTWOOD);
        blockStateModelGenerator.woodProvider(DecoBlocks.STRIPPED_DRIFTWOOD_LOG).logWithHorizontal(DecoBlocks.STRIPPED_DRIFTWOOD_LOG).wood(DecoBlocks.STRIPPED_DRIFTWOOD);
        BlockModelGenerators.BlockFamilyProvider ironcappool =
                blockStateModelGenerator.family(DecoBlocks.IRON_CAP_PLANKS);

        BlockModelGenerators.BlockFamilyProvider mushroompool =
                blockStateModelGenerator.family(DecoBlocks.MUSHROOM_PLANKS);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_MAGMA_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHISELED_BUBBLE_BLOCK);

        blockStateModelGenerator.woodProvider(DecoBlocks.IRON_CAP_STEM).logWithHorizontal(DecoBlocks.IRON_CAP_STEM).wood(DecoBlocks.IRON_CAP_HYPHAE);
        blockStateModelGenerator.woodProvider(DecoBlocks.STRIPPED_IRON_CAP_STEM).logWithHorizontal(DecoBlocks.STRIPPED_IRON_CAP_STEM).wood(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        blockStateModelGenerator.createWeightedPressurePlate(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, Blocks.COPPER_BLOCK);
        blockStateModelGenerator.createWeightedPressurePlate(DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.COPPER_BLOCK);
        blockStateModelGenerator.createWeightedPressurePlate(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.EXPOSED_COPPER);
        blockStateModelGenerator.createWeightedPressurePlate(DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.EXPOSED_COPPER);
        blockStateModelGenerator.createWeightedPressurePlate(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.WEATHERED_COPPER);
        blockStateModelGenerator.createWeightedPressurePlate(DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.WEATHERED_COPPER);
        blockStateModelGenerator.createWeightedPressurePlate(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER);
        blockStateModelGenerator.createWeightedPressurePlate(DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER);

        BlockModelGenerators.BlockFamilyProvider oakmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.OAK_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider birchmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.BIRCH_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider sprucemosaicpool =
                blockStateModelGenerator.family(DecoBlocks.SPRUCE_MOSAIC_TEMP);
        BlockModelGenerators.BlockFamilyProvider junglemosaicpool =
                blockStateModelGenerator.family(DecoBlocks.JUNGLE_MOSAIC_TEMP);
        BlockModelGenerators.BlockFamilyProvider acaciamosaicpool =
                blockStateModelGenerator.family(DecoBlocks.ACACIA_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider darkoakmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.DARK_OAK_MOSAIC_TEMP);
        BlockModelGenerators.BlockFamilyProvider mangrovemosaicpool =
                blockStateModelGenerator.family(DecoBlocks.MANGROVE_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider cherrymosaicpool =
                blockStateModelGenerator.family(DecoBlocks.CHERRY_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider crimsonmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.CRIMSON_MOSAIC_TEMP);
        BlockModelGenerators.BlockFamilyProvider warpedmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.WARPED_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider cactusmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.CACTUS_MOSAIC_TEMP);
        BlockModelGenerators.BlockFamilyProvider paleoakmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.PALE_OAK_MOSAIC_TEMP);
        BlockModelGenerators.BlockFamilyProvider woodenmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.WOODEN_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider driftwoodmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.DRIFTWOOD_MOSAIC_TEMP);
        BlockModelGenerators.BlockFamilyProvider mushmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.MUSHROOM_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider ironcapmosaicpool =
                blockStateModelGenerator.family(DecoBlocks.IRON_CAP_MOSAIC);

        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.SPRUCE_MOSAIC, TexturedModel.CUBE);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.JUNGLE_MOSAIC, TexturedModel.CUBE);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.DARK_OAK_MOSAIC, TexturedModel.CUBE);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.CRIMSON_MOSAIC, TexturedModel.CUBE);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.CACTUS_MOSAIC, TexturedModel.CUBE);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.PALE_OAK_MOSAIC, TexturedModel.CUBE);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.DRIFTWOOD_MOSAIC, TexturedModel.CUBE);

        blockStateModelGenerator.createFlowerBed(DecoBlocks.ROUGE_WILDFLOWERS);
        blockStateModelGenerator.createFlowerBed(DecoBlocks.SWEET_WILDFLOWERS);
        blockStateModelGenerator.createFlowerBed(DecoBlocks.GECKO_WILDFLOWERS);

        BlockModelGenerators.BlockFamilyProvider bamboomosaicpool =
                blockStateModelGenerator.family(DecoBlocks.BAMBOO_MOSAIC_TEMP);

        blockStateModelGenerator.createHangingSign(DecoBlocks.STRIPPED_CACTUS_TEMP, DecoBlocks.HANGING_CACTUS_SIGN,
                DecoBlocks.WALL_HANGING_CACTUS_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.MUSHROOM_STEM_TEMP, DecoBlocks.HANGING_MUSHROOM_SIGN,
                DecoBlocks.WALL_HANGING_MUSHROOM_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.STRIPPED_IRON_CAP_TEMP, DecoBlocks.HANGING_IRON_CAP_SIGN,
                DecoBlocks.WALL_HANGING_IRON_CAP_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.STRIPPED_WOODEN_LOG, DecoBlocks.HANGING_WOODEN_SIGN,
                DecoBlocks.WALL_HANGING_WOODEN_SIGN);

        blockStateModelGenerator.createHangingSign(DecoBlocks.STRIPPED_DRIFTWOOD_LOG, DecoBlocks.HANGING_DRIFTWOOD_SIGN,
                DecoBlocks.WALL_HANGING_DRIFTWOOD_SIGN);

        blockStateModelGenerator.createHangingSign(Blocks.OAK_PLANKS, DecoBlocks.HANGING_OAK_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_OAK_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.SPRUCE_PLANKS, DecoBlocks.HANGING_SPRUCE_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_SPRUCE_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.BIRCH_PLANKS, DecoBlocks.HANGING_BIRCH_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_BIRCH_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.JUNGLE_PLANKS, DecoBlocks.HANGING_JUNGLE_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_JUNGLE_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.ACACIA_PLANKS, DecoBlocks.HANGING_ACACIA_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_ACACIA_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.DARK_OAK_PLANKS, DecoBlocks.HANGING_DARK_OAK_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_DARK_OAK_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.MANGROVE_PLANKS, DecoBlocks.HANGING_MANGROVE_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_MANGROVE_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.CHERRY_PLANKS, DecoBlocks.HANGING_CHERRY_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_CHERRY_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.CRIMSON_PLANKS, DecoBlocks.HANGING_CRIMSON_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_CRIMSON_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.WARPED_PLANKS, DecoBlocks.HANGING_WARPED_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_WARPED_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.CACTUS_PLANKS, DecoBlocks.HANGING_CACTUS_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_CACTUS_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.MUSHROOM_PLANKS, DecoBlocks.HANGING_MUSHROOM_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_MUSHROOM_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.WOODEN_PLANKS, DecoBlocks.HANGING_WOODEN_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_WOODEN_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.PALE_OAK_PLANKS, DecoBlocks.HANGING_PALE_OAK_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_PALE_OAK_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.DRIFTWOOD_PLANKS, DecoBlocks.HANGING_DRIFTWOOD_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_DRIFTWOOD_PLANKS_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.IRON_CAP_PLANKS, DecoBlocks.HANGING_IRON_CAP_PLANKS_SIGN,
                DecoBlocks.WALL_HANGING_IRON_CAP_PLANKS_SIGN);

        blockStateModelGenerator.createHangingSign(DecoBlocks.OAK_MOSAIC, DecoBlocks.HANGING_OAK_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_OAK_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.SPRUCE_MOSAIC, DecoBlocks.HANGING_SPRUCE_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_SPRUCE_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.BIRCH_MOSAIC, DecoBlocks.HANGING_BIRCH_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_BIRCH_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.JUNGLE_MOSAIC, DecoBlocks.HANGING_JUNGLE_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_JUNGLE_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.ACACIA_MOSAIC, DecoBlocks.HANGING_ACACIA_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_ACACIA_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.DARK_OAK_MOSAIC, DecoBlocks.HANGING_DARK_OAK_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_DARK_OAK_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.MANGROVE_MOSAIC, DecoBlocks.HANGING_MANGROVE_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_MANGROVE_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.CHERRY_MOSAIC, DecoBlocks.HANGING_CHERRY_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_CHERRY_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.BAMBOO_MOSAIC, DecoBlocks.HANGING_BAMBOO_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_BAMBOO_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.CRIMSON_MOSAIC, DecoBlocks.HANGING_CRIMSON_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_CRIMSON_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.WARPED_MOSAIC, DecoBlocks.HANGING_WARPED_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_WARPED_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.CACTUS_MOSAIC, DecoBlocks.HANGING_CACTUS_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_CACTUS_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.MUSHROOM_MOSAIC, DecoBlocks.HANGING_MUSHROOM_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_MUSHROOM_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.WOODEN_MOSAIC, DecoBlocks.HANGING_WOODEN_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_WOODEN_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.PALE_OAK_MOSAIC, DecoBlocks.HANGING_PALE_OAK_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_PALE_OAK_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.DRIFTWOOD_MOSAIC, DecoBlocks.HANGING_DRIFTWOOD_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_DRIFTWOOD_MOSAIC_SIGN);
        blockStateModelGenerator.createHangingSign(DecoBlocks.IRON_CAP_MOSAIC, DecoBlocks.HANGING_IRON_CAP_MOSAIC_SIGN,
                DecoBlocks.WALL_HANGING_IRON_CAP_MOSAIC_SIGN);

        strippedoakwoodpool.generateFor(DecoBlocks.STRIPPED_OAK_FAMILY);
        strippedsprucewoodpool.generateFor(DecoBlocks.STRIPPED_SPRUCE_FAMILY);
        strippedbirchwoodpool.generateFor(DecoBlocks.STRIPPED_BIRCH_FAMILY);
        strippedjunglewoodpool.generateFor(DecoBlocks.STRIPPED_JUNGLE_FAMILY);
        strippedacaciawoodpool.generateFor(DecoBlocks.STRIPPED_ACACIA_FAMILY);
        strippeddarkoakwoodpool.generateFor(DecoBlocks.STRIPPED_DARK_OAK_FAMILY);
        strippedmangrovewoodpool.generateFor(DecoBlocks.STRIPPED_MANGROVE_FAMILY);
        strippedcherrywoodpool.generateFor(DecoBlocks.STRIPPED_CHERRY_FAMILY);
        strippedcrimsonhyphaepool.generateFor(DecoBlocks.STRIPPED_CRIMSON_FAMILY);
        strippedwarpedhyphaepool.generateFor(DecoBlocks.STRIPPED_WARPED_FAMILY);
        strippedcactuspool.generateFor(DecoBlocks.STRIPPED_CACTUS_FAMILY);
        mushroomstempool.generateFor(DecoBlocks.MUSHROOM_STEM_FAMILY);
        strippedwoodenwoodpool.generateFor(DecoBlocks.STRIPPED_WOODEN_FAMILY);
        strippedironcapstempool.generateFor(DecoBlocks.STRIPPED_IRON_CAP_FAMILY);
        strippedpaleoakpool.generateFor(DecoBlocks.STRIPPED_PALE_OAK_FAMILY);
        strippeddriftwoodpool.generateFor(DecoBlocks.STRIPPED_DRIFTWOOD_FAMILY);

        oakmosaicpool.generateFor(DecoBlocks.OAK_MOSAIC_FAMILY);
        sprucemosaicpool.generateFor(DecoBlocks.SPRUCE_MOSAIC_FAMILY);
        birchmosaicpool.generateFor(DecoBlocks.BIRCH_MOSAIC_FAMILY);
        junglemosaicpool.generateFor(DecoBlocks.JUNGLE_MOSAIC_FAMILY);
        acaciamosaicpool.generateFor(DecoBlocks.ACACIA_MOSAIC_FAMILY);
        darkoakmosaicpool.generateFor(DecoBlocks.DARK_OAK_MOSAIC_FAMILY);
        mangrovemosaicpool.generateFor(DecoBlocks.MANGROVE_MOSAIC_FAMILY);
        cherrymosaicpool.generateFor(DecoBlocks.CHERRY_MOSAIC_FAMILY);
        cactusmosaicpool.generateFor(DecoBlocks.CACTUS_MOSAIC_FAMILY);
        crimsonmosaicpool.generateFor(DecoBlocks.CRIMSON_MOSAIC_FAMILY);
        warpedmosaicpool.generateFor(DecoBlocks.WARPED_MOSAIC_FAMILY);
        woodenmosaicpool.generateFor(DecoBlocks.WOODEN_MOSAIC_FAMILY);
        woodenmosaicpool.generateFor(DecoBlocks.MUSHROOM_MOSAIC_FAMILY);
        bamboomosaicpool.generateFor(DecoBlocks.BAMBOO_MOSAIC_FAMILY);
        paleoakmosaicpool.generateFor(DecoBlocks.PALE_OAK_MOSAIC_FAMILY);
        driftwoodmosaicpool.generateFor(DecoBlocks.DRIFTWOOD_MOSAIC_FAMILY);
        ironcapmosaicpool.generateFor(DecoBlocks.IRON_CAP_MOSAIC_FAMILY);

        blockStateModelGenerator.createLantern(DecoBlocks.COPPER_SOUL_LANTERN);
        blockStateModelGenerator.createLantern(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN);
        blockStateModelGenerator.createLantern(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN);
        blockStateModelGenerator.createLantern(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN);

        blockStateModelGenerator.createLantern(DecoBlocks.WAXED_COPPER_SOUL_LANTERN);
        blockStateModelGenerator.createLantern(DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
        blockStateModelGenerator.createLantern(DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
        blockStateModelGenerator.createLantern(DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);

        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.BIRCH_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.SPRUCE_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.ACACIA_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.DARK_OAK_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.PALE_OAK_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.JUNGLE_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.MANGROVE_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CRIMSON_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.WARPED_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CACTUS_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.OAK_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CHERRY_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.BAMBOO_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.DRIFTWOOD_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.MUSHROOM_CRAFTING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.IRON_CAP_CRAFTING_TABLE);

        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.BIRCH_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.SPRUCE_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.ACACIA_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.PALE_OAK_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.JUNGLE_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.MANGROVE_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CRIMSON_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.WARPED_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CACTUS_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.OAK_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CHERRY_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.BAMBOO_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.DRIFTWOOD_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.MUSHROOM_BOOKSHELF);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.IRON_CAP_BOOKSHELF);

        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.WOODEN_LEAVES);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.DRIED_LEAVES);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.KELP_LEAVES);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.DEAD_KELP_LEAVES);

        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.OAK_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.SPRUCE_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.BIRCH_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.JUNGLE_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.DARK_OAK_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.PALE_OAK_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.ACACIA_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.MANGROVE_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CRIMSON_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.WARPED_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CACTUS_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.MUSHROOM_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.BAMBOO_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CHERRY_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.DRIFTWOOD_SMITHING_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.IRON_CAP_SMITHING_TABLE);

        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.OAK_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.BIRCH_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.ACACIA_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.PALE_OAK_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.WARPED_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CACTUS_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.BAMBOO_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.CHERRY_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.DRIFTWOOD_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.MUSHROOM_CARTOGRAPHY_TABLE);
        blockStateModelGenerator.createNonTemplateModelBlock(DecoBlocks.IRON_CAP_CARTOGRAPHY_TABLE);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.WHITE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.LIGHT_GRAY_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.GRAY_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.BLACK_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.BROWN_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.RED_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.ORANGE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.YELLOW_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.LIME_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.GREEN_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CYAN_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.LIGHT_BLUE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.BLUE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PURPLE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.MAGENTA_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PINK_BLOCK);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_LIGHT_GRAY_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_GRAY_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_BROWN_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_RED_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_ORANGE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_YELLOW_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_LIME_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_GREEN_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_CYAN_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_LIGHT_BLUE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_BLUE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_PURPLE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_MAGENTA_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PASTEL_PINK_BLOCK);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_LIGHT_GRAY_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_GRAY_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_BROWN_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_RED_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_ORANGE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_YELLOW_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_LIME_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_GREEN_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_CYAN_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_LIGHT_BLUE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_BLUE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_PURPLE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_MAGENTA_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SHADED_PINK_BLOCK);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.SMOOTH_GLOWSTONE);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.WHITE_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.LIGHT_GRAY_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.GRAY_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.BLACK_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.BROWN_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.RED_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.ORANGE_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.YELLOW_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.LIME_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.GREEN_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CYAN_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.LIGHT_BLUE_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.BLUE_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PURPLE_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.MAGENTA_LAMP);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PINK_LAMP);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.MUSHROOM_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.OAK_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.SPRUCE_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.BIRCH_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.JUNGLE_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.DARK_OAK_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.ACACIA_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.MANGROVE_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CRIMSON_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.WARPED_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CACTUS_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.CHERRY_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.BAMBOO_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.IRON_CAP_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.PALE_OAK_NOTE_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.DRIFTWOOD_NOTE_BLOCK);

        BlockModelGenerators.BlockFamilyProvider policalcpool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_CALCITE);
        BlockModelGenerators.BlockFamilyProvider cutcalcpool =
                blockStateModelGenerator.family(DecoBlocks.CUT_CALCITE);
        BlockModelGenerators.BlockFamilyProvider calcbrickpool =
                blockStateModelGenerator.family(DecoBlocks.CALCITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider cutdiorpool =
                blockStateModelGenerator.family(DecoBlocks.CUT_DIORITE);
        BlockModelGenerators.BlockFamilyProvider diorbrickpool =
                blockStateModelGenerator.family(DecoBlocks.DIORITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider cutgranpool =
                blockStateModelGenerator.family(DecoBlocks.CUT_GRANITE);
        BlockModelGenerators.BlockFamilyProvider granbrickpool =
                blockStateModelGenerator.family(DecoBlocks.GRANITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider cutandespool =
                blockStateModelGenerator.family(DecoBlocks.CUT_ANDESITE);
        BlockModelGenerators.BlockFamilyProvider andesbrickpool =
                blockStateModelGenerator.family(DecoBlocks.ANDESITE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider cutgoldpool =
                blockStateModelGenerator.family(DecoBlocks.CUT_GOLD);

        BlockModelGenerators.BlockFamilyProvider goldpool =
                blockStateModelGenerator.family(DecoBlocks.GOLD_TEMP);
        BlockModelGenerators.BlockFamilyProvider rawgoldpool =
                blockStateModelGenerator.family(DecoBlocks.RAW_GOLD_TEMP);
        BlockModelGenerators.BlockFamilyProvider ironpool =
                blockStateModelGenerator.family(DecoBlocks.IRON_TEMP);
        BlockModelGenerators.BlockFamilyProvider rawironpool =
                blockStateModelGenerator.family(DecoBlocks.RAW_IRON_TEMP);

        BlockModelGenerators.BlockFamilyProvider copperpool =
                blockStateModelGenerator.family(DecoBlocks.COPPER_TEMP);
        BlockModelGenerators.BlockFamilyProvider rawcopperpool =
                blockStateModelGenerator.family(DecoBlocks.RAW_COPPER_TEMP);
        BlockModelGenerators.BlockFamilyProvider expcopperpool =
                blockStateModelGenerator.family(DecoBlocks.EXPOSED_COPPER_TEMP);
        BlockModelGenerators.BlockFamilyProvider weathcopperpool =
                blockStateModelGenerator.family(DecoBlocks.WEATHERED_COPPER_TEMP);
        BlockModelGenerators.BlockFamilyProvider oxidcopperpool =
                blockStateModelGenerator.family(DecoBlocks.OXIDIZED_COPPER_TEMP);

        BlockModelGenerators.BlockFamilyProvider poliendstonepool =
                blockStateModelGenerator.family(DecoBlocks.POLISHED_END_STONE);
        BlockModelGenerators.BlockFamilyProvider smoothendstonepool =
                blockStateModelGenerator.family(DecoBlocks.SMOOTH_END_STONE);
        BlockModelGenerators.BlockFamilyProvider endstonetilepool =
                blockStateModelGenerator.family(DecoBlocks.END_STONE_TILES);

        BlockModelGenerators.BlockFamilyProvider crackendstonebrickpool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_END_STONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider crackendstonetilepool =
                blockStateModelGenerator.family(DecoBlocks.CRACKED_END_STONE_TILES);

        BlockModelGenerators.BlockFamilyProvider haypool =
                blockStateModelGenerator.family(DecoBlocks.HAY_TEMP);

        blockStateModelGenerator.createFullAndCarpetBlocks(DecoBlocks.HAY_CARPET_TEMP, DecoBlocks.HAY_CARPET);

        BlockModelGenerators.BlockFamilyProvider nethwartpool =
                blockStateModelGenerator.family(DecoBlocks.NETHER_WART_TEMP);
        BlockModelGenerators.BlockFamilyProvider warpwartpool =
                blockStateModelGenerator.family(DecoBlocks.WARPED_WART_TEMP);

        BlockModelGenerators.BlockFamilyProvider sculkpool =
                blockStateModelGenerator.family(DecoBlocks.SCULK_TEMP);

        blockStateModelGenerator.createFullAndCarpetBlocks(DecoBlocks.SCULK_CARPET_TEMP, DecoBlocks.SCULK_CARPET);

        BlockModelGenerators.BlockFamilyProvider honeypool =
                blockStateModelGenerator.family(DecoBlocks.HONEYCOMB_TEMP);

        blockStateModelGenerator.createCrossBlockWithDefaultItem(DecoBlocks.HYDRATED_TUBE_CORAL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(DecoBlocks.HYDRATED_BRAIN_CORAL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(DecoBlocks.HYDRATED_BUBBLE_CORAL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(DecoBlocks.HYDRATED_HORN_CORAL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(DecoBlocks.HYDRATED_FIRE_CORAL, BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createCoralFans(DecoBlocks.HYDRATED_TUBE_CORAL_FAN, DecoBlocks.HYDRATED_TUBE_CORAL_WALL_FAN);
        blockStateModelGenerator.createCoralFans(DecoBlocks.HYDRATED_BRAIN_CORAL_FAN, DecoBlocks.HYDRATED_BRAIN_CORAL_WALL_FAN);
        blockStateModelGenerator.createCoralFans(DecoBlocks.HYDRATED_BUBBLE_CORAL_FAN, DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL_FAN);
        blockStateModelGenerator.createCoralFans(DecoBlocks.HYDRATED_FIRE_CORAL_FAN, DecoBlocks.HYDRATED_FIRE_CORAL_WALL_FAN);
        blockStateModelGenerator.createCoralFans(DecoBlocks.HYDRATED_HORN_CORAL_FAN, DecoBlocks.HYDRATED_HORN_CORAL_WALL_FAN);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.CLOUD_BLOCK);

        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.BASALT_BRICKS, TexturedModel.COLUMN);

        blockStateModelGenerator.createDoor(DecoBlocks.CACTUS_DOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.CACTUS_TRAPDOOR);

        blockStateModelGenerator.createDoor(DecoBlocks.MUSHROOM_DOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.MUSHROOM_TRAPDOOR);

        blockStateModelGenerator.createDoor(DecoBlocks.IRON_CAP_DOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.IRON_CAP_TRAPDOOR);

        blockStateModelGenerator.createDoor(DecoBlocks.WOODEN_DOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.WOODEN_TRAPDOOR);

        blockStateModelGenerator.createDoor(DecoBlocks.DRIFTWOOD_DOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.DRIFTWOOD_TRAPDOOR);

        blockStateModelGenerator.createDoor(DecoBlocks.GOLD_DOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.GOLD_TRAPDOOR);

        blockStateModelGenerator.createDoor(DecoBlocks.OAK_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.SPRUCE_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.BIRCH_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.JUNGLE_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.ACACIA_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.DARK_OAK_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.MANGROVE_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.CRIMSON_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.WARPED_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.CACTUS_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.MUSHROOM_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.WOODEN_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.CHERRY_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.BAMBOO_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.IRON_CAP_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.PALE_OAK_PALLET_DOOR);
        blockStateModelGenerator.createDoor(DecoBlocks.DRIFTWOOD_PALLET_DOOR);

        blockStateModelGenerator.createTrapdoor(DecoBlocks.OAK_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.SPRUCE_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.BIRCH_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.JUNGLE_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.ACACIA_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.MANGROVE_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.CRIMSON_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.WARPED_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.CACTUS_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.WOODEN_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.CHERRY_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.BAMBOO_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.IRON_CAP_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.PALE_OAK_PALLET_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(DecoBlocks.DRIFTWOOD_PALLET_TRAPDOOR);

        andesitepool.wall(DecoBlocks.POLISHED_ANDESITE_WALL);
        dioritepool.wall(DecoBlocks.POLISHED_DIORITE_WALL);
        granitepool.wall(DecoBlocks.POLISHED_GRANITE_WALL);
        stonepool.wall(DecoBlocks.STONE_WALL);

        smstonepool.stairs(DecoBlocks.SMOOTH_STONE_STAIRS);
        smstonepool.wall(DecoBlocks.SMOOTH_STONE_WALL);

        calcitepool.stairs(DecoBlocks.CALCITE_STAIRS);
        calcitepool.slab(DecoBlocks.CALCITE_SLAB);
        calcitepool.wall(DecoBlocks.CALCITE_WALL);
        dripstonepool.stairs(DecoBlocks.DRIPSTONE_STAIRS);
        dripstonepool.slab(DecoBlocks.DRIPSTONE_SLAB);
        dripstonepool.wall(DecoBlocks.DRIPSTONE_WALL);

        polistonepool.stairs(DecoBlocks.POLISHED_STONE_STAIRS);
        polistonepool.slab(DecoBlocks.POLISHED_STONE_SLAB);
        polistonepool.wall(DecoBlocks.POLISHED_STONE_WALL);

        stonetilepool.stairs(DecoBlocks.STONE_TILE_STAIRS);
        stonetilepool.slab(DecoBlocks.STONE_TILE_SLAB);
        stonetilepool.wall(DecoBlocks.STONE_TILE_WALL);

        packmudpool.stairs(DecoBlocks.PACKED_MUD_STAIRS);
        packmudpool.slab(DecoBlocks.PACKED_MUD_SLAB);
        packmudpool.wall(DecoBlocks.PACKED_MUD_WALL);

        netherbrickpool.fenceGate(DecoBlocks.NETHER_BRICK_FENCE_GATE);
        rednetherbrickpool.fence(DecoBlocks.RED_NETHER_BRICK_FENCE);
        rednetherbrickpool.fenceGate(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE);

        netherrackpool.stairs(DecoBlocks.NETHERRACK_STAIRS);
        netherrackpool.slab(DecoBlocks.NETHERRACK_SLAB);
        netherrackpool.wall(DecoBlocks.NETHERRACK_WALL);

        magmapool.stairs(DecoBlocks.MAGMA_STAIRS);
        magmapool.slab(DecoBlocks.MAGMA_SLAB);
        magmapool.wall(DecoBlocks.MAGMA_WALL);

        magmabrickpool.stairs(DecoBlocks.MAGMA_BRICK_STAIRS);
        magmabrickpool.slab(DecoBlocks.MAGMA_BRICK_SLAB);
        magmabrickpool.wall(DecoBlocks.MAGMA_BRICK_WALL);

        blackstonetilepool.stairs(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        blackstonetilepool.slab(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
        blackstonetilepool.wall(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL);

        snowpool.stairs(DecoBlocks.SNOW_STAIRS);
        snowpool.slab(DecoBlocks.SNOW_SLAB);
        snowpool.wall(DecoBlocks.SNOW_WALL);

        packicepool.stairs(DecoBlocks.PACKED_ICE_STAIRS);
        packicepool.slab(DecoBlocks.PACKED_ICE_SLAB);
        packicepool.wall(DecoBlocks.PACKED_ICE_WALL);

        blueicepool.stairs(DecoBlocks.BLUE_ICE_STAIRS);
        blueicepool.slab(DecoBlocks.BLUE_ICE_SLAB);
        blueicepool.wall(DecoBlocks.BLUE_ICE_WALL);

        snowbrickpool.stairs(DecoBlocks.SNOW_BRICK_STAIRS);
        snowbrickpool.slab(DecoBlocks.SNOW_BRICK_SLAB);
        snowbrickpool.wall(DecoBlocks.SNOW_BRICK_WALL);

        icebrickpool.stairs(DecoBlocks.ICE_BRICK_STAIRS);
        icebrickpool.slab(DecoBlocks.ICE_BRICK_SLAB);
        icebrickpool.wall(DecoBlocks.ICE_BRICK_WALL);

        smoothsandstonepool.wall(DecoBlocks.SMOOTH_SANDSTONE_WALL);
        smoothredsandstonepool.wall(DecoBlocks.SMOOTH_RED_SANDSTONE_WALL);

        darkprismarinepool.wall(DecoBlocks.DARK_PRISMARINE_WALL);
        prismarinebrickpool.wall(DecoBlocks.PRISMARINE_BRICK_WALL);

        cryprismarinepool.stairs(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS);
        cryprismarinepool.slab(DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB);
        cryprismarinepool.wall(DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL);

        cryprismarinebrickpool.stairs(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS);
        cryprismarinebrickpool.slab(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB);
        cryprismarinebrickpool.wall(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL);

        lightprismarinepool.stairs(DecoBlocks.LIGHT_PRISMARINE_STAIRS);
        lightprismarinepool.slab(DecoBlocks.LIGHT_PRISMARINE_SLAB);
        lightprismarinepool.wall(DecoBlocks.LIGHT_PRISMARINE_WALL);

        bubblepool.stairs(DecoBlocks.BUBBLE_STAIRS);
        bubblepool.slab(DecoBlocks.BUBBLE_SLAB);
        bubblepool.wall(DecoBlocks.BUBBLE_WALL);

        bubblebrickpool.stairs(DecoBlocks.BUBBLE_BRICK_STAIRS);
        bubblebrickpool.slab(DecoBlocks.BUBBLE_BRICK_SLAB);
        bubblebrickpool.wall(DecoBlocks.BUBBLE_BRICK_WALL);

        smoothsoulsoilpool.stairs(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS);
        smoothsoulsoilpool.slab(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB);
        smoothsoulsoilpool.wall(DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL);

        quartzbrickpool.stairs(DecoBlocks.QUARTZ_BRICK_STAIRS);
        quartzbrickpool.slab(DecoBlocks.QUARTZ_BRICK_SLAB);
        quartzbrickpool.wall(DecoBlocks.QUARTZ_BRICK_WALL);

        cutquartzpool.stairs(DecoBlocks.CUT_QUARTZ_STAIRS);
        cutquartzpool.slab(DecoBlocks.CUT_QUARTZ_SLAB);
        cutquartzpool.wall(DecoBlocks.CUT_QUARTZ_WALL);

        quartzpool.wall(DecoBlocks.QUARTZ_WALL);
        smoothquartzpool.wall(DecoBlocks.SMOOTH_QUARTZ_WALL);

        cactusplankpool.stairs(DecoBlocks.CACTUS_PLANK_STAIRS);
        cactusplankpool.slab(DecoBlocks.CACTUS_PLANK_SLAB);
        cactusplankpool.fence(DecoBlocks.CACTUS_PLANK_FENCE);
        cactusplankpool.button(DecoBlocks.CACTUS_PLANK_BUTTON);
        cactusplankpool.pressurePlate(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE);
        cactusplankpool.fenceGate(DecoBlocks.CACTUS_PLANK_FENCE_GATE);

        woodenpool.stairs(DecoBlocks.WOODEN_STAIRS);
        woodenpool.slab(DecoBlocks.WOODEN_SLAB);
        woodenpool.fence(DecoBlocks.WOODEN_FENCE);
        woodenpool.button(DecoBlocks.WOODEN_BUTTON);
        woodenpool.pressurePlate(DecoBlocks.WOODEN_PRESSURE_PLATE);
        woodenpool.fenceGate(DecoBlocks.WOODEN_FENCE_GATE);

        driftwoodpool.stairs(DecoBlocks.DRIFTWOOD_STAIRS);
        driftwoodpool.slab(DecoBlocks.DRIFTWOOD_SLAB);
        driftwoodpool.fence(DecoBlocks.DRIFTWOOD_FENCE);
        driftwoodpool.button(DecoBlocks.DRIFTWOOD_BUTTON);
        driftwoodpool.pressurePlate(DecoBlocks.DRIFTWOOD_PRESSURE_PLATE);
        driftwoodpool.fenceGate(DecoBlocks.DRIFTWOOD_FENCE_GATE);

        mushroompool.stairs(DecoBlocks.MUSHROOM_STAIRS);
        mushroompool.slab(DecoBlocks.MUSHROOM_SLAB);
        mushroompool.fence(DecoBlocks.MUSHROOM_FENCE);
        mushroompool.button(DecoBlocks.MUSHROOM_BUTTON);
        mushroompool.pressurePlate(DecoBlocks.MUSHROOM_PRESSURE_PLATE);
        mushroompool.fenceGate(DecoBlocks.MUSHROOM_FENCE_GATE);

        ironcappool.stairs(DecoBlocks.IRON_CAP_STAIRS);
        ironcappool.slab(DecoBlocks.IRON_CAP_SLAB);
        ironcappool.fence(DecoBlocks.IRON_CAP_FENCE);
        ironcappool.button(DecoBlocks.IRON_CAP_BUTTON);
        ironcappool.pressurePlate(DecoBlocks.IRON_CAP_PRESSURE_PLATE);
        ironcappool.fenceGate(DecoBlocks.IRON_CAP_FENCE_GATE);

        bluenetherpool.stairs(DecoBlocks.BLUE_NETHER_BRICK_STAIRS);
        bluenetherpool.slab(DecoBlocks.BLUE_NETHER_BRICK_SLAB);
        bluenetherpool.fence(DecoBlocks.BLUE_NETHER_BRICK_FENCE);
        bluenetherpool.wall(DecoBlocks.BLUE_NETHER_BRICK_WALL);
        bluenetherpool.fenceGate(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE);

        smoothdeepslatepool.stairs(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS);
        smoothdeepslatepool.wall(DecoBlocks.SMOOTH_DEEPSLATE_WALL);
        smoothblackstonepool.stairs(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS);
        smoothblackstonepool.wall(DecoBlocks.SMOOTH_BLACKSTONE_WALL);

        endstonepool.stairs(DecoBlocks.END_STONE_STAIRS);
        endstonepool.slab(DecoBlocks.END_STONE_SLAB);
        endstonepool.wall(DecoBlocks.END_STONE_WALL);
        endstonepool.button(DecoBlocks.END_STONE_BUTTON);
        endstonepool.pressurePlate(DecoBlocks.END_STONE_PRESSURE_PLATE);

        smoothpurpurpool.stairs(DecoBlocks.SMOOTH_PURPUR_STAIRS);
        smoothpurpurpool.slab(DecoBlocks.SMOOTH_PURPUR_SLAB);
        smoothpurpurpool.wall(DecoBlocks.SMOOTH_PURPUR_WALL);

        purpurbrickpool.stairs(DecoBlocks.PURPUR_BRICK_STAIRS);
        purpurbrickpool.slab(DecoBlocks.PURPUR_BRICK_SLAB);
        purpurbrickpool.wall(DecoBlocks.PURPUR_BRICK_WALL);

        voidstonepool.stairs(DecoBlocks.VOID_STONE_STAIRS);
        voidstonepool.slab(DecoBlocks.VOID_STONE_SLAB);
        voidstonepool.wall(DecoBlocks.VOID_STONE_WALL);

        voidstonebrickpool.stairs(DecoBlocks.VOID_STONE_BRICK_STAIRS);
        voidstonebrickpool.slab(DecoBlocks.VOID_STONE_BRICK_SLAB);
        voidstonebrickpool.wall(DecoBlocks.VOID_STONE_BRICK_WALL);

        obsidianpool.stairs(DecoBlocks.OBSIDIAN_STAIRS);
        obsidianpool.slab(DecoBlocks.OBSIDIAN_SLAB);
        obsidianpool.wall(DecoBlocks.OBSIDIAN_WALL);

        obsidianbrickpool.stairs(DecoBlocks.OBSIDIAN_BRICK_STAIRS);
        obsidianbrickpool.slab(DecoBlocks.OBSIDIAN_BRICK_SLAB);
        obsidianbrickpool.wall(DecoBlocks.OBSIDIAN_BRICK_WALL);


        cutironpool.stairs(DecoBlocks.CUT_IRON_STAIRS);
        cutironpool.slab(DecoBlocks.CUT_IRON_SLAB);

        oakmosaicpool.stairs(DecoBlocks.OAK_MOSAIC_STAIRS);
        oakmosaicpool.slab(DecoBlocks.OAK_MOSAIC_SLAB);

        birchmosaicpool.stairs(DecoBlocks.BIRCH_MOSAIC_STAIRS);
        birchmosaicpool.slab(DecoBlocks.BIRCH_MOSAIC_SLAB);

        sprucemosaicpool.stairs(DecoBlocks.SPRUCE_MOSAIC_STAIRS);
        sprucemosaicpool.slab(DecoBlocks.SPRUCE_MOSAIC_SLAB);

        junglemosaicpool.stairs(DecoBlocks.JUNGLE_MOSAIC_STAIRS);
        junglemosaicpool.slab(DecoBlocks.JUNGLE_MOSAIC_SLAB);

        acaciamosaicpool.stairs(DecoBlocks.ACACIA_MOSAIC_STAIRS);
        acaciamosaicpool.slab(DecoBlocks.ACACIA_MOSAIC_SLAB);

        darkoakmosaicpool.stairs(DecoBlocks.DARK_OAK_MOSAIC_STAIRS);
        darkoakmosaicpool.slab(DecoBlocks.DARK_OAK_MOSAIC_SLAB);

        mangrovemosaicpool.stairs(DecoBlocks.MANGROVE_MOSAIC_STAIRS);
        mangrovemosaicpool.slab(DecoBlocks.MANGROVE_MOSAIC_SLAB);

        cherrymosaicpool.stairs(DecoBlocks.CHERRY_MOSAIC_STAIRS);
        cherrymosaicpool.slab(DecoBlocks.CHERRY_MOSAIC_SLAB);

        crimsonmosaicpool.stairs(DecoBlocks.CRIMSON_MOSAIC_STAIRS);
        crimsonmosaicpool.slab(DecoBlocks.CRIMSON_MOSAIC_SLAB);

        warpedmosaicpool.stairs(DecoBlocks.WARPED_MOSAIC_STAIRS);
        warpedmosaicpool.slab(DecoBlocks.WARPED_MOSAIC_SLAB);

        cactusmosaicpool.stairs(DecoBlocks.CACTUS_MOSAIC_STAIRS);
        cactusmosaicpool.slab(DecoBlocks.CACTUS_MOSAIC_SLAB);

        paleoakmosaicpool.stairs(DecoBlocks.PALE_OAK_MOSAIC_STAIRS);
        paleoakmosaicpool.slab(DecoBlocks.PALE_OAK_MOSAIC_SLAB);

        woodenmosaicpool.stairs(DecoBlocks.WOODEN_MOSAIC_STAIRS);
        woodenmosaicpool.slab(DecoBlocks.WOODEN_MOSAIC_SLAB);

        driftwoodmosaicpool.stairs(DecoBlocks.DRIFTWOOD_MOSAIC_STAIRS);
        driftwoodmosaicpool.slab(DecoBlocks.DRIFTWOOD_MOSAIC_SLAB);

        mushmosaicpool.stairs(DecoBlocks.MUSHROOM_MOSAIC_STAIRS);
        mushmosaicpool.slab(DecoBlocks.MUSHROOM_MOSAIC_SLAB);

        ironcapmosaicpool.stairs(DecoBlocks.IRON_CAP_MOSAIC_STAIRS);
        ironcapmosaicpool.slab(DecoBlocks.IRON_CAP_MOSAIC_SLAB);

        polishedeepslatepool.button(DecoBlocks.POLISHED_DEEPSLATE_BUTTON);
        polishedeepslatepool.pressurePlate(DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

        deepslatepool.button(DecoBlocks.DEEPSLATE_BUTTON);
        deepslatepool.pressurePlate(DecoBlocks.DEEPSLATE_PRESSURE_PLATE);

        cobbledeepslatepool.button(DecoBlocks.COBBLED_DEEPSLATE_BUTTON);
        cobbledeepslatepool.pressurePlate(DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);

        cobblestonepool.button(DecoBlocks.COBBLESTONE_BUTTON);
        cobblestonepool.pressurePlate(DecoBlocks.COBBLESTONE_PRESSURE_PLATE);

        blackstonepool.button(DecoBlocks.BLACKSTONE_BUTTON);
        blackstonepool.pressurePlate(DecoBlocks.BLACKSTONE_PRESSURE_PLATE);

        polistonepool.button(DecoBlocks.POLISHED_STONE_BUTTON);
        polistonepool.pressurePlate(DecoBlocks.POLISHED_STONE_PRESSURE_PLATE);

        cobsandstonepool.stairs(DecoBlocks.COBBLED_SANDSTONE_STAIRS);
        cobsandstonepool.slab(DecoBlocks.COBBLED_SANDSTONE_SLAB);
        cobsandstonepool.wall(DecoBlocks.COBBLED_SANDSTONE_WALL);

        cobredsandstonepool.stairs(DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS);
        cobredsandstonepool.slab(DecoBlocks.COBBLED_RED_SANDSTONE_SLAB);
        cobredsandstonepool.wall(DecoBlocks.COBBLED_RED_SANDSTONE_WALL);

        cobsoulsoilstonepool.stairs(DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS);
        cobsoulsoilstonepool.slab(DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB);
        cobsoulsoilstonepool.wall(DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL);

        polisandstonepool.stairs(DecoBlocks.POLISHED_SANDSTONE_STAIRS);
        polisandstonepool.slab(DecoBlocks.POLISHED_SANDSTONE_SLAB);
        polisandstonepool.wall(DecoBlocks.POLISHED_SANDSTONE_WALL);

        poliredsandstonepool.stairs(DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS);
        poliredsandstonepool.slab(DecoBlocks.POLISHED_RED_SANDSTONE_SLAB);
        poliredsandstonepool.wall(DecoBlocks.POLISHED_RED_SANDSTONE_WALL);

        polisoulsoilstonepool.stairs(DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS);
        polisoulsoilstonepool.slab(DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB);
        polisoulsoilstonepool.wall(DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL);

        sandstonebrickspool.stairs(DecoBlocks.SANDSTONE_BRICK_STAIRS);
        sandstonebrickspool.slab(DecoBlocks.SANDSTONE_BRICK_SLAB);
        sandstonebrickspool.wall(DecoBlocks.SANDSTONE_BRICK_WALL);

        redsandstonebrickspool.stairs(DecoBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redsandstonebrickspool.slab(DecoBlocks.RED_SANDSTONE_BRICK_SLAB);
        redsandstonebrickspool.wall(DecoBlocks.RED_SANDSTONE_BRICK_WALL);

        soulsoilstonebrickspool.stairs(DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS);
        soulsoilstonebrickspool.slab(DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB);
        soulsoilstonebrickspool.wall(DecoBlocks.SOUL_SOILSTONE_BRICK_WALL);

        cutpurpurpool.stairs(DecoBlocks.CUT_PURPUR_STAIRS);
        cutpurpurpool.slab(DecoBlocks.CUT_PURPUR_SLAB);
        cutpurpurpool.wall(DecoBlocks.CUT_PURPUR_WALL);

        oakwoodpool.stairs(DecoBlocks.OAK_WOOD_STAIRS);
        oakwoodpool.slab(DecoBlocks.OAK_WOOD_SLAB);
        oakwoodpool.wall(DecoBlocks.OAK_WOOD_WALL);

        sprucewoodpool.stairs(DecoBlocks.SPRUCE_WOOD_STAIRS);
        sprucewoodpool.slab(DecoBlocks.SPRUCE_WOOD_SLAB);
        sprucewoodpool.wall(DecoBlocks.SPRUCE_WOOD_WALL);

        birchwoodpool.stairs(DecoBlocks.BIRCH_WOOD_STAIRS);
        birchwoodpool.slab(DecoBlocks.BIRCH_WOOD_SLAB);
        birchwoodpool.wall(DecoBlocks.BIRCH_WOOD_WALL);

        junglewoodpool.stairs(DecoBlocks.JUNGLE_WOOD_STAIRS);
        junglewoodpool.slab(DecoBlocks.JUNGLE_WOOD_SLAB);
        junglewoodpool.wall(DecoBlocks.JUNGLE_WOOD_WALL);

        acaciawoodpool.stairs(DecoBlocks.ACACIA_WOOD_STAIRS);
        acaciawoodpool.slab(DecoBlocks.ACACIA_WOOD_SLAB);
        acaciawoodpool.wall(DecoBlocks.ACACIA_WOOD_WALL);

        darkoakwoodpool.stairs(DecoBlocks.DARK_OAK_WOOD_STAIRS);
        darkoakwoodpool.slab(DecoBlocks.DARK_OAK_WOOD_SLAB);
        darkoakwoodpool.wall(DecoBlocks.DARK_OAK_WOOD_WALL);

        mangrovewoodpool.stairs(DecoBlocks.MANGROVE_WOOD_STAIRS);
        mangrovewoodpool.slab(DecoBlocks.MANGROVE_WOOD_SLAB);
        mangrovewoodpool.wall(DecoBlocks.MANGROVE_WOOD_WALL);

        cherrywoodpool.stairs(DecoBlocks.CHERRY_WOOD_STAIRS);
        cherrywoodpool.slab(DecoBlocks.CHERRY_WOOD_SLAB);
        cherrywoodpool.wall(DecoBlocks.CHERRY_WOOD_WALL);

        crimsonhyphaepool.stairs(DecoBlocks.CRIMSON_HYPHAE_STAIRS);
        crimsonhyphaepool.slab(DecoBlocks.CRIMSON_HYPHAE_SLAB);
        crimsonhyphaepool.wall(DecoBlocks.CRIMSON_HYPHAE_WALL);

        warpedhyphaepool.stairs(DecoBlocks.WARPED_HYPHAE_STAIRS);
        warpedhyphaepool.slab(DecoBlocks.WARPED_HYPHAE_SLAB);
        warpedhyphaepool.wall(DecoBlocks.WARPED_HYPHAE_WALL);

        strippedoakwoodpool.stairs(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS);
        strippedoakwoodpool.slab(DecoBlocks.STRIPPED_OAK_WOOD_SLAB);
        strippedoakwoodpool.wall(DecoBlocks.STRIPPED_OAK_WOOD_WALL);

        strippedsprucewoodpool.stairs(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS);
        strippedsprucewoodpool.slab(DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB);
        strippedsprucewoodpool.wall(DecoBlocks.STRIPPED_SPRUCE_WOOD_WALL);

        strippedbirchwoodpool.stairs(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS);
        strippedbirchwoodpool.slab(DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB);
        strippedbirchwoodpool.wall(DecoBlocks.STRIPPED_BIRCH_WOOD_WALL);

        strippedjunglewoodpool.stairs(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS);
        strippedjunglewoodpool.slab(DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB);
        strippedjunglewoodpool.wall(DecoBlocks.STRIPPED_JUNGLE_WOOD_WALL);

        strippedacaciawoodpool.stairs(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS);
        strippedacaciawoodpool.slab(DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB);
        strippedacaciawoodpool.wall(DecoBlocks.STRIPPED_ACACIA_WOOD_WALL);

        strippeddarkoakwoodpool.stairs(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS);
        strippeddarkoakwoodpool.slab(DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB);
        strippeddarkoakwoodpool.wall(DecoBlocks.STRIPPED_DARK_OAK_WOOD_WALL);

        strippedmangrovewoodpool.stairs(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS);
        strippedmangrovewoodpool.slab(DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB);
        strippedmangrovewoodpool.wall(DecoBlocks.STRIPPED_MANGROVE_WOOD_WALL);

        strippedcrimsonhyphaepool.stairs(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS);
        strippedcrimsonhyphaepool.slab(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB);
        strippedcrimsonhyphaepool.wall(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_WALL);

        strippedwarpedhyphaepool.stairs(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS);
        strippedwarpedhyphaepool.slab(DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB);
        strippedwarpedhyphaepool.wall(DecoBlocks.STRIPPED_WARPED_HYPHAE_WALL);

        strippedcherrywoodpool.stairs(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS);
        strippedcherrywoodpool.slab(DecoBlocks.STRIPPED_CHERRY_WOOD_SLAB);
        strippedcherrywoodpool.wall(DecoBlocks.STRIPPED_CHERRY_WOOD_WALL);

        woodenwoodpool.stairs(DecoBlocks.WOODEN_WOOD_STAIRS);
        woodenwoodpool.slab(DecoBlocks.WOODEN_WOOD_SLAB);
        woodenwoodpool.wall(DecoBlocks.WOODEN_WOOD_WALL);

        strippedwoodenwoodpool.stairs(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS);
        strippedwoodenwoodpool.slab(DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB);
        strippedwoodenwoodpool.wall(DecoBlocks.STRIPPED_WOODEN_WOOD_WALL);

        ironcapstempool.stairs(DecoBlocks.IRON_CAP_HYPHAE_STAIRS);
        ironcapstempool.slab(DecoBlocks.IRON_CAP_HYPHAE_SLAB);
        ironcapstempool.wall(DecoBlocks.IRON_CAP_HYPHAE_WALL);

        strippedironcapstempool.stairs(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS);
        strippedironcapstempool.slab(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_SLAB);
        strippedironcapstempool.wall(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_WALL);

        paleoakwoodpool.stairs(DecoBlocks.PALE_OAK_WOOD_STAIRS);
        paleoakwoodpool.slab(DecoBlocks.PALE_OAK_WOOD_SLAB);
        paleoakwoodpool.wall(DecoBlocks.PALE_OAK_WOOD_WALL);

        strippedpaleoakpool.stairs(DecoBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS);
        strippedpaleoakpool.slab(DecoBlocks.STRIPPED_PALE_OAK_WOOD_SLAB);
        strippedpaleoakpool.wall(DecoBlocks.STRIPPED_PALE_OAK_WOOD_WALL);

        driftwoodlogpool.stairs(DecoBlocks.DRIFTWOOD_LOG_STAIRS);
        driftwoodlogpool.slab(DecoBlocks.DRIFTWOOD_LOG_SLAB);
        driftwoodlogpool.wall(DecoBlocks.DRIFTWOOD_LOG_WALL);

        drieddriftwoodpool.stairs(DecoBlocks.DRIED_DRIFTWOOD_STAIRS);
        drieddriftwoodpool.slab(DecoBlocks.DRIED_DRIFTWOOD_SLAB);
        drieddriftwoodpool.wall(DecoBlocks.DRIED_DRIFTWOOD_WALL);

        strippeddriftwoodpool.stairs(DecoBlocks.STRIPPED_DRIFTWOOD_STAIRS);
        strippeddriftwoodpool.slab(DecoBlocks.STRIPPED_DRIFTWOOD_SLAB);
        strippeddriftwoodpool.wall(DecoBlocks.STRIPPED_DRIFTWOOD_WALL);

        packednetherrackpool.stairs(DecoBlocks.PACKED_NETHERRACK_STAIRS);
        packednetherrackpool.slab(DecoBlocks.PACKED_NETHERRACK_SLAB);
        packednetherrackpool.wall(DecoBlocks.PACKED_NETHERRACK_WALL);

        netherrackbrickpool.stairs(DecoBlocks.NETHERRACK_BRICK_STAIRS);
        netherrackbrickpool.slab(DecoBlocks.NETHERRACK_BRICK_SLAB);
        netherrackbrickpool.wall(DecoBlocks.NETHERRACK_BRICK_WALL);

        policalcpool.stairs(DecoBlocks.POLISHED_CALCITE_STAIRS);
        policalcpool.slab(DecoBlocks.POLISHED_CALCITE_SLAB);
        policalcpool.wall(DecoBlocks.POLISHED_CALCITE_WALL);

        cutcalcpool.stairs(DecoBlocks.CUT_CALCITE_STAIRS);
        cutcalcpool.slab(DecoBlocks.CUT_CALCITE_SLAB);
        cutcalcpool.wall(DecoBlocks.CUT_CALCITE_WALL);

        calcbrickpool.stairs(DecoBlocks.CALCITE_BRICK_STAIRS);
        calcbrickpool.slab(DecoBlocks.CALCITE_BRICK_SLAB);
        calcbrickpool.wall(DecoBlocks.CALCITE_BRICK_WALL);

        cutandespool.stairs(DecoBlocks.CUT_ANDESITE_STAIRS);
        cutandespool.slab(DecoBlocks.CUT_ANDESITE_SLAB);
        cutandespool.wall(DecoBlocks.CUT_ANDESITE_WALL);

        andesbrickpool.stairs(DecoBlocks.ANDESITE_BRICK_STAIRS);
        andesbrickpool.slab(DecoBlocks.ANDESITE_BRICK_SLAB);
        andesbrickpool.wall(DecoBlocks.ANDESITE_BRICK_WALL);

        cutdiorpool.stairs(DecoBlocks.CUT_DIORITE_STAIRS);
        cutdiorpool.slab(DecoBlocks.CUT_DIORITE_SLAB);
        cutdiorpool.wall(DecoBlocks.CUT_DIORITE_WALL);

        diorbrickpool.stairs(DecoBlocks.DIORITE_BRICK_STAIRS);
        diorbrickpool.slab(DecoBlocks.DIORITE_BRICK_SLAB);
        diorbrickpool.wall(DecoBlocks.DIORITE_BRICK_WALL);

        cutgranpool.stairs(DecoBlocks.CUT_GRANITE_STAIRS);
        cutgranpool.slab(DecoBlocks.CUT_GRANITE_SLAB);
        cutgranpool.wall(DecoBlocks.CUT_GRANITE_WALL);

        granbrickpool.stairs(DecoBlocks.GRANITE_BRICK_STAIRS);
        granbrickpool.slab(DecoBlocks.GRANITE_BRICK_SLAB);
        granbrickpool.wall(DecoBlocks.GRANITE_BRICK_WALL);

        cutgoldpool.stairs(DecoBlocks.CUT_GOLD_STAIRS);
        cutgoldpool.slab(DecoBlocks.CUT_GOLD_SLAB);

        ironpool.stairs(DecoBlocks.IRON_STAIRS);
        ironpool.slab(DecoBlocks.IRON_SLAB);
        rawironpool.stairs(DecoBlocks.RAW_IRON_STAIRS);
        rawironpool.slab(DecoBlocks.RAW_IRON_SLAB);

        goldpool.stairs(DecoBlocks.GOLD_STAIRS);
        goldpool.slab(DecoBlocks.GOLD_SLAB);
        rawgoldpool.stairs(DecoBlocks.RAW_GOLD_STAIRS);
        rawgoldpool.slab(DecoBlocks.RAW_GOLD_SLAB);

        copperpool.stairs(DecoBlocks.COPPER_STAIRS);
        copperpool.slab(DecoBlocks.COPPER_SLAB);
        rawcopperpool.stairs(DecoBlocks.RAW_COPPER_STAIRS);
        rawcopperpool.slab(DecoBlocks.RAW_COPPER_SLAB);
        copperpool.stairs(DecoBlocks.WAXED_COPPER_STAIRS);
        copperpool.slab(DecoBlocks.WAXED_COPPER_SLAB);

        expcopperpool.stairs(DecoBlocks.EXPOSED_COPPER_STAIRS);
        expcopperpool.slab(DecoBlocks.EXPOSED_COPPER_SLAB);
        expcopperpool.stairs(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        expcopperpool.slab(DecoBlocks.WAXED_EXPOSED_COPPER_SLAB);

        weathcopperpool.stairs(DecoBlocks.WEATHERED_COPPER_STAIRS);
        weathcopperpool.slab(DecoBlocks.WEATHERED_COPPER_SLAB);
        weathcopperpool.stairs(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        weathcopperpool.slab(DecoBlocks.WAXED_WEATHERED_COPPER_SLAB);

        oxidcopperpool.stairs(DecoBlocks.OXIDIZED_COPPER_STAIRS);
        oxidcopperpool.slab(DecoBlocks.OXIDIZED_COPPER_SLAB);
        oxidcopperpool.stairs(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
        oxidcopperpool.slab(DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB);

        sandobsidianpool.stairs(DecoBlocks.SANDED_OBSIDIAN_STAIRS);
        sandobsidianpool.slab(DecoBlocks.SANDED_OBSIDIAN_SLAB);
        sandobsidianpool.wall(DecoBlocks.SANDED_OBSIDIAN_WALL);

        smobsidianpool.stairs(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS);
        smobsidianpool.slab(DecoBlocks.SMOOTH_OBSIDIAN_SLAB);
        smobsidianpool.wall(DecoBlocks.SMOOTH_OBSIDIAN_WALL);

        cutobsidianpool.stairs(DecoBlocks.CUT_OBSIDIAN_STAIRS);
        cutobsidianpool.slab(DecoBlocks.CUT_OBSIDIAN_SLAB);
        cutobsidianpool.wall(DecoBlocks.CUT_OBSIDIAN_WALL);

        poliendstonepool.stairs(DecoBlocks.POLISHED_END_STONE_STAIRS);
        poliendstonepool.slab(DecoBlocks.POLISHED_END_STONE_SLAB);
        poliendstonepool.wall(DecoBlocks.POLISHED_END_STONE_WALL);
        poliendstonepool.pressurePlate(DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE);
        poliendstonepool.button(DecoBlocks.POLISHED_END_STONE_BUTTON);

        smoothendstonepool.stairs(DecoBlocks.SMOOTH_END_STONE_STAIRS);
        smoothendstonepool.wall(DecoBlocks.SMOOTH_END_STONE_WALL);
        endstonetilepool.stairs(DecoBlocks.END_STONE_TILE_STAIRS);
        endstonetilepool.slab(DecoBlocks.END_STONE_TILE_SLAB);
        endstonetilepool.wall(DecoBlocks.END_STONE_TILE_WALL);

        drygrasspool.stairs(DecoBlocks.DRY_GRASS_STAIRS);
        drygrasspool.slab(DecoBlocks.DRY_GRASS_SLAB);

        podzolpool.stairs(DecoBlocks.PODZOL_STAIRS);
        podzolpool.slab(DecoBlocks.PODZOL_SLAB);

        myceliumpool.stairs(DecoBlocks.MYCELIUM_STAIRS);
        myceliumpool.slab(DecoBlocks.MYCELIUM_SLAB);

        crimnylpool.stairs(DecoBlocks.CRIMSON_NYLIUM_STAIRS);
        crimnylpool.slab(DecoBlocks.CRIMSON_NYLIUM_SLAB);

        warpnylpool.stairs(DecoBlocks.WARPED_NYLIUM_STAIRS);
        warpnylpool.slab(DecoBlocks.WARPED_NYLIUM_SLAB);

        mosspool.stairs(DecoBlocks.MOSS_STAIRS);
        mosspool.slab(DecoBlocks.MOSS_SLAB);

        dirtpool.stairs(DecoBlocks.DIRT_STAIRS);
        dirtpool.slab(DecoBlocks.DIRT_SLAB);
        dirtpool.wall(DecoBlocks.DIRT_WALL);

        coarsedirtpool.stairs(DecoBlocks.COARSE_DIRT_STAIRS);
        coarsedirtpool.slab(DecoBlocks.COARSE_DIRT_SLAB);
        coarsedirtpool.wall(DecoBlocks.COARSE_DIRT_WALL);

        rooteddirtpool.stairs(DecoBlocks.ROOTED_DIRT_STAIRS);
        rooteddirtpool.slab(DecoBlocks.ROOTED_DIRT_SLAB);
        rooteddirtpool.wall(DecoBlocks.ROOTED_DIRT_WALL);

        mudpool.stairs(DecoBlocks.MUD_STAIRS);
        mudpool.slab(DecoBlocks.MUD_SLAB);
        mudpool.wall(DecoBlocks.MUD_WALL);

        claypool.stairs(DecoBlocks.CLAY_STAIRS);
        claypool.slab(DecoBlocks.CLAY_SLAB);
        claypool.wall(DecoBlocks.CLAY_WALL);

        bonepool.stairs(DecoBlocks.BONE_STAIRS);
        bonepool.slab(DecoBlocks.BONE_SLAB);
        bonepool.wall(DecoBlocks.BONE_WALL);

        bedrockpool.stairs(DecoBlocks.BEDROCK_STAIRS);
        bedrockpool.slab(DecoBlocks.BEDROCK_SLAB);
        bedrockpool.wall(DecoBlocks.BEDROCK_WALL);

        cloudpool.stairs(DecoBlocks.CLOUD_STAIRS);
        cloudpool.slab(DecoBlocks.CLOUD_SLAB);
        cloudpool.wall(DecoBlocks.CLOUD_WALL);

        cloudbrickpool.stairs(DecoBlocks.CLOUD_BRICK_STAIRS);
        cloudbrickpool.slab(DecoBlocks.CLOUD_BRICK_SLAB);
        cloudbrickpool.wall(DecoBlocks.CLOUD_BRICK_WALL);

        crackstonebrickpool.stairs(DecoBlocks.CRACKED_STONE_BRICK_STAIRS);
        crackstonebrickpool.slab(DecoBlocks.CRACKED_STONE_BRICK_SLAB);
        crackstonebrickpool.wall(DecoBlocks.CRACKED_STONE_BRICK_WALL);

        crackstonetilepool.stairs(DecoBlocks.CRACKED_STONE_TILE_STAIRS);
        crackstonetilepool.slab(DecoBlocks.CRACKED_STONE_TILE_SLAB);
        crackstonetilepool.wall(DecoBlocks.CRACKED_STONE_TILE_WALL);

        crackblackstonebrickpool.stairs(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        crackblackstonebrickpool.slab(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        crackblackstonebrickpool.wall(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);

        crackblackstonetilepool.stairs(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS);
        crackblackstonetilepool.slab(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB);
        crackblackstonetilepool.wall(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL);

        crackdeepbrickpool.stairs(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        crackdeepbrickpool.slab(DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
        crackdeepbrickpool.wall(DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL);

        crackdeeptilepool.stairs(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        crackdeeptilepool.slab(DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
        crackdeeptilepool.wall(DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL);

        crackendstonebrickpool.stairs(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS);
        crackendstonebrickpool.slab(DecoBlocks.CRACKED_END_STONE_BRICK_SLAB);
        crackendstonebrickpool.wall(DecoBlocks.CRACKED_END_STONE_BRICK_WALL);

        crackendstonetilepool.stairs(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS);
        crackendstonetilepool.slab(DecoBlocks.CRACKED_END_STONE_TILE_SLAB);
        crackendstonetilepool.wall(DecoBlocks.CRACKED_END_STONE_TILE_WALL);

        cracknetherpool.stairs(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS);
        cracknetherpool.slab(DecoBlocks.CRACKED_NETHER_BRICK_SLAB);
        cracknetherpool.wall(DecoBlocks.CRACKED_NETHER_BRICK_WALL);
        cracknetherpool.fence(DecoBlocks.CRACKED_NETHER_BRICK_FENCE);
        cracknetherpool.fenceGate(DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);

        crackrednetherpool.stairs(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS);
        crackrednetherpool.slab(DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB);
        crackrednetherpool.wall(DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL);
        crackrednetherpool.fence(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE);
        crackrednetherpool.fenceGate(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE);

        crackbluenetherpool.stairs(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS);
        crackbluenetherpool.slab(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB);
        crackbluenetherpool.wall(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL);
        crackbluenetherpool.fence(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE);
        crackbluenetherpool.fenceGate(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE);

        cracktuffbrickpool.stairs(DecoBlocks.CRACKED_TUFF_BRICK_STAIRS);
        cracktuffbrickpool.slab(DecoBlocks.CRACKED_TUFF_BRICK_SLAB);
        cracktuffbrickpool.wall(DecoBlocks.CRACKED_TUFF_BRICK_WALL);

        cracktufftilepool.stairs(DecoBlocks.CRACKED_TUFF_TILE_STAIRS);
        cracktufftilepool.slab(DecoBlocks.CRACKED_TUFF_TILE_SLAB);
        cracktufftilepool.wall(DecoBlocks.CRACKED_TUFF_TILE_WALL);

        palemosspool.stairs(DecoBlocks.PALE_MOSS_STAIRS);
        palemosspool.slab(DecoBlocks.PALE_MOSS_SLAB);

        resinpool.stairs(DecoBlocks.RESIN_STAIRS);
        resinpool.slab(DecoBlocks.RESIN_SLAB);
        resinpool.wall(DecoBlocks.RESIN_WALL);

        smoothresinpool.stairs(DecoBlocks.SMOOTH_RESIN_STAIRS);
        smoothresinpool.slab(DecoBlocks.SMOOTH_RESIN_SLAB);
        smoothresinpool.wall(DecoBlocks.SMOOTH_RESIN_WALL);

        mossdeeppool.stairs(DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
        mossdeeppool.slab(DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
        mossdeeppool.wall(DecoBlocks.MOSSY_DEEPSLATE_BRICK_WALL);

        mossblackstonepool.stairs(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS);
        mossblackstonepool.slab(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB);
        mossblackstonepool.wall(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL);

        mossendstonepool.stairs(DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS);
        mossendstonepool.slab(DecoBlocks.MOSSY_END_STONE_BRICK_SLAB);
        mossendstonepool.wall(DecoBlocks.MOSSY_END_STONE_BRICK_WALL);

        lapispool.stairs(DecoBlocks.LAPIS_STAIRS);
        lapispool.slab(DecoBlocks.LAPIS_SLAB);
        lapispool.wall(DecoBlocks.LAPIS_WALL);

        cutlapispool.stairs(DecoBlocks.CUT_LAPIS_STAIRS);
        cutlapispool.slab(DecoBlocks.CUT_LAPIS_SLAB);
        cutlapispool.wall(DecoBlocks.CUT_LAPIS_WALL);

        smlapispool.stairs(DecoBlocks.SMOOTH_LAPIS_STAIRS);
        smlapispool.slab(DecoBlocks.SMOOTH_LAPIS_SLAB);
        smlapispool.wall(DecoBlocks.SMOOTH_LAPIS_WALL);

        lapisbrickpool.stairs(DecoBlocks.LAPIS_BRICK_STAIRS);
        lapisbrickpool.slab(DecoBlocks.LAPIS_BRICK_SLAB);
        lapisbrickpool.wall(DecoBlocks.LAPIS_BRICK_WALL);

        castironpool.stairs(DecoBlocks.CASTED_IRON_STAIRS);
        castironpool.slab(DecoBlocks.CASTED_IRON_SLAB);

        dripbrickpool.stairs(DecoBlocks.DRIPSTONE_BRICK_STAIRS);
        dripbrickpool.slab(DecoBlocks.DRIPSTONE_BRICK_SLAB);
        dripbrickpool.wall(DecoBlocks.DRIPSTONE_BRICK_WALL);

        dripbrickpillarpool.stairs(DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS);
        dripbrickpillarpool.slab(DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB);
        dripbrickpillarpool.wall(DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL);

        voidstonebrickpillarpool.stairs(DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS);
        voidstonebrickpillarpool.slab(DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB);
        voidstonebrickpillarpool.wall(DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL);

        mossytuffbrickpool.stairs(DecoBlocks.MOSSY_TUFF_BRICK_STAIRS);
        mossytuffbrickpool.slab(DecoBlocks.MOSSY_TUFF_BRICK_SLAB);
        mossytuffbrickpool.wall(DecoBlocks.MOSSY_TUFF_BRICK_WALL);

        tubecoralpool.stairs(DecoBlocks.TUBE_CORAL_STAIRS);
        tubecoralpool.slab(DecoBlocks.TUBE_CORAL_SLAB);
        tubecoralpool.wall(DecoBlocks.TUBE_CORAL_WALL);
        bubblecoralpool.stairs(DecoBlocks.BUBBLE_CORAL_STAIRS);
        bubblecoralpool.slab(DecoBlocks.BUBBLE_CORAL_SLAB);
        bubblecoralpool.wall(DecoBlocks.BUBBLE_CORAL_WALL);
        braincoralpool.stairs(DecoBlocks.BRAIN_CORAL_STAIRS);
        braincoralpool.slab(DecoBlocks.BRAIN_CORAL_SLAB);
        braincoralpool.wall(DecoBlocks.BRAIN_CORAL_WALL);
        firecoralpool.stairs(DecoBlocks.FIRE_CORAL_STAIRS);
        firecoralpool.slab(DecoBlocks.FIRE_CORAL_SLAB);
        firecoralpool.wall(DecoBlocks.FIRE_CORAL_WALL);
        horncoralpool.stairs(DecoBlocks.HORN_CORAL_STAIRS);
        horncoralpool.slab(DecoBlocks.HORN_CORAL_SLAB);
        horncoralpool.wall(DecoBlocks.HORN_CORAL_WALL);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_POLISHED_CALCITE);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CUT_GRANITE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CUT_ANDESITE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CUT_CALCITE);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CUT_DIORITE);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_GRANITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_ANDESITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_CALCITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_DIORITE_BRICKS);

        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_MOSSY_DEEPSLATE_BRICKS);
        blockStateModelGenerator.createTrivialCube(DecoBlocks.INFESTED_MOSSY_POLISHED_BLACKSTONE_BRICKS);

        tubecoralpool.stairs(DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS);
        tubecoralpool.slab(DecoBlocks.HYDRATED_TUBE_CORAL_SLAB);
        tubecoralpool.wall(DecoBlocks.HYDRATED_TUBE_CORAL_WALL);
        bubblecoralpool.stairs(DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS);
        bubblecoralpool.slab(DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB);
        bubblecoralpool.wall(DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL);
        braincoralpool.stairs(DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS);
        braincoralpool.slab(DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB);
        braincoralpool.wall(DecoBlocks.HYDRATED_BRAIN_CORAL_WALL);
        firecoralpool.stairs(DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS);
        firecoralpool.slab(DecoBlocks.HYDRATED_FIRE_CORAL_SLAB);
        firecoralpool.wall(DecoBlocks.HYDRATED_FIRE_CORAL_WALL);
        horncoralpool.stairs(DecoBlocks.HYDRATED_HORN_CORAL_STAIRS);
        horncoralpool.slab(DecoBlocks.HYDRATED_HORN_CORAL_SLAB);
        horncoralpool.wall(DecoBlocks.HYDRATED_HORN_CORAL_WALL);

        deadtubecoralpool.stairs(DecoBlocks.DEAD_TUBE_CORAL_STAIRS);
        deadtubecoralpool.slab(DecoBlocks.DEAD_TUBE_CORAL_SLAB);
        deadtubecoralpool.wall(DecoBlocks.DEAD_TUBE_CORAL_WALL);
        deadbubblecoralpool.stairs(DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS);
        deadbubblecoralpool.slab(DecoBlocks.DEAD_BUBBLE_CORAL_SLAB);
        deadbubblecoralpool.wall(DecoBlocks.DEAD_BUBBLE_CORAL_WALL);
        deadbraincoralpool.stairs(DecoBlocks.DEAD_BRAIN_CORAL_STAIRS);
        deadbraincoralpool.slab(DecoBlocks.DEAD_BRAIN_CORAL_SLAB);
        deadbraincoralpool.wall(DecoBlocks.DEAD_BRAIN_CORAL_WALL);
        deadfirecoralpool.stairs(DecoBlocks.DEAD_FIRE_CORAL_STAIRS);
        deadfirecoralpool.slab(DecoBlocks.DEAD_FIRE_CORAL_SLAB);
        deadfirecoralpool.wall(DecoBlocks.DEAD_FIRE_CORAL_WALL);
        deadhorncoralpool.stairs(DecoBlocks.DEAD_HORN_CORAL_STAIRS);
        deadhorncoralpool.slab(DecoBlocks.DEAD_HORN_CORAL_SLAB);
        deadhorncoralpool.wall(DecoBlocks.DEAD_HORN_CORAL_WALL);

        haypool.stairs(DecoBlocks.HAY_STAIRS);
        haypool.slab(DecoBlocks.HAY_SLAB);

        nethwartpool.stairs(DecoBlocks.NETHER_WART_STAIRS);
        nethwartpool.slab(DecoBlocks.NETHER_WART_SLAB);

        warpwartpool.stairs(DecoBlocks.WARPED_WART_STAIRS);
        warpwartpool.slab(DecoBlocks.WARPED_WART_SLAB);

        sculkpool.stairs(DecoBlocks.SCULK_STAIRS);
        sculkpool.slab(DecoBlocks.SCULK_SLAB);

        honeypool.stairs(DecoBlocks.HONEYCOMB_STAIRS);
        honeypool.slab(DecoBlocks.HONEYCOMB_SLAB);
        honeypool.wall(DecoBlocks.HONEYCOMB_WALL);

        bamboopool.stairs(DecoBlocks.BAMBOO_BLOCK_STAIRS);
        bamboopool.slab(DecoBlocks.BAMBOO_BLOCK_SLAB);
        bamboopool.wall(DecoBlocks.BAMBOO_BLOCK_WALL);

        strippedbamboopool.stairs(DecoBlocks.STRIPPED_BAMBOO_STAIRS);
        strippedbamboopool.slab(DecoBlocks.STRIPPED_BAMBOO_SLAB);
        strippedbamboopool.wall(DecoBlocks.STRIPPED_BAMBOO_WALL);

        cactusplankpool.generateFor(DecoBlocks.CACTUS_FAMILY);
        woodenpool.generateFor(DecoBlocks.WOODEN_FAMILY);
        mushroompool.generateFor(DecoBlocks.MUSHROOM_FAMILY);
        ironcappool.generateFor(DecoBlocks.IRON_CAP_FAMILY);
        driftwoodpool.generateFor(DecoBlocks.DRIFTWOOD_FAMILY);

        smoothtuffpool.stairs(DecoBlocks.SMOOTH_TUFF_STAIRS);
        smoothtuffpool.wall(DecoBlocks.SMOOTH_TUFF_WALL);

        tufftilepool.stairs(DecoBlocks.TUFF_TILE_STAIRS);
        tufftilepool.slab(DecoBlocks.TUFF_TILE_SLAB);
        tufftilepool.wall(DecoBlocks.TUFF_TILE_WALL);

        tuffpool.button(DecoBlocks.TUFF_BUTTON);
        tuffpool.pressurePlate(DecoBlocks.TUFF_PRESSURE_PLATE);

        polishedtuffpool.button(DecoBlocks.POLISHED_TUFF_BUTTON);
        polishedtuffpool.pressurePlate(DecoBlocks.POLISHED_TUFF_PRESSURE_PLATE);

        windpool.stairs(DecoBlocks.WIND_STAIRS);
        windpool.slab(DecoBlocks.WIND_SLAB);
        windpool.wall(DecoBlocks.WIND_WALL);

        windbrickpool.stairs(DecoBlocks.WIND_BRICK_STAIRS);
        windbrickpool.slab(DecoBlocks.WIND_BRICK_SLAB);
        windbrickpool.wall(DecoBlocks.WIND_BRICK_WALL);

        earthpool.stairs(DecoBlocks.EARTH_STAIRS);
        earthpool.slab(DecoBlocks.EARTH_SLAB);
        earthpool.wall(DecoBlocks.EARTH_WALL);

        earthbrickpool.stairs(DecoBlocks.EARTH_BRICK_STAIRS);
        earthbrickpool.slab(DecoBlocks.EARTH_BRICK_SLAB);
        earthbrickpool.wall(DecoBlocks.EARTH_BRICK_WALL);

        purpurpool.wall(DecoBlocks.PURPUR_WALL);

        smoothbasaltpool.stairs(DecoBlocks.SMOOTH_BASALT_STAIRS);
        smoothbasaltpool.slab(DecoBlocks.SMOOTH_BASALT_SLAB);
        smoothbasaltpool.wall(DecoBlocks.SMOOTH_BASALT_WALL);

       blockStateModelGenerator.createCropBlock(DecoBlocks.WARPED_WART_PLANT, WarpedWartBlock.AGE,0,1,2,3);

        BlockModelGenerators.BlockFamilyProvider terracottapool =
                blockStateModelGenerator.family(DecoBlocks.TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider whiteterracottapool =
                blockStateModelGenerator.family(DecoBlocks.WHITE_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider lightgrayterracottapool =
                blockStateModelGenerator.family(DecoBlocks.LIGHT_GRAY_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider grayterracottapool =
                blockStateModelGenerator.family(DecoBlocks.GRAY_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider blackterracottapool =
                blockStateModelGenerator.family(DecoBlocks.BLACK_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider brownterracottapool =
                blockStateModelGenerator.family(DecoBlocks.BROWN_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider redterracottapool =
                blockStateModelGenerator.family(DecoBlocks.RED_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider orangeterracottapool =
                blockStateModelGenerator.family(DecoBlocks.ORANGE_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider yellowterracottapool =
                blockStateModelGenerator.family(DecoBlocks.YELLOW_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider limeterracottapool =
                blockStateModelGenerator.family(DecoBlocks.LIME_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider greenterracottapool =
                blockStateModelGenerator.family(DecoBlocks.GREEN_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider cyanterracottapool =
                blockStateModelGenerator.family(DecoBlocks.CYAN_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider lightblueterracottapool =
                blockStateModelGenerator.family(DecoBlocks.LIGHT_BLUE_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider blueterracottapool =
                blockStateModelGenerator.family(DecoBlocks.BLUE_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider purpleterracottapool =
                blockStateModelGenerator.family(DecoBlocks.PURPLE_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider magnetaterracottapool =
                blockStateModelGenerator.family(DecoBlocks.MAGENTA_TERRACOTTA_TEMP);
        BlockModelGenerators.BlockFamilyProvider pinkterracottapool =
                blockStateModelGenerator.family(DecoBlocks.PINK_TERRACOTTA_TEMP);

        BlockModelGenerators.BlockFamilyProvider whiteconcretepool =
                blockStateModelGenerator.family(DecoBlocks.WHITE_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider lightgrayconcretepool =
                blockStateModelGenerator.family(DecoBlocks.LIGHT_GRAY_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider grayconcretepool =
                blockStateModelGenerator.family(DecoBlocks.GRAY_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider blackconcretepool =
                blockStateModelGenerator.family(DecoBlocks.BLACK_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider brownconcretepool =
                blockStateModelGenerator.family(DecoBlocks.BROWN_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider redconcretepool =
                blockStateModelGenerator.family(DecoBlocks.RED_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider orangeconcretepool =
                blockStateModelGenerator.family(DecoBlocks.ORANGE_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider yellowconcretepool =
                blockStateModelGenerator.family(DecoBlocks.YELLOW_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider limeconcretepool =
                blockStateModelGenerator.family(DecoBlocks.LIME_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider greenconcretepool =
                blockStateModelGenerator.family(DecoBlocks.GREEN_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider cyanconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CYAN_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider lightblueconcretepool =
                blockStateModelGenerator.family(DecoBlocks.LIGHT_BLUE_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider blueconcretepool =
                blockStateModelGenerator.family(DecoBlocks.BLUE_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider purpleconcretepool =
                blockStateModelGenerator.family(DecoBlocks.PURPLE_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider magnetaconcretepool =
                blockStateModelGenerator.family(DecoBlocks.MAGENTA_CONCRETE_TEMP);
        BlockModelGenerators.BlockFamilyProvider pinkconcretepool =
                blockStateModelGenerator.family(DecoBlocks.PINK_CONCRETE_TEMP);

        BlockModelGenerators.BlockFamilyProvider whitewoolpool =
                blockStateModelGenerator.family(DecoBlocks.WHITE_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider lightgraywoolpool =
                blockStateModelGenerator.family(DecoBlocks.LIGHT_GRAY_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider graywoolpool =
                blockStateModelGenerator.family(DecoBlocks.GRAY_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider blackwoolpool =
                blockStateModelGenerator.family(DecoBlocks.BLACK_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider brownwoolpool =
                blockStateModelGenerator.family(DecoBlocks.BROWN_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider redwoolpool =
                blockStateModelGenerator.family(DecoBlocks.RED_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider orangewoolpool =
                blockStateModelGenerator.family(DecoBlocks.ORANGE_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider yellowwoolpool =
                blockStateModelGenerator.family(DecoBlocks.YELLOW_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider limewoolpool =
                blockStateModelGenerator.family(DecoBlocks.LIME_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider greenwoolpool =
                blockStateModelGenerator.family(DecoBlocks.GREEN_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider cyanwoolpool =
                blockStateModelGenerator.family(DecoBlocks.CYAN_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider lightbluewoolpool =
                blockStateModelGenerator.family(DecoBlocks.LIGHT_BLUE_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider bluewoolpool =
                blockStateModelGenerator.family(DecoBlocks.BLUE_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider purplewoolpool =
                blockStateModelGenerator.family(DecoBlocks.PURPLE_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider magnetawoolpool =
                blockStateModelGenerator.family(DecoBlocks.MAGENTA_WOOL_TEMP);
        BlockModelGenerators.BlockFamilyProvider pinkwoolpool =
                blockStateModelGenerator.family(DecoBlocks.PINK_WOOL_TEMP);

        BlockModelGenerators.BlockFamilyProvider terracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider whiteterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider lightgrayterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider grayterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider blackterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider brownterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider redterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.RED_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider orangeterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider yellowterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider limeterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.LIME_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider greenterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider cyanterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider lightblueterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider blueterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider purpleterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider magnetaterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider pinkterracottabrickpool =
                blockStateModelGenerator.family(DecoBlocks.PINK_TERRACOTTA_BRICKS);

        BlockModelGenerators.BlockFamilyProvider cutwhiteconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_WHITE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutlightgrayconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutgrayconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_GRAY_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutblackconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_BLACK_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutbrownconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_BROWN_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutredconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_RED_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutorangeconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_ORANGE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutyellowconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_YELLOW_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutlimeconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_LIME_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutgreenconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_GREEN_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutcyanconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_CYAN_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutlightblueconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutblueconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_BLUE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutpurpleconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_PURPLE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutmagnetaconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_MAGENTA_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider cutpinkconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CUT_PINK_CONCRETE);

        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.WHITE_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.GRAY_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.BLACK_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.BROWN_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.RED_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.ORANGE_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.YELLOW_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.LIME_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.GREEN_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.CYAN_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.BLUE_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.PURPLE_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.MAGENTA_CONCRETE_PILLAR, TexturedModel.COLUMN);
        blockStateModelGenerator.createAxisAlignedPillarBlock(DecoBlocks.PINK_CONCRETE_PILLAR, TexturedModel.COLUMN);

        BlockModelGenerators.BlockFamilyProvider ducutlightgrayconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutgrayconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_GRAY_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutblackconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_BLACK_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutbrownconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_BROWN_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutredconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_RED_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutorangeconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutyellowconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutlimeconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_LIME_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutgreenconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_GREEN_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutcyanconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_CYAN_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutlightblueconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutblueconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_BLUE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutpurpleconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutmagnetaconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider ducutpinkconcretepool =
                blockStateModelGenerator.family(DecoBlocks.DUEL_CUT_PINK_CONCRETE);

        BlockModelGenerators.BlockFamilyProvider checklightgrayconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkgrayconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_GRAY_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkblackconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_BLACK_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkbrownconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_BROWN_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkredconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_RED_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkorangeconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_ORANGE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkyellowconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_YELLOW_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checklimeconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_LIME_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkgreenconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_GREEN_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkcyanconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_CYAN_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checklightblueconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkblueconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_BLUE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkpurpleconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_PURPLE_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkmagnetaconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_MAGENTA_CONCRETE);
        BlockModelGenerators.BlockFamilyProvider checkpinkconcretepool =
                blockStateModelGenerator.family(DecoBlocks.CHECKERED_PINK_CONCRETE);

        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_GLASS, DecoBlocks.HARDENED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_TINTED_GLASS, DecoBlocks.HARDENED_TINTED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_WHITE_STAINED_GLASS, DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS, DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS, DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS, DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_BLUE_STAINED_GLASS, DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS, DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_LIME_STAINED_GLASS, DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_PINK_STAINED_GLASS, DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_GRAY_STAINED_GLASS, DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS, DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_CYAN_STAINED_GLASS, DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS, DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_BROWN_STAINED_GLASS, DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_GREEN_STAINED_GLASS, DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_RED_STAINED_GLASS, DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.HARDENED_BLACK_STAINED_GLASS, DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE);

        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS, DecoBlocks.MOSAIC_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS, DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS, DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS, DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS, DecoBlocks.MOSAIC_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS, DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_LIME_STAINED_GLASS, DecoBlocks.MOSAIC_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_PINK_STAINED_GLASS, DecoBlocks.MOSAIC_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS, DecoBlocks.MOSAIC_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS, DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS, DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS, DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS, DecoBlocks.MOSAIC_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS, DecoBlocks.MOSAIC_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_RED_STAINED_GLASS, DecoBlocks.MOSAIC_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS, DecoBlocks.MOSAIC_BLACK_STAINED_GLASS_PANE);

        terracottapool.stairs(DecoBlocks.TERRACOTTA_STAIRS);
        terracottapool.slab(DecoBlocks.TERRACOTTA_SLAB);
        terracottapool.wall(DecoBlocks.TERRACOTTA_WALL);
        whiteterracottapool.stairs(DecoBlocks.WHITE_TERRACOTTA_STAIRS);
        whiteterracottapool.slab(DecoBlocks.WHITE_TERRACOTTA_SLAB);
        whiteterracottapool.wall(DecoBlocks.WHITE_TERRACOTTA_WALL);
        lightgrayterracottapool.stairs(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        lightgrayterracottapool.slab(DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        lightgrayterracottapool.wall(DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        grayterracottapool.stairs(DecoBlocks.GRAY_TERRACOTTA_STAIRS);
        grayterracottapool.slab(DecoBlocks.GRAY_TERRACOTTA_SLAB);
        grayterracottapool.wall(DecoBlocks.GRAY_TERRACOTTA_WALL);
        blackterracottapool.stairs(DecoBlocks.BLACK_TERRACOTTA_STAIRS);
        blackterracottapool.slab(DecoBlocks.BLACK_TERRACOTTA_SLAB);
        blackterracottapool.wall(DecoBlocks.BLACK_TERRACOTTA_WALL);
        brownterracottapool.stairs(DecoBlocks.BROWN_TERRACOTTA_STAIRS);
        brownterracottapool.slab(DecoBlocks.BROWN_TERRACOTTA_SLAB);
        brownterracottapool.wall(DecoBlocks.BROWN_TERRACOTTA_WALL);
        redterracottapool.stairs(DecoBlocks.RED_TERRACOTTA_STAIRS);
        redterracottapool.slab(DecoBlocks.RED_TERRACOTTA_SLAB);
        redterracottapool.wall(DecoBlocks.RED_TERRACOTTA_WALL);
        orangeterracottapool.stairs(DecoBlocks.ORANGE_TERRACOTTA_STAIRS);
        orangeterracottapool.slab(DecoBlocks.ORANGE_TERRACOTTA_SLAB);
        orangeterracottapool.wall(DecoBlocks.ORANGE_TERRACOTTA_WALL);
        yellowterracottapool.stairs(DecoBlocks.YELLOW_TERRACOTTA_STAIRS);
        yellowterracottapool.slab(DecoBlocks.YELLOW_TERRACOTTA_SLAB);
        yellowterracottapool.wall(DecoBlocks.YELLOW_TERRACOTTA_WALL);
        limeterracottapool.stairs(DecoBlocks.LIME_TERRACOTTA_STAIRS);
        limeterracottapool.slab(DecoBlocks.LIME_TERRACOTTA_SLAB);
        limeterracottapool.wall(DecoBlocks.LIME_TERRACOTTA_WALL);
        greenterracottapool.stairs(DecoBlocks.GREEN_TERRACOTTA_STAIRS);
        greenterracottapool.slab(DecoBlocks.GREEN_TERRACOTTA_SLAB);
        greenterracottapool.wall(DecoBlocks.GREEN_TERRACOTTA_WALL);
        cyanterracottapool.stairs(DecoBlocks.CYAN_TERRACOTTA_STAIRS);
        cyanterracottapool.slab(DecoBlocks.CYAN_TERRACOTTA_SLAB);
        cyanterracottapool.wall(DecoBlocks.CYAN_TERRACOTTA_WALL);
        lightblueterracottapool.stairs(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        lightblueterracottapool.slab(DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        lightblueterracottapool.wall(DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        blueterracottapool.stairs(DecoBlocks.BLUE_TERRACOTTA_STAIRS);
        blueterracottapool.slab(DecoBlocks.BLUE_TERRACOTTA_SLAB);
        blueterracottapool.wall(DecoBlocks.BLUE_TERRACOTTA_WALL);
        purpleterracottapool.stairs(DecoBlocks.PURPLE_TERRACOTTA_STAIRS);
        purpleterracottapool.slab(DecoBlocks.PURPLE_TERRACOTTA_SLAB);
        purpleterracottapool.wall(DecoBlocks.PURPLE_TERRACOTTA_WALL);
        magnetaterracottapool.stairs(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS);
        magnetaterracottapool.slab(DecoBlocks.MAGENTA_TERRACOTTA_SLAB);
        magnetaterracottapool.wall(DecoBlocks.MAGENTA_TERRACOTTA_WALL);
        pinkterracottapool.stairs(DecoBlocks.PINK_TERRACOTTA_STAIRS);
        pinkterracottapool.slab(DecoBlocks.PINK_TERRACOTTA_SLAB);
        pinkterracottapool.wall(DecoBlocks.PINK_TERRACOTTA_WALL);

        whiteconcretepool.stairs(DecoBlocks.WHITE_CONCRETE_STAIRS);
        whiteconcretepool.slab(DecoBlocks.WHITE_CONCRETE_SLAB);
        whiteconcretepool.wall(DecoBlocks.WHITE_CONCRETE_WALL);
        lightgrayconcretepool.stairs(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        lightgrayconcretepool.slab(DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        lightgrayconcretepool.wall(DecoBlocks.LIGHT_GRAY_CONCRETE_WALL);
        grayconcretepool.stairs(DecoBlocks.GRAY_CONCRETE_STAIRS);
        grayconcretepool.slab(DecoBlocks.GRAY_CONCRETE_SLAB);
        grayconcretepool.wall(DecoBlocks.GRAY_CONCRETE_WALL);
        blackconcretepool.stairs(DecoBlocks.BLACK_CONCRETE_STAIRS);
        blackconcretepool.slab(DecoBlocks.BLACK_CONCRETE_SLAB);
        blackconcretepool.wall(DecoBlocks.BLACK_CONCRETE_WALL);
        brownconcretepool.stairs(DecoBlocks.BROWN_CONCRETE_STAIRS);
        brownconcretepool.slab(DecoBlocks.BROWN_CONCRETE_SLAB);
        brownconcretepool.wall(DecoBlocks.BROWN_CONCRETE_WALL);
        redconcretepool.stairs(DecoBlocks.RED_CONCRETE_STAIRS);
        redconcretepool.slab(DecoBlocks.RED_CONCRETE_SLAB);
        redconcretepool.wall(DecoBlocks.RED_CONCRETE_WALL);
        orangeconcretepool.stairs(DecoBlocks.ORANGE_CONCRETE_STAIRS);
        orangeconcretepool.slab(DecoBlocks.ORANGE_CONCRETE_SLAB);
        orangeconcretepool.wall(DecoBlocks.ORANGE_CONCRETE_WALL);
        yellowconcretepool.stairs(DecoBlocks.YELLOW_CONCRETE_STAIRS);
        yellowconcretepool.slab(DecoBlocks.YELLOW_CONCRETE_SLAB);
        yellowconcretepool.wall(DecoBlocks.YELLOW_CONCRETE_WALL);
        limeconcretepool.stairs(DecoBlocks.LIME_CONCRETE_STAIRS);
        limeconcretepool.slab(DecoBlocks.LIME_CONCRETE_SLAB);
        limeconcretepool.wall(DecoBlocks.LIME_CONCRETE_WALL);
        greenconcretepool.stairs(DecoBlocks.GREEN_CONCRETE_STAIRS);
        greenconcretepool.slab(DecoBlocks.GREEN_CONCRETE_SLAB);
        greenconcretepool.wall(DecoBlocks.GREEN_CONCRETE_WALL);
        cyanconcretepool.stairs(DecoBlocks.CYAN_CONCRETE_STAIRS);
        cyanconcretepool.slab(DecoBlocks.CYAN_CONCRETE_SLAB);
        cyanconcretepool.wall(DecoBlocks.CYAN_CONCRETE_WALL);
        lightblueconcretepool.stairs(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        lightblueconcretepool.slab(DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        lightblueconcretepool.wall(DecoBlocks.LIGHT_BLUE_CONCRETE_WALL);
        blueconcretepool.stairs(DecoBlocks.BLUE_CONCRETE_STAIRS);
        blueconcretepool.slab(DecoBlocks.BLUE_CONCRETE_SLAB);
        blueconcretepool.wall(DecoBlocks.BLUE_CONCRETE_WALL);
        purpleconcretepool.stairs(DecoBlocks.PURPLE_CONCRETE_STAIRS);
        purpleconcretepool.slab(DecoBlocks.PURPLE_CONCRETE_SLAB);
        purpleconcretepool.wall(DecoBlocks.PURPLE_CONCRETE_WALL);
        magnetaconcretepool.stairs(DecoBlocks.MAGENTA_CONCRETE_STAIRS);
        magnetaconcretepool.slab(DecoBlocks.MAGENTA_CONCRETE_SLAB);
        magnetaconcretepool.wall(DecoBlocks.MAGENTA_CONCRETE_WALL);
        pinkconcretepool.stairs(DecoBlocks.PINK_CONCRETE_STAIRS);
        pinkconcretepool.slab(DecoBlocks.PINK_CONCRETE_SLAB);
        pinkconcretepool.wall(DecoBlocks.PINK_CONCRETE_WALL);

        whitewoolpool.stairs(DecoBlocks.WHITE_WOOL_STAIRS);
        whitewoolpool.slab(DecoBlocks.WHITE_WOOL_SLAB);
        lightgraywoolpool.stairs(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS);
        lightgraywoolpool.slab(DecoBlocks.LIGHT_GRAY_WOOL_SLAB);
        graywoolpool.stairs(DecoBlocks.GRAY_WOOL_STAIRS);
        graywoolpool.slab(DecoBlocks.GRAY_WOOL_SLAB);
        blackwoolpool.stairs(DecoBlocks.BLACK_WOOL_STAIRS);
        blackwoolpool.slab(DecoBlocks.BLACK_WOOL_SLAB);
        brownwoolpool.stairs(DecoBlocks.BROWN_WOOL_STAIRS);
        brownwoolpool.slab(DecoBlocks.BROWN_WOOL_SLAB);
        redwoolpool.stairs(DecoBlocks.RED_WOOL_STAIRS);
        redwoolpool.slab(DecoBlocks.RED_WOOL_SLAB);
        orangewoolpool.stairs(DecoBlocks.ORANGE_WOOL_STAIRS);
        orangewoolpool.slab(DecoBlocks.ORANGE_WOOL_SLAB);
        yellowwoolpool.stairs(DecoBlocks.YELLOW_WOOL_STAIRS);
        yellowwoolpool.slab(DecoBlocks.YELLOW_WOOL_SLAB);
        limewoolpool.stairs(DecoBlocks.LIME_WOOL_STAIRS);
        limewoolpool.slab(DecoBlocks.LIME_WOOL_SLAB);
        greenwoolpool.stairs(DecoBlocks.GREEN_WOOL_STAIRS);
        greenwoolpool.slab(DecoBlocks.GREEN_WOOL_SLAB);
        cyanwoolpool.stairs(DecoBlocks.CYAN_WOOL_STAIRS);
        cyanwoolpool.slab(DecoBlocks.CYAN_WOOL_SLAB);
        lightbluewoolpool.stairs(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS);
        lightbluewoolpool.slab(DecoBlocks.LIGHT_BLUE_WOOL_SLAB);
        bluewoolpool.stairs(DecoBlocks.BLUE_WOOL_STAIRS);
        bluewoolpool.slab(DecoBlocks.BLUE_WOOL_SLAB);
        purplewoolpool.stairs(DecoBlocks.PURPLE_WOOL_STAIRS);
        purplewoolpool.slab(DecoBlocks.PURPLE_WOOL_SLAB);
        magnetawoolpool.stairs(DecoBlocks.MAGENTA_WOOL_STAIRS);
        magnetawoolpool.slab(DecoBlocks.MAGENTA_WOOL_SLAB);
        pinkwoolpool.stairs(DecoBlocks.PINK_WOOL_STAIRS);
        pinkwoolpool.slab(DecoBlocks.PINK_WOOL_SLAB);

        terracottabrickpool.stairs(DecoBlocks.TERRACOTTA_BRICK_STAIRS);
        terracottabrickpool.slab(DecoBlocks.TERRACOTTA_BRICK_SLAB);
        terracottabrickpool.wall(DecoBlocks.TERRACOTTA_BRICK_WALL);
        whiteterracottabrickpool.stairs(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
        whiteterracottabrickpool.slab(DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB);
        whiteterracottabrickpool.wall(DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL);
        lightgrayterracottabrickpool.stairs(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        lightgrayterracottabrickpool.slab(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
        lightgrayterracottabrickpool.wall(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
        grayterracottabrickpool.stairs(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        grayterracottabrickpool.slab(DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB);
        grayterracottabrickpool.wall(DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL);
        blackterracottabrickpool.stairs(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        blackterracottabrickpool.slab(DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB);
        blackterracottabrickpool.wall(DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL);
        brownterracottabrickpool.stairs(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        brownterracottabrickpool.slab(DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB);
        brownterracottabrickpool.wall(DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL);
        redterracottabrickpool.stairs(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        redterracottabrickpool.slab(DecoBlocks.RED_TERRACOTTA_BRICK_SLAB);
        redterracottabrickpool.wall(DecoBlocks.RED_TERRACOTTA_BRICK_WALL);
        orangeterracottabrickpool.stairs(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        orangeterracottabrickpool.slab(DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);
        orangeterracottabrickpool.wall(DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL);
        yellowterracottabrickpool.stairs(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        yellowterracottabrickpool.slab(DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);
        yellowterracottabrickpool.wall(DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL);
        limeterracottabrickpool.stairs(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        limeterracottabrickpool.slab(DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB);
        limeterracottabrickpool.wall(DecoBlocks.LIME_TERRACOTTA_BRICK_WALL);
        greenterracottabrickpool.stairs(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        greenterracottabrickpool.slab(DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB);
        greenterracottabrickpool.wall(DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL);
        cyanterracottabrickpool.stairs(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        cyanterracottabrickpool.slab(DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB);
        cyanterracottabrickpool.wall(DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL);
        lightblueterracottabrickpool.stairs(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        lightblueterracottabrickpool.slab(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
        lightblueterracottabrickpool.wall(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
        blueterracottabrickpool.stairs(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        blueterracottabrickpool.slab(DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB);
        blueterracottabrickpool.wall(DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL);
        purpleterracottabrickpool.stairs(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        purpleterracottabrickpool.slab(DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);
        purpleterracottabrickpool.wall(DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL);
        magnetaterracottabrickpool.stairs(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        magnetaterracottabrickpool.slab(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);
        magnetaterracottabrickpool.wall(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);
        pinkterracottabrickpool.stairs(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        pinkterracottabrickpool.slab(DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB);
        pinkterracottabrickpool.wall(DecoBlocks.PINK_TERRACOTTA_BRICK_WALL);

        cutwhiteconcretepool.stairs(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS);
        cutwhiteconcretepool.slab(DecoBlocks.CUT_WHITE_CONCRETE_SLAB);
        cutwhiteconcretepool.wall(DecoBlocks.CUT_WHITE_CONCRETE_WALL);
        cutlightgrayconcretepool.stairs(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS);
        cutlightgrayconcretepool.slab(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB);
        cutlightgrayconcretepool.wall(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL);
        cutgrayconcretepool.stairs(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS);
        cutgrayconcretepool.slab(DecoBlocks.CUT_GRAY_CONCRETE_SLAB);
        cutgrayconcretepool.wall(DecoBlocks.CUT_GRAY_CONCRETE_WALL);
        cutblackconcretepool.stairs(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS);
        cutblackconcretepool.slab(DecoBlocks.CUT_BLACK_CONCRETE_SLAB);
        cutblackconcretepool.wall(DecoBlocks.CUT_BLACK_CONCRETE_WALL);
        cutbrownconcretepool.stairs(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS);
        cutbrownconcretepool.slab(DecoBlocks.CUT_BROWN_CONCRETE_SLAB);
        cutbrownconcretepool.wall(DecoBlocks.CUT_BROWN_CONCRETE_WALL);
        cutredconcretepool.stairs(DecoBlocks.CUT_RED_CONCRETE_STAIRS);
        cutredconcretepool.slab(DecoBlocks.CUT_RED_CONCRETE_SLAB);
        cutredconcretepool.wall(DecoBlocks.CUT_RED_CONCRETE_WALL);
        cutorangeconcretepool.stairs(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS);
        cutorangeconcretepool.slab(DecoBlocks.CUT_ORANGE_CONCRETE_SLAB);
        cutorangeconcretepool.wall(DecoBlocks.CUT_ORANGE_CONCRETE_WALL);
        cutyellowconcretepool.stairs(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS);
        cutyellowconcretepool.slab(DecoBlocks.CUT_YELLOW_CONCRETE_SLAB);
        cutyellowconcretepool.wall(DecoBlocks.CUT_YELLOW_CONCRETE_WALL);
        cutlimeconcretepool.stairs(DecoBlocks.CUT_LIME_CONCRETE_STAIRS);
        cutlimeconcretepool.slab(DecoBlocks.CUT_LIME_CONCRETE_SLAB);
        cutlimeconcretepool.wall(DecoBlocks.CUT_LIME_CONCRETE_WALL);
        cutgreenconcretepool.stairs(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS);
        cutgreenconcretepool.slab(DecoBlocks.CUT_GREEN_CONCRETE_SLAB);
        cutgreenconcretepool.wall(DecoBlocks.CUT_GREEN_CONCRETE_WALL);
        cutcyanconcretepool.stairs(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS);
        cutcyanconcretepool.slab(DecoBlocks.CUT_CYAN_CONCRETE_SLAB);
        cutcyanconcretepool.wall(DecoBlocks.CUT_CYAN_CONCRETE_WALL);
        cutlightblueconcretepool.stairs(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS);
        cutlightblueconcretepool.slab(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB);
        cutlightblueconcretepool.wall(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL);
        cutblueconcretepool.stairs(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS);
        cutblueconcretepool.slab(DecoBlocks.CUT_BLUE_CONCRETE_SLAB);
        cutblueconcretepool.wall(DecoBlocks.CUT_BLUE_CONCRETE_WALL);
        cutpurpleconcretepool.stairs(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS);
        cutpurpleconcretepool.slab(DecoBlocks.CUT_PURPLE_CONCRETE_SLAB);
        cutpurpleconcretepool.wall(DecoBlocks.CUT_PURPLE_CONCRETE_WALL);
        cutmagnetaconcretepool.stairs(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS);
        cutmagnetaconcretepool.slab(DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB);
        cutmagnetaconcretepool.wall(DecoBlocks.CUT_MAGENTA_CONCRETE_WALL);
        cutpinkconcretepool.stairs(DecoBlocks.CUT_PINK_CONCRETE_STAIRS);
        cutpinkconcretepool.slab(DecoBlocks.CUT_PINK_CONCRETE_SLAB);
        cutpinkconcretepool.wall(DecoBlocks.CUT_PINK_CONCRETE_WALL);

        ducutlightgrayconcretepool.stairs(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS);
        ducutlightgrayconcretepool.slab(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB);
        ducutlightgrayconcretepool.wall(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_WALL);
        ducutgrayconcretepool.stairs(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS);
        ducutgrayconcretepool.slab(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB);
        ducutgrayconcretepool.wall(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_WALL);
        ducutblackconcretepool.stairs(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS);
        ducutblackconcretepool.slab(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB);
        ducutblackconcretepool.wall(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_WALL);
        ducutbrownconcretepool.stairs(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS);
        ducutbrownconcretepool.slab(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB);
        ducutbrownconcretepool.wall(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_WALL);
        ducutredconcretepool.stairs(DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS);
        ducutredconcretepool.slab(DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB);
        ducutredconcretepool.wall(DecoBlocks.DUEL_CUT_RED_CONCRETE_WALL);
        ducutorangeconcretepool.stairs(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS);
        ducutorangeconcretepool.slab(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB);
        ducutorangeconcretepool.wall(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_WALL);
        ducutyellowconcretepool.stairs(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS);
        ducutyellowconcretepool.slab(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB);
        ducutyellowconcretepool.wall(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_WALL);
        ducutlimeconcretepool.stairs(DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS);
        ducutlimeconcretepool.slab(DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB);
        ducutlimeconcretepool.wall(DecoBlocks.DUEL_CUT_LIME_CONCRETE_WALL);
        ducutgreenconcretepool.stairs(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS);
        ducutgreenconcretepool.slab(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB);
        ducutgreenconcretepool.wall(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_WALL);
        ducutcyanconcretepool.stairs(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS);
        ducutcyanconcretepool.slab(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB);
        ducutcyanconcretepool.wall(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_WALL);
        ducutlightblueconcretepool.stairs(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS);
        ducutlightblueconcretepool.slab(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB);
        ducutlightblueconcretepool.wall(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_WALL);
        ducutblueconcretepool.stairs(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS);
        ducutblueconcretepool.slab(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB);
        ducutblueconcretepool.wall(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_WALL);
        ducutpurpleconcretepool.stairs(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS);
        ducutpurpleconcretepool.slab(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB);
        ducutpurpleconcretepool.wall(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_WALL);
        ducutmagnetaconcretepool.stairs(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS);
        ducutmagnetaconcretepool.slab(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB);
        ducutmagnetaconcretepool.wall(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_WALL);
        ducutpinkconcretepool.stairs(DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS);
        ducutpinkconcretepool.slab(DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB);
        ducutpinkconcretepool.wall(DecoBlocks.DUEL_CUT_PINK_CONCRETE_WALL);

        checklightgrayconcretepool.stairs(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS);
        checklightgrayconcretepool.slab(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB);
        checklightgrayconcretepool.wall(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_WALL);
        checkgrayconcretepool.stairs(DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS);
        checkgrayconcretepool.slab(DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB);
        checkgrayconcretepool.wall(DecoBlocks.CHECKERED_GRAY_CONCRETE_WALL);
        checkblackconcretepool.stairs(DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS);
        checkblackconcretepool.slab(DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB);
        checkblackconcretepool.wall(DecoBlocks.CHECKERED_BLACK_CONCRETE_WALL);
        checkbrownconcretepool.stairs(DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS);
        checkbrownconcretepool.slab(DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB);
        checkbrownconcretepool.wall(DecoBlocks.CHECKERED_BROWN_CONCRETE_WALL);
        checkredconcretepool.stairs(DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS);
        checkredconcretepool.slab(DecoBlocks.CHECKERED_RED_CONCRETE_SLAB);
        checkredconcretepool.wall(DecoBlocks.CHECKERED_RED_CONCRETE_WALL);
        checkorangeconcretepool.stairs(DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS);
        checkorangeconcretepool.slab(DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB);
        checkorangeconcretepool.wall(DecoBlocks.CHECKERED_ORANGE_CONCRETE_WALL);
        checkyellowconcretepool.stairs(DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS);
        checkyellowconcretepool.slab(DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB);
        checkyellowconcretepool.wall(DecoBlocks.CHECKERED_YELLOW_CONCRETE_WALL);
        checklimeconcretepool.stairs(DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS);
        checklimeconcretepool.slab(DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB);
        checklimeconcretepool.wall(DecoBlocks.CHECKERED_LIME_CONCRETE_WALL);
        checkgreenconcretepool.stairs(DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS);
        checkgreenconcretepool.slab(DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB);
        checkgreenconcretepool.wall(DecoBlocks.CHECKERED_GREEN_CONCRETE_WALL);
        checkcyanconcretepool.stairs(DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS);
        checkcyanconcretepool.slab(DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB);
        checkcyanconcretepool.wall(DecoBlocks.CHECKERED_CYAN_CONCRETE_WALL);
        checklightblueconcretepool.stairs(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS);
        checklightblueconcretepool.slab(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB);
        checklightblueconcretepool.wall(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_WALL);
        checkblueconcretepool.stairs(DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS);
        checkblueconcretepool.slab(DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB);
        checkblueconcretepool.wall(DecoBlocks.CHECKERED_BLUE_CONCRETE_WALL);
        checkpurpleconcretepool.stairs(DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS);
        checkpurpleconcretepool.slab(DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB);
        checkpurpleconcretepool.wall(DecoBlocks.CHECKERED_PURPLE_CONCRETE_WALL);
        checkmagnetaconcretepool.stairs(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS);
        checkmagnetaconcretepool.slab(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB);
        checkmagnetaconcretepool.wall(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_WALL);
        checkpinkconcretepool.stairs(DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS);
        checkpinkconcretepool.slab(DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB);
        checkpinkconcretepool.wall(DecoBlocks.CHECKERED_PINK_CONCRETE_WALL);
    }
}
