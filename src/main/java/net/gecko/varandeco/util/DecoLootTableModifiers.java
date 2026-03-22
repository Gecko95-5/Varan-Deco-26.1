package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class DecoLootTableModifiers {
    private static final Identifier PUFFERFISH_ID =
            Identifier.of("minecraft", "entities/pufferfish");
    private static final Identifier GUARDIAN_ID =
            Identifier.of("minecraft", "entities/guardian");
    private static final Identifier ENDERMAN_ID =
            Identifier.of("minecraft", "entities/enderman");
    private static final Identifier FORTRESS_ID =
            Identifier.of("minecraft", "chests/nether_bridge");
    private static final Identifier SHIPWRECK_SP_ID =
            Identifier.of("minecraft", "chests/shipwreck_supply");
    private static final Identifier SHIPWRECK_TR_ID =
            Identifier.of("minecraft", "chests/shipwreck_treasure");
    private static final Identifier MINESHAFT_ID =
            Identifier.of("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier CITY_ID =
            Identifier.of("minecraft", "chests/ancient_city");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
            if(PUFFERFISH_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(DecoItems.BUBBLE_ORB))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (GUARDIAN_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(DecoItems.BUBBLE_ORB))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (MINESHAFT_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0.0f, 1.0f))
                        .with(ItemEntry.builder(DecoBlocks.IRON_CAP_MUSHROOM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (CITY_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(DecoBlocks.IRON_CAP_MUSHROOM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_TR_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(2.0f, 3.0f))
                        .with(ItemEntry.builder(DecoItems.BUBBLE_ORB))
                        .with(ItemEntry.builder(Items.PRISMARINE_SHARD))
                        .with(ItemEntry.builder(Items.PRISMARINE_CRYSTALS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_SP_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(2.0f, 4.0f))
                        .with(ItemEntry.builder(DecoItems.TALL_SEAGRASS))
                        .with(ItemEntry.builder(Items.SEAGRASS))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ENDERMAN_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(DecoItems.WARPED_WART))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (FORTRESS_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(DecoItems.WARPED_WART))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_SP_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1.0f,2.0f))
                        .with(ItemEntry.builder(DecoBlocks.DRIFTWOOD_LOG)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f))).build());


                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
