package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.gecko.varandeco.block.DecoBlocks;

public class DecoStrippableBlocks {
    public static void registerStrippables(){
        StrippableBlockRegistry.register(DecoBlocks.WOODEN_LOG, DecoBlocks.STRIPPED_WOODEN_LOG);
        StrippableBlockRegistry.register(DecoBlocks.WOODEN_WOOD, DecoBlocks.STRIPPED_WOODEN_WOOD);

        StrippableBlockRegistry.register(DecoBlocks.DRIFTWOOD_LOG, DecoBlocks.STRIPPED_DRIFTWOOD_LOG);
        StrippableBlockRegistry.register(DecoBlocks.DRIFTWOOD, DecoBlocks.STRIPPED_DRIFTWOOD);
        StrippableBlockRegistry.register(DecoBlocks.DRIED_DRIFTWOOD_LOG, DecoBlocks.STRIPPED_DRIFTWOOD_LOG);
        StrippableBlockRegistry.register(DecoBlocks.DRIED_DRIFTWOOD, DecoBlocks.STRIPPED_DRIFTWOOD);

        StrippableBlockRegistry.register(DecoBlocks.IRON_CAP_STEM, DecoBlocks.STRIPPED_IRON_CAP_STEM);
        StrippableBlockRegistry.register(DecoBlocks.IRON_CAP_HYPHAE, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        StrippableBlockRegistry.register(DecoBlocks.PACKED_CACTUS, DecoBlocks.STRIPPED_CACTUS);
    }
}
