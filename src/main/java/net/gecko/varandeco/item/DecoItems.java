package net.gecko.varandeco.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.item.custom.BubbleItem;
import net.gecko.varandeco.item.custom.SnowBrickItem;
import net.gecko.varandeco.util.interfaces.CoralFanFunction;
import net.gecko.varandeco.util.interfaces.HangingSignRegisterFunction;
import net.gecko.varandeco.util.interfaces.SignRegisterFunction;
import net.gecko.varandeco.util.interfaces.TallPlantItemRegisterFunction;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Function;

public class DecoItems {

    public static final Item CACTUS_SIGN = registerSignItem("cactus_sign",
            DecoBlocks.STANDING_CACTUS_SIGN, DecoBlocks.WALL_CACTUS_SIGN, SignItem::new);
    public static final Item MUSHROOM_SIGN = registerSignItem("mushroom_sign",
                    DecoBlocks.STANDING_MUSHROOM_SIGN, DecoBlocks.WALL_MUSHROOM_SIGN, SignItem::new);
    public static final Item IRON_CAP_SIGN = registerSignItem("iron_cap_sign",
                    DecoBlocks.STANDING_IRON_CAP_SIGN, DecoBlocks.WALL_IRON_CAP_SIGN, SignItem::new);
    public static final Item WOODEN_SIGN = registerSignItem("wooden_sign",
            DecoBlocks.STANDING_WOODEN_SIGN, DecoBlocks.WALL_WOODEN_SIGN, SignItem::new);
    public static final Item DRIFTWOOD_SIGN = registerSignItem("driftwood_sign",
            DecoBlocks.STANDING_DRIFTWOOD_SIGN, DecoBlocks.WALL_DRIFTWOOD_SIGN, SignItem::new);

