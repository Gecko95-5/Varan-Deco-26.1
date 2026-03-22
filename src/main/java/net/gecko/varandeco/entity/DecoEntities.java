package net.gecko.varandeco.entity;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.entity.custom.SnowBrickProjectileEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class DecoEntities {

    private static final RegistryKey<EntityType<?>> SNOW_BRICK_KEY =
            RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(VaranDeco.MOD_ID, "snow_brick"));

    public static final EntityType<SnowBrickProjectileEntity> SNOW_BRICK_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(VaranDeco.MOD_ID,"snow_brick_projectile"),
            EntityType.Builder.<SnowBrickProjectileEntity>create(SnowBrickProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f)
                    .build(SNOW_BRICK_KEY));

    public static void registerDecoEntities(){
        VaranDeco.LOGGER.info("Registering Deco Entities for " + VaranDeco.MOD_ID);
    }
}
