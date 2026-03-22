package net.gecko.varandeco;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.gecko.varandeco.datagen.*;
import net.gecko.varandeco.world.feature.DecoConfiguredFeatures;
import net.gecko.varandeco.world.feature.DecoPlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class VaranDecoDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(DecoLootTableGenerator::new);
		pack.addProvider(DecoRecipeGeneratorTwo::new);
		pack.addProvider(DecoModelProvider::new);
		pack.addProvider(DecoBlockTagProvider::new);
		pack.addProvider(DecoItemTagProvider::new);
		pack.addProvider(DecoWorldGenerator::new);
		pack.addProvider(DecoEntityTagProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, DecoConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, DecoPlacedFeatures::bootstrap);
	}
}
