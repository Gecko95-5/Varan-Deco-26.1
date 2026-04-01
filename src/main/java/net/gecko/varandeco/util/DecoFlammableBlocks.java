package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.world.level.block.Blocks;

public class DecoFlammableBlocks {
    public static void registerFlammableBlocks(){
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(DecoBlocks.CACTUS_PLANKS,5,20);
        registry.add(Blocks.CACTUS,5,5);

        registry.add(DecoBlocks.CACTUS_PLANK_STAIRS,5,20);
        registry.add(DecoBlocks.CACTUS_PLANK_SLAB,5,20);
        registry.add(DecoBlocks.CACTUS_PLANK_FENCE,5,20);
        registry.add(DecoBlocks.CACTUS_PLANK_FENCE_GATE,5,20);

        registry.add(DecoBlocks.WOODEN_PLANKS,5,20);
        registry.add(DecoBlocks.WOODEN_LOG,5,5);
        registry.add(DecoBlocks.STRIPPED_WOODEN_LOG,5,5);
        registry.add(DecoBlocks.WOODEN_WOOD,5,5);
        registry.add(DecoBlocks.STRIPPED_WOODEN_WOOD,5,5);

        registry.add(DecoBlocks.WOODEN_STAIRS,5,20);
        registry.add(DecoBlocks.WOODEN_SLAB,5,20);
        registry.add(DecoBlocks.WOODEN_FENCE,5,20);
        registry.add(DecoBlocks.WOODEN_FENCE_GATE,5,20);
        registry.add(DecoBlocks.WOODEN_LEAVES,30, 60);

        registry.add(DecoBlocks.DRIFTWOOD_PLANKS,5,20);
        registry.add(DecoBlocks.DRIED_DRIFTWOOD_LOG,5,5);
        registry.add(DecoBlocks.STRIPPED_DRIFTWOOD_LOG,5,5);
        registry.add(DecoBlocks.DRIED_DRIFTWOOD,5,5);
        registry.add(DecoBlocks.STRIPPED_DRIFTWOOD,5,5);

        registry.add(DecoBlocks.DRIFTWOOD_STAIRS,5,20);
        registry.add(DecoBlocks.DRIFTWOOD_SLAB,5,20);
        registry.add(DecoBlocks.DRIFTWOOD_FENCE,5,20);
        registry.add(DecoBlocks.DRIFTWOOD_FENCE_GATE,5,20);
        registry.add(DecoBlocks.DEAD_KELP_LEAVES,30, 60);

        registry.add(DecoBlocks.YELLOW_TULIP,60, 100);
        registry.add(DecoBlocks.PURPLE_TULIP,60, 100);
        registry.add(DecoBlocks.MAGENTA_TULIP,60, 100);
        registry.add(DecoBlocks.BLACK_TULIP,60, 100);
        registry.add(DecoBlocks.GREEN_TULIP,60, 100);
        registry.add(DecoBlocks.BLUE_TULIP,60, 100);
        registry.add(DecoBlocks.CYAN_TULIP,60, 100);

        registry.add(DecoBlocks.BARBERTON_DAISY,60, 100);
        registry.add(DecoBlocks.BLUE_EYED_DAISY,60, 100);
        registry.add(DecoBlocks.GERBERA_DAISY,60, 100);
        registry.add(DecoBlocks.MICHAELMAS_DAISY,60, 100);

        registry.add(DecoBlocks.PUFFY_DANDELION,60, 100);

        registry.add(DecoBlocks.CALIFORNIA_POPPY,60, 100);
        registry.add(DecoBlocks.SALMON_POPPY,60, 100);

        registry.add(DecoBlocks.YELLOW_ORCHID,60, 100);
        registry.add(DecoBlocks.WHITE_ORCHID,60, 100);
        registry.add(DecoBlocks.PINK_ORCHID,60, 100);

        registry.add(DecoBlocks.ROSE,60, 100);
        registry.add(DecoBlocks.ENDER_ROSE,60, 100);
        registry.add(DecoBlocks.WITHER_ROSE_BUSH,60, 100);
        registry.add(DecoBlocks.ENDER_ROSE_BUSH,60, 100);

        registry.add(DecoBlocks.RED_SUNFLOWER,60, 100);
        registry.add(DecoBlocks.NOVA_STARFLOWER,60, 100);

        registry.add(DecoBlocks.PAEONIA,60, 100);
        registry.add(DecoBlocks.LAVENDER,60, 100);

        registry.add(DecoBlocks.BROMELIAD,60, 100);
        registry.add(DecoBlocks.BLUE_HIBISCUS,60, 100);

        registry.add(DecoBlocks.BUTTERCUP,60, 100);

        registry.add(DecoBlocks.NIGHTSHADE,60, 100);
        registry.add(DecoBlocks.ENDERSHADE,60, 100);

        registry.add(DecoBlocks.POPPED_BLUET,60, 100);
        registry.add(DecoBlocks.ALPINE_POPPY,60, 100);
        registry.add(DecoBlocks.DEAD_EYE_DAISY,60, 100);

        registry.add(DecoBlocks.HAZZY_BLUET,60, 100);
        registry.add(DecoBlocks.DRILL_LAVENDER,60, 100);

        registry.add(DecoBlocks.ROUGE_WILDFLOWERS,60, 100);
        registry.add(DecoBlocks.SWEET_WILDFLOWERS,60, 100);
        registry.add(DecoBlocks.GECKO_WILDFLOWERS,60, 100);

        registry.add(DecoBlocks.IRIS,60, 100);
        registry.add(DecoBlocks.BLUE_DELPHINIUM,60, 100);
        registry.add(DecoBlocks.CYAN_ORCHID,60, 100);
        registry.add(DecoBlocks.FELICIA_DAISY,60, 100);

        registry.add(net.gecko.varandeco.util.DecoTags.Blocks.LOG_STAIRS,5,5);
        registry.add(net.gecko.varandeco.util.DecoTags.Blocks.LOG_SLABS,5,5);
        registry.add(net.gecko.varandeco.util.DecoTags.Blocks.LOG_WALLS,5,5);

        registry.add(net.gecko.varandeco.util.DecoTags.Blocks.WOOL_STAIRS,30, 60);
        registry.add(net.gecko.varandeco.util.DecoTags.Blocks.WOOL_SLABS,30, 60);

        registry.add(net.gecko.varandeco.util.DecoTags.Blocks.WOODEN_BOOKSHELVES,30,20);

        registry.add(net.gecko.varandeco.util.DecoTags.Blocks.WOODEN_BOOKSHELF_STAIRS,25,20);

        registry.add(net.gecko.varandeco.util.DecoTags.Blocks.WOODEN_BOOKSHELF_SLABS,15,20);

        registry.add(DecoBlocks.ANCIENT_ROSE,60, 100);
        registry.add(DecoBlocks.MIGHTY_LAVENDER,60, 100);

        registry.add(net.gecko.varandeco.util.DecoTags.Blocks.MOSAIC_WOOD,5,20);
        registry.add(net.gecko.varandeco.util.DecoTags.Blocks.MOSAIC_SLABS,5,20);
        registry.add(DecoTags.Blocks.MOSAIC_STAIRS,5,20);

        registry.add(DecoBlocks.DRIED_LEAVES, 60, 100);
    }
}
