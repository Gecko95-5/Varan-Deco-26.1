package net.gecko.varandeco.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VillagerTradesTagsProvider;

import java.util.concurrent.CompletableFuture;

public class DecoVillagerTagProvider extends VillagerTradesTagsProvider {
    public DecoVillagerTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public void addTags(final HolderLookup.Provider registries) {

    }
}
