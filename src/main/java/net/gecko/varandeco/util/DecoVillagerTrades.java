package net.gecko.varandeco.util;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Optional;

public class DecoVillagerTrades {
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_LILAC_FLOWER =
            resourceKey("wandering_trader/emerald_lilac_flower");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_SALMON_POPPY =
            resourceKey("wandering_trader/emerald_salmon_poppy");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_CALIFORNIA_POPPY =
            resourceKey("wandering_trader/emerald_california_poppy");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_ALPINE_POPPY =
            resourceKey("wandering_trader/emerald_alpine_poppy");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BLUE_HIBISCUS =
            resourceKey("wandering_trader/emerald_blue_hibiscus");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BROMELIAD =
            resourceKey("wandering_trader/emerald_bromeliad");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BLACK_TULIP =
            resourceKey("wandering_trader/emerald_black_tulip");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BLUE_TULIP =
            resourceKey("wandering_trader/emerald_blue_tulip");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_CYAN_TULIP =
            resourceKey("wandering_trader/emerald_cyan_tulip");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_YELLOW_TULIP =
            resourceKey("wandering_trader/emerald_yellow_tulip");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_PURPLE_TULIP =
            resourceKey("wandering_trader/emerald_purple_tulip");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_MAGENTA_TULIP =
            resourceKey("wandering_trader/emerald_magenta_tulip");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_GREEN_TULIP =
            resourceKey("wandering_trader/emerald_green_tulip");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_ROUGE_WILDFLOWERS =
            resourceKey("wandering_trader/emerald_rouge_wildflower");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_SWEET_WILDFLOWERS =
            resourceKey("wandering_trader/emerald_sweet_wildflower");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_GECKO_WILDFLOWERS =
            resourceKey("wandering_trader/emerald_gecko_wildflower");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BARBERTON_DAISY =
            resourceKey("wandering_trader/emerald_barberton_daisy");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BLUE_EYED_DAISY =
            resourceKey("wandering_trader/emerald_blue_eyed_daisy");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_GERBERA_DAISY =
            resourceKey("wandering_trader/emerald_gerbera_daisy");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_MICHAELMAS_DAISY =
            resourceKey("wandering_trader/emerald_michaelmas_daisy");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_DEAD_EYE_DAISY =
            resourceKey("wandering_trader/emerald_dead_eye_daisy");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_FELICIA_DAISY =
            resourceKey("wandering_trader/emerald_felicia_daisy");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_POPPED_BLUET =
            resourceKey("wandering_trader/emerald_popped_bluet");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_HAZZY_BLUET =
            resourceKey("wandering_trader/emerald_hazzy_bluet");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_CYAN_ORCHID =
            resourceKey("wandering_trader/emerald_cyan_orchid");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_YELLOW_ORCHID =
            resourceKey("wandering_trader/emerald_yellow_orchid");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_PINK_ORCHID =
            resourceKey("wandering_trader/emerald_pink_orchid");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_WHITE_ORCHID =
            resourceKey("wandering_trader/emerald_white_orchid");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_LAVENDER =
            resourceKey("wandering_trader/emerald_lavender");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_DRILL_LAVENDER =
            resourceKey("wandering_trader/emerald_drill_lavender");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BUTTERCUP =
            resourceKey("wandering_trader/emerald_buttercup");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_NIGHTSHADE =
            resourceKey("wandering_trader/emerald_nightshade");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_ROSE =
            resourceKey("wandering_trader/emerald_rose");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_PAEONIA =
            resourceKey("wandering_trader/emerald_paeonia");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_IRIS =
            resourceKey("wandering_trader/emerald_iris");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BLUE_DELPHINIUM =
            resourceKey("wandering_trader/emerald_blue_delphinium");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_PUFFY_DANDELION =
            resourceKey("wandering_trader/emerald_puffy_dandelion");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_DRIFTWOOD_SAPLING =
            resourceKey("wandering_trader/emerald_driftwood_sapling");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_DRIFTWOOD_SPROUT =
            resourceKey("wandering_trader/emerald_driftwood_sprout");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_CLOUD =
            resourceKey("wandering_trader/emerald_cloud");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_WHITE_BLOCK =
            resourceKey("wandering_trader/emerald_white_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_LIGHT_GRAY_BLOCK =
            resourceKey("wandering_trader/emerald_light_gray_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_GRAY_BLOCK =
            resourceKey("wandering_trader/emerald_gray_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BLACK_BLOCK =
            resourceKey("wandering_trader/emerald_black_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BROWN_BLOCK =
            resourceKey("wandering_trader/emerald_brown_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_RED_BLOCK =
            resourceKey("wandering_trader/emerald_red_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_ORANGE_BLOCK =
            resourceKey("wandering_trader/emerald_orange_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_YELLOW_BLOCK =
            resourceKey("wandering_trader/emerald_yellow_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_LIME_BLOCK =
            resourceKey("wandering_trader/emerald_lime_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_GREEN_BLOCK =
            resourceKey("wandering_trader/emerald_green_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_CYAN_BLOCK =
            resourceKey("wandering_trader/emerald_cyan_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BLUE_BLOCK =
            resourceKey("wandering_trader/emerald_blue_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_LIGHT_BLUE_BLOCK =
            resourceKey("wandering_trader/emerald_light_blue_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_PURPLE_BLOCK =
            resourceKey("wandering_trader/emerald_purple_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_MAGENTA_BLOCK =
            resourceKey("wandering_trader/emerald_magenta_block");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_PINK_BLOCK =
            resourceKey("wandering_trader/emerald_pink_block");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_DRIFTWOOD =
            resourceKey("wandering_trader/emerald_driftwood");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_DRIED_DRIFTWOOD =
            resourceKey("wandering_trader/emerald_dried_driftwood");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BUBBLE_ORB =
            resourceKey("wandering_trader/emerald_bubble_orb");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_PASSTOL =
            resourceKey("wandering_trader/emerald_passtol");
    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_SHADDOL =
            resourceKey("wandering_trader/emerald_shaddol");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_WOODEN_SAPLING =
            resourceKey("wandering_trader/emerald_wooden_sapling");

    public static final ResourceKey<VillagerTrade> DECO_WANDERING_TRADER_EMERALD_BLACK_ICE =
            resourceKey("wandering_trader/emerald_black_ice");

    public static final ResourceKey<VillagerTrade> DECO_MASON_2_EMERALD_STONE_BRICKS =
            resourceKey("mason/2/emerald_stone_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_2_EMERALD_STONE_TILES =
            resourceKey("mason/2/emerald_stone_tiles");

    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_WHITE_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_white_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_LIGHT_GRAY_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_light_gray_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_GRAY_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_gray_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_BLACK_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_black_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_BROWN_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_brown_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_RED_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_red_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_ORANGE_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_orange_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_YELLOW_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_yellow_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_LIME_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_lime_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_GREEN_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_green_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_CYAN_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_cyan_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_BLUE_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_blue_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_LIGHT_BLUE_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_light_blue_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_PURPLE_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_purple_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_MAGENTA_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_magenta_terracotta_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_4_EMERALD_PINK_TERRACOTTA_BRICKS =
            resourceKey("mason/4/emerald_pink_terracotta_bricks");

    public static final ResourceKey<VillagerTrade> DECO_MASON_5_EMERALD_QUARTZ_BRICKS =
            resourceKey("mason/5/emerald_quartz_bricks");
    public static final ResourceKey<VillagerTrade> DECO_MASON_5_EMERALD_CUT_QUARTZ =
            resourceKey("mason/5/emerald_cut_quartz");

    public static void bootstrap(final BootstrapContext<VillagerTrade> context) {

        context.register(DECO_WANDERING_TRADER_EMERALD_DRIFTWOOD_SAPLING,
                new VillagerTrade(new TradeCost(Items.EMERALD, 5), new ItemStackTemplate(DecoBlocks.DRIFTWOOD_SAPLING.asItem()),
                        8, 1, 0.05F, Optional.empty(), List.of()));
        context.register(DECO_WANDERING_TRADER_EMERALD_DRIFTWOOD_SPROUT,
                new VillagerTrade(new TradeCost(Items.EMERALD, 3), new ItemStackTemplate(
                        DecoBlocks.DRIFTWOOD_SAPLING.asItem(),2), 8, 1, 0.05F,
                        Optional.empty(), List.of()));

        context.register(DECO_WANDERING_TRADER_EMERALD_CLOUD,
                new VillagerTrade(new TradeCost(Items.EMERALD,1), new ItemStackTemplate(
                        DecoBlocks.CLOUD_BLOCK.asItem(),4), 9, 1, 0.05F,
                        Optional.empty(), List.of()));

        context.register(DECO_WANDERING_TRADER_EMERALD_DRIFTWOOD,
                new VillagerTrade(new TradeCost(Items.EMERALD,1), new ItemStackTemplate(
                        DecoBlocks.DRIFTWOOD_LOG.asItem(),8), 4, 1, 0.075F,
                        Optional.empty(), List.of()));
        context.register(DECO_WANDERING_TRADER_EMERALD_DRIED_DRIFTWOOD,
                new VillagerTrade(new TradeCost(Items.EMERALD,1), new ItemStackTemplate(
                        DecoBlocks.DRIED_DRIFTWOOD_LOG.asItem(),8), 4, 1, 0.075F,
                        Optional.empty(), List.of()));

        context.register(DECO_WANDERING_TRADER_EMERALD_BUBBLE_ORB,
                new VillagerTrade(new TradeCost(Items.EMERALD, 3), new ItemStackTemplate(DecoItems.BUBBLE_ORB),
                        8, 1, 0.075F, Optional.empty(), List.of()));
        context.register(DECO_WANDERING_TRADER_EMERALD_PASSTOL,
                new VillagerTrade(new TradeCost(Items.EMERALD, 2), new ItemStackTemplate(DecoItems.PASSTOL),
                        4, 1, 0.075F, Optional.empty(), List.of()));
        context.register(DECO_WANDERING_TRADER_EMERALD_SHADDOL,
                new VillagerTrade(new TradeCost(Items.EMERALD, 2), new ItemStackTemplate(DecoItems.SHADDOL),
                        4, 1, 0.075F, Optional.empty(), List.of()));

        context.register(DECO_WANDERING_TRADER_EMERALD_WOODEN_SAPLING,
                new VillagerTrade(new TradeCost(Items.EMERALD, 10), new ItemStackTemplate(DecoBlocks.WOODEN_SAPLING.asItem()),
                        8, 1, 0.05F, Optional.empty(), List.of()));

        context.register(DECO_WANDERING_TRADER_EMERALD_BLACK_ICE,
                new VillagerTrade(new TradeCost(Items.EMERALD, 12), new ItemStackTemplate(DecoBlocks.BLACK_ICE.asItem()),
                        8, 1, 0.05F, Optional.empty(), List.of()));

        context.register(DECO_MASON_2_EMERALD_STONE_BRICKS,
                new VillagerTrade(new TradeCost(Items.EMERALD,1), new ItemStackTemplate(
                        Items.STONE_BRICKS,8), 16, 1, 0.075F,
                        Optional.empty(), List.of()));
        context.register(DECO_MASON_2_EMERALD_STONE_TILES,
                new VillagerTrade(new TradeCost(Items.EMERALD,1), new ItemStackTemplate(
                        DecoBlocks.STONE_TILES.asItem(),8), 16, 1, 0.075F,
                        Optional.empty(), List.of()));

        context.register(DECO_MASON_5_EMERALD_QUARTZ_BRICKS,
                new VillagerTrade(new TradeCost(Items.EMERALD,1), new ItemStackTemplate(
                        Items.QUARTZ_BRICKS), 12, 1, 0.075F,
                        Optional.empty(), List.of()));
        context.register(DECO_MASON_5_EMERALD_CUT_QUARTZ,
                new VillagerTrade(new TradeCost(Items.EMERALD,1), new ItemStackTemplate(
                        DecoBlocks.CUT_QUARTZ.asItem()), 12, 1, 0.075F,
                        Optional.empty(), List.of()));

        for (Pair<ResourceKey<VillagerTrade>, Item> entry : List.of(
                Pair.of(DECO_LIBRARIAN_1_EMERALD_OAK_BOOKSHELF, DecoBlocks.OAK_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_SPRUCE_BOOKSHELF, DecoBlocks.SPRUCE_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_BIRCH_BOOKSHELF, DecoBlocks.BIRCH_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_JUNGLE_BOOKSHELF, DecoBlocks.JUNGLE_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_ACACIA_BOOKSHELF, DecoBlocks.ACACIA_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_DARK_OAK_BOOKSHELF, DecoBlocks.DARK_OAK_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_MANGROVE_BOOKSHELF, DecoBlocks.MANGROVE_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_BAMBOO_BOOKSHELF, DecoBlocks.BAMBOO_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_CHERRY_BOOKSHELF, DecoBlocks.CHERRY_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_CACTUS_BOOKSHELF, DecoBlocks.CACTUS_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_MUSHROOM_BOOKSHELF, DecoBlocks.MUSHROOM_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_PALE_OAK_BOOKSHELF, DecoBlocks.PALE_OAK_BOOKSHELF),
                Pair.of(DECO_LIBRARIAN_1_EMERALD_DRIFTWOOD_BOOKSHELF, DecoBlocks.DRIFTWOOD_BOOKSHELF)
                )) {
            context.register(
                    entry.getLeft(), new VillagerTrade(new TradeCost(Items.EMERALD, 9),
                            new ItemStackTemplate(entry.getRight()), 15, 1, 0.05F,
                            Optional.empty(), List.of()));
        }

        registerWanderingTraderDecoFlowers(context);
        registerWanderingTraderDyeBlock(context);
        registerMasonLevelFourTerracottaBricks(context);
    }
        private static void registerWanderingTraderDecoFlowers(final BootstrapContext<VillagerTrade> context){
            context.register(DECO_WANDERING_TRADER_EMERALD_LILAC_FLOWER, new VillagerTrade(new TradeCost(Items.EMERALD, 1),
                    new ItemStackTemplate(DecoItems.LILAC_FLOWER,2), 12, 1, 0.05F,
                    Optional.empty(), List.of()));

            for (Pair<ResourceKey<VillagerTrade>, Item> entry : List.of(
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_PUFFY_DANDELION, DecoBlocks.PUFFY_DANDELION.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_SALMON_POPPY, DecoBlocks.SALMON_POPPY.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_CALIFORNIA_POPPY, DecoBlocks.CALIFORNIA_POPPY.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_ALPINE_POPPY, DecoBlocks.ALPINE_POPPY.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_BLUE_HIBISCUS, DecoBlocks.BLUE_HIBISCUS.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_BROMELIAD, DecoBlocks.BROMELIAD.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_BLACK_TULIP, DecoBlocks.BLACK_TULIP.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_BLUE_TULIP, DecoBlocks.BLUE_TULIP.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_CYAN_TULIP, DecoBlocks.CYAN_TULIP.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_YELLOW_TULIP, DecoBlocks.YELLOW_TULIP.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_PURPLE_TULIP, DecoBlocks.PURPLE_TULIP.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_MAGENTA_TULIP, DecoBlocks.MAGENTA_TULIP.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_GREEN_TULIP, DecoBlocks.GREEN_TULIP.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_ROUGE_WILDFLOWERS, DecoBlocks.ROUGE_WILDFLOWERS.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_SWEET_WILDFLOWERS, DecoBlocks.SWEET_WILDFLOWERS.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_GECKO_WILDFLOWERS, DecoBlocks.GECKO_WILDFLOWERS.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_BARBERTON_DAISY, DecoBlocks.BARBERTON_DAISY.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_BLUE_EYED_DAISY, DecoBlocks.BLUE_EYED_DAISY.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_GERBERA_DAISY, DecoBlocks.GERBERA_DAISY.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_MICHAELMAS_DAISY, DecoBlocks.MICHAELMAS_DAISY.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_DEAD_EYE_DAISY, DecoBlocks.DEAD_EYE_DAISY.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_FELICIA_DAISY, DecoBlocks.FELICIA_DAISY.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_POPPED_BLUET, DecoBlocks.POPPED_BLUET.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_HAZZY_BLUET, DecoBlocks.HAZZY_BLUET.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_CYAN_ORCHID, DecoBlocks.CYAN_ORCHID.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_PINK_ORCHID, DecoBlocks.PINK_ORCHID.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_YELLOW_ORCHID, DecoBlocks.YELLOW_ORCHID.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_WHITE_ORCHID, DecoBlocks.WHITE_ORCHID.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_LAVENDER, DecoBlocks.LAVENDER.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_DRILL_LAVENDER, DecoBlocks.DRILL_LAVENDER.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_BUTTERCUP, DecoBlocks.BUTTERCUP.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_NIGHTSHADE, DecoBlocks.NIGHTSHADE.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_IRIS, DecoBlocks.IRIS.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_BLUE_DELPHINIUM, DecoBlocks.BLUE_DELPHINIUM.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_ROSE, DecoBlocks.ROSE.asItem()),
                    Pair.of(DECO_WANDERING_TRADER_EMERALD_PAEONIA, DecoBlocks.PAEONIA.asItem())
                    )) {
                context.register(entry.getLeft(), new VillagerTrade(new TradeCost(Items.EMERALD, 1),
                        new ItemStackTemplate(entry.getRight()), 12, 1, 0.075F,
                        Optional.empty(), List.of()));
            }
        }
    private static void registerWanderingTraderDyeBlock(final BootstrapContext<VillagerTrade> context) {
        for (Pair<ResourceKey<VillagerTrade>, Item> entry : List.of(
                Pair.of(DECO_WANDERING_TRADER_EMERALD_RED_BLOCK, DecoBlocks.RED_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_WHITE_BLOCK, DecoBlocks.WHITE_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_BLUE_BLOCK, DecoBlocks.BLUE_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_PINK_BLOCK, DecoBlocks.PINK_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_BLACK_BLOCK, DecoBlocks.BLACK_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_GREEN_BLOCK, DecoBlocks.GREEN_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_LIGHT_GRAY_BLOCK, DecoBlocks.LIGHT_GRAY_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_MAGENTA_BLOCK, DecoBlocks.MAGENTA_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_YELLOW_BLOCK, DecoBlocks.YELLOW_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_GRAY_BLOCK, DecoBlocks.GRAY_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_PURPLE_BLOCK, DecoBlocks.PURPLE_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_LIGHT_BLUE_BLOCK, DecoBlocks.LIGHT_BLUE_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_LIME_BLOCK, DecoBlocks.LIME_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_ORANGE_BLOCK, DecoBlocks.ORANGE_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_BROWN_BLOCK, DecoBlocks.BROWN_BLOCK.asItem()),
                Pair.of(DECO_WANDERING_TRADER_EMERALD_CYAN_BLOCK, DecoBlocks.CYAN_BLOCK.asItem())
        )) {
            context.register(
                    entry.getLeft(), new VillagerTrade(new TradeCost(Items.EMERALD, 3),
                            new ItemStackTemplate(entry.getRight(), 1), 4, 1, 0.05F,
                            Optional.empty(), List.of())
            );
        }
    }
    private static void registerMasonLevelFourTerracottaBricks(final BootstrapContext<VillagerTrade> context) {
        for (Pair<ResourceKey<VillagerTrade>, Item> block : List.of(
                Pair.of(DECO_MASON_4_EMERALD_ORANGE_TERRACOTTA_BRICKS, DecoBlocks.ORANGE_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_WHITE_TERRACOTTA_BRICKS, DecoBlocks.WHITE_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_BLUE_TERRACOTTA_BRICKS, DecoBlocks.BLUE_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_LIGHT_BLUE_TERRACOTTA_BRICKS, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_GRAY_TERRACOTTA_BRICKS, DecoBlocks.GRAY_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_LIGHT_GRAY_TERRACOTTA_BRICKS, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_BLACK_TERRACOTTA_BRICKS, DecoBlocks.BLACK_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_RED_TERRACOTTA_BRICKS, DecoBlocks.RED_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_PINK_TERRACOTTA_BRICKS, DecoBlocks.PINK_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_MAGENTA_TERRACOTTA_BRICKS, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_LIME_TERRACOTTA_BRICKS, DecoBlocks.LIME_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_GREEN_TERRACOTTA_BRICKS, DecoBlocks.GREEN_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_CYAN_TERRACOTTA_BRICKS, DecoBlocks.CYAN_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_PURPLE_TERRACOTTA_BRICKS, DecoBlocks.PURPLE_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_YELLOW_TERRACOTTA_BRICKS, DecoBlocks.YELLOW_TERRACOTTA_BRICKS.asItem()),
                Pair.of(DECO_MASON_4_EMERALD_BROWN_TERRACOTTA_BRICKS, DecoBlocks.BROWN_TERRACOTTA_BRICKS.asItem())
        )) {
            context.register(
                    block.getLeft(),
                    new VillagerTrade(new TradeCost(Items.EMERALD, 1), new ItemStackTemplate(block.getRight()),
                            12, 15, 0.05F, Optional.empty(), List.of())
            );
        }
    }
    public static ResourceKey<VillagerTrade> resourceKey(final String path) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,path));
    }
}