    public static final Item STRIPPED_OAK_SIGN = registerSignItem("stripped_oak_sign",
            DecoBlocks.STANDING_STRIPPED_OAK_SIGN, DecoBlocks.WALL_STRIPPED_OAK_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_SPRUCE_SIGN = registerSignItem("stripped_spruce_sign",
            DecoBlocks.STANDING_STRIPPED_SPRUCE_SIGN, DecoBlocks.WALL_STRIPPED_SPRUCE_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_BIRCH_SIGN = registerSignItem("stripped_birch_sign",
            DecoBlocks.STANDING_STRIPPED_BIRCH_SIGN, DecoBlocks.WALL_STRIPPED_BIRCH_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_JUNGLE_SIGN = registerSignItem("stripped_jungle_sign",
            DecoBlocks.STANDING_STRIPPED_JUNGLE_SIGN, DecoBlocks.WALL_STRIPPED_JUNGLE_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_ACACIA_SIGN = registerSignItem("stripped_acacia_sign",
            DecoBlocks.STANDING_STRIPPED_ACACIA_SIGN, DecoBlocks.WALL_STRIPPED_ACACIA_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_DARK_OAK_SIGN = registerSignItem("stripped_dark_oak_sign",
            DecoBlocks.STANDING_STRIPPED_DARK_OAK_SIGN, DecoBlocks.WALL_STRIPPED_DARK_OAK_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_MANGROVE_SIGN = registerSignItem("stripped_mangrove_sign",
            DecoBlocks.STANDING_STRIPPED_MANGROVE_SIGN, DecoBlocks.WALL_STRIPPED_MANGROVE_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_CHERRY_SIGN = registerSignItem("stripped_cherry_sign",
            DecoBlocks.STANDING_STRIPPED_CHERRY_SIGN, DecoBlocks.WALL_STRIPPED_CHERRY_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_CRIMSON_SIGN = registerSignItem("stripped_crimson_sign",
            DecoBlocks.STANDING_STRIPPED_CRIMSON_SIGN, DecoBlocks.WALL_STRIPPED_CRIMSON_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_WARPED_SIGN = registerSignItem("stripped_warped_sign",
            DecoBlocks.STANDING_STRIPPED_WARPED_SIGN, DecoBlocks.WALL_STRIPPED_WARPED_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_CACTUS_SIGN = registerSignItem("stripped_cactus_sign",
                    DecoBlocks.STANDING_STRIPPED_CACTUS_SIGN, DecoBlocks.WALL_STRIPPED_CACTUS_SIGN, SignItem::new);
    public static final Item MUSHROOM_STEM_SIGN = registerSignItem("mushroom_stem_sign",
                    DecoBlocks.STANDING_MUSHROOM_STEM_SIGN, DecoBlocks.WALL_MUSHROOM_STEM_SIGN, SignItem::new);
    public static final Item STRIPPED_IRON_CAP_SIGN = registerSignItem("stripped_iron_cap_sign",
                    DecoBlocks.STANDING_STRIPPED_IRON_CAP_SIGN, DecoBlocks.WALL_STRIPPED_IRON_CAP_SIGN, SignItem::new);
    public static final Item STRIPPED_WOODEN_SIGN = registerSignItem("stripped_wooden_sign",
            DecoBlocks.STANDING_STRIPPED_WOODEN_SIGN, DecoBlocks.WALL_STRIPPED_WOODEN_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_PALE_OAK_SIGN = registerSignItem("stripped_pale_oak_sign",
            DecoBlocks.STANDING_STRIPPED_PALE_OAK_SIGN, DecoBlocks.WALL_STRIPPED_PALE_OAK_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_DRIFTWOOD_SIGN = registerSignItem("stripped_driftwood_sign",
            DecoBlocks.STANDING_STRIPPED_DRIFTWOOD_SIGN, DecoBlocks.WALL_STRIPPED_DRIFTWOOD_SIGN,
                    SignItem::new);

    public static final Item OAK_MOSAIC_SIGN = registerSignItem("oak_mosaic_sign",
            DecoBlocks.STANDING_OAK_MOSAIC_SIGN, DecoBlocks.WALL_OAK_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item SPRUCE_MOSAIC_SIGN = registerSignItem("spruce_mosaic_sign",
            DecoBlocks.STANDING_SPRUCE_MOSAIC_SIGN, DecoBlocks.WALL_SPRUCE_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item BIRCH_MOSAIC_SIGN = registerSignItem("birch_mosaic_sign",
            DecoBlocks.STANDING_BIRCH_MOSAIC_SIGN, DecoBlocks.WALL_BIRCH_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item JUNGLE_MOSAIC_SIGN = registerSignItem("jungle_mosaic_sign",
            DecoBlocks.STANDING_JUNGLE_MOSAIC_SIGN, DecoBlocks.WALL_JUNGLE_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item ACACIA_MOSAIC_SIGN = registerSignItem("acacia_mosaic_sign",
            DecoBlocks.STANDING_ACACIA_MOSAIC_SIGN, DecoBlocks.WALL_ACACIA_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item DARK_OAK_MOSAIC_SIGN = registerSignItem("dark_oak_mosaic_sign",
            DecoBlocks.STANDING_DARK_OAK_MOSAIC_SIGN, DecoBlocks.WALL_DARK_OAK_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item MANGROVE_MOSAIC_SIGN = registerSignItem("mangrove_mosaic_sign",
            DecoBlocks.STANDING_MANGROVE_MOSAIC_SIGN, DecoBlocks.WALL_MANGROVE_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item CHERRY_MOSAIC_SIGN = registerSignItem("cherry_mosaic_sign",
            DecoBlocks.STANDING_CHERRY_MOSAIC_SIGN, DecoBlocks.WALL_CHERRY_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item BAMBOO_MOSAIC_SIGN = registerSignItem("bamboo_mosaic_sign",
            DecoBlocks.STANDING_BAMBOO_MOSAIC_SIGN, DecoBlocks.WALL_BAMBOO_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item CRIMSON_MOSAIC_SIGN = registerSignItem("crimson_mosaic_sign",
            DecoBlocks.STANDING_CRIMSON_MOSAIC_SIGN, DecoBlocks.WALL_CRIMSON_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item WARPED_MOSAIC_SIGN = registerSignItem("warped_mosaic_sign",
            DecoBlocks.STANDING_WARPED_MOSAIC_SIGN, DecoBlocks.WALL_WARPED_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item CACTUS_MOSAIC_SIGN = registerSignItem("cactus_mosaic_sign",
            DecoBlocks.STANDING_CACTUS_MOSAIC_SIGN, DecoBlocks.WALL_CACTUS_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item MUSHROOM_MOSAIC_SIGN = registerSignItem("mushroom_mosaic_sign",
                    DecoBlocks.STANDING_MUSHROOM_MOSAIC_SIGN, DecoBlocks.WALL_MUSHROOM_MOSAIC_SIGN, SignItem::new);
    public static final Item IRON_CAP_MOSAIC_SIGN = registerSignItem("iron_cap_mosaic_sign",
                    DecoBlocks.STANDING_IRON_CAP_MOSAIC_SIGN, DecoBlocks.WALL_IRON_CAP_MOSAIC_SIGN, SignItem::new);
    public static final Item WOODEN_MOSAIC_SIGN = registerSignItem("wooden_mosaic_sign",
            DecoBlocks.STANDING_WOODEN_MOSAIC_SIGN, DecoBlocks.WALL_WOODEN_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item PALE_OAK_MOSAIC_SIGN = registerSignItem("pale_oak_mosaic_sign",
            DecoBlocks.STANDING_PALE_OAK_MOSAIC_SIGN, DecoBlocks.WALL_PALE_OAK_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item DRIFTWOOD_MOSAIC_SIGN = registerSignItem("driftwood_mosaic_sign",
            DecoBlocks.STANDING_DRIFTWOOD_MOSAIC_SIGN, DecoBlocks.WALL_DRIFTWOOD_MOSAIC_SIGN,
                    SignItem::new);

    public static final Item CACTUS_HANGING_SIGN = registerHangingSignItem("cactus_hanging_sign",
            DecoBlocks.HANGING_CACTUS_SIGN, DecoBlocks.WALL_HANGING_CACTUS_SIGN, HangingSignItem::new);
    public static final Item MUSHROOM_HANGING_SIGN = registerHangingSignItem("mushroom_hanging_sign",
            DecoBlocks.HANGING_MUSHROOM_SIGN, DecoBlocks.WALL_HANGING_MUSHROOM_SIGN, HangingSignItem::new);
    public static final Item IRON_CAP_HANGING_SIGN = registerHangingSignItem("iron_cap_hanging_sign",
            DecoBlocks.HANGING_IRON_CAP_SIGN, DecoBlocks.WALL_HANGING_IRON_CAP_SIGN, HangingSignItem::new);
    public static final Item WOODEN_HANGING_SIGN = registerHangingSignItem("wooden_hanging_sign",
            DecoBlocks.WALL_HANGING_WOODEN_SIGN, DecoBlocks.HANGING_WOODEN_SIGN, HangingSignItem::new);

    public static final Item DRIFTWOOD_HANGING_SIGN = registerHangingSignItem("driftwood_hanging_sign",
            DecoBlocks.WALL_HANGING_DRIFTWOOD_SIGN, DecoBlocks.HANGING_DRIFTWOOD_SIGN, HangingSignItem::new);

    public static final Item OAK_MOSAIC_HANGING_SIGN = registerHangingSignItem("oak_mosaic_hanging_sign",
            DecoBlocks.HANGING_OAK_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_OAK_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item SPRUCE_MOSAIC_HANGING_SIGN = registerHangingSignItem("spruce_mosaic_hanging_sign",
            DecoBlocks.HANGING_SPRUCE_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_SPRUCE_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item BIRCH_MOSAIC_HANGING_SIGN = registerHangingSignItem("birch_mosaic_hanging_sign",
            DecoBlocks.HANGING_BIRCH_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_BIRCH_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item JUNGLE_MOSAIC_HANGING_SIGN = registerHangingSignItem("jungle_mosaic_hanging_sign",
            DecoBlocks.HANGING_JUNGLE_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_JUNGLE_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item ACACIA_MOSAIC_HANGING_SIGN = registerHangingSignItem("acacia_mosaic_hanging_sign",
            DecoBlocks.HANGING_ACACIA_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_ACACIA_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item DARK_OAK_MOSAIC_HANGING_SIGN = registerHangingSignItem("dark_oak_mosaic_hanging_sign",
            DecoBlocks.HANGING_DARK_OAK_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_DARK_OAK_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item MANGROVE_MOSAIC_HANGING_SIGN = registerHangingSignItem("mangrove_mosaic_hanging_sign",
            DecoBlocks.HANGING_MANGROVE_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_MANGROVE_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item CHERRY_MOSAIC_HANGING_SIGN = registerHangingSignItem("cherry_mosaic_hanging_sign",
            DecoBlocks.HANGING_CHERRY_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_CHERRY_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item BAMBOO_MOSAIC_HANGING_SIGN = registerHangingSignItem("bamboo_mosaic_hanging_sign",
            DecoBlocks.HANGING_BAMBOO_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_BAMBOO_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item CRIMSON_MOSAIC_HANGING_SIGN = registerHangingSignItem("crimson_mosaic_hanging_sign",
            DecoBlocks.HANGING_CRIMSON_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_CRIMSON_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item WARPED_MOSAIC_HANGING_SIGN = registerHangingSignItem("warped_mosaic_hanging_sign",
            DecoBlocks.HANGING_WARPED_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_WARPED_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item CACTUS_MOSAIC_HANGING_SIGN = registerHangingSignItem("cactus_mosaic_hanging_sign",
            DecoBlocks.HANGING_CACTUS_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_CACTUS_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item MUSHROOM_MOSAIC_HANGING_SIGN = registerHangingSignItem("mushroom_mosaic_hanging_sign",
            DecoBlocks.HANGING_MUSHROOM_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_MUSHROOM_MOSAIC_SIGN, HangingSignItem::new);
    public static final Item IRON_CAP_MOSAIC_HANGING_SIGN = registerHangingSignItem("iron_cap_mosaic_hanging_sign",
            DecoBlocks.HANGING_IRON_CAP_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_IRON_CAP_MOSAIC_SIGN, HangingSignItem::new);
    public static final Item WOODEN_MOSAIC_HANGING_SIGN = registerHangingSignItem("wooden_mosaic_hanging_sign",
            DecoBlocks.HANGING_WOODEN_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_WOODEN_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item PALE_OAK_MOSAIC_HANGING_SIGN = registerHangingSignItem("pale_oak_mosaic_hanging_sign",
            DecoBlocks.HANGING_PALE_OAK_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_PALE_OAK_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item DRIFTWOOD_MOSAIC_HANGING_SIGN = registerHangingSignItem("driftwood_mosaic_hanging_sign",
            DecoBlocks.HANGING_DRIFTWOOD_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_DRIFTWOOD_MOSAIC_SIGN,
            HangingSignItem::new);

    public static final Item OAK_PLANKS_HANGING_SIGN = registerHangingSignItem("oak_planks_hanging_sign",
            DecoBlocks.HANGING_OAK_PLANKS_SIGN, DecoBlocks.WALL_HANGING_OAK_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item SPRUCE_PLANKS_HANGING_SIGN = registerHangingSignItem("spruce_planks_hanging_sign",
            DecoBlocks.HANGING_SPRUCE_PLANKS_SIGN, DecoBlocks.WALL_HANGING_SPRUCE_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item BIRCH_PLANKS_HANGING_SIGN = registerHangingSignItem("birch_planks_hanging_sign",
            DecoBlocks.HANGING_BIRCH_PLANKS_SIGN, DecoBlocks.WALL_HANGING_BIRCH_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item JUNGLE_PLANKS_HANGING_SIGN = registerHangingSignItem("jungle_planks_hanging_sign",
            DecoBlocks.HANGING_JUNGLE_PLANKS_SIGN, DecoBlocks.WALL_HANGING_JUNGLE_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item ACACIA_PLANKS_HANGING_SIGN = registerHangingSignItem("acacia_planks_hanging_sign",
            DecoBlocks.HANGING_ACACIA_PLANKS_SIGN, DecoBlocks.WALL_HANGING_ACACIA_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item DARK_OAK_PLANKS_HANGING_SIGN = registerHangingSignItem("dark_oak_planks_hanging_sign",
            DecoBlocks.HANGING_DARK_OAK_PLANKS_SIGN, DecoBlocks.WALL_HANGING_DARK_OAK_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item MANGROVE_PLANKS_HANGING_SIGN = registerHangingSignItem("mangrove_planks_hanging_sign",
            DecoBlocks.HANGING_MANGROVE_PLANKS_SIGN, DecoBlocks.WALL_HANGING_MANGROVE_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item CHERRY_PLANKS_HANGING_SIGN = registerHangingSignItem("cherry_planks_hanging_sign",
            DecoBlocks.HANGING_CHERRY_PLANKS_SIGN, DecoBlocks.WALL_HANGING_CHERRY_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item CRIMSON_PLANKS_HANGING_SIGN = registerHangingSignItem("crimson_planks_hanging_sign",
            DecoBlocks.HANGING_CRIMSON_PLANKS_SIGN, DecoBlocks.WALL_HANGING_CRIMSON_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item WARPED_PLANKS_HANGING_SIGN = registerHangingSignItem("warped_planks_hanging_sign",
            DecoBlocks.HANGING_WARPED_PLANKS_SIGN, DecoBlocks.WALL_HANGING_WARPED_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item CACTUS_PLANKS_HANGING_SIGN = registerHangingSignItem("cactus_planks_hanging_sign",
            DecoBlocks.HANGING_CACTUS_PLANKS_SIGN, DecoBlocks.WALL_HANGING_CACTUS_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item MUSHROOM_PLANKS_HANGING_SIGN = registerHangingSignItem("mushroom_planks_hanging_sign",
            DecoBlocks.HANGING_MUSHROOM_PLANKS_SIGN, DecoBlocks.WALL_HANGING_MUSHROOM_PLANKS_SIGN, HangingSignItem::new);
    public static final Item IRON_CAP_PLANKS_HANGING_SIGN = registerHangingSignItem("iron_cap_planks_hanging_sign",
            DecoBlocks.HANGING_IRON_CAP_PLANKS_SIGN, DecoBlocks.WALL_HANGING_IRON_CAP_PLANKS_SIGN, HangingSignItem::new);
    public static final Item WOODEN_PLANKS_HANGING_SIGN = registerHangingSignItem("wooden_planks_hanging_sign",
            DecoBlocks.HANGING_WOODEN_PLANKS_SIGN, DecoBlocks.WALL_HANGING_WOODEN_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item PALE_OAK_PLANKS_HANGING_SIGN = registerHangingSignItem("pale_oak_planks_hanging_sign",
            DecoBlocks.HANGING_PALE_OAK_PLANKS_SIGN, DecoBlocks.WALL_HANGING_PALE_OAK_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item DRIFTWOOD_PLANKS_HANGING_SIGN = registerHangingSignItem("driftwood_planks_hanging_sign",
            DecoBlocks.HANGING_DRIFTWOOD_PLANKS_SIGN, DecoBlocks.WALL_HANGING_DRIFTWOOD_PLANKS_SIGN,
            HangingSignItem::new);

    public static final Item HYDRATED_TUBE_CORAL_FAN = registerBlock("hydrated_tube_coral_fan",
            DecoBlocks.HYDRATED_TUBE_CORAL_FAN, DecoBlocks.HYDRATED_TUBE_CORAL_WALL_FAN, Direction.DOWN,
            StandingAndWallBlockItem::new);

    public static final Item HYDRATED_BRAIN_CORAL_FAN = registerBlock("hydrated_brain_coral_fan",
            DecoBlocks.HYDRATED_BRAIN_CORAL_FAN, DecoBlocks.HYDRATED_BRAIN_CORAL_WALL_FAN, Direction.DOWN,
            StandingAndWallBlockItem::new);

    public static final Item HYDRATED_BUBBLE_CORAL_FAN = registerBlock("hydrated_bubble_coral_fan",
            DecoBlocks.HYDRATED_BUBBLE_CORAL_FAN, DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL_FAN, Direction.DOWN,
            StandingAndWallBlockItem::new);

    public static final Item HYDRATED_FIRE_CORAL_FAN = registerBlock("hydrated_fire_coral_fan",
            DecoBlocks.HYDRATED_FIRE_CORAL_FAN, DecoBlocks.HYDRATED_FIRE_CORAL_WALL_FAN, Direction.DOWN,
            StandingAndWallBlockItem::new);

    public static final Item HYDRATED_HORN_CORAL_FAN = registerBlock("hydrated_horn_coral_fan",
            DecoBlocks.HYDRATED_HORN_CORAL_FAN, DecoBlocks.HYDRATED_HORN_CORAL_WALL_FAN, Direction.DOWN,
            StandingAndWallBlockItem::new);

    public static final Item SNOW_BRICK = registerCooldownItem("snow_brick",16, 1, SnowBrickItem::new);

    public static final Item PASSTOL = registerItem("passtol", 64, Item::new);

    public static final Item SHADDOL = registerItem("shaddol", 64, Item::new);

    public static final Item BUBBLE_ORB = registerItem("bubble_orb",64, BubbleItem::new);

    public static final Item EARTH_SPHERE = registerItem("earth_sphere", 64, Item::new);

    public static final Item ICE_SHARD = registerItem("ice_shard",64, Item::new);

    public static final Item WARPED_WART = registerItem("warped_wart",
            64, createBlockItemWithUniqueName(DecoBlocks.WARPED_WART_PLANT));

    public static final Item ANCIENT_ROSE_SEEDS = registerItem("ancient_rose_seeds",
            64, createBlockItemWithUniqueName(DecoBlocks.ANCIENT_ROSE_CROP));

    public static final Item MIGHTY_LAVENDER_FLOWER = registerItem("mighty_lavender_flower", 64,
            createBlockItemWithUniqueName(DecoBlocks.MIGHTY_LAVENDER_CROP));

    public static final Item LILAC_FLOWER = registerItem("lilac_flower",64, Item::new);

    public static final Item TALL_SEAGRASS = registerTallItem("tall_seagrass", Blocks.TALL_SEAGRASS, DoubleHighBlockItem::new);

    public static final Item CACTUS_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_BOAT_ID,
            false, false);
    public static final Item CACTUS_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_BOAT_ID,
            true, false);

    public static final Item MUSHROOM_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MUSHROOM_BOAT_ID,
            false, false);
    public static final Item MUSHROOM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MUSHROOM_BOAT_ID,
            true, false);

    public static final Item DRIFTWOOD_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.DRIFTWOOD_RAFT_ID,
            false, false);
    public static final Item DRIFTWOOD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.DRIFTWOOD_RAFT_ID,
            true, false);

    public static final Item WOODEN_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_BOAT_ID,
            false, false);
    public static final Item WOODEN_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_BOAT_ID,
            true, false);

    public static final Item CRIMSON_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_BOAT_ID,
            false, false);
    public static final Item CRIMSON_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_BOAT_ID,
            true, false);

    public static final Item WARPED_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_BOAT_ID,
            false,false);
    public static final Item WARPED_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_BOAT_ID,
            true, false);

    public static final Item DRIFTWOOD_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.DRIFTWOOD_RAFT_ID,
            false,true);
    public static final Item DRIFTWOOD_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.DRIFTWOOD_RAFT_ID,
            true, true);

    public static final Item BAMBOO_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.BAMBOO_BOAT_ID,
            false,false);
    public static final Item BAMBOO_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.BAMBOO_BOAT_ID,
            true, false);

    public static final Item OAK_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.OAK_RAFT_ID,
            false,true);
    public static final Item OAK_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.OAK_RAFT_ID,
            true, true);

    public static final Item SPRUCE_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.SPRUCE_RAFT_ID,
            false,true);
    public static final Item SPRUCE_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.SPRUCE_RAFT_ID,
            true, true);

    public static final Item BIRCH_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.BIRCH_RAFT_ID,
            false,true);
    public static final Item BIRCH_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.BIRCH_RAFT_ID,
            true, true);

    public static final Item JUNGLE_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.JUNGLE_RAFT_ID,
            false,true);
    public static final Item JUNGLE_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.JUNGLE_RAFT_ID,
            true, true);

    public static final Item ACACIA_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.ACACIA_RAFT_ID,
            false,true);
    public static final Item ACACIA_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.ACACIA_RAFT_ID,
            true, true);

    public static final Item DARK_OAK_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.DARK_OAK_RAFT_ID,
            false,true);
    public static final Item DARK_OAK_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.DARK_OAK_RAFT_ID,
            true, true);

    public static final Item PALE_OAK_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.PALE_OAK_RAFT_ID,
            false,true);
    public static final Item PALE_OAK_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.PALE_OAK_RAFT_ID,
            true, true);

    public static final Item MANGROVE_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MANGROVE_RAFT_ID,
            false,true);
    public static final Item MANGROVE_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MANGROVE_RAFT_ID,
            true, true);

    public static final Item CHERRY_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CHERRY_RAFT_ID,
            false,true);
    public static final Item CHERRY_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CHERRY_RAFT_ID,
            true, true);

    public static final Item CRIMSON_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_BOAT_ID,
            false,true);
    public static final Item CRIMSON_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_BOAT_ID,
            true, true);

    public static final Item WARPED_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_BOAT_ID,
            false,true);
    public static final Item WARPED_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_BOAT_ID,
            true, true);

    public static final Item CACTUS_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_BOAT_ID,
            false,true);
    public static final Item CACTUS_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_BOAT_ID,
            true, true);

    public static final Item MUSHROOM_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MUSHROOM_BOAT_ID,
            false,true);
    public static final Item MUSHROOM_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MUSHROOM_BOAT_ID,
            true, true);

    public static final Item WOODEN_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_BOAT_ID,
            false,true);
    public static final Item WOODEN_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_BOAT_ID,
            true, true);

    public static final Item IRON_CAP_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.IRON_CAP_BOAT_ID,
            false,false);
    public static final Item IRON_CAP_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.IRON_CAP_BOAT_ID,
            true,false);

    public static final Item IRON_CAP_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.IRON_CAP_BOAT_ID,
            false, true);
    public static final Item IRON_CAP_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.IRON_CAP_BOAT_ID,
            true, true);


    //I had some inspiration The Mentor CodeLab
    public static ResourceKey<Item> getItemKey(String name){
        return ResourceKey.create(Registries.ITEM, Identifier.parse(name));
    }
    public static <T extends Item> T registerItem(String name, int stackCount, Function<Item.Properties, T> factory){
        T item = factory.apply(new Item.Properties().setId(getItemKey(name)).stacksTo(stackCount));
        return Registry.register(BuiltInRegistries.ITEM, getItemKey(name), item);
    }
    public static <T extends Item> T registerCooldownItem(String name, int stackCount, int cooldownUse,
                                                          Function<Item.Properties, T> factory){
        T item = factory.apply(new Item.Properties().setId(getItemKey(name)).stacksTo(stackCount).useCooldown(cooldownUse));
        return Registry.register(BuiltInRegistries.ITEM, getItemKey(name), item);
    }
    public static <T extends Item> T registerTallItem(String name, Block tallPlantBlock,
                                                      TallPlantItemRegisterFunction<Item.Properties, T> factory){
        T item = factory.apply(tallPlantBlock, new Item.Properties().stacksTo(64).setId(getItemKey(name)));
        return Registry.register(BuiltInRegistries.ITEM,getItemKey(name),item);
    }
    public static <T extends Item> T registerSignItem(String name, Block standingBlock, Block wallBlock,
                                                      SignRegisterFunction<Item.Properties, T> factory){
        T item = factory.apply(standingBlock, wallBlock, new Item.Properties().stacksTo(16).setId(getItemKey(name)));
        return Registry.register(BuiltInRegistries.ITEM,getItemKey(name),item);
    }
    public static <T extends Item> T registerHangingSignItem(String name, Block hangingSign, Block wallHangingSign,
                                                             HangingSignRegisterFunction<Item.Properties, T> factory){
        T item = factory.apply(hangingSign, wallHangingSign, new Item.Properties().stacksTo(16).setId(getItemKey(name)));
        return Registry.register(BuiltInRegistries.ITEM,getItemKey(name),item);
    }

    private static <T extends Item> T registerBlock(String name, Block block, Block wallblock, Direction attachmentDirection,
                                                       CoralFanFunction<Item.Properties,T> factory) {
        T item = factory.apply(block, wallblock, attachmentDirection, new Item.Properties().stacksTo(64).setId(getItemKey(name)));
        return Registry.register(BuiltInRegistries.ITEM,getItemKey(name),item);
    }
    private static Function<Item.Properties, Item> createBlockItemWithUniqueName(Block block) {
        return settings -> new BlockItem(block, settings.useItemDescriptionPrefix());
    }
    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
    }
}
