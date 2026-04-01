package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class DecoLootTableModifiers {
    private static final Identifier PUFFERFISH_ID =
            Identifier.fromNamespaceAndPath("minecraft", "entities/pufferfish");
    private static final Identifier GUARDIAN_ID =
            Identifier.fromNamespaceAndPath("minecraft", "entities/guardian");
    private static final Identifier ENDERMAN_ID =
            Identifier.fromNamespaceAndPath("minecraft", "entities/enderman");
    private static final Identifier FORTRESS_ID =
            Identifier.fromNamespaceAndPath("minecraft", "chests/nether_bridge");
    private static final Identifier SHIPWRECK_SP_ID =
            Identifier.fromNamespaceAndPath("minecraft", "chests/shipwreck_supply");
    private static final Identifier SHIPWRECK_TR_ID =
            Identifier.fromNamespaceAndPath("minecraft", "chests/shipwreck_treasure");
    private static final Identifier MINESHAFT_ID =
            Identifier.fromNamespaceAndPath("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier CITY_ID =
            Identifier.fromNamespaceAndPath("minecraft", "chests/ancient_city");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
            if(PUFFERFISH_ID.equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(DecoItems.BUBBLE_ORB))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (GUARDIAN_ID.equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.5f))
                        .add(LootItem.lootTableItem(DecoItems.BUBBLE_ORB))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (MINESHAFT_ID.equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(UniformGenerator.between(0.0f, 1.0f))
                        .add(LootItem.lootTableItem(DecoBlocks.IRON_CAP_MUSHROOM))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (CITY_ID.equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(DecoBlocks.IRON_CAP_MUSHROOM))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_TR_ID.equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(UniformGenerator.between(2.0f, 3.0f))
                        .add(LootItem.lootTableItem(DecoItems.BUBBLE_ORB))
                        .add(LootItem.lootTableItem(Items.PRISMARINE_SHARD))
                        .add(LootItem.lootTableItem(Items.PRISMARINE_CRYSTALS))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_SP_ID.equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(UniformGenerator.between(2.0f, 4.0f))
                        .add(LootItem.lootTableItem(DecoItems.TALL_SEAGRASS))
                        .add(LootItem.lootTableItem(Items.SEAGRASS))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ENDERMAN_ID.equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.5f))
                        .add(LootItem.lootTableItem(DecoItems.WARPED_WART))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (FORTRESS_ID.equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.5f))
                        .add(LootItem.lootTableItem(DecoItems.WARPED_WART))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_SP_ID.equals(key.identifier())) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(UniformGenerator.between(1.0f,2.0f))
                        .add(LootItem.lootTableItem(DecoBlocks.DRIFTWOOD_LOG)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0f, 6.0f))).build());


                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
