package net.gecko.varandeco.entity;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.entity.custom.SnowBrickProjectileEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class DecoEntities {

    private static final ResourceKey<EntityType<?>> SNOW_BRICK_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "snow_brick"));

    public static final EntityType<SnowBrickProjectileEntity> SNOW_BRICK_PROJECTILE = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID,"snow_brick_projectile"),
            EntityType.Builder.<SnowBrickProjectileEntity>of(SnowBrickProjectileEntity::new, MobCategory.MISC)
                    .sized(0.25f, 0.25f)
                    .build(SNOW_BRICK_KEY));

    public static void registerDecoEntities(){
        VaranDeco.LOGGER.info("Registering Deco Entities for " + VaranDeco.MOD_ID);
    }
}
