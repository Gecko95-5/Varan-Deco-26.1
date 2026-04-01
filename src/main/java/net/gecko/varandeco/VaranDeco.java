package net.gecko.varandeco;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.gecko.varandeco.effects.DecoStatusEffects;
import net.gecko.varandeco.entity.DecoEntities;
import net.gecko.varandeco.item.DecoItemGroup;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.potion.DecoPotion;
import net.gecko.varandeco.util.*;
import net.gecko.varandeco.world.feature.tree.DecoTruckPlacerType;
import net.gecko.varandeco.world.gen.DecoWorldGeneration;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class VaranDeco implements ModInitializer {
	public static final String MOD_ID = "varan-deco";

	public static final Logger LOGGER = getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DecoItemGroup.registerItemGroups();
		DecoItems.registerDecoItems();
		DecoBlocks.registerDecoBlocks();
		DecoBlockEntities.registerBlockEntities();
		DecoWorldGeneration.generateWorldGen();
		DecoPotion.registerPotions();
		DecoFlammableBlocks.registerFlammableBlocks();
		DecoStrippableBlocks.registerStrippables();
		DecoOxidizableBlocks.registerOxidizableBlocks();
		DecoOxidizableBlocks.registerWaxableBlocks();
		DecoLootTableModifiers.modifyLootTables();
		DecoFuelRegistry.registerFuels();
		DecoComposterRecipes.registerCompostableItems();
		DecoCustomTrades.registerCustomTrades();
		DecoEntities.registerDecoEntities();
		DecoTruckPlacerType.register();
        DecoFeatures.registerDecoFeatures();
        DecoEntities.registerDecoEntities();
        DecoStatusEffects.registerStatusEffects();

		LOGGER.info("Hello Fabric world!");

		FabricPotionBrewingBuilder.BUILD.register(builder -> {
			builder.addMix(Potions.WATER_BREATHING, DecoItems.BUBBLE_ORB, DecoPotion.WATER_BUBBLE_POTION);
			builder.addMix(Potions.LONG_WATER_BREATHING, DecoItems.BUBBLE_ORB, DecoPotion.LONG_WATER_BUBBLE_POTION);
			builder.addMix(DecoPotion.WATER_BUBBLE_POTION, Items.REDSTONE, DecoPotion.LONG_WATER_BUBBLE_POTION);
			builder.addMix(DecoPotion.WATER_BUBBLE_POTION, Items.GLOWSTONE_DUST, DecoPotion.STRONG_WATER_BUBBLE_POTION);
            builder.addMix(Potions.AWKWARD, DecoItems.EARTH_SPHERE, DecoPotion.GROUNDING_POTION);
            builder.addMix(DecoPotion.GROUNDING_POTION, Items.REDSTONE, DecoPotion.LONG_GROUNDING_POTION);
            builder.addMix(DecoPotion.GROUNDING_POTION, Items.GLOWSTONE_DUST, DecoPotion.STRONG_GROUNDING_POTION);
			builder.addMix(Potions.WATER, DecoItems.WARPED_WART, Potions.AWKWARD);
		});
	}
}