package net.gecko.varandeco;

import com.terraformersmc.terraform.boat.api.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.impl.client.rendering.BlockColorRegistryImpl;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.entity.DecoEntities;
import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import java.util.List;

public class VaranDecoClient implements ClientModInitializer {
    public static final BlockTintSource BLANK_LAYER = BlockTintSources.constant(-1);
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(DecoEntities.SNOW_BRICK_PROJECTILE, ThrownItemRenderer::new);

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

        BlockColorRegistryImpl.register(List.of(BlockTintSources.grassBlock()), DecoBlocks.PACKED_GRASS, DecoBlocks.GRASS_CARPET,
                DecoBlocks.GRASS_SLAB, DecoBlocks.GRASS_STAIRS);
        BlockColorRegistryImpl.register(List.of(BlockTintSources.dryFoliage()), DecoBlocks.DRIED_LEAVES);
        BlockColorRegistryImpl.register(List.of(BlockTintSources.foliage()), DecoBlocks.WOODEN_LEAVES);
        BlockColorRegistryImpl.register(List.of(BLANK_LAYER, BlockTintSources.grass()), DecoBlocks.ROUGE_WILDFLOWERS, DecoBlocks.SWEET_WILDFLOWERS,
                DecoBlocks.GECKO_WILDFLOWERS);
    }
}
