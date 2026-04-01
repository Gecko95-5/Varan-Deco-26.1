package net.gecko.varandeco.util;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.util.feature.DriftwoodSproutFeature;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.CountConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class DecoFeatures {
    public static final Feature<CountConfiguration> DRIFTWOOD_SPROUT = register("driftwoood_sprout",
            new DriftwoodSproutFeature(CountConfiguration.CODEC));

    private static <C extends FeatureConfiguration, F extends Feature<C>> F register(String name, F feature) {
        return Registry.register(BuiltInRegistries.FEATURE, name, feature);
    }
    public static void registerDecoFeatures(){
        VaranDeco.LOGGER.debug("Registering Features for " + VaranDeco.MOD_ID);
    }
}
