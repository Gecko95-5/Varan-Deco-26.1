package net.gecko.varandeco.entity.custom;

import net.gecko.varandeco.entity.DecoEntities;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class SnowBrickProjectileEntity extends ThrowableItemProjectile {

    public SnowBrickProjectileEntity(EntityType<? extends SnowBrickProjectileEntity> entityType, Level world) {
        super(entityType, world);
    }
    public SnowBrickProjectileEntity(Level world, LivingEntity owner, ItemStack stack) {
        super(DecoEntities.SNOW_BRICK_PROJECTILE, owner, world, stack);
    }

    public SnowBrickProjectileEntity(Level world, double x, double y, double z, ItemStack stack) {
        super(DecoEntities.SNOW_BRICK_PROJECTILE, x, y, z, world, stack);
    }

    @Override
    protected Item getDefaultItem() {
        return DecoItems.SNOW_BRICK;
    }

    private ParticleOptions getParticle() {
        ItemStack item = this.getItem();
        return item.isEmpty() ? ParticleTypes.ITEM_SNOWBALL : new ItemParticleOption(ParticleTypes.ITEM, ItemStackTemplate.fromNonEmptyStack(item));
    }

    @Override
    public void handleEntityEvent(final byte id) {
        if (id == 3) {
            ParticleOptions particle = this.getParticle();

            for (int i = 0; i < 8; i++) {
                this.level().addParticle(particle, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof Blaze ? 5 : 2;
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), i);
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if (!this.level().isClientSide()) {
            this.level().broadcastEntityEvent(this, EntityEvent.DEATH);
            this.discard();
        }
    }
}
