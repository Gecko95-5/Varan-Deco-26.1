package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.gecko.varandeco.entity.DecoEntities;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.EntityTypeTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class DecoEntityTagProvider extends FabricTagsProvider.EntityTypeTagsProvider {

    public DecoEntityTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider wrapperLookup) {
        valueLookupBuilder(EntityTypeTags.IMPACT_PROJECTILES)
                .add(DecoEntities.SNOW_BRICK_PROJECTILE);
    }
}
