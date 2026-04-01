package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.util.DecoTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DecoRecipeGeneratorTwo extends FabricRecipeProvider {
    public DecoRecipeGeneratorTwo(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_PURPUR,2)
                .pattern("##")
                .pattern("##")
                .define('#', Items.PURPUR_SLAB)
                .unlockedBy(getHasName(Items.PURPUR_SLAB),
                        has(Items.PURPUR_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CHISELED_PURPUR)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR,4)
                .pattern("#P")
                .pattern("P#")
                .define('#', Items.PURPUR_BLOCK)
                .define('P', Items.POPPED_CHORUS_FRUIT)
                .unlockedBy(getHasName(Items.PURPUR_BLOCK),
                        has(Items.PURPUR_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_PURPUR)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR, Items.PURPUR_BLOCK);

        stairBuilder(DecoBlocks.CUT_PURPUR_STAIRS, Ingredient.of(DecoBlocks.CUT_PURPUR))
                .unlockedBy(getHasName(DecoBlocks.CUT_PURPUR),has(DecoBlocks.CUT_PURPUR))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_PURPUR_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_STAIRS, Items.PURPUR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_STAIRS, DecoBlocks.CUT_PURPUR);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_SLAB, DecoBlocks.CUT_PURPUR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_SLAB, Items.PURPUR_BLOCK,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_SLAB, DecoBlocks.CUT_PURPUR,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.CUT_PURPUR_WALL, DecoBlocks.CUT_PURPUR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_WALL, Items.PURPUR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_WALL, DecoBlocks.CUT_PURPUR);

        shaped(RecipeCategory.MISC, DecoItems.PASSTOL,4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.BONE_MEAL)
                .define('S', DecoTags.Items.MUSHROOMS)
                .unlockedBy("has_mushrooms", has(DecoTags.Items.MUSHROOMS))
                .save(output,getSimpleRecipeName(DecoItems.PASSTOL)+ "_recipe_create");

        shaped(RecipeCategory.MISC, DecoItems.SHADDOL,4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.INK_SAC)
                .define('S', DecoTags.Items.MUSHROOMS)
                .unlockedBy("has_mushrooms", has(DecoTags.Items.MUSHROOMS))
                .save(output,getSimpleRecipeName(DecoItems.SHADDOL)+ "_recipe_create");

        offerPastelBlockRecipe(output, DecoBlocks.LIGHT_GRAY_BLOCK, DecoBlocks.PASTEL_LIGHT_GRAY_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.GRAY_BLOCK, DecoBlocks.PASTEL_GRAY_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.BROWN_BLOCK, DecoBlocks.PASTEL_BROWN_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.RED_BLOCK, DecoBlocks.PASTEL_RED_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.ORANGE_BLOCK, DecoBlocks.PASTEL_ORANGE_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.YELLOW_BLOCK, DecoBlocks.PASTEL_YELLOW_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.LIME_BLOCK, DecoBlocks.PASTEL_LIME_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.GREEN_BLOCK, DecoBlocks.PASTEL_GREEN_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.CYAN_BLOCK, DecoBlocks.PASTEL_CYAN_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.LIGHT_BLUE_BLOCK, DecoBlocks.PASTEL_LIGHT_BLUE_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.BLUE_BLOCK, DecoBlocks.PASTEL_BLUE_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.PURPLE_BLOCK, DecoBlocks.PASTEL_PURPLE_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.MAGENTA_BLOCK, DecoBlocks.PASTEL_MAGENTA_BLOCK);
        offerPastelBlockRecipe(output, DecoBlocks.PINK_BLOCK, DecoBlocks.PASTEL_PINK_BLOCK);

        offerShadedBlockRecipe(output, DecoBlocks.LIGHT_GRAY_BLOCK, DecoBlocks.SHADED_LIGHT_GRAY_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.GRAY_BLOCK, DecoBlocks.SHADED_GRAY_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.BROWN_BLOCK, DecoBlocks.SHADED_BROWN_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.RED_BLOCK, DecoBlocks.SHADED_RED_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.ORANGE_BLOCK, DecoBlocks.SHADED_ORANGE_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.YELLOW_BLOCK, DecoBlocks.SHADED_YELLOW_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.LIME_BLOCK, DecoBlocks.SHADED_LIME_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.GREEN_BLOCK, DecoBlocks.SHADED_GREEN_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.CYAN_BLOCK, DecoBlocks.SHADED_CYAN_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.LIGHT_BLUE_BLOCK, DecoBlocks.SHADED_LIGHT_BLUE_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.BLUE_BLOCK, DecoBlocks.SHADED_BLUE_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.PURPLE_BLOCK, DecoBlocks.SHADED_PURPLE_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.MAGENTA_BLOCK, DecoBlocks.SHADED_MAGENTA_BLOCK);
        offerShadedBlockRecipe(output, DecoBlocks.PINK_BLOCK, DecoBlocks.SHADED_PINK_BLOCK);

        offerDyeBlockFromPastelRecipe(output, DecoBlocks.LIGHT_GRAY_BLOCK, DecoBlocks.PASTEL_LIGHT_GRAY_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.GRAY_BLOCK, DecoBlocks.PASTEL_GRAY_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.BROWN_BLOCK, DecoBlocks.PASTEL_BROWN_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.RED_BLOCK, DecoBlocks.PASTEL_RED_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.ORANGE_BLOCK, DecoBlocks.PASTEL_ORANGE_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.YELLOW_BLOCK, DecoBlocks.PASTEL_YELLOW_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.LIME_BLOCK, DecoBlocks.PASTEL_LIME_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.GREEN_BLOCK, DecoBlocks.PASTEL_GREEN_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.CYAN_BLOCK, DecoBlocks.PASTEL_CYAN_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.LIGHT_BLUE_BLOCK, DecoBlocks.PASTEL_LIGHT_BLUE_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.BLUE_BLOCK, DecoBlocks.PASTEL_BLUE_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.PURPLE_BLOCK, DecoBlocks.PASTEL_PURPLE_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.MAGENTA_BLOCK, DecoBlocks.PASTEL_MAGENTA_BLOCK);
        offerDyeBlockFromPastelRecipe(output, DecoBlocks.PINK_BLOCK, DecoBlocks.PASTEL_PINK_BLOCK);

        offerDyeBlockFromShadedRecipe(output, DecoBlocks.LIGHT_GRAY_BLOCK, DecoBlocks.SHADED_LIGHT_GRAY_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.GRAY_BLOCK, DecoBlocks.SHADED_GRAY_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.BROWN_BLOCK, DecoBlocks.SHADED_BROWN_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.RED_BLOCK, DecoBlocks.SHADED_RED_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.ORANGE_BLOCK, DecoBlocks.SHADED_ORANGE_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.YELLOW_BLOCK, DecoBlocks.SHADED_YELLOW_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.LIME_BLOCK, DecoBlocks.SHADED_LIME_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.GREEN_BLOCK, DecoBlocks.SHADED_GREEN_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.CYAN_BLOCK, DecoBlocks.SHADED_CYAN_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.LIGHT_BLUE_BLOCK, DecoBlocks.SHADED_LIGHT_BLUE_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.BLUE_BLOCK, DecoBlocks.SHADED_BLUE_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.PURPLE_BLOCK, DecoBlocks.SHADED_PURPLE_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.MAGENTA_BLOCK, DecoBlocks.SHADED_MAGENTA_BLOCK);
        offerDyeBlockFromShadedRecipe(output, DecoBlocks.PINK_BLOCK, DecoBlocks.SHADED_PINK_BLOCK);

        stairBuilder(DecoBlocks.OAK_WOOD_STAIRS, Ingredient.of(Items.OAK_WOOD))
                .unlockedBy(getHasName(Items.OAK_WOOD),has(Items.OAK_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.OAK_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OAK_WOOD_SLAB, Items.OAK_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.OAK_WOOD_WALL, Items.OAK_WOOD);

        stairBuilder(DecoBlocks.SPRUCE_WOOD_STAIRS, Ingredient.of(Items.SPRUCE_WOOD))
                .unlockedBy(getHasName(Items.SPRUCE_WOOD),has(Items.SPRUCE_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.SPRUCE_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SPRUCE_WOOD_SLAB, Items.SPRUCE_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.SPRUCE_WOOD_WALL, Items.SPRUCE_WOOD);

        stairBuilder(DecoBlocks.BIRCH_WOOD_STAIRS, Ingredient.of(Items.BIRCH_WOOD))
                .unlockedBy(getHasName(Items.BIRCH_WOOD),has(Items.BIRCH_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.BIRCH_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BIRCH_WOOD_SLAB, Items.BIRCH_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.BIRCH_WOOD_WALL, Items.BIRCH_WOOD);

        stairBuilder(DecoBlocks.JUNGLE_WOOD_STAIRS, Ingredient.of(Items.JUNGLE_WOOD))
                .unlockedBy(getHasName(Items.JUNGLE_WOOD),has(Items.JUNGLE_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.JUNGLE_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.JUNGLE_WOOD_SLAB, Items.JUNGLE_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.JUNGLE_WOOD_WALL, Items.JUNGLE_WOOD);

        stairBuilder(DecoBlocks.ACACIA_WOOD_STAIRS, Ingredient.of(Items.ACACIA_WOOD))
                .unlockedBy(getHasName(Items.ACACIA_WOOD),has(Items.ACACIA_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.ACACIA_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ACACIA_WOOD_SLAB, Items.ACACIA_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.ACACIA_WOOD_WALL, Items.ACACIA_WOOD);

        stairBuilder(DecoBlocks.DARK_OAK_WOOD_STAIRS, Ingredient.of(Items.DARK_OAK_WOOD))
                .unlockedBy(getHasName(Items.DARK_OAK_WOOD),has(Items.DARK_OAK_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.DARK_OAK_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DARK_OAK_WOOD_SLAB, Items.DARK_OAK_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.DARK_OAK_WOOD_WALL, Items.DARK_OAK_WOOD);

        stairBuilder(DecoBlocks.MANGROVE_WOOD_STAIRS, Ingredient.of(Items.MANGROVE_WOOD))
                .unlockedBy(getHasName(Items.MANGROVE_WOOD),has(Items.MANGROVE_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.MANGROVE_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MANGROVE_WOOD_SLAB, Items.MANGROVE_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.MANGROVE_WOOD_WALL, Items.MANGROVE_WOOD);

        stairBuilder(DecoBlocks.CRIMSON_HYPHAE_STAIRS, Ingredient.of(Items.CRIMSON_HYPHAE))
                .unlockedBy(getHasName(Items.CRIMSON_HYPHAE),has(Items.CRIMSON_HYPHAE))
                .save(output,getSimpleRecipeName(DecoBlocks.CRIMSON_HYPHAE_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRIMSON_HYPHAE_SLAB, Items.CRIMSON_HYPHAE);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRIMSON_HYPHAE_WALL, Items.CRIMSON_HYPHAE);

        stairBuilder(DecoBlocks.WARPED_HYPHAE_STAIRS, Ingredient.of(Items.WARPED_HYPHAE))
                .unlockedBy(getHasName(Items.WARPED_HYPHAE),has(Items.WARPED_HYPHAE))
                .save(output,getSimpleRecipeName(DecoBlocks.WARPED_HYPHAE_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_HYPHAE_SLAB, Items.WARPED_HYPHAE);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.WARPED_HYPHAE_WALL, Items.WARPED_HYPHAE);

        stairBuilder(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS, Ingredient.of(Items.STRIPPED_OAK_WOOD))
                .unlockedBy(getHasName(Items.STRIPPED_OAK_WOOD),has(Items.STRIPPED_OAK_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_OAK_WOOD_SLAB, Items.STRIPPED_OAK_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_OAK_WOOD_WALL, Items.STRIPPED_OAK_WOOD);

        stairBuilder(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS, Ingredient.of(Items.STRIPPED_SPRUCE_WOOD))
                .unlockedBy(getHasName(Items.STRIPPED_SPRUCE_WOOD),has(Items.STRIPPED_SPRUCE_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB, Items.STRIPPED_SPRUCE_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_SPRUCE_WOOD_WALL, Items.STRIPPED_SPRUCE_WOOD);

        stairBuilder(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS, Ingredient.of(Items.STRIPPED_BIRCH_WOOD))
                .unlockedBy(getHasName(Items.STRIPPED_BIRCH_WOOD),has(Items.STRIPPED_BIRCH_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB, Items.STRIPPED_BIRCH_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_BIRCH_WOOD_WALL, Items.STRIPPED_BIRCH_WOOD);

        stairBuilder(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS, Ingredient.of(Items.STRIPPED_JUNGLE_WOOD))
                .unlockedBy(getHasName(Items.STRIPPED_JUNGLE_WOOD),has(Items.STRIPPED_JUNGLE_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB, Items.STRIPPED_JUNGLE_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_JUNGLE_WOOD_WALL, Items.STRIPPED_JUNGLE_WOOD);

        stairBuilder(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS, Ingredient.of(Items.STRIPPED_ACACIA_WOOD))
                .unlockedBy(getHasName(Items.STRIPPED_ACACIA_WOOD),has(Items.STRIPPED_ACACIA_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB, Items.STRIPPED_ACACIA_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_ACACIA_WOOD_WALL, Items.STRIPPED_ACACIA_WOOD);

        stairBuilder(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS, Ingredient.of(Items.STRIPPED_DARK_OAK_WOOD))
                .unlockedBy(getHasName(Items.STRIPPED_DARK_OAK_WOOD),has(Items.STRIPPED_DARK_OAK_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB, Items.STRIPPED_DARK_OAK_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_DARK_OAK_WOOD_WALL, Items.STRIPPED_DARK_OAK_WOOD);

        stairBuilder(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS, Ingredient.of(Items.STRIPPED_MANGROVE_WOOD))
                .unlockedBy(getHasName(Items.STRIPPED_MANGROVE_WOOD),has(Items.STRIPPED_MANGROVE_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB, Items.STRIPPED_MANGROVE_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_MANGROVE_WOOD_WALL, Items.STRIPPED_MANGROVE_WOOD);

        stairBuilder(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS, Ingredient.of(Items.STRIPPED_CRIMSON_HYPHAE))
                .unlockedBy(getHasName(Items.STRIPPED_CRIMSON_HYPHAE),has(Items.STRIPPED_CRIMSON_HYPHAE))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, Items.STRIPPED_CRIMSON_HYPHAE);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_CRIMSON_HYPHAE_WALL, Items.STRIPPED_CRIMSON_HYPHAE);

        stairBuilder(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS, Ingredient.of(Items.STRIPPED_WARPED_HYPHAE))
                .unlockedBy(getHasName(Items.STRIPPED_WARPED_HYPHAE),has(Items.STRIPPED_WARPED_HYPHAE))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB, Items.STRIPPED_WARPED_HYPHAE);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_WARPED_HYPHAE_WALL, Items.STRIPPED_WARPED_HYPHAE);

        stairBuilder(DecoBlocks.WOODEN_WOOD_STAIRS, Ingredient.of(DecoBlocks.WOODEN_WOOD))
                .unlockedBy(getHasName(DecoBlocks.WOODEN_WOOD),has(DecoBlocks.WOODEN_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.WOODEN_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WOODEN_WOOD_SLAB, DecoBlocks.WOODEN_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.WOODEN_WOOD_WALL, DecoBlocks.WOODEN_WOOD);

        stairBuilder(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS, Ingredient.of(DecoBlocks.STRIPPED_WOODEN_WOOD))
                .unlockedBy(getHasName(DecoBlocks.STRIPPED_WOODEN_WOOD),has(DecoBlocks.STRIPPED_WOODEN_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB, DecoBlocks.STRIPPED_WOODEN_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_WOODEN_WOOD_WALL, DecoBlocks.STRIPPED_WOODEN_WOOD);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_NETHERRACK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Items.NETHERRACK)
                .unlockedBy(getHasName(Items.NETHERRACK),
                        has(Items.NETHERRACK))
                .save(output,getSimpleRecipeName(DecoBlocks.PACKED_NETHERRACK)+ "_recipe_create");

        stairBuilder(DecoBlocks.PACKED_NETHERRACK_STAIRS, Ingredient.of(DecoBlocks.PACKED_NETHERRACK))
                .unlockedBy(getHasName(DecoBlocks.PACKED_NETHERRACK),has(DecoBlocks.PACKED_NETHERRACK))
                .save(output,getSimpleRecipeName(DecoBlocks.PACKED_NETHERRACK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_STAIRS, DecoBlocks.PACKED_NETHERRACK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_SLAB, DecoBlocks.PACKED_NETHERRACK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_SLAB, DecoBlocks.PACKED_NETHERRACK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks. PACKED_NETHERRACK_WALL, DecoBlocks.PACKED_NETHERRACK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_WALL, DecoBlocks.PACKED_NETHERRACK);

        polished(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);

        stairBuilder(DecoBlocks.NETHERRACK_BRICK_STAIRS, Ingredient.of(DecoBlocks.NETHERRACK_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.NETHERRACK_BRICKS),has(DecoBlocks.NETHERRACK_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.NETHERRACK_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_STAIRS, DecoBlocks.PACKED_NETHERRACK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_STAIRS, DecoBlocks.NETHERRACK_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_SLAB, DecoBlocks.NETHERRACK_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_SLAB, DecoBlocks.PACKED_NETHERRACK,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_SLAB, DecoBlocks.NETHERRACK_BRICKS,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks. NETHERRACK_BRICK_WALL, DecoBlocks.NETHERRACK_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_WALL, DecoBlocks.PACKED_NETHERRACK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_WALL, DecoBlocks.NETHERRACK_BRICKS);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MUD_BRICKS, Items.MUD_BRICK_SLAB);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_ICE_BRICKS, DecoBlocks.ICE_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_ICE_BRICKS, Items.BLUE_ICE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_ICE_BRICKS, DecoBlocks.ICE_BRICKS);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_NETHERRACK_BRICKS, DecoBlocks.NETHERRACK_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_NETHERRACK_BRICKS, DecoBlocks.NETHERRACK_BRICKS);

        polished( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BASALT_BRICKS, Items.POLISHED_BASALT);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. BASALT_BRICKS, Items.BASALT);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. BASALT_BRICKS, Items.POLISHED_BASALT);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.GLOWSTONE), RecipeCategory.BUILDING_BLOCKS,CookingBookCategory.BLOCKS,
                        DecoBlocks.SMOOTH_GLOWSTONE,
                        0.35f, 200).unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_GLOWSTONE)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_CACTUS,4)
                .pattern("##")
                .pattern("##")
                .define('#', Items.CACTUS)
                .unlockedBy(getHasName(Items.CACTUS),
                        has(Items.CACTUS))
                .save(output,getSimpleRecipeName(DecoBlocks.PACKED_CACTUS)+ "_recipe_create");

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .requires(DecoBlocks.PACKED_CACTUS)
                .group("cactus_planks")
                .unlockedBy(getHasName(DecoBlocks.PACKED_CACTUS),
                        has(DecoBlocks.PACKED_CACTUS))
                .save(output,getSimpleRecipeName(DecoBlocks.CACTUS_PLANKS)+ "_form_packed_cactus");

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .requires(DecoBlocks.STRIPPED_CACTUS)
                .group("cactus_planks")
                .unlockedBy(getHasName(DecoBlocks.STRIPPED_CACTUS),
                        has(DecoBlocks.STRIPPED_CACTUS))
                .save(output,getSimpleRecipeName(DecoBlocks.CACTUS_PLANKS)+ "_form_stripped_cactus");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.OAK_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.OAK_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.OAK_SLAB),
                        has(Items.OAK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.OAK_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.OAK_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.OAK_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.OAK_SLAB),
                        has(Items.OAK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.OAK_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.BIRCH_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.BIRCH_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.BIRCH_SLAB),
                        has(Items.BIRCH_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.BIRCH_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.BIRCH_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.BIRCH_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.BIRCH_SLAB),
                        has(Items.BIRCH_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.BIRCH_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.SPRUCE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.SPRUCE_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.SPRUCE_SLAB),
                        has(Items.SPRUCE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.SPRUCE_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.SPRUCE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.SPRUCE_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.SPRUCE_SLAB),
                        has(Items.SPRUCE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.SPRUCE_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.JUNGLE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.JUNGLE_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.JUNGLE_SLAB),
                        has(Items.JUNGLE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.JUNGLE_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.JUNGLE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.JUNGLE_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.JUNGLE_SLAB),
                        has(Items.JUNGLE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.JUNGLE_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.ACACIA_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.ACACIA_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.ACACIA_SLAB),
                        has(Items.ACACIA_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.ACACIA_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.ACACIA_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.ACACIA_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.ACACIA_SLAB),
                        has(Items.ACACIA_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.ACACIA_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.DARK_OAK_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.DARK_OAK_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.DARK_OAK_SLAB),
                        has(Items.DARK_OAK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.DARK_OAK_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.DARK_OAK_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.DARK_OAK_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.DARK_OAK_SLAB),
                        has(Items.DARK_OAK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.MANGROVE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.MANGROVE_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.MANGROVE_SLAB),
                        has(Items.MANGROVE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.MANGROVE_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.MANGROVE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.MANGROVE_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.MANGROVE_SLAB),
                        has(Items.MANGROVE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.MANGROVE_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.CRIMSON_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.CRIMSON_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.CRIMSON_SLAB),
                        has(Items.CRIMSON_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRIMSON_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.CRIMSON_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.CRIMSON_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.CRIMSON_SLAB),
                        has(Items.CRIMSON_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRIMSON_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.WARPED_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.WARPED_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.WARPED_SLAB),
                        has(Items.WARPED_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.WARPED_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.WARPED_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.WARPED_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.WARPED_SLAB),
                        has(Items.WARPED_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.WARPED_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.CACTUS_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.CACTUS_PLANK_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANK_SLAB),
                        has(DecoBlocks.CACTUS_PLANK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CACTUS_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.CACTUS_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', DecoBlocks.CACTUS_PLANK_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANK_SLAB),
                        has(DecoBlocks.CACTUS_PLANK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CACTUS_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.WOODEN_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.WOODEN_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_SLAB),
                        has(DecoBlocks.WOODEN_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.WOODEN_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.WOODEN_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', DecoBlocks.WOODEN_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_SLAB),
                        has(DecoBlocks.WOODEN_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.WOODEN_PALLET_TRAPDOOR)+ "_recipe_create");

        offerLampRecipe(output,DecoBlocks.WHITE_LAMP, Items.WHITE_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.LIGHT_GRAY_LAMP, Items.LIGHT_GRAY_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.GRAY_LAMP, Items.GRAY_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.BLACK_LAMP, Items.BLACK_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.BROWN_LAMP, Items.BROWN_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.RED_LAMP, Items.RED_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.ORANGE_LAMP, Items.ORANGE_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.YELLOW_LAMP, Items.YELLOW_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.LIME_LAMP, Items.LIME_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.GREEN_LAMP, Items.GREEN_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.CYAN_LAMP, Items.CYAN_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.LIGHT_BLUE_LAMP, Items.LIGHT_BLUE_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.BLUE_LAMP, Items.BLUE_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.PURPLE_LAMP, Items.PURPLE_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.MAGENTA_LAMP, Items.MAGENTA_STAINED_GLASS_PANE);

        offerLampRecipe(output,DecoBlocks.PINK_LAMP, Items.PINK_STAINED_GLASS_PANE);

        shaped(RecipeCategory.BUILDING_BLOCKS,Items.BROWN_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Items.BROWN_MUSHROOM)
                .group("giant_mushroom_blocks")
                .unlockedBy(getHasName(Items.BROWN_MUSHROOM),
                        has(Items.BROWN_MUSHROOM))
                .save(output,getSimpleRecipeName(Items.BROWN_MUSHROOM_BLOCK)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,Items.RED_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Items.RED_MUSHROOM)
                .group("giant_mushroom_blocks")
                .unlockedBy(getHasName(Items.RED_MUSHROOM),
                        has(Items.RED_MUSHROOM))
                .save(output,getSimpleRecipeName(Items.RED_MUSHROOM_BLOCK)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,Items.MUSHROOM_STEM)
                .pattern("##")
                .pattern("##")
                .define('#', DecoTags.Items.MUSHROOMS)
                .unlockedBy("has_mushrooms", has(DecoTags.Items.MUSHROOMS))
                .save(output,getSimpleRecipeName(Items.MUSHROOM_STEM)+ "_recipe_create");

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_PLANKS,4)
                .requires(DecoTags.Items.GIANT_MUSHROOM_BLOCKS)
                .group("planks")
                .unlockedBy("has_logs", has(DecoTags.Items.GIANT_MUSHROOM_BLOCKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_PLANKS)+ "_recipe_create");

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_PLANKS,2)
                .requires(Items.MUSHROOM_STEM)
                .group("planks")
                .unlockedBy(getHasName(Items.MUSHROOM_STEM),
                        has(Items.MUSHROOM_STEM))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_PLANKS)+"_form_stem");

        stairBuilder(DecoBlocks.MUSHROOM_STAIRS, Ingredient.of(DecoBlocks.MUSHROOM_PLANKS))
                .group("wooden_stairs")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_PLANKS),has(DecoBlocks.MUSHROOM_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_STAIRS)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_SLAB,6)
                .pattern("###")
                .define('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_slab")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_PLANKS),
                        has(DecoBlocks.MUSHROOM_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_SLAB)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.MUSHROOM_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .define('/', Items.STICK)
                .define('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_fence")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_PLANKS),
                        has(DecoBlocks.MUSHROOM_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_FENCE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .define('/', Items.STICK)
                .define('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_fence_fence")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_PLANKS),
                        has(DecoBlocks.MUSHROOM_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_FENCE_GATE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PRESSURE_PLATE)
                .pattern("##")
                .define('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_PLANKS),
                        has(DecoBlocks.MUSHROOM_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_PRESSURE_PLATE)+ "_recipe_create");

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_BUTTON)
                .requires(DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_button")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_PLANKS),
                        has(DecoBlocks.MUSHROOM_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_BUTTON)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_door")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_PLANKS),
                        has(DecoBlocks.MUSHROOM_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_PLANKS),
                        has(DecoBlocks.MUSHROOM_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_TRAPDOOR)+ "_recipe_create");

        signBuilder(DecoItems.MUSHROOM_SIGN, Ingredient.of(DecoBlocks.MUSHROOM_PLANKS))
                .group("wooden_sign")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_PLANKS),has(DecoBlocks.MUSHROOM_PLANKS))
                .save(output,getSimpleRecipeName(DecoItems.MUSHROOM_SIGN)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.MUSHROOM_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_SLAB),
                        has(DecoBlocks.MUSHROOM_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', DecoBlocks.MUSHROOM_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_SLAB),
                        has(DecoBlocks.MUSHROOM_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR)+ "_recipe_create");

        offerCraftingTableVariantRecipe(output, DecoBlocks.MUSHROOM_CRAFTING_TABLE, DecoBlocks.MUSHROOM_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.MUSHROOM_BARREL, DecoBlocks.MUSHROOM_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.MUSHROOM_CARTOGRAPHY_TABLE, DecoBlocks.MUSHROOM_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.MUSHROOM_SMITHING_TABLE, DecoBlocks.MUSHROOM_PLANKS);
        offerLadderVariantRecipe(output, DecoBlocks.MUSHROOM_LADDER, DecoBlocks.MUSHROOM_SLAB);

        offerNoteBlockVariantRecipe(output, DecoBlocks.MUSHROOM_NOTE_BLOCK, DecoBlocks.MUSHROOM_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.OAK_NOTE_BLOCK, Items.OAK_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.SPRUCE_NOTE_BLOCK, Items.SPRUCE_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.BIRCH_NOTE_BLOCK, Items.BIRCH_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.JUNGLE_NOTE_BLOCK, Items.JUNGLE_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.DARK_OAK_NOTE_BLOCK, Items.DARK_OAK_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.ACACIA_NOTE_BLOCK, Items.ACACIA_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.MANGROVE_NOTE_BLOCK, Items.MANGROVE_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.CRIMSON_NOTE_BLOCK, Items.CRIMSON_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.WARPED_NOTE_BLOCK, Items.WARPED_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.CACTUS_NOTE_BLOCK, DecoBlocks.CACTUS_PLANKS);

        polished( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE, Items.CALCITE);

        stairBuilder(DecoBlocks.POLISHED_CALCITE_STAIRS, Ingredient.of(DecoBlocks.POLISHED_CALCITE))
                .unlockedBy(getHasName(DecoBlocks.POLISHED_CALCITE),has(DecoBlocks.POLISHED_CALCITE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_CALCITE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_STAIRS, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_STAIRS, DecoBlocks.POLISHED_CALCITE);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_SLAB, DecoBlocks.POLISHED_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_SLAB, Items.CALCITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_SLAB, DecoBlocks.POLISHED_CALCITE,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.POLISHED_CALCITE_WALL, DecoBlocks.POLISHED_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_WALL, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_WALL, DecoBlocks.POLISHED_CALCITE);

        polished( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE, DecoBlocks.POLISHED_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE, DecoBlocks.POLISHED_CALCITE);

        stairBuilder(DecoBlocks.CUT_CALCITE_STAIRS, Ingredient.of(DecoBlocks.CUT_CALCITE))
                .unlockedBy(getHasName(DecoBlocks.CUT_CALCITE),has(DecoBlocks.CUT_CALCITE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_CALCITE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_STAIRS, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_STAIRS, DecoBlocks.POLISHED_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_STAIRS, DecoBlocks.CUT_CALCITE);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, DecoBlocks.CUT_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, Items.CALCITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, DecoBlocks.POLISHED_CALCITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, DecoBlocks.CUT_CALCITE,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.CUT_CALCITE_WALL, DecoBlocks.CUT_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_WALL, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_WALL, DecoBlocks.POLISHED_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_WALL, DecoBlocks.CUT_CALCITE);

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, DecoBlocks.CUT_CALCITE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, DecoBlocks.POLISHED_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, DecoBlocks.CUT_CALCITE);

        stairBuilder(DecoBlocks.CALCITE_BRICK_STAIRS, Ingredient.of(DecoBlocks.CALCITE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CALCITE_BRICKS),has(DecoBlocks.CALCITE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CALCITE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, DecoBlocks.POLISHED_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, DecoBlocks.CUT_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, DecoBlocks.CALCITE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.CALCITE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, Items.CALCITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.POLISHED_CALCITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.CUT_CALCITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.CALCITE_BRICKS,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.CALCITE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.POLISHED_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.CUT_CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.CALCITE_BRICKS);

        polished( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE, Items.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE, Items.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE, Items.POLISHED_ANDESITE);

        stairBuilder(DecoBlocks.CUT_ANDESITE_STAIRS, Ingredient.of(DecoBlocks.CUT_ANDESITE))
                .unlockedBy(getHasName(DecoBlocks.CUT_ANDESITE),has(DecoBlocks.CUT_ANDESITE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_ANDESITE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_STAIRS, Items.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_STAIRS, Items.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_STAIRS, DecoBlocks.CUT_ANDESITE);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, DecoBlocks.CUT_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, Items.ANDESITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, Items.POLISHED_ANDESITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, DecoBlocks.CUT_ANDESITE,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.CUT_ANDESITE_WALL, DecoBlocks.CUT_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_WALL, Items.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_WALL, Items.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_WALL, DecoBlocks.CUT_ANDESITE);

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, DecoBlocks.CUT_ANDESITE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, Items.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, Items.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, DecoBlocks.CUT_ANDESITE);

        stairBuilder(DecoBlocks.ANDESITE_BRICK_STAIRS, Ingredient.of(DecoBlocks.ANDESITE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.ANDESITE_BRICKS),has(DecoBlocks.ANDESITE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.ANDESITE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, Items.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, Items.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, DecoBlocks.CUT_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, DecoBlocks.ANDESITE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, DecoBlocks.ANDESITE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, Items.ANDESITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, Items.POLISHED_ANDESITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, DecoBlocks.CUT_ANDESITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, DecoBlocks.ANDESITE_BRICKS,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.ANDESITE_BRICK_WALL, DecoBlocks.ANDESITE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, Items.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, Items.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, DecoBlocks.CUT_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, DecoBlocks.ANDESITE_BRICKS);

        polished( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE, Items.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE, Items.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE, Items.POLISHED_GRANITE);

        stairBuilder(DecoBlocks.CUT_GRANITE_STAIRS, Ingredient.of(DecoBlocks.CUT_GRANITE))
                .unlockedBy(getHasName(DecoBlocks.CUT_GRANITE),has(DecoBlocks.CUT_GRANITE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_GRANITE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_STAIRS, Items.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_STAIRS, Items.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_STAIRS, DecoBlocks.CUT_GRANITE);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, DecoBlocks.CUT_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, Items.GRANITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, Items.POLISHED_GRANITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, DecoBlocks.CUT_GRANITE,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.CUT_GRANITE_WALL, DecoBlocks.CUT_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_WALL, Items.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_WALL, Items.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_WALL, DecoBlocks.CUT_GRANITE);

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, DecoBlocks.CUT_GRANITE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, Items.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, Items.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, DecoBlocks.CUT_GRANITE);

        stairBuilder(DecoBlocks.GRANITE_BRICK_STAIRS, Ingredient.of(DecoBlocks.GRANITE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.GRANITE_BRICKS),has(DecoBlocks.GRANITE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.GRANITE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, Items.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, Items.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, DecoBlocks.CUT_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, DecoBlocks.GRANITE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, DecoBlocks.GRANITE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, Items.GRANITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, Items.POLISHED_GRANITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, DecoBlocks.CUT_GRANITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, DecoBlocks.GRANITE_BRICKS,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.GRANITE_BRICK_WALL, DecoBlocks.GRANITE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, Items.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, Items.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, DecoBlocks.CUT_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, DecoBlocks.GRANITE_BRICKS);

        polished( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE, Items.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE, Items.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE, Items.POLISHED_DIORITE);

        stairBuilder(DecoBlocks.CUT_DIORITE_STAIRS, Ingredient.of(DecoBlocks.CUT_DIORITE))
                .unlockedBy(getHasName(DecoBlocks.CUT_DIORITE),has(DecoBlocks.CUT_DIORITE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_DIORITE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_STAIRS, Items.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_STAIRS, Items.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_STAIRS, DecoBlocks.CUT_DIORITE);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, DecoBlocks.CUT_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, Items.DIORITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, Items.POLISHED_DIORITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, DecoBlocks.CUT_DIORITE,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.CUT_DIORITE_WALL, DecoBlocks.CUT_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_WALL, Items.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_WALL, Items.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_WALL, DecoBlocks.CUT_DIORITE);

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, DecoBlocks.CUT_DIORITE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, Items.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, Items.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, DecoBlocks.CUT_DIORITE);

        stairBuilder(DecoBlocks.DIORITE_BRICK_STAIRS, Ingredient.of(DecoBlocks.DIORITE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.DIORITE_BRICKS),has(DecoBlocks.DIORITE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.DIORITE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, Items.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, Items.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, DecoBlocks.CUT_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, DecoBlocks.DIORITE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, DecoBlocks.DIORITE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, Items.DIORITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, Items.POLISHED_DIORITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, DecoBlocks.CUT_DIORITE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, DecoBlocks.DIORITE_BRICKS,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.DIORITE_BRICK_WALL, DecoBlocks.DIORITE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, Items.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, Items.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, DecoBlocks.CUT_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, DecoBlocks.DIORITE_BRICKS);

        cut(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD, Items.GOLD_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD, Items.GOLD_BLOCK,4);

        stairBuilder(DecoBlocks.CUT_GOLD_STAIRS, Ingredient.of(DecoBlocks.CUT_GOLD))
                .unlockedBy(getHasName(DecoBlocks.CUT_GOLD),has(DecoBlocks.CUT_GOLD))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_GOLD_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_STAIRS, Items.GOLD_BLOCK,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_STAIRS, DecoBlocks.CUT_GOLD);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, DecoBlocks.CUT_GOLD);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, Items.GOLD_BLOCK,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, DecoBlocks.CUT_GOLD,2);

        stairBuilder(DecoBlocks.IRON_STAIRS, Ingredient.of(Items.IRON_BLOCK))
                .unlockedBy(getHasName(Items.IRON_BLOCK),has(Items.IRON_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS, Items.IRON_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB, Items.IRON_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB, Items.IRON_BLOCK,2);

        stairBuilder(DecoBlocks.GOLD_STAIRS, Ingredient.of(Items.GOLD_BLOCK))
                .unlockedBy(getHasName(Items.GOLD_BLOCK),has(Items.GOLD_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.GOLD_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_STAIRS, Items.GOLD_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB, Items.GOLD_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB, Items.GOLD_BLOCK,2);

        stairBuilder(DecoBlocks.RAW_IRON_STAIRS, Ingredient.of(Items.RAW_IRON_BLOCK))
                .unlockedBy(getHasName(Items.RAW_IRON_BLOCK),has(Items.RAW_IRON_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.RAW_IRON_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_STAIRS, Items.RAW_IRON_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_SLAB, Items.RAW_IRON_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_SLAB, Items.RAW_IRON_BLOCK,2);

        stairBuilder(DecoBlocks.RAW_GOLD_STAIRS, Ingredient.of(Items.RAW_GOLD_BLOCK))
                .unlockedBy(getHasName(Items.RAW_GOLD_BLOCK),has(Items.RAW_GOLD_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.RAW_GOLD_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_STAIRS, Items.RAW_GOLD_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_SLAB, Items.RAW_GOLD_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_SLAB, Items.RAW_GOLD_BLOCK,2);

        stairBuilder(DecoBlocks.COPPER_STAIRS, Ingredient.of(Items.COPPER_BLOCK))
                .unlockedBy(getHasName(Items.COPPER_BLOCK),has(Items.COPPER_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.COPPER_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_STAIRS, Items.COPPER_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB, Items.COPPER_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB, Items.COPPER_BLOCK,2);

        stairBuilder(DecoBlocks.EXPOSED_COPPER_STAIRS, Ingredient.of(Items.EXPOSED_COPPER))
                .unlockedBy(getHasName(Items.EXPOSED_COPPER),has(Items.EXPOSED_COPPER))
                .save(output,getSimpleRecipeName(DecoBlocks.EXPOSED_COPPER_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_STAIRS, Items.EXPOSED_COPPER);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_SLAB, Items.EXPOSED_COPPER);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_SLAB, Items.EXPOSED_COPPER,2);

        stairBuilder(DecoBlocks.WEATHERED_COPPER_STAIRS, Ingredient.of(Items.WEATHERED_COPPER))
                .unlockedBy(getHasName(Items.WEATHERED_COPPER),has(Items.WEATHERED_COPPER))
                .save(output,getSimpleRecipeName(DecoBlocks.WEATHERED_COPPER_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_STAIRS, Items.WEATHERED_COPPER);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_SLAB, Items.WEATHERED_COPPER);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_SLAB, Items.WEATHERED_COPPER,2);

        stairBuilder(DecoBlocks.OXIDIZED_COPPER_STAIRS, Ingredient.of(Items.OXIDIZED_COPPER))
                .unlockedBy(getHasName(Items.OXIDIZED_COPPER),has(Items.OXIDIZED_COPPER))
                .save(output,getSimpleRecipeName(DecoBlocks.OXIDIZED_COPPER_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_STAIRS, Items.OXIDIZED_COPPER);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_SLAB, Items.OXIDIZED_COPPER);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_SLAB, Items.OXIDIZED_COPPER,2);

        stairBuilder(DecoBlocks.WAXED_COPPER_STAIRS, Ingredient.of(Items.WAXED_COPPER_BLOCK))
                .unlockedBy(getHasName(Items.WAXED_COPPER_BLOCK),has(Items.WAXED_COPPER_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.WAXED_COPPER_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_STAIRS, Items.WAXED_COPPER_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_SLAB, Items.WAXED_COPPER_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_SLAB, Items.WAXED_COPPER_BLOCK,2);

        stairBuilder(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS, Ingredient.of(Items.WAXED_EXPOSED_COPPER))
                .unlockedBy(getHasName(Items.WAXED_EXPOSED_COPPER),has(Items.WAXED_EXPOSED_COPPER))
                .save(output,getSimpleRecipeName(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS, Items.WAXED_EXPOSED_COPPER);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_SLAB, Items.WAXED_EXPOSED_COPPER);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_SLAB, Items.WAXED_EXPOSED_COPPER,2);

        stairBuilder(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS, Ingredient.of(Items.WAXED_WEATHERED_COPPER))
                .unlockedBy(getHasName(Items.WAXED_WEATHERED_COPPER),has(Items.WAXED_WEATHERED_COPPER))
                .save(output,getSimpleRecipeName(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS, Items.WAXED_WEATHERED_COPPER);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_SLAB, Items.WAXED_WEATHERED_COPPER);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_SLAB, Items.WAXED_WEATHERED_COPPER,2);

        stairBuilder(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS, Ingredient.of(Items.WAXED_OXIDIZED_COPPER))
                .unlockedBy(getHasName(Items.WAXED_OXIDIZED_COPPER),has(Items.WAXED_OXIDIZED_COPPER))
                .save(output,getSimpleRecipeName(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS, Items.WAXED_OXIDIZED_COPPER);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB, Items.WAXED_OXIDIZED_COPPER);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB, Items.WAXED_OXIDIZED_COPPER,2);

        stairBuilder(DecoBlocks.RAW_COPPER_STAIRS, Ingredient.of(Items.RAW_COPPER_BLOCK))
                .unlockedBy(getHasName(Items.RAW_COPPER_BLOCK),has(Items.RAW_COPPER_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.RAW_COPPER_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_STAIRS, Items.RAW_COPPER_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_SLAB, Items.RAW_COPPER_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_SLAB, Items.RAW_COPPER_BLOCK,2);

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.COBBLESTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,Items.STONE_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(Items.COBBLESTONE_STAIRS), has(Items.COBBLESTONE_STAIRS))
                        .save(output, getSimpleRecipeName(Items.STONE_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.COBBLESTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,Items.STONE_SLAB,
                                0.1f, 200).unlockedBy(getHasName(Items.COBBLESTONE_SLAB), has(Items.COBBLESTONE_SLAB))
                        .save(output, getSimpleRecipeName(Items.STONE_SLAB) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.COBBLESTONE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.STONE_WALL,
                                0.1f, 200).unlockedBy(getHasName(Items.COBBLESTONE_WALL), has(Items.COBBLESTONE_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.STONE_WALL) + "_form_smelting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.STONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_STONE_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(Items.STONE_STAIRS), has(Items.STONE_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_STONE_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.STONE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,Items.SMOOTH_STONE_SLAB,
                                0.1f, 200).unlockedBy(getHasName(Items.STONE_SLAB), has(Items.STONE_SLAB))
                        .save(output, getSimpleRecipeName(Items.SMOOTH_STONE_SLAB) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.STONE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_STONE_WALL,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.STONE_WALL), has(DecoBlocks.STONE_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_STONE_WALL) + "_form_smelting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.COBBLED_DEEPSLATE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.DEEPSLATE_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(Items.COBBLED_DEEPSLATE_STAIRS), has(Items.COBBLED_DEEPSLATE_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.DEEPSLATE_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.COBBLED_DEEPSLATE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.DEEPSLATE_SLAB,
                                0.1f, 200).unlockedBy(getHasName(Items.COBBLED_DEEPSLATE_SLAB), has(Items.COBBLED_DEEPSLATE_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.DEEPSLATE_SLAB) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.COBBLED_DEEPSLATE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.DEEPSLATE_WALL,
                                0.1f, 200).unlockedBy(getHasName(Items.COBBLED_DEEPSLATE_WALL), has(Items.COBBLED_DEEPSLATE_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.DEEPSLATE_WALL) + "_form_smelting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.SANDSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,Items.SMOOTH_SANDSTONE_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(Items.SANDSTONE_STAIRS), has(Items.SANDSTONE_STAIRS))
                        .save(output, getSimpleRecipeName(Items.SMOOTH_SANDSTONE_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.SANDSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,Items.SMOOTH_SANDSTONE_SLAB,
                                0.1f, 200).unlockedBy(getHasName(Items.SANDSTONE_SLAB), has(Items.SANDSTONE_SLAB))
                        .save(output, getSimpleRecipeName(Items.SMOOTH_SANDSTONE_SLAB) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.SANDSTONE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_SANDSTONE_WALL,
                                0.1f, 200).unlockedBy(getHasName(Items.SANDSTONE_WALL), has(Items.SANDSTONE_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_SANDSTONE_WALL) + "_form_smelting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RED_SANDSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,Items.SMOOTH_RED_SANDSTONE_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(Items.RED_SANDSTONE_STAIRS), has(Items.RED_SANDSTONE_STAIRS))
                        .save(output, getSimpleRecipeName(Items.SMOOTH_RED_SANDSTONE_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RED_SANDSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,Items.SMOOTH_RED_SANDSTONE_SLAB,
                                0.1f, 200).unlockedBy(getHasName(Items.RED_SANDSTONE_SLAB), has(Items.RED_SANDSTONE_SLAB))
                        .save(output, getSimpleRecipeName(Items.SMOOTH_RED_SANDSTONE_SLAB) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RED_SANDSTONE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_RED_SANDSTONE_WALL,
                                0.1f, 200).unlockedBy(getHasName(Items.RED_SANDSTONE_WALL), has(Items.RED_SANDSTONE_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_RED_SANDSTONE_WALL) + "_form_smelting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.QUARTZ_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,Items.SMOOTH_QUARTZ_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(Items.QUARTZ_STAIRS), has(Items.QUARTZ_STAIRS))
                        .save(output, getSimpleRecipeName(Items.SMOOTH_QUARTZ_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.QUARTZ_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,Items.SMOOTH_QUARTZ_SLAB,
                                0.1f, 200).unlockedBy(getHasName(Items.QUARTZ_SLAB), has(Items.QUARTZ_SLAB))
                        .save(output, getSimpleRecipeName(Items.SMOOTH_QUARTZ_SLAB) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.QUARTZ_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_QUARTZ_WALL,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.QUARTZ_WALL), has(DecoBlocks.QUARTZ_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_QUARTZ_WALL) + "_form_smelting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.SOUL_SOILSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.SOUL_SOILSTONE_STAIRS), has(DecoBlocks.SOUL_SOILSTONE_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.SOUL_SOILSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.SOUL_SOILSTONE_SLAB), has(DecoBlocks.SOUL_SOILSTONE_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.SOUL_SOILSTONE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.SOUL_SOILSTONE_WALL), has(DecoBlocks.SOUL_SOILSTONE_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL) + "_form_smelting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BLACKSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(Items.BLACKSTONE_STAIRS), has(Items.BLACKSTONE_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BLACKSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_SLAB,
                                0.1f, 200).unlockedBy(getHasName(Items.BLACKSTONE_SLAB), has(Items.BLACKSTONE_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_BLACKSTONE_SLAB) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BLACKSTONE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_WALL,
                                0.1f, 200).unlockedBy(getHasName(Items.BLACKSTONE_WALL), has(Items.BLACKSTONE_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_BLACKSTONE_WALL) + "_form_smelting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.DEEPSLATE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.DEEPSLATE_STAIRS), has(DecoBlocks.DEEPSLATE_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.DEEPSLATE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_SLAB,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.DEEPSLATE_SLAB), has(DecoBlocks.DEEPSLATE_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_DEEPSLATE_SLAB) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.DEEPSLATE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_WALL,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.DEEPSLATE_WALL), has(DecoBlocks.DEEPSLATE_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_DEEPSLATE_WALL) + "_form_smelting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, CookingBookCategory.MISC,Items.IRON_BLOCK,
                                6.3f, 1800).unlockedBy(getHasName(Items.RAW_IRON_BLOCK), has(Items.RAW_IRON_BLOCK))
                        .save(output, getSimpleRecipeName(Items.IRON_BLOCK) + "_form_smelting");

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, CookingBookCategory.MISC,Items.IRON_BLOCK,
                                6.3f, 900).unlockedBy(getHasName(Items.RAW_IRON_BLOCK), has(Items.RAW_IRON_BLOCK))
                        .save(output, getSimpleRecipeName(Items.IRON_BLOCK) + "_form_blasting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RAW_IRON_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.IRON_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.RAW_IRON_STAIRS), has(DecoBlocks.RAW_IRON_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.IRON_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RAW_IRON_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.IRON_SLAB,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.RAW_IRON_SLAB), has(DecoBlocks.RAW_IRON_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.IRON_SLAB) + "_form_smelting");

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(DecoBlocks.RAW_IRON_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.IRON_STAIRS,
                                0.1f, 100).unlockedBy(getHasName(DecoBlocks.RAW_IRON_STAIRS), has(DecoBlocks.RAW_IRON_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.IRON_STAIRS) + "_form_blasting");
                SimpleCookingRecipeBuilder.blasting(Ingredient.of(DecoBlocks.RAW_IRON_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.IRON_SLAB,
                                0.1f, 100).unlockedBy(getHasName(DecoBlocks.RAW_IRON_SLAB), has(DecoBlocks.RAW_IRON_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.RAW_IRON_SLAB) + "_form_blasting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, CookingBookCategory.MISC,Items.GOLD_BLOCK,
                                6.3f, 1800).unlockedBy(getHasName(Items.RAW_GOLD_BLOCK), has(Items.RAW_GOLD_BLOCK))
                        .save(output, getSimpleRecipeName(Items.GOLD_BLOCK) + "_form_smelting");
                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, CookingBookCategory.MISC,Items.GOLD_BLOCK,
                                6.3f, 900).unlockedBy(getHasName(Items.RAW_GOLD_BLOCK), has(Items.RAW_GOLD_BLOCK))
                        .save(output, getSimpleRecipeName(Items.GOLD_BLOCK) + "_form_blasting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RAW_GOLD_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.GOLD_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.RAW_GOLD_STAIRS), has(DecoBlocks.RAW_GOLD_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.GOLD_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RAW_GOLD_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.GOLD_SLAB,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.RAW_GOLD_SLAB), has(DecoBlocks.RAW_GOLD_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.GOLD_SLAB) + "_form_smelting");

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(DecoBlocks.RAW_GOLD_STAIRS),  RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.GOLD_STAIRS,
                                0.1f, 100).unlockedBy(getHasName(DecoBlocks.RAW_GOLD_STAIRS), has(DecoBlocks.RAW_GOLD_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.GOLD_STAIRS) + "_form_blasting");
                SimpleCookingRecipeBuilder.blasting(Ingredient.of(DecoBlocks.RAW_GOLD_SLAB),  RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.GOLD_SLAB,
                                0.1f, 100).unlockedBy(getHasName(DecoBlocks.RAW_GOLD_SLAB), has(DecoBlocks.RAW_GOLD_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.GOLD_SLAB) + "_form_blasting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, CookingBookCategory.MISC,Items.COPPER_BLOCK,
                                6.3f, 1800).unlockedBy(getHasName(Items.RAW_COPPER_BLOCK), has(Items.RAW_COPPER_BLOCK))
                        .save(output, getSimpleRecipeName(Items.COPPER_BLOCK) + "_form_smelting");
                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, CookingBookCategory.MISC,Items.COPPER_BLOCK,
                                6.3f, 900).unlockedBy(getHasName(Items.RAW_COPPER_BLOCK), has(Items.RAW_COPPER_BLOCK))
                        .save(output, getSimpleRecipeName(Items.COPPER_BLOCK) + "_form_blasting");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RAW_COPPER_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.COPPER_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.RAW_COPPER_STAIRS), has(DecoBlocks.RAW_COPPER_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.COPPER_STAIRS) + "_form_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RAW_COPPER_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.COPPER_SLAB,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.RAW_COPPER_SLAB), has(DecoBlocks.RAW_COPPER_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.COPPER_SLAB) + "_form_smelting");

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(DecoBlocks.RAW_COPPER_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.COPPER_STAIRS,
                                0.1f, 100).unlockedBy(getHasName(DecoBlocks.RAW_COPPER_STAIRS), has(DecoBlocks.RAW_COPPER_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.COPPER_STAIRS) + "_form_blasting");
                SimpleCookingRecipeBuilder.blasting(Ingredient.of(DecoBlocks.RAW_COPPER_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.COPPER_SLAB,
                                0.1f, 100).unlockedBy(getHasName(DecoBlocks.RAW_COPPER_SLAB), has(DecoBlocks.RAW_COPPER_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.COPPER_SLAB) + "_form_blasting");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', Items.DEEPSLATE)
                .group("lever")
                .unlockedBy(getHasName(Items.DEEPSLATE),
                        has(Items.DEEPSLATE))
                .save(output,getSimpleRecipeName(DecoBlocks.DEEPSLATE_LEVER)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.COBBLED_DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', Items.COBBLED_DEEPSLATE)
                .group("lever")
                .unlockedBy(getHasName(Items.COBBLED_DEEPSLATE),
                        has(Items.COBBLED_DEEPSLATE))
                .save(output,getSimpleRecipeName(DecoBlocks.COBBLED_DEEPSLATE_LEVER)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', Items.POLISHED_DEEPSLATE)
                .group("lever")
                .unlockedBy(getHasName(Items.POLISHED_DEEPSLATE),
                        has(Items.POLISHED_DEEPSLATE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_DEEPSLATE_LEVER)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', Items.STONE)
                .group("lever")
                .unlockedBy(getHasName(Items.STONE),
                        has(Items.STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.STONE_LEVER)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', DecoBlocks.POLISHED_STONE)
                .group("lever")
                .unlockedBy(getHasName(DecoBlocks.POLISHED_STONE),
                        has(DecoBlocks.POLISHED_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_STONE_LEVER)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.BLACKSTONE_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', Items.BLACKSTONE)
                .group("lever")
                .unlockedBy(getHasName(Items.BLACKSTONE),
                        has(Items.BLACKSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.BLACKSTONE_LEVER)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_BLACKSTONE_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', Items.POLISHED_BLACKSTONE)
                .group("lever")
                .unlockedBy(getHasName(Items.POLISHED_BLACKSTONE),
                        has(Items.POLISHED_BLACKSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_BLACKSTONE_LEVER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.HEAVY_GOLD_BARS)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.GOLD_BARS)
                .unlockedBy(getHasName(DecoBlocks.GOLD_BARS),
                        has(DecoBlocks.GOLD_BARS))
                .save(output,getSimpleRecipeName(DecoBlocks.HEAVY_GOLD_BARS)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS,16)
                .pattern("###")
                .pattern("###")
                .define('#', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT),
                        has(Items.GOLD_INGOT))
                .save(output,getSimpleRecipeName(DecoBlocks.GOLD_BARS)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.LIGHT_GOLD_BARS,16)
                .pattern("###")
                .pattern("###")
                .define('#', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(Items.GOLD_NUGGET),
                        has(Items.GOLD_NUGGET))
                .save(output,getSimpleRecipeName(DecoBlocks.LIGHT_GOLD_BARS)+ "_recipe_create");

        shapeless(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN)
                .requires(ItemTags.SAND)
                .requires(Items.OBSIDIAN)
                .unlockedBy(getHasName(Items.OBSIDIAN),
                        has(Items.OBSIDIAN))
                .save(output,getSimpleRecipeName(DecoBlocks.SANDED_OBSIDIAN)+ "_recipe_create");

        stairBuilder(DecoBlocks.SANDED_OBSIDIAN_STAIRS, Ingredient.of(DecoBlocks.SANDED_OBSIDIAN))
                .unlockedBy(getHasName(DecoBlocks.SANDED_OBSIDIAN),has(DecoBlocks.SANDED_OBSIDIAN))
                .save(output,getSimpleRecipeName(DecoBlocks.SANDED_OBSIDIAN_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_STAIRS, DecoBlocks.SANDED_OBSIDIAN);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.SANDED_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.OBSIDIAN), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_OBSIDIAN,
                        0.1f, 200).unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_OBSIDIAN)+ "_recipe_create");

        stairBuilder(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS, Ingredient.of(DecoBlocks.SMOOTH_OBSIDIAN))
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_OBSIDIAN),has(DecoBlocks.SMOOTH_OBSIDIAN))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_STAIRS, DecoBlocks.SMOOTH_OBSIDIAN);
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.OBSIDIAN_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_OBSIDIAN_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.OBSIDIAN_STAIRS), has(DecoBlocks.OBSIDIAN_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS)+ "_from_smelting");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB, DecoBlocks.SMOOTH_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB, DecoBlocks.SMOOTH_OBSIDIAN,2);
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.OBSIDIAN_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_OBSIDIAN_SLAB,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.OBSIDIAN_SLAB), has(DecoBlocks.OBSIDIAN_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_OBSIDIAN_SLAB)+ "_from_smelting");

        wall(RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_OBSIDIAN_WALL, DecoBlocks.SMOOTH_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_WALL, DecoBlocks.SMOOTH_OBSIDIAN);
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.OBSIDIAN_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_OBSIDIAN_WALL,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.OBSIDIAN_WALL), has(DecoBlocks.OBSIDIAN_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_OBSIDIAN_WALL)+ "_from_smelting");

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN,4)
                .pattern("#O")
                .pattern("O#")
                .define('#', DecoBlocks.SANDED_OBSIDIAN)
                .define('O', Items.OBSIDIAN)
                .unlockedBy(getHasName(DecoBlocks.SANDED_OBSIDIAN),
                        has(DecoBlocks.SANDED_OBSIDIAN))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_OBSIDIAN)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN, DecoBlocks.SANDED_OBSIDIAN);

        stairBuilder(DecoBlocks.CUT_OBSIDIAN_STAIRS, Ingredient.of(DecoBlocks.CUT_OBSIDIAN))
                .unlockedBy(getHasName(DecoBlocks.CUT_OBSIDIAN),has(DecoBlocks.CUT_OBSIDIAN))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_OBSIDIAN_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_STAIRS, DecoBlocks.SANDED_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_STAIRS, DecoBlocks.CUT_OBSIDIAN);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_SLAB, DecoBlocks.CUT_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_SLAB, DecoBlocks.CUT_OBSIDIAN,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.CUT_OBSIDIAN_WALL, DecoBlocks.CUT_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_WALL, DecoBlocks.CUT_OBSIDIAN);

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_MAGMA_BLOCK, DecoBlocks.MAGMA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_MAGMA_BLOCK, DecoBlocks.MAGMA_SLAB);

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_BUBBLE_BLOCK, DecoBlocks.BUBBLE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_BUBBLE_BLOCK, DecoBlocks.BUBBLE_SLAB);

                shapeless(RecipeCategory.MISC, Items.YELLOW_DYE)
                        .requires(DecoBlocks.BUTTERCUP)
                        .group("yellow_dye")
                        .unlockedBy(getHasName(DecoBlocks.BUTTERCUP),
                                has(DecoBlocks.BUTTERCUP))
                        .save(output, getSimpleRecipeName(Items.YELLOW_DYE) + "_from_buttercup");
                shapeless(RecipeCategory.MISC, Items.LIME_DYE)
                        .requires(DecoBlocks.NIGHTSHADE)
                        .group("lime_dye")
                        .unlockedBy(getHasName(DecoBlocks.NIGHTSHADE),
                                has(DecoBlocks.NIGHTSHADE))
                        .save(output, getSimpleRecipeName(Items.LIME_DYE) + "_from_nightshade");
                shapeless(RecipeCategory.MISC, Items.BLACK_DYE)
                        .requires(DecoBlocks.ENDERSHADE)
                        .group("black_dye")
                        .unlockedBy(getHasName(DecoBlocks.ENDERSHADE),
                                has(DecoBlocks.ENDERSHADE))
                        .save(output, getSimpleRecipeName(Items.LIME_DYE) + "_from_endershade");

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, DecoBlocks.POLISHED_END_STONE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, Items.END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, DecoBlocks.POLISHED_END_STONE);


        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE, Items.END_STONE);


        stairBuilder(DecoBlocks.POLISHED_END_STONE_STAIRS, Ingredient.of(DecoBlocks.POLISHED_END_STONE))
                .unlockedBy(getHasName(DecoBlocks.POLISHED_END_STONE),has(DecoBlocks.POLISHED_END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_END_STONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_STAIRS, DecoBlocks.POLISHED_END_STONE);


        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_SLAB, DecoBlocks.POLISHED_END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_SLAB, DecoBlocks.POLISHED_END_STONE,2);


        wall(RecipeCategory.DECORATIONS, DecoBlocks.POLISHED_END_STONE_WALL, DecoBlocks.POLISHED_END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_WALL, DecoBlocks.POLISHED_END_STONE);


        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICKS, DecoBlocks.POLISHED_END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICK_STAIRS, DecoBlocks.POLISHED_END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICK_SLAB, DecoBlocks.POLISHED_END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICK_WALL, DecoBlocks.POLISHED_END_STONE);


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.END_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_END_STONE_BRICKS,
                        0.1f, 200).unlockedBy(getHasName(Items.END_STONE_BRICKS), has(Items.END_STONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_END_STONE_BRICKS)+ "_recipe_create");


        polished( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, DecoBlocks.POLISHED_END_STONE);


        stairBuilder(DecoBlocks.END_STONE_TILE_STAIRS, Ingredient.of(DecoBlocks.END_STONE_TILES))
                .unlockedBy(getHasName(DecoBlocks.END_STONE_TILES),has(DecoBlocks.END_STONE_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.END_STONE_TILE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, DecoBlocks.END_STONE_TILES);


        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, DecoBlocks.END_STONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, DecoBlocks.END_STONE_TILES,2);


        wall(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_TILE_WALL, DecoBlocks.END_STONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, DecoBlocks.END_STONE_TILES);


        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, Items.END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, Items.END_STONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, Items.END_STONE);


        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, DecoBlocks.POLISHED_END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, DecoBlocks.POLISHED_END_STONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, DecoBlocks.POLISHED_END_STONE);


        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, Items.END_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, Items.END_STONE_BRICKS,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, Items.END_STONE_BRICKS);


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.END_STONE_TILES), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_END_STONE_TILES,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.END_STONE_TILES), has(DecoBlocks.END_STONE_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_END_STONE_TILES)+ "_recipe_create");


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.END_STONE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_END_STONE,
                        0.1f, 200).unlockedBy(getHasName(Items.END_STONE), has(Items.END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_END_STONE)+ "_recipe_create");


        stairBuilder(DecoBlocks.SMOOTH_END_STONE_STAIRS, Ingredient.of(DecoBlocks.SMOOTH_END_STONE))
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_END_STONE),has(DecoBlocks.SMOOTH_END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_END_STONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_STAIRS, DecoBlocks.SMOOTH_END_STONE);
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.END_STONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_END_STONE_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.END_STONE_STAIRS), has(DecoBlocks.END_STONE_STAIRS))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_END_STONE_STAIRS) + "_from_smelting");


        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB, DecoBlocks.SMOOTH_END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB, DecoBlocks.SMOOTH_END_STONE,2);
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.END_STONE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_END_STONE_SLAB,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.END_STONE_SLAB), has(DecoBlocks.END_STONE_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_END_STONE_SLAB) + "_from_smelting");


        wall(RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_END_STONE_WALL, DecoBlocks.SMOOTH_END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_WALL, DecoBlocks.SMOOTH_END_STONE);
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.END_STONE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_END_STONE_WALL,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.END_STONE_WALL), has(DecoBlocks.END_STONE_WALL))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_END_STONE_WALL) + "_from_smelting");

        shapeless(RecipeCategory.REDSTONE, DecoBlocks.END_STONE_BUTTON)
                .requires(Items.END_STONE)
                .unlockedBy(getHasName(Items.END_STONE),
                        has(Items.END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.END_STONE_BUTTON)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_BUTTON, Items.END_STONE);

        pressurePlate(DecoBlocks.END_STONE_PRESSURE_PLATE, Items.END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_PRESSURE_PLATE, Items.END_STONE);

        pressurePlate(DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE, Items.END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_END_STONE);

        shapeless(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_END_STONE_BUTTON)
                .requires(DecoBlocks.POLISHED_END_STONE)
                .unlockedBy(getHasName(DecoBlocks.POLISHED_END_STONE),
                        has(DecoBlocks.POLISHED_END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_END_STONE_BUTTON)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_BUTTON, Items.END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_BUTTON, DecoBlocks.POLISHED_END_STONE);

        shaped(RecipeCategory.REDSTONE, DecoBlocks.END_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', Items.END_STONE)
                .group("lever")
                .unlockedBy(getHasName(Items.END_STONE),
                        has(Items.END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.END_STONE_LEVER)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_END_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', DecoBlocks.POLISHED_END_STONE)
                .group("lever")
                .unlockedBy(getHasName(DecoBlocks.POLISHED_END_STONE),
                        has(DecoBlocks.POLISHED_END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_END_STONE_LEVER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .define('I', Items.IRON_INGOT)
                .define('X', DecoBlocks.END_STONE_FURNACE)
                .define('#', DecoBlocks.SMOOTH_END_STONE)
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_END_STONE),
                        has(DecoBlocks.SMOOTH_END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.END_STONE_BLAST_FURNACE)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_SMOKER)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .define('#', ItemTags.LOGS)
                .define('X', DecoBlocks.END_STONE_FURNACE)
                .unlockedBy(getHasName(DecoBlocks.END_STONE_FURNACE),
                        has(DecoBlocks.END_STONE_FURNACE))
                .save(output,getSimpleRecipeName(DecoBlocks.END_STONE_SMOKER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .define('I', Items.IRON_INGOT)
                .define('#', Items.END_STONE)
                .unlockedBy(getHasName(Items.END_STONE),
                        has(Items.END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.END_STONE_STONECUTTER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_GRINDSTONE)
                .pattern("I-I")
                .pattern("# #")
                .define('I', Items.STICK)
                .define('-', DecoBlocks.END_STONE_SLAB)
                .define('#', ItemTags.PLANKS)
                .unlockedBy(getHasName(DecoBlocks.END_STONE_SLAB),
                        has(DecoBlocks.END_STONE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.END_STONE_GRINDSTONE)+ "_recipe_create");

        stairBuilder(DecoBlocks.CHERRY_WOOD_STAIRS, Ingredient.of(Items.CHERRY_WOOD))
                .unlockedBy(getHasName(Items.CHERRY_WOOD),has(Items.CHERRY_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.CHERRY_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHERRY_WOOD_SLAB, Items.CHERRY_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.CHERRY_WOOD_WALL, Items.CHERRY_WOOD);

        stairBuilder(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS, Ingredient.of(Items.STRIPPED_CHERRY_WOOD))
                .unlockedBy(getHasName(Items.STRIPPED_CHERRY_WOOD),has(Items.STRIPPED_CHERRY_WOOD))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_CHERRY_WOOD_SLAB, Items.STRIPPED_CHERRY_WOOD);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_CHERRY_WOOD_WALL, Items.STRIPPED_CHERRY_WOOD);

        offerNoteBlockVariantRecipe(output, DecoBlocks.CHERRY_NOTE_BLOCK, Items.CHERRY_PLANKS);
        offerNoteBlockVariantRecipe(output, DecoBlocks.BAMBOO_NOTE_BLOCK, Items.BAMBOO_PLANKS);

        offerBookshelvesVariantRecipe(output, DecoBlocks.MUSHROOM_BOOKSHELF, DecoBlocks.MUSHROOM_BOOKSHELF);

        shaped(RecipeCategory.REDSTONE, DecoBlocks.CHERRY_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.CHERRY_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.CHERRY_SLAB),
                        has(Items.CHERRY_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CHERRY_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.CHERRY_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.CHERRY_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.CHERRY_SLAB),
                        has(Items.CHERRY_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CHERRY_PALLET_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.BAMBOO_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.BAMBOO_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(Items.BAMBOO_SLAB),
                        has(Items.BAMBOO_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.BAMBOO_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE, DecoBlocks.BAMBOO_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', Items.BAMBOO_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(Items.BAMBOO_SLAB),
                        has(Items.BAMBOO_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.BAMBOO_PALLET_TRAPDOOR)+ "_recipe_create");

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUSHROOM_MOSAIC, DecoBlocks.MUSHROOM_SLAB);

        stairBuilder(DecoBlocks.MUSHROOM_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.MUSHROOM_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_MOSAIC),has(DecoBlocks.MUSHROOM_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUSHROOM_MOSAIC_SLAB, DecoBlocks.MUSHROOM_MOSAIC);

        signBuilder(DecoItems.STRIPPED_CACTUS_SIGN, Ingredient.of(DecoBlocks.STRIPPED_CACTUS))
                .unlockedBy(getHasName(DecoBlocks.STRIPPED_CACTUS),has(DecoBlocks.STRIPPED_CACTUS))
                .save(output,getSimpleRecipeName(DecoItems.STRIPPED_CACTUS_SIGN)+ "_recipe_create");
        signBuilder(DecoItems.MUSHROOM_STEM_SIGN, Ingredient.of(Blocks.MUSHROOM_STEM))
                .unlockedBy(getHasName(Blocks.MUSHROOM_STEM),has(Blocks.MUSHROOM_STEM))
                .save(output,getSimpleRecipeName(DecoItems.MUSHROOM_STEM_SIGN)+ "_recipe_create");
        signBuilder(DecoItems.MUSHROOM_MOSAIC_SIGN, Ingredient.of(DecoBlocks.MUSHROOM_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_MOSAIC),has(DecoBlocks.MUSHROOM_MOSAIC))
                .save(output,getSimpleRecipeName(DecoItems.MUSHROOM_MOSAIC_SIGN)+ "_recipe_create");

        hangingSign(DecoItems.CACTUS_HANGING_SIGN, DecoBlocks.STRIPPED_CACTUS);
        hangingSign(DecoItems.MUSHROOM_HANGING_SIGN, Blocks.MUSHROOM_STEM);

        hangingSign(DecoItems.MUSHROOM_PLANKS_HANGING_SIGN, DecoBlocks.MUSHROOM_PLANKS);

        hangingSign(DecoItems.MUSHROOM_MOSAIC_HANGING_SIGN, DecoBlocks.MUSHROOM_MOSAIC);

        woodenBoat(DecoItems.MUSHROOM_BOAT, DecoBlocks.MUSHROOM_PLANKS);
        chestBoat(DecoItems.MUSHROOM_CHEST_BOAT, DecoItems.MUSHROOM_BOAT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.OAK_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', Items.OAK_PLANKS)
                .define('-', Items.OAK_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.OAK_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.OAK_CHEST_RAFT, DecoItems.OAK_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.BIRCH_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', Items.BIRCH_PLANKS)
                .define('-', Items.BIRCH_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.BIRCH_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.BIRCH_CHEST_RAFT, DecoItems.BIRCH_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.SPRUCE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', Items.SPRUCE_PLANKS)
                .define('-', Items.SPRUCE_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.SPRUCE_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.SPRUCE_CHEST_RAFT, DecoItems.SPRUCE_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.JUNGLE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', Items.JUNGLE_PLANKS)
                .define('-', Items.JUNGLE_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.JUNGLE_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.JUNGLE_CHEST_RAFT, DecoItems.JUNGLE_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.ACACIA_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', Items.ACACIA_PLANKS)
                .define('-', Items.ACACIA_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.ACACIA_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.ACACIA_CHEST_RAFT, DecoItems.ACACIA_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.DARK_OAK_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', Items.DARK_OAK_PLANKS)
                .define('-', Items.DARK_OAK_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.DARK_OAK_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.DARK_OAK_CHEST_RAFT, DecoItems.DARK_OAK_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.MANGROVE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', Items.MANGROVE_PLANKS)
                .define('-', Items.MANGROVE_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.MANGROVE_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.MANGROVE_CHEST_RAFT, DecoItems.MANGROVE_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.CHERRY_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', Items.CHERRY_PLANKS)
                .define('-', Items.CHERRY_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.CHERRY_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.CHERRY_CHEST_RAFT, DecoItems.CHERRY_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.CRIMSON_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', Items.CRIMSON_PLANKS)
                .define('-', Items.CRIMSON_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.CRIMSON_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.CRIMSON_CHEST_RAFT, DecoItems.CRIMSON_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.WARPED_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', Items.WARPED_PLANKS)
                .define('-', Items.WARPED_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.WARPED_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.WARPED_CHEST_RAFT, DecoItems.WARPED_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.CACTUS_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', DecoBlocks.CACTUS_PLANKS)
                .define('-', DecoBlocks.CACTUS_PLANK_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.CACTUS_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.CACTUS_CHEST_RAFT, DecoItems.CACTUS_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.MUSHROOM_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', DecoBlocks.MUSHROOM_PLANKS)
                .define('-', DecoBlocks.MUSHROOM_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.MUSHROOM_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.MUSHROOM_CHEST_RAFT, DecoItems.MUSHROOM_RAFT);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.WOODEN_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .define('-', DecoBlocks.WOODEN_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.WOODEN_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.WOODEN_CHEST_RAFT, DecoItems.WOODEN_RAFT);

        woodenBoat(DecoItems.BAMBOO_BOAT, Blocks.BAMBOO_PLANKS);
        chestBoat(DecoItems.BAMBOO_CHEST_BOAT, DecoItems.BAMBOO_BOAT);

        stairBuilder(DecoBlocks.OAK_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.OAK_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.OAK_BOOKSHELF),has(DecoBlocks.OAK_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.OAK_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OAK_BOOKSHELF_SLAB, DecoBlocks.OAK_BOOKSHELF);

        stairBuilder(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.SPRUCE_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.SPRUCE_BOOKSHELF),has(DecoBlocks.SPRUCE_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SPRUCE_BOOKSHELF_SLAB, DecoBlocks.SPRUCE_BOOKSHELF);

        stairBuilder(DecoBlocks.BIRCH_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.BIRCH_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.BIRCH_BOOKSHELF),has(DecoBlocks.BIRCH_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.BIRCH_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BIRCH_BOOKSHELF_SLAB, DecoBlocks.BIRCH_BOOKSHELF);

        stairBuilder(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.JUNGLE_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.JUNGLE_BOOKSHELF),has(DecoBlocks.JUNGLE_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.JUNGLE_BOOKSHELF_SLAB, DecoBlocks.JUNGLE_BOOKSHELF);

        stairBuilder(DecoBlocks.ACACIA_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.ACACIA_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.ACACIA_BOOKSHELF),has(DecoBlocks.ACACIA_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.ACACIA_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ACACIA_BOOKSHELF_SLAB, DecoBlocks.ACACIA_BOOKSHELF);

        stairBuilder(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.DARK_OAK_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.DARK_OAK_BOOKSHELF),has(DecoBlocks.DARK_OAK_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DARK_OAK_BOOKSHELF_SLAB, DecoBlocks.DARK_OAK_BOOKSHELF);

        stairBuilder(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.MANGROVE_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.MANGROVE_BOOKSHELF),has(DecoBlocks.MANGROVE_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MANGROVE_BOOKSHELF_SLAB, DecoBlocks.MANGROVE_BOOKSHELF);

        stairBuilder(DecoBlocks.CHERRY_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.CHERRY_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.CHERRY_BOOKSHELF),has(DecoBlocks.CHERRY_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.CHERRY_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHERRY_BOOKSHELF_SLAB, DecoBlocks.CHERRY_BOOKSHELF);

        stairBuilder(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.BAMBOO_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.BAMBOO_BOOKSHELF),has(DecoBlocks.BAMBOO_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BAMBOO_BOOKSHELF_SLAB, DecoBlocks.BAMBOO_BOOKSHELF);

        stairBuilder(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.CRIMSON_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.CRIMSON_BOOKSHELF),has(DecoBlocks.CRIMSON_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRIMSON_BOOKSHELF_SLAB, DecoBlocks.CRIMSON_BOOKSHELF);

        stairBuilder(DecoBlocks.WARPED_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.WARPED_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.WARPED_BOOKSHELF),has(DecoBlocks.WARPED_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.WARPED_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WARPED_BOOKSHELF_SLAB, DecoBlocks.WARPED_BOOKSHELF);

        stairBuilder(DecoBlocks.CACTUS_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.CACTUS_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.CACTUS_BOOKSHELF),has(DecoBlocks.CACTUS_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.CACTUS_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_BOOKSHELF_SLAB, DecoBlocks.CACTUS_BOOKSHELF);

        stairBuilder(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.MUSHROOM_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.MUSHROOM_BOOKSHELF),has(DecoBlocks.MUSHROOM_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_BOOKSHELF_SLAB, DecoBlocks.MUSHROOM_BOOKSHELF);

        stairBuilder(DecoBlocks.WOODEN_BOOKSHELF_STAIRS, Ingredient.of(Items.BOOKSHELF))
                .unlockedBy(getHasName(Items.BOOKSHELF),has(Items.BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.WOODEN_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_BOOKSHELF_SLAB, Items.BOOKSHELF);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', DecoBlocks.IRON_CAP_MUSHROOM)
                .group("giant_mushroom_blocks")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_MUSHROOM),
                        has(DecoBlocks.IRON_CAP_MUSHROOM))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)+ "_recipe_create");

        stairBuilder(DecoBlocks.IRON_CAP_STAIRS, Ingredient.of(DecoBlocks.IRON_CAP_PLANKS))
                .group("wooden_stairs")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_PLANKS),has(DecoBlocks.IRON_CAP_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_STAIRS)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_SLAB,6)
                .pattern("###")
                .define('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_slab")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_PLANKS),
                        has(DecoBlocks.IRON_CAP_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_SLAB)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.IRON_CAP_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .define('/', Items.STICK)
                .define('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_fence")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_PLANKS),
                        has(DecoBlocks.IRON_CAP_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_FENCE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .define('/', Items.STICK)
                .define('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_PLANKS),
                        has(DecoBlocks.IRON_CAP_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_FENCE_GATE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PRESSURE_PLATE)
                .pattern("##")
                .define('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_PLANKS),
                        has(DecoBlocks.IRON_CAP_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_PRESSURE_PLATE)+ "_recipe_create");

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_BUTTON)
                .requires(DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_button")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_PLANKS),
                        has(DecoBlocks.IRON_CAP_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_BUTTON)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_door")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_PLANKS),
                        has(DecoBlocks.IRON_CAP_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_PLANKS),
                        has(DecoBlocks.IRON_CAP_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_TRAPDOOR)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_HYPHAE,4)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.IRON_CAP_STEM)
                .group("bark")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_STEM),
                        has(DecoBlocks.IRON_CAP_STEM))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_HYPHAE)+ "_recipe_create");
        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STRIPPED_IRON_CAP_HYPHAE,4)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.STRIPPED_IRON_CAP_STEM)
                .group("bark")
                .unlockedBy(getHasName(DecoBlocks.STRIPPED_IRON_CAP_STEM),
                        has(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE)+ "_recipe_create");

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_PLANKS,4)
                .requires(DecoTags.Items.IRON_CAP_STEM)
                .unlockedBy("has_logs", has(DecoTags.Items.IRON_CAP_STEM))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_PLANKS)+ "_recipe_create");

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_PLANKS,8)
                .requires(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)
                .group("planks")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK),
                        has(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_PLANKS)+ "_form_mushroom_block");

        stairBuilder(DecoBlocks.IRON_CAP_HYPHAE_STAIRS, Ingredient.of(DecoBlocks.IRON_CAP_HYPHAE))
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_HYPHAE),has(DecoBlocks.IRON_CAP_HYPHAE))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_HYPHAE_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_HYPHAE_SLAB, DecoBlocks.IRON_CAP_HYPHAE);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.IRON_CAP_HYPHAE_WALL, DecoBlocks.IRON_CAP_HYPHAE);

        stairBuilder(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS, Ingredient.of(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE))
                .unlockedBy(getHasName(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE),has(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE))
                .save(output,getSimpleRecipeName(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_SLAB, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_WALL, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_MOSAIC, DecoBlocks.IRON_CAP_SLAB);

        stairBuilder(DecoBlocks.IRON_CAP_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.IRON_CAP_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_MOSAIC),has(DecoBlocks.IRON_CAP_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_MOSAIC_SLAB, DecoBlocks.IRON_CAP_MOSAIC);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.SPORE_IRON_ORE), RecipeCategory.MISC, CookingBookCategory.MISC,Items.IRON_INGOT,
                        0.7f, 200).unlockedBy(getHasName(DecoBlocks.SPORE_IRON_ORE), has(DecoBlocks.SPORE_IRON_ORE))
                .save(output,getSimpleRecipeName(Items.IRON_INGOT)+"_from_smelting_spore_ore");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(DecoBlocks.SPORE_IRON_ORE), RecipeCategory.MISC, CookingBookCategory.MISC,Items.IRON_INGOT,
                        0.7f, 100).unlockedBy(getHasName(DecoBlocks.SPORE_IRON_ORE), has(DecoBlocks.SPORE_IRON_ORE))
                .save(output,getSimpleRecipeName(Items.IRON_INGOT)+"_from_blasting_spore_ore");

                        shaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.IRON_CAP_SLAB)
                .group("pallet_doors")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_SLAB),
                        has(DecoBlocks.IRON_CAP_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_PALLET_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', DecoBlocks.IRON_CAP_SLAB)
                .group("pallet_trapdoors")
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_SLAB),
                        has(DecoBlocks.IRON_CAP_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_PALLET_TRAPDOOR)+ "_recipe_create");

        offerCraftingTableVariantRecipe(output, DecoBlocks.IRON_CAP_CRAFTING_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.IRON_CAP_BARREL, DecoBlocks.IRON_CAP_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.IRON_CAP_CARTOGRAPHY_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.IRON_CAP_SMITHING_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerLadderVariantRecipe(output, DecoBlocks.IRON_CAP_LADDER, DecoBlocks.IRON_CAP_SLAB);

        offerNoteBlockVariantRecipe(output, DecoBlocks.IRON_CAP_NOTE_BLOCK, DecoBlocks.IRON_CAP_PLANKS);

        offerBookshelvesVariantRecipe(output, DecoBlocks.IRON_CAP_BOOKSHELF, DecoBlocks.IRON_CAP_PLANKS);

        stairBuilder(DecoBlocks.IRON_CAP_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.IRON_CAP_BOOKSHELF))
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_BOOKSHELF),has(DecoBlocks.IRON_CAP_BOOKSHELF))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_CAP_BOOKSHELF_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_BOOKSHELF_SLAB, DecoBlocks.IRON_CAP_BOOKSHELF);

        shaped(RecipeCategory.TRANSPORTATION, DecoItems.IRON_CAP_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .define('#', DecoBlocks.IRON_CAP_PLANKS)
                .define('-', DecoBlocks.IRON_CAP_SLAB)
                .unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(output,getSimpleRecipeName(DecoItems.IRON_CAP_RAFT)+ "_recipe_create");
        chestBoat(DecoItems.IRON_CAP_CHEST_RAFT, DecoItems.IRON_CAP_RAFT);

        woodenBoat(DecoItems.IRON_CAP_BOAT, DecoBlocks.IRON_CAP_PLANKS);
        chestBoat(DecoItems.IRON_CAP_CHEST_BOAT, DecoItems.IRON_CAP_BOAT);

        signBuilder(DecoItems.IRON_CAP_SIGN, Ingredient.of(DecoBlocks.IRON_CAP_PLANKS))
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_PLANKS),has(DecoBlocks.IRON_CAP_PLANKS))
                .save(output,getSimpleRecipeName(DecoItems.IRON_CAP_SIGN)+ "_recipe_create");
        signBuilder(DecoItems.STRIPPED_IRON_CAP_SIGN, Ingredient.of(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .unlockedBy(getHasName(DecoBlocks.STRIPPED_IRON_CAP_STEM),has(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .save(output,getSimpleRecipeName(DecoItems.STRIPPED_IRON_CAP_SIGN)+ "_recipe_create");
        signBuilder(DecoItems.IRON_CAP_MOSAIC_SIGN, Ingredient.of(DecoBlocks.IRON_CAP_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.IRON_CAP_MOSAIC),has(DecoBlocks.IRON_CAP_MOSAIC))
                .save(output,getSimpleRecipeName(DecoItems.IRON_CAP_MOSAIC_SIGN)+ "_recipe_create");

        hangingSign(DecoItems.IRON_CAP_HANGING_SIGN, DecoBlocks.STRIPPED_IRON_CAP_STEM);

        hangingSign(DecoItems.IRON_CAP_PLANKS_HANGING_SIGN, DecoBlocks.IRON_CAP_PLANKS);

        hangingSign(DecoItems.IRON_CAP_MOSAIC_HANGING_SIGN, DecoBlocks.IRON_CAP_MOSAIC);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_GRASS)
                .pattern("##")
                .pattern("##")
                .define('#', Items.GRASS_BLOCK)
                .group("packed_soil")
                .unlockedBy(getHasName(Items.GRASS_BLOCK),
                        has(Items.GRASS_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.PACKED_GRASS)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_PODZOL)
                .pattern("##")
                .pattern("##")
                .define('#', Items.PODZOL)
                .group("packed_soil")
                .unlockedBy(getHasName(Items.PODZOL),
                        has(Items.PODZOL))
                .save(output,getSimpleRecipeName(DecoBlocks.PACKED_PODZOL)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_MYCELIUM)
                .pattern("##")
                .pattern("##")
                .define('#', Items.MYCELIUM)
                .group("packed_soil")
                .unlockedBy(getHasName(Items.MYCELIUM),
                        has(Items.MYCELIUM))
                .save(output,getSimpleRecipeName(DecoBlocks.PACKED_MYCELIUM)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_CRIMSON_NYLIUM)
                .pattern("##")
                .pattern("##")
                .define('#', Items.CRIMSON_NYLIUM)
                .group("packed_nylium")
                .unlockedBy(getHasName(Items.CRIMSON_NYLIUM),
                        has(Items.CRIMSON_NYLIUM))
                .save(output,getSimpleRecipeName(DecoBlocks.PACKED_CRIMSON_NYLIUM)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_WARPED_NYLIUM)
                .pattern("##")
                .pattern("##")
                .define('#', Items.WARPED_NYLIUM)
                .group("packed_nylium")
                .unlockedBy(getHasName(Items.WARPED_NYLIUM),
                        has(Items.WARPED_NYLIUM))
                .save(output,getSimpleRecipeName(DecoBlocks.PACKED_WARPED_NYLIUM)+ "_recipe_create");

        carpet(DecoBlocks.GRASS_CARPET, DecoBlocks.PACKED_GRASS);
        carpet(DecoBlocks.PODZOL_CARPET, DecoBlocks.PACKED_PODZOL);
        carpet(DecoBlocks.MYCELIUM_CARPET, DecoBlocks.PACKED_MYCELIUM);
        carpet(DecoBlocks.CRIMSON_NYLIUM_CARPET, DecoBlocks.PACKED_CRIMSON_NYLIUM);
        carpet(DecoBlocks.WARPED_NYLIUM_CARPET, DecoBlocks.PACKED_WARPED_NYLIUM);

        stairBuilder(DecoBlocks.GRASS_STAIRS, Ingredient.of(DecoBlocks.PACKED_GRASS))
                .unlockedBy(getHasName(DecoBlocks.PACKED_GRASS),has(DecoBlocks.PACKED_GRASS))
                .save(output,getSimpleRecipeName(DecoBlocks.GRASS_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRASS_SLAB, DecoBlocks.PACKED_GRASS);

        stairBuilder(DecoBlocks.PODZOL_STAIRS, Ingredient.of(DecoBlocks.PACKED_PODZOL))
                .unlockedBy(getHasName(DecoBlocks.PACKED_PODZOL),has(DecoBlocks.PACKED_PODZOL))
                .save(output,getSimpleRecipeName(DecoBlocks.PODZOL_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PODZOL_SLAB, DecoBlocks.PACKED_PODZOL);

        stairBuilder(DecoBlocks.MYCELIUM_STAIRS, Ingredient.of(DecoBlocks.PACKED_MYCELIUM))
                .unlockedBy(getHasName(DecoBlocks.PACKED_MYCELIUM),has(DecoBlocks.PACKED_MYCELIUM))
                .save(output,getSimpleRecipeName(DecoBlocks.MYCELIUM_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MYCELIUM_SLAB, DecoBlocks.PACKED_MYCELIUM);

        stairBuilder(DecoBlocks.CRIMSON_NYLIUM_STAIRS, Ingredient.of(DecoBlocks.PACKED_CRIMSON_NYLIUM))
                .unlockedBy(getHasName(DecoBlocks.PACKED_CRIMSON_NYLIUM),has(DecoBlocks.PACKED_CRIMSON_NYLIUM))
                .save(output,getSimpleRecipeName(DecoBlocks.CRIMSON_NYLIUM_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRIMSON_NYLIUM_SLAB, DecoBlocks.PACKED_CRIMSON_NYLIUM);

        stairBuilder(DecoBlocks.WARPED_NYLIUM_STAIRS, Ingredient.of(DecoBlocks.PACKED_WARPED_NYLIUM))
                .unlockedBy(getHasName(DecoBlocks.PACKED_WARPED_NYLIUM),has(DecoBlocks.PACKED_WARPED_NYLIUM))
                .save(output,getSimpleRecipeName(DecoBlocks.WARPED_NYLIUM_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_NYLIUM_SLAB, DecoBlocks.PACKED_WARPED_NYLIUM);

        stairBuilder(DecoBlocks.MOSS_STAIRS, Ingredient.of(Items.MOSS_BLOCK))
                .unlockedBy(getHasName(Items.MOSS_BLOCK),has(Items.MOSS_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSS_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSS_SLAB, Items.MOSS_BLOCK);

        stairBuilder(DecoBlocks.DIRT_STAIRS, Ingredient.of(Items.DIRT))
                .unlockedBy(getHasName(Items.DIRT),has(Items.DIRT))
                .save(output,getSimpleRecipeName(DecoBlocks.DIRT_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIRT_SLAB, Items.DIRT);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.DIRT_WALL, Items.DIRT);

        stairBuilder(DecoBlocks.COARSE_DIRT_STAIRS, Ingredient.of(Items.COARSE_DIRT))
                .unlockedBy(getHasName(Items.COARSE_DIRT),has(Items.COARSE_DIRT))
                .save(output,getSimpleRecipeName(DecoBlocks.COARSE_DIRT_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COARSE_DIRT_SLAB, Items.COARSE_DIRT);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.COARSE_DIRT_WALL, Items.COARSE_DIRT);

        stairBuilder(DecoBlocks.ROOTED_DIRT_STAIRS, Ingredient.of(Items.ROOTED_DIRT))
                .unlockedBy(getHasName(Items.ROOTED_DIRT),has(Items.ROOTED_DIRT))
                .save(output,getSimpleRecipeName(DecoBlocks.ROOTED_DIRT_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ROOTED_DIRT_SLAB, Items.ROOTED_DIRT);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.ROOTED_DIRT_WALL, Items.ROOTED_DIRT);

        stairBuilder(DecoBlocks.MUD_STAIRS, Ingredient.of(Items.MUD))
                .unlockedBy(getHasName(Items.MUD),has(Items.MUD))
                .save(output,getSimpleRecipeName(DecoBlocks.MUD_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUD_SLAB, Items.MUD);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.MUD_WALL, Items.MUD);

        stairBuilder(DecoBlocks.CLAY_STAIRS, Ingredient.of(Items.CLAY))
                .unlockedBy(getHasName(Items.CLAY),has(Items.CLAY))
                .save(output,getSimpleRecipeName(DecoBlocks.CLAY_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLAY_SLAB, Items.CLAY);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CLAY_WALL, Items.CLAY);

        stairBuilder(DecoBlocks.BONE_STAIRS, Ingredient.of(Items.BONE_BLOCK))
                .unlockedBy(getHasName(Items.BONE_BLOCK),has(Items.BONE_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.BONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_STAIRS, Items.BONE_BLOCK);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_SLAB, Items.BONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_SLAB, Items.BONE_BLOCK,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.BONE_WALL, Items.BONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_WALL, Items.BONE_BLOCK);

        shaped(RecipeCategory.BUILDING_BLOCKS, Items.ROOTED_DIRT,2)
                .pattern("#M")
                .pattern("M#")
                .define('#', Items.DIRT)
                .define('M', Items.HANGING_ROOTS)
                .unlockedBy(getHasName(Items.DIRT),
                        has(Items.DIRT))
                .save(output,getSimpleRecipeName(Items.ROOTED_DIRT)+ "_recipe_create");

        stairBuilder(DecoBlocks.CLOUD_STAIRS, Ingredient.of(DecoBlocks.SOLID_CLOUD))
                .unlockedBy(getHasName(DecoBlocks.SOLID_CLOUD),has(DecoBlocks.SOLID_CLOUD))
                .save(output,getSimpleRecipeName(DecoBlocks.CLOUD_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLOUD_SLAB, DecoBlocks.SOLID_CLOUD);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_WALL, DecoBlocks.SOLID_CLOUD);

        stairBuilder(DecoBlocks.CLOUD_BRICK_STAIRS, Ingredient.of(DecoBlocks.CLOUD_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CLOUD_BRICKS),has(DecoBlocks.CLOUD_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CLOUD_BRICK_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLOUD_BRICK_SLAB, DecoBlocks.CLOUD_BRICKS);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BRICK_WALL, DecoBlocks.CLOUD_BRICKS);

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_CLOUD_BRICKS, DecoBlocks.CLOUD_BRICK_SLAB);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SOLID_CLOUD)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.CLOUD_BLOCK)
                .unlockedBy(getHasName(DecoBlocks.CLOUD_BLOCK),
                        has(DecoBlocks.CLOUD_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.SOLID_CLOUD)+ "_recipe_create");

        polished( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLOUD_BRICKS, DecoBlocks.SOLID_CLOUD);

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.IRON_LADDER,3)
                .define('#', Items.IRON_NUGGET)
                .define('I', Items.IRON_INGOT)
                .pattern("# #")
                .pattern("#I#")
                .pattern("# #")
                .group("metal_ladder")
                .unlockedBy(getHasName(Items.IRON_NUGGET),
                        has(Items.IRON_NUGGET))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_LADDER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.GOLDEN_LADDER,3)
                .define('#', Items.GOLD_NUGGET)
                .define('I', Items.GOLD_INGOT)
                .pattern("# #")
                .pattern("#I#")
                .pattern("# #")
                .group("metal_ladder")
                .unlockedBy(getHasName(Items.GOLD_NUGGET),
                        has(Items.GOLD_NUGGET))
                .save(output,getSimpleRecipeName(DecoBlocks.GOLDEN_LADDER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.COPPER_LADDER,3)
                .define('#', Items.COPPER_NUGGET)
                .define('I', Items.COPPER_INGOT)
                .pattern("# #")
                .pattern("#I#")
                .pattern("# #")
                .group("metal_ladder")
                .unlockedBy(getHasName(Items.COPPER_NUGGET),
                        has(Items.COPPER_NUGGET))
                .save(output,getSimpleRecipeName(DecoBlocks.COPPER_LADDER)+ "_recipe_create");

        shapeless(RecipeCategory.MISC, Items.WHITE_DYE)
                .requires(DecoBlocks.ALPINE_POPPY)
                .group("white_dye")
                .unlockedBy(getHasName(DecoBlocks.ALPINE_POPPY),
                        has(DecoBlocks.ALPINE_POPPY))
                .save(output,getSimpleRecipeName(Items.WHITE_DYE)+"_from_alpine_poppy");
        shapeless(RecipeCategory.MISC, Items.GRAY_DYE)
                .requires(DecoBlocks.DEAD_EYE_DAISY)
                .group("gray_dye")
                .unlockedBy(getHasName(DecoBlocks.DEAD_EYE_DAISY),
                        has(DecoBlocks.DEAD_EYE_DAISY))
                .save(output,getSimpleRecipeName(Items.GRAY_DYE)+"_from_dead_eye_daisy");
        shapeless(RecipeCategory.MISC, Items.ORANGE_DYE)
                .requires(DecoBlocks.POPPED_BLUET)
                .group("orange_dye")
                .unlockedBy(getHasName(DecoBlocks.POPPED_BLUET),
                        has(DecoBlocks.POPPED_BLUET))
                .save(output,getSimpleRecipeName(Items.ORANGE_DYE)+"_from_popped_bluet");

        stairBuilder(DecoBlocks.WHITE_WOOL_STAIRS, Ingredient.of(Items.WHITE_WOOL))
                .unlockedBy(getHasName(Items.WHITE_WOOL),has(Items.WHITE_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.WHITE_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_WOOL_SLAB, Items.WHITE_WOOL);

        stairBuilder(DecoBlocks.BLACK_WOOL_STAIRS, Ingredient.of(Items.BLACK_WOOL))
                .unlockedBy(getHasName(Items.BLACK_WOOL),has(Items.BLACK_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.BLACK_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_WOOL_SLAB, Items.BLACK_WOOL);

        stairBuilder(DecoBlocks.GRAY_WOOL_STAIRS, Ingredient.of(Items.GRAY_WOOL))
                .unlockedBy(getHasName(Items.GRAY_WOOL),has(Items.GRAY_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.GRAY_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRAY_WOOL_SLAB, Items.GRAY_WOOL);

        stairBuilder(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS, Ingredient.of(Items.LIGHT_GRAY_WOOL))
                .unlockedBy(getHasName(Items.LIGHT_GRAY_WOOL),has(Items.LIGHT_GRAY_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_GRAY_WOOL_SLAB, Items.LIGHT_GRAY_WOOL);

        stairBuilder(DecoBlocks.BROWN_WOOL_STAIRS, Ingredient.of(Items.BROWN_WOOL))
                .unlockedBy(getHasName(Items.BROWN_WOOL),has(Items.BROWN_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.BROWN_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BROWN_WOOL_SLAB, Items.BROWN_WOOL);

        stairBuilder(DecoBlocks.RED_WOOL_STAIRS, Ingredient.of(Items.RED_WOOL))
                .unlockedBy(getHasName(Items.RED_WOOL),has(Items.RED_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.RED_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RED_WOOL_SLAB, Items.RED_WOOL);

        stairBuilder(DecoBlocks.ORANGE_WOOL_STAIRS, Ingredient.of(Items.ORANGE_WOOL))
                .unlockedBy(getHasName(Items.ORANGE_WOOL),has(Items.ORANGE_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.ORANGE_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ORANGE_WOOL_SLAB, Items.ORANGE_WOOL);

        stairBuilder(DecoBlocks.YELLOW_WOOL_STAIRS, Ingredient.of(Items.YELLOW_WOOL))
                .unlockedBy(getHasName(Items.YELLOW_WOOL),has(Items.YELLOW_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.YELLOW_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.YELLOW_WOOL_SLAB, Items.YELLOW_WOOL);

        stairBuilder(DecoBlocks.LIME_WOOL_STAIRS, Ingredient.of(Items.LIME_WOOL))
                .unlockedBy(getHasName(Items.LIME_WOOL),has(Items.LIME_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.LIME_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIME_WOOL_SLAB, Items.LIME_WOOL);

        stairBuilder(DecoBlocks.GREEN_WOOL_STAIRS, Ingredient.of(Items.GREEN_WOOL))
                .unlockedBy(getHasName(Items.GREEN_WOOL),has(Items.GREEN_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.GREEN_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GREEN_WOOL_SLAB, Items.GREEN_WOOL);

        stairBuilder(DecoBlocks.CYAN_WOOL_STAIRS, Ingredient.of(Items.CYAN_WOOL))
                .unlockedBy(getHasName(Items.CYAN_WOOL),has(Items.CYAN_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.CYAN_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CYAN_WOOL_SLAB, Items.CYAN_WOOL);

        stairBuilder(DecoBlocks.BLUE_WOOL_STAIRS, Ingredient.of(Items.BLUE_WOOL))
                .unlockedBy(getHasName(Items.BLUE_WOOL),has(Items.BLUE_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.BLUE_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_WOOL_SLAB, Items.BLUE_WOOL);

        stairBuilder(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS, Ingredient.of(Items.LIGHT_BLUE_WOOL))
                .unlockedBy(getHasName(Items.LIGHT_BLUE_WOOL),has(Items.LIGHT_BLUE_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_BLUE_WOOL_SLAB, Items.LIGHT_BLUE_WOOL);

        stairBuilder(DecoBlocks.PURPLE_WOOL_STAIRS, Ingredient.of(Items.PURPLE_WOOL))
                .unlockedBy(getHasName(Items.PURPLE_WOOL),has(Items.PURPLE_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.PURPLE_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPLE_WOOL_SLAB, Items.PURPLE_WOOL);

        stairBuilder(DecoBlocks.MAGENTA_WOOL_STAIRS, Ingredient.of(Items.MAGENTA_WOOL))
                .unlockedBy(getHasName(Items.MAGENTA_WOOL),has(Items.MAGENTA_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.MAGENTA_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MAGENTA_WOOL_SLAB, Items.MAGENTA_WOOL);

        stairBuilder(DecoBlocks.PINK_WOOL_STAIRS, Ingredient.of(Items.PINK_WOOL))
                .unlockedBy(getHasName(Items.PINK_WOOL),has(Items.PINK_WOOL))
                .save(output,getSimpleRecipeName(DecoBlocks.PINK_WOOL_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PINK_WOOL_SLAB, Items.PINK_WOOL);

        stairBuilder(DecoBlocks.CRACKED_STONE_BRICK_STAIRS, Ingredient.of(Items.CRACKED_STONE_BRICKS))
                .unlockedBy(getHasName(Items.CRACKED_STONE_BRICKS),has(Items.CRACKED_STONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_STONE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_STAIRS, Items.CRACKED_STONE_BRICKS);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_SLAB, Items.CRACKED_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_SLAB, Items.CRACKED_STONE_BRICKS,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_STONE_BRICK_WALL, Items.CRACKED_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_WALL, Items.CRACKED_STONE_BRICKS);

        stairBuilder(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Ingredient.of(Items.CRACKED_DEEPSLATE_BRICKS))
                .unlockedBy(getHasName(Items.CRACKED_DEEPSLATE_BRICKS),has(Items.CRACKED_DEEPSLATE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Items.CRACKED_DEEPSLATE_BRICKS);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Items.CRACKED_DEEPSLATE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Items.CRACKED_DEEPSLATE_BRICKS,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Items.CRACKED_DEEPSLATE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Items.CRACKED_DEEPSLATE_BRICKS);

        stairBuilder(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Ingredient.of(Items.CRACKED_DEEPSLATE_TILES))
                .unlockedBy(getHasName(Items.CRACKED_DEEPSLATE_TILES),has(Items.CRACKED_DEEPSLATE_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Items.CRACKED_DEEPSLATE_TILES);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Items.CRACKED_DEEPSLATE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Items.CRACKED_DEEPSLATE_TILES,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL, Items.CRACKED_DEEPSLATE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL, Items.CRACKED_DEEPSLATE_TILES);

        stairBuilder(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Ingredient.of(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS),has(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        stairBuilder(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS, Ingredient.of(Items.CRACKED_NETHER_BRICKS))
                .unlockedBy(getHasName(Items.CRACKED_NETHER_BRICKS),has(Items.CRACKED_NETHER_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_STAIRS, Items.CRACKED_NETHER_BRICKS);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_SLAB, Items.CRACKED_NETHER_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_SLAB, Items.CRACKED_NETHER_BRICKS,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_NETHER_BRICK_WALL, Items.CRACKED_NETHER_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_WALL, Items.CRACKED_NETHER_BRICKS);

        stairBuilder(DecoBlocks.CRACKED_STONE_TILE_STAIRS, Ingredient.of(DecoBlocks.CRACKED_STONE_TILES))
                .unlockedBy(getHasName(DecoBlocks.CRACKED_STONE_TILES),has(DecoBlocks.CRACKED_STONE_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_STONE_TILE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_STAIRS, DecoBlocks.CRACKED_STONE_TILES);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_SLAB, DecoBlocks.CRACKED_STONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_SLAB, DecoBlocks.CRACKED_STONE_TILES,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_STONE_TILE_WALL, DecoBlocks.CRACKED_STONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_WALL, DecoBlocks.CRACKED_STONE_TILES);

        stairBuilder(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS, Ingredient.of(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES))
                .unlockedBy(getHasName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES),has(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);

        stairBuilder(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.CRACKED_END_STONE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CRACKED_END_STONE_BRICKS),has(DecoBlocks.CRACKED_END_STONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS, DecoBlocks.CRACKED_END_STONE_BRICKS);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_SLAB, DecoBlocks.CRACKED_END_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_SLAB, DecoBlocks.CRACKED_END_STONE_BRICKS,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_END_STONE_BRICK_WALL, DecoBlocks.CRACKED_END_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_WALL, DecoBlocks.CRACKED_END_STONE_BRICKS);

        stairBuilder(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS, Ingredient.of(DecoBlocks.CRACKED_END_STONE_TILES))
                .unlockedBy(getHasName(DecoBlocks.CRACKED_END_STONE_TILES),has(DecoBlocks.CRACKED_END_STONE_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_STAIRS, DecoBlocks.CRACKED_END_STONE_TILES);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_SLAB, DecoBlocks.CRACKED_END_STONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_SLAB, DecoBlocks.CRACKED_END_STONE_TILES,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_END_STONE_TILE_WALL, DecoBlocks.CRACKED_END_STONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_WALL, DecoBlocks.CRACKED_END_STONE_TILES);

        stairBuilder(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, Ingredient.of(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CRACKED_RED_NETHER_BRICKS),has(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_RED_NETHER_BRICKS,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL, DecoBlocks.CRACKED_RED_NETHER_BRICKS);

        stairBuilder(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, Ingredient.of(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS),has(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.STONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_STONE_BRICK_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(Items.STONE_BRICK_STAIRS), has(Items.STONE_BRICK_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_STONE_BRICK_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.STONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_STONE_BRICK_SLAB,
                        0.1f, 200).unlockedBy(getHasName(Items.STONE_BRICK_SLAB), has(Items.STONE_BRICK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_STONE_BRICK_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.STONE_BRICK_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_STONE_BRICK_WALL,
                        0.1f, 200).unlockedBy(getHasName(Items.STONE_BRICK_WALL), has(Items.STONE_BRICK_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_STONE_BRICK_WALL)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.POLISHED_BLACKSTONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(Items.POLISHED_BLACKSTONE_BRICK_STAIRS), has(Items.POLISHED_BLACKSTONE_BRICK_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.POLISHED_BLACKSTONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB,
                        0.1f, 200).unlockedBy(getHasName(Items.POLISHED_BLACKSTONE_BRICK_SLAB), has(Items.POLISHED_BLACKSTONE_BRICK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.POLISHED_BLACKSTONE_BRICK_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL,
                        0.1f, 200).unlockedBy(getHasName(Items.POLISHED_BLACKSTONE_BRICK_WALL), has(Items.POLISHED_BLACKSTONE_BRICK_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.DEEPSLATE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(Items.DEEPSLATE_BRICK_STAIRS), has(Items.DEEPSLATE_BRICK_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.DEEPSLATE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB,
                        0.1f, 200).unlockedBy(getHasName(Items.DEEPSLATE_BRICK_SLAB), has(Items.DEEPSLATE_BRICK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.DEEPSLATE_BRICK_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL,
                        0.1f, 200).unlockedBy(getHasName(Items.DEEPSLATE_BRICK_WALL), has(Items.DEEPSLATE_BRICK_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.NETHER_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_NETHER_BRICK_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(Items.NETHER_BRICK_STAIRS), has(Items.NETHER_BRICK_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_NETHER_BRICK_SLAB,
                        0.1f, 200).unlockedBy(getHasName(Items.NETHER_BRICK_SLAB), has(Items.NETHER_BRICK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.NETHER_BRICK_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_NETHER_BRICK_WALL,
                        0.1f, 200).unlockedBy(getHasName(Items.NETHER_BRICK_WALL), has(Items.NETHER_BRICK_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_WALL)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.NETHER_BRICK_FENCE), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_NETHER_BRICK_FENCE,
                        0.1f, 200).unlockedBy(getHasName(Items.NETHER_BRICK_FENCE), has(Items.NETHER_BRICK_FENCE))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_FENCE)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.NETHER_BRICK_FENCE_GATE), RecipeCategory.REDSTONE, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.NETHER_BRICK_FENCE_GATE), has(DecoBlocks.NETHER_BRICK_FENCE_GATE))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RED_NETHER_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(Items.RED_NETHER_BRICK_STAIRS), has(Items.RED_NETHER_BRICK_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RED_NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB,
                        0.1f, 200).unlockedBy(getHasName(Items.RED_NETHER_BRICK_SLAB), has(Items.RED_NETHER_BRICK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RED_NETHER_BRICK_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL,
                        0.1f, 200).unlockedBy(getHasName(Items.RED_NETHER_BRICK_WALL), has(Items.RED_NETHER_BRICK_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RED_NETHER_BRICK_FENCE), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.RED_NETHER_BRICK_FENCE), has(DecoBlocks.RED_NETHER_BRICK_FENCE))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE), RecipeCategory.REDSTONE, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE), has(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.BLUE_NETHER_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.BLUE_NETHER_BRICK_STAIRS), has(DecoBlocks.BLUE_NETHER_BRICK_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.BLUE_NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.BLUE_NETHER_BRICK_SLAB), has(DecoBlocks.BLUE_NETHER_BRICK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.BLUE_NETHER_BRICK_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.BLUE_NETHER_BRICK_WALL), has(DecoBlocks.BLUE_NETHER_BRICK_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.BLUE_NETHER_BRICK_FENCE), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.BLUE_NETHER_BRICK_FENCE), has(DecoBlocks.BLUE_NETHER_BRICK_FENCE))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE), RecipeCategory.REDSTONE, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE), has(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.DEEPSLATE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(Items.DEEPSLATE_TILE_STAIRS), has(Items.DEEPSLATE_TILE_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.DEEPSLATE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB,
                        0.1f, 200).unlockedBy(getHasName(Items.DEEPSLATE_TILE_SLAB), has(Items.DEEPSLATE_TILE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.DEEPSLATE_TILE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL,
                        0.1f, 200).unlockedBy(getHasName(Items.DEEPSLATE_TILE_WALL), has(Items.DEEPSLATE_TILE_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.END_STONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(Items.END_STONE_BRICK_STAIRS), has(Items.END_STONE_BRICK_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.END_STONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_END_STONE_BRICK_SLAB,
                        0.1f, 200).unlockedBy(getHasName(Items.END_STONE_BRICK_SLAB), has(Items.END_STONE_BRICK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_END_STONE_BRICK_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.END_STONE_BRICK_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_END_STONE_BRICK_WALL,
                        0.1f, 200).unlockedBy(getHasName(Items.END_STONE_BRICK_WALL), has(Items.END_STONE_BRICK_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_END_STONE_BRICK_WALL)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.STONE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_STONE_TILE_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.STONE_TILE_STAIRS), has(DecoBlocks.STONE_TILE_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_STONE_TILE_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.STONE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_STONE_TILE_SLAB,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.STONE_TILE_SLAB), has(DecoBlocks.STONE_TILE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_STONE_TILE_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.STONE_TILE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_STONE_TILE_WALL,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.STONE_TILE_WALL), has(DecoBlocks.STONE_TILE_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_STONE_TILE_WALL)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS), has(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB), has(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL), has(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL)+"_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.END_STONE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_END_STONE_TILE_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.END_STONE_TILE_STAIRS), has(DecoBlocks.END_STONE_TILE_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.END_STONE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_END_STONE_TILE_SLAB,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.END_STONE_TILE_SLAB), has(DecoBlocks.END_STONE_TILE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_END_STONE_TILE_SLAB)+"_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.END_STONE_TILE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_END_STONE_TILE_WALL,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.END_STONE_TILE_WALL), has(DecoBlocks.END_STONE_TILE_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_END_STONE_TILE_WALL)+"_from_smelting");

        shaped(RecipeCategory.DECORATIONS, Items.BELL)
                .define('#', Items.GOLD_NUGGET)
                .define('I', Items.GOLD_INGOT)
                .define('/', Items.STICK)
                .define('S', ItemTags.STONE_CRAFTING_MATERIALS)
                .pattern("S/S")
                .pattern("SIS")
                .pattern("I#I")
                .unlockedBy(getHasName(Items.GOLD_INGOT),
                        has(Items.GOLD_INGOT))
                .save(output,getSimpleRecipeName(Items.BELL)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.CRACKED_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .define('/', Items.NETHER_BRICK)
                .define('#', Items.CRACKED_NETHER_BRICKS)
                .unlockedBy(getHasName(Items.CRACKED_NETHER_BRICKS),
                        has(Items.CRACKED_NETHER_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_FENCE)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .define('/', Items.NETHER_BRICK)
                .define('#', DecoBlocks.CRACKED_RED_NETHER_BRICKS)
                .unlockedBy(getHasName(DecoBlocks.CRACKED_RED_NETHER_BRICKS),
                        has(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .define('/', Items.NETHER_BRICK)
                .define('#', DecoBlocks.CRACKED_BLUE_NETHER_BRICKS)
                .unlockedBy(getHasName(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS),
                        has(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .define('/', Items.NETHER_BRICK)
                .define('#', Items.CRACKED_NETHER_BRICKS)
                .unlockedBy(getHasName(Items.CRACKED_NETHER_BRICKS),
                        has(Items.CRACKED_NETHER_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .define('/', Items.NETHER_BRICK)
                .define('#', DecoBlocks.CRACKED_RED_NETHER_BRICKS)
                .unlockedBy(getHasName(DecoBlocks.CRACKED_RED_NETHER_BRICKS),
                        has(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .define('/', Items.NETHER_BRICK)
                .define('#', DecoBlocks.CRACKED_BLUE_NETHER_BRICKS)
                .unlockedBy(getHasName(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS),
                        has(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GOLD_GRATE,4)
                .pattern(" X ")
                .pattern("X#X")
                .pattern(" X ")
                .define('#', Items.GOLD_BLOCK)
                .define('X', DecoBlocks.LIGHT_GOLD_BARS)
                .unlockedBy(getHasName(Items.GOLD_BLOCK),
                        has(Items.GOLD_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.GOLD_GRATE)+ "_recipe_create");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GOLD_GRATE, Items.GOLD_BLOCK,4);

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_GOLD, DecoBlocks.CUT_GOLD_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GOLD, Items.GOLD_BLOCK,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GOLD, DecoBlocks.CUT_GOLD);

        shaped(RecipeCategory.REDSTONE, DecoBlocks.TUFF_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', Items.TUFF)
                .group("lever")
                .unlockedBy(getHasName(Items.TUFF),
                        has(Items.TUFF))
                .save(output,getSimpleRecipeName(DecoBlocks.TUFF_LEVER)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_TUFF_LEVER)
                .pattern("/")
                .pattern("#")
                .define('/', Items.STICK)
                .define('#', Items.POLISHED_TUFF)
                .group("lever")
                .unlockedBy(getHasName(Items.POLISHED_TUFF),
                        has(Items.POLISHED_TUFF))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_TUFF_LEVER)+ "_recipe_create");

        chiseled( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE_BRICKS, Items.END_STONE_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE_BRICKS, Items.END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE_BRICKS, DecoBlocks.POLISHED_END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE_BRICKS, Items.END_STONE_BRICKS);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoItems.EARTH_SPHERE)
                .pattern(" # ")
                .pattern("#D#")
                .pattern(" # ")
                .define('#', Items.MUD)
                .define('D', Items.COARSE_DIRT)
                .unlockedBy(getHasName(Items.COARSE_DIRT),
                        has(Items.COARSE_DIRT))
                .save(output,getSimpleRecipeName(DecoItems.EARTH_SPHERE)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WIND_BLOCK)
                .pattern("#I")
                .pattern("I#")
                .define('#', Items.TUFF)
                .define('I', Items.WIND_CHARGE)
                .unlockedBy(getHasName(Items.WIND_CHARGE),
                        has(Items.WIND_CHARGE))
                .save(output,getSimpleRecipeName(DecoBlocks.WIND_BLOCK)+ "_recipe_create");

        stairBuilder(DecoBlocks.WIND_STAIRS, Ingredient.of(DecoBlocks.WIND_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.WIND_BLOCK),has(DecoBlocks.WIND_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.WIND_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_STAIRS, DecoBlocks.WIND_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_SLAB, DecoBlocks.WIND_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_SLAB, DecoBlocks.WIND_BLOCK);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.WIND_WALL, DecoBlocks.WIND_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_WALL, DecoBlocks.WIND_BLOCK);

        polished( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICKS, DecoBlocks.WIND_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICKS, DecoBlocks.WIND_BLOCK);

        chiseled( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_WIND_BLOCK, DecoBlocks.WIND_SLAB);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_WIND_BLOCK, DecoBlocks.WIND_BLOCK);

        stairBuilder(DecoBlocks.WIND_BRICK_STAIRS, Ingredient.of(DecoBlocks.WIND_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.WIND_BRICKS),has(DecoBlocks.WIND_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.WIND_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_STAIRS, DecoBlocks.WIND_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_STAIRS, DecoBlocks.WIND_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_SLAB, DecoBlocks.WIND_BRICKS);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_SLAB, DecoBlocks.WIND_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_SLAB, DecoBlocks.WIND_BRICKS);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.WIND_BRICK_WALL, DecoBlocks.WIND_BRICKS);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_WALL, DecoBlocks.WIND_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_WALL, DecoBlocks.WIND_BRICKS);

        chiseled( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_WIND_BRICKS, DecoBlocks.WIND_BRICK_SLAB);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_WIND_BRICKS, DecoBlocks.WIND_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_WIND_BRICKS, DecoBlocks.WIND_BRICKS);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EARTH_BLOCK)
                .pattern("#I")
                .pattern("I#")
                .define('#', Items.COBBLED_DEEPSLATE)
                .define('I', DecoItems.EARTH_SPHERE)
                .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                        has(DecoItems.EARTH_SPHERE))
                .save(output,getSimpleRecipeName(DecoBlocks.EARTH_BLOCK)+ "_recipe_create");

        stairBuilder(DecoBlocks.EARTH_STAIRS, Ingredient.of(DecoBlocks.EARTH_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.EARTH_BLOCK),has(DecoBlocks.EARTH_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.EARTH_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_STAIRS, DecoBlocks.EARTH_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_SLAB, DecoBlocks.EARTH_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_SLAB, DecoBlocks.EARTH_BLOCK);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.EARTH_WALL, DecoBlocks.EARTH_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_WALL, DecoBlocks.EARTH_BLOCK);

        polished( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICKS, DecoBlocks.EARTH_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICKS, DecoBlocks.EARTH_BLOCK);

        chiseled( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_EARTH_BLOCK, DecoBlocks.EARTH_SLAB);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_EARTH_BLOCK, DecoBlocks.EARTH_BLOCK);

        stairBuilder(DecoBlocks.EARTH_BRICK_STAIRS, Ingredient.of(DecoBlocks.EARTH_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.EARTH_BRICKS),has(DecoBlocks.EARTH_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.EARTH_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_STAIRS, DecoBlocks.EARTH_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_STAIRS, DecoBlocks.EARTH_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_SLAB, DecoBlocks.EARTH_BRICKS);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_SLAB, DecoBlocks.EARTH_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_SLAB, DecoBlocks.EARTH_BRICKS);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.EARTH_BRICK_WALL, DecoBlocks.EARTH_BRICKS);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_WALL, DecoBlocks.EARTH_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_WALL, DecoBlocks.EARTH_BRICKS);

        chiseled( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_EARTH_BRICKS, DecoBlocks.EARTH_BRICK_SLAB);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_EARTH_BRICKS, DecoBlocks.EARTH_BLOCK);
        stonecutterResultFromBase( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_EARTH_BRICKS, DecoBlocks.EARTH_BRICKS);

        shaped(RecipeCategory.BUILDING_BLOCKS, Items.GRASS_BLOCK,3)
                .pattern("G0G")
                .pattern("###")
                .define('#', Items.DIRT)
                .define('0', DecoItems.EARTH_SPHERE)
                .define('G', Items.SHORT_GRASS)
                .group("dirt_like")
                .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                        has(DecoItems.EARTH_SPHERE))
                .save(output,getSimpleRecipeName(Items.GRASS_BLOCK)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, Items.FARMLAND,3)
                .pattern("S0S")
                .pattern("###")
                .define('#', Items.DIRT)
                .define('0', DecoItems.EARTH_SPHERE)
                .define('S', DecoTags.Items.SEEDS)
                .group("dirt_like")
                .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                        has(DecoItems.EARTH_SPHERE))
                .save(output,getSimpleRecipeName(Items.FARMLAND)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, Items.DIRT_PATH,3)
                .pattern(" 0 ")
                .pattern("###")
                .define('#', Items.DIRT)
                .define('0', DecoItems.EARTH_SPHERE)
                .group("dirt_like")
                .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                        has(DecoItems.EARTH_SPHERE))
                .save(output,getSimpleRecipeName(Items.DIRT_PATH)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, Items.MYCELIUM,3)
                .pattern("M0M")
                .pattern("###")
                .define('#', Items.COARSE_DIRT)
                .define('0', DecoItems.EARTH_SPHERE)
                .define('M', DecoTags.Items.MUSHROOMS)
                .group("dirt_like")
                .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                        has(DecoItems.EARTH_SPHERE))
                .save(output,getSimpleRecipeName(Items.MYCELIUM)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, Items.PODZOL,3)
                .pattern("B0B")
                .pattern("###")
                .define('#', Items.COARSE_DIRT)
                .define('0', DecoItems.EARTH_SPHERE)
                .define('B', Items.LEAF_LITTER)
                .group("dirt_like")
                .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                        has(DecoItems.EARTH_SPHERE))
                .save(output,getSimpleRecipeName(Items.PODZOL)+ "_recipe_create");

        stairBuilder(DecoBlocks.CRACKED_TUFF_BRICK_STAIRS, Ingredient.of(DecoBlocks.CRACKED_TUFF_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CRACKED_TUFF_BRICKS),has(DecoBlocks.CRACKED_TUFF_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_TUFF_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_BRICK_STAIRS, DecoBlocks.CRACKED_TUFF_BRICKS);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_BRICK_SLAB, DecoBlocks.CRACKED_TUFF_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_BRICK_SLAB, DecoBlocks.CRACKED_TUFF_BRICKS,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_TUFF_BRICK_WALL, DecoBlocks.CRACKED_TUFF_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_BRICK_WALL, DecoBlocks.CRACKED_TUFF_BRICKS);

        stairBuilder(DecoBlocks.CRACKED_TUFF_TILE_STAIRS, Ingredient.of(DecoBlocks.CRACKED_TUFF_TILES))
                .unlockedBy(getHasName(DecoBlocks.CRACKED_TUFF_TILES),has(DecoBlocks.CRACKED_TUFF_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_TUFF_TILE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_TILE_STAIRS, DecoBlocks.CRACKED_TUFF_TILES);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_TILE_SLAB, DecoBlocks.CRACKED_TUFF_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_TILE_SLAB, DecoBlocks.CRACKED_TUFF_TILES,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_TUFF_TILE_WALL, DecoBlocks.CRACKED_TUFF_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_TILE_WALL, DecoBlocks.CRACKED_TUFF_TILES);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.TUFF_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_TUFF_BRICK_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(Items.TUFF_BRICK_STAIRS), has(Items.TUFF_BRICK_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_TUFF_BRICK_STAIRS)+ "_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.TUFF_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_TUFF_BRICK_SLAB,
                        0.1f, 200).unlockedBy(getHasName(Items.TUFF_BRICK_SLAB), has(Items.TUFF_BRICK_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_TUFF_BRICK_SLAB)+ "_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.TUFF_BRICK_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_TUFF_BRICK_WALL,
                        0.1f, 200).unlockedBy(getHasName(Items.TUFF_BRICK_WALL), has(Items.TUFF_BRICK_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_TUFF_BRICK_WALL)+ "_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.TUFF_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_TUFF_TILE_STAIRS,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.TUFF_TILE_STAIRS), has(DecoBlocks.TUFF_TILE_STAIRS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_TUFF_TILE_STAIRS)+ "_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.TUFF_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_TUFF_TILE_SLAB,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.TUFF_TILE_SLAB), has(DecoBlocks.TUFF_TILE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_TUFF_TILE_SLAB)+ "_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.TUFF_TILE_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.CRACKED_TUFF_TILE_WALL,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.TUFF_TILE_WALL), has(DecoBlocks.TUFF_TILE_WALL))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_TUFF_TILE_WALL)+ "_from_smelting");

                stairBuilder(DecoBlocks.PALE_OAK_WOOD_STAIRS, Ingredient.of(Items.PALE_OAK_WOOD))
                        .unlockedBy(getHasName(Items.PALE_OAK_WOOD),has(Items.PALE_OAK_WOOD))
                        .save(output, getSimpleRecipeName(DecoBlocks.PALE_OAK_WOOD_STAIRS) + "_recipe_create");

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PALE_OAK_WOOD_SLAB, Items.PALE_OAK_WOOD);

                wall(RecipeCategory.DECORATIONS, DecoBlocks.PALE_OAK_WOOD_WALL, Items.PALE_OAK_WOOD);

                stairBuilder(DecoBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS, Ingredient.of(Items.STRIPPED_PALE_OAK_WOOD))
                        .unlockedBy(getHasName(Items.STRIPPED_PALE_OAK_WOOD),has(Items.STRIPPED_PALE_OAK_WOOD))
                        .save(output, getSimpleRecipeName(DecoBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS) + "_recipe_create");

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_PALE_OAK_WOOD_SLAB, Items.STRIPPED_PALE_OAK_WOOD);

                wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_PALE_OAK_WOOD_WALL, Items.STRIPPED_PALE_OAK_WOOD);

                offerNoteBlockVariantRecipe(output, DecoBlocks.PALE_OAK_NOTE_BLOCK, Items.PALE_OAK_PLANKS);

                shaped(RecipeCategory.REDSTONE, DecoBlocks.PALE_OAK_PALLET_DOOR,3)
                        .pattern("##")
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.PALE_OAK_SLAB)
                        .group("pallet_doors")
                        .unlockedBy(getHasName(Items.PALE_OAK_SLAB),
                                has(Items.PALE_OAK_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.PALE_OAK_PALLET_DOOR)+ "_recipe_create");
                shaped(RecipeCategory.REDSTONE, DecoBlocks.PALE_OAK_PALLET_TRAPDOOR,2)
                        .pattern("###")
                        .pattern("###")
                        .define('#', Items.PALE_OAK_SLAB)
                        .group("pallet_trapdoors")
                        .unlockedBy(getHasName(Items.PALE_OAK_SLAB),
                                has(Items.PALE_OAK_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.PALE_OAK_PALLET_TRAPDOOR)+ "_recipe_create");

                stairBuilder(DecoBlocks.PALE_OAK_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.PALE_OAK_BOOKSHELF))
                        .unlockedBy(getHasName(DecoBlocks.PALE_OAK_BOOKSHELF),has(DecoBlocks.PALE_OAK_BOOKSHELF))
                        .save(output, getSimpleRecipeName(DecoBlocks.PALE_OAK_BOOKSHELF_STAIRS) + "_recipe_create");

                slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PALE_OAK_BOOKSHELF_SLAB, DecoBlocks.PALE_OAK_BOOKSHELF);

                shaped(RecipeCategory.TRANSPORTATION, DecoItems.PALE_OAK_RAFT)
                        .pattern("# #")
                        .pattern("---")
                        .group("boat")
                        .define('#', Items.PALE_OAK_PLANKS)
                        .define('-', Items.PALE_OAK_SLAB)
                        .unlockedBy("in_water", insideOf(Blocks.WATER))
                        .save(output, getSimpleRecipeName(DecoItems.PALE_OAK_RAFT)+ "_recipe_create");
                chestBoat(DecoItems.PALE_OAK_CHEST_RAFT, DecoItems.PALE_OAK_RAFT);

                shaped(RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_NYLIUM,3)
                        .pattern("R0R")
                        .pattern("###")
                        .define('#', Items.NETHERRACK)
                        .define('0', DecoItems.EARTH_SPHERE)
                        .define('R', Items.CRIMSON_ROOTS)
                        .group("nyliums")
                        .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                                has(DecoItems.EARTH_SPHERE))
                        .save(output,getSimpleRecipeName(Items.CRIMSON_NYLIUM)+ "_recipe_create");

                shaped(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_NYLIUM,3)
                        .pattern("R0R")
                        .pattern("###")
                        .define('#', Items.NETHERRACK)
                        .define('0', DecoItems.EARTH_SPHERE)
                        .define('R', Items.WARPED_ROOTS)
                        .group("nyliums")
                        .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                                has(DecoItems.EARTH_SPHERE))
                        .save(output,getSimpleRecipeName(Items.WARPED_NYLIUM)+ "_recipe_create");

                shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_GRASS)
                        .pattern(" G ")
                        .pattern("G0G")
                        .pattern(" G ")
                        .define('0', DecoItems.EARTH_SPHERE)
                        .define('G', Items.SHORT_GRASS)
                        .group("packed_soil")
                        .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                                has(DecoItems.EARTH_SPHERE))
                        .save(output,getSimpleRecipeName(DecoBlocks.PACKED_GRASS)+ "_from_earth_sphere");

                shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_PODZOL)
                        .pattern(" B ")
                        .pattern("B0B")
                        .pattern(" B ")
                        .define('0', DecoItems.EARTH_SPHERE)
                        .define('B', Items.DEAD_BUSH)
                        .group("packed_soil")
                        .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                                has(DecoItems.EARTH_SPHERE))
                        .save(output,getSimpleRecipeName(DecoBlocks.PACKED_PODZOL)+ "_from_earth_sphere");

                shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_MYCELIUM)
                        .pattern(" M ")
                        .pattern("M0M")
                        .pattern(" M ")
                        .define('0', DecoItems.EARTH_SPHERE)
                        .define('M', DecoTags.Items.MUSHROOMS)
                        .group("packed_soil")
                        .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                                has(DecoItems.EARTH_SPHERE))
                        .save(output,getSimpleRecipeName(DecoBlocks.PACKED_MYCELIUM)+ "_from_earth_sphere");

                shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_CRIMSON_NYLIUM)
                        .pattern(" R ")
                        .pattern("R0R")
                        .pattern(" R ")
                        .define('0', Items.NETHERRACK)
                        .define('R', Items.CRIMSON_ROOTS)
                        .group("packed_nylium")
                        .unlockedBy(getHasName(Items.NETHERRACK),
                                has(Items.NETHERRACK))
                        .save(output,getSimpleRecipeName(DecoBlocks.PACKED_CRIMSON_NYLIUM)+ "_from_netherrack");

                shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_WARPED_NYLIUM)
                        .pattern(" R ")
                        .pattern("R0R")
                        .pattern(" R ")
                        .define('0', Items.NETHERRACK)
                        .define('R', Items.WARPED_ROOTS)
                        .group("packed_nylium")
                        .unlockedBy(getHasName(Items.NETHERRACK),
                                has(Items.NETHERRACK))
                        .save(output,getSimpleRecipeName(DecoBlocks.PACKED_WARPED_NYLIUM)+ "_from_netherrack");

                stairBuilder(DecoBlocks.PALE_MOSS_STAIRS, Ingredient.of(Items.PALE_MOSS_BLOCK))
                        .unlockedBy(getHasName(Items.PALE_MOSS_BLOCK),has(Items.PALE_MOSS_BLOCK))
                        .save(output,getSimpleRecipeName(DecoBlocks.PALE_MOSS_STAIRS)+ "_recipe_create");
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PALE_MOSS_SLAB, Items.PALE_MOSS_BLOCK);

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RESIN_BLOCK), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_RESIN,
                                0.1f, 200).unlockedBy(getHasName(Items.RESIN_BLOCK), has(Items.RESIN_BLOCK))
                        .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_RESIN)+ "_from_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RESIN_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_RESIN_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.RESIN_STAIRS), has(DecoBlocks.RESIN_STAIRS))
                        .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_RESIN_STAIRS)+ "_from_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RESIN_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_RESIN_SLAB,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.RESIN_SLAB), has(DecoBlocks.RESIN_SLAB))
                        .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_RESIN_SLAB)+ "_from_smelting");
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.RESIN_WALL), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_RESIN_WALL,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.RESIN_WALL), has(DecoBlocks.RESIN_WALL))
                        .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_RESIN_WALL)+ "_from_smelting");

                stairBuilder(DecoBlocks.RESIN_STAIRS, Ingredient.of(Items.RESIN_BLOCK))
                        .unlockedBy(getHasName(Items.RESIN_BLOCK),has(Items.RESIN_BLOCK))
                        .save(output, getSimpleRecipeName(DecoBlocks.RESIN_STAIRS) + "_recipe_create");
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RESIN_SLAB, Items.RESIN_BLOCK);
                wall(RecipeCategory.DECORATIONS, DecoBlocks.RESIN_WALL, Items.RESIN_BLOCK);

                stairBuilder(DecoBlocks.SMOOTH_RESIN_STAIRS, Ingredient.of(DecoBlocks.SMOOTH_RESIN))
                        .unlockedBy(getHasName(DecoBlocks.SMOOTH_RESIN),has(DecoBlocks.SMOOTH_RESIN))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_RESIN_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_RESIN_STAIRS, DecoBlocks.SMOOTH_RESIN);
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_RESIN_SLAB, DecoBlocks.SMOOTH_RESIN);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_RESIN_SLAB, DecoBlocks.SMOOTH_RESIN,2);
                wall(RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_RESIN_WALL, DecoBlocks.SMOOTH_RESIN);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_RESIN_WALL, DecoBlocks.SMOOTH_RESIN);

                stairBuilder(DecoBlocks.DRIFTWOOD_LOG_STAIRS, Ingredient.of(DecoBlocks.DRIFTWOOD))
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD),has(DecoBlocks.DRIFTWOOD))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_LOG_STAIRS) + "_recipe_create");

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIFTWOOD_LOG_SLAB, DecoBlocks.DRIFTWOOD);

                wall(RecipeCategory.DECORATIONS, DecoBlocks.DRIFTWOOD_LOG_WALL, DecoBlocks.DRIFTWOOD);

                stairBuilder(DecoBlocks.STRIPPED_DRIFTWOOD_STAIRS, Ingredient.of(DecoBlocks.STRIPPED_DRIFTWOOD))
                        .unlockedBy(getHasName(DecoBlocks.STRIPPED_DRIFTWOOD),has(DecoBlocks.STRIPPED_DRIFTWOOD))
                        .save(output, getSimpleRecipeName(DecoBlocks.STRIPPED_DRIFTWOOD_STAIRS) + "_recipe_create");

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_DRIFTWOOD_SLAB, DecoBlocks.STRIPPED_DRIFTWOOD);

                wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_DRIFTWOOD_WALL, DecoBlocks.STRIPPED_DRIFTWOOD);

                offerNoteBlockVariantRecipe(output, DecoBlocks.DRIFTWOOD_NOTE_BLOCK, DecoBlocks.DRIFTWOOD_PLANKS);

                shaped(RecipeCategory.REDSTONE, DecoBlocks.DRIFTWOOD_PALLET_DOOR,3)
                        .pattern("##")
                        .pattern("##")
                        .pattern("##")
                        .define('#', DecoBlocks.DRIFTWOOD_SLAB)
                        .group("pallet_doors")
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_SLAB),
                                has(DecoBlocks.DRIFTWOOD_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_PALLET_DOOR)+ "_recipe_create");
                shaped(RecipeCategory.REDSTONE, DecoBlocks.DRIFTWOOD_PALLET_TRAPDOOR,2)
                        .pattern("###")
                        .pattern("###")
                        .define('#', DecoBlocks.DRIFTWOOD_SLAB)
                        .group("pallet_trapdoors")
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_SLAB),
                                has(DecoBlocks.DRIFTWOOD_SLAB))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_PALLET_TRAPDOOR)+ "_recipe_create");

                stairBuilder(DecoBlocks.DRIFTWOOD_BOOKSHELF_STAIRS, Ingredient.of(DecoBlocks.DRIFTWOOD_BOOKSHELF))
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_BOOKSHELF),has(DecoBlocks.DRIFTWOOD_BOOKSHELF))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_BOOKSHELF_STAIRS) + "_recipe_create");

                slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIFTWOOD_BOOKSHELF_SLAB, DecoBlocks.DRIFTWOOD_BOOKSHELF);

                woodenBoat(DecoItems.DRIFTWOOD_BOAT, DecoBlocks.DRIFTWOOD_PLANKS);
                chestBoat(DecoItems.DRIFTWOOD_CHEST_BOAT, DecoItems.DRIFTWOOD_BOAT);

                shapeless(RecipeCategory.MISC, Items.RED_DYE)
                        .requires(DecoBlocks.ROUGE_WILDFLOWERS)
                        .group("red_dye")
                        .unlockedBy(getHasName(DecoBlocks.ROUGE_WILDFLOWERS),
                                has(DecoBlocks.ROUGE_WILDFLOWERS))
                        .save(output, getSimpleRecipeName(Items.RED_DYE) + "_from_wildflower");
                shapeless(RecipeCategory.MISC, Items.PURPLE_DYE)
                        .requires(DecoBlocks.SWEET_WILDFLOWERS)
                        .group("purple_dye")
                        .unlockedBy(getHasName(DecoBlocks.SWEET_WILDFLOWERS),
                                has(DecoBlocks.SWEET_WILDFLOWERS))
                        .save(output, getSimpleRecipeName(Items.PURPLE_DYE) + "_from_wildflower");
                shapeless(RecipeCategory.MISC, Items.GREEN_DYE)
                        .requires(DecoBlocks.GECKO_WILDFLOWERS)
                        .group("green_dye")
                        .unlockedBy(getHasName(DecoBlocks.GECKO_WILDFLOWERS),
                                has(DecoBlocks.GECKO_WILDFLOWERS))
                        .save(output, getSimpleRecipeName(Items.GREEN_DYE) + "_from_wildflower");

                stairBuilder(DecoBlocks.DRIED_DRIFTWOOD_STAIRS, Ingredient.of(DecoBlocks.DRIED_DRIFTWOOD))
                        .unlockedBy(getHasName(DecoBlocks.DRIED_DRIFTWOOD),has(DecoBlocks.DRIED_DRIFTWOOD))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIED_DRIFTWOOD_STAIRS) + "_recipe_create");

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIED_DRIFTWOOD_SLAB, DecoBlocks.DRIED_DRIFTWOOD);

                wall(RecipeCategory.DECORATIONS, DecoBlocks.DRIED_DRIFTWOOD_WALL, DecoBlocks.DRIED_DRIFTWOOD);

                shapeless(RecipeCategory.MISC, Items.LIGHT_GRAY_DYE)
                        .requires(DecoBlocks.HAZZY_BLUET)
                        .group("light_gray_dye")
                        .unlockedBy(getHasName(DecoBlocks.HAZZY_BLUET),
                                has(DecoBlocks.HAZZY_BLUET))
                        .save(output,getSimpleRecipeName(Items.LIGHT_GRAY_DYE)+"_from_hazzy_bluet");
                shapeless(RecipeCategory.MISC, Items.BROWN_DYE)
                        .requires(DecoBlocks.DRILL_LAVENDER)
                        .group("brown_dye")
                        .unlockedBy(getHasName(DecoBlocks.DRILL_LAVENDER),
                                has(DecoBlocks.DRILL_LAVENDER))
                        .save(output,getSimpleRecipeName(Items.BROWN_DYE)+"_from_drill_lavender");

                shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRY_GRASS_BLOCK,3)
                        .pattern("D0D")
                        .pattern("###")
                        .define('#', Items.DIRT)
                        .define('0', DecoItems.EARTH_SPHERE)
                        .define('D', Items.DRY_SHORT_GRASS)
                        .group("dirt_like")
                        .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                                has(DecoItems.EARTH_SPHERE))
                        .save(output,getSimpleRecipeName(DecoBlocks.DRY_GRASS_BLOCK)+ "_recipe_create");

                shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_DRY_GRASS)
                        .pattern(" G ")
                        .pattern("G0G")
                        .pattern(" G ")
                        .define('0', DecoItems.EARTH_SPHERE)
                        .define('G', Items.DRY_SHORT_GRASS)
                        .group("packed_soil")
                        .unlockedBy(getHasName(DecoItems.EARTH_SPHERE),
                                has(DecoItems.EARTH_SPHERE))
                        .save(output,getSimpleRecipeName(DecoBlocks.PACKED_DRY_GRASS)+ "_from_earth_sphere");

                shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_DRY_GRASS)
                        .pattern("##")
                        .pattern("##")
                        .define('#', DecoBlocks.DRY_GRASS_BLOCK)
                        .group("packed_soil")
                        .unlockedBy(getHasName(DecoBlocks.DRY_GRASS_BLOCK),
                                has(DecoBlocks.DRY_GRASS_BLOCK))
                        .save(output,getSimpleRecipeName(DecoBlocks.PACKED_DRY_GRASS)+ "_recipe_create");

                carpet(DecoBlocks.DRY_GRASS_CARPET, DecoBlocks.PACKED_DRY_GRASS);
                stairBuilder(DecoBlocks.DRY_GRASS_STAIRS, Ingredient.of(DecoBlocks.PACKED_DRY_GRASS))
                        .unlockedBy(getHasName(DecoBlocks.PACKED_DRY_GRASS),has(DecoBlocks.PACKED_DRY_GRASS))
                        .save(output,getSimpleRecipeName(DecoBlocks.DRY_GRASS_STAIRS)+ "_recipe_create");
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRY_GRASS_SLAB, DecoBlocks.PACKED_DRY_GRASS);

                shapeless(RecipeCategory.MISC,Items.MAGENTA_DYE)
                        .requires(DecoBlocks.ENDER_ROSE)
                        .group("magenta_dye")
                        .unlockedBy(getHasName(DecoBlocks.ENDER_ROSE),
                                has(DecoBlocks.ENDER_ROSE))
                        .save(output, "magenta_dye_from_ender_rose");
                shapeless(RecipeCategory.MISC,Items.MAGENTA_DYE,4)
                        .requires(DecoBlocks.ENDER_ROSE_BUSH)
                        .group("magenta_dye")
                        .unlockedBy(getHasName(DecoBlocks.ENDER_ROSE_BUSH),
                                has(DecoBlocks.ENDER_ROSE_BUSH))
                        .save(output, "magenta_dye_from_ender_rose_bush");

                shapeless(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_DEEPSLATE_BRICKS)
                        .requires(Items.SCULK_VEIN)
                        .requires(Items.DEEPSLATE_BRICKS)
                        .unlockedBy(getHasName(Items.SCULK_VEIN),
                                has(Items.SCULK_VEIN))
                        .save(output,getSimpleRecipeName(DecoBlocks.MOSSY_DEEPSLATE_BRICKS) + "_recipe_create");

                shapeless(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_END_STONE_BRICKS)
                        .requires(Items.MOSS_BLOCK)
                        .requires(Items.END_STONE_BRICKS)
                        .unlockedBy(getHasName(Items.END_STONE_BRICKS),
                                has(Items.END_STONE_BRICKS))
                        .save(output,getSimpleRecipeName(DecoBlocks.MOSSY_END_STONE_BRICKS) + "_recipe_create");

                shapeless(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS)
                        .requires(Items.TWISTING_VINES)
                        .requires(Items.POLISHED_BLACKSTONE_BRICKS)
                        .unlockedBy(getHasName(Items.TWISTING_VINES),
                                has(Items.TWISTING_VINES))
                        .save(output,getSimpleRecipeName(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS) + "_recipe_create");

                stairBuilder(DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, Ingredient.of(DecoBlocks.MOSSY_DEEPSLATE_BRICKS))
                        .unlockedBy(getHasName(DecoBlocks.MOSSY_DEEPSLATE_BRICKS),has(DecoBlocks.MOSSY_DEEPSLATE_BRICKS))
                        .save(output, getSimpleRecipeName(DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, DecoBlocks.MOSSY_DEEPSLATE_BRICKS,2);
                wall(RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_DEEPSLATE_BRICK_WALL, DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_DEEPSLATE_BRICK_WALL, DecoBlocks.MOSSY_DEEPSLATE_BRICKS);

                stairBuilder(DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.MOSSY_END_STONE_BRICKS))
                        .unlockedBy(getHasName(DecoBlocks.MOSSY_END_STONE_BRICKS),has(DecoBlocks.MOSSY_END_STONE_BRICKS))
                        .save(output, getSimpleRecipeName(DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS, DecoBlocks.MOSSY_END_STONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_END_STONE_BRICK_SLAB, DecoBlocks.MOSSY_END_STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_END_STONE_BRICK_SLAB, DecoBlocks.MOSSY_END_STONE_BRICKS,2);
                wall(RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_END_STONE_BRICK_WALL, DecoBlocks.MOSSY_END_STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_END_STONE_BRICK_WALL, DecoBlocks.MOSSY_END_STONE_BRICKS);

                stairBuilder(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS))
                        .unlockedBy(getHasName(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS),has(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS))
                        .save(output, getSimpleRecipeName(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS,2);
                wall(RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);

                stairBuilder(DecoBlocks.LAPIS_STAIRS, Ingredient.of(Items.LAPIS_BLOCK))
                        .unlockedBy(getHasName(Items.LAPIS_BLOCK),has(Items.LAPIS_BLOCK))
                        .save(output, getSimpleRecipeName(DecoBlocks.LAPIS_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_STAIRS, Items.LAPIS_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_SLAB, Items.LAPIS_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_SLAB, Items.LAPIS_BLOCK,2);
                slab(RecipeCategory.DECORATIONS, DecoBlocks.LAPIS_WALL, Items.LAPIS_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_WALL, Items.LAPIS_BLOCK);

                polished(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICKS, Items.LAPIS_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICKS, Items.LAPIS_BLOCK);

                stairBuilder(DecoBlocks.LAPIS_BRICK_STAIRS, Ingredient.of(DecoBlocks.LAPIS_BRICKS))
                        .unlockedBy(getHasName(DecoBlocks.LAPIS_BRICKS),has(DecoBlocks.LAPIS_BRICKS))
                        .save(output, getSimpleRecipeName(DecoBlocks.LAPIS_BRICK_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_STAIRS, Items.LAPIS_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_STAIRS, DecoBlocks.LAPIS_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_SLAB, DecoBlocks.LAPIS_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_SLAB, Items.LAPIS_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_SLAB, DecoBlocks.LAPIS_BRICKS,2);
                slab(RecipeCategory.DECORATIONS, DecoBlocks.LAPIS_BRICK_WALL, DecoBlocks.LAPIS_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_WALL, Items.LAPIS_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_WALL, DecoBlocks.LAPIS_BRICKS);


                shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS,4)
                        .pattern("#L")
                        .pattern("L#")
                        .define('#', Items.LAPIS_BLOCK)
                        .define('L', Items.LAPIS_LAZULI)
                        .unlockedBy(getHasName(Items.LAPIS_BLOCK),
                                has(Items.LAPIS_BLOCK))
                        .save(output,getSimpleRecipeName(DecoBlocks.CUT_LAPIS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS, Items.LAPIS_BLOCK);

                stairBuilder(DecoBlocks.CUT_LAPIS_STAIRS, Ingredient.of(DecoBlocks.CUT_LAPIS))
                        .unlockedBy(getHasName(DecoBlocks.CUT_LAPIS),has(DecoBlocks.CUT_LAPIS))
                        .save(output, getSimpleRecipeName(DecoBlocks.CUT_LAPIS_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_STAIRS, Items.LAPIS_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_STAIRS, DecoBlocks.CUT_LAPIS);
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_SLAB, DecoBlocks.CUT_LAPIS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_SLAB, Items.LAPIS_BLOCK,2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_SLAB, DecoBlocks.CUT_LAPIS,2);
                slab(RecipeCategory.DECORATIONS, DecoBlocks.CUT_LAPIS_WALL, DecoBlocks.CUT_LAPIS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_WALL, Items.LAPIS_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_WALL, DecoBlocks.CUT_LAPIS);

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.LAPIS_BLOCK), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_LAPIS,
                                0.1f, 200).unlockedBy(getHasName(Items.LAPIS_BLOCK), has(Items.LAPIS_BLOCK))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_LAPIS) + "_recipe_create");

                stairBuilder(DecoBlocks.SMOOTH_LAPIS_STAIRS, Ingredient.of(DecoBlocks.SMOOTH_LAPIS))
                        .unlockedBy(getHasName(DecoBlocks.SMOOTH_LAPIS),has(DecoBlocks.SMOOTH_LAPIS))
                        .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_LAPIS_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS_STAIRS, DecoBlocks.SMOOTH_LAPIS);
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS_SLAB, DecoBlocks.SMOOTH_LAPIS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS_SLAB, DecoBlocks.SMOOTH_LAPIS,2);
                slab(RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_LAPIS_WALL, DecoBlocks.SMOOTH_LAPIS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS_WALL, DecoBlocks.SMOOTH_LAPIS);

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.LAPIS_STAIRS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_LAPIS_STAIRS,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.LAPIS_STAIRS), has(DecoBlocks.LAPIS_STAIRS))
                        .save(output,("smooth_lapis_stairs_from_smelting"));
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.LAPIS_SLAB), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_LAPIS_SLAB,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.LAPIS_SLAB), has(DecoBlocks.LAPIS_SLAB))
                        .save(output,("smooth_lapis_slab_from_smelting"));
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.LAPIS_WALL), RecipeCategory.DECORATIONS, CookingBookCategory.BLOCKS,DecoBlocks.SMOOTH_LAPIS_WALL,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.LAPIS_WALL), has(DecoBlocks.LAPIS_WALL))
                        .save(output,("smooth_lapis_wall_from_smelting"));

                shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_LAPIS,2)
                        .pattern("##")
                        .pattern("##")
                        .define('#', DecoBlocks.LAPIS_SLAB)
                        .unlockedBy(getHasName(DecoBlocks.LAPIS_SLAB),
                                has(DecoBlocks.LAPIS_SLAB))
                        .save(output,getSimpleRecipeName(DecoBlocks.CHISELED_LAPIS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_LAPIS, Items.LAPIS_BLOCK);

                chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_PILLAR, DecoBlocks.LAPIS_SLAB);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_PILLAR, Items.LAPIS_BLOCK);

                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_GRAY_CONCRETE, DecoBlocks.CUT_GRAY_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_BLACK_CONCRETE, DecoBlocks.CUT_BLACK_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_BROWN_CONCRETE, DecoBlocks.CUT_BROWN_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_RED_CONCRETE, DecoBlocks.CUT_RED_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE, DecoBlocks.CUT_ORANGE_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE, DecoBlocks.CUT_YELLOW_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_LIME_CONCRETE, DecoBlocks.CUT_LIME_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_GREEN_CONCRETE, DecoBlocks.CUT_GREEN_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_CYAN_CONCRETE, DecoBlocks.CUT_CYAN_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_BLUE_CONCRETE, DecoBlocks.CUT_BLUE_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE, DecoBlocks.CUT_PURPLE_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE, DecoBlocks.CUT_MAGENTA_CONCRETE);
                offerDuelCutRecipe(output, DecoBlocks.DUEL_CUT_PINK_CONCRETE, DecoBlocks.CUT_PINK_CONCRETE);

                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_GRAY_CONCRETE, DecoBlocks.CUT_GRAY_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_BLACK_CONCRETE, DecoBlocks.CUT_BLACK_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_BROWN_CONCRETE, DecoBlocks.CUT_BROWN_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_RED_CONCRETE, DecoBlocks.CUT_RED_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_ORANGE_CONCRETE, DecoBlocks.CUT_ORANGE_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_YELLOW_CONCRETE, DecoBlocks.CUT_YELLOW_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_LIME_CONCRETE, DecoBlocks.CUT_LIME_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_GREEN_CONCRETE, DecoBlocks.CUT_GREEN_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_CYAN_CONCRETE, DecoBlocks.CUT_CYAN_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_BLUE_CONCRETE, DecoBlocks.CUT_BLUE_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_PURPLE_CONCRETE, DecoBlocks.CUT_PURPLE_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_MAGENTA_CONCRETE, DecoBlocks.CUT_MAGENTA_CONCRETE);
                offerCheckeredRecipe(output, DecoBlocks.CHECKERED_PINK_CONCRETE, DecoBlocks.CUT_PINK_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_BLACK_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_BLACK_CONCRETE),has(DecoBlocks.DUEL_CUT_BLACK_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BLACK_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BLACK_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BLACK_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BLACK_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_GRAY_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_GRAY_CONCRETE),has(DecoBlocks.DUEL_CUT_GRAY_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_GRAY_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE_WALL, DecoBlocks.DUEL_CUT_GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE_WALL, DecoBlocks.DUEL_CUT_GRAY_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE),has(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_BROWN_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_BROWN_CONCRETE),has(DecoBlocks.DUEL_CUT_BROWN_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BROWN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BROWN_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BROWN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BROWN_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_RED_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_RED_CONCRETE),has(DecoBlocks.DUEL_CUT_RED_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_RED_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_RED_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_RED_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_RED_CONCRETE_WALL, DecoBlocks.DUEL_CUT_RED_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_RED_CONCRETE_WALL, DecoBlocks.DUEL_CUT_RED_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE),has(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE,2);

                stairBuilder(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE),has(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_WALL, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_WALL, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_LIME_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_LIME_CONCRETE),has(DecoBlocks.DUEL_CUT_LIME_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_LIME_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIME_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIME_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_LIME_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIME_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIME_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIME_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_GREEN_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_GREEN_CONCRETE),has(DecoBlocks.DUEL_CUT_GREEN_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_GREEN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_GREEN_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_GREEN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_GREEN_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_CYAN_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_CYAN_CONCRETE),has(DecoBlocks.DUEL_CUT_CYAN_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_CYAN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_CYAN_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_CYAN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_CYAN_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_BLUE_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_BLUE_CONCRETE),has(DecoBlocks.DUEL_CUT_BLUE_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BLUE_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BLUE_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE),has(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE),has(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE),has(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);

                stairBuilder(DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.DUEL_CUT_PINK_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.DUEL_CUT_PINK_CONCRETE),has(DecoBlocks.DUEL_CUT_PINK_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_PINK_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_PINK_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_PINK_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_PINK_CONCRETE_WALL, DecoBlocks.DUEL_CUT_PINK_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PINK_CONCRETE_WALL, DecoBlocks.DUEL_CUT_PINK_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_BLACK_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_BLACK_CONCRETE),has(DecoBlocks.CHECKERED_BLACK_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS, DecoBlocks.CHECKERED_BLACK_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB, DecoBlocks.CHECKERED_BLACK_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB, DecoBlocks.CHECKERED_BLACK_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_BLACK_CONCRETE_WALL, DecoBlocks.CHECKERED_BLACK_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLACK_CONCRETE_WALL, DecoBlocks.CHECKERED_BLACK_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_GRAY_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_GRAY_CONCRETE),has(DecoBlocks.CHECKERED_GRAY_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS, DecoBlocks.CHECKERED_GRAY_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB, DecoBlocks.CHECKERED_GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB, DecoBlocks.CHECKERED_GRAY_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_GRAY_CONCRETE_WALL, DecoBlocks.CHECKERED_GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GRAY_CONCRETE_WALL, DecoBlocks.CHECKERED_GRAY_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE),has(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_BROWN_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_BROWN_CONCRETE),has(DecoBlocks.CHECKERED_BROWN_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS, DecoBlocks.CHECKERED_BROWN_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB, DecoBlocks.CHECKERED_BROWN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB, DecoBlocks.CHECKERED_BROWN_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_BROWN_CONCRETE_WALL, DecoBlocks.CHECKERED_BROWN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BROWN_CONCRETE_WALL, DecoBlocks.CHECKERED_BROWN_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_RED_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_RED_CONCRETE),has(DecoBlocks.CHECKERED_RED_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS, DecoBlocks.CHECKERED_RED_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_RED_CONCRETE_SLAB, DecoBlocks.CHECKERED_RED_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_RED_CONCRETE_SLAB, DecoBlocks.CHECKERED_RED_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_RED_CONCRETE_WALL, DecoBlocks.CHECKERED_RED_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_RED_CONCRETE_WALL, DecoBlocks.CHECKERED_RED_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_ORANGE_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_ORANGE_CONCRETE),has(DecoBlocks.CHECKERED_ORANGE_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS, DecoBlocks.CHECKERED_ORANGE_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB, DecoBlocks.CHECKERED_ORANGE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB, DecoBlocks.CHECKERED_ORANGE_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_ORANGE_CONCRETE_WALL, DecoBlocks.CHECKERED_ORANGE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_ORANGE_CONCRETE_WALL, DecoBlocks.CHECKERED_ORANGE_CONCRETE,2);

                stairBuilder(DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_YELLOW_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_YELLOW_CONCRETE),has(DecoBlocks.CHECKERED_YELLOW_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS, DecoBlocks.CHECKERED_YELLOW_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB, DecoBlocks.CHECKERED_YELLOW_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB, DecoBlocks.CHECKERED_YELLOW_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_YELLOW_CONCRETE_WALL, DecoBlocks.CHECKERED_YELLOW_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_YELLOW_CONCRETE_WALL, DecoBlocks.CHECKERED_YELLOW_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_LIME_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_LIME_CONCRETE),has(DecoBlocks.CHECKERED_LIME_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS, DecoBlocks.CHECKERED_LIME_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIME_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIME_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_LIME_CONCRETE_WALL, DecoBlocks.CHECKERED_LIME_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIME_CONCRETE_WALL, DecoBlocks.CHECKERED_LIME_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_GREEN_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_GREEN_CONCRETE),has(DecoBlocks.CHECKERED_GREEN_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS, DecoBlocks.CHECKERED_GREEN_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB, DecoBlocks.CHECKERED_GREEN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB, DecoBlocks.CHECKERED_GREEN_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_GREEN_CONCRETE_WALL, DecoBlocks.CHECKERED_GREEN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GREEN_CONCRETE_WALL, DecoBlocks.CHECKERED_GREEN_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_CYAN_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_CYAN_CONCRETE),has(DecoBlocks.CHECKERED_CYAN_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS, DecoBlocks.CHECKERED_CYAN_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB, DecoBlocks.CHECKERED_CYAN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB, DecoBlocks.CHECKERED_CYAN_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_CYAN_CONCRETE_WALL, DecoBlocks.CHECKERED_CYAN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_CYAN_CONCRETE_WALL, DecoBlocks.CHECKERED_CYAN_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_BLUE_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_BLUE_CONCRETE),has(DecoBlocks.CHECKERED_BLUE_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS, DecoBlocks.CHECKERED_BLUE_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB, DecoBlocks.CHECKERED_BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB, DecoBlocks.CHECKERED_BLUE_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_BLUE_CONCRETE_WALL, DecoBlocks.CHECKERED_BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLUE_CONCRETE_WALL, DecoBlocks.CHECKERED_BLUE_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE),has(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);

                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE,2);

                slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);

                stairBuilder(DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_PURPLE_CONCRETE))
                        .unlockedBy(getHasName(DecoBlocks.CHECKERED_PURPLE_CONCRETE),has(DecoBlocks.CHECKERED_PURPLE_CONCRETE))
                        .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS) + "_recipe_create");
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS, DecoBlocks.CHECKERED_PURPLE_CONCRETE);

                shapeless(RecipeCategory.MISC,Items.LIGHT_GRAY_DYE,4)
                        .requires(DecoBlocks.MIGHTY_LAVENDER)
                        .group("light_gray_dye")
                        .unlockedBy(getHasName(DecoBlocks.MIGHTY_LAVENDER),
                                has(DecoBlocks.MIGHTY_LAVENDER))
                        .save(output, ("light_gray_dye_from_mighty_lavender"));
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB, DecoBlocks.CHECKERED_PURPLE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB, DecoBlocks.CHECKERED_PURPLE_CONCRETE,2);

                shapeless(RecipeCategory.MISC,Items.LIGHT_GRAY_DYE)
                        .requires(DecoItems.MIGHTY_LAVENDER_FLOWER)
                        .group("light_gray_dye")
                        .unlockedBy(getHasName(DecoItems.MIGHTY_LAVENDER_FLOWER),
                                has(DecoItems.MIGHTY_LAVENDER_FLOWER))
                        .save(output, "light_gray_dye_from_mighty_lavender_flower");
        slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_PURPLE_CONCRETE_WALL, DecoBlocks.CHECKERED_PURPLE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PURPLE_CONCRETE_WALL, DecoBlocks.CHECKERED_PURPLE_CONCRETE);

        stairBuilder(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_MAGENTA_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CHECKERED_MAGENTA_CONCRETE),has(DecoBlocks.CHECKERED_MAGENTA_CONCRETE))
                .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB, DecoBlocks.CHECKERED_MAGENTA_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB, DecoBlocks.CHECKERED_MAGENTA_CONCRETE,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE_WALL, DecoBlocks.CHECKERED_MAGENTA_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE_WALL, DecoBlocks.CHECKERED_MAGENTA_CONCRETE);

        stairBuilder(DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CHECKERED_PINK_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CHECKERED_PINK_CONCRETE),has(DecoBlocks.CHECKERED_PINK_CONCRETE))
                .save(output, getSimpleRecipeName(DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS, DecoBlocks.CHECKERED_PINK_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB, DecoBlocks.CHECKERED_PINK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB, DecoBlocks.CHECKERED_PINK_CONCRETE,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_PINK_CONCRETE_WALL, DecoBlocks.CHECKERED_PINK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PINK_CONCRETE_WALL, DecoBlocks.CHECKERED_PINK_CONCRETE);

        shapeless(RecipeCategory.MISC, Items.BLUE_DYE)
                .requires(DecoBlocks.IRIS)
                .group("blue_dye")
                .unlockedBy(getHasName(DecoBlocks.IRIS),
                        has(DecoBlocks.IRIS))
                .save(output, ("blue_dye_from_iris"));
        shapeless(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .requires(DecoBlocks.BLUE_DELPHINIUM)
                .group("light_blue_dye")
                .unlockedBy(getHasName(DecoBlocks.BLUE_DELPHINIUM),
                        has(DecoBlocks.BLUE_DELPHINIUM))
                .save(output, ("light_blue_dye_from_blue_delphinium"));
        shapeless(RecipeCategory.MISC, Items.CYAN_DYE)
                .requires(DecoBlocks.CYAN_ORCHID)
                .group("cyan_dye")
                .unlockedBy(getHasName(DecoBlocks.CYAN_ORCHID),
                        has(DecoBlocks.CYAN_ORCHID))
                .save(output, ("cyan_dye_from_cyan_orchid"));
        shapeless(RecipeCategory.MISC, Items.BLUE_DYE)
                .requires(DecoBlocks.FELICIA_DAISY)
                .group("blue_dye")
                .unlockedBy(getHasName(DecoBlocks.FELICIA_DAISY),
                        has(DecoBlocks.FELICIA_DAISY))
                .save(output, ("blue_dye_from_felicia_daisy"));

        shapeless(RecipeCategory.MISC, Items.BROWN_DYE,2)
                .requires(DecoBlocks.MEGA_BROWN_TULIP)
                .group("brown_dye")
                .unlockedBy(getHasName(DecoBlocks.MEGA_BROWN_TULIP),
                        has(DecoBlocks.MEGA_BROWN_TULIP))
                .save(output, ("brown_dye_from_mega_brown_tulip"));

        shapeless(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.JACK_O_SOUL_LANTERN)
                .requires(Items.CARVED_PUMPKIN)
                .requires(Items.SOUL_TORCH)
                .unlockedBy(getHasName(Items.SOUL_TORCH),
                        has(Items.SOUL_TORCH))
                .save(output, getSimpleRecipeName(DecoBlocks.JACK_O_SOUL_LANTERN) + "_recipe_create");

        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.NETHER_BRICK_PILLAR, Items.NETHER_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.NETHER_BRICK_PILLAR, Items.NETHER_BRICKS);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RED_NETHER_BRICK_PILLAR, Items.RED_NETHER_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RED_NETHER_BRICK_PILLAR, Items.RED_NETHER_BRICKS);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_NETHER_BRICK_PILLAR, DecoBlocks.BLUE_NETHER_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_NETHER_BRICK_PILLAR, DecoBlocks.BLUE_NETHER_BRICKS);

        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR, DecoBlocks.VOID_STONE_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR, DecoBlocks.VOID_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR, DecoBlocks.VOID_STONE_BRICKS);

        stairBuilder(DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS, Ingredient.of(DecoBlocks.VOID_STONE_BRICK_PILLAR))
                .unlockedBy(getHasName(DecoBlocks.VOID_STONE_BRICK_PILLAR),has(DecoBlocks.VOID_STONE_BRICK_PILLAR))
                .save(output, getSimpleRecipeName(DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS, DecoBlocks.VOID_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS, DecoBlocks.VOID_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS, DecoBlocks.VOID_STONE_BRICK_PILLAR);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB, DecoBlocks.VOID_STONE_BRICK_PILLAR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB, DecoBlocks.VOID_STONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB, DecoBlocks.VOID_STONE_BRICKS,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB, DecoBlocks.VOID_STONE_BRICK_PILLAR,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL, DecoBlocks.VOID_STONE_BRICK_PILLAR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL, DecoBlocks.VOID_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL, DecoBlocks.VOID_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL, DecoBlocks.VOID_STONE_BRICK_PILLAR);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICKS,3)
                .pattern("##")
                .pattern("--")
                .define('-', DecoBlocks.DRIPSTONE_SLAB)
                .define('#', Items.DRIPSTONE_BLOCK)
                .unlockedBy(getHasName(Items.DRIPSTONE_BLOCK),
                        has(Items.DRIPSTONE_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.DRIPSTONE_BRICKS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICKS, Items.DRIPSTONE_BLOCK);

        stairBuilder(DecoBlocks.DRIPSTONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.DRIPSTONE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.DRIPSTONE_BRICKS),has(DecoBlocks.DRIPSTONE_BRICKS))
                .save(output, getSimpleRecipeName(DecoBlocks.DRIPSTONE_BRICK_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_STAIRS, Items.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_STAIRS, DecoBlocks.DRIPSTONE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_SLAB, DecoBlocks.DRIPSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_SLAB, Items.DRIPSTONE_BLOCK,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_SLAB, DecoBlocks.DRIPSTONE_BRICKS,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.DRIPSTONE_BRICK_WALL, DecoBlocks.DRIPSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_WALL, Items.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_WALL, DecoBlocks.DRIPSTONE_BRICKS);

        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR, DecoBlocks.DRIPSTONE_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR, Items.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR, DecoBlocks.DRIPSTONE_BRICKS);

        stairBuilder(DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS, Ingredient.of(DecoBlocks.DRIPSTONE_BRICK_PILLAR))
                .unlockedBy(getHasName(DecoBlocks.DRIPSTONE_BRICK_PILLAR),has(DecoBlocks.DRIPSTONE_BRICK_PILLAR))
                .save(output, getSimpleRecipeName(DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS, Items.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS, DecoBlocks.DRIPSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS, DecoBlocks.DRIPSTONE_BRICK_PILLAR);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB, DecoBlocks.DRIPSTONE_BRICK_PILLAR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB, Items.DRIPSTONE_BLOCK,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB, DecoBlocks.DRIPSTONE_BRICKS,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB, DecoBlocks.DRIPSTONE_BRICK_PILLAR,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL, DecoBlocks.DRIPSTONE_BRICK_PILLAR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL, Items.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL, DecoBlocks.DRIPSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL, DecoBlocks.DRIPSTONE_BRICK_PILLAR);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON,4)
                .pattern("---")
                .pattern("-#-")
                .pattern("---")
                .define('-', DecoBlocks.IRON_SLAB)
                .define('#', Items.IRON_BLOCK)
                .unlockedBy(getHasName(Items.IRON_BLOCK),
                        has(Items.IRON_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.CASTED_IRON) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON, Items.IRON_BLOCK);

        stairBuilder(DecoBlocks.CASTED_IRON_STAIRS, Ingredient.of(DecoBlocks.CASTED_IRON))
                .unlockedBy(getHasName(DecoBlocks.CASTED_IRON),has(DecoBlocks.CASTED_IRON))
                .save(output, getSimpleRecipeName(DecoBlocks.CASTED_IRON_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON_STAIRS, Items.IRON_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON_STAIRS, DecoBlocks.CASTED_IRON);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON_SLAB, DecoBlocks.CASTED_IRON);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON_SLAB, Items.IRON_BLOCK,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON_SLAB, DecoBlocks.CASTED_IRON,2);

        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_DRIPSTONE, DecoBlocks.DRIPSTONE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_DRIPSTONE, Items.DRIPSTONE_BLOCK);

        stairBuilder(DecoBlocks.TUBE_CORAL_STAIRS, Ingredient.of(Items.TUBE_CORAL_BLOCK))
                .unlockedBy(getHasName(Items.TUBE_CORAL_BLOCK),has(Items.TUBE_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.TUBE_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TUBE_CORAL_STAIRS, Items.TUBE_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TUBE_CORAL_SLAB, Items.TUBE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TUBE_CORAL_SLAB, Items.TUBE_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.TUBE_CORAL_WALL, Items.TUBE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TUBE_CORAL_WALL, Items.TUBE_CORAL_BLOCK);

        stairBuilder(DecoBlocks.BRAIN_CORAL_STAIRS, Ingredient.of(Items.BRAIN_CORAL_BLOCK))
                .unlockedBy(getHasName(Items.BRAIN_CORAL_BLOCK),has(Items.BRAIN_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.BRAIN_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BRAIN_CORAL_STAIRS, Items.BRAIN_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BRAIN_CORAL_SLAB, Items.BRAIN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BRAIN_CORAL_SLAB, Items.BRAIN_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.BRAIN_CORAL_WALL, Items.BRAIN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BRAIN_CORAL_WALL, Items.BRAIN_CORAL_BLOCK);

        stairBuilder(DecoBlocks.BUBBLE_CORAL_STAIRS, Ingredient.of(Items.BUBBLE_CORAL_BLOCK))
                .unlockedBy(getHasName(Items.BUBBLE_CORAL_BLOCK),has(Items.BUBBLE_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.BUBBLE_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_CORAL_STAIRS, Items.BUBBLE_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_CORAL_SLAB, Items.BUBBLE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_CORAL_SLAB, Items.BUBBLE_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.BUBBLE_CORAL_WALL, Items.BUBBLE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_CORAL_WALL, Items.BUBBLE_CORAL_BLOCK);

        stairBuilder(DecoBlocks.FIRE_CORAL_STAIRS, Ingredient.of(Items.FIRE_CORAL_BLOCK))
                .unlockedBy(getHasName(Items.FIRE_CORAL_BLOCK),has(Items.FIRE_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.FIRE_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.FIRE_CORAL_STAIRS, Items.FIRE_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.FIRE_CORAL_SLAB, Items.FIRE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.FIRE_CORAL_SLAB, Items.FIRE_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.FIRE_CORAL_WALL, Items.FIRE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.FIRE_CORAL_WALL, Items.FIRE_CORAL_BLOCK);

        stairBuilder(DecoBlocks.HORN_CORAL_STAIRS, Ingredient.of(Items.HORN_CORAL_BLOCK))
                .unlockedBy(getHasName(Items.HORN_CORAL_BLOCK),has(Items.HORN_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.HORN_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HORN_CORAL_STAIRS, Items.HORN_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HORN_CORAL_SLAB, Items.HORN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HORN_CORAL_SLAB, Items.HORN_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.HORN_CORAL_WALL, Items.HORN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HORN_CORAL_WALL, Items.HORN_CORAL_BLOCK);

        stairBuilder(DecoBlocks.DEAD_TUBE_CORAL_STAIRS, Ingredient.of(Items.DEAD_TUBE_CORAL_BLOCK))
                .unlockedBy(getHasName(Items.DEAD_TUBE_CORAL_BLOCK),has(Items.DEAD_TUBE_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.DEAD_TUBE_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_TUBE_CORAL_STAIRS, Items.DEAD_TUBE_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_TUBE_CORAL_SLAB, Items.DEAD_TUBE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_TUBE_CORAL_SLAB, Items.DEAD_TUBE_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.DEAD_TUBE_CORAL_WALL, Items.DEAD_TUBE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_TUBE_CORAL_WALL, Items.DEAD_TUBE_CORAL_BLOCK);

        stairBuilder(DecoBlocks.DEAD_BRAIN_CORAL_STAIRS, Ingredient.of(Items.DEAD_BRAIN_CORAL_BLOCK))
                .unlockedBy(getHasName(Items.DEAD_BRAIN_CORAL_BLOCK),has(Items.DEAD_BRAIN_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.DEAD_BRAIN_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BRAIN_CORAL_STAIRS, Items.DEAD_BRAIN_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BRAIN_CORAL_SLAB, Items.DEAD_BRAIN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BRAIN_CORAL_SLAB, Items.DEAD_BRAIN_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.DEAD_BRAIN_CORAL_WALL, Items.DEAD_BRAIN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BRAIN_CORAL_WALL, Items.DEAD_BRAIN_CORAL_BLOCK);

        stairBuilder(DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS, Ingredient.of(Items.DEAD_BUBBLE_CORAL_BLOCK))
                .unlockedBy(getHasName(Items.DEAD_BUBBLE_CORAL_BLOCK),has(Items.DEAD_BUBBLE_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS, Items.DEAD_BUBBLE_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BUBBLE_CORAL_SLAB, Items.DEAD_BUBBLE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BUBBLE_CORAL_SLAB, Items.DEAD_BUBBLE_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.DEAD_BUBBLE_CORAL_WALL, Items.DEAD_BUBBLE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BUBBLE_CORAL_WALL, Items.DEAD_BUBBLE_CORAL_BLOCK);

        stairBuilder(DecoBlocks.DEAD_FIRE_CORAL_STAIRS, Ingredient.of(Items.DEAD_FIRE_CORAL_BLOCK))
                .unlockedBy(getHasName(Items.DEAD_FIRE_CORAL_BLOCK),has(Items.DEAD_FIRE_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.DEAD_FIRE_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_FIRE_CORAL_STAIRS, Items.DEAD_FIRE_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_FIRE_CORAL_SLAB, Items.DEAD_FIRE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_FIRE_CORAL_SLAB, Items.DEAD_FIRE_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.DEAD_FIRE_CORAL_WALL, Items.DEAD_FIRE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_FIRE_CORAL_WALL, Items.DEAD_FIRE_CORAL_BLOCK);

        stairBuilder(DecoBlocks.DEAD_HORN_CORAL_STAIRS, Ingredient.of(Items.DEAD_HORN_CORAL_BLOCK))
                .unlockedBy(getHasName(Items.DEAD_HORN_CORAL_BLOCK),has(Items.DEAD_HORN_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.DEAD_HORN_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_HORN_CORAL_STAIRS, Items.DEAD_HORN_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_HORN_CORAL_SLAB, Items.DEAD_HORN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_HORN_CORAL_SLAB, Items.DEAD_HORN_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.DEAD_HORN_CORAL_WALL, Items.DEAD_HORN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_HORN_CORAL_WALL, Items.DEAD_HORN_CORAL_BLOCK);

        offerHydratingRecipe(output, Items.TUBE_CORAL, Items.DEAD_TUBE_CORAL);
        offerHydratingRecipe(output, Items.BRAIN_CORAL, Items.DEAD_BRAIN_CORAL);
        offerHydratingRecipe(output, Items.BUBBLE_CORAL, Items.DEAD_BUBBLE_CORAL);
        offerHydratingRecipe(output, Items.FIRE_CORAL, Items.DEAD_FIRE_CORAL);
        offerHydratingRecipe(output, Items.HORN_CORAL, Items.DEAD_HORN_CORAL);

        offerHydratingRecipe(output, Items.TUBE_CORAL_FAN, Items.DEAD_TUBE_CORAL_FAN);
        offerHydratingRecipe(output, Items.BRAIN_CORAL_FAN, Items.DEAD_BRAIN_CORAL_FAN);
        offerHydratingRecipe(output, Items.BUBBLE_CORAL_FAN, Items.DEAD_BUBBLE_CORAL_FAN);
        offerHydratingRecipe(output, Items.FIRE_CORAL_FAN, Items.DEAD_FIRE_CORAL_FAN);
        offerHydratingRecipe(output, Items.HORN_CORAL_FAN, Items.DEAD_HORN_CORAL_FAN);

        offerHydratingRecipe(output, Items.TUBE_CORAL_BLOCK, Items.DEAD_TUBE_CORAL_BLOCK);
        offerHydratingRecipe(output, Items.BRAIN_CORAL_BLOCK, Items.DEAD_BRAIN_CORAL_BLOCK);
        offerHydratingRecipe(output, Items.BUBBLE_CORAL_BLOCK, Items.DEAD_BUBBLE_CORAL_BLOCK);
        offerHydratingRecipe(output, Items.FIRE_CORAL_BLOCK, Items.DEAD_FIRE_CORAL_BLOCK);
        offerHydratingRecipe(output, Items.HORN_CORAL_BLOCK, Items.DEAD_HORN_CORAL_BLOCK);

        offerHydratingRecipe(output, DecoBlocks.TUBE_CORAL_STAIRS, DecoBlocks.DEAD_TUBE_CORAL_STAIRS);
        offerHydratingRecipe(output, DecoBlocks.BRAIN_CORAL_STAIRS, DecoBlocks.DEAD_BRAIN_CORAL_STAIRS);
        offerHydratingRecipe(output, DecoBlocks.BUBBLE_CORAL_STAIRS, DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS);
        offerHydratingRecipe(output, DecoBlocks.FIRE_CORAL_STAIRS, DecoBlocks.DEAD_FIRE_CORAL_STAIRS);
        offerHydratingRecipe(output, DecoBlocks.HORN_CORAL_STAIRS, DecoBlocks.DEAD_HORN_CORAL_STAIRS);

        offerHydratingRecipe(output, DecoBlocks.TUBE_CORAL_SLAB, DecoBlocks.DEAD_TUBE_CORAL_SLAB);
        offerHydratingRecipe(output, DecoBlocks.BRAIN_CORAL_SLAB, DecoBlocks.DEAD_BRAIN_CORAL_SLAB);
        offerHydratingRecipe(output, DecoBlocks.BUBBLE_CORAL_SLAB, DecoBlocks.DEAD_BUBBLE_CORAL_SLAB);
        offerHydratingRecipe(output, DecoBlocks.FIRE_CORAL_SLAB, DecoBlocks.DEAD_FIRE_CORAL_SLAB);
        offerHydratingRecipe(output, DecoBlocks.HORN_CORAL_SLAB, DecoBlocks.DEAD_HORN_CORAL_SLAB);

        offerHydratingRecipe(output, DecoBlocks.TUBE_CORAL_WALL, DecoBlocks.DEAD_TUBE_CORAL_WALL);
        offerHydratingRecipe(output, DecoBlocks.BRAIN_CORAL_WALL, DecoBlocks.DEAD_BRAIN_CORAL_WALL);
        offerHydratingRecipe(output, DecoBlocks.BUBBLE_CORAL_WALL, DecoBlocks.DEAD_BUBBLE_CORAL_WALL);
        offerHydratingRecipe(output, DecoBlocks.FIRE_CORAL_WALL, DecoBlocks.DEAD_FIRE_CORAL_WALL);
        offerHydratingRecipe(output, DecoBlocks.HORN_CORAL_WALL, DecoBlocks.DEAD_HORN_CORAL_WALL);

        offerHydratingRecipe(output, DecoBlocks.HYDRATED_TUBE_CORAL, Items.TUBE_CORAL);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_BRAIN_CORAL, Items.BRAIN_CORAL);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_BUBBLE_CORAL, Items.BUBBLE_CORAL);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_FIRE_CORAL, Items.FIRE_CORAL);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_HORN_CORAL, Items.HORN_CORAL);

        offerHydratingRecipe(output, DecoItems.HYDRATED_TUBE_CORAL_FAN, Items.TUBE_CORAL_FAN);
        offerHydratingRecipe(output, DecoItems.HYDRATED_BRAIN_CORAL_FAN, Items.BRAIN_CORAL_FAN);
        offerHydratingRecipe(output, DecoItems.HYDRATED_BUBBLE_CORAL_FAN, Items.BUBBLE_CORAL_FAN);
        offerHydratingRecipe(output, DecoItems.HYDRATED_FIRE_CORAL_FAN, Items.FIRE_CORAL_FAN);
        offerHydratingRecipe(output, DecoItems.HYDRATED_HORN_CORAL_FAN, Items.HORN_CORAL_FAN);

        offerReversibleCompactingFourRecipes(output,DecoBlocks.HYDRATED_BUBBLE_CORAL, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK,
                "hydrated_bubble_coral_block","coral_block",
                "hydrated_bubble_coral","coral");

        offerReversibleCompactingFourRecipes(output,DecoBlocks.HYDRATED_TUBE_CORAL, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK,
                "hydrated_tube_coral_block","coral_block",
                "hydrated_tube_coral","coral");

        offerReversibleCompactingFourRecipes(output,DecoBlocks.HYDRATED_HORN_CORAL, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK,
                "hydrated_horn_coral_block","coral_block",
                "hydrated_horn_coral","coral");

        offerReversibleCompactingFourRecipes(output,DecoBlocks.HYDRATED_BRAIN_CORAL, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK,
                "hydrated_brain_coral_block","coral_block",
                "hydrated_brain_coral","coral");

        offerReversibleCompactingFourRecipes(output,DecoBlocks.HYDRATED_FIRE_CORAL, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK,
                "hydrated_fire_coral_block","coral_block",
                "hydrated_fire_coral","coral");

        offerHydratingRecipe(output, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK, Items.TUBE_CORAL_BLOCK);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK, Items.BRAIN_CORAL_BLOCK);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK, Items.BUBBLE_CORAL_BLOCK);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK, Items.FIRE_CORAL_BLOCK);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK, Items.HORN_CORAL_BLOCK);

        offerHydratingRecipe(output, DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS, DecoBlocks.TUBE_CORAL_STAIRS);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS, DecoBlocks.BRAIN_CORAL_STAIRS);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS, DecoBlocks.BUBBLE_CORAL_STAIRS);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS, DecoBlocks.FIRE_CORAL_STAIRS);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_HORN_CORAL_STAIRS, DecoBlocks.HORN_CORAL_STAIRS);

        offerHydratingRecipe(output, DecoBlocks.HYDRATED_TUBE_CORAL_SLAB, DecoBlocks.TUBE_CORAL_SLAB);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB, DecoBlocks.BRAIN_CORAL_SLAB);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB, DecoBlocks.BUBBLE_CORAL_SLAB);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_FIRE_CORAL_SLAB, DecoBlocks.FIRE_CORAL_SLAB);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_HORN_CORAL_SLAB, DecoBlocks.HORN_CORAL_SLAB);

        offerHydratingRecipe(output, DecoBlocks.HYDRATED_TUBE_CORAL_WALL, DecoBlocks.TUBE_CORAL_WALL);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_BRAIN_CORAL_WALL, DecoBlocks.BRAIN_CORAL_WALL);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL, DecoBlocks.BUBBLE_CORAL_WALL);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_FIRE_CORAL_WALL, DecoBlocks.FIRE_CORAL_WALL);
        offerHydratingRecipe(output, DecoBlocks.HYDRATED_HORN_CORAL_WALL, DecoBlocks.HORN_CORAL_WALL);

        shaped(RecipeCategory.MISC,DecoBlocks.HYDRATED_BUBBLE_CORAL)
                        .pattern("#")
                        .pattern("#")
                        .define('#', DecoItems.HYDRATED_BUBBLE_CORAL_FAN)
                        .group("coral")
                        .unlockedBy(getHasName(DecoItems.HYDRATED_BUBBLE_CORAL_FAN),
                                has(DecoItems.HYDRATED_BUBBLE_CORAL_FAN))
                        .save(output,"hydrated_bubble_coral_from_fan"+ "_recipe_create");
                shaped(RecipeCategory.MISC,DecoBlocks.HYDRATED_TUBE_CORAL)
                        .pattern("#")
                        .pattern("#")
                        .define('#', DecoItems.HYDRATED_TUBE_CORAL_FAN)
                        .group("coral")
                        .unlockedBy(getHasName(DecoItems.HYDRATED_TUBE_CORAL_FAN),
                                has(DecoItems.HYDRATED_TUBE_CORAL_FAN))
                        .save(output,"hydrated_tube_coral_from_fan"+ "_recipe_create");
                shaped(RecipeCategory.MISC,DecoBlocks.HYDRATED_BRAIN_CORAL)
                        .pattern("#")
                        .pattern("#")
                        .define('#', DecoItems.HYDRATED_BRAIN_CORAL_FAN)
                        .group("coral")
                        .unlockedBy(getHasName(DecoItems.HYDRATED_BRAIN_CORAL_FAN),
                                has(DecoItems.HYDRATED_BRAIN_CORAL_FAN))
                        .save(output,"hydrated_brain_coral_from_fan"+ "_recipe_create");
                shaped(RecipeCategory.MISC,DecoBlocks.HYDRATED_FIRE_CORAL)
                        .pattern("#")
                        .pattern("#")
                        .define('#', DecoItems.HYDRATED_FIRE_CORAL_FAN)
                        .group("coral")
                        .unlockedBy(getHasName(DecoItems.HYDRATED_FIRE_CORAL_FAN),
                                has(DecoItems.HYDRATED_FIRE_CORAL_FAN))
                        .save(output,"hydrated_fire_coral_from_fan"+ "_recipe_create");
                shaped(RecipeCategory.MISC,DecoBlocks.HYDRATED_HORN_CORAL)
                        .pattern("#")
                        .pattern("#")
                        .define('#', DecoItems.HYDRATED_HORN_CORAL_FAN)
                        .group("coral")
                        .unlockedBy(getHasName(DecoItems.HYDRATED_HORN_CORAL_FAN),
                                has(DecoItems.HYDRATED_HORN_CORAL_FAN))
                        .save(output,"hydrated_horn_coral_from_fan"+ "_recipe_create");

                stairBuilder(DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS, Ingredient.of(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK),has(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS,DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_TUBE_CORAL_SLAB, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_TUBE_CORAL_SLAB, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_TUBE_CORAL_WALL, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_TUBE_CORAL_WALL, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);

        stairBuilder(DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS, Ingredient.of(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK),has(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_BRAIN_CORAL_WALL, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BRAIN_CORAL_WALL, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);

        stairBuilder(DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS, Ingredient.of(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK),has(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);

        stairBuilder(DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS, Ingredient.of(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK),has(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_FIRE_CORAL_SLAB, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_FIRE_CORAL_SLAB, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_FIRE_CORAL_WALL, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_FIRE_CORAL_WALL, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);

        stairBuilder(DecoBlocks.HYDRATED_HORN_CORAL_STAIRS, Ingredient.of(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK),has(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.HYDRATED_HORN_CORAL_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_HORN_CORAL_STAIRS, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_HORN_CORAL_SLAB, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_HORN_CORAL_SLAB, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK,2);

        slab(RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_HORN_CORAL_WALL, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_HORN_CORAL_WALL, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);

        stairBuilder(DecoBlocks.HAY_STAIRS, Ingredient.of(Items.HAY_BLOCK))
                .unlockedBy(getHasName(Items.HAY_BLOCK),has(Items.HAY_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.HAY_STAIRS) + "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HAY_SLAB, Items.HAY_BLOCK);
        carpet(DecoBlocks.HAY_CARPET, Items.HAY_BLOCK);

        stairBuilder(DecoBlocks.NETHER_WART_STAIRS, Ingredient.of(Items.NETHER_WART_BLOCK))
                .unlockedBy(getHasName(Items.NETHER_WART_BLOCK),has(Items.NETHER_WART_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.NETHER_WART_STAIRS) + "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.NETHER_WART_SLAB, Items.NETHER_WART_BLOCK);

        stairBuilder(DecoBlocks.WARPED_WART_STAIRS, Ingredient.of(Items.WARPED_WART_BLOCK))
                .unlockedBy(getHasName(Items.WARPED_WART_BLOCK),has(Items.WARPED_WART_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.WARPED_WART_STAIRS) + "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_WART_SLAB, Items.WARPED_WART_BLOCK);

        stairBuilder(DecoBlocks.SCULK_STAIRS, Ingredient.of(Items.SCULK))
                .unlockedBy(getHasName(Items.SCULK),has(Items.SCULK))
                .save(output, getSimpleRecipeName(DecoBlocks.SCULK_STAIRS) + "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCULK_SLAB, Items.SCULK);
        carpet(DecoBlocks.SCULK_CARPET, Items.SCULK);

        stairBuilder(DecoBlocks.HONEYCOMB_STAIRS, Ingredient.of(Items.HONEYCOMB_BLOCK))
                .unlockedBy(getHasName(Items.HONEYCOMB_BLOCK),has(Items.HONEYCOMB_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.HONEYCOMB_STAIRS) + "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HONEYCOMB_SLAB, Items.HONEYCOMB_BLOCK);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.HONEYCOMB_WALL, Items.HONEYCOMB_BLOCK);

        stairBuilder(DecoBlocks.BAMBOO_BLOCK_STAIRS, Ingredient.of(Items.BAMBOO_BLOCK))
                .unlockedBy(getHasName(Items.BAMBOO_BLOCK),has(Items.BAMBOO_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.BAMBOO_BLOCK_STAIRS) + "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BAMBOO_BLOCK_SLAB, Items.BAMBOO_BLOCK);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.BAMBOO_BLOCK_WALL, Items.BAMBOO_BLOCK);

        stairBuilder(DecoBlocks.STRIPPED_BAMBOO_STAIRS, Ingredient.of(Items.STRIPPED_BAMBOO_BLOCK))
                .unlockedBy(getHasName(Items.STRIPPED_BAMBOO_BLOCK),has(Items.STRIPPED_BAMBOO_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.STRIPPED_BAMBOO_STAIRS) + "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_BAMBOO_SLAB, Items.STRIPPED_BAMBOO_BLOCK);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_BAMBOO_WALL, Items.STRIPPED_BAMBOO_BLOCK);

        shapeless(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_TUFF_BRICKS)
                .requires(Items.MOSS_BLOCK)
                .requires(Items.TUFF_BRICKS)
                .unlockedBy(getHasName(Items.MOSS_BLOCK),
                        has(Items.MOSS_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSSY_TUFF_BRICKS) + "_recipe_create");

        stairBuilder(DecoBlocks.MOSSY_TUFF_BRICK_STAIRS, Ingredient.of(DecoBlocks.MOSSY_TUFF_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.MOSSY_TUFF_BRICKS),has(DecoBlocks.MOSSY_TUFF_BRICKS))
                .save(output, getSimpleRecipeName(DecoBlocks.MOSSY_TUFF_BRICK_STAIRS) + "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_TUFF_BRICK_STAIRS, DecoBlocks.MOSSY_TUFF_BRICKS);
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_TUFF_BRICK_SLAB, DecoBlocks.MOSSY_TUFF_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_TUFF_BRICK_SLAB, DecoBlocks.MOSSY_TUFF_BRICKS,2);
        wall(RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_TUFF_BRICK_WALL, DecoBlocks.MOSSY_TUFF_BRICKS);
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_TUFF_BRICK_WALL, DecoBlocks.MOSSY_TUFF_BRICKS);

                shaped(RecipeCategory.DECORATIONS,Items.HANGING_ROOTS, 16)
                .define('#', ItemTags.LOGS_THAT_BURN)
                .define('/', Items.STICK)
                .pattern("/#/")
                .pattern(" / ")
                .unlockedBy("has_logs", has(ItemTags.LOGS_THAT_BURN))
                .save(output,getSimpleRecipeName(Items.HANGING_ROOTS) + "_recipe_create");
    }
    public void offerLadderVariantRecipe(RecipeOutput exporter, ItemLike output, ItemLike woodInput) {
        shaped(RecipeCategory.DECORATIONS,output,3)
                .define('#', Items.STICK)
                .define('S', woodInput)
                .pattern("# #")
                .pattern("#S#")
                .pattern("# #")
                .group("wooden_ladder")
                .unlockedBy(getHasName(Items.STICK),
                        has(Items.STICK))
                .save(exporter,getSimpleRecipeName(output)+ "_recipe_create");
    }

    public void offerCraftingTableVariantRecipe(RecipeOutput exporter, ItemLike output, ItemLike woodInput) {
        shaped(RecipeCategory.DECORATIONS,output)
                .define('#', woodInput)
                .define('$', DecoTags.Items.DECO_CRAFTING_TABLES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_crafting_tables")
                .unlockedBy(getHasName(woodInput),
                        has(woodInput))
                .save(exporter,getSimpleRecipeName(output)+ "_recipe_create");
    }

    public void offerBarrelVariantRecipe(RecipeOutput exporter, ItemLike output, ItemLike woodInput) {
        shaped(RecipeCategory.DECORATIONS,output)
                .define('#', woodInput)
                .define('$', DecoTags.Items.DECO_BARRELS)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_barrels")
                .unlockedBy(getHasName(woodInput),
                        has(woodInput))
                .save(exporter,getSimpleRecipeName(output)+ "_recipe_create");
    }

    public void offerCartographyTableVariantRecipe(RecipeOutput exporter, ItemLike output, ItemLike woodInput) {
        shaped(RecipeCategory.DECORATIONS,output)
                .define('#', woodInput)
                .define('$', DecoTags.Items.DECO_CARTOGRAPHY_TABLES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_cartography_tables")
                .unlockedBy(getHasName(woodInput),
                        has(woodInput))
                .save(exporter,getSimpleRecipeName(output)+ "_recipe_create");
    }
    public void offerSmithingTableVariantRecipe(RecipeOutput exporter, ItemLike output, ItemLike woodInput) {
        shaped(RecipeCategory.DECORATIONS,output)
                .define('#', woodInput)
                .define('$', DecoTags.Items.DECO_SMITHING_TABLES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_smithing_tables")
                .unlockedBy(getHasName(woodInput),
                        has(woodInput))
                .save(exporter,getSimpleRecipeName(output)+ "_recipe_create");
    }
    public void offerBookshelvesVariantRecipe(RecipeOutput exporter, ItemLike output, ItemLike woodInput) {
        shaped(RecipeCategory.DECORATIONS,output)
                .define('#', woodInput)
                .define('$', DecoTags.Items.DECO_BOOKSHELVES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_bookshelves")
                .unlockedBy(getHasName(woodInput),
                        has(woodInput))
                .save(exporter,getSimpleRecipeName(output)+ "_recipe_create");
    }
    public void offerNoteBlockVariantRecipe(RecipeOutput exporter, ItemLike output, ItemLike woodInput) {
        shaped(RecipeCategory.REDSTONE,output)
                .define('#', woodInput)
                .define('$', DecoTags.Items.DECO_NOTE_BLOCKS)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_smithing_tables")
                .unlockedBy(getHasName(woodInput),
                        has(woodInput))
                .save(exporter,getSimpleRecipeName(output)+ "_recipe_create");
    }
    public void offerPastelBlockRecipe(RecipeOutput exporter, ItemLike dyeBlockInput, ItemLike output) {
        shaped(RecipeCategory.BUILDING_BLOCKS,output, 8)
                .define('X', DecoItems.PASSTOL)
                .define('#', dyeBlockInput)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("pastel_blocks")
                .unlockedBy("has_passtol", has(DecoItems.PASSTOL))
                .save(exporter,getSimpleRecipeName(output)+ "_recipe_create");
    }
    public void offerShadedBlockRecipe(RecipeOutput exporter, ItemLike dyeBlockInput, ItemLike output) {
        shaped(RecipeCategory.BUILDING_BLOCKS,output, 8)
                .define('X', DecoItems.SHADDOL)
                .define('#', dyeBlockInput)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("shaded_blocks")
                .unlockedBy("has_shaddol", has(DecoItems.SHADDOL))
                .save(exporter,getSimpleRecipeName(output)+ "_recipe_create");
    }
    public void offerDyeBlockFromShadedRecipe(RecipeOutput exporter, ItemLike output, ItemLike dyeBlockInput) {
        shaped(RecipeCategory.BUILDING_BLOCKS,output, 8)
                .define('X', DecoItems.PASSTOL)
                .define('#', dyeBlockInput)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("pastel_blocks")
                .unlockedBy("has_passtol", has(DecoItems.PASSTOL))
                .save(exporter, getConversionRecipeName(output, dyeBlockInput));
    }
    public void offerDyeBlockFromPastelRecipe(RecipeOutput exporter, ItemLike output, ItemLike dyeBlockInput) {
        shaped(RecipeCategory.BUILDING_BLOCKS,output, 8)
                .define('X', DecoItems.SHADDOL)
                .define('#', dyeBlockInput)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("shaded_blocks")
                .unlockedBy("has_shaddol", has(DecoItems.SHADDOL))
                .save(exporter, getConversionRecipeName(output, dyeBlockInput));
    }
    public void offerLampRecipe(RecipeOutput exporter, ItemLike output, ItemLike paneInput) {
        shaped(RecipeCategory.BUILDING_BLOCKS, output)
                .define('#', paneInput)
                .define('$', DecoBlocks.SMOOTH_GLOWSTONE)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("coloured_lamp")
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_GLOWSTONE),
                        has(DecoBlocks.SMOOTH_GLOWSTONE))
                .save(exporter,getSimpleRecipeName(output)+ "_recipe_create");
    }
        public void offerDuelCutRecipe(RecipeOutput exporter, ItemLike output, ItemLike concreteInput) {
        shaped(RecipeCategory.BUILDING_BLOCKS,output)
                .define('#', concreteInput)
                .define('$', Items.AMETHYST_SHARD)
                .pattern("$#")
                .pattern("#$")
                .group("special_cut_concrete")
                .unlockedBy(getHasName(concreteInput),
                        has(concreteInput))
                .save(exporter, getSimpleRecipeName(output)+ "_recipe_create");
    }
    public void offerCheckeredRecipe(RecipeOutput exporter, ItemLike output, ItemLike concreteInput) {
        shaped(RecipeCategory.BUILDING_BLOCKS,output)
                .define('#', concreteInput)
                .define('$', DecoItems.PASSTOL)
                .pattern("$#")
                .pattern("#$")
                .group("special_cut_concrete")
                .unlockedBy(getHasName(concreteInput),
                        has(concreteInput))
                .save(exporter, getSimpleRecipeName(output)+ "_recipe_create");
    }
    public void offerHydratingRecipe(RecipeOutput exporter, ItemLike output, ItemLike coralInput) {
        shapeless(RecipeCategory.BUILDING_BLOCKS,output)
                .requires(coralInput)
                .requires(DecoItems.BUBBLE_ORB)
                .group("hydrating_coral")
                .unlockedBy(getHasName(coralInput),
                        has(coralInput))
                .save(exporter, getSimpleRecipeName(output)+ "_from_hydrating");
    }
            public void offerReversibleCompactingFourRecipes(
                    RecipeOutput exporter,
                    ItemLike input,
                    ItemLike compacted,
                    String compactingRecipeName,
                    @Nullable String compactingRecipeGroup,
                    String reverseRecipeName,
                    @Nullable String reverseRecipeGroup
            ) {
                shapeless(RecipeCategory.MISC,input, 4)
                        .requires(compacted)
                        .group(reverseRecipeGroup)
                        .unlockedBy(getHasName(compacted), has(compacted))
                        .save(exporter, reverseRecipeName+ "_recipe_create");
                shaped(RecipeCategory.BUILDING_BLOCKS,compacted)
                        .define('#', input)
                        .pattern("##")
                        .pattern("##")
                        .group(compactingRecipeGroup)
                        .unlockedBy(getHasName(input), has(input))
                        .save(exporter, compactingRecipeName+ "_recipe_create");
            }
};
    }


    @Override
    public String getName() {
        return "";
    }
}