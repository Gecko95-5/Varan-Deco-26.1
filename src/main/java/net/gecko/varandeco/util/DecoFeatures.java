package net.gecko.varandeco.util;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.util.feature.DriftwoodSproutFeature;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class DecoFeatures {
    public static final Feature<CountConfig> DRIFTWOOD_SPROUT = register("driftwoood_sprout",
            new DriftwoodSproutFeature(CountConfig.CODEC));

    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return Registry.register(Registries.FEATURE, name, feature);
    }
    public static void registerDecoFeatures(){
        VaranDeco.LOGGER.debug("Registering Features for " + VaranDeco.MOD_ID);
    }
}
