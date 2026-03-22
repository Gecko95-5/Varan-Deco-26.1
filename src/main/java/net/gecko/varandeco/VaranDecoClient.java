package net.gecko.varandeco;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.entity.DecoEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.world.biome.GrassColors;
import net.minecraft.world.biome.FoliageColors;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.item.BlockItem;
import net.minecraft.world.biome.GrassColors;

public class VaranDecoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(DecoEntities.SNOW_BRICK_PROJECTILE, FlyingItemEntityRenderer::new);

        BlockRenderLayerMap.putBlock(DecoBlocks.YELLOW_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_YELLOW_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PURPLE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PURPLE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MAGENTA_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_MAGENTA_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLUE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLUE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLACK_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLACK_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GREEN_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_GREEN_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CYAN_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_CYAN_TULIP, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BARBERTON_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BARBERTON_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLUE_EYED_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLUE_EYED_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GERBERA_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_GERBERA_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MICHAELMAS_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_MICHAELMAS_DAISY, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_WOODEN_SAPLING, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.PUFFY_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PUFFY_DANDELION, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CALIFORNIA_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_CALIFORNIA_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SALMON_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_SALMON_POPPY, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.YELLOW_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_YELLOW_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PINK_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PINK_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WHITE_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_WHITE_ORCHID, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ENDER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ENDER_ROSE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ENDER_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WITHER_ROSE_BUSH, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.RED_SUNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.NOVA_STARFLOWER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.PAEONIA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PAEONIA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_LAVENDER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HAZZY_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_HAZZY_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRILL_LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_DRILL_LAVENDER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MUSHROOM_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MUSHROOM_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_DOOR, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_TRAPDOOR, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WARPED_WART_PLANT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_CAP_TRAPDOOR, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BLUE_HIBISCUS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLUE_HIBISCUS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BROMELIAD, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BROMELIAD, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BUTTERCUP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BUTTERCUP, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.NIGHTSHADE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_NIGHTSHADE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ENDERSHADE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ENDERSHADE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_CAP_MUSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_IRON_CAP_MUSHROOM, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ROUGE_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SWEET_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GECKO_WILDFLOWERS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ALPINE_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ALPINE_POPPY, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.DEAD_EYE_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_DEAD_EYE_DAISY, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.POPPED_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_POPPED_BLUET, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.IRIS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_IRIS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CYAN_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_CYAN_ORCHID, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BLUE_DELPHINIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLUE_DELPHINIUM, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.FELICIA_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_FELICIA_DAISY, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.MEGA_BROWN_TULIP, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BUBBLE_CORAL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_HORN_CORAL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BRAIN_CORAL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_FIRE_CORAL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_TUBE_CORAL, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BUBBLE_CORAL_FAN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_HORN_CORAL_FAN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BRAIN_CORAL_FAN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_FIRE_CORAL_FAN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_TUBE_CORAL_FAN, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL_FAN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_HORN_CORAL_WALL_FAN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_BRAIN_CORAL_WALL_FAN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_FIRE_CORAL_WALL_FAN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HYDRATED_TUBE_CORAL_WALL_FAN, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BIRCH_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SPRUCE_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.JUNGLE_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ACACIA_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DARK_OAK_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MANGROVE_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CRIMSON_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WARPED_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MUSHROOM_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BAMBOO_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CHERRY_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PALE_OAK_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_CAP_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BIRCH_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SPRUCE_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.JUNGLE_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ACACIA_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DARK_OAK_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MANGROVE_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CRIMSON_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WARPED_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BAMBOO_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CHERRY_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PALE_OAK_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_LADDER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.KELP_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DEAD_KELP_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_SPROUT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DRIFTWOOD_SAPLING, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.DRIED_LEAVES, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HEAVY_IRON_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.LIGHT_IRON_BARS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HEAVY_GOLD_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GOLD_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.LIGHT_GOLD_BARS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.TINTED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GLASS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GLASS_PANE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_TINTED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_TINTED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_WHITE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIME_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PINK_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GRAY_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLUE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BROWN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_RED_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLACK_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GREEN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIME_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIME_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PINK_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PINK_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_RED_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_RED_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.DEEPSLATE_STONECUTTER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLACKSTONE_STONECUTTER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.TUFF_STONECUTTER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.END_STONE_STONECUTTER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_GRATE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GOLD_GRATE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ANCIENT_ROSE_CROP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ANCIENT_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ANCIENT_ROSE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.MIGHTY_LAVENDER_CROP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MIGHTY_LAVENDER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.FRAGILE_ICE, BlockRenderLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_BLOCK, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SOLID_CLOUD, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_BRICKS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CHISELED_CLOUD_BRICKS, BlockRenderLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_STAIRS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_SLAB, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_WALL, BlockRenderLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_BRICK_STAIRS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_BRICK_SLAB, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CLOUD_BRICK_WALL, BlockRenderLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GOLDEN_LADDER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.COPPER_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_COPPER_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_COPPER_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_COPPER_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_COPPER_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_LADDER, BlockRenderLayer.CUTOUT);

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

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : -12012264,
                DecoBlocks.WOODEN_LEAVES);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getDryFoliageColor(world, pos) : -10732494,
                DecoBlocks.DRIED_LEAVES);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (tintIndex != 0) {
                return world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getDefaultColor();
            } else {
                return -1;
            }
        }, DecoBlocks.ROUGE_WILDFLOWERS, DecoBlocks.SWEET_WILDFLOWERS, DecoBlocks.GECKO_WILDFLOWERS);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (tintIndex == 0) {
                return world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getDefaultColor();
            }
            return -1;
        }, DecoBlocks.PACKED_GRASS, DecoBlocks.GRASS_SLAB, DecoBlocks.GRASS_STAIRS, DecoBlocks.GRASS_CARPET);
    }
}
