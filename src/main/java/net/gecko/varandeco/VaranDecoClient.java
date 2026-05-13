package net.gecko.varandeco;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.entity.DecoEntities;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.level.GrassColor;

public class VaranDecoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(DecoEntities.SNOW_BRICK_PROJECTILE, ThrownItemRenderer::new);

        BlockRenderLayerMap.putBlock(DecoBlocks.YELLOW_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_YELLOW_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PURPLE_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PURPLE_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MAGENTA_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_MAGENTA_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLUE_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLUE_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLACK_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLACK_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GREEN_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_GREEN_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CYAN_TULIP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_CYAN_TULIP, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BARBERTON_DAISY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BARBERTON_DAISY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLUE_EYED_DAISY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLUE_EYED_DAISY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GERBERA_DAISY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_GERBERA_DAISY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MICHAELMAS_DAISY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_MICHAELMAS_DAISY, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_SAPLING, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_WOODEN_SAPLING, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.PUFFY_DANDELION, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PUFFY_DANDELION, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CALIFORNIA_POPPY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_CALIFORNIA_POPPY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SALMON_POPPY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_SALMON_POPPY, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.YELLOW_ORCHID, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_YELLOW_ORCHID, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PINK_ORCHID, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PINK_ORCHID, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WHITE_ORCHID, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_WHITE_ORCHID, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ROSE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ROSE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ENDER_ROSE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ENDER_ROSE, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ENDER_ROSE_BUSH, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WITHER_ROSE_BUSH, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.RED_SUNFLOWER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.NOVA_STARFLOWER, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.PAEONIA, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PAEONIA, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.LAVENDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_LAVENDER, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HAZZY_BLUET, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_HAZZY_BLUET, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRILL_LAVENDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_DRILL_LAVENDER, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MUSHROOM_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MUSHROOM_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_TRAPDOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_DOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_TRAPDOOR, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_LEAVES, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WARPED_WART_PLANT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_CAP_TRAPDOOR, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BLUE_HIBISCUS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLUE_HIBISCUS, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BROMELIAD, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BROMELIAD, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BUTTERCUP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BUTTERCUP, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.NIGHTSHADE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_NIGHTSHADE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ENDERSHADE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ENDERSHADE, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_CAP_MUSHROOM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_IRON_CAP_MUSHROOM, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ROUGE_WILDFLOWERS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SWEET_WILDFLOWERS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GECKO_WILDFLOWERS, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ALPINE_POPPY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ALPINE_POPPY, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.DEAD_EYE_DAISY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_DEAD_EYE_DAISY, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.POPPED_BLUET, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_POPPED_BLUET, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.IRIS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_IRIS, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CYAN_ORCHID, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_CYAN_ORCHID, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BLUE_DELPHINIUM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLUE_DELPHINIUM, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.FELICIA_DAISY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_FELICIA_DAISY, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.MEGA_BROWN_TULIP, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BUBBLE_CORAL, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_HORN_CORAL, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BRAIN_CORAL, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_FIRE_CORAL, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_TUBE_CORAL, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BUBBLE_CORAL_FAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_HORN_CORAL_FAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BRAIN_CORAL_FAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_FIRE_CORAL_FAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_TUBE_CORAL_FAN, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL_FAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_HORN_CORAL_WALL_FAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BRAIN_CORAL_WALL_FAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_FIRE_CORAL_WALL_FAN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_TUBE_CORAL_WALL_FAN, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BIRCH_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SPRUCE_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.JUNGLE_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ACACIA_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DARK_OAK_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MANGROVE_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CRIMSON_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WARPED_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MUSHROOM_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BAMBOO_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CHERRY_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PALE_OAK_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_CAP_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BIRCH_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SPRUCE_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.JUNGLE_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ACACIA_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DARK_OAK_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MANGROVE_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CRIMSON_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WARPED_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BAMBOO_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CHERRY_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PALE_OAK_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_LADDER, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.KELP_LEAVES, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DEAD_KELP_LEAVES, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_SPROUT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_SAPLING, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.DRIED_LEAVES, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HEAVY_IRON_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.LIGHT_IRON_BARS, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HEAVY_GOLD_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GOLD_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.LIGHT_GOLD_BARS, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HEAVY_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_HEAVY_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.LIGHT_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_LIGHT_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.COPPER_SOUL_LANTERN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_COPPER_SOUL_LANTERN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.TINTED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GLASS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GLASS_PANE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_TINTED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_TINTED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_WHITE_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIME_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PINK_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GRAY_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLUE_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BROWN_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_RED_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLACK_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GREEN_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIME_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIME_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PINK_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PINK_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_RED_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_RED_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS_PANE, ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.DEEPSLATE_STONECUTTER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLACKSTONE_STONECUTTER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.TUFF_STONECUTTER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.END_STONE_STONECUTTER, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_GRATE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GOLD_GRATE, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ANCIENT_ROSE_CROP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ANCIENT_ROSE, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ANCIENT_ROSE, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.MIGHTY_LAVENDER_CROP, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MIGHTY_LAVENDER, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.FRAGILE_ICE, ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_BLOCK, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SOLID_CLOUD, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_BRICKS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CHISELED_CLOUD_BRICKS, ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_STAIRS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_SLAB, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_WALL, ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_BRICK_STAIRS, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_BRICK_SLAB, ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_BRICK_WALL, ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GOLDEN_LADDER, ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.COPPER_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_COPPER_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_COPPER_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_COPPER_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_COPPER_LADDER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_LADDER, ChunkSectionLayer.CUTOUT);

        TerraformBoatClientHelper.registerModelLayers(DecoBoats.CACTUS_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.MUSHROOM_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.WOODEN_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.CRIMSON_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.WARPED_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.DRIFTWOOD_RAFT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.BAMBOO_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.IRON_CAP_BOAT_ID);

        TerraformBoatClientHelper.registerModelLayers(DecoBoats.OAK_RAFT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.SPRUCE_RAFT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.BIRCH_RAFT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.JUNGLE_RAFT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.ACACIA_RAFT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.DARK_OAK_RAFT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.MANGROVE_RAFT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.CHERRY_RAFT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.PALE_OAK_RAFT_ID);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : -12012264,
                DecoBlocks.WOODEN_LEAVES);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getAverageDryFoliageColor(world, pos) : -10732494,
                DecoBlocks.DRIED_LEAVES);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (tintIndex != 0) {
                return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.getDefaultColor();
            } else {
                return -1;
            }
        }, DecoBlocks.ROUGE_WILDFLOWERS, DecoBlocks.SWEET_WILDFLOWERS, DecoBlocks.GECKO_WILDFLOWERS);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (tintIndex == 0) {
                return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.getDefaultColor();
            }
            return -1;
        }, DecoBlocks.PACKED_GRASS, DecoBlocks.GRASS_SLAB, DecoBlocks.GRASS_STAIRS, DecoBlocks.GRASS_CARPET);
    }
}
