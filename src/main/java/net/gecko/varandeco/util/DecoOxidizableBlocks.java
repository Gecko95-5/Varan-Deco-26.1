package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.gecko.varandeco.block.DecoBlocks;


public class DecoOxidizableBlocks {
    public static void registerOxidizableBlocks(){
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.HEAVY_COPPER_BARS, DecoBlocks.EXPOSED_HEAVY_COPPER_BARS);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, DecoBlocks.WEATHERED_HEAVY_COPPER_BARS);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS);

        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.LIGHT_COPPER_BARS, DecoBlocks.EXPOSED_LIGHT_COPPER_BARS);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS, DecoBlocks.WEATHERED_LIGHT_COPPER_BARS);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS, DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS);

        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.COPPER_SOUL_LANTERN, DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN, DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN, DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN);

        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);

        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.COPPER_BUTTON, DecoBlocks.EXPOSED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.EXPOSED_COPPER_BUTTON, DecoBlocks.WEATHERED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.WEATHERED_COPPER_BUTTON, DecoBlocks.OXIDIZED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.COPPER_STAIRS, DecoBlocks.EXPOSED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.EXPOSED_COPPER_STAIRS, DecoBlocks.WEATHERED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.WEATHERED_COPPER_STAIRS, DecoBlocks.OXIDIZED_COPPER_STAIRS);

        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.COPPER_SLAB, DecoBlocks.EXPOSED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.EXPOSED_COPPER_SLAB, DecoBlocks.WEATHERED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.WEATHERED_COPPER_SLAB, DecoBlocks.OXIDIZED_COPPER_SLAB);

        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.COPPER_LADDER, DecoBlocks.EXPOSED_COPPER_LADDER);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.EXPOSED_COPPER_LADDER, DecoBlocks.WEATHERED_COPPER_LADDER);
        OxidizableBlocksRegistry.registerNextStage(DecoBlocks.WEATHERED_COPPER_LADDER, DecoBlocks.OXIDIZED_COPPER_LADDER);

    }
    public static void registerWaxableBlocks(){
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.HEAVY_COPPER_BARS, DecoBlocks.WAXED_HEAVY_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.LIGHT_COPPER_BARS, DecoBlocks.WAXED_LIGHT_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS, DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS, DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS, DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.COPPER_SOUL_LANTERN, DecoBlocks.WAXED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN, DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN, DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN, DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);

        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);

        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.COPPER_BUTTON, DecoBlocks.WAXED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.EXPOSED_COPPER_BUTTON, DecoBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.WEATHERED_COPPER_BUTTON, DecoBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.OXIDIZED_COPPER_BUTTON, DecoBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.COPPER_STAIRS, DecoBlocks.WAXED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.EXPOSED_COPPER_STAIRS, DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.WEATHERED_COPPER_STAIRS, DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.OXIDIZED_COPPER_STAIRS, DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS);

        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.COPPER_SLAB, DecoBlocks.WAXED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.EXPOSED_COPPER_SLAB, DecoBlocks.WAXED_EXPOSED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.WEATHERED_COPPER_SLAB, DecoBlocks.WAXED_WEATHERED_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.OXIDIZED_COPPER_SLAB, DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB);

        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.COPPER_LADDER, DecoBlocks.WAXED_COPPER_LADDER);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.EXPOSED_COPPER_LADDER, DecoBlocks.WAXED_EXPOSED_COPPER_LADDER);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.WEATHERED_COPPER_LADDER, DecoBlocks.WAXED_WEATHERED_COPPER_LADDER);
        OxidizableBlocksRegistry.registerWaxable(DecoBlocks.OXIDIZED_COPPER_LADDER, DecoBlocks.WAXED_OXIDIZED_COPPER_LADDER);
    }
}
