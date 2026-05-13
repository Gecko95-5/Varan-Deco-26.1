package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varandeco.entity.DecoEntities;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.EntityTypeTags;
import java.util.concurrent.CompletableFuture;

public class DecoEntityTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public DecoEntityTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(EntityTypeTags.IMPACT_PROJECTILES)
                .add(DecoEntities.SNOW_BRICK_PROJECTILE);
    }
}
