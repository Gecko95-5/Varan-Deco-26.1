package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class DecoCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(factories -> {

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.PUFFY_DANDELION, 1),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoItems.LILAC_FLOWER, 2),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.ROUGE_WILDFLOWERS),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.SWEET_WILDFLOWERS),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.GECKO_WILDFLOWERS),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.SALMON_POPPY, 1),
                            12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BLUE_HIBISCUS),
                            12, 0, 0.075f));
        factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BROMELIAD, 1),
                            12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.CALIFORNIA_POPPY, 1),
                            12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BLACK_TULIP, 1),
                            7, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BLUE_TULIP, 1),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.CYAN_TULIP, 1),
                            7, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.YELLOW_TULIP, 1),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.PURPLE_TULIP, 1),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.MAGENTA_TULIP, 1),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.GREEN_TULIP, 1),
                            7, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BARBERTON_DAISY, 1),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BLUE_EYED_DAISY, 1),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.GERBERA_DAISY, 1),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.MICHAELMAS_DAISY, 1),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world, entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.DEAD_EYE_DAISY),
                                12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world, entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD),
                        new ItemStack(DecoBlocks.ALPINE_POPPY),
                        12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world, entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.POPPED_BLUET),
                                12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world, entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD),
                        new ItemStack(DecoBlocks.DRILL_LAVENDER),
                        12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world, entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.HAZZY_BLUET),
                                12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD),
                            new ItemStack(DecoBlocks.IRIS),
                            12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.BLUE_DELPHINIUM),
                                12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD),
                        new ItemStack(DecoBlocks.FELICIA_DAISY),
                        12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.CYAN_ORCHID),
                                12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world, entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD),
                            new ItemStack(DecoItems.LILAC_FLOWER, 2),
                            12, 0, 0.075f));


            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.YELLOW_ORCHID, 1),
                            8, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.WHITE_ORCHID, 1),
                            6, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.PINK_ORCHID, 1),
                            6, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.ROSE, 1),
                            12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.PAEONIA, 1),
                            12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BUTTERCUP, 1),
                            12, 0, 0.075f));

            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.NIGHTSHADE, 1),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.LAVENDER, 1),
                            9, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 5),
                            new ItemStack(DecoBlocks.DRIFTWOOD_SAPLING, 1),
                            8, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.DRIFTWOOD_SPROUT, 2),
                            12, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_common_items"),
                    (world, entity, random) -> new TradeOffer(
                                    new TradedItem(Items.EMERALD),
                                    new ItemStack(DecoBlocks.CLOUD_BLOCK,4),
                                    9, 0, 0.075f));
        });

        TradeOfferHelper.registerWanderingTraderOffers(factories -> {
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.RED_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.WHITE_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.BLUE_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.PINK_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.BLACK_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.GREEN_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.LIGHT_GRAY_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.MAGENTA_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.YELLOW_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.GRAY_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.PURPLE_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.LIGHT_BLUE_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.LIME_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.ORANGE_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.BROWN_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.CYAN_BLOCK, 1),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.DRIFTWOOD_LOG, 8),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.DRIED_DRIFTWOOD_LOG, 4),
                            4, 0, 0.075f));
        });


        TradeOfferHelper.registerWanderingTraderOffers(factories -> {
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoItems.BUBBLE_ORB, 1),
                            8, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 10),
                            new ItemStack(DecoBlocks.WOODEN_SAPLING, 1),
                            8, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 2),
                            new ItemStack(DecoItems.SHADDOL),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 2),
                            new ItemStack(DecoItems.PASSTOL),
                            4, 0, 0.075f));
            factories.addOffersToPool(Identifier.of("sell_special_items"),
                    (world,entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 12),
                            new ItemStack(DecoBlocks.BLACK_ICE, 1),
                            6, 0, 0.075f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,2, factories -> {

                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(Items.STONE_BRICKS,8),
                                16, 5, 0.075f));

                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.STONE_TILES,8),
                                16, 5, 0.075f));

        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4, factories -> {

                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.WHITE_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.GRAY_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.BLACK_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.BROWN_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.RED_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.ORANGE_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.YELLOW_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.LIME_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.GREEN_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.CYAN_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.BLUE_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.PURPLE_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.PINK_TERRACOTTA_BRICKS),
                                12, 15, 0.075f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,5, factories -> {

                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(Items.QUARTZ_BRICKS),
                                12, 30, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD),
                                new ItemStack(DecoBlocks.CUT_QUARTZ),
                                12, 30, 0.075f));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN,1, factories -> {

                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD,9),
                                new ItemStack(DecoBlocks.SPRUCE_BOOKSHELF),
                                15, 1, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD,9),
                                new ItemStack(DecoBlocks.BIRCH_BOOKSHELF),
                                15, 1, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD,9),
                                new ItemStack(DecoBlocks.JUNGLE_BOOKSHELF),
                                15, 1, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD,9),
                                new ItemStack(DecoBlocks.ACACIA_BOOKSHELF),
                                15, 1, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD,9),
                                new ItemStack(DecoBlocks.DARK_OAK_BOOKSHELF),
                                15, 1, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD,9),
                                new ItemStack(DecoBlocks.MANGROVE_BOOKSHELF),
                                15, 1, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD,9),
                                new ItemStack(DecoBlocks.BAMBOO_BOOKSHELF),
                                15, 1, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD,9),
                                new ItemStack(DecoBlocks.CHERRY_BOOKSHELF),
                                15, 1, 0.075f));


                        factories.add((world,entity, random) -> new TradeOffer(
                                new TradedItem(Items.EMERALD,9),
                                new ItemStack(DecoBlocks.CACTUS_BOOKSHELF),
                                15, 1, 0.075f));
        });
    }
}
