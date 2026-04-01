package net.gecko.varandeco.block;

import com.terraformersmc.terraform.sign.api.block.TerraformSignBlockHelper;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.nature.*;
import net.gecko.varandeco.block.nature.ice.BlackIceBlock;
import net.gecko.varandeco.block.nature.ice.FragileIceBlock;
import net.gecko.varandeco.block.nature.underwater.*;
import net.gecko.varandeco.block.woodmadeblocks.barrel.*;
import net.gecko.varandeco.block.elementblocks.*;
import net.gecko.varandeco.block.custom.*;
import net.gecko.varandeco.block.nature.underwater.corals.*;
import net.gecko.varandeco.block.nature.flowers.*;
import net.gecko.varandeco.block.oxidizable.*;
import net.gecko.varandeco.block.stonemadeblocks.*;
import net.gecko.varandeco.block.woodmadeblocks.cartographytables.*;
import net.gecko.varandeco.block.woodmadeblocks.craftingtables.*;
import net.gecko.varandeco.block.woodmadeblocks.smithingtables.*;
import net.gecko.varandeco.item.custom.NonStationBlockItem;
import net.gecko.varandeco.effects.DecoStatusEffects;
import net.gecko.varandeco.world.feature.tree.DecoSaplingGenerators;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.worldgen.features.NetherFeatures;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import java.util.List;
import java.util.function.Function;

public class DecoBlocks {
    public static final Block CUT_GRANITE = registerBlock("cut_granite",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE), Block::new);
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE), Block::new);
    public static final Block CUT_DIORITE = registerBlock("cut_diorite",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE), Block::new);
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE), Block::new);
    public static final Block CUT_ANDESITE = registerBlock("cut_andesite",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE), Block::new);
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE), Block::new);
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).strength(1.0F), Block::new);
    public static final Block CUT_CALCITE = registerBlock("cut_calcite",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_CALCITE), Block::new);
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_CALCITE), Block::new);
    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).strength(2.0F, 1.0F), Block::new);
    public static final Block DRIPSTONE_BRICK_PILLAR = registerBlock("dripstone_brick_pillar",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIPSTONE_BRICKS), RotatedPillarBlock::new);
    public static final Block CHISELED_DRIPSTONE = registerBlock("chiseled_dripstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK), Block::new);
    public static final Block DRY_GRASS_BLOCK = registerBlock("dry_grass_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK).mapColor(MapColor.COLOR_YELLOW), SnowyBlock::new);
    public static final Block PACKED_GRASS = registerBlock("packed_grass",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK), PackedGrassBlock::new);
    public static final Block PACKED_DRY_GRASS = registerBlock("packed_dry_grass",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRY_GRASS_BLOCK), Block::new);
    public static final Block PACKED_PODZOL = registerBlock("packed_podzol",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PODZOL), Block::new);
    public static final Block PACKED_CRIMSON_NYLIUM = registerPackedNylium("packed_crimson_nylium",
            NetherFeatures.CRIMSON_FOREST_VEGETATION_BONEMEAL, Blocks.CRIMSON_NYLIUM);
    public static final Block PACKED_WARPED_NYLIUM = registerPackedNylium("packed_warped_nylium",
            NetherFeatures.WARPED_FOREST_VEGETATION_BONEMEAL, Blocks.WARPED_NYLIUM);
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
            BlockBehaviour.Properties.of().strength(1.0f,1.5f)
                    .sound(SoundType.WOOD).mapColor(MapColor.GRASS), Block::new);
    public static final Block MUSHROOM_PLANKS = registerBlock("mushroom_planks",
            BlockBehaviour.Properties.of().mapColor(MapColor.RAW_IRON).strength(1.0f,1.5f)
                    .sound(SoundType.WOOD), Block::new);
    public static final Block IRON_CAP_PLANKS = registerBlock("iron_cap_planks",
            BlockBehaviour.Properties.of().mapColor(MapColor.CLAY).strength(2.0f,3.0f)
                    .sound(SoundType.NETHER_WOOD).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE), Block::new);
    public static final Block WOODEN_PLANKS = registerBlock("wooden_planks",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0f,3.0f)
                    .sound(SoundType.WOOD), Block::new);
    public static final Block DRIFTWOOD_PLANKS = registerBlock("driftwood_planks",
            BlockBehaviour.Properties.of().strength(2.0f,3.0f)
                    .sound(SoundType.WOOD).mapColor(MapColor.PLANT), Block::new);
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F).sound(SoundType.WOOD).mapColor(MapColor.PODZOL), Block::new);
    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(5.0F, 6.0F)
                    .sound(SoundType.DEEPSLATE_BRICKS), Block::new);
    public static final Block ECHO_BLOCK = registerBlock("echo_block",
            BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(2.0F, 3.0F)
                    .sound(SoundType.SCULK_CATALYST).lightLevel(state -> 7).mapColor(MapColor.COLOR_BLACK), Block::new);
    public static final Block CUT_IRON = registerBlock("cut_iron",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), Block::new);
    public static final Block CUT_IRON_STAIRS = registerStairs("cut_iron_stairs",
            DecoBlocks.CUT_IRON,DecoBlocks.CUT_IRON);
    public static final Block CUT_IRON_SLAB = registerBlock("cut_iron_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_IRON), SlabBlock::new);
    public static final Block CASTED_IRON = registerBlock("casted_iron",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).strength(10.0F, 6.0F)
                    .mapColor(MapColor.DEEPSLATE), Block::new);
    public static final Block CASTED_IRON_STAIRS = registerStairs("casted_iron_stairs",
            DecoBlocks.CASTED_IRON, DecoBlocks.CASTED_IRON);
    public static final Block CASTED_IRON_SLAB = registerBlock("casted_iron_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CASTED_IRON), SlabBlock::new);
    public static final Block CUT_GOLD = registerBlock("cut_gold",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK), Block::new);
    public static final Block CUT_GOLD_STAIRS = registerStairs("cut_gold_stairs",
            DecoBlocks.CUT_GOLD, DecoBlocks.CUT_GOLD);
    public static final Block CUT_GOLD_SLAB = registerBlock("cut_gold_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GOLD), SlabBlock::new);
    public static final Block CHISELED_IRON = registerBlock("chiseled_iron",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), Block::new);
    public static final Block IRON_GRATE = registerBlock("iron_grate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).sound(SoundType.CHAIN)
                    .mapColor(MapColor.WARPED_STEM).noOcclusion(), WaterloggedTransparentBlock::new);
    public static final Block CHISELED_GOLD = registerBlock("chiseled_gold",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK), Block::new);
    public static final Block GOLD_GRATE = registerBlock("gold_grate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).noOcclusion(), WaterloggedTransparentBlock::new);
    public static final Block WOODEN_LOG = registerBlock("wooden_log",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0f,2.0f)
                    .sound(SoundType.WOOD),RotatedPillarBlock::new);
    public static final Block STRIPPED_WOODEN_WOOD = registerBlock("stripped_wooden_wood",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0f,2.0f)
                    .sound(SoundType.WOOD),RotatedPillarBlock::new);
    public static final Block WOODEN_WOOD = registerBlock("wooden_wood",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0f,2.0f)
                    .sound(SoundType.WOOD),RotatedPillarBlock::new);
    public static final Block DRIFTWOOD_LOG = registerBlock("driftwood_log",
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(4.0f,2.0f)
                    .sound(SoundType.CHERRY_WOOD), DriftwoodLogBlock::new);
    public static final Block DRIED_DRIFTWOOD_LOG = registerBlock("dried_driftwood_log",
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(2.0f,2.0f)
                    .sound(SoundType.WOOD),RotatedPillarBlock::new);
    public static final Block DRIFTWOOD = registerBlock("driftwood",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(4.0f,2.0f)
                    .sound(SoundType.CHERRY_WOOD), DriftwoodBlock::new);
    public static final Block DRIED_DRIFTWOOD = registerBlock("dried_driftwood",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(2.0f,2.0f)
                    .sound(SoundType.WOOD),RotatedPillarBlock::new);
    public static final Block STRIPPED_DRIFTWOOD_LOG = registerBlock("stripped_driftwood_log",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIED_DRIFTWOOD_LOG),RotatedPillarBlock::new);
    public static final Block STRIPPED_DRIFTWOOD = registerBlock("stripped_driftwood",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIED_DRIFTWOOD_LOG),RotatedPillarBlock::new);
    public static final Block STRIPPED_WOODEN_LOG = registerBlock("stripped_wooden_log",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0f,2.0f)
                    .sound(SoundType.WOOD),RotatedPillarBlock::new);
    public static final Block IRON_CAP_STEM = registerBlock("iron_cap_stem",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY).strength(2.0f,2.0f)
                    .sound(SoundType.NETHER_WOOD).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE),RotatedPillarBlock::new);
    public static final Block STRIPPED_IRON_CAP_STEM = registerBlock("stripped_iron_cap_stem",
            BlockBehaviour.Properties.of().mapColor(MapColor.CLAY).strength(2.0f,2.0f)
                    .sound(SoundType.NETHER_WOOD).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE),RotatedPillarBlock::new);
    public static final Block STRIPPED_IRON_CAP_HYPHAE = registerBlock("stripped_iron_cap_hyphae",
            BlockBehaviour.Properties.of().mapColor(MapColor.CLAY).strength(2.0f,2.0f)
                    .sound(SoundType.NETHER_WOOD).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE),RotatedPillarBlock::new);
    public static final Block IRON_CAP_HYPHAE = registerBlock("iron_cap_hyphae",
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY).strength(2.0f,2.0f)
                    .sound(SoundType.NETHER_WOOD).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE),RotatedPillarBlock::new);
    public static final Block HARDENED_GLASS = registerBlock("hardened_glass",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).strength(25.0f,100.0f)
                    .noOcclusion().requiresCorrectToolForDrops(),TransparentBlock::new);
    public static final Block HARDENED_TINTED_GLASS = registerBlock("hardened_tinted_glass",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TINTED_GLASS).strength(25.0f,100.0f)
                    .noOcclusion().requiresCorrectToolForDrops(),TintedGlassBlock::new);
    public static final Block CHISELED_LAPIS = registerBlock("chiseled_lapis",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK), Block::new);
    public static final Block LAPIS_BRICKS = registerBlock("lapis_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).strength(4), Block::new);
    public static final Block CUT_LAPIS = registerBlock("cut_lapis",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK), Block::new);
    public static final Block LAPIS_PILLAR = registerBlock("lapis_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK), RotatedPillarBlock::new);
    public static final Block CUT_SANDSTONE_BRICKS = registerBlock("cut_sandstone_bricks",
            BlockBehaviour.Properties.of().strength(1.6f).requiresCorrectToolForDrops().mapColor(MapColor.SAND), Block::new);
    public static final Block COBBLED_SANDSTONE = registerBlock("cobbled_sandstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE),Block::new);
    public static final Block CHISELED_POLISHED_SANDSTONE = registerBlock("chiseled_polished_sandstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_SANDSTONE),Block::new);
    public static final Block POLISHED_SANDSTONE = registerBlock("polished_sandstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE),Block::new);
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_SANDSTONE_BRICKS),Block::new);
    public static final Block SMOOTH_OBSIDIAN = registerBlock("smooth_obsidian",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).strength(60.0F, 1200.0F), Block::new);
    public static final Block SMOOTH_LAPIS = registerBlock("smooth_lapis",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).mapColor(MapColor.COLOR_BLUE),Block::new);
    public static final Block SMOOTH_PURPUR = registerBlock("smooth_purpur",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK), Block::new);
    public static final Block SMOOTH_DEEPSLATE = registerBlock("smooth_deepslate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).strength(3.5f,6.0f)
                    .mapColor(MapColor.METAL), Block::new);
    public static final Block SMOOTH_BLACKSTONE = registerBlock("smooth_blackstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).strength(2.0f,6.0f)
                    .mapColor(MapColor.WARPED_STEM), Block::new);
    public static final Block SMOOTH_TUFF = registerBlock("smooth_tuff",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF).strength(2.0f,6.0f)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY), Block::new);
    public static final Block SMOOTH_END_STONE = registerBlock("smooth_end_stone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3.5F, 9.0F), Block::new);
    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS), Block::new);
    public static final Block CHISELED_OBSIDIAN = registerBlock("chiseled_obsidian",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).mapColor(MapColor.COLOR_PURPLE), Block::new);
    public static final Block SANDED_OBSIDIAN = registerBlock("sanded_obsidian",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).mapColor(MapColor.COLOR_PURPLE).strength(25.0F, 1200.0F), Block::new);
    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SANDED_OBSIDIAN), Block::new);
    public static final Block CUT_OBSIDIAN = registerBlock("cut_obsidian",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SANDED_OBSIDIAN), Block::new);
    public static final Block OBSIDIAN_PILLAR = registerBlock("obsidian_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).mapColor(MapColor.COLOR_PURPLE),RotatedPillarBlock::new);
    public static final Block CHISELED_PURPUR = registerBlock("chiseled_purpur",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK), Block::new);
    public static final Block PURPUR_BRICKS = registerBlock("purpur_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK), Block::new);
    public static final Block CUT_PURPUR = registerBlock("cut_purpur",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK), Block::new);
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            BlockBehaviour.Properties.of().friction(0.89F)
                    .strength(1.0f).explosionResistance(0.7f).requiresCorrectToolForDrops().sound(SoundType.SNOW), Block::new);
    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SNOW_BRICKS), Block::new);
    public static final Block JACK_O_SOUL_LANTERN = registerBlock("jack_o_soul_lantern",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARVED_PUMPKIN).lightLevel(state -> 10),MovablePumpkinBlock::new);
    public static final Block PACKED_NETHERRACK = registerBlock("packed_netherrack",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).strength(3.2F,1.0f), Block::new);
    public static final Block NETHERRACK_BRICKS = registerBlock("netherrack_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PACKED_NETHERRACK), Block::new);
    public static final Block CHISELED_NETHERRACK_BRICKS = registerBlock("chiseled_netherrack_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.NETHERRACK_BRICKS), Block::new);
    public static final Block BASALT_BRICKS = registerBlock("basalt_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BASALT), RotatedPillarBlock::new);
    public static final Block SMOOTH_GLOWSTONE = registerBlock("smooth_glowstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(0.6f), Block::new);

    public static final Block WHITE_LAMP = registerBlock("white_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor. WHITE), Block::new);
    public static final Block ORANGE_LAMP = registerBlock("orange_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.ORANGE), Block::new);
    public static final Block MAGENTA_LAMP = registerBlock("magenta_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.MAGENTA), Block::new);
    public static final Block LIGHT_BLUE_LAMP = registerBlock("light_blue_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.LIGHT_BLUE), Block::new);
    public static final Block YELLOW_LAMP = registerBlock("yellow_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.YELLOW), Block::new);
    public static final Block LIME_LAMP = registerBlock("lime_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.LIME), Block::new);
    public static final Block PINK_LAMP = registerBlock("pink_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.PINK), Block::new);
    public static final Block GRAY_LAMP = registerBlock("gray_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.GRAY), Block::new);
    public static final Block LIGHT_GRAY_LAMP = registerBlock("light_gray_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.LIGHT_GRAY), Block::new);
    public static final Block CYAN_LAMP = registerBlock("cyan_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.CYAN), Block::new);
    public static final Block PURPLE_LAMP = registerBlock("purple_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.PURPLE), Block::new);
    public static final Block BLUE_LAMP = registerBlock("blue_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.BLUE), Block::new);
    public static final Block BROWN_LAMP = registerBlock("brown_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.BROWN), Block::new);
    public static final Block GREEN_LAMP = registerBlock("green_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.GREEN), Block::new);
    public static final Block RED_LAMP = registerBlock("red_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.RED), Block::new);
    public static final Block BLACK_LAMP = registerBlock("black_lamp",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_GLOWSTONE).mapColor(DyeColor.BLACK), Block::new);
    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            BlockBehaviour.Properties.of().strength(2.5f).explosionResistance(6.0f).requiresCorrectToolForDrops()
                    .mapColor(MapColor.STONE), Block::new);

    //This Block 's textures reference is made by this company https://3rdstreetinn.com/collections/interlocking-slate-tiles
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            BlockBehaviour.Properties.of().strength(1.5f).explosionResistance(6.0f).requiresCorrectToolForDrops()
                    .mapColor(MapColor.STONE), Block::new);

    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.STONE_TILES), Block::new);
    public static final Block CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS), Block::new);
    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS), Block::new);
    public static final Block PACKED_MYCELIUM = registerBlock("packed_mycelium",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MYCELIUM), PackedMyceliumBlock::new);
    public static final Block NETHER_BRICK_PILLAR = registerBlock("nether_brick_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS), RotatedPillarBlock::new);
    public static final Block CHISELED_END_STONE = registerBlock("chiseled_end_stone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE), Block::new);
    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(4.0F, 9.0F), Block::new);
    public static final Block CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS), Block::new);
    public static final Block MOSSY_END_STONE_BRICKS = registerBlock("mossy_end_stone_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS), Block::new);
    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS), Block::new);
    public static final Block END_STONE_TILES = registerBlock("end_stone_tiles",
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS), Block::new);
    public static final Block CRACKED_END_STONE_TILES = registerBlock("cracked_end_stone_tiles",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.END_STONE_TILES), Block::new);
    public static final Block VOID_STONE = registerBlock("void_stone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.TERRACOTTA_BLUE).strength(5.0F, 12.0F), Block::new);
    public static final Block VOID_STONE_BRICKS = registerBlock("void_stone_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.VOID_STONE).strength(5.5F, 12.0F), Block::new);
    public static final Block VOID_STONE_BRICK_PILLAR = registerBlock("void_stone_brick_pillar",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.VOID_STONE_BRICKS), RotatedPillarBlock::new);
    public static final Block CHISELED_VOID_STONE = registerBlock("chiseled_void_stone",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.VOID_STONE).lightLevel(state -> 1), Block::new);
    public static final Block CUT_QUARTZ = registerBlock("cut_quartz",
            BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK), Block::new);
    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA), Block::new);
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA), Block::new);
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA), Block::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA), Block::new);
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA), Block::new);
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA), Block::new);
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA), Block::new);
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA), Block::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA), Block::new);
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA), Block::new);
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA), Block::new);
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA), Block::new);
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA), Block::new);
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA), Block::new);
    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA), Block::new);
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA), Block::new);
    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA), Block::new);
    public static final Block HARDENED_WHITE_STAINED_GLASS = registerStainedGlass("hardened_white_stained_glass",
            DyeColor.WHITE, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_ORANGE_STAINED_GLASS = registerStainedGlass("hardened_orange_stained_glass",
            DyeColor.ORANGE, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_MAGENTA_STAINED_GLASS = registerStainedGlass("hardened_magenta_stained_glass",
            DyeColor.MAGENTA, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS = registerStainedGlass("hardened_light_blue_stained_glass",
            DyeColor.LIGHT_BLUE, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_YELLOW_STAINED_GLASS = registerStainedGlass("hardened_yellow_stained_glass",
            DyeColor.YELLOW, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_LIME_STAINED_GLASS = registerStainedGlass("hardened_lime_stained_glass",
            DyeColor.LIME, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_PINK_STAINED_GLASS = registerStainedGlass("hardened_pink_stained_glass",
            DyeColor.PINK, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_GRAY_STAINED_GLASS = registerStainedGlass("hardened_gray_stained_glass",
            DyeColor.GRAY, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS = registerStainedGlass("hardened_light_gray_stained_glass",
            DyeColor.LIGHT_GRAY, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_CYAN_STAINED_GLASS = registerStainedGlass("hardened_cyan_stained_glass",
            DyeColor.CYAN, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_PURPLE_STAINED_GLASS = registerStainedGlass("hardened_purple_stained_glass",
            DyeColor.PURPLE, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_BLUE_STAINED_GLASS = registerStainedGlass("hardened_blue_stained_glass",
            DyeColor.BLUE, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_BROWN_STAINED_GLASS = registerStainedGlass("hardened_brown_stained_glass",
            DyeColor.BROWN, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_GREEN_STAINED_GLASS = registerStainedGlass("hardened_green_stained_glass",
            DyeColor.GREEN, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_RED_STAINED_GLASS = registerStainedGlass("hardened_red_stained_glass",
            DyeColor.RED, DecoBlocks.HARDENED_GLASS,25,100);
    public static final Block HARDENED_BLACK_STAINED_GLASS = registerStainedGlass("hardened_black_stained_glass",
            DyeColor.BLACK, DecoBlocks.HARDENED_GLASS,25,100);

    public static final Block MOSAIC_WHITE_STAINED_GLASS = registerStainedGlass("mosaic_white_stained_glass",
            DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_ORANGE_STAINED_GLASS = registerStainedGlass("mosaic_orange_stained_glass",
            DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_MAGENTA_STAINED_GLASS = registerStainedGlass("mosaic_magenta_stained_glass",
            DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_LIGHT_BLUE_STAINED_GLASS = registerStainedGlass("mosaic_light_blue_stained_glass",
            DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_YELLOW_STAINED_GLASS = registerStainedGlass("mosaic_yellow_stained_glass",
            DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_LIME_STAINED_GLASS = registerStainedGlass("mosaic_lime_stained_glass",
            DyeColor.LIME, Blocks.LIME_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_PINK_STAINED_GLASS = registerStainedGlass("mosaic_pink_stained_glass",
            DyeColor.PINK, Blocks.PINK_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_GRAY_STAINED_GLASS = registerStainedGlass("mosaic_gray_stained_glass",
            DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_LIGHT_GRAY_STAINED_GLASS = registerStainedGlass("mosaic_light_gray_stained_glass",
            DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_CYAN_STAINED_GLASS = registerStainedGlass("mosaic_cyan_stained_glass",
            DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_PURPLE_STAINED_GLASS = registerStainedGlass("mosaic_purple_stained_glass",
            DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_BLUE_STAINED_GLASS = registerStainedGlass("mosaic_blue_stained_glass",
            DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_BROWN_STAINED_GLASS = registerStainedGlass("mosaic_brown_stained_glass",
            DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_GREEN_STAINED_GLASS = registerStainedGlass("mosaic_green_stained_glass",
            DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_RED_STAINED_GLASS = registerStainedGlass("mosaic_red_stained_glass",
            DyeColor.RED, Blocks.RED_STAINED_GLASS,0.6f,0.3f);
    public static final Block MOSAIC_BLACK_STAINED_GLASS = registerStainedGlass("mosaic_black_stained_glass",
            DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS,0.6f,0.3f);

    public static final Block CUT_RED_SANDSTONE_BRICKS = registerBlock("cut_red_sandstone_bricks",
            BlockBehaviour.Properties.of().strength(1.6f).requiresCorrectToolForDrops().mapColor(MapColor.COLOR_ORANGE), Block::new);
    public static final Block COBBLED_RED_SANDSTONE = registerBlock("cobbled_red_sandstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE), Block::new);
    public static final Block CHISELED_POLISHED_RED_SANDSTONE = registerBlock("chiseled_polished_red_sandstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_RED_SANDSTONE), Block::new);
    public static final Block POLISHED_RED_SANDSTONE = registerBlock("polished_red_sandstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE), Block::new);
    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_RED_SANDSTONE_BRICKS), Block::new);
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).mapColor(MapColor.DIAMOND), Block::new);
    public static final Block CRYSTALLIZED_PRISMARINE = registerBlock("crystallized_prismarine",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).mapColor(MapColor.WARPED_WART_BLOCK)
                    .lightLevel(state -> 5).sound(SoundType.GLASS), Block::new);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("crystallized_prismarine_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).mapColor(MapColor.WARPED_WART_BLOCK)
                    .lightLevel(state -> 5).sound(SoundType.GLASS), Block::new);
    public static final Block CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS = registerBlock("chiseled_crystallized_prismarine_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).mapColor(MapColor.WARPED_WART_BLOCK)
                    .lightLevel(state -> 5).sound(SoundType.GLASS), Block::new);
    public static final Block LIGHT_PRISMARINE = registerBlock("light_prismarine",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).mapColor(MapColor.QUARTZ)
                    .lightLevel(state -> 10).sound(SoundType.GLASS), Block::new);
    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE).strength(1.4f), Block::new);
    public static final Block CHISELED_ICE_BRICKS = registerBlock("chiseled_ice_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.ICE_BRICKS), Block::new);
    public static final Block SOUL_SOILSTONE = registerBlock("soul_soilstone",
            BlockBehaviour.Properties.of().strength(0.8f).requiresCorrectToolForDrops().mapColor(MapColor.COLOR_BROWN), Block::new);
    public static final Block CHISELED_SOUL_SOILSTONE = registerBlock("chiseled_soul_soilstone",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOUL_SOILSTONE), Block::new);
    public static final Block CUT_SOUL_SOILSTONE = registerBlock("cut_soul_soilstone",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOUL_SOILSTONE), Block::new);
    public static final Block SMOOTH_SOUL_SOILSTONE = registerBlock("smooth_soul_soilstone",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOUL_SOILSTONE), Block::new);
    public static final Block CUT_SOUL_SOILSTONE_BRICKS = registerBlock("cut_soul_soilstone_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_SOUL_SOILSTONE), Block::new);
    public static final Block COBBLED_SOUL_SOILSTONE = registerBlock("cobbled_soul_soilstone",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOUL_SOILSTONE), Block::new);
    public static final Block CHISELED_POLISHED_SOUL_SOILSTONE = registerBlock("chiseled_polished_soul_soilstone",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHISELED_SOUL_SOILSTONE), Block::new);
    public static final Block POLISHED_SOUL_SOILSTONE = registerBlock("polished_soul_soilstone",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_SOUL_SOILSTONE), Block::new);
    public static final Block SOUL_SOILSTONE_BRICKS = registerBlock("soul_soilstone_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS), Block::new);
    public static final Block CHISELED_MAGMA_BLOCK = registerBlock("chiseled_magma_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK), MagmaBlock::new);
    public static final Block MAGMA_BRICKS = registerBlock("magma_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK).lightLevel(state -> 1)
                    .strength(1.5F).sound(SoundType.NETHER_BRICKS), MagmaBrickBlock::new);
    public static final Block CHISELED_MAGMA_BRICKS = registerBlock("chiseled_magma_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MAGMA_BRICKS), MagmaBrickBlock::new);
    public static final Block BUBBLE_BLOCK = registerBlock("bubble_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(0.5F,25.0f)
                    .mapColor(MapColor.COLOR_BLUE).randomTicks()
                    .emissiveRendering(DecoBlocks::always).lightLevel(state -> 1), BubbleBlock::new);
    public static final Block CHISELED_BUBBLE_BLOCK = registerBlock("chiseled_bubble_block",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BUBBLE_BLOCK), BubbleBlock::new);
    public static final Block BUBBLE_BRICKS = registerBlock("bubble_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BUBBLE_BLOCK).strength(1.5F)
                    .mapColor(MapColor.STONE), BubbleBlock::new);
    public static final Block CHISELED_BUBBLE_BRICKS = registerBlock("chiseled_bubble_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BUBBLE_BRICKS), BubbleBlock::new);
    public static final Block WIND_BLOCK = registerBlock("wind_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF).mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .lightLevel(state -> 1).speedFactor(1.25F).jumpFactor(1.5f)
                    .strength(0.25F), Block::new);
    public static final Block CHISELED_WIND_BLOCK = registerBlock("chiseled_wind_block",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WIND_BLOCK), Block::new);
    public static final Block WIND_BRICKS = registerBlock("wind_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WIND_BLOCK).strength(1.25F)
                    .mapColor(MapColor.TERRACOTTA_GRAY).speedFactor(1.0F), Block::new);
    public static final Block CHISELED_WIND_BRICKS = registerBlock("chiseled_wind_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WIND_BRICKS), Block::new);
    public static final Block EARTH_BLOCK = registerBlock("earth_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).mapColor(MapColor.COLOR_BROWN)
                    .lightLevel(state -> 1).speedFactor(0.25F).jumpFactor(0F)
                    .strength(2.0F), Block::new);
    public static final Block CHISELED_EARTH_BLOCK = registerBlock("chiseled_earth_block",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EARTH_BLOCK), Block::new);
    public static final Block EARTH_BRICKS = registerBlock("earth_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EARTH_BLOCK).strength(3.0F)
                    .mapColor(MapColor.DEEPSLATE).speedFactor(1.0F), Block::new);
    public static final Block CHISELED_EARTH_BRICKS = registerBlock("chiseled_earth_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EARTH_BRICKS), Block::new);
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS), Block::new);
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS), Block::new);
    public static final Block RED_NETHER_BRICK_PILLAR = registerBlock("red_nether_brick_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS), RotatedPillarBlock::new);
    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).mapColor(MapColor.WARPED_NYLIUM), Block::new);
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BLUE_NETHER_BRICKS), Block::new);
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BLUE_NETHER_BRICKS), Block::new);
    public static final Block BLUE_NETHER_BRICK_PILLAR = registerBlock("blue_nether_brick_pillar",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BLUE_NETHER_BRICKS), RotatedPillarBlock::new);
    public static final Block CUT_WHITE_CONCRETE = registerBlock("cut_white_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE), Block::new);
    public static final Block CUT_ORANGE_CONCRETE = registerBlock("cut_orange_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE), Block::new);
    public static final Block CUT_MAGENTA_CONCRETE = registerBlock("cut_magenta_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE), Block::new);
    public static final Block CUT_LIGHT_BLUE_CONCRETE = registerBlock("cut_light_blue_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE), Block::new);
    public static final Block CUT_YELLOW_CONCRETE = registerBlock("cut_yellow_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE), Block::new);
    public static final Block CUT_LIME_CONCRETE = registerBlock("cut_lime_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE), Block::new);
    public static final Block CUT_PINK_CONCRETE = registerBlock("cut_pink_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE), Block::new);
    public static final Block CUT_GRAY_CONCRETE = registerBlock("cut_gray_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE), Block::new);
    public static final Block CUT_LIGHT_GRAY_CONCRETE = registerBlock("cut_light_gray_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE), Block::new);
    public static final Block CUT_CYAN_CONCRETE = registerBlock("cut_cyan_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE), Block::new);
    public static final Block CUT_PURPLE_CONCRETE = registerBlock("cut_purple_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE), Block::new);
    public static final Block CUT_BLUE_CONCRETE = registerBlock("cut_blue_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE), Block::new);
    public static final Block CUT_BROWN_CONCRETE = registerBlock("cut_brown_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE), Block::new);
    public static final Block CUT_GREEN_CONCRETE = registerBlock("cut_green_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE), Block::new);
    public static final Block CUT_RED_CONCRETE = registerBlock("cut_red_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE), Block::new);
    public static final Block CUT_BLACK_CONCRETE = registerBlock("cut_black_concrete",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE), Block::new);
    public static final Block DUEL_CUT_ORANGE_CONCRETE = registerBlock("duel_cut_orange_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_ORANGE_CONCRETE), Block::new);
    public static final Block DUEL_CUT_MAGENTA_CONCRETE = registerBlock("duel_cut_magenta_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_MAGENTA_CONCRETE), Block::new);
    public static final Block DUEL_CUT_LIGHT_BLUE_CONCRETE = registerBlock("duel_cut_light_blue_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE), Block::new);
    public static final Block DUEL_CUT_YELLOW_CONCRETE = registerBlock("duel_cut_yellow_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_YELLOW_CONCRETE), Block::new);
    public static final Block DUEL_CUT_LIME_CONCRETE = registerBlock("duel_cut_lime_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIME_CONCRETE), Block::new);
    public static final Block DUEL_CUT_PINK_CONCRETE = registerBlock("duel_cut_pink_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_PINK_CONCRETE), Block::new);
    public static final Block DUEL_CUT_GRAY_CONCRETE = registerBlock("duel_cut_gray_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GRAY_CONCRETE), Block::new);
    public static final Block DUEL_CUT_LIGHT_GRAY_CONCRETE = registerBlock("duel_cut_light_gray_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE), Block::new);
    public static final Block DUEL_CUT_CYAN_CONCRETE = registerBlock("duel_cut_cyan_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_CYAN_CONCRETE), Block::new);
    public static final Block DUEL_CUT_PURPLE_CONCRETE = registerBlock("duel_cut_purple_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_PURPLE_CONCRETE), Block::new);
    public static final Block DUEL_CUT_BLUE_CONCRETE = registerBlock("duel_cut_blue_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BLUE_CONCRETE), Block::new);
    public static final Block DUEL_CUT_BROWN_CONCRETE = registerBlock("duel_cut_brown_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BROWN_CONCRETE), Block::new);
    public static final Block DUEL_CUT_GREEN_CONCRETE = registerBlock("duel_cut_green_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GREEN_CONCRETE), Block::new);
    public static final Block DUEL_CUT_RED_CONCRETE = registerBlock("duel_cut_red_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_RED_CONCRETE), Block::new);
    public static final Block DUEL_CUT_BLACK_CONCRETE = registerBlock("duel_cut_black_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BLACK_CONCRETE), Block::new);
    public static final Block CHECKERED_ORANGE_CONCRETE = registerBlock("checkered_orange_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_ORANGE_CONCRETE), Block::new);
    public static final Block CHECKERED_MAGENTA_CONCRETE = registerBlock("checkered_magenta_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_MAGENTA_CONCRETE), Block::new);
    public static final Block CHECKERED_LIGHT_BLUE_CONCRETE = registerBlock("checkered_light_blue_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE), Block::new);
    public static final Block CHECKERED_YELLOW_CONCRETE = registerBlock("checkered_yellow_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_YELLOW_CONCRETE), Block::new);
    public static final Block CHECKERED_LIME_CONCRETE = registerBlock("checkered_lime_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIME_CONCRETE), Block::new);
    public static final Block CHECKERED_PINK_CONCRETE = registerBlock("checkered_pink_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_PINK_CONCRETE), Block::new);
    public static final Block CHECKERED_GRAY_CONCRETE = registerBlock("checkered_gray_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GRAY_CONCRETE), Block::new);
    public static final Block CHECKERED_LIGHT_GRAY_CONCRETE = registerBlock("checkered_light_gray_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE), Block::new);
    public static final Block CHECKERED_CYAN_CONCRETE = registerBlock("checkered_cyan_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_CYAN_CONCRETE), Block::new);
    public static final Block CHECKERED_PURPLE_CONCRETE = registerBlock("checkered_purple_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_PURPLE_CONCRETE), Block::new);
    public static final Block CHECKERED_BLUE_CONCRETE = registerBlock("checkered_blue_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BLUE_CONCRETE), Block::new);
    public static final Block CHECKERED_BROWN_CONCRETE = registerBlock("checkered_brown_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BROWN_CONCRETE), Block::new);
    public static final Block CHECKERED_GREEN_CONCRETE = registerBlock("checkered_green_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GREEN_CONCRETE), Block::new);
    public static final Block CHECKERED_RED_CONCRETE = registerBlock("checkered_red_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_RED_CONCRETE), Block::new);
    public static final Block CHECKERED_BLACK_CONCRETE = registerBlock("checkered_black_concrete",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BLACK_CONCRETE), Block::new);
    public static final Block WHITE_CONCRETE_PILLAR = registerBlock("white_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE),RotatedPillarBlock::new);
    public static final Block ORANGE_CONCRETE_PILLAR = registerBlock("orange_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE),RotatedPillarBlock::new);
    public static final Block MAGENTA_CONCRETE_PILLAR = registerBlock("magenta_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE),RotatedPillarBlock::new);
    public static final Block LIGHT_BLUE_CONCRETE_PILLAR = registerBlock("light_blue_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE),RotatedPillarBlock::new);
    public static final Block YELLOW_CONCRETE_PILLAR = registerBlock("yellow_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE),RotatedPillarBlock::new);
    public static final Block LIME_CONCRETE_PILLAR = registerBlock("lime_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE),RotatedPillarBlock::new);
    public static final Block PINK_CONCRETE_PILLAR = registerBlock("pink_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE),RotatedPillarBlock::new);
    public static final Block GRAY_CONCRETE_PILLAR = registerBlock("gray_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE),RotatedPillarBlock::new);
    public static final Block LIGHT_GRAY_CONCRETE_PILLAR = registerBlock("light_gray_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE),RotatedPillarBlock::new);
    public static final Block CYAN_CONCRETE_PILLAR = registerBlock("cyan_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE),RotatedPillarBlock::new);
    public static final Block PURPLE_CONCRETE_PILLAR = registerBlock("purple_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE),RotatedPillarBlock::new);
    public static final Block BLUE_CONCRETE_PILLAR = registerBlock("blue_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE),RotatedPillarBlock::new);
    public static final Block BROWN_CONCRETE_PILLAR = registerBlock("brown_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE),RotatedPillarBlock::new);
    public static final Block GREEN_CONCRETE_PILLAR = registerBlock("green_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE),RotatedPillarBlock::new);
    public static final Block RED_CONCRETE_PILLAR = registerBlock("red_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE),RotatedPillarBlock::new);
    public static final Block BLACK_CONCRETE_PILLAR = registerBlock("black_concrete_pillar",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE),RotatedPillarBlock::new);
    public static final Block HYDRATED_TUBE_CORAL_BLOCK = registerBlock("hydrated_tube_coral_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL_BLOCK), Block::new);
    public static final Block HYDRATED_BRAIN_CORAL_BLOCK = registerBlock("hydrated_brain_coral_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRAIN_CORAL_BLOCK), Block::new);
    public static final Block HYDRATED_BUBBLE_CORAL_BLOCK = registerBlock("hydrated_bubble_coral_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BUBBLE_CORAL_BLOCK), Block::new);
    public static final Block HYDRATED_FIRE_CORAL_BLOCK = registerBlock("hydrated_fire_coral_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.FIRE_CORAL_BLOCK), Block::new);
    public static final Block HYDRATED_HORN_CORAL_BLOCK = registerBlock("hydrated_horn_coral_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.HORN_CORAL_BLOCK), Block::new);
    public static final Block POLISHED_GLIDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).strength(2.5f),Block::new);
    public static final Block CHISELED_GLIDED_BLACKSTONE = registerBlock("chiseled_gilded_blackstone",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_GLIDED_BLACKSTONE),Block::new);
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICKS = registerBlock("mossy_polished_blackstone_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS), Block::new);
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            BlockBehaviour.Properties.of().strength(1.5f).explosionResistance(6.0f).requiresCorrectToolForDrops().mapColor(MapColor.COLOR_BLACK),Block::new);
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_BLACKSTONE_TILES),Block::new);

    public static final Block CLOUD_BLOCK = registerCouldBlock("cloud_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.NONE).strength(0.4f,0.2f)
                    .sound(SoundType.WOOL).noOcclusion().isValidSpawn(DecoBlocks::never).noCollision(),CloudBlock::new);
    public static final Block SOLID_CLOUD = registerBlock("solid_cloud",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).strength(0.8f,0.4f)
                    .isValidSpawn(DecoBlocks::never).noOcclusion(),TransparentBlock::new);
    public static final Block CLOUD_BRICKS = registerBlock("cloud_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOLID_CLOUD).strength(1.2f,0.6f),TransparentBlock::new);
    public static final Block CHISELED_CLOUD_BRICKS = registerBlock("chiseled_cloud_bricks",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOLID_CLOUD).strength(1.2f,0.6f),TransparentBlock::new);
    public static final Block FRAGILE_ICE = registerBlock("fragile_ice",
            BlockBehaviour.Properties.of().mapColor(MapColor.ICE).friction(0.98F)
                    .instabreak().sound(SoundType.GLASS).noOcclusion()
                    .isValidSpawn(DecoBlocks::never).explosionResistance(0.1f).pushReaction(PushReaction.DESTROY), FragileIceBlock::new);
    public static final Block BLACK_ICE = registerBlock("black_ice",
            BlockBehaviour.Properties.of().friction(1.18F)
                    .strength(5.6f).sound(SoundType.STONE).speedFactor(0.9F)
                    .mapColor(MapColor.COLOR_BLACK).pushReaction(PushReaction.BLOCK), BlackIceBlock::new);
    public static final Block WHITE_BLOCK = registerBlock("white_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.WHITE), Block::new);
    public static final Block ORANGE_BLOCK = registerBlock("orange_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.ORANGE), Block::new);
    public static final Block MAGENTA_BLOCK = registerBlock("magenta_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.MAGENTA), Block::new);
    public static final Block LIGHT_BLUE_BLOCK = registerBlock("light_blue_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.LIGHT_BLUE), Block::new);
    public static final Block YELLOW_BLOCK = registerBlock("yellow_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.YELLOW), Block::new);
    public static final Block LIME_BLOCK = registerBlock("lime_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.LIME), Block::new);
    public static final Block PINK_BLOCK = registerBlock("pink_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.PINK), Block::new);
    public static final Block GRAY_BLOCK = registerBlock("gray_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.GRAY), Block::new);
    public static final Block LIGHT_GRAY_BLOCK = registerBlock("light_gray_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.LIGHT_GRAY), Block::new);
    public static final Block CYAN_BLOCK = registerBlock("cyan_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.CYAN), Block::new);
    public static final Block PURPLE_BLOCK = registerBlock("purple_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.PURPLE), Block::new);
    public static final Block BLUE_BLOCK = registerBlock("blue_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.BLUE), Block::new);
    public static final Block BROWN_BLOCK = registerBlock("brown_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.BROWN), Block::new);
    public static final Block GREEN_BLOCK = registerBlock("green_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.GREEN), Block::new);
    public static final Block RED_BLOCK = registerBlock("red_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.RED), Block::new);
    public static final Block BLACK_BLOCK = registerBlock("black_block",
            BlockBehaviour.Properties.of().explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE).mapColor(DyeColor.BLACK), Block::new);
    public static final Block TUFF_TILES = registerBlock("tuff_tiles",
            BlockBehaviour.Properties.of().strength(1.5f).explosionResistance(6.0f).requiresCorrectToolForDrops()
                    .mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.TUFF_BRICKS), Block::new);
    public static final Block CRACKED_TUFF_TILES = registerBlock("cracked_tuff_tiles",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.TUFF_TILES), Block::new);
    public static final Block CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS), Block::new);
    public static final Block MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS), Block::new);
    public static final Block CHISELED_STONE = registerBlock("chiseled_stone",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_STONE), Block::new);
    public static final Block CHISELED_POLISHED_BLACKSTONE_BRICKS = registerBlock("chiseled_polished_blackstone_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS), Block::new);
    public static final Block CHISELED_DEEPSLATE_BRICKS = registerBlock("chiseled_deepslate_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS), Block::new);

    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS), Block::new);
    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS), RotatedPillarBlock::new);
    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS), Block::new);
    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS), RotatedPillarBlock::new);
    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS), Block::new);
    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS), RotatedPillarBlock::new);
    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS), Block::new);
    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS), Block::new);
    public static final Block PALE_OAK_MOSAIC = registerBlock("pale_oak_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS), RotatedPillarBlock::new);
    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS), RotatedPillarBlock::new);
    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS), Block::new);
    public static final Block CACTUS_MOSAIC = registerBlock("cactus_mosaic",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CACTUS_PLANKS), RotatedPillarBlock::new);
    public static final Block MUSHROOM_MOSAIC = registerBlock("mushroom_mosaic",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MUSHROOM_PLANKS), Block::new);
    public static final Block DRIFTWOOD_MOSAIC = registerBlock("driftwood_mosaic",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_PLANKS), RotatedPillarBlock::new);
    public static final Block WOODEN_MOSAIC = registerBlock("wooden_mosaic",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WOODEN_PLANKS), Block::new);
    public static final Block IRON_CAP_MOSAIC = registerBlock("iron_cap_mosaic",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.IRON_CAP_PLANKS), Block::new);

    public static final Block SMOOTH_RESIN = registerBlock("smooth_resin",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BLOCK).strength(1.5F, 6.0F)
                    .requiresCorrectToolForDrops(), Block::new);
    public static final Block SMOOTH_RESIN_STAIRS = registerStairs("smooth_resin_stairs",
            DecoBlocks.SMOOTH_RESIN,DecoBlocks.SMOOTH_RESIN);
    public static final Block SMOOTH_RESIN_SLAB = registerBlock("smooth_resin_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_RESIN),SlabBlock::new);
    public static final Block SMOOTH_RESIN_WALL = registerBlock("smooth_resin_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_RESIN),WallBlock::new);

    public static final Block RESIN_STAIRS = registerStairs("resin_stairs",
            Blocks.RESIN_BLOCK,Blocks.RESIN_BLOCK);
    public static final Block RESIN_SLAB = registerBlock("resin_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BLOCK),SlabBlock::new);
    public static final Block RESIN_WALL = registerBlock("resin_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BLOCK),WallBlock::new);

    public static final Block OAK_MOSAIC_STAIRS = registerStairs("oak_mosaic_stairs",
            DecoBlocks.OAK_MOSAIC,DecoBlocks.OAK_MOSAIC);
    public static final Block SPRUCE_MOSAIC_STAIRS = registerStairs("spruce_mosaic_stairs",
            DecoBlocks.SPRUCE_MOSAIC,DecoBlocks.SPRUCE_MOSAIC);
    public static final Block BIRCH_MOSAIC_STAIRS = registerStairs("birch_mosaic_stairs",
            DecoBlocks.BIRCH_MOSAIC,DecoBlocks.BIRCH_MOSAIC);
    public static final Block JUNGLE_MOSAIC_STAIRS = registerStairs("jungle_mosaic_stairs",
            DecoBlocks.JUNGLE_MOSAIC,DecoBlocks.JUNGLE_MOSAIC);
    public static final Block ACACIA_MOSAIC_STAIRS = registerStairs("acacia_mosaic_stairs",
            DecoBlocks.ACACIA_MOSAIC,DecoBlocks.ACACIA_MOSAIC);
    public static final Block DARK_OAK_MOSAIC_STAIRS = registerStairs("dark_oak_mosaic_stairs",
            DecoBlocks.DARK_OAK_MOSAIC,DecoBlocks.DARK_OAK_MOSAIC);
    public static final Block MANGROVE_MOSAIC_STAIRS = registerStairs("mangrove_mosaic_stairs",
            DecoBlocks.MANGROVE_MOSAIC,DecoBlocks.MANGROVE_MOSAIC);
    public static final Block CHERRY_MOSAIC_STAIRS = registerStairs("cherry_mosaic_stairs",
            DecoBlocks.CHERRY_MOSAIC,DecoBlocks.CHERRY_MOSAIC);
    public static final Block PALE_OAK_MOSAIC_STAIRS = registerStairs("pale_oak_mosaic_stairs",
            DecoBlocks.PALE_OAK_MOSAIC,DecoBlocks.PALE_OAK_MOSAIC);
    public static final Block CRIMSON_MOSAIC_STAIRS = registerStairs("crimson_mosaic_stairs",
            DecoBlocks.CRIMSON_MOSAIC,DecoBlocks.CRIMSON_MOSAIC);
    public static final Block WARPED_MOSAIC_STAIRS = registerStairs("warped_mosaic_stairs",
            DecoBlocks.WARPED_MOSAIC,DecoBlocks.WARPED_MOSAIC);
    public static final Block CACTUS_MOSAIC_STAIRS = registerStairs("cactus_mosaic_stairs",
            DecoBlocks.CACTUS_MOSAIC,DecoBlocks.CACTUS_MOSAIC);
    public static final Block MUSHROOM_MOSAIC_STAIRS = registerStairs("mushroom_mosaic_stairs",
            DecoBlocks.MUSHROOM_MOSAIC, DecoBlocks.MUSHROOM_MOSAIC);
    public static final Block DRIFTWOOD_MOSAIC_STAIRS = registerStairs("driftwood_mosaic_stairs",
            DecoBlocks.DRIFTWOOD_MOSAIC,DecoBlocks.DRIFTWOOD_MOSAIC);
    public static final Block WOODEN_MOSAIC_STAIRS = registerStairs("wooden_mosaic_stairs",
            DecoBlocks.WOODEN_MOSAIC,DecoBlocks.WOODEN_MOSAIC);
    public static final Block IRON_CAP_MOSAIC_STAIRS = registerStairs("iron_cap_mosaic_stairs",
            DecoBlocks.IRON_CAP_MOSAIC, DecoBlocks.IRON_CAP_MOSAIC);

    public static final Block OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.OAK_MOSAIC),SlabBlock::new);
    public static final Block SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SPRUCE_MOSAIC),SlabBlock::new);
    public static final Block BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BIRCH_MOSAIC),SlabBlock::new);
    public static final Block JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.JUNGLE_MOSAIC),SlabBlock::new);
    public static final Block ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.ACACIA_MOSAIC),SlabBlock::new);
    public static final Block DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DARK_OAK_MOSAIC),SlabBlock::new);
    public static final Block MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MANGROVE_MOSAIC),SlabBlock::new);
    public static final Block CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHERRY_MOSAIC),SlabBlock::new);
    public static final Block PALE_OAK_MOSAIC_SLAB = registerBlock("pale_oak_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PALE_OAK_MOSAIC),SlabBlock::new);
    public static final Block CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRIMSON_MOSAIC),SlabBlock::new);
    public static final Block WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WARPED_MOSAIC),SlabBlock::new);
    public static final Block CACTUS_MOSAIC_SLAB = registerBlock("cactus_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CACTUS_MOSAIC),SlabBlock::new);
    public static final Block MUSHROOM_MOSAIC_SLAB = registerBlock("mushroom_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MUSHROOM_MOSAIC), SlabBlock::new);
    public static final Block DRIFTWOOD_MOSAIC_SLAB = registerBlock("driftwood_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_MOSAIC),SlabBlock::new);
    public static final Block WOODEN_MOSAIC_SLAB = registerBlock("wooden_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WOODEN_MOSAIC),SlabBlock::new);
    public static final Block IRON_CAP_MOSAIC_SLAB = registerBlock("iron_cap_mosaic_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.IRON_CAP_MOSAIC), SlabBlock::new);

    public static final Block PASTEL_ORANGE_BLOCK = registerBlock("pastel_orange_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.ORANGE).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_MAGENTA_BLOCK = registerBlock("pastel_magenta_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.MAGENTA).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_LIGHT_BLUE_BLOCK = registerBlock("pastel_light_blue_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_BLUE).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_YELLOW_BLOCK = registerBlock("pastel_yellow_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.YELLOW).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_LIME_BLOCK = registerBlock("pastel_lime_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.LIME).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_PINK_BLOCK = registerBlock("pastel_pink_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.PINK).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_GRAY_BLOCK = registerBlock("pastel_gray_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.GRAY).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_LIGHT_GRAY_BLOCK = registerBlock("pastel_light_gray_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_GRAY).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_CYAN_BLOCK = registerBlock("pastel_cyan_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.CYAN).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_PURPLE_BLOCK = registerBlock("pastel_purple_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.PURPLE).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_BLUE_BLOCK = registerBlock("pastel_blue_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.BLUE).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_BROWN_BLOCK = registerBlock("pastel_brown_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.BROWN).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_GREEN_BLOCK = registerBlock("pastel_green_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.GREEN).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block PASTEL_RED_BLOCK = registerBlock("pastel_red_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.RED).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);

    public static final Block SHADED_ORANGE_BLOCK = registerBlock("shaded_orange_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.ORANGE).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_MAGENTA_BLOCK = registerBlock("shaded_magenta_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.MAGENTA).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_LIGHT_BLUE_BLOCK = registerBlock("shaded_light_blue_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_BLUE).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_YELLOW_BLOCK = registerBlock("shaded_yellow_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.YELLOW).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_LIME_BLOCK = registerBlock("shaded_lime_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.LIME).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_PINK_BLOCK = registerBlock("shaded_pink_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.PINK).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_GRAY_BLOCK = registerBlock("shaded_gray_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.GRAY).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_LIGHT_GRAY_BLOCK = registerBlock("shaded_light_gray_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_GRAY).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_CYAN_BLOCK = registerBlock("shaded_cyan_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.CYAN).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_PURPLE_BLOCK = registerBlock("shaded_purple_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.PURPLE).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_BLUE_BLOCK = registerBlock("shaded_blue_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.BLUE).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_BROWN_BLOCK = registerBlock("shaded_brown_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.BROWN).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_GREEN_BLOCK = registerBlock("shaded_green_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.GREEN).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);
    public static final Block SHADED_RED_BLOCK = registerBlock("shaded_red_block",
            BlockBehaviour.Properties.of().mapColor(DyeColor.RED).explosionResistance(0.5f)
                    .instabreak().sound(SoundType.CANDLE), Block::new);

    public static final Block WARPED_WART_PLANT = registerBlock("warped_wart_plant",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_WART).mapColor(MapColor.WARPED_WART_BLOCK).noOcclusion(),
                    WarpedWartBlock::new);

    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE), SlabBlock::new);
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE), SlabBlock::new);
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK), SlabBlock::new);

    public static final Block GRASS_SLAB = registerBlock("grass_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PACKED_GRASS), SlabBlock::new);
    public static final Block DRY_GRASS_SLAB = registerBlock("dry_grass_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PACKED_DRY_GRASS), SlabBlock::new);
    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT), SlabBlock::new);
    public static final Block COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.COARSE_DIRT), SlabBlock::new);
    public static final Block PODZOL_SLAB = registerBlock("podzol_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PACKED_PODZOL), SlabBlock::new);
    public static final Block ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ROOTED_DIRT), SlabBlock::new);
    public static final Block MUD_SLAB = registerBlock("mud_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MUD), SlabBlock::new);
    public static final Block CRIMSON_NYLIUM_SLAB = registerBlock("crimson_nylium_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PACKED_CRIMSON_NYLIUM), SlabBlock::new);
    public static final Block WARPED_NYLIUM_SLAB = registerBlock("warped_nylium_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PACKED_WARPED_NYLIUM), SlabBlock::new);

    public static final Block BEDROCK_SLAB = registerBlock("bedrock_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK), SlabBlock::new);

    public static final Block RAW_IRON_SLAB = registerBlock("raw_iron_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK), SlabBlock::new);
    public static final Block RAW_COPPER_SLAB = registerBlock("raw_copper_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_COPPER_BLOCK), SlabBlock::new);
    public static final Block RAW_GOLD_SLAB = registerBlock("raw_gold_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_GOLD_BLOCK), SlabBlock::new);

    public static final Block IRON_SLAB = registerBlock("iron_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), SlabBlock::new);
    public static final Block COPPER_SLAB = registerOxidSlab("copper_slab",
            WeatheringCopper.WeatherState.UNAFFECTED, Blocks.COPPER_BLOCK);
    public static final Block EXPOSED_COPPER_SLAB = registerOxidSlab("exposed_copper_slab",
            WeatheringCopper.WeatherState.EXPOSED, Blocks.EXPOSED_COPPER);
    public static final Block WEATHERED_COPPER_SLAB = registerOxidSlab("weathered_copper_slab",
            WeatheringCopper.WeatherState.WEATHERED, Blocks.WEATHERED_COPPER);
    public static final Block OXIDIZED_COPPER_SLAB = registerOxidSlab("oxidized_copper_slab",
            WeatheringCopper.WeatherState.OXIDIZED, Blocks.OXIDIZED_COPPER);
    public static final Block WAXED_COPPER_SLAB = registerBlock("waxed_copper_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_COPPER_BLOCK), SlabBlock::new);
    public static final Block WAXED_EXPOSED_COPPER_SLAB = registerBlock("waxed_exposed_copper_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_EXPOSED_COPPER), SlabBlock::new);
    public static final Block WAXED_WEATHERED_COPPER_SLAB = registerBlock("waxed_weathered_copper_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER), SlabBlock::new);
    public static final Block WAXED_OXIDIZED_COPPER_SLAB = registerBlock("waxed_oxidized_copper_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_OXIDIZED_COPPER), SlabBlock::new);
    public static final Block GOLD_SLAB = registerBlock("gold_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK), SlabBlock::new);

    public static final Block OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.DIRT), SlabBlock::new);
    public static final Block SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.COLOR_BROWN), SlabBlock::new);
    public static final Block BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).mapColor(MapColor.QUARTZ), SlabBlock::new);
    public static final Block JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.DIRT), SlabBlock::new);
    public static final Block ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).mapColor(MapColor.STONE), SlabBlock::new);
    public static final Block DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS), SlabBlock::new);
    public static final Block MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).mapColor(MapColor.DIRT), SlabBlock::new);
    public static final Block CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.TERRACOTTA_GRAY), SlabBlock::new);
    public static final Block CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).sound(SoundType.STEM)
                    .mapColor(MapColor.CRIMSON_HYPHAE), SlabBlock::new);
    public static final Block WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).sound(SoundType.STEM)
                    .mapColor(MapColor.WARPED_HYPHAE), SlabBlock::new);
    public static final Block WOODEN_WOOD_SLAB = registerBlock("wooden_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WOODEN_PLANKS).mapColor(MapColor.TERRACOTTA_BROWN), SlabBlock::new);
    public static final Block IRON_CAP_HYPHAE_SLAB = registerBlock("iron_cap_hyphae_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.IRON_CAP_PLANKS).mapColor(MapColor.TERRACOTTA_GRAY)
                    .sound(SoundType.STEM), SlabBlock::new);

    public static final Block BAMBOO_BLOCK_SLAB = registerBlock("bamboo_block_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).mapColor(MapColor.PLANT), SlabBlock::new);

    public static final Block STRIPPED_OAK_WOOD_SLAB = registerBlock("stripped_oak_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS), SlabBlock::new);
    public static final Block STRIPPED_SPRUCE_WOOD_SLAB = registerBlock("stripped_spruce_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS), SlabBlock::new);
    public static final Block STRIPPED_BIRCH_WOOD_SLAB = registerBlock("stripped_birch_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS), SlabBlock::new);
    public static final Block STRIPPED_JUNGLE_WOOD_SLAB = registerBlock("stripped_jungle_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS), SlabBlock::new);
    public static final Block STRIPPED_ACACIA_WOOD_SLAB = registerBlock("stripped_acacia_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS), SlabBlock::new);
    public static final Block STRIPPED_DARK_OAK_WOOD_SLAB = registerBlock("stripped_dark_oak_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS), SlabBlock::new);
    public static final Block STRIPPED_MANGROVE_WOOD_SLAB = registerBlock("stripped_mangrove_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS), SlabBlock::new);
    public static final Block STRIPPED_CHERRY_WOOD_SLAB = registerBlock("stripped_cherry_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.TERRACOTTA_GRAY), SlabBlock::new);
    public static final Block STRIPPED_CRIMSON_HYPHAE_SLAB = registerBlock("stripped_crimson_hyphae_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).sound(SoundType.STEM), SlabBlock::new);
    public static final Block STRIPPED_WARPED_HYPHAE_SLAB = registerBlock("stripped_warped_hyphae_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).sound(SoundType.STEM), SlabBlock::new);
    public static final Block STRIPPED_WOODEN_WOOD_SLAB = registerBlock("stripped_wooden_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WOODEN_PLANKS), SlabBlock::new);
    public static final Block STRIPPED_IRON_CAP_HYPHAE_SLAB = registerBlock("stripped_iron_cap_hyphae_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.IRON_CAP_PLANKS).sound(SoundType.STEM), SlabBlock::new);

    public static final Block STRIPPED_BAMBOO_SLAB = registerBlock("stripped_bamboo_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS), SlabBlock::new);

    public static final Block LAPIS_SLAB = registerBlock("lapis_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK), SlabBlock::new);

    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL), SlabBlock::new);
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_WOOL), SlabBlock::new);
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL), SlabBlock::new);
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL), SlabBlock::new);
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL), SlabBlock::new);
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL), SlabBlock::new);
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL), SlabBlock::new);
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_WOOL), SlabBlock::new);
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_WOOL), SlabBlock::new);
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_WOOL), SlabBlock::new);
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL), SlabBlock::new);
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL), SlabBlock::new);
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL), SlabBlock::new);
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL), SlabBlock::new);
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL), SlabBlock::new);
    public static final Block BLACK_WOOL_SLAB  = registerBlock("black_wool_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL), SlabBlock::new);

    public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN), SlabBlock::new);
    public static final Block SNOW_SLAB = registerBlock("snow_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK), SlabBlock::new);
    public static final Block CLAY_SLAB = registerBlock("clay_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY), SlabBlock::new);
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK), SlabBlock::new);
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT), SlabBlock::new);
    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_STONE_BRICKS), SlabBlock::new);
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD), SlabBlock::new);
    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS), SlabBlock::new);
    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES), SlabBlock::new);
    public static final Block MYCELIUM_SLAB = registerBlock("packed_mycelium_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PACKED_MYCELIUM), SlabBlock::new);
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_NETHER_BRICKS), SlabBlock::new);
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE), SlabBlock::new);
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS), SlabBlock::new);
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA), SlabBlock::new);
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA), SlabBlock::new);
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA), SlabBlock::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA), SlabBlock::new);
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA), SlabBlock::new);
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA), SlabBlock::new);
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA), SlabBlock::new);
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA), SlabBlock::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA), SlabBlock::new);
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA), SlabBlock::new);
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA), SlabBlock::new);
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA), SlabBlock::new);
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA), SlabBlock::new);
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA), SlabBlock::new);
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA), SlabBlock::new);
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA), SlabBlock::new);
    public static final Block HAY_SLAB = registerBlock("hay_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK), HaySlabBlock::new);
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA), SlabBlock::new);
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE), SlabBlock::new);
    public static final Block MAGMA_SLAB = registerBlock("magma_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK), MagmaSlabBlock::new);
    public static final Block NETHER_WART_SLAB = registerBlock("nether_wart_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_WART_BLOCK), SlabBlock::new);
    public static final Block WARPED_WART_SLAB = registerBlock("warped_wart_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WART_BLOCK), SlabBlock::new);
    public static final Block BONE_SLAB = registerBlock("bone_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BONE_BLOCK), SlabBlock::new);
    public static final Block DEAD_TUBE_CORAL_SLAB = registerBlock("dead_tube_coral_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_TUBE_CORAL_BLOCK), SlabBlock::new);
    public static final Block DEAD_BRAIN_CORAL_SLAB = registerBlock("dead_brain_coral_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_BRAIN_CORAL_BLOCK), SlabBlock::new);
    public static final Block DEAD_BUBBLE_CORAL_SLAB = registerBlock("dead_bubble_coral_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_BUBBLE_CORAL_BLOCK), SlabBlock::new);
    public static final Block DEAD_FIRE_CORAL_SLAB = registerBlock("dead_fire_coral_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_FIRE_CORAL_BLOCK), SlabBlock::new);
    public static final Block DEAD_HORN_CORAL_SLAB = registerBlock("dead_horn_coral_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_HORN_CORAL_BLOCK), SlabBlock::new);
    public static final Block TUBE_CORAL_SLAB = registerCoralSlab("tube_coral_slab",
            DEAD_TUBE_CORAL_SLAB, Blocks.TUBE_CORAL_BLOCK);
    public static final Block BRAIN_CORAL_SLAB = registerCoralSlab("brain_coral_slab",
            DEAD_BRAIN_CORAL_SLAB, Blocks.DEAD_BRAIN_CORAL_BLOCK);
    public static final Block BUBBLE_CORAL_SLAB = registerCoralSlab("bubble_coral_slab",
            DEAD_BUBBLE_CORAL_SLAB,Blocks.BUBBLE_CORAL_BLOCK);
    public static final Block FIRE_CORAL_SLAB = registerCoralSlab("fire_coral_slab",
            DEAD_FIRE_CORAL_SLAB,Blocks.FIRE_CORAL_BLOCK);
    public static final Block HORN_CORAL_SLAB = registerCoralSlab("horn_coral_slab",
            DEAD_HORN_CORAL_SLAB,Blocks.HORN_CORAL_BLOCK);
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE), SlabBlock::new);
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE), SlabBlock::new);
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE), SlabBlock::new);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE), SlabBlock::new);
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE), SlabBlock::new);
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE), SlabBlock::new);
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE), SlabBlock::new);
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE), SlabBlock::new);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE), SlabBlock::new);
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE), SlabBlock::new);
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE), SlabBlock::new);
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE), SlabBlock::new);
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE), SlabBlock::new);
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE), SlabBlock::new);
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE), SlabBlock::new);
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE), SlabBlock::new);
    public static final Block BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE), SlabBlock::new);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), SlabBlock::new);
    public static final Block MOSS_SLAB = registerBlock("moss_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK), SlabBlock::new);
    public static final Block PALE_MOSS_SLAB = registerBlock("pale_moss_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_MOSS_BLOCK), SlabBlock::new);
    public static final Block SCULK_SLAB = registerBlock("sculk_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SCULK), SlabBlock::new);
    public static final Block HONEYCOMB_SLAB = registerBlock("honeycomb_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.HONEYCOMB_BLOCK), SlabBlock::new);

    public static final Block CUT_GRANITE_SLAB = registerBlock("cut_granite_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GRANITE), SlabBlock::new);
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.GRANITE_BRICKS), SlabBlock::new);
    public static final Block CUT_DIORITE_SLAB = registerBlock("cut_diorite_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_DIORITE), SlabBlock::new);
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DIORITE_BRICKS), SlabBlock::new);
    public static final Block CUT_ANDESITE_SLAB = registerBlock("cut_andesite_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_ANDESITE), SlabBlock::new);
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.ANDESITE_BRICKS), SlabBlock::new);
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_CALCITE), SlabBlock::new);
    public static final Block CUT_CALCITE_SLAB = registerBlock("cut_calcite_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_CALCITE), SlabBlock::new);
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CALCITE_BRICKS), SlabBlock::new);
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIPSTONE_BRICKS), SlabBlock::new);
    public static final Block DRIPSTONE_BRICK_PILLAR_SLAB = registerBlock("dripstone_brick_pillar_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIPSTONE_BRICK_PILLAR), SlabBlock::new);
    public static final Block CACTUS_PLANK_SLAB = registerBlock("cactus_plank_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CACTUS_PLANKS), SlabBlock::new);
    public static final Block MUSHROOM_SLAB = registerBlock("mushroom_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MUSHROOM_PLANKS), SlabBlock::new);
    public static final Block IRON_CAP_SLAB = registerBlock("iron_cap_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.IRON_CAP_PLANKS), SlabBlock::new);
    public static final Block WOODEN_SLAB = registerBlock("wooden_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WOODEN_PLANKS), SlabBlock::new);
    public static final Block LAPIS_BRICK_SLAB = registerBlock("lapis_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LAPIS_BRICKS), SlabBlock::new);
    public static final Block CUT_LAPIS_SLAB = registerBlock("cut_lapis_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LAPIS), SlabBlock::new);
    public static final Block CUT_SANDSTONE_BRICK_SLAB = registerBlock("cut_sandstone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_SANDSTONE_BRICKS), SlabBlock::new);
    public static final Block COBBLED_SANDSTONE_SLAB = registerBlock("cobbled_sandstone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.COBBLED_SANDSTONE), SlabBlock::new);
    public static final Block POLISHED_SANDSTONE_SLAB = registerBlock("polished_sandstone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_SANDSTONE), SlabBlock::new);
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SANDSTONE_BRICKS), SlabBlock::new);
    public static final Block SMOOTH_LAPIS_SLAB = registerBlock("smooth_lapis_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_LAPIS), SlabBlock::new);
    public static final Block SMOOTH_OBSIDIAN_SLAB = registerBlock("smooth_obsidian_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_OBSIDIAN), SlabBlock::new);
    public static final Block SMOOTH_PURPUR_SLAB = registerBlock("smooth_purpur_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_PURPUR), SlabBlock::new);
    public static final Block SMOOTH_DEEPSLATE_SLAB = registerBlock("smooth_deepslate_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_DEEPSLATE), SlabBlock::new);
    public static final Block SMOOTH_BLACKSTONE_SLAB = registerBlock("smooth_blackstone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_BLACKSTONE), SlabBlock::new);
    public static final Block SMOOTH_END_STONE_SLAB = registerBlock("smooth_end_stone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_END_STONE), SlabBlock::new);
    public static final Block SANDED_OBSIDIAN_SLAB = registerBlock("sanded_obsidian_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SANDED_OBSIDIAN), SlabBlock::new);
    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.OBSIDIAN_BRICKS), SlabBlock::new);
    public static final Block CUT_OBSIDIAN_SLAB = registerBlock("cut_obsidian_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_OBSIDIAN), SlabBlock::new);
    public static final Block PURPUR_BRICK_SLAB = registerBlock("purpur_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PURPUR_BRICKS), SlabBlock::new);
    public static final Block CUT_PURPUR_SLAB = registerBlock("cut_purpur_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_PURPUR), SlabBlock::new);
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SNOW_BRICKS), SlabBlock::new);
    public static final Block PACKED_NETHERRACK_SLAB = registerBlock("packed_netherrack_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PACKED_NETHERRACK), SlabBlock::new);
    public static final Block NETHERRACK_BRICK_SLAB = registerBlock("netherrack_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.NETHERRACK_BRICKS), SlabBlock::new);
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_STONE), SlabBlock::new);
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.STONE_TILES), SlabBlock::new);
    public static final Block CRACKED_STONE_TILE_SLAB = registerBlock("cracked_stone_tile_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_STONE_TILES), SlabBlock::new);
    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MOSSY_DEEPSLATE_BRICKS), SlabBlock::new);
    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_END_STONE), SlabBlock::new);
    public static final Block MOSSY_END_STONE_BRICK_SLAB = registerBlock("mossy_end_stone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MOSSY_END_STONE_BRICKS), SlabBlock::new);
    public static final Block CRACKED_END_STONE_BRICK_SLAB = registerBlock("cracked_end_stone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_END_STONE_BRICKS), SlabBlock::new);
    public static final Block END_STONE_TILE_SLAB = registerBlock("end_stone_tile_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.END_STONE_TILES), SlabBlock::new);
    public static final Block CRACKED_END_STONE_TILE_SLAB = registerBlock("cracked_end_stone_tile_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_END_STONE_TILES), SlabBlock::new);
    public static final Block VOID_STONE_SLAB = registerBlock("void_stone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.VOID_STONE), SlabBlock::new);
    public static final Block VOID_STONE_BRICK_SLAB = registerBlock("void_stone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.VOID_STONE_BRICKS), SlabBlock::new);
    public static final Block VOID_STONE_BRICK_PILLAR_SLAB = registerBlock("void_stone_brick_pillar_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.VOID_STONE_BRICK_PILLAR), SlabBlock::new);
    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = registerBlock("white_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WHITE_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = registerBlock("orange_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.ORANGE_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlock("magenta_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("light_blue_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = registerBlock("yellow_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.YELLOW_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block LIME_TERRACOTTA_BRICK_SLAB = registerBlock("lime_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LIME_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block PINK_TERRACOTTA_BRICK_SLAB = registerBlock("pink_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PINK_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("gray_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.GRAY_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlock("light_gray_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = registerBlock("cyan_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CYAN_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = registerBlock("purple_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PURPLE_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = registerBlock("blue_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BLUE_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = registerBlock("brown_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BROWN_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = registerBlock("green_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.GREEN_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block RED_TERRACOTTA_BRICK_SLAB = registerBlock("red_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.RED_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = registerBlock("black_terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BLACK_TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block TERRACOTTA_BRICK_SLAB = registerBlock("terracotta_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.TERRACOTTA_BRICKS), SlabBlock::new);
    public static final Block SOUL_SOILSTONE_SLAB = registerBlock("soul_soilstone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOUL_SOILSTONE), SlabBlock::new);
    public static final Block CUT_SOUL_SOILSTONE_SLAB = registerBlock("cut_soul_soilstone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_SOUL_SOILSTONE), SlabBlock::new);
    public static final Block SMOOTH_SOUL_SOILSTONE_SLAB = registerBlock("smooth_soul_soilstone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_SOUL_SOILSTONE), SlabBlock::new);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_SLAB = registerBlock("cut_soul_soilstone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS), SlabBlock::new);
    public static final Block COBBLED_SOUL_SOILSTONE_SLAB = registerBlock("cobbled_soul_soilstone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.COBBLED_SOUL_SOILSTONE), SlabBlock::new);
    public static final Block POLISHED_SOUL_SOILSTONE_SLAB = registerBlock("polished_soul_soilstone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_SOUL_SOILSTONE), SlabBlock::new);
    public static final Block SOUL_SOILSTONE_BRICK_SLAB = registerBlock("soul_soilstone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOUL_SOILSTONE_BRICKS), SlabBlock::new);
    public static final Block CUT_QUARTZ_SLAB = registerBlock("cut_quartz_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_QUARTZ), SlabBlock::new);
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.ICE_BRICKS), SlabBlock::new);
    public static final Block CUT_WHITE_CONCRETE_SLAB = registerBlock("cut_white_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_WHITE_CONCRETE), SlabBlock::new);
    public static final Block CUT_ORANGE_CONCRETE_SLAB = registerBlock("cut_orange_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_ORANGE_CONCRETE), SlabBlock::new);
    public static final Block CUT_MAGENTA_CONCRETE_SLAB = registerBlock("cut_magenta_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_MAGENTA_CONCRETE), SlabBlock::new);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_SLAB = registerBlock("cut_light_blue_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE), SlabBlock::new);
    public static final Block CUT_YELLOW_CONCRETE_SLAB = registerBlock("cut_yellow_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_YELLOW_CONCRETE), SlabBlock::new);
    public static final Block CUT_LIME_CONCRETE_SLAB = registerBlock("cut_lime_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIME_CONCRETE), SlabBlock::new);
    public static final Block CUT_PINK_CONCRETE_SLAB = registerBlock("cut_pink_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_PINK_CONCRETE), SlabBlock::new);
    public static final Block CUT_GRAY_CONCRETE_SLAB = registerBlock("cut_gray_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GRAY_CONCRETE), SlabBlock::new);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_SLAB = registerBlock("cut_light_gray_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE), SlabBlock::new);
    public static final Block CUT_CYAN_CONCRETE_SLAB = registerBlock("cut_cyan_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_CYAN_CONCRETE), SlabBlock::new);
    public static final Block CUT_PURPLE_CONCRETE_SLAB = registerBlock("cut_purple_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_PURPLE_CONCRETE), SlabBlock::new);
    public static final Block CUT_BLUE_CONCRETE_SLAB = registerBlock("cut_blue_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BLUE_CONCRETE), SlabBlock::new);
    public static final Block CUT_BROWN_CONCRETE_SLAB = registerBlock("cut_brown_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BROWN_CONCRETE), SlabBlock::new);
    public static final Block CUT_GREEN_CONCRETE_SLAB = registerBlock("cut_green_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GREEN_CONCRETE), SlabBlock::new);
    public static final Block CUT_RED_CONCRETE_SLAB = registerBlock("cut_red_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_RED_CONCRETE), SlabBlock::new);
    public static final Block CUT_BLACK_CONCRETE_SLAB = registerBlock("cut_black_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BLACK_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_ORANGE_CONCRETE_SLAB = registerBlock("duel_cut_orange_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_MAGENTA_CONCRETE_SLAB = registerBlock("duel_cut_magenta_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB = registerBlock("duel_cut_light_blue_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_YELLOW_CONCRETE_SLAB = registerBlock("duel_cut_yellow_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_LIME_CONCRETE_SLAB = registerBlock("duel_cut_lime_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_LIME_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_PINK_CONCRETE_SLAB = registerBlock("duel_cut_pink_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_PINK_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_GRAY_CONCRETE_SLAB = registerBlock("duel_cut_gray_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_GRAY_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB = registerBlock("duel_cut_light_gray_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_CYAN_CONCRETE_SLAB = registerBlock("duel_cut_cyan_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_CYAN_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_PURPLE_CONCRETE_SLAB = registerBlock("duel_cut_purple_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_BLUE_CONCRETE_SLAB = registerBlock("duel_cut_blue_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_BLUE_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_BROWN_CONCRETE_SLAB = registerBlock("duel_cut_brown_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_BROWN_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_GREEN_CONCRETE_SLAB = registerBlock("duel_cut_green_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_GREEN_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_RED_CONCRETE_SLAB = registerBlock("duel_cut_red_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_RED_CONCRETE), SlabBlock::new);
    public static final Block DUEL_CUT_BLACK_CONCRETE_SLAB = registerBlock("duel_cut_black_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_BLACK_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_ORANGE_CONCRETE_SLAB = registerBlock("checkered_orange_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_ORANGE_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_MAGENTA_CONCRETE_SLAB = registerBlock("checkered_magenta_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_MAGENTA_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_LIGHT_BLUE_CONCRETE_SLAB = registerBlock("checkered_light_blue_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_YELLOW_CONCRETE_SLAB = registerBlock("checkered_yellow_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_YELLOW_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_LIME_CONCRETE_SLAB = registerBlock("checkered_lime_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_LIME_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_PINK_CONCRETE_SLAB = registerBlock("checkered_pink_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_PINK_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_GRAY_CONCRETE_SLAB = registerBlock("checkered_gray_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_GRAY_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_LIGHT_GRAY_CONCRETE_SLAB = registerBlock("checkered_light_gray_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_CYAN_CONCRETE_SLAB = registerBlock("checkered_cyan_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_CYAN_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_PURPLE_CONCRETE_SLAB = registerBlock("checkered_purple_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_PURPLE_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_BLUE_CONCRETE_SLAB = registerBlock("checkered_blue_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_BLUE_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_BROWN_CONCRETE_SLAB = registerBlock("checkered_brown_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_BROWN_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_GREEN_CONCRETE_SLAB = registerBlock("checkered_green_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_GREEN_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_RED_CONCRETE_SLAB = registerBlock("checkered_red_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_RED_CONCRETE), SlabBlock::new);
    public static final Block CHECKERED_BLACK_CONCRETE_SLAB = registerBlock("checkered_black_concrete_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_BLACK_CONCRETE), SlabBlock::new);
    public static final Block CRYSTALLIZED_PRISMARINE_SLAB = registerBlock("crystallized_prismarine_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRYSTALLIZED_PRISMARINE), SlabBlock::new);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_SLAB = registerBlock("crystallized_prismarine_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS), SlabBlock::new);
    public static final Block LIGHT_PRISMARINE_SLAB = registerBlock("light_prismarine_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LIGHT_PRISMARINE), SlabBlock::new);
    public static final Block CUT_RED_SANDSTONE_BRICK_SLAB = registerBlock("cut_red_sandstone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_RED_SANDSTONE_BRICKS), SlabBlock::new);
    public static final Block COBBLED_RED_SANDSTONE_SLAB = registerBlock("cobbled_red_sandstone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.COBBLED_RED_SANDSTONE), SlabBlock::new);
    public static final Block POLISHED_RED_SANDSTONE_SLAB = registerBlock("polished_red_sandstone_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_RED_SANDSTONE), SlabBlock::new);
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.RED_SANDSTONE_BRICKS), SlabBlock::new);
    public static final Block MAGMA_BRICK_SLAB = registerBlock("magma_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MAGMA_BRICKS), MagmaBrickSlabBlock::new);
    public static final Block BUBBLE_SLAB = registerBlock("bubble_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BUBBLE_BLOCK), BubbleSlabBlock::new);
    public static final Block BUBBLE_BRICK_SLAB = registerBlock("bubble_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BUBBLE_BRICKS), BubbleSlabBlock::new);
    public static final Block CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_RED_NETHER_BRICKS), SlabBlock::new);
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BLUE_NETHER_BRICKS), SlabBlock::new);
    public static final Block CRACKED_BLUE_NETHER_BRICK_SLAB = registerBlock("cracked_blue_nether_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS), SlabBlock::new);
    public static final Block HYDRATED_TUBE_CORAL_SLAB = registerBlock("hydrated_tube_coral_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK), SlabBlock::new);
    public static final Block HYDRATED_BRAIN_CORAL_SLAB = registerBlock("hydrated_brain_coral_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK), SlabBlock::new);
    public static final Block HYDRATED_BUBBLE_CORAL_SLAB = registerBlock("hydrated_bubble_coral_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK), SlabBlock::new);
    public static final Block HYDRATED_FIRE_CORAL_SLAB = registerBlock("hydrated_fire_coral_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK), SlabBlock::new);
    public static final Block HYDRATED_HORN_CORAL_SLAB = registerBlock("hydrated_horn_coral_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK), SlabBlock::new);
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("mossy_polished_blackstone_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS), SlabBlock::new);
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_BLACKSTONE_TILES), SlabBlock::new);
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("cracked_polished_blackstone_tile_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES), SlabBlock::new);
    public static final Block CLOUD_SLAB = registerBlock("cloud_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOLID_CLOUD), TransparentSlabBlock::new);
    public static final Block CLOUD_BRICK_SLAB = registerBlock("cloud_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CLOUD_BRICKS), TransparentSlabBlock::new);

    public static final Block DEEPSLATE_STAIRS = registerStairs("deepslate_stairs",
            Blocks.DEEPSLATE,Blocks.DEEPSLATE);
    public static final Block CALCITE_STAIRS = registerStairs("calcite_stairs",
            Blocks.CALCITE,Blocks.CALCITE);
    public static final Block DRIPSTONE_STAIRS = registerStairs("dripstone_stairs",
            Blocks.DRIPSTONE_BLOCK,Blocks.DRIPSTONE_BLOCK);

    public static final Block GRASS_STAIRS = registerStairs("grass_stairs",
            DecoBlocks.PACKED_GRASS, DecoBlocks.PACKED_GRASS);
    public static final Block DIRT_STAIRS = registerStairs("dirt_stairs",
            Blocks.DIRT, Blocks.DIRT);
    public static final Block COARSE_DIRT_STAIRS = registerStairs("coarse_dirt_stairs",
            Blocks.COARSE_DIRT, Blocks.COARSE_DIRT);
    public static final Block PODZOL_STAIRS = registerStairs("podzol_stairs",
            DecoBlocks.PACKED_PODZOL, DecoBlocks.PACKED_PODZOL);
    public static final Block DRY_GRASS_STAIRS = registerStairs("dry_grass_stairs",
            DecoBlocks.PACKED_DRY_GRASS, DecoBlocks.PACKED_DRY_GRASS);
    public static final Block ROOTED_DIRT_STAIRS = registerStairs("rooted_dirt_stairs",
            Blocks.ROOTED_DIRT, Blocks.ROOTED_DIRT);
    public static final Block MUD_STAIRS = registerStairs("mud_stairs",
            Blocks.MUD, Blocks.MUD);
    public static final Block CRIMSON_NYLIUM_STAIRS = registerStairs("crimson_nylium_stairs",
            DecoBlocks.PACKED_CRIMSON_NYLIUM, DecoBlocks.PACKED_CRIMSON_NYLIUM);
    public static final Block WARPED_NYLIUM_STAIRS = registerStairs("warped_nylium_stairs",
            DecoBlocks.PACKED_WARPED_NYLIUM, DecoBlocks.PACKED_WARPED_NYLIUM);
    public static final Block BEDROCK_STAIRS = registerStairs("bedrock_stairs",
            Blocks.BEDROCK, Blocks.BEDROCK);
    public static final Block RAW_IRON_STAIRS = registerStairs("raw_iron_stairs",
            Blocks.RAW_IRON_BLOCK, Blocks.RAW_IRON_BLOCK);
    public static final Block RAW_COPPER_STAIRS = registerStairs("raw_copper_stairs",
            Blocks.RAW_COPPER_BLOCK, Blocks.RAW_COPPER_BLOCK);
    public static final Block RAW_GOLD_STAIRS = registerStairs("raw_gold_stairs",
            Blocks.RAW_GOLD_BLOCK, Blocks.RAW_GOLD_BLOCK);

    public static final Block IRON_STAIRS = registerStairs("iron_stairs",
            Blocks.IRON_BLOCK, Blocks.IRON_BLOCK);
    public static final Block COPPER_STAIRS = registerOxidStairs("copper_stairs",
            WeatheringCopper.WeatherState.UNAFFECTED,Blocks.COPPER_BLOCK, Blocks.COPPER_BLOCK);
    public static final Block EXPOSED_COPPER_STAIRS = registerOxidStairs("exposed_copper_stairs",
            WeatheringCopper.WeatherState.EXPOSED,Blocks.EXPOSED_COPPER, Blocks.EXPOSED_COPPER);
    public static final Block WEATHERED_COPPER_STAIRS = registerOxidStairs("weathered_copper_stairs",
            WeatheringCopper.WeatherState.WEATHERED,Blocks.WEATHERED_COPPER, Blocks.WEATHERED_COPPER);
    public static final Block OXIDIZED_COPPER_STAIRS = registerOxidStairs("oxidized_copper_stairs",
            WeatheringCopper.WeatherState.OXIDIZED,Blocks.OXIDIZED_COPPER, Blocks.OXIDIZED_COPPER);
    public static final Block WAXED_COPPER_STAIRS = registerStairs("waxed_copper_stairs",
            Blocks.WAXED_COPPER_BLOCK, Blocks.WAXED_COPPER_BLOCK);
    public static final Block WAXED_EXPOSED_COPPER_STAIRS = registerStairs("waxed_exposed_copper_stairs",
            Blocks.WAXED_EXPOSED_COPPER, Blocks.WAXED_EXPOSED_COPPER);
    public static final Block WAXED_WEATHERED_COPPER_STAIRS = registerStairs("waxed_weathered_copper_stairs",
            Blocks.WAXED_WEATHERED_COPPER, Blocks.WAXED_WEATHERED_COPPER);
    public static final Block WAXED_OXIDIZED_COPPER_STAIRS = registerStairs("waxed_oxidized_copper_stairs",
            Blocks.WAXED_OXIDIZED_COPPER, Blocks.WAXED_OXIDIZED_COPPER);
    public static final Block GOLD_STAIRS = registerStairs("gold_stairs",
            Blocks.GOLD_BLOCK, Blocks.GOLD_BLOCK);

    public static final Block OAK_WOOD_STAIRS = registerWoodStairs("oak_wood_stairs",
            Blocks.OAK_PLANKS, Blocks.OAK_PLANKS, MapColor.DIRT);
    public static final Block SPRUCE_WOOD_STAIRS = registerWoodStairs("spruce_wood_stairs",
            Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS, MapColor.COLOR_BROWN);
    public static final Block BIRCH_WOOD_STAIRS = registerWoodStairs("birch_wood_stairs",
            Blocks.BIRCH_PLANKS, Blocks.BIRCH_PLANKS, MapColor.QUARTZ);
    public static final Block JUNGLE_WOOD_STAIRS = registerWoodStairs("jungle_wood_stairs",
            Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_PLANKS, MapColor.DIRT);
    public static final Block ACACIA_WOOD_STAIRS = registerWoodStairs("acacia_wood_stairs",
            Blocks.ACACIA_PLANKS, Blocks.ACACIA_PLANKS, MapColor.STONE);
    public static final Block DARK_OAK_WOOD_STAIRS = registerStairs("dark_oak_wood_stairs",
            Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_PLANKS);
    public static final Block MANGROVE_WOOD_STAIRS = registerWoodStairs("mangrove_wood_stairs",
            Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_PLANKS, MapColor.DIRT);
    public static final Block CHERRY_WOOD_STAIRS = registerWoodStairs("cherry_wood_stairs",
            Blocks.CHERRY_PLANKS, Blocks.CHERRY_PLANKS, MapColor.TERRACOTTA_GRAY);
    public static final Block PALE_OAK_WOOD_STAIRS = registerWoodStairs("pale_oak_wood_stairs",
            Blocks.PALE_OAK_PLANKS, Blocks.PALE_OAK_PLANKS, MapColor.STONE);
    public static final Block CRIMSON_HYPHAE_STAIRS = registerWoodStairs("crimson_hyphae_stairs",
            Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_PLANKS, MapColor.CRIMSON_HYPHAE);
    public static final Block WARPED_HYPHAE_STAIRS = registerWoodStairs("warped_hyphae_stairs",
            Blocks.WARPED_PLANKS, Blocks.WARPED_PLANKS, MapColor.WARPED_HYPHAE);
    public static final Block WOODEN_WOOD_STAIRS = registerWoodStairs("wooden_wood_stairs",
            DecoBlocks.WOODEN_PLANKS, DecoBlocks.WOODEN_PLANKS, MapColor.TERRACOTTA_BROWN);
    public static final Block IRON_CAP_HYPHAE_STAIRS = registerWoodStairs("iron_cap_hyphae_stairs",
            DecoBlocks.IRON_CAP_PLANKS, DecoBlocks.IRON_CAP_PLANKS, MapColor.TERRACOTTA_GRAY);
    public static final Block DRIFTWOOD_LOG_STAIRS = registerWoodStairs("driftwood_log_stairs",
            DecoBlocks.DRIFTWOOD_PLANKS, DecoBlocks.DRIFTWOOD_PLANKS, MapColor.COLOR_LIGHT_BLUE);
    public static final Block DRIED_DRIFTWOOD_STAIRS = registerWoodStairs("dried_driftwood_stairs",
            DecoBlocks.DRIFTWOOD_PLANKS, DecoBlocks.DRIFTWOOD_PLANKS, MapColor.TERRACOTTA_WHITE);

    public static final Block STRIPPED_OAK_WOOD_STAIRS = registerStairs("stripped_oak_wood_stairs",
            Blocks.OAK_PLANKS, Blocks.OAK_PLANKS);
    public static final Block STRIPPED_SPRUCE_WOOD_STAIRS = registerStairs("stripped_spruce_wood_stairs",
            Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS);
    public static final Block STRIPPED_BIRCH_WOOD_STAIRS = registerStairs("stripped_birch_wood_stairs",
            Blocks.BIRCH_PLANKS, Blocks.BIRCH_PLANKS);
    public static final Block STRIPPED_JUNGLE_WOOD_STAIRS = registerStairs("stripped_jungle_wood_stairs",
            Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_PLANKS);
    public static final Block STRIPPED_ACACIA_WOOD_STAIRS = registerStairs("stripped_acacia_wood_stairs",
            Blocks.ACACIA_PLANKS, Blocks.ACACIA_PLANKS);
    public static final Block STRIPPED_DARK_OAK_WOOD_STAIRS = registerStairs("stripped_dark_oak_wood_stairs",
            Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_PLANKS);
    public static final Block STRIPPED_MANGROVE_WOOD_STAIRS = registerStairs("stripped_mangrove_wood_stairs",
            Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_PLANKS);
    public static final Block STRIPPED_CHERRY_WOOD_STAIRS = registerStairs("stripped_cherry_wood_stairs",
            Blocks.CHERRY_PLANKS, Blocks.CHERRY_PLANKS);
    public static final Block STRIPPED_PALE_OAK_WOOD_STAIRS = registerStairs("stripped_pale_oak_wood_stairs",
            Blocks.PALE_OAK_PLANKS, Blocks.PALE_OAK_PLANKS);
    public static final Block STRIPPED_CRIMSON_HYPHAE_STAIRS = registerStairs("stripped_crimson_hyphae_stairs",
            Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_PLANKS);
    public static final Block STRIPPED_WARPED_HYPHAE_STAIRS = registerStairs("stripped_warped_hyphae_stairs",
            Blocks.WARPED_PLANKS, Blocks.WARPED_PLANKS);
    public static final Block STRIPPED_WOODEN_WOOD_STAIRS = registerStairs("stripped_wooden_wood_stairs",
            DecoBlocks.WOODEN_PLANKS, DecoBlocks.WOODEN_PLANKS);
    public static final Block STRIPPED_IRON_CAP_HYPHAE_STAIRS = registerStairs("stripped_iron_cap_hyphae_stairs",
            DecoBlocks.IRON_CAP_PLANKS, DecoBlocks.IRON_CAP_PLANKS);
    public static final Block STRIPPED_DRIFTWOOD_STAIRS = registerStairs("stripped_driftwood_stairs",
            DecoBlocks.DRIFTWOOD_PLANKS, DecoBlocks.DRIFTWOOD_PLANKS);
    public static final Block CUT_SANDSTONE_STAIRS = registerStairs("cut_sandstone_stairs",
            Blocks.CUT_SANDSTONE,Blocks.CUT_SANDSTONE);
    public static final Block WHITE_WOOL_STAIRS = registerStairs("white_wool_stairs",
            Blocks.WHITE_WOOL, Blocks.WHITE_WOOL);
    public static final Block ORANGE_WOOL_STAIRS = registerStairs("orange_wool_stairs",
            Blocks.ORANGE_WOOL, Blocks.ORANGE_WOOL);
    public static final Block MAGENTA_WOOL_STAIRS = registerStairs("magenta_wool_stairs",
            Blocks.MAGENTA_WOOL, Blocks.MAGENTA_WOOL);
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerStairs("light_blue_wool_stairs",
            Blocks.LIGHT_BLUE_WOOL, Blocks.LIGHT_BLUE_WOOL);
    public static final Block YELLOW_WOOL_STAIRS = registerStairs("yellow_wool_stairs",
            Blocks.YELLOW_WOOL, Blocks.YELLOW_WOOL);
    public static final Block LIME_WOOL_STAIRS = registerStairs("lime_wool_stairs",
            Blocks.LIME_WOOL, Blocks.LIME_WOOL);
    public static final Block PINK_WOOL_STAIRS = registerStairs("pink_wool_stairs",
            Blocks.PINK_WOOL, Blocks.PINK_WOOL);
    public static final Block GRAY_WOOL_STAIRS = registerStairs("gray_wool_stairs",
            Blocks.GRAY_WOOL, Blocks.GRAY_WOOL);
    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerStairs("light_gray_wool_stairs",
            Blocks.LIGHT_GRAY_WOOL, Blocks.LIGHT_GRAY_WOOL);
    public static final Block CYAN_WOOL_STAIRS = registerStairs("cyan_wool_stairs",
            Blocks.CYAN_WOOL, Blocks.CYAN_WOOL);
    public static final Block PURPLE_WOOL_STAIRS = registerStairs("purple_wool_stairs",
            Blocks.PURPLE_WOOL, Blocks.PURPLE_WOOL);
    public static final Block BLUE_WOOL_STAIRS = registerStairs("blue_wool_stairs",
            Blocks.BLUE_WOOL, Blocks.BLUE_WOOL);
    public static final Block BROWN_WOOL_STAIRS = registerStairs("brown_wool_stairs",
            Blocks.BROWN_WOOL, Blocks.BROWN_WOOL);
    public static final Block GREEN_WOOL_STAIRS = registerStairs("green_wool_stairs",
            Blocks.GREEN_WOOL, Blocks.GREEN_WOOL);
    public static final Block RED_WOOL_STAIRS = registerStairs("red_wool_stairs",
            Blocks.RED_WOOL, Blocks.RED_WOOL);
    public static final Block BLACK_WOOL_STAIRS = registerStairs("black_wool_stairs",
            Blocks.BLACK_WOOL, Blocks.BLACK_WOOL);
    public static final Block SMOOTH_STONE_STAIRS = registerStairs("smooth_stone_stairs",
            Blocks.SMOOTH_STONE,Blocks.SMOOTH_STONE);
    public static final Block OBSIDIAN_STAIRS = registerStairs("obsidian_stairs",
            Blocks.OBSIDIAN,Blocks.OBSIDIAN);
    public static final Block SNOW_STAIRS = registerStairs("snow_stairs",
            Blocks.SNOW_BLOCK,Blocks.SNOW_BLOCK);
    public static final Block CLAY_STAIRS = registerStairs("clay_stairs",
            Blocks.CLAY, Blocks.CLAY);
    public static final Block NETHERRACK_STAIRS = registerStairs("netherrack_stairs",
            Blocks.NETHERRACK,Blocks.NETHERRACK);
    public static final Block SMOOTH_BASALT_STAIRS = registerStairs("smooth_basalt_stairs",
            Blocks.SMOOTH_BASALT,Blocks.SMOOTH_BASALT);
    public static final Block CRACKED_STONE_BRICK_STAIRS = registerStairs("cracked_stone_brick_stairs",
            Blocks.CRACKED_STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS);
    public static final Block PACKED_MUD_STAIRS = registerStairs("packed_mud_stairs",
            Blocks.PACKED_MUD,Blocks.PACKED_MUD);
    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerStairs("cracked_deepslate_brick_stairs",
            Blocks.CRACKED_DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerStairs("cracked_deepslate_tile_stairs",
            Blocks.CRACKED_DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES);
    public static final Block MYCELIUM_STAIRS = registerStairs("mycelium_stairs",
            DecoBlocks.PACKED_MYCELIUM, DecoBlocks.PACKED_MYCELIUM);
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerStairs("cracked_nether_brick_stairs",
            Blocks.CRACKED_NETHER_BRICKS, Blocks.CRACKED_NETHER_BRICKS);
    public static final Block QUARTZ_BRICK_STAIRS = registerStairs("quartz_brick_stairs",
            Blocks.QUARTZ_BRICKS,Blocks.QUARTZ_BRICKS);
    public static final Block END_STONE_STAIRS = registerStairs("end_stone_stairs",
            Blocks.END_STONE,Blocks.END_STONE);
    public static final Block WHITE_TERRACOTTA_STAIRS = registerStairs("white_terracotta_stairs",
            Blocks.WHITE_TERRACOTTA,Blocks.WHITE_TERRACOTTA);
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerStairs("orange_terracotta_stairs",
            Blocks.ORANGE_TERRACOTTA,Blocks.ORANGE_TERRACOTTA);
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerStairs("magenta_terracotta_stairs",
            Blocks.MAGENTA_TERRACOTTA,Blocks.MAGENTA_TERRACOTTA);
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerStairs("light_blue_terracotta_stairs",
            Blocks.LIGHT_BLUE_TERRACOTTA,Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerStairs("yellow_terracotta_stairs",
            Blocks.YELLOW_TERRACOTTA,Blocks.YELLOW_TERRACOTTA);
    public static final Block LIME_TERRACOTTA_STAIRS = registerStairs("lime_terracotta_stairs",
            Blocks.LIME_TERRACOTTA,Blocks.LIME_TERRACOTTA);
    public static final Block PINK_TERRACOTTA_STAIRS = registerStairs("pink_terracotta_stairs",
            Blocks.PINK_TERRACOTTA,Blocks.PINK_TERRACOTTA);
    public static final Block GRAY_TERRACOTTA_STAIRS = registerStairs("gray_terracotta_stairs",
            Blocks.GRAY_TERRACOTTA,Blocks.GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerStairs("light_gray_terracotta_stairs",
            Blocks.LIGHT_GRAY_TERRACOTTA,Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final Block CYAN_TERRACOTTA_STAIRS = registerStairs("cyan_terracotta_stairs",
            Blocks.CYAN_TERRACOTTA,Blocks.CYAN_TERRACOTTA);
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerStairs("purple_terracotta_stairs",
            Blocks.PURPLE_TERRACOTTA,Blocks.PURPLE_TERRACOTTA);
    public static final Block BLUE_TERRACOTTA_STAIRS = registerStairs("blue_terracotta_stairs",
            Blocks.BLUE_TERRACOTTA,Blocks.BLUE_TERRACOTTA);
    public static final Block BROWN_TERRACOTTA_STAIRS = registerStairs("brown_terracotta_stairs",
            Blocks.BROWN_TERRACOTTA,Blocks.BROWN_TERRACOTTA);
    public static final Block GREEN_TERRACOTTA_STAIRS = registerStairs("green_terracotta_stairs",
            Blocks.GREEN_TERRACOTTA,Blocks.GREEN_TERRACOTTA);
    public static final Block RED_TERRACOTTA_STAIRS = registerStairs("red_terracotta_stairs",
            Blocks.RED_TERRACOTTA,Blocks.RED_TERRACOTTA);
    public static final Block BLACK_TERRACOTTA_STAIRS = registerStairs("black_terracotta_stairs",
            Blocks.BLACK_TERRACOTTA,Blocks.BLACK_TERRACOTTA);
    public static final Block TERRACOTTA_STAIRS = registerStairs("terracotta_stairs",
            Blocks.TERRACOTTA,Blocks.TERRACOTTA);
    public static final Block PACKED_ICE_STAIRS = registerStairs("packed_ice_stairs",
            Blocks.PACKED_ICE,Blocks.PACKED_ICE);
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerStairs("cut_red_sandstone_stairs",
            Blocks.CUT_RED_SANDSTONE,Blocks.CUT_RED_SANDSTONE);
    public static final Block MAGMA_STAIRS = registerMagmaStairs("magma_stairs",
            Blocks.MAGMA_BLOCK, Blocks.MAGMA_BLOCK);
    public static final Block BONE_STAIRS = registerStairs("bone_stairs",
            Blocks.BONE_BLOCK, Blocks.BONE_BLOCK);
    public static final Block WHITE_CONCRETE_STAIRS = registerStairs("white_concrete_stairs",
            Blocks.WHITE_CONCRETE,Blocks.WHITE_CONCRETE);
    public static final Block ORANGE_CONCRETE_STAIRS = registerStairs("orange_concrete_stairs",
            Blocks.ORANGE_CONCRETE,Blocks.ORANGE_CONCRETE);
    public static final Block MAGENTA_CONCRETE_STAIRS = registerStairs("magenta_concrete_stairs",
            Blocks.MAGENTA_CONCRETE,Blocks.MAGENTA_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerStairs("light_blue_concrete_stairs",
            Blocks.LIGHT_BLUE_CONCRETE,Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block YELLOW_CONCRETE_STAIRS = registerStairs("yellow_concrete_stairs",
            Blocks.YELLOW_CONCRETE,Blocks.YELLOW_CONCRETE);
    public static final Block LIME_CONCRETE_STAIRS = registerStairs("lime_concrete_stairs",
            Blocks.LIME_CONCRETE,Blocks.LIME_CONCRETE);
    public static final Block PINK_CONCRETE_STAIRS = registerStairs("pink_concrete_stairs",
            Blocks.PINK_CONCRETE,Blocks.PINK_CONCRETE);
    public static final Block GRAY_CONCRETE_STAIRS = registerStairs("gray_concrete_stairs",
            Blocks.GRAY_CONCRETE,Blocks.GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerStairs("light_gray_concrete_stairs",
            Blocks.LIGHT_GRAY_CONCRETE,Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block CYAN_CONCRETE_STAIRS = registerStairs("cyan_concrete_stairs",
            Blocks.CYAN_CONCRETE,Blocks.CYAN_CONCRETE);
    public static final Block PURPLE_CONCRETE_STAIRS = registerStairs("purple_concrete_stairs",
            Blocks.PURPLE_CONCRETE,Blocks.PURPLE_CONCRETE);
    public static final Block BLUE_CONCRETE_STAIRS = registerStairs("blue_concrete_stairs",
            Blocks.BLUE_CONCRETE,Blocks.BLUE_CONCRETE);
    public static final Block BROWN_CONCRETE_STAIRS = registerStairs("brown_concrete_stairs",
            Blocks.BROWN_CONCRETE,Blocks.BROWN_CONCRETE);
    public static final Block GREEN_CONCRETE_STAIRS = registerStairs("green_concrete_stairs",
            Blocks.GREEN_CONCRETE,Blocks.GREEN_CONCRETE);
    public static final Block RED_CONCRETE_STAIRS = registerStairs("red_concrete_stairs",
            Blocks.RED_CONCRETE,Blocks.RED_CONCRETE);
    public static final Block BLACK_CONCRETE_STAIRS = registerStairs("black_concrete_stairs",
            Blocks.BLACK_CONCRETE,Blocks.BLACK_CONCRETE);
    public static final Block BLUE_ICE_STAIRS = registerStairs("blue_ice_stairs",
            Blocks.BLUE_ICE,Blocks.BLUE_ICE);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerStairs("cracked_polished_blackstone_brick_stairs",
            Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,
                    Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final Block MOSS_STAIRS = registerStairs("moss_stairs",
            Blocks.MOSS_BLOCK, Blocks.MOSS_BLOCK);
    public static final Block PALE_MOSS_STAIRS = registerStairs("pale_moss_stairs",
            Blocks.PALE_MOSS_BLOCK, Blocks.PALE_MOSS_BLOCK);
    public static final Block BAMBOO_BLOCK_STAIRS = registerWoodStairs("bamboo_block_stairs",
            Blocks.BAMBOO_PLANKS,Blocks.BAMBOO_PLANKS, MapColor.PLANT);
    public static final Block STRIPPED_BAMBOO_STAIRS = registerStairs("stripped_bamboo_stairs",
            Blocks.BAMBOO_PLANKS,Blocks.BAMBOO_PLANKS);

    public static final Block CUT_GRANITE_STAIRS = registerStairs("cut_granite_stairs",
            DecoBlocks.CUT_GRANITE, DecoBlocks.CUT_GRANITE);
    public static final Block GRANITE_BRICK_STAIRS = registerStairs("granite_brick_stairs",
            DecoBlocks.GRANITE_BRICKS, DecoBlocks.GRANITE_BRICKS);
    public static final Block CUT_DIORITE_STAIRS = registerStairs("cut_diorite_stairs",
            DecoBlocks.CUT_DIORITE, DecoBlocks.CUT_DIORITE);
    public static final Block DIORITE_BRICK_STAIRS = registerStairs("diorite_brick_stairs",
            DecoBlocks.DIORITE_BRICKS, DecoBlocks.DIORITE_BRICKS);
    public static final Block CUT_ANDESITE_STAIRS = registerStairs("cut_andesite_stairs",
            DecoBlocks.CUT_ANDESITE, DecoBlocks.CUT_ANDESITE);
    public static final Block ANDESITE_BRICK_STAIRS = registerStairs("andesite_brick_stairs",
            DecoBlocks.ANDESITE_BRICKS, DecoBlocks.ANDESITE_BRICKS);
    public static final Block POLISHED_CALCITE_STAIRS = registerStairs("polished_calcite_stairs",
            DecoBlocks.POLISHED_CALCITE, DecoBlocks.POLISHED_CALCITE);
    public static final Block CUT_CALCITE_STAIRS = registerStairs("cut_calcite_stairs",
            DecoBlocks.CUT_CALCITE, DecoBlocks.CUT_CALCITE);
    public static final Block CALCITE_BRICK_STAIRS = registerStairs("calcite_brick_stairs",
            DecoBlocks.CALCITE_BRICKS, DecoBlocks.CALCITE_BRICKS);
    public static final Block POLISHED_STONE_STAIRS = registerStairs("polished_stone_stairs",
            DecoBlocks.POLISHED_STONE,DecoBlocks.POLISHED_STONE);
    public static final Block STONE_TILE_STAIRS = registerStairs("stone_tile_stairs",
            DecoBlocks.STONE_TILES,DecoBlocks.STONE_TILES);
    public static final Block CACTUS_PLANK_STAIRS = registerStairs("cactus_plank_stairs",
            DecoBlocks.CACTUS_PLANKS,DecoBlocks.CACTUS_PLANKS);
    public static final Block MUSHROOM_STAIRS = registerStairs("mushroom_stairs",
            DecoBlocks.MUSHROOM_PLANKS, DecoBlocks.MUSHROOM_PLANKS);
    public static final Block IRON_CAP_STAIRS = registerStairs("iron_cap_stairs",
            DecoBlocks.IRON_CAP_PLANKS, DecoBlocks.IRON_CAP_PLANKS);
    public static final Block WOODEN_STAIRS = registerStairs("wooden_stairs",
            DecoBlocks.WOODEN_PLANKS,DecoBlocks.WOODEN_PLANKS);
    public static final Block DRIFTWOOD_STAIRS = registerStairs("driftwood_stairs",
            DecoBlocks.DRIFTWOOD_PLANKS,DecoBlocks.DRIFTWOOD_PLANKS);
    public static final Block CUT_SANDSTONE_BRICK_STAIRS = registerStairs("cut_sandstone_brick_stairs",
            DecoBlocks.CUT_SANDSTONE_BRICKS,DecoBlocks.CUT_SANDSTONE_BRICKS);
    public static final Block COBBLED_SANDSTONE_STAIRS = registerStairs("cobbled_sandstone_stairs",
            DecoBlocks.COBBLED_SANDSTONE,DecoBlocks.COBBLED_SANDSTONE);
    public static final Block POLISHED_SANDSTONE_STAIRS = registerStairs("polished_sandstone_stairs",
            DecoBlocks.POLISHED_SANDSTONE,DecoBlocks.POLISHED_SANDSTONE);
    public static final Block SANDSTONE_BRICK_STAIRS = registerStairs("sandstone_brick_stairs",
            DecoBlocks.SANDSTONE_BRICKS,DecoBlocks.SANDSTONE_BRICKS);
    public static final Block SMOOTH_OBSIDIAN_STAIRS = registerStairs("smooth_obsidian_stairs",
            DecoBlocks.SMOOTH_OBSIDIAN, DecoBlocks.SMOOTH_OBSIDIAN);
    public static final Block SMOOTH_PURPUR_STAIRS = registerStairs("smooth_purpur_stairs",
            DecoBlocks.SMOOTH_PURPUR,DecoBlocks.SMOOTH_PURPUR);
    public static final Block SMOOTH_DEEPSLATE_STAIRS = registerStairs("smooth_deepslate_stairs",
            DecoBlocks.SMOOTH_DEEPSLATE,DecoBlocks.SMOOTH_DEEPSLATE);
    public static final Block SMOOTH_BLACKSTONE_STAIRS = registerStairs("smooth_blackstone_stairs",
            DecoBlocks.SMOOTH_BLACKSTONE,DecoBlocks.SMOOTH_BLACKSTONE);
    public static final Block SMOOTH_TUFF_STAIRS = registerStairs("smooth_tuff_stairs",
            DecoBlocks.SMOOTH_TUFF,DecoBlocks.SMOOTH_TUFF);
    public static final Block SMOOTH_END_STONE_STAIRS = registerStairs("smooth_end_stone_stairs",
            DecoBlocks.SMOOTH_END_STONE, DecoBlocks.SMOOTH_END_STONE);
    public static final Block SANDED_OBSIDIAN_STAIRS = registerStairs("sanded_obsidian_stairs",
            DecoBlocks.SANDED_OBSIDIAN, DecoBlocks.SANDED_OBSIDIAN);
    public static final Block OBSIDIAN_BRICK_STAIRS = registerStairs("obsidian_brick_stairs",
            DecoBlocks.OBSIDIAN_BRICKS,DecoBlocks.OBSIDIAN_BRICKS);
    public static final Block CUT_OBSIDIAN_STAIRS = registerStairs("cut_obsidian_stairs",
            DecoBlocks.CUT_OBSIDIAN, DecoBlocks.CUT_OBSIDIAN);
    public static final Block PURPUR_BRICK_STAIRS = registerStairs("purpur_brick_stairs",
            DecoBlocks.PURPUR_BRICKS,DecoBlocks.PURPUR_BRICKS);
    public static final Block CUT_PURPUR_STAIRS = registerStairs("cut_purpur_stairs",
            DecoBlocks.CUT_PURPUR, DecoBlocks.CUT_PURPUR);
    public static final Block SNOW_BRICK_STAIRS = registerStairs("snow_brick_stairs",
            DecoBlocks.SNOW_BRICKS,DecoBlocks.SNOW_BRICKS);
    public static final Block PACKED_NETHERRACK_STAIRS = registerStairs("packed_netherrack_stairs",
            DecoBlocks.PACKED_NETHERRACK, DecoBlocks.PACKED_NETHERRACK);
    public static final Block NETHERRACK_BRICK_STAIRS = registerStairs("netherrack_brick_stairs",
            DecoBlocks.NETHERRACK_BRICKS, DecoBlocks.NETHERRACK_BRICKS);
    public static final Block POLISHED_END_STONE_STAIRS = registerStairs("polished_end_stone_stairs",
            DecoBlocks.POLISHED_END_STONE, DecoBlocks.POLISHED_END_STONE);
    public static final Block END_STONE_TILE_STAIRS = registerStairs("end_stone_tile_stairs",
            DecoBlocks.END_STONE_TILES, DecoBlocks.END_STONE_TILES);
    public static final Block VOID_STONE_STAIRS = registerStairs("void_stone_stairs",
            DecoBlocks.VOID_STONE,DecoBlocks.VOID_STONE);
    public static final Block VOID_STONE_BRICK_STAIRS = registerStairs("void_stone_brick_stairs",
            DecoBlocks.VOID_STONE_BRICKS,DecoBlocks.VOID_STONE_BRICKS);
    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = registerStairs("white_terracotta_brick_stairs",
            DecoBlocks.WHITE_TERRACOTTA_BRICKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS);
    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = registerStairs("orange_terracotta_brick_stairs",
            DecoBlocks.ORANGE_TERRACOTTA_BRICKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = registerStairs("magenta_terracotta_brick_stairs",
            DecoBlocks.MAGENTA_TERRACOTTA_BRICKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerStairs("light_blue_terracotta_brick_stairs",
            DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = registerStairs("yellow_terracotta_brick_stairs",
            DecoBlocks.YELLOW_TERRACOTTA_BRICKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = registerStairs("lime_terracotta_brick_stairs",
            DecoBlocks.LIME_TERRACOTTA_BRICKS,DecoBlocks.LIME_TERRACOTTA_BRICKS);
    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = registerStairs("pink_terracotta_brick_stairs",
            DecoBlocks.PINK_TERRACOTTA_BRICKS,DecoBlocks.PINK_TERRACOTTA_BRICKS);
    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = registerStairs("gray_terracotta_brick_stairs",
            DecoBlocks.GRAY_TERRACOTTA_BRICKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerStairs("light_gray_terracotta_brick_stairs",
            DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = registerStairs("cyan_terracotta_brick_stairs",
            DecoBlocks.CYAN_TERRACOTTA_BRICKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS);
    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = registerStairs("purple_terracotta_brick_stairs",
            DecoBlocks.PURPLE_TERRACOTTA_BRICKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = registerStairs("blue_terracotta_brick_stairs",
            DecoBlocks.BLUE_TERRACOTTA_BRICKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS);
    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = registerStairs("brown_terracotta_brick_stairs",
            DecoBlocks.BROWN_TERRACOTTA_BRICKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS);
    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = registerStairs("green_terracotta_brick_stairs",
            DecoBlocks.GREEN_TERRACOTTA_BRICKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS);
    public static final Block RED_TERRACOTTA_BRICK_STAIRS = registerStairs("red_terracotta_brick_stairs",
            DecoBlocks.RED_TERRACOTTA_BRICKS,DecoBlocks.RED_TERRACOTTA_BRICKS);
    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = registerStairs("black_terracotta_brick_stairs",
            DecoBlocks.BLACK_TERRACOTTA_BRICKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS);
    public static final Block TERRACOTTA_BRICK_STAIRS = registerStairs("terracotta_brick_stairs",
            DecoBlocks.TERRACOTTA_BRICKS,DecoBlocks.TERRACOTTA_BRICKS);
    public static final Block SOUL_SOILSTONE_STAIRS = registerStairs("soul_soilstone_stairs",
            DecoBlocks.SOUL_SOILSTONE,DecoBlocks.SOUL_SOILSTONE);
    public static final Block CUT_SOUL_SOILSTONE_STAIRS = registerStairs("cut_soul_soilstone_stairs",
            DecoBlocks.CUT_SOUL_SOILSTONE,DecoBlocks.CUT_SOUL_SOILSTONE);
    public static final Block SMOOTH_SOUL_SOILSTONE_STAIRS = registerStairs("smooth_soul_soilstone_stairs",
            DecoBlocks.SMOOTH_SOUL_SOILSTONE,DecoBlocks.SMOOTH_SOUL_SOILSTONE);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_STAIRS = registerStairs("cut_soul_soilstone_brick_stairs",
            DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
    public static final Block COBBLED_SOUL_SOILSTONE_STAIRS = registerStairs("cobbled_soul_soilstone_stairs",
            DecoBlocks.COBBLED_SOUL_SOILSTONE,DecoBlocks.COBBLED_SOUL_SOILSTONE);
    public static final Block POLISHED_SOUL_SOILSTONE_STAIRS = registerStairs("polished_soul_soilstone_stairs",
            DecoBlocks.POLISHED_SOUL_SOILSTONE,DecoBlocks.POLISHED_SOUL_SOILSTONE);
    public static final Block SOUL_SOILSTONE_BRICK_STAIRS = registerStairs("soul_soilstone_brick_stairs",
            DecoBlocks.SOUL_SOILSTONE_BRICKS,DecoBlocks.SOUL_SOILSTONE_BRICKS);
    public static final Block CUT_QUARTZ_STAIRS = registerStairs("cut_quartz_stairs",
            DecoBlocks.CUT_QUARTZ,DecoBlocks.CUT_QUARTZ);
    public static final Block ICE_BRICK_STAIRS = registerStairs("ice_brick_stairs",
            DecoBlocks.ICE_BRICKS,DecoBlocks.ICE_BRICKS);
    public static final Block CUT_WHITE_CONCRETE_STAIRS = registerStairs("cut_white_concrete_stairs",
            DecoBlocks.CUT_WHITE_CONCRETE,DecoBlocks.CUT_WHITE_CONCRETE);
    public static final Block CUT_ORANGE_CONCRETE_STAIRS = registerStairs("cut_orange_concrete_stairs",
            DecoBlocks.CUT_ORANGE_CONCRETE,DecoBlocks.CUT_ORANGE_CONCRETE);
    public static final Block CUT_MAGENTA_CONCRETE_STAIRS = registerStairs("cut_magenta_concrete_stairs",
            DecoBlocks.CUT_MAGENTA_CONCRETE,DecoBlocks.CUT_MAGENTA_CONCRETE);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_STAIRS = registerStairs("cut_light_blue_concrete_stairs",
            DecoBlocks.CUT_LIGHT_BLUE_CONCRETE,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
    public static final Block CUT_YELLOW_CONCRETE_STAIRS = registerStairs("cut_yellow_concrete_stairs",
            DecoBlocks.CUT_YELLOW_CONCRETE,DecoBlocks.CUT_YELLOW_CONCRETE);
    public static final Block CUT_LIME_CONCRETE_STAIRS = registerStairs("cut_lime_concrete_stairs",
            DecoBlocks.CUT_LIME_CONCRETE,DecoBlocks.CUT_LIME_CONCRETE);
    public static final Block CUT_PINK_CONCRETE_STAIRS = registerStairs("cut_pink_concrete_stairs",
            DecoBlocks.CUT_PINK_CONCRETE,DecoBlocks.CUT_PINK_CONCRETE);
    public static final Block CUT_GRAY_CONCRETE_STAIRS = registerStairs("cut_gray_concrete_stairs",
            DecoBlocks.CUT_GRAY_CONCRETE,DecoBlocks.CUT_GRAY_CONCRETE);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_STAIRS = registerStairs("cut_light_gray_concrete_stairs",
            DecoBlocks.CUT_LIGHT_GRAY_CONCRETE,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
    public static final Block CUT_CYAN_CONCRETE_STAIRS = registerStairs("cut_cyan_concrete_stairs",
            DecoBlocks.CUT_CYAN_CONCRETE,DecoBlocks.CUT_CYAN_CONCRETE);
    public static final Block CUT_PURPLE_CONCRETE_STAIRS = registerStairs("cut_purple_concrete_stairs",
            DecoBlocks.CUT_PURPLE_CONCRETE,DecoBlocks.CUT_PURPLE_CONCRETE);
    public static final Block CUT_BLUE_CONCRETE_STAIRS = registerStairs("cut_blue_concrete_stairs",
            DecoBlocks.CUT_BLUE_CONCRETE,DecoBlocks.CUT_BLUE_CONCRETE);
    public static final Block CUT_BROWN_CONCRETE_STAIRS = registerStairs("cut_brown_concrete_stairs",
            DecoBlocks.CUT_BROWN_CONCRETE,DecoBlocks.CUT_BROWN_CONCRETE);
    public static final Block CUT_GREEN_CONCRETE_STAIRS = registerStairs("cut_green_concrete_stairs",
            DecoBlocks.CUT_GREEN_CONCRETE,DecoBlocks.CUT_GREEN_CONCRETE);
    public static final Block CUT_RED_CONCRETE_STAIRS = registerStairs("cut_red_concrete_stairs",
            DecoBlocks.CUT_RED_CONCRETE,DecoBlocks.CUT_RED_CONCRETE);
    public static final Block CUT_BLACK_CONCRETE_STAIRS = registerStairs("cut_black_concrete_stairs",
            DecoBlocks.CUT_BLACK_CONCRETE,DecoBlocks.CUT_BLACK_CONCRETE);
    public static final Block CRYSTALLIZED_PRISMARINE_STAIRS = registerStairs("crystallized_prismarine_stairs",
            DecoBlocks.CRYSTALLIZED_PRISMARINE,DecoBlocks.CRYSTALLIZED_PRISMARINE);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_STAIRS = registerStairs("crystallized_prismarine_brick_stairs",
            DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
    public static final Block LIGHT_PRISMARINE_STAIRS = registerStairs("light_prismarine_stairs",
            DecoBlocks.LIGHT_PRISMARINE,DecoBlocks.LIGHT_PRISMARINE);
    public static final Block CUT_RED_SANDSTONE_BRICK_STAIRS = registerStairs("cut_red_sandstone_brick_stairs",
            DecoBlocks.CUT_RED_SANDSTONE_BRICKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
    public static final Block MAGMA_BRICK_STAIRS = registerMagmaBrickStairs("magma_brick_stairs",
            DecoBlocks.MAGMA_BRICKS,DecoBlocks.MAGMA_BRICKS);
    public static final Block BUBBLE_STAIRS = registerBubbleStairs("bubble_stairs",
            DecoBlocks.BUBBLE_BLOCK,DecoBlocks.BUBBLE_BLOCK);
    public static final Block BUBBLE_BRICK_STAIRS = registerBubbleStairs("bubble_brick_stairs",
            DecoBlocks.BUBBLE_BRICKS,DecoBlocks.BUBBLE_BRICKS);
    public static final Block WIND_STAIRS = registerStairs("wind_stairs",
            DecoBlocks.WIND_BLOCK, DecoBlocks.WIND_BLOCK);
    public static final Block WIND_BRICK_STAIRS = registerStairs("wind_brick_stairs",
            DecoBlocks.WIND_BRICKS, DecoBlocks.WIND_BRICKS);
    public static final Block EARTH_STAIRS = registerStairs("earth_stairs",
            DecoBlocks.EARTH_BLOCK, DecoBlocks.EARTH_BLOCK);
    public static final Block EARTH_BRICK_STAIRS = registerStairs("earth_brick_stairs",
            DecoBlocks.EARTH_BRICKS, DecoBlocks.EARTH_BRICKS);
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerStairs("blue_nether_brick_stairs",
            DecoBlocks.BLUE_NETHER_BRICKS,DecoBlocks.BLUE_NETHER_BRICKS);
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerStairs("polished_blackstone_tile_stairs",
            DecoBlocks.POLISHED_BLACKSTONE_TILES,DecoBlocks.POLISHED_BLACKSTONE_TILES);
    public static final Block TUFF_TILE_STAIRS = registerStairs("tuff_tile_stairs",
            DecoBlocks.TUFF_TILES, DecoBlocks.TUFF_TILES);
    public static final Block COBBLED_RED_SANDSTONE_STAIRS = registerStairs("cobbled_red_sandstone_stairs",
            DecoBlocks.COBBLED_RED_SANDSTONE, DecoBlocks.COBBLED_RED_SANDSTONE);
    public static final Block POLISHED_RED_SANDSTONE_STAIRS = registerStairs("polished_red_sandstone_stairs",
            DecoBlocks.POLISHED_RED_SANDSTONE, DecoBlocks.POLISHED_RED_SANDSTONE);
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerStairs("red_sandstone_brick_stairs",
            DecoBlocks.RED_SANDSTONE_BRICKS, DecoBlocks.RED_SANDSTONE_BRICKS);

    public static final Block CRACKED_STONE_TILE_STAIRS = registerStairs("cracked_stone_tile_stairs",
            DecoBlocks.CRACKED_STONE_TILES, DecoBlocks.CRACKED_STONE_TILES);
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS = registerStairs("cracked_polished_blackstone_tile_stairs",
            DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
    public static final Block CRACKED_END_STONE_BRICK_STAIRS = registerStairs("cracked_end_stone_brick_stairs",
            DecoBlocks.CRACKED_END_STONE_BRICKS, DecoBlocks.CRACKED_END_STONE_BRICKS);
    public static final Block CRACKED_END_STONE_TILE_STAIRS = registerStairs("cracked_end_stone_tile_stairs",
            DecoBlocks.CRACKED_END_STONE_TILES, DecoBlocks.CRACKED_END_STONE_TILES);
    public static final Block CRACKED_TUFF_BRICK_STAIRS = registerStairs("cracked_tuff_brick_stairs",
            DecoBlocks.CRACKED_TUFF_BRICKS, DecoBlocks.CRACKED_TUFF_BRICKS);
    public static final Block CRACKED_TUFF_TILE_STAIRS = registerStairs("cracked_tuff_tile_stairs",
            DecoBlocks.CRACKED_TUFF_TILES, DecoBlocks.CRACKED_TUFF_TILES);
    public static final Block MOSSY_TUFF_BRICK_STAIRS = registerStairs("mossy_tuff_brick_stairs",
            DecoBlocks.MOSSY_TUFF_BRICKS,DecoBlocks.MOSSY_TUFF_BRICKS);
    public static final Block HAY_STAIRS = registerHayStairs("hay_stairs",
            Blocks.HAY_BLOCK,Blocks.HAY_BLOCK);
    public static final Block SCULK_STAIRS = registerStairs("sculk_stairs",
            Blocks.SCULK,Blocks.SCULK);
    public static final Block HONEYCOMB_STAIRS = registerStairs("honeycomb_stairs",
            Blocks.HONEYCOMB_BLOCK,Blocks.HONEYCOMB_BLOCK);
    public static final Block NETHER_WART_STAIRS = registerStairs("nether_wart_stairs",
            Blocks.NETHER_WART_BLOCK,Blocks.NETHER_WART_BLOCK);
    public static final Block WARPED_WART_STAIRS = registerStairs("warped_wart_stairs",
            Blocks.WARPED_WART_BLOCK,Blocks.WARPED_WART_BLOCK);
    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = registerStairs("mossy_deepslate_brick_stairs",
            DecoBlocks.MOSSY_DEEPSLATE_BRICKS,DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerStairs("mossy_polished_blackstone_brick_stairs",
            DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS,DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
    public static final Block MOSSY_END_STONE_BRICK_STAIRS = registerStairs("mossy_end_stone_brick_stairs",
            DecoBlocks.MOSSY_END_STONE_BRICKS,DecoBlocks.MOSSY_END_STONE_BRICKS);
    public static final Block LAPIS_STAIRS = registerStairs("lapis_stairs",
            Blocks.LAPIS_BLOCK,Blocks.LAPIS_BLOCK);
    public static final Block CUT_LAPIS_STAIRS = registerStairs("cut_lapis_stairs",
            DecoBlocks.CUT_LAPIS,DecoBlocks.CUT_LAPIS);
    public static final Block SMOOTH_LAPIS_STAIRS = registerStairs("smooth_lapis_stairs",
            DecoBlocks.SMOOTH_LAPIS,DecoBlocks.SMOOTH_LAPIS);
    public static final Block LAPIS_BRICK_STAIRS = registerStairs("lapis_brick_stairs",
            DecoBlocks.LAPIS_BRICKS,DecoBlocks.LAPIS_BRICKS);
    public static final Block DRIPSTONE_BRICK_STAIRS = registerStairs("dripstone_brick_stairs",
            DecoBlocks.DRIPSTONE_BRICKS,DecoBlocks.DRIPSTONE_BRICKS);
    public static final Block DRIPSTONE_BRICK_PILLAR_STAIRS = registerStairs("dripstone_brick_pillar_stairs",
            DecoBlocks.DRIPSTONE_BRICK_PILLAR,DecoBlocks.DRIPSTONE_BRICK_PILLAR);
    public static final Block VOID_STONE_BRICK_PILLAR_STAIRS = registerStairs("void_stone_brick_pillar_stairs",
            DecoBlocks.DRIPSTONE_BRICK_PILLAR,DecoBlocks.DRIPSTONE_BRICK_PILLAR);
    public static final Block TUBE_CORAL_STAIRS = registerTubeCoralStairs("tube_coral_stairs",
            Blocks.TUBE_CORAL_BLOCK,Blocks.TUBE_CORAL_BLOCK);
    public static final Block DEAD_TUBE_CORAL_STAIRS = registerStairs("dead_tube_coral_stairs",
            Blocks.DEAD_TUBE_CORAL_BLOCK,Blocks.DEAD_TUBE_CORAL_BLOCK);
    public static final Block HYDRATED_TUBE_CORAL_STAIRS = registerStairs("hydrated_tube_coral_stairs",
            DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK,DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);
    public static final Block BRAIN_CORAL_STAIRS = registerBrainCoralStairs("brain_coral_stairs",
            Blocks.BRAIN_CORAL_BLOCK,Blocks.BRAIN_CORAL_BLOCK);
    public static final Block DEAD_BRAIN_CORAL_STAIRS = registerStairs("dead_brain_coral_stairs",
            Blocks.DEAD_BRAIN_CORAL_BLOCK,Blocks.DEAD_BRAIN_CORAL_BLOCK);
    public static final Block HYDRATED_BRAIN_CORAL_STAIRS = registerStairs("hydrated_brain_coral_stairs",
            DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK,DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);
    public static final Block BUBBLE_CORAL_STAIRS = registerBubbleCoralStairs("bubble_coral_stairs",
            Blocks.BUBBLE_CORAL_BLOCK,Blocks.BUBBLE_CORAL_BLOCK);
    public static final Block DEAD_BUBBLE_CORAL_STAIRS = registerStairs("dead_bubble_coral_stairs",
            Blocks.DEAD_BUBBLE_CORAL_BLOCK,Blocks.DEAD_BUBBLE_CORAL_BLOCK);
    public static final Block HYDRATED_BUBBLE_CORAL_STAIRS = registerStairs("hydrated_bubble_coral_stairs",
            DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK,DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);
    public static final Block FIRE_CORAL_STAIRS = registerFireCoralStairs("fire_coral_stairs",
            Blocks.FIRE_CORAL_BLOCK,Blocks.FIRE_CORAL_BLOCK);
    public static final Block DEAD_FIRE_CORAL_STAIRS = registerStairs("dead_fire_coral_stairs",
            Blocks.DEAD_FIRE_CORAL_BLOCK,Blocks.DEAD_FIRE_CORAL_BLOCK);
    public static final Block HYDRATED_FIRE_CORAL_STAIRS = registerStairs("hydrated_fire_coral_stairs",
            DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK,DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);
    public static final Block HORN_CORAL_STAIRS = registerHornCoralStairs("horn_coral_stairs",
            Blocks.HORN_CORAL_BLOCK,Blocks.HORN_CORAL_BLOCK);
    public static final Block DEAD_HORN_CORAL_STAIRS = registerStairs("dead_horn_coral_stairs",
            Blocks.DEAD_HORN_CORAL_BLOCK,Blocks.DEAD_HORN_CORAL_BLOCK);
    public static final Block HYDRATED_HORN_CORAL_STAIRS = registerStairs("hydrated_horn_coral_stairs",
            DecoBlocks.HYDRATED_HORN_CORAL_BLOCK,DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);
    public static final Block DUEL_CUT_ORANGE_CONCRETE_STAIRS = registerStairs("duel_cut_orange_concrete_stairs",
            DecoBlocks.DUEL_CUT_ORANGE_CONCRETE,DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);
    public static final Block DUEL_CUT_MAGENTA_CONCRETE_STAIRS = registerStairs("duel_cut_magenta_concrete_stairs",
            DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE,DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);
    public static final Block DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS = registerStairs("duel_cut_light_blue_concrete_stairs",
            DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE,DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);
    public static final Block DUEL_CUT_YELLOW_CONCRETE_STAIRS = registerStairs("duel_cut_yellow_concrete_stairs",
            DecoBlocks.DUEL_CUT_YELLOW_CONCRETE,DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);
    public static final Block DUEL_CUT_LIME_CONCRETE_STAIRS = registerStairs("duel_cut_lime_concrete_stairs",
            DecoBlocks.DUEL_CUT_LIME_CONCRETE,DecoBlocks.DUEL_CUT_LIME_CONCRETE);
    public static final Block DUEL_CUT_PINK_CONCRETE_STAIRS = registerStairs("duel_cut_pink_concrete_stairs",
            DecoBlocks.DUEL_CUT_PINK_CONCRETE,DecoBlocks.DUEL_CUT_PINK_CONCRETE);
    public static final Block DUEL_CUT_GRAY_CONCRETE_STAIRS = registerStairs("duel_cut_gray_concrete_stairs",
            DecoBlocks.DUEL_CUT_GRAY_CONCRETE,DecoBlocks.DUEL_CUT_GRAY_CONCRETE);
    public static final Block DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS = registerStairs("duel_cut_light_gray_concrete_stairs",
            DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE,DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);
    public static final Block DUEL_CUT_CYAN_CONCRETE_STAIRS = registerStairs("duel_cut_cyan_concrete_stairs",
            DecoBlocks.DUEL_CUT_CYAN_CONCRETE,DecoBlocks.DUEL_CUT_CYAN_CONCRETE);
    public static final Block DUEL_CUT_PURPLE_CONCRETE_STAIRS = registerStairs("duel_cut_purple_concrete_stairs",
            DecoBlocks.DUEL_CUT_PURPLE_CONCRETE,DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);
    public static final Block DUEL_CUT_BLUE_CONCRETE_STAIRS = registerStairs("duel_cut_blue_concrete_stairs",
            DecoBlocks.DUEL_CUT_BLUE_CONCRETE,DecoBlocks.DUEL_CUT_BLUE_CONCRETE);
    public static final Block DUEL_CUT_BROWN_CONCRETE_STAIRS = registerStairs("duel_cut_brown_concrete_stairs",
            DecoBlocks.DUEL_CUT_BROWN_CONCRETE,DecoBlocks.DUEL_CUT_BROWN_CONCRETE);
    public static final Block DUEL_CUT_GREEN_CONCRETE_STAIRS = registerStairs("duel_cut_green_concrete_stairs",
            DecoBlocks.DUEL_CUT_GREEN_CONCRETE,DecoBlocks.DUEL_CUT_GREEN_CONCRETE);
    public static final Block DUEL_CUT_RED_CONCRETE_STAIRS = registerStairs("duel_cut_red_concrete_stairs",
            DecoBlocks.DUEL_CUT_RED_CONCRETE,DecoBlocks.DUEL_CUT_RED_CONCRETE);
    public static final Block DUEL_CUT_BLACK_CONCRETE_STAIRS = registerStairs("duel_cut_black_concrete_stairs",
            DecoBlocks.DUEL_CUT_BLACK_CONCRETE,DecoBlocks.DUEL_CUT_BLACK_CONCRETE);
    public static final Block CHECKERED_ORANGE_CONCRETE_STAIRS = registerStairs("checkered_orange_concrete_stairs",
            DecoBlocks.CHECKERED_ORANGE_CONCRETE,DecoBlocks.CHECKERED_ORANGE_CONCRETE);
    public static final Block CHECKERED_MAGENTA_CONCRETE_STAIRS = registerStairs("checkered_magenta_concrete_stairs",
            DecoBlocks.CHECKERED_MAGENTA_CONCRETE,DecoBlocks.CHECKERED_MAGENTA_CONCRETE);
    public static final Block CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS = registerStairs("checkered_light_blue_concrete_stairs",
            DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE,DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);
    public static final Block CHECKERED_YELLOW_CONCRETE_STAIRS = registerStairs("checkered_yellow_concrete_stairs",
            DecoBlocks.CHECKERED_YELLOW_CONCRETE,DecoBlocks.CHECKERED_YELLOW_CONCRETE);
    public static final Block CHECKERED_LIME_CONCRETE_STAIRS = registerStairs("checkered_lime_concrete_stairs",
            DecoBlocks.CHECKERED_LIME_CONCRETE,DecoBlocks.CHECKERED_LIME_CONCRETE);
    public static final Block CHECKERED_PINK_CONCRETE_STAIRS = registerStairs("checkered_pink_concrete_stairs",
            DecoBlocks.CHECKERED_PINK_CONCRETE,DecoBlocks.CHECKERED_PINK_CONCRETE);
    public static final Block CHECKERED_GRAY_CONCRETE_STAIRS = registerStairs("checkered_gray_concrete_stairs",
            DecoBlocks.CHECKERED_GRAY_CONCRETE,DecoBlocks.CHECKERED_GRAY_CONCRETE);
    public static final Block CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS = registerStairs("checkered_light_gray_concrete_stairs",
            DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE,DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);
    public static final Block CHECKERED_CYAN_CONCRETE_STAIRS = registerStairs("checkered_cyan_concrete_stairs",
            DecoBlocks.CHECKERED_CYAN_CONCRETE,DecoBlocks.CHECKERED_CYAN_CONCRETE);
    public static final Block CHECKERED_PURPLE_CONCRETE_STAIRS = registerStairs("checkered_purple_concrete_stairs",
            DecoBlocks.CHECKERED_PURPLE_CONCRETE,DecoBlocks.CHECKERED_PURPLE_CONCRETE);
    public static final Block CHECKERED_BLUE_CONCRETE_STAIRS = registerStairs("checkered_blue_concrete_stairs",
            DecoBlocks.CHECKERED_BLUE_CONCRETE,DecoBlocks.CHECKERED_BLUE_CONCRETE);
    public static final Block CHECKERED_BROWN_CONCRETE_STAIRS = registerStairs("checkered_brown_concrete_stairs",
            DecoBlocks.CHECKERED_BROWN_CONCRETE,DecoBlocks.CHECKERED_BROWN_CONCRETE);
    public static final Block CHECKERED_GREEN_CONCRETE_STAIRS = registerStairs("checkered_green_concrete_stairs",
            DecoBlocks.CHECKERED_GREEN_CONCRETE,DecoBlocks.CHECKERED_GREEN_CONCRETE);
    public static final Block CHECKERED_RED_CONCRETE_STAIRS = registerStairs("checkered_red_concrete_stairs",
            DecoBlocks.CHECKERED_RED_CONCRETE,DecoBlocks.CHECKERED_RED_CONCRETE);
    public static final Block CHECKERED_BLACK_CONCRETE_STAIRS = registerStairs("checkered_black_concrete_stairs",
            DecoBlocks.CHECKERED_BLACK_CONCRETE,DecoBlocks.CHECKERED_BLACK_CONCRETE);

    public static final Block CRACKED_RED_NETHER_BRICK_STAIRS = registerStairs("cracked_red_nether_brick_stairs",
            DecoBlocks.CRACKED_RED_NETHER_BRICKS, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
    public static final Block CRACKED_BLUE_NETHER_BRICK_STAIRS = registerStairs("cracked_blue_nether_brick_stairs",
            DecoBlocks.CRACKED_BLUE_NETHER_BRICKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);

    public static final Block CLOUD_STAIRS = registerStairs("cloud_stairs",
            DecoBlocks.SOLID_CLOUD, DecoBlocks.SOLID_CLOUD);
    public static final Block CLOUD_BRICK_STAIRS = registerStairs("cloud_brick_stairs",
            DecoBlocks.CLOUD_BRICKS, DecoBlocks.CLOUD_BRICKS);

    public static final Block STRIPPED_PALE_OAK_WOOD_SLAB = registerBlock("stripped_pale_oak_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS), SlabBlock::new);
    public static final Block PALE_OAK_WOOD_SLAB = registerBlock("pale_oak_wood_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS).mapColor(MapColor.STONE), SlabBlock::new);
    public static final Block SMOOTH_TUFF_SLAB = registerBlock("smooth_tuff_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_TUFF),SlabBlock::new);
    public static final Block WIND_SLAB = registerBlock("wind_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WIND_BLOCK),SlabBlock::new);
    public static final Block WIND_BRICK_SLAB = registerBlock("wind_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WIND_BRICKS),SlabBlock::new);
    public static final Block EARTH_SLAB = registerBlock("earth_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EARTH_BLOCK),SlabBlock::new);
    public static final Block EARTH_BRICK_SLAB = registerBlock("earth_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EARTH_BRICKS),SlabBlock::new);
    public static final Block TUFF_TILE_SLAB = registerBlock("tuff_tile_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.TUFF_TILES),SlabBlock::new);
    public static final Block CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_TUFF_BRICKS),SlabBlock::new);
    public static final Block MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MOSSY_TUFF_BRICKS),SlabBlock::new);
    public static final Block CRACKED_TUFF_TILE_SLAB = registerBlock("cracked_tuff_tile_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_TUFF_TILES),SlabBlock::new);
    public static final Block DRIFTWOOD_SLAB = registerBlock("driftwood_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_PLANKS), SlabBlock::new);
    public static final Block STRIPPED_DRIFTWOOD_SLAB = registerBlock("stripped_driftwood_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_PLANKS), SlabBlock::new);
    public static final Block DRIFTWOOD_LOG_SLAB = registerBlock("driftwood_log_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_PLANKS).mapColor(MapColor.COLOR_LIGHT_BLUE), SlabBlock::new);
    public static final Block DRIED_DRIFTWOOD_SLAB = registerBlock("dried_driftwood_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_PLANKS).mapColor(MapColor.TERRACOTTA_WHITE), SlabBlock::new);

    public static final Block WOODEN_SAPLING = registerSapling("wooden_sapling",
            DecoSaplingGenerators.WOODEN ,Blocks.OAK_SAPLING);
    public static final Block POTTED_WOODEN_SAPLING = registerFlowerPot("potted_wooden_sapling",
            WOODEN_SAPLING,Blocks.POTTED_OAK_SAPLING);

    public static final Block WOODEN_LEAVES = registerTintedLeaves("wooden_leaves",
            0.01F,Blocks.DARK_OAK_LEAVES);
    public static final Block DRIED_LEAVES = registerBlock("dried_leaves",
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES).mapColor(MapColor.COLOR_BROWN)
                    .sound(SoundType.LEAF_LITTER).pushReaction(PushReaction.DESTROY)
                    .noOcclusion().instabreak().noCollision(), DriedLeafBlock::new);
    public static final Block KELP_LEAVES = registerBlock("kelp_leaves",
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES).sound(SoundType.WET_GRASS)
                    .mapColor(MapColor.COLOR_LIGHT_GREEN).noOcclusion(), KelpLeafBlock::new);
    public static final Block DEAD_KELP_LEAVES = registerBlock("dead_kelp_leaves",
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES).sound(SoundType.HANGING_ROOTS)
                    .mapColor(MapColor.COLOR_LIGHT_GRAY).noOcclusion(), AbstractKelpLeafBlock::new);

    public static final Block DRIFTWOOD_SPROUT = registerBlock("driftwood_sprout",
            BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollision().instabreak()
                    .sound(SoundType.WET_GRASS).pushReaction(PushReaction.DESTROY), DriftwoodSproutBlock::new);
    public static final Block DRIFTWOOD_SAPLING = registerDriftwoodSapling("driftwood_sapling",
            DecoSaplingGenerators.DRIFTWOOD ,DecoBlocks.DRIFTWOOD_SPROUT);

    public static final Block IRON_CAP_MUSHROOM = registerIronCap("iron_cap_mushroom",
            DecoSaplingGenerators.IRON_CAP,Blocks.BROWN_MUSHROOM);
    public static final Block POTTED_IRON_CAP_MUSHROOM = registerFlowerPot("potted_iron_cap_mushroom",
            IRON_CAP_MUSHROOM, Blocks.POTTED_BROWN_MUSHROOM);

    public static final Block ROUGE_WILDFLOWERS = registerBlock("rouge_wildflowers",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WILDFLOWERS), FlowerBedBlock::new);
    public static final Block SWEET_WILDFLOWERS = registerBlock("sweet_wildflowers",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WILDFLOWERS), FlowerBedBlock::new);
    public static final Block GECKO_WILDFLOWERS = registerBlock("gecko_wildflowers",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WILDFLOWERS), FlowerBedBlock::new);

    public static final Block IRON_CAP_MUSHROOM_BLOCK = registerBlock("iron_cap_mushroom_block",
            BlockBehaviour.Properties.of().strength(4.0F, 6.0F).mapColor(MapColor.METAL)
                    .sound(SoundType.CANDLE), Block::new);

    public static final Block SPORE_IRON_ORE = registerBlock("spore_iron_ore",
            BlockBehaviour.Properties.of().strength(3.0F, 3.0F).mapColor(MapColor.GLOW_LICHEN)
                    .sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops(), Block::new);

    public static final Block PUFFY_DANDELION = registerPuffyFlower("puffy_dandelion",
            MobEffects.SATURATION, 3, Blocks.DANDELION);
    public static final Block POTTED_PUFFY_DANDELION = registerFlowerPot("potted_puffy_dandelion",
            PUFFY_DANDELION,Blocks.POTTED_DANDELION);

    public static final Block CALIFORNIA_POPPY = registerFlower("california_poppy",
            MobEffects.FIRE_RESISTANCE, 5, Blocks.POPPY);
    public static final Block POTTED_CALIFORNIA_POPPY = registerFlowerPot("potted_california_poppy",
            CALIFORNIA_POPPY,Blocks.POTTED_POPPY);
    public static final Block SALMON_POPPY = registerFlower("salmon_poppy",
            MobEffects.WATER_BREATHING, 7, Blocks.POPPY);
    public static final Block POTTED_SALMON_POPPY = registerFlowerPot("potted_salmon_poppy",
            SALMON_POPPY,Blocks.POTTED_POPPY);
    public static final Block ALPINE_POPPY = registerFlower("alpine_poppy",
            MobEffects.JUMP_BOOST, 5, Blocks.POPPY);
    public static final Block POTTED_ALPINE_POPPY = registerFlowerPot("potted_alpine_poppy",
            ALPINE_POPPY,Blocks.POTTED_POPPY);

    public static final Block YELLOW_ORCHID = registerFlower("yellow_orchid",
            MobEffects.SATURATION, 7, Blocks.BLUE_ORCHID);
    public static final Block POTTED_YELLOW_ORCHID = registerFlowerPot("potted_yellow_orchid",
            YELLOW_ORCHID,Blocks.POTTED_BLUE_ORCHID);
    public static final Block WHITE_ORCHID = registerFlower("white_orchid",
            MobEffects.GLOWING, 5, Blocks.BLUE_ORCHID);
    public static final Block POTTED_WHITE_ORCHID = registerFlowerPot("potted_white_orchid",
            WHITE_ORCHID,Blocks.POTTED_BLUE_ORCHID);
    public static final Block PINK_ORCHID = registerFlower("pink_orchid",
            MobEffects.SLOW_FALLING, 7, Blocks.BLUE_ORCHID);
    public static final Block POTTED_PINK_ORCHID = registerFlowerPot("potted_pink_orchid",
            PINK_ORCHID,Blocks.POTTED_BLUE_ORCHID);
    public static final Block CYAN_ORCHID = registerFlower("cyan_orchid",
            MobEffects.GLOWING, 7, Blocks.BLUE_ORCHID);
    public static final Block POTTED_CYAN_ORCHID = registerFlowerPot("potted_cyan_orchid",
            CYAN_ORCHID,Blocks.POTTED_BLUE_ORCHID);

    public static final Block POPPED_BLUET = registerDesertFlower("popped_bluet",
            MobEffects.SPEED, 5,Blocks.BLUE_ORCHID);
    public static final Block POTTED_POPPED_BLUET = registerFlowerPot("potted_popped_bluet",
            POPPED_BLUET, Blocks.POTTED_BLUE_ORCHID);
    public static final Block HAZZY_BLUET = registerDesertFlower("hazzy_bluet",
            MobEffects.DARKNESS, 5,Blocks.BLUE_ORCHID);
    public static final Block POTTED_HAZZY_BLUET = registerFlowerPot("potted_hazzy_bluet",
            HAZZY_BLUET, Blocks.POTTED_BLUE_ORCHID);

    public static final Block YELLOW_TULIP = registerFlower("yellow_tulip",
            MobEffects.WEAKNESS, 7, Blocks.RED_TULIP);
    public static final Block POTTED_YELLOW_TULIP = registerFlowerPot("potted_yellow_tulip",
            YELLOW_TULIP,Blocks.POTTED_RED_TULIP);
    public static final Block PURPLE_TULIP = registerFlower("purple_tulip",
            MobEffects.WEAKNESS, 7, Blocks.RED_TULIP);
    public static final Block POTTED_PURPLE_TULIP = registerFlowerPot("potted_purple_tulip",
            PURPLE_TULIP,Blocks.POTTED_RED_TULIP);
    public static final Block MAGENTA_TULIP = registerFlower("magenta_tulip",
            MobEffects.WEAKNESS, 7, Blocks.RED_TULIP);
    public static final Block POTTED_MAGENTA_TULIP = registerFlowerPot("potted_magenta_tulip",
            MAGENTA_TULIP,Blocks.POTTED_RED_TULIP);
    public static final Block BLUE_TULIP = registerFlower("blue_tulip",
            MobEffects.WEAKNESS, 7, Blocks.RED_TULIP);
    public static final Block POTTED_BLUE_TULIP = registerFlowerPot("potted_blue_tulip",
            BLUE_TULIP,Blocks.POTTED_RED_TULIP);

    public static final Block BLACK_TULIP = registerFlower("black_tulip",
            MobEffects.WEAKNESS, 15, Blocks.RED_TULIP);
    public static final Block POTTED_BLACK_TULIP = registerFlowerPot("potted_black_tulip",
            BLACK_TULIP,Blocks.POTTED_RED_TULIP);
    public static final Block GREEN_TULIP = registerFlower("green_tulip",
            MobEffects.WEAKNESS, 15, Blocks.RED_TULIP);
    public static final Block POTTED_GREEN_TULIP = registerFlowerPot("potted_green_tulip",
            GREEN_TULIP,Blocks.POTTED_RED_TULIP);
    public static final Block CYAN_TULIP = registerFlower("cyan_tulip",
            MobEffects.WEAKNESS, 15, Blocks.RED_TULIP);
    public static final Block POTTED_CYAN_TULIP = registerFlowerPot("potted_cyan_tulip",
            CYAN_TULIP,Blocks.POTTED_RED_TULIP);

    public static final Block BARBERTON_DAISY = registerFlower("barberton_daisy",
            MobEffects.INSTANT_HEALTH, 1, Blocks.OXEYE_DAISY);
    public static final Block POTTED_BARBERTON_DAISY = registerFlowerPot("potted_barberton_daisy",
            BARBERTON_DAISY,Blocks.POTTED_OXEYE_DAISY);
    public static final Block BLUE_EYED_DAISY = registerFlower("blue_eyed_daisy",
            MobEffects.NIGHT_VISION, 7, Blocks.OXEYE_DAISY);
    public static final Block POTTED_BLUE_EYED_DAISY = registerFlowerPot("potted_blue_eyed_daisy",
            BLUE_EYED_DAISY,Blocks.POTTED_OXEYE_DAISY);
    public static final Block GERBERA_DAISY = registerFlower("gerbera_daisy",
            MobEffects.REGENERATION, 5, Blocks.OXEYE_DAISY);
    public static final Block POTTED_GERBERA_DAISY = registerFlowerPot("potted_gerbera_daisy",
            GERBERA_DAISY,Blocks.POTTED_OXEYE_DAISY);
    public static final Block MICHAELMAS_DAISY = registerFlower("michaelmas_daisy",
            MobEffects.RESISTANCE, 7, Blocks.OXEYE_DAISY);
    public static final Block POTTED_MICHAELMAS_DAISY = registerFlowerPot("potted_michaelmas_daisy",
            MICHAELMAS_DAISY,Blocks.POTTED_OXEYE_DAISY);
    public static final Block DEAD_EYE_DAISY = registerDesertFlower("dead_eye_daisy",
            MobEffects.STRENGTH, 5,Blocks.OXEYE_DAISY);
    public static final Block POTTED_DEAD_EYE_DAISY = registerFlowerPot("potted_dead_eye_daisy",
            DEAD_EYE_DAISY,Blocks.POTTED_OXEYE_DAISY);
    public static final Block FELICIA_DAISY = registerDesertFlower("felicia_daisy",
            MobEffects.HUNGER, 11,Blocks.OXEYE_DAISY);
    public static final Block POTTED_FELICIA_DAISY = registerFlowerPot("potted_felicia_daisy",
            FELICIA_DAISY,Blocks.POTTED_OXEYE_DAISY);

    public static final Block PAEONIA = registerFlower("paeonia",
            MobEffects.SLOWNESS,7, Blocks.POPPY);
    public static final Block POTTED_PAEONIA = registerFlowerPot("potted_paeonia",
            PAEONIA,Blocks.POTTED_POPPY);

    public static final Block LAVENDER = registerFlower("lavender",
            MobEffects.HASTE,5, Blocks.POPPY);
    public static final Block POTTED_LAVENDER = registerFlowerPot("potted_lavender",
            LAVENDER,Blocks.POTTED_POPPY);
    public static final Block DRILL_LAVENDER = registerFlower("drill_lavender",
            DecoStatusEffects.GROUNDED,7, DecoBlocks.LAVENDER);
    public static final Block POTTED_DRILL_LAVENDER = registerFlowerPot("potted_drill_lavender",
            DRILL_LAVENDER,DecoBlocks.LAVENDER);

    public static final Block BLUE_HIBISCUS = registerFlower("blue_hibiscus",
                MobEffects.ABSORPTION,7, Blocks.POPPY);
    public static final Block POTTED_BLUE_HIBISCUS = registerFlowerPot("potted_blue_hibiscus",
            BLUE_HIBISCUS,Blocks.POTTED_POPPY);

    public static final Block BROMELIAD = registerFlower("bromeliad",
            MobEffects.HUNGER,5, Blocks.POPPY);
    public static final Block POTTED_BROMELIAD = registerFlowerPot("potted_bromeliad",
            BROMELIAD,Blocks.POTTED_POPPY);

    public static final Block BUTTERCUP = registerFlower("buttercup",
            MobEffects.ABSORPTION,7,Blocks.POPPY);
    public static final Block POTTED_BUTTERCUP = registerFlowerPot("potted_buttercup",
            BUTTERCUP,Blocks.POTTED_POPPY);

    public static final Block NIGHTSHADE = registerFlower("nightshade",
            MobEffects.INSTANT_DAMAGE,1,Blocks.POPPY);
    public static final Block POTTED_NIGHTSHADE = registerFlowerPot("potted_nightshade",
            NIGHTSHADE,Blocks.POTTED_POPPY);
    public static final Block ENDERSHADE = registerEndFlower("endershade",
            MobEffects.MINING_FATIGUE,9,Blocks.POPPY);
    public static final Block POTTED_ENDERSHADE = registerFlowerPot("potted_endershade",
            ENDERSHADE,Blocks.POTTED_POPPY);

    public static final Block IRIS = registerFlower("iris",
            MobEffects.MINING_FATIGUE,7,Blocks.POPPY);
    public static final Block POTTED_IRIS = registerFlowerPot("potted_iris",
            IRIS, Blocks.POTTED_POPPY);

    public static final Block BLUE_DELPHINIUM = registerFlower("blue_delphinium",
            MobEffects.REGENERATION,5,Blocks.POPPY);
    public static final Block POTTED_BLUE_DELPHINIUM = registerFlowerPot("potted_blue_delphinium",
            BLUE_DELPHINIUM,Blocks.POTTED_POPPY);

    public static final Block ROSE = registerFlower("rose",
            MobEffects.POISON, 5, Blocks.POPPY);
    public static final Block POTTED_ROSE = registerFlowerPot("potted_rose",
            ROSE,Blocks.POTTED_POPPY);
    public static final Block ENDER_ROSE = registerRoseFlower("ender_rose",
            MobEffects.LEVITATION, 8.0F, Blocks.POPPY);
    public static final Block POTTED_ENDER_ROSE = registerFlowerPot("potted_ender_rose",
            ENDER_ROSE,Blocks.POTTED_POPPY);

    public static final Block ANCIENT_ROSE_CROP = registerBlock("ancient_rose_crop",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TORCHFLOWER_CROP).noOcclusion(), AncientRoseBlock::new);

    public static final Block MIGHTY_LAVENDER_CROP = registerBlock("mighty_lavender_crop",
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TORCHFLOWER_CROP), MightyLavenderCropBlock::new);

    public static final Block ANCIENT_ROSE = registerFlower("ancient_rose",
            MobEffects.POISON, 12, Blocks.POPPY);
    public static final Block POTTED_ANCIENT_ROSE = registerFlowerPot("potted_ancient_rose",
            ANCIENT_ROSE,Blocks.POTTED_POPPY);

    public static final Block MIGHTY_LAVENDER = registerBlock("mighty_lavender",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY), MightyLavenderBlock::new);

    public static final Block OAK_CRAFTING_TABLE = registerBlock("oak_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.WOOD), OakCraftingTableBlock::new);
    public static final Block SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.PODZOL), SpruceCraftingTableBlock::new);
    public static final Block BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.SAND), BirchCraftingTableBlock::new);
    public static final Block JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.DIRT), JungleCraftingTableBlock::new);
    public static final Block ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.COLOR_GRAY), AcaciaCraftingTableBlock::new);
    public static final Block DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.COLOR_BROWN), DarkOakCraftingTableBlock::new);
    public static final Block MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.COLOR_RED), MangroveCraftingTableBlock::new);
    public static final Block BAMBOO_CRAFTING_TABLE = registerBlock("bamboo_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.COLOR_GREEN).sound(SoundType.BAMBOO_WOOD),
                BambooCraftingTableBlock::new);
    public static final Block CHERRY_CRAFTING_TABLE = registerBlock("cherry_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.CHERRY_WOOD),
                CherryCraftingTableBlock::new);
    public static final Block PALE_OAK_CRAFTING_TABLE = registerBlock("pale_oak_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.STONE), PaleOakCraftingTableBlock::new);
    public static final Block CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD),
                CrimsonCraftingTableBlock::new);
    public static final Block WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.WARPED_NYLIUM).sound(SoundType.NETHER_WOOD),
                WarpedCraftingTableBlock::new);
    public static final Block CACTUS_CRAFTING_TABLE = registerBlock("cactus_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.PLANT), CactusCraftingTableBlock::new);
    public static final Block MUSHROOM_CRAFTING_TABLE = registerBlock("mushroom_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.QUARTZ), MushroomCraftingTableBlock::new);
    public static final Block IRON_CAP_CRAFTING_TABLE = registerBlock("iron_cap_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.TERRACOTTA_GRAY)
                    .sound(SoundType.STEM), IronCapCraftingTableBlock::new);
    public static final Block DRIFTWOOD_CRAFTING_TABLE = registerBlock("driftwood_crafting_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(MapColor.COLOR_LIGHT_BLUE), DriftwoodCraftingTableBlock::new);

    public static final Block DEEPSLATE_FURNACE = registerBlock("deepslate_furnace",
            BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).mapColor(MapColor.DEEPSLATE)
                    .strength(4.5f).sound(SoundType.DEEPSLATE), DeepslateFurnaceBlock::new);
    public static final Block BLACKSTONE_FURNACE = registerBlock("blackstone_furnace",
            BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).mapColor(MapColor.COLOR_BLACK)
                    .strength(3.0f), BlackstoneFurnaceBlock::new);
    public static final Block TUFF_FURNACE = registerBlock("tuff_furnace",
            BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(3.0f).sound(SoundType.TUFF),TuffFurnaceBlock::new);
    public static final Block END_STONE_FURNACE = registerBlock("end_stone_furnace",
            BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).mapColor(MapColor.SAND)
                    .strength(4.5f),EndstoneFurnaceBlock::new);

    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);
    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER)
                    .sound(SoundType.NETHER_WOOD),LadderBlock::new);
    public static final Block WARPED_LADDER = registerBlock("warped_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER)
                    .sound(SoundType.NETHER_WOOD),LadderBlock::new);
    public static final Block BAMBOO_LADDER = registerBlock("bamboo_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER)
                    .sound(SoundType.BAMBOO_WOOD),LadderBlock::new);
    public static final Block CHERRY_LADDER = registerBlock("cherry_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER)
                    .sound(SoundType.CHERRY_WOOD),LadderBlock::new);
    public static final Block PALE_OAK_LADDER = registerBlock("pale_oak_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);
    public static final Block CACTUS_LADDER = registerBlock("cactus_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);
    public static final Block MUSHROOM_LADDER = registerBlock("mushroom_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);
    public static final Block IRON_CAP_LADDER = registerBlock("iron_cap_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER)
                    .sound(SoundType.STEM),LadderBlock::new);
    public static final Block WOODEN_LADDER = registerBlock("wooden_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);
    public static final Block DRIFTWOOD_LADDER = registerBlock("driftwood_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER),LadderBlock::new);

    public static final Block IRON_LADDER = registerBlock("iron_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).sound(SoundType.METAL)
                    .strength(5.0F, 6.0F).requiresCorrectToolForDrops(),LadderBlock::new);
    public static final Block GOLDEN_LADDER = registerBlock("golden_ladder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).sound(SoundType.METAL)
                    .strength(5.0F, 6.0F).requiresCorrectToolForDrops(),LadderBlock::new);

    public static final Block COPPER_LADDER = registerOxidLadder("copper_ladder",
            WeatheringCopper.WeatherState.UNAFFECTED, Blocks.LADDER);
    public static final Block EXPOSED_COPPER_LADDER = registerOxidLadder("exposed_copper_ladder",
            WeatheringCopper.WeatherState.EXPOSED, Blocks.LADDER);
    public static final Block WEATHERED_COPPER_LADDER = registerOxidLadder("weathered_copper_ladder",
            WeatheringCopper.WeatherState.WEATHERED,Blocks.LADDER);
    public static final Block OXIDIZED_COPPER_LADDER = registerOxidLadder("oxidized_copper_ladder",
            WeatheringCopper.WeatherState.OXIDIZED, Blocks.LADDER);

    public static final Block WAXED_COPPER_LADDER = registerBlock("waxed_copper_ladder",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.COPPER_LADDER),LadderBlock::new);
    public static final Block WAXED_EXPOSED_COPPER_LADDER = registerBlock("waxed_exposed_copper_ladder",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EXPOSED_COPPER_LADDER),LadderBlock::new);
    public static final Block WAXED_WEATHERED_COPPER_LADDER = registerBlock("waxed_weathered_copper_ladder",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WEATHERED_COPPER_LADDER),LadderBlock::new);
    public static final Block WAXED_OXIDIZED_COPPER_LADDER = registerBlock("waxed_oxidized_copper_ladder",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.OXIDIZED_COPPER_LADDER),LadderBlock::new);

    public static final Block GRASS_CARPET = registerBlock("grass_carpet",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_CARPET).sound(SoundType.GRASS),CarpetBlock::new);
    public static final Block DRY_GRASS_CARPET = registerBlock("dry_grass_carpet",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_CARPET).sound(SoundType.GRASS)
                    .mapColor(MapColor.COLOR_YELLOW),CarpetBlock::new);
    public static final Block PODZOL_CARPET = registerBlock("podzol_carpet",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_CARPET).mapColor(MapColor.PODZOL)
                    .sound(SoundType.GRAVEL),CarpetBlock::new);
    public static final Block CRIMSON_NYLIUM_CARPET = registerBlock("crimson_nylium_carpet",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_CARPET).mapColor(MapColor.CRIMSON_NYLIUM)
                    .sound(SoundType.NYLIUM),CarpetBlock::new);
    public static final Block WARPED_NYLIUM_CARPET = registerBlock("warped_nylium_carpet",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_CARPET).mapColor(MapColor.WARPED_NYLIUM)
                    .sound(SoundType.NYLIUM),CarpetBlock::new);
    public static final Block MYCELIUM_CARPET = registerBlock("mycelium_carpet",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_CARPET).mapColor(MapColor.COLOR_PURPLE)
                    .sound(SoundType.GRASS),CarpetBlock::new);

    public static final Block HAY_CARPET = registerBlock("hay_carpet",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_CARPET).mapColor(MapColor.COLOR_YELLOW)
                    .sound(SoundType.GRASS),CarpetBlock::new);
    public static final Block SCULK_CARPET = registerBlock("sculk_carpet",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_CARPET).mapColor(MapColor.COLOR_BLACK)
                    .sound(SoundType.SCULK),CarpetBlock::new);

    public static final Block PACKED_CACTUS = registerBlock("packed_cactus",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_WOOD).strength(0.4F).sound(SoundType.WOOL)
                    .mapColor(MapColor.COLOR_GREEN),RotatedPillarBlock::new);
    public static final Block STRIPPED_CACTUS = registerBlock("stripped_cactus",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PACKED_CACTUS).mapColor(MapColor.GRASS),RotatedPillarBlock::new);

    public static final Block CACTUS_PLANK_FENCE = registerBlock("cactus_plank_fence",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CACTUS_PLANKS),FenceBlock::new);
    public static final Block MUSHROOM_FENCE = registerBlock("mushroom_fence",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MUSHROOM_PLANKS),FenceBlock::new);
    public static final Block IRON_CAP_FENCE = registerBlock("iron_cap_fence",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.IRON_CAP_PLANKS),FenceBlock::new);
    public static final Block WOODEN_FENCE = registerBlock("wooden_fence",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WOODEN_PLANKS),FenceBlock::new);
    public static final Block DRIFTWOOD_FENCE = registerBlock("driftwood_fence",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_PLANKS),FenceBlock::new);

    public static final Block INFESTED_POLISHED_STONE = registerInfestedBlock("infested_polished_stone",
            DecoBlocks.POLISHED_STONE,DecoBlocks.POLISHED_STONE,1.25f,0.75f);
    public static final Block INFESTED_STONE_TILES = registerInfestedBlock("infested_stone_tiles",
            DecoBlocks.STONE_TILES,DecoBlocks.STONE_TILES,0.75f,0.75f);
    public static final Block INFESTED_CRACKED_STONE_TILES = registerInfestedBlock("infested_cracked_stone_tiles",
            DecoBlocks.STONE_TILES,DecoBlocks.STONE_TILES,0.75f,0.75f);
    public static final Block INFESTED_MOSSY_COBBLESTONE = registerInfestedBlock("infested_mossy_cobblestone",
            Blocks.MOSSY_COBBLESTONE,Blocks.MOSSY_COBBLESTONE,1.0f,0.75f);

    public static final Block INFESTED_COBBLED_DEEPSLATE = registerInfestedBlock("infested_cobbled_deepslate",
            Blocks.COBBLED_DEEPSLATE,Blocks.COBBLED_DEEPSLATE,1.75f,0.75f);
    public static final Block INFESTED_POLISHED_DEEPSLATE = registerInfestedBlock("infested_polished_deepslate",
            Blocks.POLISHED_DEEPSLATE,Blocks.POLISHED_DEEPSLATE,1.75f,0.75f);
    public static final Block INFESTED_DEEPSLATE_BRICKS = registerInfestedBlock("infested_deepslate_bricks",
            Blocks.DEEPSLATE_BRICKS,Blocks.DEEPSLATE_BRICKS,1.75f,0.75f);
    public static final Block INFESTED_DEEPSLATE_TILES = registerInfestedBlock("infested_deepslate_tiles",
            Blocks.DEEPSLATE_TILES,Blocks.DEEPSLATE_TILES,1.75f,0.75f);
    public static final Block INFESTED_CRACKED_DEEPSLATE_BRICKS = registerInfestedBlock("infested_cracked_deepslate_bricks",
            Blocks.CRACKED_DEEPSLATE_BRICKS,Blocks.CRACKED_DEEPSLATE_BRICKS,1.75f,0.75f);
    public static final Block INFESTED_MOSSY_DEEPSLATE_BRICKS = registerInfestedBlock("infested_mossy_deepslate_bricks",
            DecoBlocks.MOSSY_DEEPSLATE_BRICKS,DecoBlocks.MOSSY_DEEPSLATE_BRICKS,1.75f,0.75f);
    public static final Block INFESTED_CRACKED_DEEPSLATE_TILES = registerInfestedBlock("infested_cracked_deepslate_tiles",
            Blocks.CRACKED_DEEPSLATE_TILES,Blocks.CRACKED_DEEPSLATE_TILES,1.75f,0.75f);
    public static final Block INFESTED_CHISELED_DEEPSLATE = registerInfestedBlock("infested_chiseled_deepslate",
            Blocks.CHISELED_DEEPSLATE,Blocks.CHISELED_DEEPSLATE,1.75f,0.75f);

    public static final Block INFESTED_CALCITE = registerInfestedBlock("infested_calcite",
            Blocks.CALCITE,Blocks.CALCITE,0.375f,0.75f);
    public static final Block INFESTED_POLISHED_CALCITE = registerInfestedBlock("infested_polished_calcite",
            DecoBlocks.POLISHED_CALCITE,DecoBlocks.POLISHED_CALCITE,0.5f,0.75f);
    public static final Block INFESTED_CUT_CALCITE = registerInfestedBlock("infested_cut_calcite",
            DecoBlocks.CUT_CALCITE,DecoBlocks.CUT_CALCITE,0.5f,0.75f);
    public static final Block INFESTED_CALCITE_BRICKS = registerInfestedBlock("infested_calcite_bricks",
            DecoBlocks.CALCITE_BRICKS,DecoBlocks.CALCITE_BRICKS,0.5f,0.75f);
    public static final Block INFESTED_DRIPSTONE_BLOCK = registerInfestedBlock("infested_dripstone_block",
            Blocks.DRIPSTONE_BLOCK,Blocks.DRIPSTONE_BLOCK,0.75f,0.75f);
    public static final Block INFESTED_TUFF = registerInfestedBlock("infested_tuff",
            Blocks.TUFF,Blocks.TUFF,0.75f,0.75f);

    public static final Block INFESTED_GRANITE = registerInfestedBlock("infested_granite",
            Blocks.GRANITE,Blocks.GRANITE,0.75f,0.75f);
    public static final Block INFESTED_POLISHED_GRANITE = registerInfestedBlock("infested_polished_granite",
            Blocks.POLISHED_GRANITE,Blocks.POLISHED_GRANITE,0.75f,0.75f);
    public static final Block INFESTED_CUT_GRANITE = registerInfestedBlock("infested_cut_granite",
            DecoBlocks.CUT_GRANITE,DecoBlocks.CUT_GRANITE,0.75f,0.75f);
    public static final Block INFESTED_GRANITE_BRICKS = registerInfestedBlock("infested_granite_bricks",
            DecoBlocks.GRANITE_BRICKS,DecoBlocks.GRANITE_BRICKS,0.75f,0.75f);

    public static final Block INFESTED_DIORITE = registerInfestedBlock("infested_diorite",
            Blocks.DIORITE,Blocks.DIORITE,0.75f,0.75f);
    public static final Block INFESTED_POLISHED_DIORITE = registerInfestedBlock("infested_polished_diorite",
            Blocks.POLISHED_DIORITE,Blocks.POLISHED_DIORITE,0.75f,0.75f);
    public static final Block INFESTED_CUT_DIORITE = registerInfestedBlock("infested_cut_diorite",
            DecoBlocks.CUT_DIORITE,DecoBlocks.CUT_DIORITE,0.75f,0.75f);
    public static final Block INFESTED_DIORITE_BRICKS = registerInfestedBlock("infested_diorite_bricks",
            DecoBlocks.DIORITE_BRICKS,DecoBlocks.DIORITE_BRICKS,0.75f,0.75f);

    public static final Block INFESTED_ANDESITE = registerInfestedBlock("infested_andesite",
            Blocks.ANDESITE,Blocks.ANDESITE,0.75f,0.75f);
    public static final Block INFESTED_POLISHED_ANDESITE = registerInfestedBlock("infested_polished_andesite",
            Blocks.POLISHED_ANDESITE,Blocks.POLISHED_ANDESITE,0.75f,0.75f);
    public static final Block INFESTED_CUT_ANDESITE = registerInfestedBlock("infested_cut_andesite",
            DecoBlocks.CUT_ANDESITE,DecoBlocks.CUT_ANDESITE,0.75f,0.75f);
    public static final Block INFESTED_ANDESITE_BRICKS = registerInfestedBlock("infested_andesite_bricks",
            DecoBlocks.ANDESITE_BRICKS,DecoBlocks.ANDESITE_BRICKS,0.75f,0.75f);

    public static final Block INFESTED_BLACKSTONE = registerInfestedBlock("infested_blackstone",
            Blocks.BLACKSTONE,Blocks.BLACKSTONE,0.75f,0.75f);
    public static final Block INFESTED_POLISHED_BLACKSTONE = registerInfestedBlock("infested_polished_blackstone",
            Blocks.POLISHED_BLACKSTONE,Blocks.POLISHED_BLACKSTONE,1.0f,0.75f);
    public static final Block INFESTED_POLISHED_BLACKSTONE_BRICKS = registerInfestedBlock("infested_polished_blackstone_bricks",
            Blocks.POLISHED_BLACKSTONE_BRICKS,Blocks.POLISHED_BLACKSTONE_BRICKS,0.75f,0.75f);
    public static final Block INFESTED_MOSSY_POLISHED_BLACKSTONE_BRICKS = registerInfestedBlock("infested_mossy_polished_blackstone_bricks",
            DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS,DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS,0.75f,0.75f);
    public static final Block INFESTED_POLISHED_BLACKSTONE_TILES = registerInfestedBlock("infested_polished_blackstone_tiles",
            DecoBlocks.POLISHED_BLACKSTONE_TILES,DecoBlocks.POLISHED_BLACKSTONE_TILES,0.75f,0.75f);
    public static final Block INFESTED_CRACKED_POLISHED_BLACKSTONE_BRICKS = registerInfestedBlock("infested_cracked_polished_blackstone_bricks",
            Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,0.75f,0.75f);
    public static final Block INFESTED_CRACKED_POLISHED_BLACKSTONE_TILES = registerInfestedBlock("infested_cracked_polished_blackstone_tiles",
            DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES,DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES,0.75f,0.75f);
    public static final Block INFESTED_CHISELED_POLISHED_BLACKSTONE = registerInfestedBlock("infested_chiseled_polished_blackstone",
            Blocks.CHISELED_POLISHED_BLACKSTONE,Blocks.CHISELED_POLISHED_BLACKSTONE,0.75f,0.75f);

    public static final Block INFESTED_CHISELED_STONE = registerInfestedBlock("infested_chiseled_stone",
            DecoBlocks.CHISELED_STONE,DecoBlocks.CHISELED_STONE,1.25f,0.75f);
    public static final Block INFESTED_CHISELED_DEEPSLATE_BRICKS = registerInfestedBlock("infested_chiseled_deepslate_bricks",
            DecoBlocks.CHISELED_DEEPSLATE_BRICKS,DecoBlocks.CHISELED_DEEPSLATE_BRICKS,1.75f,0.75f);
    public static final Block INFESTED_CHISELED_POLISHED_BLACKSTONE_BRICKS = registerInfestedBlock("infested_chiseled_polished_blackstone_bricks",
            DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS,DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS,0.75f,0.75f);

    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS),FenceBlock::new);
    public static final Block BLUE_NETHER_BRICK_FENCE = registerBlock("blue_nether_brick_fence",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BLUE_NETHER_BRICKS),FenceBlock::new);

    public static final Block LIGHT_IRON_BARS = registerBlock("light_iron_bars",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.5f,6.0f),IronBarsBlock::new);

    public static final Block LIGHT_COPPER_BARS = registerOxidPane("light_copper_bars",
            WeatheringCopper.WeatherState.UNAFFECTED,DecoBlocks.LIGHT_IRON_BARS);
    public static final Block WAXED_LIGHT_COPPER_BARS = registerBlock("waxed_light_copper_bars",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LIGHT_COPPER_BARS),IronBarsBlock::new);
    public static final Block EXPOSED_LIGHT_COPPER_BARS = registerOxidPane("exposed_light_copper_bars",
            WeatheringCopper.WeatherState.EXPOSED,DecoBlocks.LIGHT_IRON_BARS);
    public static final Block WAXED_EXPOSED_LIGHT_COPPER_BARS = registerBlock("waxed_exposed_light_copper_bars",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS),IronBarsBlock::new);
    public static final Block WEATHERED_LIGHT_COPPER_BARS = registerOxidPane("weathered_light_copper_bars",
            WeatheringCopper.WeatherState.WEATHERED, DecoBlocks.LIGHT_IRON_BARS);
    public static final Block WAXED_WEATHERED_LIGHT_COPPER_BARS = registerBlock("waxed_weathered_light_copper_bars",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS),IronBarsBlock::new);
    public static final Block OXIDIZED_LIGHT_COPPER_BARS = registerOxidPane("oxidized_light_copper_bars",
            WeatheringCopper.WeatherState.OXIDIZED, DecoBlocks.LIGHT_IRON_BARS);
    public static final Block WAXED_OXIDIZED_LIGHT_COPPER_BARS = registerBlock("waxed_oxidized_light_copper_bars",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS),IronBarsBlock::new);
    public static final Block LIGHT_GOLD_BARS = registerBlock("light_gold_bars",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LIGHT_IRON_BARS).sound(SoundType.METAL),IronBarsBlock::new);

    public static final Block GOLD_BARS = registerBlock("gold_bars",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.METAL),IronBarsBlock::new);

    public static final Block HEAVY_IRON_BARS = registerBlock("heavy_iron_bars",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(10.0f,12.0f)
                    .mapColor(MapColor.METAL),IronBarsBlock::new);

    public static final Block HEAVY_COPPER_BARS = registerOxidPane("heavy_copper_bars",
            WeatheringCopper.WeatherState.UNAFFECTED, DecoBlocks.HEAVY_IRON_BARS);
    public static final Block WAXED_HEAVY_COPPER_BARS = registerBlock("waxed_heavy_copper_bars",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HEAVY_COPPER_BARS),IronBarsBlock::new);
    public static final Block EXPOSED_HEAVY_COPPER_BARS = registerOxidPane("exposed_heavy_copper_bars",
            WeatheringCopper.WeatherState.EXPOSED, DecoBlocks.HEAVY_IRON_BARS);
    public static final Block WAXED_EXPOSED_HEAVY_COPPER_BARS = registerBlock("waxed_exposed_heavy_copper_bars",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS),IronBarsBlock::new);
    public static final Block WEATHERED_HEAVY_COPPER_BARS = registerOxidPane("weathered_heavy_copper_bars",
            WeatheringCopper.WeatherState.WEATHERED, DecoBlocks.HEAVY_IRON_BARS);
    public static final Block WAXED_WEATHERED_HEAVY_COPPER_BARS = registerBlock("waxed_weathered_heavy_copper_bars",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS),IronBarsBlock::new);
    public static final Block OXIDIZED_HEAVY_COPPER_BARS = registerOxidPane("oxidized_heavy_copper_bars",
            WeatheringCopper.WeatherState.OXIDIZED, DecoBlocks.HEAVY_IRON_BARS);
    public static final Block WAXED_OXIDIZED_HEAVY_COPPER_BARS = registerBlock("waxed_oxidized_heavy_copper_bars",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS),IronBarsBlock::new);
    public static final Block HEAVY_GOLD_BARS = registerBlock("heavy_gold_bars",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HEAVY_IRON_BARS).sound(SoundType.METAL)
                    .mapColor(MapColor.GOLD),IronBarsBlock::new);

    public static final Block CRACKED_NETHER_BRICK_FENCE = registerBlock("cracked_nether_brick_fence",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_NETHER_BRICKS),FenceBlock::new);
    public static final Block CRACKED_RED_NETHER_BRICK_FENCE = registerBlock("cracked_red_nether_brick_fence",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_RED_NETHER_BRICKS),FenceBlock::new);
    public static final Block CRACKED_BLUE_NETHER_BRICK_FENCE = registerBlock("cracked_blue_nether_brick_fence",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS),FenceBlock::new);

    public static final Block STONE_WALL = registerBlock("stone_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),WallBlock::new);
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE),WallBlock::new);
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE),WallBlock::new);
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE),WallBlock::new);
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE),WallBlock::new);
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE),WallBlock::new);
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK), WallBlock::new);

    public static final Block DIRT_WALL = registerBlock("dirt_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT), WallBlock::new);
    public static final Block COARSE_DIRT_WALL = registerBlock("coarse_dirt_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.COARSE_DIRT), WallBlock::new);
    public static final Block ROOTED_DIRT_WALL = registerBlock("rooted_dirt_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ROOTED_DIRT), WallBlock::new);
    public static final Block MUD_WALL = registerBlock("mud_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MUD), WallBlock::new);
    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK), WallBlock::new);

    public static final Block OAK_WOOD_WALL = registerBlock("oak_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.DIRT), WallBlock::new);
    public static final Block SPRUCE_WOOD_WALL = registerBlock("spruce_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.COLOR_BROWN), WallBlock::new);
    public static final Block BIRCH_WOOD_WALL = registerBlock("birch_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).mapColor(MapColor.QUARTZ), WallBlock::new);
    public static final Block JUNGLE_WOOD_WALL = registerBlock("jungle_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.DIRT), WallBlock::new);
    public static final Block ACACIA_WOOD_WALL = registerBlock("acacia_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).mapColor(MapColor.STONE), WallBlock::new);
    public static final Block DARK_OAK_WOOD_WALL = registerBlock("dark_oak_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS), WallBlock::new);
    public static final Block MANGROVE_WOOD_WALL = registerBlock("mangrove_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).mapColor(MapColor.DIRT), WallBlock::new);
    public static final Block CHERRY_WOOD_WALL = registerBlock("cherry_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.TERRACOTTA_GRAY), WallBlock::new);
    public static final Block PALE_OAK_WOOD_WALL = registerBlock("pale_oak_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS).mapColor(MapColor.STONE), WallBlock::new);
    public static final Block CRIMSON_HYPHAE_WALL = registerBlock("crimson_hyphae_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).sound(SoundType.STEM)
                    .mapColor(MapColor.CRIMSON_HYPHAE), WallBlock::new);
    public static final Block WARPED_HYPHAE_WALL = registerBlock("warped_hyphae_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).sound(SoundType.STEM)
                    .mapColor(MapColor.WARPED_HYPHAE), WallBlock::new);
    public static final Block WOODEN_WOOD_WALL = registerBlock("wooden_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WOODEN_PLANKS).mapColor(MapColor.TERRACOTTA_BROWN), WallBlock::new);
    public static final Block IRON_CAP_HYPHAE_WALL = registerBlock("iron_cap_hyphae_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.IRON_CAP_PLANKS).mapColor(MapColor.TERRACOTTA_GRAY), WallBlock::new);
    public static final Block DRIFTWOOD_LOG_WALL = registerBlock("driftwood_log_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_PLANKS).mapColor(MapColor.COLOR_LIGHT_BLUE), WallBlock::new);
    public static final Block DRIED_DRIFTWOOD_WALL = registerBlock("dried_driftwood_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_PLANKS).mapColor(MapColor.TERRACOTTA_WHITE), WallBlock::new);

    public static final Block BAMBOO_BLOCK_WALL = registerBlock("bamboo_block_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).mapColor(MapColor.PLANT), WallBlock::new);

    public static final Block STRIPPED_OAK_WOOD_WALL = registerBlock("stripped_oak_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS), WallBlock::new);
    public static final Block STRIPPED_SPRUCE_WOOD_WALL = registerBlock("stripped_spruce_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS), WallBlock::new);
    public static final Block STRIPPED_BIRCH_WOOD_WALL = registerBlock("stripped_birch_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS), WallBlock::new);
    public static final Block STRIPPED_JUNGLE_WOOD_WALL = registerBlock("stripped_jungle_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS), WallBlock::new);
    public static final Block STRIPPED_ACACIA_WOOD_WALL = registerBlock("stripped_acacia_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS), WallBlock::new);
    public static final Block STRIPPED_DARK_OAK_WOOD_WALL = registerBlock("stripped_dark_oak_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS), WallBlock::new);
    public static final Block STRIPPED_MANGROVE_WOOD_WALL = registerBlock("stripped_mangrove_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS), WallBlock::new);
    public static final Block STRIPPED_CHERRY_WOOD_WALL = registerBlock("stripped_cherry_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.COLOR_PINK), WallBlock::new);
    public static final Block STRIPPED_PALE_OAK_WOOD_WALL = registerBlock("stripped_pale_oak_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS), WallBlock::new);
    public static final Block STRIPPED_CRIMSON_HYPHAE_WALL = registerBlock("stripped_crimson_hyphae_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS), WallBlock::new);
    public static final Block STRIPPED_WARPED_HYPHAE_WALL = registerBlock("stripped_warped_hyphae_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS), WallBlock::new);
    public static final Block STRIPPED_WOODEN_WOOD_WALL = registerBlock("stripped_wooden_wood_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WOODEN_PLANKS), WallBlock::new);
    public static final Block STRIPPED_IRON_CAP_HYPHAE_WALL = registerBlock("stripped_iron_cap_hyphae_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.IRON_CAP_PLANKS), WallBlock::new);
    public static final Block STRIPPED_DRIFTWOOD_WALL = registerBlock("stripped_driftwood_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_PLANKS), WallBlock::new);
    public static final Block STRIPPED_BAMBOO_WALL = registerBlock("stripped_bamboo_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS), WallBlock::new);

    public static final Block LAPIS_WALL = registerBlock("lapis_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK), WallBlock::new);
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE),WallBlock::new);
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ),WallBlock::new);
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE),WallBlock::new);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE),WallBlock::new);
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE),WallBlock::new);
    public static final Block OBSIDIAN_WALL = registerBlock("obsidian_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN),WallBlock::new);
    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK),WallBlock::new);
    public static final Block SNOW_WALL = registerBlock("snow_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK),WallBlock::new);
    public static final Block CLAY_WALL = registerBlock("clay_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY), WallBlock::new);
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK),WallBlock::new);
    public static final Block SMOOTH_BASALT_WALL  = registerBlock("smooth_basalt_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT),WallBlock::new);
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE),WallBlock::new);
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE),WallBlock::new);
    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_STONE_BRICKS),WallBlock::new);
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE),WallBlock::new);
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD),WallBlock::new);
    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_BRICKS), WallBlock::new);
    public static final Block CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_DEEPSLATE_TILES), WallBlock::new);
    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_NETHER_BRICKS), WallBlock::new);
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE),WallBlock::new);
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK),WallBlock::new);
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS),WallBlock::new);
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA),WallBlock::new);
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA),WallBlock::new);
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA),WallBlock::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA),WallBlock::new);
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA),WallBlock::new);
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA),WallBlock::new);
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA),WallBlock::new);
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA),WallBlock::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA),WallBlock::new);
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA),WallBlock::new);
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA),WallBlock::new);
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA),WallBlock::new);
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA),WallBlock::new);
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA),WallBlock::new);
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA),WallBlock::new);
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA),WallBlock::new);
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA),WallBlock::new);
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE),WallBlock::new);
    public static final Block MAGMA_WALL = registerBlock("magma_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK),MagmaWallBlock::new);
    public static final Block BONE_WALL = registerBlock("bone_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BONE_BLOCK), WallBlock::new);
    public static final Block DEAD_TUBE_CORAL_WALL = registerBlock("dead_tube_coral_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_TUBE_CORAL_BLOCK), WallBlock::new);
    public static final Block DEAD_BRAIN_CORAL_WALL = registerBlock("dead_brain_coral_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_BRAIN_CORAL_BLOCK), WallBlock::new);
    public static final Block DEAD_BUBBLE_CORAL_WALL = registerBlock("dead_bubble_coral_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_BUBBLE_CORAL_BLOCK), WallBlock::new);
    public static final Block DEAD_FIRE_CORAL_WALL = registerBlock("dead_fire_coral_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_FIRE_CORAL_BLOCK), WallBlock::new);
    public static final Block DEAD_HORN_CORAL_WALL = registerBlock("dead_horn_coral_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_HORN_CORAL_BLOCK), WallBlock::new);
    public static final Block TUBE_CORAL_WALL = registerCoralWall("tube_coral_wall",
            DEAD_TUBE_CORAL_WALL, Blocks.TUBE_CORAL_BLOCK);
    public static final Block BRAIN_CORAL_WALL = registerCoralWall("brain_coral_wall",
            DEAD_BRAIN_CORAL_WALL, Blocks.DEAD_BRAIN_CORAL_BLOCK);
    public static final Block BUBBLE_CORAL_WALL = registerCoralWall("bubble_coral_wall",
            DEAD_BUBBLE_CORAL_WALL,Blocks.BUBBLE_CORAL_BLOCK);
    public static final Block FIRE_CORAL_WALL = registerCoralWall("fire_coral_wall",
            DEAD_FIRE_CORAL_WALL,Blocks.FIRE_CORAL_BLOCK);
    public static final Block HORN_CORAL_WALL = registerCoralWall("horn_coral_wall",
            DEAD_HORN_CORAL_WALL,Blocks.HORN_CORAL_BLOCK);
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE),WallBlock::new);
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE),WallBlock::new);
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE),WallBlock::new);
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE),WallBlock::new);
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE),WallBlock::new);
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE),WallBlock::new);
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE),WallBlock::new);
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE),WallBlock::new);
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE),WallBlock::new);
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE),WallBlock::new);
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE),WallBlock::new);
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE),WallBlock::new);
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE),WallBlock::new);
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE),WallBlock::new);
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE),WallBlock::new);
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE),WallBlock::new);
    public static final Block BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE),WallBlock::new);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), WallBlock::new);
    public static final Block HONEYCOMB_WALL = registerBlock("honeycomb_wall",
            BlockBehaviour.Properties.ofFullCopy(Blocks.HONEYCOMB_BLOCK), WallBlock::new);

    public static final Block CUT_GRANITE_WALL = registerBlock("cut_granite_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GRANITE), WallBlock::new);
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.GRANITE_BRICKS), WallBlock::new);
    public static final Block CUT_DIORITE_WALL = registerBlock("cut_diorite_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_DIORITE), WallBlock::new);
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DIORITE_BRICKS), WallBlock::new);
    public static final Block CUT_ANDESITE_WALL = registerBlock("cut_andesite_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_ANDESITE), WallBlock::new);
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.ANDESITE_BRICKS), WallBlock::new);
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_CALCITE), WallBlock::new);
    public static final Block CUT_CALCITE_WALL = registerBlock("cut_calcite_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_CALCITE), WallBlock::new);
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CALCITE_BRICKS), WallBlock::new);
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIPSTONE_BRICKS), WallBlock::new);
    public static final Block DRIPSTONE_BRICK_PILLAR_WALL = registerBlock("dripstone_brick_pillar_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIPSTONE_BRICK_PILLAR), WallBlock::new);
    public static final Block LAPIS_BRICK_WALL = registerBlock("lapis_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LAPIS_BRICKS), WallBlock::new);
    public static final Block CUT_LAPIS_WALL = registerBlock("cut_lapis_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LAPIS), WallBlock::new);
    public static final Block CUT_SANDSTONE_BRICK_WALL = registerBlock("cut_sandstone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_SANDSTONE_BRICKS),WallBlock::new);
    public static final Block COBBLED_SANDSTONE_WALL = registerBlock("cobbled_sandstone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.COBBLED_SANDSTONE),WallBlock::new);
    public static final Block POLISHED_SANDSTONE_WALL = registerBlock("polished_sandstone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_SANDSTONE),WallBlock::new);
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SANDSTONE_BRICKS),WallBlock::new);
    public static final Block SMOOTH_LAPIS_WALL = registerBlock("smooth_lapis_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_LAPIS), WallBlock::new);
    public static final Block SMOOTH_OBSIDIAN_WALL = registerBlock("smooth_obsidian_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_OBSIDIAN), WallBlock::new);
    public static final Block SMOOTH_PURPUR_WALL = registerBlock("smooth_purpur_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_PURPUR),WallBlock::new);
    public static final Block SMOOTH_DEEPSLATE_WALL = registerBlock("smooth_deepslate_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_DEEPSLATE),WallBlock::new);
    public static final Block SMOOTH_BLACKSTONE_WALL = registerBlock("smooth_blackstone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_BLACKSTONE),WallBlock::new);
    public static final Block SMOOTH_TUFF_WALL = registerBlock("smooth_tuff_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_TUFF),WallBlock::new);
    public static final Block SMOOTH_END_STONE_WALL = registerBlock("smooth_end_stone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_END_STONE), WallBlock::new);
    public static final Block SANDED_OBSIDIAN_WALL = registerBlock("sanded_obsidian_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SANDED_OBSIDIAN), WallBlock::new);
    public static final Block OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.OBSIDIAN_BRICKS),WallBlock::new);
    public static final Block CUT_OBSIDIAN_WALL = registerBlock("cut_obsidian_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_OBSIDIAN), WallBlock::new);
    public static final Block CUT_PURPUR_WALL = registerBlock("cut_purpur_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_PURPUR), WallBlock::new);
    public static final Block PURPUR_BRICK_WALL = registerBlock("purpur_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PURPUR_BRICKS),WallBlock::new);
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SNOW_BRICKS),WallBlock::new);
    public static final Block PACKED_NETHERRACK_WALL = registerBlock("packed_netherrack_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PACKED_NETHERRACK), WallBlock::new);
    public static final Block NETHERRACK_BRICK_WALL = registerBlock("netherrack_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.NETHERRACK_BRICKS), WallBlock::new);
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_STONE), WallBlock::new);
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.STONE_TILES), WallBlock::new);
    public static final Block CRACKED_STONE_TILE_WALL = registerBlock("cracked_stone_tile_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_STONE_TILES), WallBlock::new);
    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MOSSY_DEEPSLATE_BRICKS), WallBlock::new);
    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_END_STONE), WallBlock::new);
    public static final Block MOSSY_END_STONE_BRICK_WALL = registerBlock("mossy_end_stone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MOSSY_END_STONE_BRICKS), WallBlock::new);
    public static final Block CRACKED_END_STONE_BRICK_WALL = registerBlock("cracked_end_stone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_END_STONE_BRICKS), WallBlock::new);
    public static final Block END_STONE_TILE_WALL = registerBlock("end_stone_tile_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.END_STONE_TILES), WallBlock::new);
    public static final Block CRACKED_END_STONE_TILE_WALL = registerBlock("cracked_end_stone_tile_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_END_STONE_TILES), WallBlock::new);
    public static final Block VOID_STONE_WALL = registerBlock("void_stone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.VOID_STONE),WallBlock::new);
    public static final Block VOID_STONE_BRICK_WALL = registerBlock("void_stone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.VOID_STONE_BRICKS),WallBlock::new);
    public static final Block VOID_STONE_BRICK_PILLAR_WALL = registerBlock("void_stone_brick_pillar_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.VOID_STONE_BRICK_PILLAR), WallBlock::new);
    public static final Block WHITE_TERRACOTTA_BRICK_WALL = registerBlock("white_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WHITE_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = registerBlock("orange_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.ORANGE_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = registerBlock("magenta_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = registerBlock("light_blue_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = registerBlock("yellow_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.YELLOW_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block LIME_TERRACOTTA_BRICK_WALL = registerBlock("lime_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LIME_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block PINK_TERRACOTTA_BRICK_WALL = registerBlock("pink_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PINK_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block GRAY_TERRACOTTA_BRICK_WALL = registerBlock("gray_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.GRAY_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = registerBlock("light_gray_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block CYAN_TERRACOTTA_BRICK_WALL = registerBlock("cyan_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CYAN_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = registerBlock("purple_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PURPLE_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block BLUE_TERRACOTTA_BRICK_WALL = registerBlock("blue_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BLUE_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block BROWN_TERRACOTTA_BRICK_WALL = registerBlock("brown_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BROWN_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block GREEN_TERRACOTTA_BRICK_WALL = registerBlock("green_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.GREEN_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block RED_TERRACOTTA_BRICK_WALL = registerBlock("red_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.RED_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block BLACK_TERRACOTTA_BRICK_WALL = registerBlock("black_terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BLACK_TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block TERRACOTTA_BRICK_WALL = registerBlock("terracotta_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.TERRACOTTA_BRICKS),WallBlock::new);
    public static final Block SOUL_SOILSTONE_WALL = registerBlock("soul_soilstone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOUL_SOILSTONE),WallBlock::new);
    public static final Block CUT_SOUL_SOILSTONE_WALL = registerBlock("cut_soul_soilstone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_SOUL_SOILSTONE),WallBlock::new);
    public static final Block SMOOTH_SOUL_SOILSTONE_WALL = registerBlock("smooth_soul_soilstone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SMOOTH_SOUL_SOILSTONE),WallBlock::new);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_WALL = registerBlock("cut_soul_soilstone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS),WallBlock::new);
    public static final Block COBBLED_SOUL_SOILSTONE_WALL = registerBlock("cobbled_soul_soilstone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.COBBLED_SOUL_SOILSTONE),WallBlock::new);
    public static final Block POLISHED_SOUL_SOILSTONE_WALL = registerBlock("polished_soul_soilstone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_SOUL_SOILSTONE),WallBlock::new);
    public static final Block SOUL_SOILSTONE_BRICK_WALL = registerBlock("soul_soilstone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOUL_SOILSTONE_BRICKS),WallBlock::new);
    public static final Block CUT_QUARTZ_WALL = registerBlock("cut_quartz_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_QUARTZ),WallBlock::new);
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.ICE_BRICKS),WallBlock::new);
    public static final Block CUT_WHITE_CONCRETE_WALL = registerBlock("cut_white_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_WHITE_CONCRETE),WallBlock::new);
    public static final Block CUT_ORANGE_CONCRETE_WALL = registerBlock("cut_orange_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_ORANGE_CONCRETE),WallBlock::new);
    public static final Block CUT_MAGENTA_CONCRETE_WALL = registerBlock("cut_magenta_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_MAGENTA_CONCRETE),WallBlock::new);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_WALL = registerBlock("cut_light_blue_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE),WallBlock::new);
    public static final Block CUT_YELLOW_CONCRETE_WALL = registerBlock("cut_yellow_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_YELLOW_CONCRETE),WallBlock::new);
    public static final Block CUT_LIME_CONCRETE_WALL = registerBlock("cut_lime_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIME_CONCRETE),WallBlock::new);
    public static final Block CUT_PINK_CONCRETE_WALL = registerBlock("cut_pink_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_PINK_CONCRETE),WallBlock::new);
    public static final Block CUT_GRAY_CONCRETE_WALL = registerBlock("cut_gray_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GRAY_CONCRETE),WallBlock::new);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_WALL = registerBlock("cut_light_gray_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE),WallBlock::new);
    public static final Block CUT_CYAN_CONCRETE_WALL = registerBlock("cut_cyan_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_CYAN_CONCRETE),WallBlock::new);
    public static final Block CUT_PURPLE_CONCRETE_WALL = registerBlock("cut_purple_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_PURPLE_CONCRETE),WallBlock::new);
    public static final Block CUT_BLUE_CONCRETE_WALL = registerBlock("cut_blue_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BLUE_CONCRETE),WallBlock::new);
    public static final Block CUT_BROWN_CONCRETE_WALL = registerBlock("cut_brown_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BROWN_CONCRETE),WallBlock::new);
    public static final Block CUT_GREEN_CONCRETE_WALL = registerBlock("cut_green_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_GREEN_CONCRETE),WallBlock::new);
    public static final Block CUT_RED_CONCRETE_WALL = registerBlock("cut_red_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_RED_CONCRETE),WallBlock::new);
    public static final Block CUT_BLACK_CONCRETE_WALL = registerBlock("cut_black_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_BLACK_CONCRETE),WallBlock::new);
    public static final Block DUEL_CUT_ORANGE_CONCRETE_WALL = registerBlock("duel_cut_orange_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_MAGENTA_CONCRETE_WALL = registerBlock("duel_cut_magenta_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_LIGHT_BLUE_CONCRETE_WALL = registerBlock("duel_cut_light_blue_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_YELLOW_CONCRETE_WALL = registerBlock("duel_cut_yellow_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_LIME_CONCRETE_WALL = registerBlock("duel_cut_lime_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_LIME_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_PINK_CONCRETE_WALL = registerBlock("duel_cut_pink_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_PINK_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_GRAY_CONCRETE_WALL = registerBlock("duel_cut_gray_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_GRAY_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_LIGHT_GRAY_CONCRETE_WALL = registerBlock("duel_cut_light_gray_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_CYAN_CONCRETE_WALL = registerBlock("duel_cut_cyan_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_CYAN_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_PURPLE_CONCRETE_WALL = registerBlock("duel_cut_purple_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_BLUE_CONCRETE_WALL = registerBlock("duel_cut_blue_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_BLUE_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_BROWN_CONCRETE_WALL = registerBlock("duel_cut_brown_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_BROWN_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_GREEN_CONCRETE_WALL = registerBlock("duel_cut_green_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_GREEN_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_RED_CONCRETE_WALL = registerBlock("duel_cut_red_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_RED_CONCRETE), WallBlock::new);
    public static final Block DUEL_CUT_BLACK_CONCRETE_WALL = registerBlock("duel_cut_black_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DUEL_CUT_BLACK_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_ORANGE_CONCRETE_WALL = registerBlock("checkered_orange_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_ORANGE_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_MAGENTA_CONCRETE_WALL = registerBlock("checkered_magenta_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_MAGENTA_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_LIGHT_BLUE_CONCRETE_WALL = registerBlock("checkered_light_blue_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_YELLOW_CONCRETE_WALL = registerBlock("checkered_yellow_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_YELLOW_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_LIME_CONCRETE_WALL = registerBlock("checkered_lime_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_LIME_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_PINK_CONCRETE_WALL = registerBlock("checkered_pink_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_PINK_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_GRAY_CONCRETE_WALL = registerBlock("checkered_gray_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_GRAY_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_LIGHT_GRAY_CONCRETE_WALL = registerBlock("checkered_light_gray_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_CYAN_CONCRETE_WALL = registerBlock("checkered_cyan_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_CYAN_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_PURPLE_CONCRETE_WALL = registerBlock("checkered_purple_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_PURPLE_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_BLUE_CONCRETE_WALL = registerBlock("checkered_blue_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_BLUE_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_BROWN_CONCRETE_WALL = registerBlock("checkered_brown_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_BROWN_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_GREEN_CONCRETE_WALL = registerBlock("checkered_green_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_GREEN_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_RED_CONCRETE_WALL = registerBlock("checkered_red_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_RED_CONCRETE), WallBlock::new);
    public static final Block CHECKERED_BLACK_CONCRETE_WALL = registerBlock("checkered_black_concrete_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHECKERED_BLACK_CONCRETE), WallBlock::new);
    public static final Block CRYSTALLIZED_PRISMARINE_WALL = registerBlock("crystallized_prismarine_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRYSTALLIZED_PRISMARINE),WallBlock::new);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_WALL = registerBlock("crystallized_prismarine_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS),WallBlock::new);
    public static final Block LIGHT_PRISMARINE_WALL = registerBlock("light_prismarine_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.LIGHT_PRISMARINE),WallBlock::new);
    public static final Block CUT_RED_SANDSTONE_BRICK_WALL = registerBlock("cut_red_sandstone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CUT_RED_SANDSTONE_BRICKS),WallBlock::new);
    public static final Block COBBLED_RED_SANDSTONE_WALL = registerBlock("cobbled_red_sandstone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.COBBLED_RED_SANDSTONE),WallBlock::new);
    public static final Block POLISHED_RED_SANDSTONE_WALL = registerBlock("polished_red_sandstone_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_RED_SANDSTONE),WallBlock::new);
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.RED_SANDSTONE_BRICKS),WallBlock::new);
    public static final Block MAGMA_BRICK_WALL = registerBlock("magma_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MAGMA_BRICKS),MagmaBrickWallBlock::new);
    public static final Block BUBBLE_WALL = registerBlock("bubble_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BUBBLE_BLOCK),BubbleWallBlock::new);
    public static final Block BUBBLE_BRICK_WALL = registerBlock("bubble_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BUBBLE_BRICKS),BubbleWallBlock::new);
    public static final Block CRACKED_RED_NETHER_BRICK_WALL = registerBlock("cracked_red_nether_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_RED_NETHER_BRICKS), WallBlock::new);
    public static final Block WIND_WALL = registerBlock("wind_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WIND_BLOCK),WallBlock::new);
    public static final Block WIND_BRICK_WALL = registerBlock("wind_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WIND_BRICKS),WallBlock::new);
    public static final Block EARTH_WALL = registerBlock("earth_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EARTH_BLOCK),WallBlock::new);
    public static final Block EARTH_BRICK_WALL = registerBlock("earth_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EARTH_BRICKS),WallBlock::new);
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BLUE_NETHER_BRICKS),WallBlock::new);
    public static final Block CRACKED_BLUE_NETHER_BRICK_WALL = registerBlock("cracked_blue_nether_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS), WallBlock::new);
    public static final Block HYDRATED_TUBE_CORAL_WALL = registerBlock("hydrated_tube_coral_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK), WallBlock::new);
    public static final Block HYDRATED_BRAIN_CORAL_WALL = registerBlock("hydrated_brain_coral_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK), WallBlock::new);
    public static final Block HYDRATED_BUBBLE_CORAL_WALL = registerBlock("hydrated_bubble_coral_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK), WallBlock::new);
    public static final Block HYDRATED_FIRE_CORAL_WALL = registerBlock("hydrated_fire_coral_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK), WallBlock::new);
    public static final Block HYDRATED_HORN_CORAL_WALL = registerBlock("hydrated_horn_coral_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK), WallBlock::new);
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("mossy_polished_blackstone_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS), WallBlock::new);
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.POLISHED_BLACKSTONE_TILES),WallBlock::new);
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILE_WALL = registerBlock("cracked_polished_blackstone_tile_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES), WallBlock::new);
    public static final Block CLOUD_WALL = registerBlock("cloud_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SOLID_CLOUD), TransparentWallBlock::new);
    public static final Block CLOUD_BRICK_WALL = registerBlock("cloud_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CLOUD_BRICKS), TransparentWallBlock::new);
    public static final Block CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_TUFF_BRICKS), WallBlock::new);
    public static final Block MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MOSSY_TUFF_BRICKS), WallBlock::new);
    public static final Block TUFF_TILE_WALL = registerBlock("tuff_tile_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.TUFF_TILES),WallBlock::new);
    public static final Block CRACKED_TUFF_TILE_WALL = registerBlock("cracked_tuff_tile_wall",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRACKED_TUFF_TILES), WallBlock::new);

    public static final Block RED_SUNFLOWER = registerBlock("red_sunflower",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER),TallFlowerBlock::new);
    public static final Block NOVA_STARFLOWER = registerBlock("nova_starflower",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER),NovaStarflowerBlock::new);

    public static final Block MEGA_BROWN_TULIP = registerBlock("mega_brown_tulip",
            BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY),TallFlowerBlock::new);

    public static final Block WITHER_ROSE_BUSH = registerBlock("wither_rose_bush",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH),WitherRoseBushBlock::new);
    public static final Block ENDER_ROSE_BUSH = registerBlock("ender_rose_bush",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH),EnderRoseBushBlock::new);

    public static final Block TINTED_GLASS_PANE = registerBlock("tinted_glass_pane",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS_PANE).noOcclusion(),TintedGlassPaneBlock::new);
    public static final Block HARDENED_GLASS_PANE = registerBlock("hardened_glass_pane",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS_PANE).strength(25.0F,100.0f)
                    .noOcclusion().requiresCorrectToolForDrops(),IronBarsBlock::new);
    public static final Block HARDENED_TINTED_GLASS_PANE = registerBlock("hardened_tinted_glass_pane",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.TINTED_GLASS_PANE).strength(25.0F,100.0f)
                    .noOcclusion().requiresCorrectToolForDrops(),TintedGlassPaneBlock::new);
    public static final Block HARDENED_WHITE_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_white_stained_glass_pane",
            DyeColor.WHITE,DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_ORANGE_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_orange_stained_glass_pane",
           DyeColor.ORANGE,DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_MAGENTA_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_magenta_stained_glass_pane",
           DyeColor.MAGENTA,DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_light_blue_stained_glass_pane",
           DyeColor.LIGHT_BLUE, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_YELLOW_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_yellow_stained_glass_pane",
           DyeColor.YELLOW, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_LIME_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_lime_stained_glass_pane",
           DyeColor.LIME, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_PINK_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_pink_stained_glass_pane",
           DyeColor.PINK, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_GRAY_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_gray_stained_glass_pane",
           DyeColor.GRAY, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_light_gray_stained_glass_pane",
           DyeColor.LIGHT_GRAY, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_CYAN_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_cyan_stained_glass_pane",
           DyeColor.CYAN, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_PURPLE_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_purple_stained_glass_pane",
           DyeColor.PURPLE, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_BLUE_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_blue_stained_glass_pane",
           DyeColor.BLUE, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_BROWN_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_brown_stained_glass_pane",
           DyeColor.BROWN, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_GREEN_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_green_stained_glass_pane",
           DyeColor.GREEN, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_RED_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_red_stained_glass_pane",
           DyeColor.RED, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);
    public static final Block HARDENED_BLACK_STAINED_GLASS_PANE = registerStainedGlassPane("hardened_black_stained_glass_pane",
           DyeColor.BLACK, DecoBlocks.HARDENED_GLASS_PANE,25.0F,100.0f);

    public static final Block MOSAIC_WHITE_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_white_stained_glass_pane",
           DyeColor.WHITE,Blocks.WHITE_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_ORANGE_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_orange_stained_glass_pane",
           DyeColor.ORANGE,Blocks.ORANGE_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_MAGENTA_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_magenta_stained_glass_pane",
           DyeColor.MAGENTA,Blocks.MAGENTA_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_light_blue_stained_glass_pane",
           DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_YELLOW_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_yellow_stained_glass_pane",
           DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_LIME_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_lime_stained_glass_pane",
           DyeColor.LIME, Blocks.LIME_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_PINK_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_pink_stained_glass_pane",
           DyeColor.PINK, Blocks.PINK_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_GRAY_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_gray_stained_glass_pane",
           DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_light_gray_stained_glass_pane",
           DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_CYAN_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_cyan_stained_glass_pane",
           DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_PURPLE_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_purple_stained_glass_pane",
           DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_BLUE_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_blue_stained_glass_pane",
           DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_BROWN_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_brown_stained_glass_pane",
           DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_GREEN_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_green_stained_glass_pane",
           DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_RED_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_red_stained_glass_pane",
           DyeColor.RED, Blocks.RED_STAINED_GLASS_PANE, 0.6f, 0.3f);
    public static final Block MOSAIC_BLACK_STAINED_GLASS_PANE = registerStainedGlassPane("mosaic_black_stained_glass_pane",
           DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS_PANE, 0.6f, 0.3f);

    public static final Block HYDRATED_TUBE_CORAL = registerBlock("hydrated_tube_coral",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL), BaseCoralPlantBlock::new);
    public static final Block HYDRATED_BRAIN_CORAL = registerBlock("hydrated_brain_coral",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRAIN_CORAL), BaseCoralPlantBlock::new);
    public static final Block HYDRATED_BUBBLE_CORAL = registerBlock("hydrated_bubble_coral",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BUBBLE_CORAL), BaseCoralPlantBlock::new);
    public static final Block HYDRATED_FIRE_CORAL = registerBlock("hydrated_fire_coral",
            BlockBehaviour.Properties.ofFullCopy(Blocks.FIRE_CORAL), BaseCoralPlantBlock::new);
    public static final Block HYDRATED_HORN_CORAL = registerBlock("hydrated_horn_coral",
            BlockBehaviour.Properties.ofFullCopy(Blocks.HORN_CORAL), BaseCoralPlantBlock::new);

    public static final Block HYDRATED_TUBE_CORAL_FAN = registerBlockWithoutItem("hydrated_tube_coral_fan",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL_FAN), BaseCoralFanBlock::new);
    public static final Block HYDRATED_BRAIN_CORAL_FAN = registerBlockWithoutItem("hydrated_brain_coral_fan",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRAIN_CORAL_FAN), BaseCoralFanBlock::new);
    public static final Block HYDRATED_BUBBLE_CORAL_FAN = registerBlockWithoutItem("hydrated_bubble_coral_fan",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BUBBLE_CORAL_FAN), BaseCoralFanBlock::new);
    public static final Block HYDRATED_FIRE_CORAL_FAN = registerBlockWithoutItem("hydrated_fire_coral_fan",
            BlockBehaviour.Properties.ofFullCopy(Blocks.FIRE_CORAL_FAN), BaseCoralFanBlock::new);
    public static final Block HYDRATED_HORN_CORAL_FAN = registerBlockWithoutItem("hydrated_horn_coral_fan",
            BlockBehaviour.Properties.ofFullCopy(Blocks.HORN_CORAL_FAN), BaseCoralFanBlock::new);

    public static final Block HYDRATED_TUBE_CORAL_WALL_FAN = registerDeadCoralFan("hydrated_tube_coral_wall_fan",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL_WALL_FAN), BaseCoralWallFanBlock::new,
            copyLootTable(HYDRATED_TUBE_CORAL_FAN, false));
    public static final Block HYDRATED_BRAIN_CORAL_WALL_FAN = registerDeadCoralFan("hydrated_brain_coral_wall_fan",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRAIN_CORAL_WALL_FAN), BaseCoralWallFanBlock::new,
            copyLootTable(HYDRATED_BRAIN_CORAL_FAN, false));
    public static final Block HYDRATED_BUBBLE_CORAL_WALL_FAN = registerDeadCoralFan("hydrated_bubble_coral_wall_fan",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BUBBLE_CORAL_WALL_FAN), BaseCoralWallFanBlock::new,
            copyLootTable(HYDRATED_BUBBLE_CORAL_FAN, false));
    public static final Block HYDRATED_FIRE_CORAL_WALL_FAN = registerDeadCoralFan("hydrated_fire_coral_wall_fan",
            BlockBehaviour.Properties.ofFullCopy(Blocks.FIRE_CORAL_WALL_FAN), BaseCoralWallFanBlock::new,
            copyLootTable(HYDRATED_FIRE_CORAL_FAN, false));
    public static final Block HYDRATED_HORN_CORAL_WALL_FAN = registerDeadCoralFan("hydrated_horn_coral_wall_fan",
            BlockBehaviour.Properties.ofFullCopy(Blocks.HORN_CORAL_WALL_FAN), BaseCoralWallFanBlock::new,
            copyLootTable(HYDRATED_HORN_CORAL_FAN, false));

    public static final Block OAK_BARREL = registerNonStationBlock("oak_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.WOOD), OakBarrelBlock::new);
    public static final Block SPRUCE_BARREL = registerNonStationBlock("spruce_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL), SpruceBarrelBlock::new);
    public static final Block BIRCH_BARREL = registerNonStationBlock("birch_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.SAND), BirchBarrelBlock::new);
    public static final Block JUNGLE_BARREL = registerNonStationBlock("jungle_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.DIRT), JungleBarrelBlock::new);
    public static final Block ACACIA_BARREL = registerNonStationBlock("acacia_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.COLOR_ORANGE), AcaciaBarrelBlock::new);
    public static final Block DARK_OAK_BARREL = registerNonStationBlock("dark_oak_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.COLOR_BROWN),DarkOakBarrelBlock::new);
    public static final Block MANGROVE_BARREL = registerNonStationBlock("mangrove_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.COLOR_RED),MangroveBarrelBlock::new);
    public static final Block BAMBOO_BARREL = registerNonStationBlock("bamboo_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.COLOR_YELLOW)
                    .sound(SoundType.BAMBOO_WOOD),BambooBarrelBlock::new);
    public static final Block CHERRY_BARREL = registerNonStationBlock("cherry_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.TERRACOTTA_WHITE)
                    .sound(SoundType.CHERRY_WOOD),CherryBarrelBlock::new);
    public static final Block PALE_OAK_BARREL = registerNonStationBlock("pale_oak_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.QUARTZ) ,PaleOakBarrelBlock::new);
    public static final Block CRIMSON_BARREL = registerNonStationBlock("crimson_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.CRIMSON_STEM)
                    .sound(SoundType.NETHER_WOOD),CrimsonBarrelBlock::new);
    public static final Block WARPED_BARREL = registerNonStationBlock("warped_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.WARPED_STEM)
                    .sound(SoundType.NETHER_WOOD),WarpedBarrelBlock::new);
    public static final Block CACTUS_BARREL = registerNonStationBlock("cactus_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.GRASS),CactusBarrelBlock::new);
    public static final Block DRIFTWOOD_BARREL = registerNonStationBlock("driftwood_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.PLANT),DriftwoodBarrelBlock::new);
    public static final Block MUSHROOM_BARREL = registerNonStationBlock("mushroom_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.RAW_IRON),MushroomBarrelBlock::new);
    public static final Block IRON_CAP_BARREL = registerNonStationBlock("iron_cap_barrel",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL).mapColor(MapColor.CLAY)
                    .sound(SoundType.STEM),IronCapBarrelBlock::new);

    public static final Block OAK_BOOKSHELF = registerBlock("oak_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.COLOR_BROWN),Block::new);
    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.COLOR_BROWN),Block::new);
    public static final Block BIRCH_BOOKSHELF = registerBlock("birch_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.SAND),Block::new);
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.DIRT),Block::new);
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.COLOR_ORANGE),Block::new);
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.COLOR_BROWN),Block::new);
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.COLOR_RED),Block::new);
    public static final Block BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.COLOR_YELLOW)
                    .sound(SoundType.BAMBOO_WOOD),Block::new);
    public static final Block CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.TERRACOTTA_WHITE)
                    .sound(SoundType.CHERRY_WOOD),Block::new);
    public static final Block PALE_OAK_BOOKSHELF = registerBlock("pale_oak_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.QUARTZ),Block::new);
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.CRIMSON_STEM)
                    .sound(SoundType.NETHER_WOOD),Block::new);
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.WARPED_STEM)
                    .sound(SoundType.NETHER_WOOD),Block::new);
    public static final Block CACTUS_BOOKSHELF = registerBlock("cactus_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.GRASS),Block::new);
    public static final Block DRIFTWOOD_BOOKSHELF = registerBlock("driftwood_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.PLANT),Block::new);
    public static final Block MUSHROOM_BOOKSHELF = registerBlock("mushroom_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.RAW_IRON), Block::new);
    public static final Block IRON_CAP_BOOKSHELF = registerBlock("iron_cap_bookshelf",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(MapColor.CLAY)
                    .sound(SoundType.STEM), Block::new);

    public static final Block OAK_BOOKSHELF_STAIRS = registerStairs("oak_bookshelf_stairs",
            DecoBlocks.OAK_BOOKSHELF, DecoBlocks.OAK_BOOKSHELF);
    public static final Block OAK_BOOKSHELF_SLAB = registerBlock("oak_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.OAK_BOOKSHELF), SlabBlock::new);

    public static final Block SPRUCE_BOOKSHELF_STAIRS = registerStairs("spruce_bookshelf_stairs",
            DecoBlocks.SPRUCE_BOOKSHELF, DecoBlocks.SPRUCE_BOOKSHELF);
    public static final Block SPRUCE_BOOKSHELF_SLAB = registerBlock("spruce_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.SPRUCE_BOOKSHELF), SlabBlock::new);

    public static final Block BIRCH_BOOKSHELF_STAIRS = registerStairs("birch_bookshelf_stairs",
            DecoBlocks.BIRCH_BOOKSHELF, DecoBlocks.BIRCH_BOOKSHELF);
    public static final Block BIRCH_BOOKSHELF_SLAB = registerBlock("birch_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BIRCH_BOOKSHELF), SlabBlock::new);

    public static final Block JUNGLE_BOOKSHELF_STAIRS = registerStairs("jungle_bookshelf_stairs",
            DecoBlocks.JUNGLE_BOOKSHELF, DecoBlocks.JUNGLE_BOOKSHELF);
    public static final Block JUNGLE_BOOKSHELF_SLAB = registerBlock("jungle_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.JUNGLE_BOOKSHELF), SlabBlock::new);

    public static final Block DARK_OAK_BOOKSHELF_STAIRS = registerStairs("dark_oak_bookshelf_stairs",
            DecoBlocks.DARK_OAK_BOOKSHELF, DecoBlocks.DARK_OAK_BOOKSHELF);
    public static final Block DARK_OAK_BOOKSHELF_SLAB = registerBlock("dark_oak_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DARK_OAK_BOOKSHELF), SlabBlock::new);

    public static final Block ACACIA_BOOKSHELF_STAIRS = registerStairs("acacia_bookshelf_stairs",
            DecoBlocks.ACACIA_BOOKSHELF, DecoBlocks.ACACIA_BOOKSHELF);
    public static final Block ACACIA_BOOKSHELF_SLAB = registerBlock("acacia_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.ACACIA_BOOKSHELF), SlabBlock::new);

    public static final Block MANGROVE_BOOKSHELF_STAIRS = registerStairs("mangrove_bookshelf_stairs",
            DecoBlocks.MANGROVE_BOOKSHELF, DecoBlocks.MANGROVE_BOOKSHELF);
    public static final Block MANGROVE_BOOKSHELF_SLAB = registerBlock("mangrove_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MANGROVE_BOOKSHELF), SlabBlock::new);

    public static final Block CHERRY_BOOKSHELF_STAIRS = registerStairs("cherry_bookshelf_stairs",
            DecoBlocks.CHERRY_BOOKSHELF, DecoBlocks.CHERRY_BOOKSHELF);
    public static final Block CHERRY_BOOKSHELF_SLAB = registerBlock("cherry_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CHERRY_BOOKSHELF), SlabBlock::new);

    public static final Block PALE_OAK_BOOKSHELF_STAIRS = registerStairs("pale_oak_bookshelf_stairs",
            DecoBlocks.PALE_OAK_BOOKSHELF, DecoBlocks.PALE_OAK_BOOKSHELF);
    public static final Block PALE_OAK_BOOKSHELF_SLAB = registerBlock("pale_oak_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.PALE_OAK_BOOKSHELF), SlabBlock::new);

    public static final Block BAMBOO_BOOKSHELF_STAIRS = registerStairs("bamboo_bookshelf_stairs",
            DecoBlocks.BAMBOO_BOOKSHELF, DecoBlocks.BAMBOO_BOOKSHELF);
    public static final Block BAMBOO_BOOKSHELF_SLAB = registerBlock("bamboo_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.BAMBOO_BOOKSHELF), SlabBlock::new);

    public static final Block CRIMSON_BOOKSHELF_STAIRS = registerStairs("crimson_bookshelf_stairs",
            DecoBlocks.CRIMSON_BOOKSHELF, DecoBlocks.CRIMSON_BOOKSHELF);
    public static final Block CRIMSON_BOOKSHELF_SLAB = registerBlock("crimson_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CRIMSON_BOOKSHELF), SlabBlock::new);

    public static final Block WARPED_BOOKSHELF_STAIRS = registerStairs("warped_bookshelf_stairs",
            DecoBlocks.WARPED_BOOKSHELF, DecoBlocks.WARPED_BOOKSHELF);
    public static final Block WARPED_BOOKSHELF_SLAB = registerBlock("warped_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WARPED_BOOKSHELF), SlabBlock::new);

    public static final Block CACTUS_BOOKSHELF_STAIRS = registerStairs("cactus_bookshelf_stairs",
            DecoBlocks.CACTUS_BOOKSHELF, DecoBlocks.CACTUS_BOOKSHELF);
    public static final Block CACTUS_BOOKSHELF_SLAB = registerBlock("cactus_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.CACTUS_BOOKSHELF), SlabBlock::new);

    public static final Block MUSHROOM_BOOKSHELF_STAIRS = registerStairs("mushroom_bookshelf_stairs",
            DecoBlocks.MUSHROOM_BOOKSHELF, DecoBlocks.MUSHROOM_BOOKSHELF);
    public static final Block MUSHROOM_BOOKSHELF_SLAB = registerBlock("mushroom_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.MUSHROOM_BOOKSHELF), SlabBlock::new);

    public static final Block IRON_CAP_BOOKSHELF_STAIRS = registerStairs("iron_cap_bookshelf_stairs",
            DecoBlocks.IRON_CAP_BOOKSHELF, DecoBlocks.IRON_CAP_BOOKSHELF);
    public static final Block IRON_CAP_BOOKSHELF_SLAB = registerBlock("iron_cap_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.IRON_CAP_BOOKSHELF), SlabBlock::new);

    public static final Block DRIFTWOOD_BOOKSHELF_STAIRS = registerStairs("driftwood_bookshelf_stairs",
            DecoBlocks.DRIFTWOOD_BOOKSHELF, DecoBlocks.DRIFTWOOD_BOOKSHELF);
    public static final Block DRIFTWOOD_BOOKSHELF_SLAB = registerBlock("driftwood_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.DRIFTWOOD_BOOKSHELF), SlabBlock::new);

    public static final Block WOODEN_BOOKSHELF_STAIRS = registerStairs("wooden_bookshelf_stairs",
            Blocks.BOOKSHELF, Blocks.BOOKSHELF);
    public static final Block WOODEN_BOOKSHELF_SLAB = registerBlock("wooden_bookshelf_slab",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF), SlabBlock::new);

    public static final Block DEEPSLATE_SMOKER = registerNonStationBlock("deepslate_smoker",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOKER).mapColor(MapColor.DEEPSLATE)
                    .strength(4.5f).sound(SoundType.DEEPSLATE),DeepslateSmokerBlock::new);
    public static final Block BLACKSTONE_SMOKER = registerNonStationBlock("blackstone_smoker",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOKER).mapColor(MapColor.COLOR_BLACK)
                    .strength(3.0f),BlackstoneSmokerBlock::new);
    public static final Block TUFF_SMOKER = registerNonStationBlock("tuff_smoker",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOKER).mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(3.0f).sound(SoundType.TUFF),TuffSmokerBlock::new);
    public static final Block END_STONE_SMOKER = registerNonStationBlock("end_stone_smoker",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOKER).mapColor(MapColor.SAND)
                    .strength(4.5f),EndstoneSmokerBlock::new);

    public static final Block DEEPSLATE_BLAST_FURNACE = registerNonStationBlock("deepslate_blast_furnace",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).mapColor(MapColor.DEEPSLATE)
                    .strength(4.5f).sound(SoundType.DEEPSLATE_BRICKS),DeepslateBlastFurnaceBlock::new);
    public static final Block BLACKSTONE_BLAST_FURNACE = registerNonStationBlock("blackstone_blast_furnace",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).mapColor(MapColor.COLOR_BLACK)
                    .strength(3.0f),BlackstoneBlastFurnaceBlock::new);
    public static final Block TUFF_BLAST_FURNACE = registerNonStationBlock("tuff_blast_furnace",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(3.0f).sound(SoundType.TUFF_BRICKS),TuffBlastFurnaceBlock::new);
    public static final Block END_STONE_BLAST_FURNACE = registerNonStationBlock("end_stone_blast_furnace",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).mapColor(MapColor.SAND)
                    .strength(4.5f),EndstoneBlastFurnaceBlock::new);

    public static final Block OAK_CARTOGRAPHY_TABLE = registerNonStationBlock("oak_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE),OakCartographyTableBlock::new);
    public static final Block BIRCH_CARTOGRAPHY_TABLE = registerNonStationBlock("birch_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE),BirchCartographyTableBlock::new);
    public static final Block SPRUCE_CARTOGRAPHY_TABLE = registerNonStationBlock("spruce_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE),SpruceCartographyTableBlock::new);
    public static final Block JUNGLE_CARTOGRAPHY_TABLE = registerNonStationBlock("jungle_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE),JungleCartographyTableBlock::new);
    public static final Block ACACIA_CARTOGRAPHY_TABLE = registerNonStationBlock("acacia_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE),AcaciaCartographyTableBlock::new);
    public static final Block DARK_OAK_CARTOGRAPHY_TABLE = registerNonStationBlock("dark_oak_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE),DarkOakCartographyTableBlock::new);
    public static final Block MANGROVE_CARTOGRAPHY_TABLE = registerNonStationBlock("mangrove_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE),MangroveCartographyTableBlock::new);
    public static final Block CHERRY_CARTOGRAPHY_TABLE = registerNonStationBlock("cherry_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE)
                    .sound(SoundType.CHERRY_WOOD),CherryCartographyTableBlock::new);
    public static final Block BAMBOO_CARTOGRAPHY_TABLE = registerNonStationBlock("bamboo_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE)
                    .sound(SoundType.BAMBOO_WOOD),BambooCartographyTableBlock::new);
    public static final Block PALE_OAK_CARTOGRAPHY_TABLE = registerNonStationBlock("pale_oak_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE) ,PaleOakCartographyTableBlock::new);
    public static final Block CRIMSON_CARTOGRAPHY_TABLE = registerNonStationBlock("crimson_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE)
                    .sound(SoundType.NETHER_WOOD),CrimsonCartographyTableBlock::new);
    public static final Block WARPED_CARTOGRAPHY_TABLE = registerNonStationBlock("warped_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE)
                    .sound(SoundType.NETHER_WOOD),WarpedCartographyTableBlock::new);
    public static final Block CACTUS_CARTOGRAPHY_TABLE = registerNonStationBlock("cactus_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE),CactusCartographyTableBlock::new);
    public static final Block DRIFTWOOD_CARTOGRAPHY_TABLE = registerNonStationBlock("driftwood_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE),DriftwoodCartographyTableBlock::new);
    public static final Block MUSHROOM_CARTOGRAPHY_TABLE = registerNonStationBlock("mushroom_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE),MushroomCartographyTableBlock::new);
    public static final Block IRON_CAP_CARTOGRAPHY_TABLE = registerNonStationBlock("iron_cap_cartography_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CARTOGRAPHY_TABLE)
                    .sound(SoundType.STEM),IronCapCartographyTableBlock::new);

    public static final Block DEEPSLATE_GRINDSTONE = registerNonStationBlock("deepslate_grindstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRINDSTONE).sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE),DeepslateGrindstoneBlock::new);
    public static final Block BLACKSTONE_GRINDSTONE = registerNonStationBlock("blackstone_grindstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRINDSTONE).mapColor(MapColor.COLOR_BLACK),BlackstoneGrindstoneBlock::new);
    public static final Block TUFF_GRINDSTONE = registerNonStationBlock("tuff_grindstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRINDSTONE).mapColor(MapColor.TERRACOTTA_GRAY)
            .sound(SoundType.TUFF),TuffGrindstoneBlock::new);
    public static final Block END_STONE_GRINDSTONE = registerNonStationBlock("end_stone_grindstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRINDSTONE).mapColor(MapColor.SAND),EndstoneGrindstoneBlock::new);

    public static final Block OAK_SMITHING_TABLE = registerNonStationBlock("oak_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE),OakSmithingTableBlock::new);
    public static final Block SPRUCE_SMITHING_TABLE = registerNonStationBlock("spruce_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE),SpruceSmithingTableBlock::new);
    public static final Block BIRCH_SMITHING_TABLE = registerNonStationBlock("birch_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE),BirchSmithingTableBlock::new);
    public static final Block JUNGLE_SMITHING_TABLE = registerNonStationBlock("jungle_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE),JungleSmithingTableBlock::new);
    public static final Block ACACIA_SMITHING_TABLE = registerNonStationBlock("acacia_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE),AcaciaSmithingTableBlock::new);
    public static final Block DARK_OAK_SMITHING_TABLE = registerNonStationBlock("dark_oak_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE),DarkOakSmithingTableBlock::new);
    public static final Block MANGROVE_SMITHING_TABLE = registerNonStationBlock("mangrove_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE),MangroveSmithingTableBlock::new);
    public static final Block CRIMSON_SMITHING_TABLE = registerNonStationBlock("crimson_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE)
                    .sound(SoundType.NETHER_WOOD),CrimsonSmithingTableBlock::new);
    public static final Block WARPED_SMITHING_TABLE = registerNonStationBlock("warped_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE)
                    .sound(SoundType.NETHER_WOOD),WarpedSmithingTableBlock::new);
    public static final Block BAMBOO_SMITHING_TABLE = registerNonStationBlock("bamboo_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE)
                    .sound(SoundType.BAMBOO_WOOD),BambooSmithingTableBlock::new);
    public static final Block CHERRY_SMITHING_TABLE = registerNonStationBlock("cherry_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE)
                    .sound(SoundType.CHERRY_WOOD),CherrySmithingTableBlock::new);
    public static final Block PALE_OAK_SMITHING_TABLE = registerNonStationBlock("pale_oak_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE) , PaleOakSmithingTableBlock::new);
    public static final Block CACTUS_SMITHING_TABLE = registerNonStationBlock("cactus_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE),CactusSmithingTableBlock::new);
    public static final Block MUSHROOM_SMITHING_TABLE = registerNonStationBlock("mushroom_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE),MushroomSmithingTableBlock::new);
    public static final Block IRON_CAP_SMITHING_TABLE = registerNonStationBlock("iron_cap_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE).sound(SoundType.STEM),IronCapSmithingTableBlock::new);
    public static final Block DRIFTWOOD_SMITHING_TABLE = registerNonStationBlock("driftwood_smithing_table",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMITHING_TABLE),DriftwoodSmithingTableBlock::new);

    public static final Block DEEPSLATE_STONECUTTER = registerNonStationBlock("deepslate_stonecutter",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONECUTTER).mapColor(MapColor.DEEPSLATE)
                    .strength(4.5f).sound(SoundType.DEEPSLATE),DeepslateStonecutterBlock::new);
    public static final Block BLACKSTONE_STONECUTTER = registerNonStationBlock("blackstone_stonecutter",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONECUTTER).mapColor(MapColor.COLOR_BLACK)
                    .strength(3.0f),BlackstoneStonecutterBlock::new);
    public static final Block TUFF_STONECUTTER = registerNonStationBlock("tuff_stonecutter",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONECUTTER).mapColor(MapColor.COLOR_BLACK)
                    .strength(3.0f).sound(SoundType.TUFF),TuffStonecutterBlock::new);
    public static final Block END_STONE_STONECUTTER = registerNonStationBlock("end_stone_stonecutter",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONECUTTER).mapColor(MapColor.SAND)
                    .strength(4.5f),EndstoneStonecutterBlock::new);

    public static final Block COPPER_SOUL_LANTERN = registerOxidLantern("copper_soul_lantern",
            WeatheringCopper.WeatherState.UNAFFECTED,Blocks.SOUL_LANTERN);
    public static final Block WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.COPPER_SOUL_LANTERN),LanternBlock::new);
    public static final Block EXPOSED_COPPER_SOUL_LANTERN = registerOxidLantern("exposed_copper_soul_lantern",
            WeatheringCopper.WeatherState.EXPOSED,Blocks.SOUL_LANTERN);
    public static final Block WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN),LanternBlock::new);
    public static final Block WEATHERED_COPPER_SOUL_LANTERN = registerOxidLantern("weathered_copper_soul_lantern",
            WeatheringCopper.WeatherState.WEATHERED,Blocks.SOUL_LANTERN);
    public static final Block WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN),LanternBlock::new);
    public static final Block OXIDIZED_COPPER_SOUL_LANTERN = registerOxidLantern("oxidized_copper_soul_lantern",
            WeatheringCopper.WeatherState.OXIDIZED,Blocks.SOUL_LANTERN);
    public static final Block WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern",
            BlockBehaviour.Properties.ofFullCopy(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN),LanternBlock::new);

    public static final Block BUBBLE_ELEVATOR_BLOCK_BUBBLE = registerBlock("bubble_elevator_block_bubble",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_COPPER_BLOCK).explosionResistance(25.0f)
                    .mapColor(MapColor.COLOR_BLUE).sound(SoundType.COPPER_BULB).randomTicks()
                    .emissiveRendering(DecoBlocks::always).lightLevel(state -> 3),BubbleElevatorBubbleBlock::new);

    public static final Block BUBBLE_ELEVATOR_BLOCK_MAGMA = registerBlockWithoutItem("bubble_elevator_block_magma",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_COPPER_BLOCK).explosionResistance(25.0f)
                    .mapColor(MapColor.NETHER).sound(SoundType.COPPER_BULB).randomTicks()
                    .emissiveRendering(DecoBlocks::always).lightLevel(state -> 3),BubbleElevatorMagmaBlock::new);

    public static final Block STONE_LEVER = registerBlock("stone_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER),LeverBlock::new);
    public static final Block DEEPSLATE_LEVER = registerBlock("deepslate_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER).sound(SoundType.DEEPSLATE),LeverBlock::new);
    public static final Block COBBLED_DEEPSLATE_LEVER = registerBlock("cobbled_deepslate_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER).sound(SoundType.DEEPSLATE),LeverBlock::new);
    public static final Block POLISHED_DEEPSLATE_LEVER = registerBlock("polished_deepslate_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER).sound(SoundType.POLISHED_DEEPSLATE),LeverBlock::new);
    public static final Block END_STONE_LEVER = registerBlock("end_stone_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER),LeverBlock::new);
    public static final Block BLACKSTONE_LEVER = registerBlock("blackstone_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER),LeverBlock::new);
    public static final Block TUFF_LEVER = registerBlock("tuff_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER).sound(SoundType.TUFF),LeverBlock::new);
    public static final Block POLISHED_TUFF_LEVER = registerBlock("polished_tuff_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER).sound(SoundType.POLISHED_TUFF),LeverBlock::new);
    public static final Block POLISHED_BLACKSTONE_LEVER = registerBlock("polished_blackstone_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER),LeverBlock::new);
    public static final Block POLISHED_STONE_LEVER = registerBlock("polished_stone_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER),LeverBlock::new);
    public static final Block POLISHED_END_STONE_LEVER = registerBlock("polished_end_stone_lever",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER),LeverBlock::new);

    public static final Block OAK_NOTE_BLOCK = registerBlock("oak_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.WOOD),NoteBlock::new);
    public static final Block SPRUCE_NOTE_BLOCK = registerBlock("spruce_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.PODZOL),NoteBlock::new);
    public static final Block BIRCH_NOTE_BLOCK = registerBlock("birch_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.SAND),NoteBlock::new);
    public static final Block JUNGLE_NOTE_BLOCK = registerBlock("jungle_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.DIRT),NoteBlock::new);
    public static final Block ACACIA_NOTE_BLOCK = registerBlock("acacia_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.COLOR_ORANGE),NoteBlock::new);
    public static final Block DARK_OAK_NOTE_BLOCK = registerBlock("dark_oak_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.COLOR_BROWN),NoteBlock::new);
    public static final Block MANGROVE_NOTE_BLOCK = registerBlock("mangrove_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.COLOR_RED),NoteBlock::new);
    public static final Block CHERRY_NOTE_BLOCK = registerBlock("cherry_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.TERRACOTTA_WHITE)
                    .sound(SoundType.CHERRY_WOOD),NoteBlock::new);
    public static final Block PALE_OAK_NOTE_BLOCK = registerBlock("pale_oak_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.SNOW),NoteBlock::new);
    public static final Block BAMBOO_NOTE_BLOCK = registerBlock("bamboo_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.COLOR_YELLOW)
                    .sound(SoundType.BAMBOO_WOOD),NoteBlock::new);
    public static final Block CRIMSON_NOTE_BLOCK = registerBlock("crimson_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.CRIMSON_STEM)
                    .sound(SoundType.NETHER_WOOD),NoteBlock::new);
    public static final Block WARPED_NOTE_BLOCK = registerBlock("warped_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.WARPED_STEM)
                    .sound(SoundType.NETHER_WOOD),NoteBlock::new);
    public static final Block CACTUS_NOTE_BLOCK = registerBlock("cactus_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.GRASS),NoteBlock::new);
    public static final Block MUSHROOM_NOTE_BLOCK = registerBlock("mushroom_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.RAW_IRON),NoteBlock::new);
    public static final Block IRON_CAP_NOTE_BLOCK = registerBlock("iron_cap_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.CLAY)
                    .sound(SoundType.STEM),NoteBlock::new);
    public static final Block DRIFTWOOD_NOTE_BLOCK = registerBlock("driftwood_note_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NOTE_BLOCK).mapColor(MapColor.PLANT)
                    .sound(SoundType.CHERRY_WOOD),NoteBlock::new);

    public static final Block DEEPSLATE_BUTTON = registerButton("deepslate_button",
            net.gecko.varandeco.block.DecoBlockSets.DEEPSLATE, 20,Blocks.STONE_BUTTON);
    public static final Block COBBLED_DEEPSLATE_BUTTON = registerButton("cobbled_deepslate_button",
            net.gecko.varandeco.block.DecoBlockSets.DEEPSLATE, 20,Blocks.STONE_BUTTON);
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerButton("polished_deepslate_button",
            net.gecko.varandeco.block.DecoBlockSets.POLISHED_DEEPSLATE, 20,Blocks.STONE_BUTTON);
    public static final Block COBBLESTONE_BUTTON = registerButton("cobblestone_button",
            BlockSetType.STONE, 20,Blocks.STONE_BUTTON);
    public static final Block END_STONE_BUTTON = registerButton("end_stone_button",
            net.gecko.varandeco.block.DecoBlockSets.END_STONE, 20, Blocks.STONE_BUTTON);
    public static final Block BLACKSTONE_BUTTON = registerButton("blackstone_button",
            net.gecko.varandeco.block.DecoBlockSets.BLACKSTONE, 20,Blocks.STONE_BUTTON);
    public static final Block POLISHED_STONE_BUTTON = registerButton("polished_stone_button",
            BlockSetType.STONE, 20,Blocks.STONE_BUTTON);
    public static final Block TUFF_BUTTON = registerButton("tuff_button",
            net.gecko.varandeco.block.DecoBlockSets.TUFF, 20,Blocks.STONE_BUTTON);
    public static final Block POLISHED_TUFF_BUTTON = registerButton("polished_tuff_button",
            net.gecko.varandeco.block.DecoBlockSets.POLISHED_TUFF, 20, Blocks.STONE_BUTTON);
    public static final Block POLISHED_END_STONE_BUTTON = registerButton("polished_end_stone_button",
            net.gecko.varandeco.block.DecoBlockSets.END_STONE, 20,Blocks.STONE_BUTTON);
    public static final Block CACTUS_PLANK_BUTTON = registerButton("cactus_plank_button",
            net.gecko.varandeco.block.DecoBlockSets.CACUTS, 30, Blocks.OAK_BUTTON);
    public static final Block MUSHROOM_BUTTON = registerButton("mushroom_button",
            net.gecko.varandeco.block.DecoBlockSets.MUSHROOM, 30, Blocks.OAK_BUTTON);
    public static final Block IRON_CAP_BUTTON = registerButton("iron_cap_button",
            net.gecko.varandeco.block.DecoBlockSets.IRON_CAP, 50, Blocks.OAK_BUTTON);
    public static final Block WOODEN_BUTTON = registerButton("wooden_button",
            net.gecko.varandeco.block.DecoBlockSets.WOODEN, 30, Blocks.OAK_BUTTON);
    public static final Block DRIFTWOOD_BUTTON = registerButton("driftwood_button",
            net.gecko.varandeco.block.DecoBlockSets.DRIFTWOOD, 30, Blocks.OAK_BUTTON);

    public static final Block IRON_BUTTON = registerButton("iron_button",
            BlockSetType.IRON, 50, Blocks.STONE_BUTTON);
    public static final Block GOLD_BUTTON = registerButton("gold_button",
            BlockSetType.GOLD, 1, Blocks.STONE_BUTTON);

    public static final Block COPPER_BUTTON = registerOxidButton("copper_button",
            WeatheringCopper.WeatherState.UNAFFECTED, BlockSetType.COPPER, 10, Blocks.STONE_BUTTON);
    public static final Block WAXED_COPPER_BUTTON = registerButton("waxed_copper_button",
            BlockSetType.COPPER, 10, DecoBlocks.COPPER_BUTTON);
    public static final Block EXPOSED_COPPER_BUTTON = registerOxidButton("exposed_copper_button",
            WeatheringCopper.WeatherState.EXPOSED,BlockSetType.COPPER, 20,Blocks.STONE_BUTTON);
    public static final Block WAXED_EXPOSED_COPPER_BUTTON = registerButton("waxed_exposed_copper_button",
            BlockSetType.COPPER, 20, DecoBlocks.EXPOSED_COPPER_BUTTON);
    public static final Block WEATHERED_COPPER_BUTTON = registerOxidButton("weathered_copper_button",
            WeatheringCopper.WeatherState.WEATHERED,BlockSetType.COPPER, 30,Blocks.STONE_BUTTON);
    public static final Block WAXED_WEATHERED_COPPER_BUTTON = registerButton("waxed_weathered_copper_button",
            BlockSetType.COPPER, 30, DecoBlocks.WEATHERED_COPPER_BUTTON);
    public static final Block OXIDIZED_COPPER_BUTTON = registerOxidButton("oxidized_copper_button",
            WeatheringCopper.WeatherState.OXIDIZED,BlockSetType.COPPER, 40,Blocks.STONE_BUTTON);
    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = registerButton("waxed_oxidized_copper_button",
            BlockSetType.COPPER, 40, DecoBlocks.OXIDIZED_COPPER_BUTTON);

    public static final Block DEEPSLATE_PRESSURE_PLATE = registerPressurePlateBlock("deepslate_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.DEEPSLATE, Blocks.DEEPSLATE);
    public static final Block COBBLED_DEEPSLATE_PRESSURE_PLATE = registerPressurePlateBlock("cobbled_deepslate_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.DEEPSLATE, Blocks.COBBLED_DEEPSLATE);
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerPressurePlateBlock("polished_deepslate_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);
    public static final Block COBBLESTONE_PRESSURE_PLATE = registerPressurePlateBlock("cobblestone_pressure_plate",
            BlockSetType.STONE, Blocks.STONE_PRESSURE_PLATE);
    public static final Block BLACKSTONE_PRESSURE_PLATE = registerPressurePlateBlock("blackstone_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.BLACKSTONE, Blocks.BLACKSTONE);
    public static final Block END_STONE_PRESSURE_PLATE = registerPressurePlateBlock("end_stone_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.END_STONE, Blocks.END_STONE);
    public static final Block POLISHED_STONE_PRESSURE_PLATE = registerPressurePlateBlock("polished_stone_pressure_plate",
            BlockSetType.STONE, Blocks.STONE_PRESSURE_PLATE);
    public static final Block POLISHED_END_STONE_PRESSURE_PLATE = registerPressurePlateBlock("polished_end_stone_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.END_STONE, DecoBlocks.POLISHED_END_STONE);
    public static final Block TUFF_PRESSURE_PLATE = registerPressurePlateBlock("tuff_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.TUFF, Blocks.TUFF);
    public static final Block POLISHED_TUFF_PRESSURE_PLATE = registerPressurePlateBlock("polished_tuff_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.POLISHED_TUFF, Blocks.POLISHED_TUFF);

    public static final Block COPPER_WEIGHT_PRESSURE_PLATE = registerOxidPressurePlateBlock("copper_weight_pressure_plate",
            20, WeatheringCopper.WeatherState.UNAFFECTED,BlockSetType.COPPER,Blocks.COPPER_BLOCK);
    public static final Block WAXED_COPPER_WEIGHT_PRESSURE_PLATE = registerWeightedPressurePlateBlock("waxed_copper_weight_pressure_plate",
            20, BlockSetType.COPPER, DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE = registerOxidPressurePlateBlock("exposed_copper_weight_pressure_plate",
            50, WeatheringCopper.WeatherState.EXPOSED,BlockSetType.COPPER,Blocks.EXPOSED_COPPER);
    public static final Block WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE = registerWeightedPressurePlateBlock("waxed_exposed_copper_weight_pressure_plate",
            50,BlockSetType.COPPER, DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE = registerOxidPressurePlateBlock("weathered_copper_weight_pressure_plate",
            70,WeatheringCopper.WeatherState.WEATHERED,BlockSetType.COPPER,Blocks.WEATHERED_COPPER);
    public static final Block WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE = registerWeightedPressurePlateBlock("waxed_weathered_copper_weight_pressure_plate",
            70,BlockSetType.COPPER, DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE = registerOxidPressurePlateBlock("oxidized_copper_weight_pressure_plate",
            100, WeatheringCopper.WeatherState.OXIDIZED,BlockSetType.COPPER,Blocks.OXIDIZED_COPPER);
    public static final Block WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE = registerWeightedPressurePlateBlock("waxed_oxidized_copper_weight_pressure_plate",
            100, BlockSetType.COPPER,DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);

    public static final Block CACTUS_PLANK_PRESSURE_PLATE = registerPressurePlateBlock("cactus_plank_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.CACUTS, Blocks.OAK_PRESSURE_PLATE);
    public static final Block MUSHROOM_PRESSURE_PLATE = registerPressurePlateBlock("mushroom_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.MUSHROOM, Blocks.OAK_PRESSURE_PLATE);
    public static final Block IRON_CAP_PRESSURE_PLATE = registerPressurePlateBlock("iron_cap_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.IRON_CAP, Blocks.OAK_PRESSURE_PLATE);
    public static final Block WOODEN_PRESSURE_PLATE = registerPressurePlateBlock("wooden_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.WOODEN, Blocks.SPRUCE_PRESSURE_PLATE);
    public static final Block DRIFTWOOD_PRESSURE_PLATE = registerPressurePlateBlock("driftwood_pressure_plate",
            net.gecko.varandeco.block.DecoBlockSets.DRIFTWOOD, Blocks.SPRUCE_PRESSURE_PLATE);

    public static final Block GOLD_DOOR = registerDoorBlock("gold_door",
            BlockSetType.GOLD, Blocks.GOLD_BLOCK);
    public static final Block CACTUS_DOOR = registerDoorBlock("cactus_door",
            BlockSetType.BIRCH, Blocks.OAK_DOOR);
    public static final Block MUSHROOM_DOOR = registerDoorBlock("mushroom_door",
            net.gecko.varandeco.block.DecoBlockSets.MUSHROOM, Blocks.OAK_DOOR);
    public static final Block IRON_CAP_DOOR = registerDoorBlock("iron_cap_door",
            net.gecko.varandeco.block.DecoBlockSets.IRON_CAP, Blocks.OAK_DOOR);
    public static final Block WOODEN_DOOR = registerDoorBlock("wooden_door",
            BlockSetType.OAK, Blocks.OAK_DOOR);
    public static final Block DRIFTWOOD_DOOR = registerDoorBlock("driftwood_door",
            BlockSetType.OAK, Blocks.OAK_DOOR);

    public static final Block OAK_PALLET_DOOR = registerDoorBlock("oak_pallet_door",
            BlockSetType.OAK, Blocks.OAK_DOOR);
    public static final Block SPRUCE_PALLET_DOOR = registerDoorBlock("spruce_pallet_door",
            BlockSetType.SPRUCE, Blocks.SPRUCE_DOOR);
    public static final Block BIRCH_PALLET_DOOR = registerDoorBlock("birch_pallet_door",
            BlockSetType.BIRCH, Blocks.BIRCH_DOOR);
    public static final Block JUNGLE_PALLET_DOOR = registerDoorBlock("jungle_pallet_door",
            BlockSetType.JUNGLE, Blocks.JUNGLE_DOOR);
    public static final Block ACACIA_PALLET_DOOR = registerDoorBlock("acacia_pallet_door",
            BlockSetType.ACACIA, Blocks.ACACIA_DOOR);
    public static final Block DARK_OAK_PALLET_DOOR = registerDoorBlock("dark_oak_pallet_door",
            BlockSetType.DARK_OAK, Blocks.DARK_OAK_DOOR);
    public static final Block MANGROVE_PALLET_DOOR = registerDoorBlock("mangrove_pallet_door",
            BlockSetType.MANGROVE, Blocks.MANGROVE_DOOR);
    public static final Block CHERRY_PALLET_DOOR = registerDoorBlock("cherry_pallet_door",
            BlockSetType.CHERRY, Blocks.CHERRY_DOOR);
    public static final Block PALE_OAK_PALLET_DOOR = registerDoorBlock("pale_oak_pallet_door",
            BlockSetType.PALE_OAK, Blocks.PALE_OAK_DOOR);
    public static final Block BAMBOO_PALLET_DOOR = registerDoorBlock("bamboo_pallet_door",
            BlockSetType.BAMBOO, Blocks.BAMBOO_DOOR);
    public static final Block CRIMSON_PALLET_DOOR = registerDoorBlock("crimson_pallet_door",
            BlockSetType.CRIMSON, Blocks.CRIMSON_DOOR);
    public static final Block WARPED_PALLET_DOOR = registerDoorBlock("warped_pallet_door",
            BlockSetType.WARPED, Blocks.MANGROVE_DOOR);

    public static final Block CACTUS_PALLET_DOOR = registerDoorBlock("cactus_pallet_door",
            net.gecko.varandeco.block.DecoBlockSets.CACUTS, DecoBlocks.CACTUS_DOOR);
    public static final Block MUSHROOM_PALLET_DOOR = registerDoorBlock("mushroom_pallet_door",
            net.gecko.varandeco.block.DecoBlockSets.MUSHROOM, DecoBlocks.MUSHROOM_DOOR);
    public static final Block IRON_CAP_PALLET_DOOR = registerDoorBlock("iron_cap_pallet_door",
            net.gecko.varandeco.block.DecoBlockSets.IRON_CAP, DecoBlocks.IRON_CAP_DOOR);
    public static final Block DRIFTWOOD_PALLET_DOOR = registerDoorBlock("driftwood_pallet_door",
            net.gecko.varandeco.block.DecoBlockSets.DRIFTWOOD, DecoBlocks.DRIFTWOOD_DOOR);
    public static final Block WOODEN_PALLET_DOOR = registerDoorBlock("wooden_pallet_door",
            net.gecko.varandeco.block.DecoBlockSets.WOODEN, DecoBlocks.WOODEN_DOOR);
    public static final Block GOLD_TRAPDOOR = registerTrapDoorBlock("gold_trapdoor",
            BlockSetType.GOLD, Blocks.GOLD_BLOCK);
    public static final Block CACTUS_TRAPDOOR = registerTrapDoorBlock("cactus_trapdoor",
            BlockSetType.BIRCH, Blocks.OAK_TRAPDOOR);
    public static final Block MUSHROOM_TRAPDOOR = registerTrapDoorBlock("mushroom_trapdoor",
            net.gecko.varandeco.block.DecoBlockSets.MUSHROOM, Blocks.OAK_TRAPDOOR);
    public static final Block IRON_CAP_TRAPDOOR = registerTrapDoorBlock("iron_cap_trapdoor",
            net.gecko.varandeco.block.DecoBlockSets.IRON_CAP, Blocks.OAK_TRAPDOOR);
    public static final Block WOODEN_TRAPDOOR = registerTrapDoorBlock("wooden_trapdoor",
            BlockSetType.OAK, Blocks.OAK_TRAPDOOR);
    public static final Block DRIFTWOOD_TRAPDOOR = registerTrapDoorBlock("driftwood_trapdoor",
            BlockSetType.OAK, Blocks.OAK_TRAPDOOR);

    public static final Block OAK_PALLET_TRAPDOOR = registerTrapDoorBlock("oak_pallet_trapdoor",
            BlockSetType.OAK, Blocks.OAK_TRAPDOOR);
    public static final Block SPRUCE_PALLET_TRAPDOOR = registerTrapDoorBlock("spruce_pallet_trapdoor",
            BlockSetType.SPRUCE, Blocks.SPRUCE_TRAPDOOR);
    public static final Block BIRCH_PALLET_TRAPDOOR = registerTrapDoorBlock("birch_pallet_trapdoor",
            BlockSetType.BIRCH, Blocks.BIRCH_TRAPDOOR);
    public static final Block JUNGLE_PALLET_TRAPDOOR = registerTrapDoorBlock("jungle_pallet_trapdoor",
            BlockSetType.JUNGLE, Blocks.JUNGLE_TRAPDOOR);
    public static final Block ACACIA_PALLET_TRAPDOOR = registerTrapDoorBlock("acacia_pallet_trapdoor",
            BlockSetType.ACACIA, Blocks.ACACIA_TRAPDOOR);
    public static final Block DARK_OAK_PALLET_TRAPDOOR = registerTrapDoorBlock("dark_oak_pallet_trapdoor",
            BlockSetType.DARK_OAK, Blocks.ACACIA_TRAPDOOR);
    public static final Block MANGROVE_PALLET_TRAPDOOR = registerTrapDoorBlock("mangrove_pallet_trapdoor",
            BlockSetType.MANGROVE, Blocks.MANGROVE_TRAPDOOR);
    public static final Block CHERRY_PALLET_TRAPDOOR = registerTrapDoorBlock("cherry_pallet_trapdoor",
            BlockSetType.CHERRY, Blocks.CHERRY_TRAPDOOR);
    public static final Block PALE_OAK_PALLET_TRAPDOOR = registerTrapDoorBlock("pale_oak_pallet_trapdoor",
            BlockSetType.PALE_OAK, Blocks.PALE_OAK_TRAPDOOR);
    public static final Block BAMBOO_PALLET_TRAPDOOR = registerTrapDoorBlock("bamboo_pallet_trapdoor",
            BlockSetType.BAMBOO, Blocks.BAMBOO_TRAPDOOR);
    public static final Block CRIMSON_PALLET_TRAPDOOR = registerTrapDoorBlock("crimson_pallet_trapdoor",
            BlockSetType.CRIMSON, Blocks.CRIMSON_TRAPDOOR);
    public static final Block WARPED_PALLET_TRAPDOOR = registerTrapDoorBlock("warped_pallet_trapdoor",
            BlockSetType.WARPED, Blocks.MANGROVE_TRAPDOOR);

    public static final Block CACTUS_PALLET_TRAPDOOR = registerTrapDoorBlock("cactus_pallet_trapdoor",
            net.gecko.varandeco.block.DecoBlockSets.CACUTS, DecoBlocks.CACTUS_TRAPDOOR);
    public static final Block MUSHROOM_PALLET_TRAPDOOR = registerTrapDoorBlock("mushroom_pallet_trapdoor",
            net.gecko.varandeco.block.DecoBlockSets.MUSHROOM, DecoBlocks.MUSHROOM_TRAPDOOR);
    public static final Block IRON_CAP_PALLET_TRAPDOOR = registerTrapDoorBlock("iron_cap_pallet_trapdoor",
            net.gecko.varandeco.block.DecoBlockSets.IRON_CAP, DecoBlocks.IRON_CAP_TRAPDOOR);
    public static final Block DRIFTWOOD_PALLET_TRAPDOOR = registerTrapDoorBlock("driftwood_pallet_trapdoor",
            net.gecko.varandeco.block.DecoBlockSets.DRIFTWOOD, DecoBlocks.DRIFTWOOD_TRAPDOOR);
    public static final Block WOODEN_PALLET_TRAPDOOR = registerTrapDoorBlock("wooden_pallet_trapdoor",
            DecoBlockSets.WOODEN, DecoBlocks.WOODEN_TRAPDOOR);

    public static final Block CACTUS_PLANK_FENCE_GATE = registerFenceGateBlock("cactus_plank_fence_gate",
            WoodType.BIRCH, DecoBlocks.CACTUS_PLANKS);
    public static final Block MUSHROOM_FENCE_GATE = registerFenceGateBlock("mushroom_fence_gate",
            WoodType.JUNGLE, DecoBlocks.MUSHROOM_PLANKS);
    public static final Block WOODEN_FENCE_GATE = registerFenceGateBlock("wooden_fence_gate",
            WoodType.OAK, DecoBlocks.WOODEN_PLANKS);
    public static final Block DRIFTWOOD_FENCE_GATE = registerFenceGateBlock("driftwood_fence_gate",
            WoodType.OAK, DecoBlocks.DRIFTWOOD_PLANKS);
    public static final Block IRON_CAP_FENCE_GATE = registerFenceGateBlock("iron_cap_fence_gate",
            WoodType.CRIMSON, DecoBlocks.IRON_CAP_PLANKS);
    public static final Block NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("nether_brick_fence_gate",
            WoodType.SPRUCE, Blocks.NETHER_BRICKS);
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("red_nether_brick_fence_gate",
            WoodType.MANGROVE, Blocks.RED_NETHER_BRICKS);
    public static final Block BLUE_NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("blue_nether_brick_fence_gate",
            WoodType.SPRUCE, DecoBlocks.BLUE_NETHER_BRICKS);

    public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("cracked_nether_brick_fence_gate",
            WoodType.SPRUCE, Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_RED_NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("cracked_red_nether_brick_fence_gate",
            WoodType.MANGROVE, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
    public static final Block CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("cracked_blue_nether_brick_fence_gate",
            WoodType.SPRUCE, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);

    public static final Identifier CACTUS_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cactus_sign");
    public static final Identifier CACTUS_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cactus_wall_sign");
    public static final Identifier WOODEN_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"wooden_sign");
    public static final Identifier WOODEN_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"wooden_wall_sign");
    public static final Identifier MUSHROOM_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_sign");
    public static final Identifier MUSHROOM_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_wall_sign");
    public static final Identifier IRON_CAP_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"iron_cap_sign");
    public static final Identifier IRON_CAP_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"iron_cap_wall_sign");
    public static final Identifier DRIFTWOOD_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"driftwood_sign");
    public static final Identifier DRIFTWOOD_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"driftwood_wall_sign");

    public static final Identifier WOODEN_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"wooden_hanging_sign");
    public static final Identifier WOODEN_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"wooden_wall_hanging_sign");
    public static final Identifier CACTUS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cactus_hanging_sign");
    public static final Identifier CACTUS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cactus_wall_hanging_sign");
    public static final Identifier MUSHROOM_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_hanging_sign");
    public static final Identifier MUSHROOM_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_wall_hanging_sign");
    public static final Identifier IRON_CAP_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"iron_cap_hanging_sign");
    public static final Identifier IRON_CAP_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"iron_cap_wall_hanging_sign");
    public static final Identifier DRIFTWOOD_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"driftwood_hanging_sign");
    public static final Identifier DRIFTWOOD_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"driftwood_wall_hanging_sign");

    public static final Identifier STRIPPED_OAK_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_oak_sign");
    public static final Identifier STRIPPED_OAK_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_oak_wall_sign");
    public static final Identifier STRIPPED_SPRUCE_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_spruce_sign");
    public static final Identifier STRIPPED_SPRUCE_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_spruce_wall_sign");
    public static final Identifier STRIPPED_BIRCH_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_birch_sign");
    public static final Identifier STRIPPED_BIRCH_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_birch_wall_sign");
    public static final Identifier STRIPPED_JUNGLE_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_jungle_sign");
    public static final Identifier STRIPPED_JUNGLE_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_jungle_wall_sign");
    public static final Identifier STRIPPED_ACACIA_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_acacia_sign");
    public static final Identifier STRIPPED_ACACIA_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_acacia_wall_sign");
    public static final Identifier STRIPPED_DARK_OAK_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_dark_oak_sign");
    public static final Identifier STRIPPED_DARK_OAK_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_dark_oak_wall_sign");
    public static final Identifier STRIPPED_MANGROVE_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_mangrove_sign");
    public static final Identifier STRIPPED_MANGROVE_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_mangrove_wall_sign");
    public static final Identifier STRIPPED_CHERRY_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_cherry_sign");
    public static final Identifier STRIPPED_CHERRY_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_cherry_wall_sign");
    public static final Identifier STRIPPED_PALE_OAK_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_pale_oak_sign");
    public static final Identifier STRIPPED_PALE_OAK_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_pale_oak_wall_sign");
    public static final Identifier STRIPPED_CRIMSON_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_crimson_sign");
    public static final Identifier STRIPPED_CRIMSON_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_crimson_wall_sign");
    public static final Identifier STRIPPED_WARPED_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_warped_sign");
    public static final Identifier STRIPPED_WARPED_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_warped_wall_sign");
    public static final Identifier STRIPPED_WOODEN_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_wooden_sign");
    public static final Identifier STRIPPED_WOODEN_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_wooden_wall_sign");
    public static final Identifier STRIPPED_CACTUS_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_cactus_sign");
    public static final Identifier STRIPPED_CACTUS_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_cactus_wall_sign");
    public static final Identifier MUSHROOM_STEM_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_stem_sign");
    public static final Identifier MUSHROOM_STEM_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_stem_wall_sign");
    public static final Identifier STRIPPED_IRON_CAP_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_iron_cap_sign");
    public static final Identifier STRIPPED_IRON_CAP_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_iron_cap_wall_sign");
    public static final Identifier STRIPPED_DRIFTWOOD_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_driftwood_sign");
    public static final Identifier STRIPPED_DRIFTWOOD_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"stripped_driftwood_wall_sign");

    public static final Identifier OAK_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"oak_mosaic_sign");
    public static final Identifier OAK_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"oak_mosaic_wall_sign");
    public static final Identifier SPRUCE_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"spruce_mosaic_sign");
    public static final Identifier SPRUCE_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"spruce_mosaic_wall_sign");
    public static final Identifier BIRCH_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"birch_mosaic_sign");
    public static final Identifier BIRCH_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"birch_mosaic_wall_sign");
    public static final Identifier JUNGLE_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"jungle_mosaic_sign");
    public static final Identifier JUNGLE_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"jungle_mosaic_wall_sign");
    public static final Identifier ACACIA_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"acacia_mosaic_sign");
    public static final Identifier ACACIA_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"acacia_mosaic_wall_sign");
    public static final Identifier DARK_OAK_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"dark_oak_mosaic_sign");
    public static final Identifier DARK_OAK_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"dark_oak_mosaic_wall_sign");
    public static final Identifier MANGROVE_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mangrove_mosaic_sign");
    public static final Identifier MANGROVE_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mangrove_mosaic_wall_sign");
    public static final Identifier CHERRY_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cherry_mosaic_sign");
    public static final Identifier CHERRY_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cherry_mosaic_wall_sign");
    public static final Identifier PALE_OAK_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"pale_oak_mosaic_sign");
    public static final Identifier PALE_OAK_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"pale_oak_mosaic_wall_sign");
    public static final Identifier BAMBOO_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"bamboo_mosaic_sign");
    public static final Identifier BAMBOO_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"bamboo_mosaic_wall_sign");
    public static final Identifier CRIMSON_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"crimson_mosaic_sign");
    public static final Identifier CRIMSON_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"crimson_mosaic_wall_sign");
    public static final Identifier WARPED_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"warped_mosaic_sign");
    public static final Identifier WARPED_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"warped_mosaic_wall_sign");
    public static final Identifier CACTUS_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cactus_mosaic_sign");
    public static final Identifier CACTUS_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cactus_mosaic_wall_sign");
    public static final Identifier WOODEN_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"wooden_mosaic_sign");
    public static final Identifier WOODEN_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"wooden_mosaic_wall_sign");
    public static final Identifier MUSHROOM_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_mosaic_sign");
    public static final Identifier MUSHROOM_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_mosaic_wall_sign");
    public static final Identifier IRON_CAP_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"iron_cap_mosaic_sign");
    public static final Identifier IRON_CAP_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"iron_cap_mosaic_wall_sign");
    public static final Identifier DRIFTWOOD_MOSAIC_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"driftwood_mosaic_sign");
    public static final Identifier DRIFTWOOD_MOSAIC_WALL_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"driftwood_mosaic_wall_sign");

    public static final Identifier OAK_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"oak_mosaic_hanging_sign");
    public static final Identifier OAK_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"oak_mosaic_wall_hanging_sign");
    public static final Identifier SPRUCE_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"spruce_mosaic_hanging_sign");
    public static final Identifier SPRUCE_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"spruce_mosaic_wall_hanging_sign");
    public static final Identifier BIRCH_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"birch_mosaic_hanging_sign");
    public static final Identifier BIRCH_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"birch_mosaic_wall_hanging_sign");
    public static final Identifier JUNGLE_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"jungle_mosaic_hanging_sign");
    public static final Identifier JUNGLE_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"jungle_mosaic_wall_hanging_sign");
    public static final Identifier ACACIA_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"acacia_mosaic_hanging_sign");
    public static final Identifier ACACIA_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"acacia_mosaic_wall_hanging_sign");
    public static final Identifier DARK_OAK_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"dark_oak_mosaic_hanging_sign");
    public static final Identifier DARK_OAK_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"dark_oak_mosaic_wall_hanging_sign");
    public static final Identifier MANGROVE_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mangrove_mosaic_hanging_sign");
    public static final Identifier MANGROVE_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mangrove_mosaic_wall_hanging_sign");
    public static final Identifier CHERRY_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cherry_mosaic_hanging_sign");
    public static final Identifier CHERRY_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cherry_mosaic_wall_hanging_sign");
    public static final Identifier PALE_OAK_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"pale_oak_mosaic_hanging_sign");
    public static final Identifier PALE_OAK_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"pale_oak_mosaic_wall_hanging_sign");
    public static final Identifier BAMBOO_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"bamboo_mosaic_hanging_sign");
    public static final Identifier BAMBOO_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"bamboo_mosaic_wall_hanging_sign");
    public static final Identifier CRIMSON_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"crimson_mosaic_hanging_sign");
    public static final Identifier CRIMSON_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"crimson_mosaic_wall_hanging_sign");
    public static final Identifier WARPED_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"warped_mosaic_hanging_sign");
    public static final Identifier WARPED_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"warped_mosaic_wall_hanging_sign");
    public static final Identifier CACTUS_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cactus_mosaic_hanging_sign");
    public static final Identifier CACTUS_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cactus_mosaic_wall_hanging_sign");
    public static final Identifier WOODEN_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"wooden_mosaic_hanging_sign");
    public static final Identifier WOODEN_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"wooden_mosaic_wall_hanging_sign");
    public static final Identifier MUSHROOM_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_mosaic_hanging_sign");
    public static final Identifier MUSHROOM_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_mosaic_wall_hanging_sign");
    public static final Identifier IRON_CAP_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"iron_cap_mosaic_hanging_sign");
    public static final Identifier IRON_CAP_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"iron_cap_mosaic_wall_hanging_sign");
    public static final Identifier DRIFTWOOD_MOSAIC_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"driftwood_mosaic_hanging_sign");
    public static final Identifier DRIFTWOOD_MOSAIC_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"driftwood_mosaic_wall_hanging_sign");

    public static final Identifier OAK_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"oak_planks_hanging_sign");
    public static final Identifier OAK_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"oak_planks_wall_hanging_sign");
    public static final Identifier SPRUCE_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"spruce_planks_hanging_sign");
    public static final Identifier SPRUCE_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"spruce_planks_wall_hanging_sign");
    public static final Identifier BIRCH_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"birch_planks_hanging_sign");
    public static final Identifier BIRCH_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"birch_planks_wall_hanging_sign");
    public static final Identifier JUNGLE_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"jungle_planks_hanging_sign");
    public static final Identifier JUNGLE_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"jungle_planks_wall_hanging_sign");
    public static final Identifier ACACIA_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"acacia_planks_hanging_sign");
    public static final Identifier ACACIA_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"acacia_planks_wall_hanging_sign");
    public static final Identifier DARK_OAK_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"dark_oak_planks_hanging_sign");
    public static final Identifier DARK_OAK_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"dark_oak_planks_wall_hanging_sign");
    public static final Identifier MANGROVE_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mangrove_planks_hanging_sign");
    public static final Identifier MANGROVE_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mangrove_planks_wall_hanging_sign");
    public static final Identifier CHERRY_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cherry_planks_hanging_sign");
    public static final Identifier CHERRY_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cherry_planks_wall_hanging_sign");
    public static final Identifier PALE_OAK_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"pale_oak_planks_hanging_sign");
    public static final Identifier PALE_OAK_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"pale_oak_planks_wall_hanging_sign");
    public static final Identifier CRIMSON_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"crimson_planks_hanging_sign");
    public static final Identifier CRIMSON_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"crimson_planks_wall_hanging_sign");
    public static final Identifier WARPED_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"warped_planks_hanging_sign");
    public static final Identifier WARPED_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"warped_planks_wall_hanging_sign");
    public static final Identifier CACTUS_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cactus_planks_hanging_sign");
    public static final Identifier CACTUS_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"cactus_planks_wall_hanging_sign");
    public static final Identifier WOODEN_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"wooden_planks_hanging_sign");
    public static final Identifier WOODEN_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"wooden_planks_wall_hanging_sign");
    public static final Identifier MUSHROOM_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_planks_hanging_sign");
    public static final Identifier MUSHROOM_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"mushroom_planks_wall_hanging_sign");
    public static final Identifier IRON_CAP_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"iron_cap_planks_hanging_sign");
    public static final Identifier IRON_CAP_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"iron_cap_planks_wall_hanging_sign");
    public static final Identifier DRIFTWOOD_PLANKS_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"driftwood_planks_hanging_sign");
    public static final Identifier DRIFTWOOD_PLANKS_WALL_HANGING_SIGN_ID = Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"driftwood_planks_wall_hanging_sign");

    public static final StandingSignBlock STANDING_CACTUS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CACTUS_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CACTUS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final WallSignBlock WALL_CACTUS_SIGN  = TerraformSignBlockHelper.registerSignBlock
            (CACTUS_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CACTUS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_CACTUS_SIGN.getLootTable()));

    public static final StandingSignBlock STANDING_WOODEN_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WOODEN_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WOODEN_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final WallSignBlock WALL_WOODEN_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WOODEN_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WOODEN_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_WOODEN_SIGN.getLootTable()));

    public static final Block STANDING_MUSHROOM_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_SIGN_ID, settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_MUSHROOM_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_WALL_SIGN_ID, settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_MUSHROOM_SIGN.getLootTable()));

    public static final Block STANDING_IRON_CAP_SIGN = TerraformSignBlockHelper.registerSignBlock
            (IRON_CAP_SIGN_ID, settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.IRON_CAP_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_IRON_CAP_SIGN = TerraformSignBlockHelper.registerSignBlock
            (IRON_CAP_WALL_SIGN_ID,  settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.IRON_CAP_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_MUSHROOM_SIGN.getLootTable()));

    public static final StandingSignBlock STANDING_DRIFTWOOD_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DRIFTWOOD_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DRIFTWOOD_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final WallSignBlock WALL_DRIFTWOOD_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DRIFTWOOD_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DRIFTWOOD_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_DRIFTWOOD_SIGN.getLootTable()));

    public static final Block HANGING_CACTUS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CACTUS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CACTUS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_CACTUS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CACTUS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CACTUS_TYPE, settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_CACTUS_SIGN.getLootTable()));

    public static final Block HANGING_MUSHROOM_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_MUSHROOM_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_MUSHROOM_SIGN.getLootTable()));

    public static final Block HANGING_IRON_CAP_SIGN = TerraformSignBlockHelper.registerSignBlock
            (IRON_CAP_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.IRON_CAP_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_IRON_CAP_SIGN = TerraformSignBlockHelper.registerSignBlock
            (IRON_CAP_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.IRON_CAP_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_IRON_CAP_SIGN.getLootTable()));

    public static final CeilingHangingSignBlock HANGING_WOODEN_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WOODEN_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WOODEN_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final WallHangingSignBlock WALL_HANGING_WOODEN_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WOODEN_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WOODEN_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_WOODEN_SIGN.getLootTable()));

    public static final CeilingHangingSignBlock HANGING_DRIFTWOOD_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DRIFTWOOD_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DRIFTWOOD_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final WallHangingSignBlock WALL_HANGING_DRIFTWOOD_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DRIFTWOOD_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DRIFTWOOD_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_DRIFTWOOD_SIGN.getLootTable()));

    public static final Block STANDING_STRIPPED_OAK_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_OAK_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_OAK_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_OAK_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_OAK_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_OAK_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_OAK_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_SPRUCE_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_SPRUCE_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_SPRUCE_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_SPRUCE_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_SPRUCE_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_SPRUCE_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_SPRUCE_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_BIRCH_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_BIRCH_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_BIRCH_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_BIRCH_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_BIRCH_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_BIRCH_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_BIRCH_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_JUNGLE_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_JUNGLE_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_JUNGLE_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_JUNGLE_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_JUNGLE_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_JUNGLE_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_JUNGLE_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_ACACIA_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_ACACIA_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_ACACIA_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_ACACIA_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_ACACIA_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_ACACIA_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_ACACIA_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_DARK_OAK_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_DARK_OAK_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_DARK_OAK_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_DARK_OAK_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_DARK_OAK_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_DARK_OAK_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_DARK_OAK_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_MANGROVE_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_MANGROVE_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_MANGROVE_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_MANGROVE_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_MANGROVE_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_MANGROVE_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_MANGROVE_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_CHERRY_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_CHERRY_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_CHERRY_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SIGN));
    public static final Block WALL_STRIPPED_CHERRY_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_CHERRY_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_CHERRY_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_CHERRY_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_PALE_OAK_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_PALE_OAK_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_PALE_OAK_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_PALE_OAK_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_PALE_OAK_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_PALE_OAK_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_PALE_OAK_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_CRIMSON_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_CRIMSON_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_CRIMSON_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_SIGN));
    public static final Block WALL_STRIPPED_CRIMSON_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_CRIMSON_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_CRIMSON_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_CRIMSON_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_WARPED_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_WARPED_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_WARPED_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_SIGN));
    public static final Block WALL_STRIPPED_WARPED_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_WARPED_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_WARPED_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_WARPED_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_WOODEN_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_WOODEN_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_WOODEN_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_WOODEN_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_WOODEN_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_WOODEN_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_WOODEN_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_DRIFTWOOD_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_DRIFTWOOD_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_DRIFTWOOD_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_DRIFTWOOD_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_DRIFTWOOD_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_DRIFTWOOD_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_DRIFTWOOD_SIGN.getLootTable()));

    public static final Block STANDING_STRIPPED_CACTUS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_CACTUS_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_CACTUS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_CACTUS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_CACTUS_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_CACTUS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_CACTUS_SIGN.getLootTable()));
    public static final Block STANDING_MUSHROOM_STEM_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_STEM_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_STEM_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_MUSHROOM_STEM_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_STEM_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_STEM_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_MUSHROOM_STEM_SIGN.getLootTable()));
    public static final Block STANDING_STRIPPED_IRON_CAP_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_IRON_CAP_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_IRON_CAP_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_STRIPPED_IRON_CAP_SIGN = TerraformSignBlockHelper.registerSignBlock
            (STRIPPED_IRON_CAP_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.STRIPPED_IRON_CAP_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_STRIPPED_IRON_CAP_SIGN.getLootTable()));

    public static final Block STANDING_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (OAK_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (OAK_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_OAK_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_SPRUCE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (SPRUCE_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.SPRUCE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_SPRUCE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (SPRUCE_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.SPRUCE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_SPRUCE_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_BIRCH_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (BIRCH_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.BIRCH_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_BIRCH_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (BIRCH_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.BIRCH_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_BIRCH_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_JUNGLE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (JUNGLE_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.JUNGLE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_JUNGLE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (JUNGLE_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.JUNGLE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_JUNGLE_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_ACACIA_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (ACACIA_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.ACACIA_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_ACACIA_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (ACACIA_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.ACACIA_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_ACACIA_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_DARK_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DARK_OAK_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DARK_OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_DARK_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DARK_OAK_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DARK_OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_DARK_OAK_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_MANGROVE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MANGROVE_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MANGROVE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_MANGROVE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MANGROVE_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MANGROVE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_MANGROVE_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_CHERRY_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CHERRY_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CHERRY_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SIGN));
    public static final Block WALL_CHERRY_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CHERRY_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CHERRY_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WALL_SIGN).overrideLootTable(STANDING_CHERRY_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_PALE_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (PALE_OAK_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.PALE_OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_PALE_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (PALE_OAK_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.PALE_OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_PALE_OAK_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_BAMBOO_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (BAMBOO_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.BAMBOO_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_SIGN));
    public static final Block WALL_BAMBOO_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (BAMBOO_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.BAMBOO_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_WALL_SIGN).overrideLootTable(STANDING_BAMBOO_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_CRIMSON_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CRIMSON_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CRIMSON_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_SIGN));
    public static final Block WALL_CRIMSON_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CRIMSON_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CRIMSON_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_WALL_SIGN).overrideLootTable(STANDING_CRIMSON_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_WARPED_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WARPED_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WARPED_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_SIGN));
    public static final Block WALL_WARPED_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WARPED_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WARPED_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WALL_SIGN).overrideLootTable(STANDING_WARPED_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_CACTUS_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CACTUS_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CACTUS_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_CACTUS_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CACTUS_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CACTUS_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_CACTUS_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_WOODEN_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WOODEN_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WOODEN_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_WOODEN_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WOODEN_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WOODEN_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_WOODEN_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_DRIFTWOOD_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DRIFTWOOD_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DRIFTWOOD_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_DRIFTWOOD_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DRIFTWOOD_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DRIFTWOOD_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_DRIFTWOOD_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_MUSHROOM_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_MUSHROOM_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_MUSHROOM_MOSAIC_SIGN.getLootTable()));
    public static final Block STANDING_IRON_CAP_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (IRON_CAP_MOSAIC_SIGN_ID,settings -> new StandingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.IRON_CAP_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_IRON_CAP_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (IRON_CAP_MOSAIC_WALL_SIGN_ID,settings -> new WallSignBlock(net.gecko.varandeco.block.DecoWoodTypes.IRON_CAP_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).overrideLootTable(STANDING_IRON_CAP_MOSAIC_SIGN.getLootTable()));

    public static final Block HANGING_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (OAK_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (OAK_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_OAK_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_SPRUCE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (SPRUCE_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.SPRUCE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_SPRUCE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (SPRUCE_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.SPRUCE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_SPRUCE_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_BIRCH_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (BIRCH_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.BIRCH_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_BIRCH_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (BIRCH_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.BIRCH_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_BIRCH_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_JUNGLE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (JUNGLE_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.JUNGLE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_JUNGLE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (JUNGLE_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.JUNGLE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_JUNGLE_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_ACACIA_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (ACACIA_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.ACACIA_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_ACACIA_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (ACACIA_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.ACACIA_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_ACACIA_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_DARK_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DARK_OAK_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DARK_OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_DARK_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DARK_OAK_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DARK_OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_DARK_OAK_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_MANGROVE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MANGROVE_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MANGROVE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_MANGROVE_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MANGROVE_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MANGROVE_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_MANGROVE_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_CHERRY_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CHERRY_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CHERRY_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_HANGING_SIGN));
    public static final Block WALL_HANGING_CHERRY_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CHERRY_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CHERRY_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WALL_HANGING_SIGN).overrideLootTable(HANGING_CHERRY_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_PALE_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (PALE_OAK_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.PALE_OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_PALE_OAK_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (PALE_OAK_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.PALE_OAK_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_PALE_OAK_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_BAMBOO_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (BAMBOO_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.BAMBOO_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_HANGING_SIGN));
    public static final Block WALL_HANGING_BAMBOO_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (BAMBOO_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.BAMBOO_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_WALL_HANGING_SIGN).overrideLootTable(HANGING_BAMBOO_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_CRIMSON_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CRIMSON_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CRIMSON_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_HANGING_SIGN));
    public static final Block WALL_HANGING_CRIMSON_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CRIMSON_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CRIMSON_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_WALL_HANGING_SIGN).overrideLootTable(HANGING_CRIMSON_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_WARPED_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WARPED_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WARPED_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HANGING_SIGN));
    public static final Block WALL_HANGING_WARPED_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WARPED_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WARPED_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WALL_HANGING_SIGN).overrideLootTable(HANGING_WARPED_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_CACTUS_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CACTUS_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CACTUS_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_CACTUS_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CACTUS_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CACTUS_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_CACTUS_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_WOODEN_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WOODEN_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WOODEN_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_WOODEN_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WOODEN_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WOODEN_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_WOODEN_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_DRIFTWOOD_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DRIFTWOOD_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DRIFTWOOD_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_DRIFTWOOD_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DRIFTWOOD_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DRIFTWOOD_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_DRIFTWOOD_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_MUSHROOM_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_MUSHROOM_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_MUSHROOM_MOSAIC_SIGN.getLootTable()));
    public static final Block HANGING_IRON_CAP_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (IRON_CAP_MOSAIC_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.IRON_CAP_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_IRON_CAP_MOSAIC_SIGN = TerraformSignBlockHelper.registerSignBlock
            (IRON_CAP_MOSAIC_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.IRON_CAP_MOSAIC_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_IRON_CAP_MOSAIC_SIGN.getLootTable()));

    public static final Block HANGING_OAK_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (OAK_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.OAK_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_OAK_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (OAK_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.OAK_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_OAK_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_SPRUCE_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (SPRUCE_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.SPRUCE_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_SPRUCE_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (SPRUCE_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.SPRUCE_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_SPRUCE_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_BIRCH_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (BIRCH_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.BIRCH_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_BIRCH_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (BIRCH_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.BIRCH_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_BIRCH_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_JUNGLE_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (JUNGLE_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.JUNGLE_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_JUNGLE_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (JUNGLE_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.JUNGLE_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_JUNGLE_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_ACACIA_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (ACACIA_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.ACACIA_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_ACACIA_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (ACACIA_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.ACACIA_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_ACACIA_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_DARK_OAK_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DARK_OAK_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DARK_OAK_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_DARK_OAK_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DARK_OAK_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DARK_OAK_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_DARK_OAK_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_MANGROVE_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MANGROVE_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MANGROVE_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_MANGROVE_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MANGROVE_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MANGROVE_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_MANGROVE_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_CHERRY_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CHERRY_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CHERRY_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_HANGING_SIGN));
    public static final Block WALL_HANGING_CHERRY_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CHERRY_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CHERRY_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WALL_HANGING_SIGN).overrideLootTable(HANGING_CHERRY_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_PALE_OAK_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (PALE_OAK_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.PALE_OAK_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_PALE_OAK_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (PALE_OAK_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.PALE_OAK_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_PALE_OAK_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_CRIMSON_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CRIMSON_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CRIMSON_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_HANGING_SIGN));
    public static final Block WALL_HANGING_CRIMSON_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CRIMSON_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CRIMSON_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_WALL_HANGING_SIGN).overrideLootTable(HANGING_CRIMSON_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_WARPED_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WARPED_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WARPED_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HANGING_SIGN));
    public static final Block WALL_HANGING_WARPED_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WARPED_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WARPED_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WALL_HANGING_SIGN).overrideLootTable(HANGING_WARPED_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_CACTUS_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CACTUS_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CACTUS_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_CACTUS_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (CACTUS_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.CACTUS_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_CACTUS_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_WOODEN_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WOODEN_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WOODEN_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_WOODEN_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (WOODEN_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.WOODEN_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_WOODEN_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_DRIFTWOOD_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DRIFTWOOD_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DRIFTWOOD_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_DRIFTWOOD_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (DRIFTWOOD_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.DRIFTWOOD_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_DRIFTWOOD_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_IRON_CAP_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (IRON_CAP_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.IRON_CAP_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_IRON_CAP_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (IRON_CAP_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.IRON_CAP_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_IRON_CAP_PLANKS_SIGN.getLootTable()));
    public static final Block HANGING_MUSHROOM_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_PLANKS_HANGING_SIGN_ID,settings -> new CeilingHangingSignBlock(net.gecko.varandeco.block.DecoWoodTypes.MUSHROOM_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_MUSHROOM_PLANKS_SIGN = TerraformSignBlockHelper.registerSignBlock
            (MUSHROOM_PLANKS_WALL_HANGING_SIGN_ID,settings -> new WallHangingSignBlock(DecoWoodTypes.MUSHROOM_PLANKS_TYPE, settings),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).overrideLootTable(HANGING_MUSHROOM_PLANKS_SIGN.getLootTable()));

    public static final Block STONE_TEMP = registerBlockTemp("stone_temp", Block::new);
    public static final Block SMOOTH_STONE_TEMP = registerBlockTemp("smooth_stone_temp", Block::new);
    public static final Block POLISHED_ANDESITE_TEMP = registerBlockTemp("polished_andesite_temp", Block::new);
    public static final Block POLISHED_DIORITE_TEMP = registerBlockTemp("polished_diorite_temp", Block::new);
    public static final Block POLISHED_GRANITE_TEMP = registerBlockTemp("polished_granite_temp", Block::new);
    public static final Block DRIPSTONE_TEMP = registerBlockTemp("dripstone_temp",Block::new);
    public static final Block CALCITE_TEMP = registerBlockTemp("calcite_temp",Block::new);
    public static final Block TUFF_TEMP = registerBlockTemp("tuff_temp",Block::new);
    public static final Block PACKED_MUD_TEMP = registerBlockTemp("packed_mud_temp",Block::new);
    public static final Block NETHER_BRICKS_TEMP = registerBlockTemp("nether_bricks_temp",Block::new);
    public static final Block RED_NETHER_BRICKS_TEMP = registerBlockTemp("red_nether_bricks_temp",Block::new);
    public static final Block NETHERRACK_TEMP = registerBlockTemp("netherrack_temp",Block::new);
    public static final Block MAGMA_TEMP = registerBlockTemp("magma_temp",Block::new);
    public static final Block SNOW_TEMP = registerBlockTemp("snow_temp",Block::new);
    public static final Block PACKED_ICE_TEMP = registerBlockTemp("packed_ice_temp",Block::new);
    public static final Block BLUE_ICE_TEMP = registerBlockTemp("blue_ice_temp",Block::new);
    public static final Block SANDSTONE_TOP_TEMP = registerBlockTemp("sandstone_top_temp",Block::new);
    public static final Block RED_SANDSTONE_TOP_TEMP = registerBlockTemp("red_sandstone_top_temp",Block::new);
    public static final Block DARK_PRISMARINE_TEMP = registerBlockTemp("dark_prismarine_temp",Block::new);
    public static final Block PRISMARINE_BRICKS_TEMP = registerBlockTemp("prismarine_bricks_temp",Block::new);
    public static final Block QUARTZ_TEMP = registerBlockTemp("quartz_temp",Block::new);
    public static final Block SMOOTH_QUARTZ_TEMP = registerBlockTemp("smooth_quartz_temp",Block::new);
    public static final Block QUARTZ_BRICKS_TEMP = registerBlockTemp("quartz_bricks_temp",Block::new);
    public static final Block TERRACOTTA_TEMP = registerBlockTemp("terracotta_temp",Block::new);
    public static final Block WHITE_TERRACOTTA_TEMP = registerBlockTemp("white_terracotta_temp",Block::new);
    public static final Block LIGHT_GRAY_TERRACOTTA_TEMP = registerBlockTemp("light_gray_terracotta_temp",Block::new);
    public static final Block GRAY_TERRACOTTA_TEMP = registerBlockTemp("gray_terracotta_temp",Block::new);
    public static final Block BLACK_TERRACOTTA_TEMP = registerBlockTemp("black_terracotta_temp",Block::new);
    public static final Block BROWN_TERRACOTTA_TEMP = registerBlockTemp("brown_terracotta_temp",Block::new);
    public static final Block RED_TERRACOTTA_TEMP = registerBlockTemp("red_terracotta_temp",Block::new);
    public static final Block ORANGE_TERRACOTTA_TEMP = registerBlockTemp("orange_terracotta_temp",Block::new);
    public static final Block YELLOW_TERRACOTTA_TEMP = registerBlockTemp("yellow_terracotta_temp",Block::new);
    public static final Block LIME_TERRACOTTA_TEMP = registerBlockTemp("lime_terracotta_temp",Block::new);
    public static final Block GREEN_TERRACOTTA_TEMP = registerBlockTemp("green_terracotta_temp",Block::new);
    public static final Block CYAN_TERRACOTTA_TEMP = registerBlockTemp("cyan_terracotta_temp",Block::new);
    public static final Block LIGHT_BLUE_TERRACOTTA_TEMP = registerBlockTemp("light_blue_terracotta_temp",Block::new);
    public static final Block BLUE_TERRACOTTA_TEMP = registerBlockTemp("blue_terracotta_temp",Block::new);
    public static final Block PURPLE_TERRACOTTA_TEMP = registerBlockTemp("purple_terracotta_temp",Block::new);
    public static final Block MAGENTA_TERRACOTTA_TEMP = registerBlockTemp("magenta_terracotta_temp",Block::new);
    public static final Block PINK_TERRACOTTA_TEMP = registerBlockTemp("pink_terracotta_temp",Block::new);
    public static final Block WHITE_CONCRETE_TEMP = registerBlockTemp("white_concrete_temp",Block::new);
    public static final Block LIGHT_GRAY_CONCRETE_TEMP = registerBlockTemp("light_gray_concrete_temp",Block::new);
    public static final Block GRAY_CONCRETE_TEMP = registerBlockTemp("gray_concrete_temp",Block::new);
    public static final Block BLACK_CONCRETE_TEMP = registerBlockTemp("black_concrete_temp",Block::new);
    public static final Block BROWN_CONCRETE_TEMP = registerBlockTemp("brown_concrete_temp",Block::new);
    public static final Block RED_CONCRETE_TEMP = registerBlockTemp("red_concrete_temp",Block::new);
    public static final Block ORANGE_CONCRETE_TEMP = registerBlockTemp("orange_concrete_temp",Block::new);
    public static final Block YELLOW_CONCRETE_TEMP = registerBlockTemp("yellow_concrete_temp",Block::new);
    public static final Block LIME_CONCRETE_TEMP = registerBlockTemp("lime_concrete_temp",Block::new);
    public static final Block GREEN_CONCRETE_TEMP = registerBlockTemp("green_concrete_temp",Block::new);
    public static final Block CYAN_CONCRETE_TEMP = registerBlockTemp("cyan_concrete_temp",Block::new);
    public static final Block LIGHT_BLUE_CONCRETE_TEMP = registerBlockTemp("light_blue_concrete_temp",Block::new);
    public static final Block BLUE_CONCRETE_TEMP = registerBlockTemp("blue_concrete_temp",Block::new);
    public static final Block PURPLE_CONCRETE_TEMP = registerBlockTemp("purple_concrete_temp",Block::new);
    public static final Block MAGENTA_CONCRETE_TEMP = registerBlockTemp("magenta_concrete_temp",Block::new);
    public static final Block PINK_CONCRETE_TEMP = registerBlockTemp("pink_concrete_temp",Block::new);
    public static final Block END_STONE_TEMP = registerBlockTemp("end_stone_temp",Block::new);
    public static final Block OBSIDIAN_TEMP = registerBlockTemp("obsidian_temp",Block::new);
    public static final Block POLISHED_DEEPSLATE_TEMP = registerBlockTemp("polished_deepslate_temp",Block::new);
    public static final Block DEEPSLATE_TEMP = registerBlockTemp("deepslate_temp",Block::new);
    public static final Block BLACKSTONE_TEMP = registerBlockTemp("blackstone_temp",Block::new);
    public static final Block COBBLESTONE_TEMP = registerBlockTemp("cobblestone_temp",Block::new);
    public static final Block COBBLED_DEEPSLATE_TEMP = registerBlockTemp("cobbled_deepslate_temp",Block::new);
    public static final Block ACACIA_WOOD_TEMP = registerBlockTemp("acacia_wood_temp",Block::new);
    public static final Block BIRCH_WOOD_TEMP = registerBlockTemp("birch_wood_temp",Block::new);
    public static final Block CRIMSON_WOOD_TEMP = registerBlockTemp("crimson_wood_temp",Block::new);
    public static final Block DARK_OAK_WOOD_TEMP = registerBlockTemp("dark_oak_wood_temp",Block::new);
    public static final Block JUNGLE_WOOD_TEMP = registerBlockTemp("jungle_wood_temp",Block::new);
    public static final Block MANGROVE_WOOD_TEMP = registerBlockTemp("mangrove_wood_temp",Block::new);
    public static final Block OAK_WOOD_TEMP = registerBlockTemp("oak_wood_temp",Block::new);
    public static final Block SPRUCE_WOOD_TEMP = registerBlockTemp("spruce_wood_temp",Block::new);
    public static final Block WARPED_WOOD_TEMP = registerBlockTemp("warped_wood_temp",Block::new);
    public static final Block WOODEN_WOOD_TEMP = registerBlockTemp("wooden_wood_temp",Block::new);
    public static final Block PALE_OAK_WOOD_TEMP = registerBlockTemp("pale_oak_wood_temp",Block::new);
    public static final Block STRIPPED_OAK_TEMP = registerBlockTemp("stripped_oak_temp",Block::new);
    public static final Block STRIPPED_SPRUCE_TEMP = registerBlockTemp("stripped_spruce_temp",Block::new);
    public static final Block STRIPPED_BIRCH_TEMP = registerBlockTemp("stripped_birch_temp",Block::new);
    public static final Block STRIPPED_JUNGLE_TEMP = registerBlockTemp("stripped_jungle_temp",Block::new);
    public static final Block STRIPPED_ACACIA_TEMP = registerBlockTemp("stripped_acacia_temp",Block::new);
    public static final Block STRIPPED_DARK_OAK_TEMP = registerBlockTemp("stripped_dark_oak_temp",Block::new);
    public static final Block STRIPPED_MANGROVE_TEMP = registerBlockTemp("stripped_mangrove_temp",Block::new);
    public static final Block STRIPPED_CHERRY_TEMP = registerBlockTemp("stripped_cherry_temp",Block::new);
    public static final Block STRIPPED_CRIMSON_TEMP = registerBlockTemp("stripped_crimson_temp",Block::new);
    public static final Block STRIPPED_WARPED_TEMP = registerBlockTemp("stripped_warped_temp",Block::new);
    public static final Block STRIPPED_WOODEN_TEMP = registerBlockTemp("stripped_wooden_temp",Block::new);
    public static final Block STRIPPED_PALE_OAK_TEMP = registerBlockTemp("stripped_pale_oak_temp",Block::new);
    public static final Block BAMBOO_MOSAIC_TEMP = registerBlockTemp("bamboo_mosaic_temp",Block::new);
    public static final Block SPRUCE_MOSAIC_TEMP = registerBlockTemp("spruce_mosaic_temp",Block::new);
    public static final Block JUNGLE_MOSAIC_TEMP = registerBlockTemp("jungle_mosaic_temp",Block::new);
    public static final Block DARK_OAK_MOSAIC_TEMP = registerBlockTemp("dark_oak_mosaic_temp",Block::new);
    public static final Block CRIMSON_MOSAIC_TEMP = registerBlockTemp("crimson_mosaic_temp",Block::new);
    public static final Block CACTUS_MOSAIC_TEMP = registerBlockTemp("cactus_mosaic_temp",Block::new);
    public static final Block PALE_OAK_MOSAIC_TEMP = registerBlockTemp("pale_oak_mosaic_temp",Block::new);
    public static final Block DRIFTWOOD_MOSAIC_TEMP = registerBlockTemp("driftwood_mosaic_temp",Block::new);
    public static final Block POLISHED_TUFF_TEMP = registerBlockTemp("polished_tuff_temp",Block::new);
    public static final Block PURPUR_TEMP = registerBlockTemp("purpur_temp",Block::new);
    public static final Block SMOOTH_BASALT_TEMP = registerBlockTemp("smooth_basalt_temp",Block::new);
    public static final Block IRON_TEMP = registerBlockTemp("iron_temp",Block::new);
    public static final Block GOLD_TEMP = registerBlockTemp("gold_temp",Block::new);
    public static final Block COPPER_TEMP = registerBlockTemp("copper_temp",Block::new);
    public static final Block EXPOSED_COPPER_TEMP = registerBlockTemp("exposed_copper_temp",Block::new);
    public static final Block WEATHERED_COPPER_TEMP = registerBlockTemp("weathered_copper_temp",Block::new);
    public static final Block OXIDIZED_COPPER_TEMP = registerBlockTemp("oxidized_copper_temp",Block::new);
    public static final Block RAW_IRON_TEMP = registerBlockTemp("raw_iron_temp",Block::new);
    public static final Block RAW_GOLD_TEMP = registerBlockTemp("raw_gold_temp",Block::new);
    public static final Block RAW_COPPER_TEMP = registerBlockTemp("raw_copper_temp",Block::new);
    public static final Block CHERRY_WOOD_TEMP = registerBlockTemp("cherry_wood_temp",Block::new);
    public static final Block STRIPPED_CACTUS_TEMP = registerBlockTemp("stripped_cactus_temp",Block::new);
    public static final Block MUSHROOM_STEM_TEMP = registerBlockTemp("mushroom_stem_temp",Block::new);
    public static final Block IRON_CAP_STEM_TEMP = registerBlockTemp("iron_cap_stem_temp",Block::new);
    public static final Block STRIPPED_IRON_CAP_TEMP = registerBlockTemp("stripped_iron_cap_temp",Block::new);
    public static final Block STRIPPED_DRIFTWOOD_TEMP = registerBlockTemp("stripped_driftwood_temp",Block::new);
    public static final Block DRIFTWOOD_TEMP = registerBlockTemp("driftwood_temp",Block::new);
    public static final Block DRIED_DRIFTWOOD_TEMP = registerBlockTemp("dried_driftwood_temp",Block::new);
    public static final Block DRY_GRASS_TEMP = registerBlockTemp("dry_grass_temp",Block::new);
    public static final Block PODZOL_TEMP = registerBlockTemp("podzol_temp",Block::new);
    public static final Block MYCELIUM_TEMP = registerBlockTemp("mycelium_temp",Block::new);
    public static final Block CRIMSON_NYLIUM_TEMP = registerBlockTemp("crimson_nylium_temp",Block::new);
    public static final Block WARPED_NYLIUM_TEMP = registerBlockTemp("warped_nylium_temp",Block::new);
    public static final Block DIRT_TEMP = registerBlockTemp("dirt_temp",Block::new);
    public static final Block COARSE_DIRT_TEMP = registerBlockTemp("coarse_dirt_temp",Block::new);
    public static final Block ROOTED_DIRT_TEMP = registerBlockTemp("rooted_dirt_temp",Block::new);
    public static final Block MUD_TEMP = registerBlockTemp("mud_temp",Block::new);
    public static final Block CLAY_TEMP = registerBlockTemp("clay_temp",Block::new);
    public static final Block MOSS_TEMP = registerBlockTemp("moss_temp",Block::new);
    public static final Block PALE_MOSS_TEMP = registerBlockTemp("pale_moss_temp",Block::new);
    public static final Block BONE_TEMP = registerBlockTemp("bone_temp",Block::new);
    public static final Block BEDROCK_TEMP = registerBlockTemp("bedrock_temp",Block::new);
    public static final Block WHITE_WOOL_TEMP = registerBlockTemp("white_wool_temp",Block::new);
    public static final Block LIGHT_GRAY_WOOL_TEMP = registerBlockTemp("light_gray_wool_temp",Block::new);
    public static final Block GRAY_WOOL_TEMP = registerBlockTemp("gray_wool_temp",Block::new);
    public static final Block BLACK_WOOL_TEMP = registerBlockTemp("black_wool_temp",Block::new);
    public static final Block BROWN_WOOL_TEMP = registerBlockTemp("brown_wool_temp",Block::new);
    public static final Block RED_WOOL_TEMP = registerBlockTemp("red_wool_temp",Block::new);
    public static final Block ORANGE_WOOL_TEMP = registerBlockTemp("orange_wool_temp",Block::new);
    public static final Block YELLOW_WOOL_TEMP = registerBlockTemp("yellow_wool_temp",Block::new);
    public static final Block LIME_WOOL_TEMP = registerBlockTemp("lime_wool_temp",Block::new);
    public static final Block GREEN_WOOL_TEMP = registerBlockTemp("green_wool_temp",Block::new);
    public static final Block CYAN_WOOL_TEMP = registerBlockTemp("cyan_wool_temp",Block::new);
    public static final Block LIGHT_BLUE_WOOL_TEMP = registerBlockTemp("light_blue_wool_temp",Block::new);
    public static final Block BLUE_WOOL_TEMP = registerBlockTemp("blue_wool_temp",Block::new);
    public static final Block PURPLE_WOOL_TEMP = registerBlockTemp("purple_wool_temp",Block::new);
    public static final Block MAGENTA_WOOL_TEMP = registerBlockTemp("magenta_wool_temp",Block::new);
    public static final Block PINK_WOOL_TEMP = registerBlockTemp("pink_wool_temp",Block::new);
    public static final Block RESIN_TEMP = registerBlockTemp("resin_temp",Block::new);
    public static final Block CRACKED_STONE_BRICKS_TEMP = registerBlockTemp("cracked_stone_bricks_temp",Block::new);
    public static final Block CRACKED_DEEPSLATE_BRICKS_TEMP = registerBlockTemp("cracked_deepslate_bricks_temp",Block::new);
    public static final Block CRACKED_DEEPSLATE_TILES_TEMP = registerBlockTemp("cracked_deepslate_tiles_temp",Block::new);
    public static final Block CRACKED_NETHER_BRICKS_TEMP = registerBlockTemp("cracked_nether_bricks_temp",Block::new);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_TEMP = registerBlockTemp("cracked_polished_blackstone_bricks_temp",Block::new);
    public static final Block LAPIS_TEMP = registerBlockTemp("lapis_temp",Block::new);
    public static final Block DRIPSTONE_BRICK_PILLAR_TEMP = registerBlockTemp("dripstone_brick_pillar_temp",Block::new);
    public static final Block VOID_STONE_BRICK_PILLAR_TEMP = registerBlockTemp("void_stone_brick_pillar_temp",Block::new);
    public static final Block TUBE_CORAL_TEMP = registerBlockTemp("tube_coral_temp",Block::new);
    public static final Block BRAIN_CORAL_TEMP = registerBlockTemp("brain_coral_temp",Block::new);
    public static final Block BUBBLE_CORAL_TEMP = registerBlockTemp("bubble_coral_temp",Block::new);
    public static final Block FIRE_CORAL_TEMP = registerBlockTemp("fire_coral_temp",Block::new);
    public static final Block HORN_CORAL_TEMP = registerBlockTemp("horn_coral_temp",Block::new);
    public static final Block DEAD_TUBE_CORAL_TEMP = registerBlockTemp("dead_tube_coral_temp",Block::new);
    public static final Block DEAD_BRAIN_CORAL_TEMP = registerBlockTemp("dead_brain_coral_temp",Block::new);
    public static final Block DEAD_BUBBLE_CORAL_TEMP = registerBlockTemp("dead_bubble_coral_temp",Block::new);
    public static final Block DEAD_FIRE_CORAL_TEMP = registerBlockTemp("dead_fire_coral_temp",Block::new);
    public static final Block DEAD_HORN_CORAL_TEMP = registerBlockTemp("dead_horn_coral_temp",Block::new);
    public static final Block HAY_TEMP = registerBlockTemp("hay_temp",Block::new);
    public static final Block HAY_CARPET_TEMP = registerBlockTemp("hay_carpet_temp",Block::new);
    public static final Block NETHER_WART_TEMP = registerBlockTemp("nether_wart_temp",Block::new);
    public static final Block WARPED_WART_TEMP = registerBlockTemp("warped_wart_temp",Block::new);
    public static final Block SCULK_TEMP = registerBlockTemp("sculk_temp",Block::new);
    public static final Block SCULK_CARPET_TEMP = registerBlockTemp("sculk_carpet_temp",Block::new);
    public static final Block HONEYCOMB_TEMP = registerBlockTemp("honeycomb_temp",Block::new);
    public static final Block BAMBOO_TEMP = registerBlockTemp("bamboo_temp",Block::new);
    public static final Block STRIPPED_BAMBOO_TEMP = registerBlockTemp("stripped_bamboo_temp",Block::new);

    public static final BlockFamily CACTUS_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.CACTUS_PLANKS)
            .sign(DecoBlocks.STANDING_CACTUS_SIGN,DecoBlocks.WALL_CACTUS_SIGN)
            .recipeGroupPrefix("wooden").recipeUnlockedBy("has_planks").getFamily();
    public static final BlockFamily MUSHROOM_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.MUSHROOM_PLANKS)
            .sign(DecoBlocks.STANDING_MUSHROOM_SIGN,DecoBlocks.WALL_MUSHROOM_SIGN)
            .recipeGroupPrefix("wooden").recipeUnlockedBy("has_planks").getFamily();
    public static final BlockFamily IRON_CAP_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.IRON_CAP_PLANKS)
            .sign(DecoBlocks.STANDING_IRON_CAP_SIGN,DecoBlocks.WALL_IRON_CAP_SIGN)
            .recipeGroupPrefix("iron_cap").recipeUnlockedBy("has_planks").getFamily();
    public static final BlockFamily WOODEN_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.WOODEN_PLANKS)
            .sign(DecoBlocks.STANDING_WOODEN_SIGN,DecoBlocks.WALL_WOODEN_SIGN)
            .recipeGroupPrefix("wooden").recipeUnlockedBy("has_planks").getFamily();
    public static final BlockFamily DRIFTWOOD_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.DRIFTWOOD_PLANKS)
            .sign(DecoBlocks.STANDING_DRIFTWOOD_SIGN,DecoBlocks.WALL_DRIFTWOOD_SIGN)
            .recipeGroupPrefix("driftwood").recipeUnlockedBy("has_planks").getFamily();

    public static final BlockFamily STRIPPED_OAK_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_OAK_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_OAK_SIGN,DecoBlocks.WALL_STRIPPED_OAK_SIGN)
            .recipeGroupPrefix("stripped_oak").getFamily();
    public static final BlockFamily STRIPPED_SPRUCE_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_SPRUCE_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_SPRUCE_SIGN,DecoBlocks.WALL_STRIPPED_SPRUCE_SIGN)
            .recipeGroupPrefix("stripped_spruce").getFamily();
    public static final BlockFamily STRIPPED_BIRCH_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_BIRCH_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_BIRCH_SIGN,DecoBlocks.WALL_STRIPPED_BIRCH_SIGN)
            .recipeGroupPrefix("stripped_birch").getFamily();
    public static final BlockFamily STRIPPED_JUNGLE_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_JUNGLE_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_JUNGLE_SIGN,DecoBlocks.WALL_STRIPPED_JUNGLE_SIGN)
            .recipeGroupPrefix("stripped_jungle").getFamily();
    public static final BlockFamily STRIPPED_DARK_OAK_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_DARK_OAK_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_DARK_OAK_SIGN,DecoBlocks.WALL_STRIPPED_DARK_OAK_SIGN)
            .recipeGroupPrefix("stripped_dark_oak").getFamily();
    public static final BlockFamily STRIPPED_ACACIA_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_ACACIA_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_ACACIA_SIGN,DecoBlocks.WALL_STRIPPED_ACACIA_SIGN)
            .recipeGroupPrefix("stripped_acacia").getFamily();
    public static final BlockFamily STRIPPED_CHERRY_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_CHERRY_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_CHERRY_SIGN,DecoBlocks.WALL_STRIPPED_CHERRY_SIGN)
            .recipeGroupPrefix("stripped_cherry").getFamily();
    public static final BlockFamily STRIPPED_MANGROVE_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_MANGROVE_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_MANGROVE_SIGN,DecoBlocks.WALL_STRIPPED_MANGROVE_SIGN)
            .recipeGroupPrefix("stripped_mangrove").getFamily();
    public static final BlockFamily STRIPPED_CRIMSON_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_CRIMSON_HYPHAE)
            .sign(DecoBlocks.STANDING_STRIPPED_CRIMSON_SIGN,DecoBlocks.WALL_STRIPPED_CRIMSON_SIGN)
            .recipeGroupPrefix("stripped_crimson").getFamily();
    public static final BlockFamily STRIPPED_WARPED_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_WARPED_HYPHAE)
            .sign(DecoBlocks.STANDING_STRIPPED_WARPED_SIGN,DecoBlocks.WALL_STRIPPED_WARPED_SIGN)
            .recipeGroupPrefix("stripped_warped").getFamily();
    public static final BlockFamily STRIPPED_CACTUS_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.STRIPPED_CACTUS)
            .sign(DecoBlocks.STANDING_STRIPPED_CACTUS_SIGN,DecoBlocks.WALL_STRIPPED_CACTUS_SIGN)
            .recipeGroupPrefix("stripped_cactus").getFamily();
    public static final BlockFamily STRIPPED_IRON_CAP_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE)
            .sign(DecoBlocks.STANDING_STRIPPED_IRON_CAP_SIGN,DecoBlocks.WALL_STRIPPED_IRON_CAP_SIGN)
            .recipeGroupPrefix("stripped_iron_cap").getFamily();
    public static final BlockFamily MUSHROOM_STEM_FAMILY = BlockFamilies.familyBuilder(Blocks.MUSHROOM_STEM)
            .sign(DecoBlocks.STANDING_MUSHROOM_STEM_SIGN,DecoBlocks.WALL_MUSHROOM_STEM_SIGN)
            .recipeGroupPrefix("mushroom_stem").getFamily();
    public static final BlockFamily STRIPPED_WOODEN_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.STRIPPED_WOODEN_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_WOODEN_SIGN,DecoBlocks.WALL_STRIPPED_WOODEN_SIGN)
            .recipeGroupPrefix("stripped_wooden").getFamily();
    public static final BlockFamily STRIPPED_PALE_OAK_FAMILY = BlockFamilies.familyBuilder(Blocks.STRIPPED_PALE_OAK_WOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_PALE_OAK_SIGN,DecoBlocks.WALL_STRIPPED_PALE_OAK_SIGN)
            .recipeGroupPrefix("stripped_pale_oak").getFamily();
    public static final BlockFamily STRIPPED_DRIFTWOOD_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.STRIPPED_DRIFTWOOD)
            .sign(DecoBlocks.STANDING_STRIPPED_DRIFTWOOD_SIGN,DecoBlocks.WALL_STRIPPED_DRIFTWOOD_SIGN)
            .recipeGroupPrefix("stripped_driftwood").getFamily();

    public static final BlockFamily OAK_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.OAK_MOSAIC)
            .sign(DecoBlocks.STANDING_OAK_MOSAIC_SIGN,DecoBlocks.WALL_OAK_MOSAIC_SIGN)
            .recipeGroupPrefix("oak_mosaic").getFamily();
    public static final BlockFamily SPRUCE_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.SPRUCE_MOSAIC)
            .sign(DecoBlocks.STANDING_SPRUCE_MOSAIC_SIGN,DecoBlocks.WALL_SPRUCE_MOSAIC_SIGN)
            .recipeGroupPrefix("spruce_mosaic").getFamily();
    public static final BlockFamily BIRCH_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.BIRCH_MOSAIC)
            .sign(DecoBlocks.STANDING_BIRCH_MOSAIC_SIGN,DecoBlocks.WALL_BIRCH_MOSAIC_SIGN)
            .recipeGroupPrefix("birch_mosaic").getFamily();
    public static final BlockFamily JUNGLE_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.JUNGLE_MOSAIC)
            .sign(DecoBlocks.STANDING_JUNGLE_MOSAIC_SIGN,DecoBlocks.WALL_JUNGLE_MOSAIC_SIGN)
            .recipeGroupPrefix("jungle_mosaic").getFamily();
    public static final BlockFamily DARK_OAK_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.DARK_OAK_MOSAIC)
            .sign(DecoBlocks.STANDING_DARK_OAK_MOSAIC_SIGN,DecoBlocks.WALL_DARK_OAK_MOSAIC_SIGN)
            .recipeGroupPrefix("dark_oak_mosaic").getFamily();
    public static final BlockFamily ACACIA_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.ACACIA_MOSAIC)
            .sign(DecoBlocks.STANDING_ACACIA_MOSAIC_SIGN,DecoBlocks.WALL_ACACIA_MOSAIC_SIGN)
            .recipeGroupPrefix("acacia_mosaic").getFamily();
    public static final BlockFamily CHERRY_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.CHERRY_MOSAIC)
            .sign(DecoBlocks.STANDING_CHERRY_MOSAIC_SIGN,DecoBlocks.WALL_CHERRY_MOSAIC_SIGN)
            .recipeGroupPrefix("cherry_mosaic").getFamily();
    public static final BlockFamily MANGROVE_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.MANGROVE_MOSAIC)
            .sign(DecoBlocks.STANDING_MANGROVE_MOSAIC_SIGN,DecoBlocks.WALL_MANGROVE_MOSAIC_SIGN)
            .recipeGroupPrefix("mangrove_mosaic").getFamily();
    public static final BlockFamily BAMBOO_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.BAMBOO_MOSAIC_TEMP)
            .sign(DecoBlocks.STANDING_BAMBOO_MOSAIC_SIGN,DecoBlocks.WALL_BAMBOO_MOSAIC_SIGN)
            .recipeGroupPrefix("bamboo_mosaic").getFamily();
    public static final BlockFamily CRIMSON_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.CRIMSON_MOSAIC)
            .sign(DecoBlocks.STANDING_CRIMSON_MOSAIC_SIGN,DecoBlocks.WALL_CRIMSON_MOSAIC_SIGN)
            .recipeGroupPrefix("crimson_mosaic").getFamily();
    public static final BlockFamily WARPED_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.WARPED_MOSAIC)
            .sign(DecoBlocks.STANDING_WARPED_MOSAIC_SIGN,DecoBlocks.WALL_WARPED_MOSAIC_SIGN)
            .recipeGroupPrefix("warped_mosaic").getFamily();
    public static final BlockFamily CACTUS_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.CACTUS_MOSAIC)
            .sign(DecoBlocks.STANDING_CACTUS_MOSAIC_SIGN,DecoBlocks.WALL_CACTUS_MOSAIC_SIGN)
            .recipeGroupPrefix("cactus_mosaic").getFamily();
    public static final BlockFamily MUSHROOM_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.MUSHROOM_MOSAIC)
            .sign(DecoBlocks.STANDING_MUSHROOM_MOSAIC_SIGN,DecoBlocks.WALL_MUSHROOM_MOSAIC_SIGN)
            .recipeGroupPrefix("mushroom_mosaic").getFamily();
    public static final BlockFamily IRON_CAP_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.IRON_CAP_MOSAIC)
            .sign(DecoBlocks.STANDING_IRON_CAP_MOSAIC_SIGN,DecoBlocks.WALL_IRON_CAP_MOSAIC_SIGN)
            .recipeGroupPrefix("iron_cap_mosaic").getFamily();
    public static final BlockFamily WOODEN_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.WOODEN_MOSAIC)
            .sign(DecoBlocks.STANDING_WOODEN_MOSAIC_SIGN,DecoBlocks.WALL_WOODEN_MOSAIC_SIGN)
            .recipeGroupPrefix("wooden_mosaic").getFamily();
    public static final BlockFamily PALE_OAK_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.PALE_OAK_MOSAIC)
            .sign(DecoBlocks.STANDING_PALE_OAK_MOSAIC_SIGN,DecoBlocks.WALL_PALE_OAK_MOSAIC_SIGN)
            .recipeGroupPrefix("pale_oak_mosaic").getFamily();
    public static final BlockFamily DRIFTWOOD_MOSAIC_FAMILY = BlockFamilies.familyBuilder(DecoBlocks.DRIFTWOOD_MOSAIC)
            .sign(DecoBlocks.STANDING_DRIFTWOOD_MOSAIC_SIGN,DecoBlocks.WALL_DRIFTWOOD_MOSAIC_SIGN)
            .recipeGroupPrefix("driftwood_mosaic").getFamily();

    private static Boolean never(BlockState state, BlockGetter world, BlockPos pos, EntityType<?> type) {
        return false;
    }
    private static boolean always(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }
    //I had some inspiration The Mentor CodeLab

    public static <T extends Block> T registerBlockTemp(String name, Function<BlockBehaviour.Properties, T> factory){
        T block = factory.apply(BlockBehaviour.Properties.of().noLootTable().setId(getBlockKey(name)));
        return Registry.register(BuiltInRegistries.BLOCK, getBlockKey(name), block);
    }
    public static <T extends Block> T registerBlock(String name,BlockBehaviour.Properties settings, Function<BlockBehaviour.Properties, T> factory){
        T block = factory.apply(settings.setId(getBlockKey(name)));
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, getBlockKey(name), block);
    }
    public static <T extends Block> T registerNonStationBlock(String name,BlockBehaviour.Properties settings, Function<BlockBehaviour.Properties, T> factory){
        T block = factory.apply(settings.setId(getBlockKey(name)));
        registerNonStationBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, getBlockKey(name), block);
    }
    public static <T extends Block> T registerCouldBlock(String name,BlockBehaviour.Properties settings, Function<BlockBehaviour.Properties, T> factory){
        T block = factory.apply(settings.setId(getBlockKey(name)));
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, getCloudBlockKey(name), block);
    }
    public static <T extends Block> T registerBlockWithoutItem(String name,BlockBehaviour.Properties settings, Function<BlockBehaviour.Properties, T> factory){
        T block = factory.apply(settings.setId(getBlockKey(name)));
        return Registry.register(BuiltInRegistries.BLOCK, getBlockKey(name), block);
    }
    public static <T extends Block> T registerDeadCoralFan(String name, BlockBehaviour.Properties settings, Function<BlockBehaviour.Properties, T> factory, BlockBehaviour.Properties copyLootTable){
        T block = factory.apply(settings.setId(getBlockKey(name)));
        return Registry.register(BuiltInRegistries.BLOCK, getBlockKey(name), block);
    }
    public static <T extends Block> T registerSimpleWithoutItem(String name, T block){
        ResourceKey<Block> key = getBlockKey(name);
        return Registry.register(BuiltInRegistries.BLOCK, getBlockKey(name), block);
    }
    public static <T extends Block> T registerSimple(String name, T block){
        ResourceKey<Block> key = getBlockKey(name);
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, getBlockKey(name), block);
    }
    public static StairBlock registerStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new StairBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static StairBlock registerWoodStairs(String name, Block block, Block copyBlock, MapColor mapColor){
        return registerSimple(name, new StairBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).mapColor(mapColor).setId(DecoBlocks.getBlockKey(name))));
    }
    public static HayStairsBlock registerHayStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new HayStairsBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static WeatheringCopperStairBlock registerOxidStairs(String name, WeatheringCopper.WeatherState oxidationLevel, Block block, Block copyBlock){
        return registerSimple(name, new WeatheringCopperStairBlock(oxidationLevel, block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static WeatheringCopperSlabBlock registerOxidSlab(String name, WeatheringCopper.WeatherState oxidationLevel, Block copyBlock){
        return registerSimple(name, new WeatheringCopperSlabBlock(oxidationLevel,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static OxidizableLadderBlock registerOxidLadder(String name, WeatheringCopper.WeatherState oxidationLevel, Block copyBlock){
        return registerSimple(name, new OxidizableLadderBlock(oxidationLevel,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.COPPER).strength(5.0F, 6.0F)
                        .requiresCorrectToolForDrops().setId(DecoBlocks.getBlockKey(name))));
    }
    public static PackedNyliumBlock registerPackedNylium(String name, ResourceKey<ConfiguredFeature<?, ?>> feature, Block copyBlock){
        return registerSimple(name, new PackedNyliumBlock(feature,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static InfestedBlock registerInfestedBlock(String name, Block block, Block copyBlock,float strength, float blastRes){
        return registerSimple(name, new InfestedBlock(block.defaultBlockState().getBlock(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).strength(strength).explosionResistance(blastRes)
                        .setId(DecoBlocks.getBlockKey(name))));
    }
    public static MagmaStairBlock registerMagmaStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new MagmaStairBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static MagmaBrickStairBlock registerMagmaBrickStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new MagmaBrickStairBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static BubbleStairBlock registerBubbleStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new BubbleStairBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static StainedGlassBlock registerStainedGlass(String name, DyeColor color, Block copyBlock, float strength, float blastRes){
        return registerSimple(name, new StainedGlassBlock(color,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).strength(strength).explosionResistance(blastRes)
                        .setId(DecoBlocks.getBlockKey(name))));
    }
    public static StainedGlassPaneBlock registerStainedGlassPane(String name, DyeColor color, Block copyBlock, float strength, float blastRes){
        return registerSimple(name, new StainedGlassPaneBlock(color,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).strength(strength).explosionResistance(blastRes)
                        .setId(DecoBlocks.getBlockKey(name))));
    }
    public static FlowerPotBlock registerFlowerPot(String name, Block content, Block copyBlock){
        return registerSimpleWithoutItem(name, new FlowerPotBlock(content,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static FlowerBlock registerFlower(String name, Holder<MobEffect> stewEffect, float effectLengthInSeconds, Block copyBlock){
        return registerSimple(name, new FlowerBlock( createStewEffectList(stewEffect, effectLengthInSeconds),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static PuffyDandelionBlock registerPuffyFlower(String name, Holder<MobEffect> stewEffect, float effectLengthInSeconds, Block copyBlock){
        return registerSimple(name,  new PuffyDandelionBlock(stewEffect, effectLengthInSeconds,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static EnderRoseBlock registerRoseFlower(String name, Holder<MobEffect> stewEffect, float effectLengthInSeconds, Block copyBlock) {
        return registerSimple(name, new EnderRoseBlock(createStewEffectList(stewEffect, effectLengthInSeconds),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }

    public static EnderFlowerBlock registerEndFlower(String name, Holder<MobEffect> stewEffect, float effectLengthInSeconds, Block copyBlock){
        return registerSimple(name, new EnderFlowerBlock( createStewEffectList(stewEffect, effectLengthInSeconds),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static DesertFlowerBlock registerDesertFlower(String name, Holder<MobEffect> stewEffect, float effectLengthInSeconds, Block copyBlock){
        return registerSimple(name,  new DesertFlowerBlock(stewEffect, effectLengthInSeconds,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static SaplingBlock registerSapling(String name, TreeGrower generator, Block copyBlock) {
        return registerSimple(name, new SaplingBlock(generator,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static DriftwoodSaplingBlock registerDriftwoodSapling(String name, TreeGrower generator, Block copyBlock) {
        return registerSimple(name, new DriftwoodSaplingBlock(generator,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name)).randomTicks()));
    }
    public static IronCapBlock registerIronCap(String name, TreeGrower generator, Block copyBlock) {
        return registerSimple(name, new IronCapBlock(generator,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).mapColor(MapColor.METAL).setId(DecoBlocks.getBlockKey(name))));
    }
    public static WeatheringCopperBarsBlock registerOxidPane(String name, WeatheringCopper.WeatherState oxidationLevel, Block copyBlock) {
        return registerSimple(name, new WeatheringCopperBarsBlock(oxidationLevel,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.COPPER).setId(DecoBlocks.getBlockKey(name))));
    }
    public static TintedParticleLeavesBlock registerTintedLeaves(String name, float f,  Block copyBlock) {
        return registerSimple(name, new TintedParticleLeavesBlock(f,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static WeatheringLanternBlock registerOxidLantern(String name, WeatheringCopper.WeatherState oxidationLevel, Block copyBlock) {
        return registerSimple(name, new WeatheringLanternBlock(oxidationLevel,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static TubeCoralStairBlock registerTubeCoralStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new TubeCoralStairBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static BrainCoralStairBlock registerBrainCoralStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new BrainCoralStairBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static BubbleCoralStairBlock registerBubbleCoralStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new BubbleCoralStairBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static FireCoralStairBlock registerFireCoralStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new FireCoralStairBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static HornCoralStairBlock registerHornCoralStairs(String name, Block block, Block copyBlock){
        return registerSimple(name, new HornCoralStairBlock(block.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static CoralSlabBlock registerCoralSlab(String name, Block deadCoralBlock, Block copyBlock){
        return registerSimple(name, new CoralSlabBlock(deadCoralBlock,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static CoralWallBlock registerCoralWall(String name, Block deadCoralBlock, Block copyBlock){
        return registerSimple(name, new CoralWallBlock(deadCoralBlock,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static ButtonBlock registerButton(String name, BlockSetType blockSetType, int pressTicks, Block copyBlock) {
        return registerSimple(name, new ButtonBlock(blockSetType, pressTicks,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static OxidizableButtonBlock registerOxidButton(String name, WeatheringCopper.WeatherState oxidationLevel,
                                                           BlockSetType blockSetType, int pressTicks, Block copyBlock) {
        return registerSimple(name, new OxidizableButtonBlock(oxidationLevel, blockSetType, pressTicks,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static PressurePlateBlock registerPressurePlateBlock(String name, BlockSetType blockSetType, Block copyBlock) {
        return registerSimple(name, new PressurePlateBlock(blockSetType,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static WeightedPressurePlateBlock registerWeightedPressurePlateBlock(String name, int weight, BlockSetType blockSetType, Block copyBlock) {
        return registerSimple(name, new WeightedPressurePlateBlock(weight, blockSetType,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static OxidizablePressurePlateBlock registerOxidPressurePlateBlock(String name, int weight, WeatheringCopper.WeatherState oxidationLevel,
                                                           BlockSetType blockSetType, Block copyBlock) {
        return registerSimple(name, new OxidizablePressurePlateBlock(weight,oxidationLevel, blockSetType,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }
    public static DoorBlock registerDoorBlock(String name, BlockSetType blockSetType, Block copyBlock) {
        return registerSimple(name, new DoorBlock(blockSetType,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).noOcclusion().setId(DecoBlocks.getBlockKey(name))));
    }
    public static TrapDoorBlock registerTrapDoorBlock(String name, BlockSetType blockSetType, Block copyBlock) {
        return registerSimple(name, new TrapDoorBlock(blockSetType,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).noOcclusion().setId(DecoBlocks.getBlockKey(name))));
    }
    public static FenceGateBlock registerFenceGateBlock(String name, WoodType type, Block copyBlock) {
        return registerSimple(name, new FenceGateBlock(type,
                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(DecoBlocks.getBlockKey(name))));
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.parse(name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.parse(name)))));
    }
    private static void registerNonStationBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.parse(name),
                new NonStationBlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.parse(name)))));
    }

    private static void registerCloudBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.parse(name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, name)))));
    }

    public static SuspiciousStewEffects createStewEffectList(Holder<MobEffect> effect, float effectLengthInSeconds) {
        return new SuspiciousStewEffects(List.of(new SuspiciousStewEffects.Entry(effect, Mth.floor(effectLengthInSeconds * 20.0F))));
    }

    public static ResourceKey<Block> getBlockKey(String name){
        return ResourceKey.create(Registries.BLOCK, Identifier.parse(name));
    }

    public static ResourceKey<Block> getCloudBlockKey(String name){
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,name));
    }

    private static BlockBehaviour.Properties copyLootTable(Block block, boolean copyTranslationKey) {
        BlockBehaviour.Properties settings = block.properties();
        BlockBehaviour.Properties settings2 = BlockBehaviour.Properties.of().overrideLootTable(block.getLootTable());
        if (copyTranslationKey) {
            settings2 = settings2.overrideDescription(block.getDescriptionId());
        }

        return settings2;
    }
    public static void registerDecoBlocks(){
        VaranDeco.LOGGER.debug("Registering Blocks for " + VaranDeco.MOD_ID);
    }
}