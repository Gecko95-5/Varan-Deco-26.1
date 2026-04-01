package net.gecko.varandeco.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.block.entity.stone.*;
import net.gecko.varandeco.block.entity.wood.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class DecoBlockEntities {

    public static BlockEntityType<DeepslateFurnaceBlockEntity> DEEPSLATE_FURNACE_BE;

    public static BlockEntityType<BlackstoneFurnaceBlockEntity> BLACKSTONE_FURNACE_BE;

    public static BlockEntityType<TuffFurnaceBlockEntity> TUFF_FURNACE_BE;

    public static BlockEntityType<EndstoneFurnaceBlockEntity> END_STONE_FURNACE_BE;

    public static BlockEntityType<DeepslateBlastFurnaceBlockEntity> DEEPSLATE_BLAST_FURNACE_BE;

    public static BlockEntityType<BlackstoneBlastFurnaceBlockEntity> BLACKSTONE_BLAST_FURNACE_BE;

    public static BlockEntityType<TuffBlastFurnaceBlockEntity> TUFF_BLAST_FURNACE_BE;

    public static BlockEntityType<EndstoneBlastFurnaceBlockEntity> END_STONE_BLAST_FURNACE_BE;

    public static BlockEntityType<DeepslateSmokerBlockEntity> DEEPSLATE_SMOKER_BE;

    public static BlockEntityType<BlackstoneSmokerBlockEntity> BLACKSTONE_SMOKER_BE;

    public static BlockEntityType<TuffSmokerBlockEntity> TUFF_SMOKER_BE;

    public static BlockEntityType<AcaciaBarrelBlockEntity> ACACIA_BARREL_BE;

    public static BlockEntityType<BirchBarrelBlockEntity> BIRCH_BARREL_BE;

    public static BlockEntityType<OakBarrelBlockEntity> OAK_BARREL_BE;

    public static BlockEntityType<SpruceBarrelBlockEntity> SPRUCE_BARREL_BE;

    public static BlockEntityType<JungleBarrelBlockEntity> JUNGLE_BARREL_BE;

    public static BlockEntityType<DarkOakBarrelBlockEntity> DARK_OAK_BARREL_BE;

    public static BlockEntityType<MangroveBarrelBlockEntity> MANGROVE_BARREL_BE;

    public static BlockEntityType<BambooBarrelBlockEntity> BAMBOO_BARREL_BE;

    public static BlockEntityType<CherryBarrelBlockEntity> CHERRY_BARREL_BE;

    public static BlockEntityType<CrimsonBarrelBlockEntity> CRIMSON_BARREL_BE;

    public static BlockEntityType<WarpedBarrelBlockEntity> WARPED_BARREL_BE;

    public static BlockEntityType<CactusBarrelBlockEntity> CACTUS_BARREL_BE;

    public static BlockEntityType<PaleOakBarrelBlockEntity> PALE_OAK_BARREL_BE;

    public static BlockEntityType<MushroomBarrelBlockEntity> MUSHROOM_BARREL_BE;

    public static BlockEntityType<IronCapBarrelBlockEntity> IRON_CAP_BARREL_BE;

    public static BlockEntityType<EndstoneSmokerBlockEntity> END_STONE_SMOKER_BE;

    public static BlockEntityType<DriftwoodBarrelBlockEntity> DRIFTWOOD_BARREL_BE;

    public static void registerBlockEntities(){


        DEEPSLATE_FURNACE_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "deepslate_furnace_be"),
                FabricBlockEntityTypeBuilder.create(DeepslateFurnaceBlockEntity::new,
                        DecoBlocks.DEEPSLATE_FURNACE).build());

        BLACKSTONE_FURNACE_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "blackstone_furnace_be"),
                FabricBlockEntityTypeBuilder.create(BlackstoneFurnaceBlockEntity::new,
                        DecoBlocks.BLACKSTONE_FURNACE).build());

        TUFF_FURNACE_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "tuff_furnace_be"),
                FabricBlockEntityTypeBuilder.create(TuffFurnaceBlockEntity::new,
                        DecoBlocks.TUFF_FURNACE).build());

        END_STONE_FURNACE_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "end_stone_furnace_be"),
                FabricBlockEntityTypeBuilder.create(EndstoneFurnaceBlockEntity::new,
                        DecoBlocks.END_STONE_FURNACE).build(null));

        DEEPSLATE_BLAST_FURNACE_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "deepslate_blast_furnace_be"),
                FabricBlockEntityTypeBuilder.create(DeepslateBlastFurnaceBlockEntity::new,
                        DecoBlocks.DEEPSLATE_BLAST_FURNACE).build());

        BLACKSTONE_BLAST_FURNACE_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "blackstone_blast_furnace_be"),
                FabricBlockEntityTypeBuilder.create(BlackstoneBlastFurnaceBlockEntity::new,
                        DecoBlocks.BLACKSTONE_BLAST_FURNACE).build());

        TUFF_BLAST_FURNACE_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "tuff_blast_furnace_be"),
                FabricBlockEntityTypeBuilder.create(TuffBlastFurnaceBlockEntity::new,
                        DecoBlocks.TUFF_BLAST_FURNACE).build());

        END_STONE_BLAST_FURNACE_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "end_stone_blast_furnace_be"),
                FabricBlockEntityTypeBuilder.create(EndstoneBlastFurnaceBlockEntity::new,
                        DecoBlocks.END_STONE_BLAST_FURNACE).build(null));

        DEEPSLATE_SMOKER_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "deepslate_smoker_be"),
                FabricBlockEntityTypeBuilder.create(DeepslateSmokerBlockEntity::new,
                        DecoBlocks.DEEPSLATE_SMOKER).build());

        BLACKSTONE_SMOKER_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "blackstone_smoker_be"),
                FabricBlockEntityTypeBuilder.create(BlackstoneSmokerBlockEntity::new,
                        DecoBlocks.BLACKSTONE_SMOKER).build());

        TUFF_SMOKER_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "tuff_smoker_be"),
                FabricBlockEntityTypeBuilder.create(TuffSmokerBlockEntity::new,
                        DecoBlocks.TUFF_SMOKER).build());

        END_STONE_SMOKER_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "end_stone_smoker_be"),
                FabricBlockEntityTypeBuilder.create(EndstoneSmokerBlockEntity::new,
                        DecoBlocks.END_STONE_SMOKER).build(null));

        ACACIA_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "acacia_barrel_be"),
                FabricBlockEntityTypeBuilder.create(AcaciaBarrelBlockEntity::new,
                        DecoBlocks.ACACIA_BARREL).build());

        BIRCH_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "birch_barrel_be"),
                FabricBlockEntityTypeBuilder.create(BirchBarrelBlockEntity::new,
                        DecoBlocks.BIRCH_BARREL).build());

        OAK_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "oak_barrel_be"),
                FabricBlockEntityTypeBuilder.create(OakBarrelBlockEntity::new,
                        DecoBlocks.OAK_BARREL).build());

        SPRUCE_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "spruce_barrel_be"),
                FabricBlockEntityTypeBuilder.create(SpruceBarrelBlockEntity::new,
                        DecoBlocks.SPRUCE_BARREL).build());

        JUNGLE_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "jungle_barrel_be"),
                FabricBlockEntityTypeBuilder.create(JungleBarrelBlockEntity::new,
                        DecoBlocks.JUNGLE_BARREL).build());

        DARK_OAK_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "dark_oak_barrel_be"),
                FabricBlockEntityTypeBuilder.create(DarkOakBarrelBlockEntity::new,
                        DecoBlocks.DARK_OAK_BARREL).build());

        MANGROVE_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "mangrove_barrel_be"),
                FabricBlockEntityTypeBuilder.create(MangroveBarrelBlockEntity::new,
                        DecoBlocks.MANGROVE_BARREL).build());

        BAMBOO_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "bamboo_barrel_be"),
                FabricBlockEntityTypeBuilder.create(BambooBarrelBlockEntity::new,
                        DecoBlocks.BAMBOO_BARREL).build());

        CHERRY_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "cherry_barrel_be"),
                FabricBlockEntityTypeBuilder.create(CherryBarrelBlockEntity::new,
                        DecoBlocks.CHERRY_BARREL).build());

        CRIMSON_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "crimson_barrel_be"),
                FabricBlockEntityTypeBuilder.create(CrimsonBarrelBlockEntity::new,
                        DecoBlocks.CRIMSON_BARREL).build());

        WARPED_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "warped_barrel_be"),
                FabricBlockEntityTypeBuilder.create(WarpedBarrelBlockEntity::new,
                        DecoBlocks.WARPED_BARREL).build());

        CACTUS_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "cactus_barrel_be"),
                FabricBlockEntityTypeBuilder.create(CactusBarrelBlockEntity::new,
                        DecoBlocks.CACTUS_BARREL).build());

        PALE_OAK_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "pale_oak_barrel_be"),
                FabricBlockEntityTypeBuilder.create(PaleOakBarrelBlockEntity::new,
                        DecoBlocks.PALE_OAK_BARREL).build());

        DRIFTWOOD_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "driftwood_barrel_be"),
                FabricBlockEntityTypeBuilder.create(DriftwoodBarrelBlockEntity::new,
                        DecoBlocks.DRIFTWOOD_BARREL).build());

        MUSHROOM_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "mushroom_barrel_be"),
                FabricBlockEntityTypeBuilder.create(MushroomBarrelBlockEntity::new,
                        DecoBlocks.MUSHROOM_BARREL).build(null));

        IRON_CAP_BARREL_BE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "iron_cap_barrel_be"),
                FabricBlockEntityTypeBuilder.create(IronCapBarrelBlockEntity::new,
                        DecoBlocks.IRON_CAP_BARREL).build(null));
    }
}
