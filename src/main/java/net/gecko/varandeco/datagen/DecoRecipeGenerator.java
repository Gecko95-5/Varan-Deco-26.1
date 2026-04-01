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

public class DecoRecipeGenerator extends FabricRecipeProvider {


    public DecoRecipeGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
        wall(RecipeCategory.DECORATIONS, DecoBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_ANDESITE_WALL, Items.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_DIORITE_WALL, Items.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_GRANITE_WALL, Items.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.STONE_WALL, Items.STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_WALL, Items.STONE);

        stairBuilder(DecoBlocks.SMOOTH_STONE_STAIRS, Ingredient.of(Items.SMOOTH_STONE))
                .unlockedBy(getHasName(Items.SMOOTH_STONE),has(Items.SMOOTH_STONE))
                .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_STONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_STONE_STAIRS, Items.SMOOTH_STONE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);

        stairBuilder(DecoBlocks.CALCITE_STAIRS, Ingredient.of(Items.CALCITE))
                .unlockedBy(getHasName(Items.CALCITE),has(Items.CALCITE))
                .save(output,getSimpleRecipeName(DecoBlocks.CALCITE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_STAIRS, Items.CALCITE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_SLAB, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_SLAB, Items.CALCITE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CALCITE_WALL, Items.CALCITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_WALL, Items.CALCITE);

        stairBuilder(DecoBlocks.DRIPSTONE_STAIRS, Ingredient.of(Items.DRIPSTONE_BLOCK))
                .unlockedBy(getHasName(Items.DRIPSTONE_BLOCK),has(Items.DRIPSTONE_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.DRIPSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_STAIRS, Items.DRIPSTONE_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE, Items.COBBLESTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICKS, DecoBlocks.POLISHED_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_STAIRS, DecoBlocks.POLISHED_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_SLAB, DecoBlocks.POLISHED_STONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_WALL, DecoBlocks.POLISHED_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.CHISELED_STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICKS, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_STAIRS, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_SLAB, Items.COBBLESTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_WALL, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.CHISELED_STONE_BRICKS, Items.COBBLESTONE);

        stairBuilder(DecoBlocks.POLISHED_STONE_STAIRS, Ingredient.of(DecoBlocks.POLISHED_STONE))
                .unlockedBy(getHasName(DecoBlocks.POLISHED_STONE),has(DecoBlocks.POLISHED_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_STONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_STAIRS, DecoBlocks.POLISHED_STONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_STAIRS, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_SLAB, Items.COBBLESTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_WALL, Items.COBBLESTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, DecoBlocks.POLISHED_STONE);

        stairBuilder(DecoBlocks.STONE_TILE_STAIRS, Ingredient.of(DecoBlocks.STONE_TILES))
                .unlockedBy(getHasName(DecoBlocks.STONE_TILES),has(DecoBlocks.STONE_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.STONE_TILE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.STONE_TILES);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, Items.COBBLESTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, Items.COBBLESTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, Items.STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, Items.STONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, Items.STONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.POLISHED_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, DecoBlocks.POLISHED_STONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, DecoBlocks.POLISHED_STONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, Items.STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, Items.STONE_BRICKS,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, Items.STONE_BRICKS);

        stairBuilder(DecoBlocks.PACKED_MUD_STAIRS, Ingredient.of(Items.PACKED_MUD))
                .unlockedBy(getHasName(Items.PACKED_MUD),has(Items.PACKED_MUD))
                .save(output,getSimpleRecipeName(DecoBlocks.PACKED_MUD_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_MUD_SLAB, Items.PACKED_MUD);
        wall(RecipeCategory.DECORATIONS,DecoBlocks.PACKED_MUD_WALL, Items.PACKED_MUD);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.RED_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .define('/', Items.NETHER_BRICK)
                .define('#', Items.RED_NETHER_BRICKS)
                .unlockedBy(getHasName(Items.RED_NETHER_BRICKS),
                        has(Items.RED_NETHER_BRICKS))
                .save(output, getSimpleRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .define('/', Items.NETHER_BRICK)
                .define('#', Items.NETHER_BRICKS)
                .unlockedBy(getHasName(Items.NETHER_BRICKS),
                        has(Items.NETHER_BRICKS))
                .save(output, getSimpleRecipeName(DecoBlocks.NETHER_BRICK_FENCE_GATE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .define('/', Items.NETHER_BRICK)
                .define('#', Items.RED_NETHER_BRICKS)
                .unlockedBy(getHasName(Items.RED_NETHER_BRICKS),
                        has(Items.RED_NETHER_BRICKS))
                .save(output, getSimpleRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)+ "_recipe_create");

        stairBuilder(DecoBlocks.NETHERRACK_STAIRS, Ingredient.of(Items.NETHERRACK))
                .unlockedBy(getHasName(Items.NETHERRACK),has(Items.NETHERRACK))
                .save(output,getSimpleRecipeName(DecoBlocks.NETHERRACK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_STAIRS, Items.NETHERRACK);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_SLAB, Items.NETHERRACK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_SLAB, Items.NETHERRACK,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.NETHERRACK_WALL, Items.NETHERRACK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_WALL, Items.NETHERRACK);

        stairBuilder(DecoBlocks.MAGMA_STAIRS, Ingredient.of(Items.MAGMA_BLOCK))
                .unlockedBy(getHasName(Items.MAGMA_BLOCK),has(Items.MAGMA_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.MAGMA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_STAIRS, Items.MAGMA_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.MAGMA_WALL, Items.MAGMA_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_WALL, Items.MAGMA_BLOCK);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICKS, Items.MAGMA_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICKS, Items.MAGMA_BLOCK);

        stairBuilder(DecoBlocks.MAGMA_BRICK_STAIRS, Ingredient.of(DecoBlocks.MAGMA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.MAGMA_BRICKS),has(DecoBlocks.MAGMA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MAGMA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_STAIRS, Items.MAGMA_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_STAIRS, DecoBlocks.MAGMA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_SLAB, Items.MAGMA_BLOCK,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_WALL, Items.MAGMA_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MAGMA_BRICKS, Items.MAGMA_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICKS);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.BLACKSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE);

        stairBuilder(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Ingredient.of(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .unlockedBy(getHasName(DecoBlocks.POLISHED_BLACKSTONE_TILES),has(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.BLACKSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.BLACKSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.BLACKSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.POLISHED_BLACKSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.POLISHED_BLACKSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.POLISHED_BLACKSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.POLISHED_BLACKSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.POLISHED_BLACKSTONE_BRICKS,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.POLISHED_BLACKSTONE_BRICKS);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_GLIDED_BLACKSTONE,2)
                .pattern("P#")
                .pattern("#P")
                .define('P', Items.POLISHED_BLACKSTONE)
                .define('#', Items.GILDED_BLACKSTONE)
                .unlockedBy(getHasName(Items.GILDED_BLACKSTONE),
                        has(Items.GILDED_BLACKSTONE))
                .save(output, getSimpleRecipeName(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_GLIDED_BLACKSTONE, Items.GILDED_BLACKSTONE);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GLIDED_BLACKSTONE,4)
                .pattern(" # ")
                .pattern("#C#")
                .pattern(" # ")
                .define('C', Items.CHISELED_POLISHED_BLACKSTONE)
                .define('#', DecoBlocks.POLISHED_GLIDED_BLACKSTONE)
                .unlockedBy(getHasName(DecoBlocks.POLISHED_GLIDED_BLACKSTONE),
                        has(DecoBlocks.POLISHED_GLIDED_BLACKSTONE))
                .save(output, getSimpleRecipeName(DecoBlocks.CHISELED_GLIDED_BLACKSTONE)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GLIDED_BLACKSTONE, Items.GILDED_BLACKSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GLIDED_BLACKSTONE, DecoBlocks.POLISHED_GLIDED_BLACKSTONE);

        stairBuilder(DecoBlocks.SNOW_STAIRS, Ingredient.of(Items.SNOW_BLOCK))
                .unlockedBy(getHasName(Items.SNOW_BLOCK),has(Items.SNOW_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.SNOW_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SNOW_SLAB, Items.SNOW_BLOCK);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SNOW_WALL, Items.SNOW_BLOCK);

        stairBuilder(DecoBlocks.PACKED_ICE_STAIRS, Ingredient.of(Items.PACKED_ICE))
                .unlockedBy(getHasName(Items.PACKED_ICE),has(Items.PACKED_ICE))
                .save(output,getSimpleRecipeName(DecoBlocks.PACKED_ICE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_STAIRS, Items.PACKED_ICE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.PACKED_ICE_WALL, Items.PACKED_ICE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_WALL, Items.PACKED_ICE);

        stairBuilder(DecoBlocks.BLUE_ICE_STAIRS, Ingredient.of(Items.BLUE_ICE))
                .unlockedBy(getHasName(Items.BLUE_ICE),has(Items.BLUE_ICE))
                .save(output,getSimpleRecipeName(DecoBlocks.BLUE_ICE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_STAIRS, Items.BLUE_ICE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BLUE_ICE_WALL, Items.BLUE_ICE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_WALL, Items.BLUE_ICE);

        shapeless(RecipeCategory.MISC,DecoItems.SNOW_BRICK)
                .requires(Items.SNOWBALL)
                .requires(Items.SNOWBALL)
                .requires(Items.SNOWBALL)
                .requires(DecoItems.ICE_SHARD)
                .unlockedBy(getHasName(Items.SNOWBALL),
                        has(Items.SNOWBALL))
                .save(output,getSimpleRecipeName(DecoItems.SNOW_BRICK)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SNOW_BRICKS)
                .pattern("##")
                .pattern("##")
                .define('#', DecoItems.SNOW_BRICK)
                .unlockedBy(getHasName(DecoItems.SNOW_BRICK),
                        has(DecoItems.SNOW_BRICK))
                .save(output, getSimpleRecipeName(DecoBlocks.SNOW_BRICKS)+ "_recipe_create");

        stairBuilder(DecoBlocks.SNOW_BRICK_STAIRS, Ingredient.of(DecoBlocks.SNOW_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.SNOW_BRICKS),has(DecoBlocks.SNOW_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.SNOW_BRICK_STAIRS)+ "_recipe_create");

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SNOW_BRICK_SLAB, DecoBlocks.SNOW_BRICKS);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SNOW_BRICK_WALL, DecoBlocks.SNOW_BRICKS);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_SNOW_BRICKS)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('S', Items.SNOWBALL)
                .define('#', DecoItems.SNOW_BRICK)
                .unlockedBy(getHasName(DecoItems.SNOW_BRICK),
                        has(DecoItems.SNOW_BRICK))
                .save(output, getSimpleRecipeName(DecoBlocks.CHISELED_SNOW_BRICKS)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICKS,4)
                .pattern("/#")
                .pattern("#/")
                .define('/', Items.BLUE_ICE)
                .define('#', Items.PACKED_ICE)
                .unlockedBy(getHasName(Items.PACKED_ICE),
                        has(Items.PACKED_ICE))
                .save(output, getSimpleRecipeName(DecoBlocks.ICE_BRICKS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICKS, Items.BLUE_ICE);

        stairBuilder(DecoBlocks.ICE_BRICK_STAIRS, Ingredient.of(DecoBlocks.ICE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.ICE_BRICKS),has(DecoBlocks.ICE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.ICE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_STAIRS, Items.BLUE_ICE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_STAIRS, DecoBlocks.ICE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_SLAB, DecoBlocks.ICE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_SLAB, Items.BLUE_ICE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_SLAB, DecoBlocks.ICE_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.ICE_BRICK_WALL, DecoBlocks.ICE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_WALL, Items.BLUE_ICE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_WALL, DecoBlocks.ICE_BRICKS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.BLACK_ICE)
                .pattern("/#/")
                .pattern("#/#")
                .pattern("/#/")
                .define('/', Items.BLUE_ICE)
                .define('#', Items.PACKED_ICE)
                .unlockedBy(getHasName(Items.BLUE_ICE),
                        has(Items.BLUE_ICE))
                .save(output, getSimpleRecipeName(DecoBlocks.BLACK_ICE)+ "_recipe_create");

        stairBuilder(DecoBlocks.CUT_SANDSTONE_STAIRS, Ingredient.of(Items.CUT_SANDSTONE))
                .unlockedBy(getHasName(Items.CUT_SANDSTONE),has(Items.CUT_SANDSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_SANDSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_STAIRS, Items.SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_STAIRS, Items.CUT_SANDSTONE);

        stairBuilder(DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Ingredient.of(Items.CUT_RED_SANDSTONE))
                .unlockedBy(getHasName(Items.CUT_RED_SANDSTONE),has(Items.CUT_RED_SANDSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_RED_SANDSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Items.CUT_RED_SANDSTONE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_SANDSTONE_WALL, Items.CUT_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_WALL, Items.SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_WALL, Items.CUT_SANDSTONE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.CUT_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.CUT_RED_SANDSTONE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICKS, Items.CUT_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICKS, Items.SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICKS, Items.CUT_SANDSTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.CUT_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.CUT_RED_SANDSTONE);

        stairBuilder(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.CUT_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CUT_SANDSTONE_BRICKS),has(DecoBlocks.CUT_SANDSTONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Items.SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Items.CUT_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_SANDSTONE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_SANDSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, Items.SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, Items.CUT_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_SANDSTONE_BRICKS);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_SANDSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, Items.SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, Items.CUT_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_SANDSTONE_BRICKS);

        stairBuilder(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.CUT_RED_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CUT_RED_SANDSTONE_BRICKS),has(DecoBlocks.CUT_RED_SANDSTONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Items.RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Items.CUT_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Items.RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Items.CUT_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, Items.RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, Items.CUT_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .requires(Items.CACTUS)
                .group("planks")
                .unlockedBy(getHasName(Items.CACTUS),
                        has(Items.CACTUS))
                .save(output, getSimpleRecipeName(DecoBlocks.CACTUS_PLANKS)+ "_recipe_create");

        stairBuilder(DecoBlocks.CACTUS_PLANK_STAIRS, Ingredient.of(DecoBlocks.CACTUS_PLANKS))
                .group("wooden_stairs")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANKS),has(DecoBlocks.CACTUS_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CACTUS_PLANK_STAIRS)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANK_SLAB,6)
                .pattern("###")
                .define('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_slab")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANKS),
                        has(DecoBlocks.CACTUS_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.CACTUS_PLANK_SLAB)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.CACTUS_PLANK_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .define('/', Items.STICK)
                .define('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_fence")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANKS),
                        has(DecoBlocks.CACTUS_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.CACTUS_PLANK_FENCE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_PLANK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .define('/', Items.STICK)
                .define('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_fence_fence")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANKS),
                        has(DecoBlocks.CACTUS_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.CACTUS_PLANK_FENCE_GATE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE)
                .pattern("##")
                .define('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANKS),
                        has(DecoBlocks.CACTUS_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE)+ "_recipe_create");

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_PLANK_BUTTON)
                .requires(DecoBlocks.CACTUS_PLANKS)
                .group("wooden_button")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANKS),
                        has(DecoBlocks.CACTUS_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.CACTUS_PLANK_BUTTON)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_door")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANKS),
                        has(DecoBlocks.CACTUS_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.CACTUS_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANKS),
                        has(DecoBlocks.CACTUS_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.CACTUS_TRAPDOOR)+ "_recipe_create");

        signBuilder(DecoItems.CACTUS_SIGN, Ingredient.of(DecoBlocks.CACTUS_PLANKS))
                .group("wooden_sign")
                .unlockedBy(getHasName(DecoBlocks.CACTUS_PLANKS),has(DecoBlocks.CACTUS_PLANKS))
                .save(output,getSimpleRecipeName(DecoItems.CACTUS_SIGN)+ "_recipe_create");

        wall(RecipeCategory.DECORATIONS,DecoBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE)
                .pattern("##")
                .pattern("##")
                .define('#', Items.PRISMARINE_CRYSTALS)
                .unlockedBy(getHasName(Items.PRISMARINE_CRYSTALS),
                        has(Items.PRISMARINE_CRYSTALS))
                .save(output, getSimpleRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE)+ "_recipe_create");

        stairBuilder(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS, Ingredient.of(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .unlockedBy(getHasName(DecoBlocks.CRYSTALLIZED_PRISMARINE),has(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .save(output,getSimpleRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.CRYSTALLIZED_PRISMARINE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        Items.SEA_LANTERN, 0.35f, 200)
                .unlockedBy(getHasName(DecoBlocks.CRYSTALLIZED_PRISMARINE), has(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .save(output,"sea_lantern_from_smelting"+ "_recipe_create");

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        stairBuilder(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, Ingredient.of(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS),has(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .save(output,getSimpleRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_PRISMARINE,8)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .define('#', DecoBlocks.CRYSTALLIZED_PRISMARINE)
                .define('I', Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(DecoBlocks.CRYSTALLIZED_PRISMARINE),
                        has(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .unlockedBy(getHasName(Items.AMETHYST_SHARD),
                        has(Items.AMETHYST_SHARD))
                .save(output, getSimpleRecipeName(DecoBlocks.LIGHT_PRISMARINE)+ "_recipe_create");

        stairBuilder(DecoBlocks.LIGHT_PRISMARINE_STAIRS, Ingredient.of(DecoBlocks.LIGHT_PRISMARINE))
                .unlockedBy(getHasName(DecoBlocks.LIGHT_PRISMARINE),has(DecoBlocks.LIGHT_PRISMARINE))
                .save(output,getSimpleRecipeName(DecoBlocks.LIGHT_PRISMARINE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_STAIRS, DecoBlocks.LIGHT_PRISMARINE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_SLAB, DecoBlocks.LIGHT_PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_SLAB, DecoBlocks.LIGHT_PRISMARINE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_PRISMARINE_WALL, DecoBlocks.LIGHT_PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_WALL, DecoBlocks.LIGHT_PRISMARINE);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_PRISMARINE_BRICKS,4)
                .pattern(" # ")
                .pattern("#I#")
                .pattern(" # ")
                .define('#', Items.PRISMARINE_BRICKS)
                .define('I', DecoBlocks.CRYSTALLIZED_PRISMARINE)
                .unlockedBy(getHasName(Items.PRISMARINE_BRICKS),
                        has(Items.PRISMARINE_BRICKS))
                .save(output, getSimpleRecipeName(DecoBlocks.CHISELED_PRISMARINE_BRICKS)+ "_recipe_create");
        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)
                .pattern(" # ")
                .pattern("#I#")
                .pattern(" # ")
                .define('#', DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)
                .define('I', Items.PRISMARINE)
                .unlockedBy(getHasName(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS),
                        has(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS))
                .save(output, getSimpleRecipeName(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_BLOCK)
                .pattern("#I")
                .pattern("I#")
                .define('#', Items.COBBLESTONE)
                .define('I', DecoItems.BUBBLE_ORB)
                .unlockedBy(getHasName(DecoItems.BUBBLE_ORB),
                        has(DecoItems.BUBBLE_ORB))
                .save(output,getSimpleRecipeName(DecoBlocks.BUBBLE_BLOCK)+ "_recipe_create");

        stairBuilder(DecoBlocks.BUBBLE_STAIRS, Ingredient.of(DecoBlocks.BUBBLE_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.BUBBLE_BLOCK),has(DecoBlocks.BUBBLE_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.BUBBLE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_STAIRS, DecoBlocks.BUBBLE_BLOCK);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_SLAB, DecoBlocks.BUBBLE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_SLAB, DecoBlocks.BUBBLE_BLOCK);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BUBBLE_WALL, DecoBlocks.BUBBLE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_WALL, DecoBlocks.BUBBLE_BLOCK);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);

        stairBuilder(DecoBlocks.BUBBLE_BRICK_STAIRS, Ingredient.of(DecoBlocks.BUBBLE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.BUBBLE_BRICKS),has(DecoBlocks.BUBBLE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.BUBBLE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_STAIRS, DecoBlocks.BUBBLE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_STAIRS, DecoBlocks.BUBBLE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BRICKS);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BRICKS);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BRICKS);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SOUL_SOILSTONE)
                .pattern("##")
                .pattern("##")
                .define('#', DecoTags.Items.SOUL_GROUND_BLOCKS)
                .unlockedBy("has_soul_blocks", has(DecoTags.Items.SOUL_GROUND_BLOCKS))
                .save(output, getSimpleRecipeName(DecoBlocks.SOUL_SOILSTONE)+ "_recipe_create");

        stairBuilder(DecoBlocks.SOUL_SOILSTONE_STAIRS, Ingredient.of(DecoBlocks.SOUL_SOILSTONE))
                .unlockedBy(getHasName(DecoBlocks.SOUL_SOILSTONE),has(DecoBlocks.SOUL_SOILSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.SOUL_SOILSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        stairBuilder(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, Ingredient.of(DecoBlocks.CUT_SOUL_SOILSTONE))
                .unlockedBy(getHasName(DecoBlocks.CUT_SOUL_SOILSTONE),has(DecoBlocks.CUT_SOUL_SOILSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.SOUL_SOILSTONE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, 
                        DecoBlocks.SMOOTH_SOUL_SOILSTONE,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.SOUL_SOILSTONE), has(DecoBlocks.SOUL_SOILSTONE))
                .save(output,"smooth_soul_soilstone_from_smelting"+ "_recipe_create");

        stairBuilder(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS, Ingredient.of(DecoBlocks.SMOOTH_SOUL_SOILSTONE))
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_SOUL_SOILSTONE),has(DecoBlocks.SMOOTH_SOUL_SOILSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL, DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.CUT_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.CUT_SOUL_SOILSTONE);

        stairBuilder(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS),has(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.QUARTZ_WALL, Items.QUARTZ_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_WALL, Items.QUARTZ_BLOCK);
        wall(RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ);

        stairBuilder(DecoBlocks.QUARTZ_BRICK_STAIRS, Ingredient.of(Items.QUARTZ_BRICKS))
                .unlockedBy(getHasName(Items.QUARTZ_BRICKS),has(Items.QUARTZ_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.QUARTZ_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ,4)
                .pattern("#Q")
                .pattern("Q#")
                .define('#', Items.QUARTZ_BLOCK)
                .define('Q', Items.QUARTZ)
                .unlockedBy(getHasName(Items.QUARTZ_BLOCK),
                        has(Items.QUARTZ_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.CUT_QUARTZ)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ, Items.QUARTZ_BLOCK);

        stairBuilder(DecoBlocks.CUT_QUARTZ_STAIRS, Ingredient.of(DecoBlocks.CUT_QUARTZ))
                .unlockedBy(getHasName(DecoBlocks.CUT_QUARTZ),has(DecoBlocks.CUT_QUARTZ))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_QUARTZ_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_STAIRS, Items.QUARTZ_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_STAIRS, DecoBlocks.CUT_QUARTZ);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_SLAB, DecoBlocks.CUT_QUARTZ);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_SLAB, Items.QUARTZ_BLOCK,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_SLAB, DecoBlocks.CUT_QUARTZ,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_QUARTZ_WALL, DecoBlocks.CUT_QUARTZ);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_WALL, Items.QUARTZ_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_WALL, DecoBlocks.CUT_QUARTZ);

        shaped(RecipeCategory.BUILDING_BLOCKS,Items.WARPED_WART_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', DecoItems.WARPED_WART)
                .unlockedBy(getHasName(DecoItems.WARPED_WART),
                        has(DecoItems.WARPED_WART))
                .save(output, getSimpleRecipeName(Items.WARPED_WART_BLOCK)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_RED_NETHER_BRICKS)
                .pattern("##")
                .pattern("##")
                .define('#', Items.RED_NETHER_BRICK_SLAB)
                .unlockedBy(getHasName(Items.RED_NETHER_BRICK_SLAB),
                        has(Items.RED_NETHER_BRICK_SLAB))
                .save(output, getSimpleRecipeName(DecoBlocks.CHISELED_RED_NETHER_BRICKS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICKS);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RED_NETHER_BRICKS),RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.CRACKED_RED_NETHER_BRICKS,
                        0.1f, 200).unlockedBy(getHasName(Items.RED_NETHER_BRICKS), has(Items.RED_NETHER_BRICKS))
                .save(output,"cracked_red_nether_bricks_from_smelting"+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICKS)
                .pattern("N#")
                .pattern("#N")
                .define('#', DecoItems.WARPED_WART)
                .define('N', Items.NETHER_BRICK)
                .unlockedBy(getHasName(DecoItems.WARPED_WART),
                        has(DecoItems.WARPED_WART))
                .save(output, getSimpleRecipeName(DecoBlocks.BLUE_NETHER_BRICKS)+ "_recipe_create");

        stairBuilder(DecoBlocks.BLUE_NETHER_BRICK_STAIRS, Ingredient.of(DecoBlocks.BLUE_NETHER_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.BLUE_NETHER_BRICKS),has(DecoBlocks.BLUE_NETHER_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.BLUE_NETHER_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_STAIRS, DecoBlocks.BLUE_NETHER_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_SLAB, DecoBlocks.BLUE_NETHER_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_SLAB, DecoBlocks.BLUE_NETHER_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BLUE_NETHER_BRICK_WALL, DecoBlocks.BLUE_NETHER_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_WALL, DecoBlocks.BLUE_NETHER_BRICKS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.BLUE_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .define('/', Items.NETHER_BRICK)
                .define('#', DecoBlocks.BLUE_NETHER_BRICKS)
                .unlockedBy(getHasName(DecoBlocks.BLUE_NETHER_BRICKS),
                        has(DecoBlocks.BLUE_NETHER_BRICKS))
                .save(output, getSimpleRecipeName(DecoBlocks.BLUE_NETHER_BRICK_FENCE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .define('/', Items.NETHER_BRICK)
                .define('#', DecoBlocks.BLUE_NETHER_BRICKS)
                .unlockedBy(getHasName(DecoBlocks.BLUE_NETHER_BRICKS),
                        has(DecoBlocks.BLUE_NETHER_BRICKS))
                .save(output, getSimpleRecipeName(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_BLUE_NETHER_BRICKS)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.BLUE_NETHER_BRICK_SLAB)
                .unlockedBy(getHasName(DecoBlocks.BLUE_NETHER_BRICK_SLAB),
                        has(DecoBlocks.BLUE_NETHER_BRICK_SLAB))
                .save(output, getSimpleRecipeName(DecoBlocks.CHISELED_BLUE_NETHER_BRICKS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_BLUE_NETHER_BRICKS, DecoBlocks.BLUE_NETHER_BRICKS);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.BLUE_NETHER_BRICKS),RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.CRACKED_BLUE_NETHER_BRICKS,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.BLUE_NETHER_BRICKS), has(DecoBlocks.BLUE_NETHER_BRICKS))
                .save(output, getSimpleRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS)+ "_recipe_create");

        shaped(RecipeCategory.MISC,Items.ENDER_PEARL)
                .pattern(" # ")
                .pattern("#F#")
                .pattern(" # ")
                .define('#', DecoItems.WARPED_WART)
                .define('F', Items.CHORUS_FRUIT)
                .unlockedBy(getHasName(Items.CHORUS_FRUIT),
                        has(Items.CHORUS_FRUIT))
                .save(output, getSimpleRecipeName(Items.ENDER_PEARL)+ "_recipe_create");

        shaped(RecipeCategory.MISC,Items.ENDER_EYE)
                .pattern(" # ")
                .pattern("#F#")
                .pattern(" #B")
                .define('#', DecoItems.WARPED_WART)
                .define('F', Items.CHORUS_FRUIT)
                .define('B', Items.BLAZE_POWDER)
                .unlockedBy(getHasName(Items.CHORUS_FRUIT),
                        has(Items.CHORUS_FRUIT))
                .save(output,"ender_eye_from_warped_wart"+ "_recipe_create");

        stairBuilder(DecoBlocks.TERRACOTTA_STAIRS, Ingredient.of(Items.TERRACOTTA))
                .unlockedBy(getHasName(Items.TERRACOTTA),has(Items.TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_STAIRS, Items.TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_SLAB, Items.TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_SLAB, Items.TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.TERRACOTTA_WALL, Items.TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_WALL, Items.TERRACOTTA);

        stairBuilder(DecoBlocks.WHITE_TERRACOTTA_STAIRS, Ingredient.of(Items.WHITE_TERRACOTTA))
                .unlockedBy(getHasName(Items.WHITE_TERRACOTTA),has(Items.WHITE_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.WHITE_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_STAIRS, Items.WHITE_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_SLAB, Items.WHITE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_SLAB, Items.WHITE_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.WHITE_TERRACOTTA_WALL, Items.WHITE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_WALL, Items.WHITE_TERRACOTTA);

        stairBuilder(DecoBlocks.BLACK_TERRACOTTA_STAIRS, Ingredient.of(Items.BLACK_TERRACOTTA))
                .unlockedBy(getHasName(Items.BLACK_TERRACOTTA),has(Items.BLACK_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.BLACK_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_STAIRS, Items.BLACK_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_SLAB, Items.BLACK_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_SLAB, Items.BLACK_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BLACK_TERRACOTTA_WALL, Items.BLACK_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_WALL, Items.BLACK_TERRACOTTA);

        stairBuilder(DecoBlocks.GRAY_TERRACOTTA_STAIRS, Ingredient.of(Items.GRAY_TERRACOTTA))
                .unlockedBy(getHasName(Items.GRAY_TERRACOTTA),has(Items.GRAY_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.GRAY_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_STAIRS, Items.GRAY_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_SLAB, Items.GRAY_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_SLAB, Items.GRAY_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.GRAY_TERRACOTTA_WALL, Items.GRAY_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_WALL, Items.GRAY_TERRACOTTA);

        stairBuilder(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Ingredient.of(Items.LIGHT_GRAY_TERRACOTTA))
                .unlockedBy(getHasName(Items.LIGHT_GRAY_TERRACOTTA),has(Items.LIGHT_GRAY_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Items.LIGHT_GRAY_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Items.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Items.LIGHT_GRAY_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Items.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Items.LIGHT_GRAY_TERRACOTTA);

        stairBuilder(DecoBlocks.BROWN_TERRACOTTA_STAIRS, Ingredient.of(Items.BROWN_TERRACOTTA))
                .unlockedBy(getHasName(Items.BROWN_TERRACOTTA),has(Items.BROWN_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.BROWN_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_STAIRS, Items.BROWN_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_SLAB, Items.BROWN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_SLAB, Items.BROWN_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BROWN_TERRACOTTA_WALL, Items.BROWN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_WALL, Items.BROWN_TERRACOTTA);

        stairBuilder(DecoBlocks.RED_TERRACOTTA_STAIRS, Ingredient.of(Items.RED_TERRACOTTA))
                .unlockedBy(getHasName(Items.RED_TERRACOTTA),has(Items.RED_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.RED_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_STAIRS, Items.RED_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_SLAB, Items.RED_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_SLAB, Items.RED_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.RED_TERRACOTTA_WALL, Items.RED_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_WALL, Items.RED_TERRACOTTA);

        stairBuilder(DecoBlocks.ORANGE_TERRACOTTA_STAIRS, Ingredient.of(Items.ORANGE_TERRACOTTA))
                .unlockedBy(getHasName(Items.ORANGE_TERRACOTTA),has(Items.ORANGE_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.ORANGE_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_STAIRS, Items.ORANGE_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_SLAB, Items.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_SLAB, Items.ORANGE_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_TERRACOTTA_WALL, Items.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_WALL, Items.ORANGE_TERRACOTTA);

        stairBuilder(DecoBlocks.YELLOW_TERRACOTTA_STAIRS, Ingredient.of(Items.YELLOW_TERRACOTTA))
                .unlockedBy(getHasName(Items.YELLOW_TERRACOTTA),has(Items.YELLOW_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.YELLOW_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_STAIRS, Items.YELLOW_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_SLAB, Items.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_SLAB, Items.YELLOW_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.YELLOW_TERRACOTTA_WALL, Items.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_WALL, Items.YELLOW_TERRACOTTA);

        stairBuilder(DecoBlocks.LIME_TERRACOTTA_STAIRS, Ingredient.of(Items.LIME_TERRACOTTA))
                .unlockedBy(getHasName(Items.LIME_TERRACOTTA),has(Items.LIME_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.LIME_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_STAIRS, Items.LIME_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_SLAB, Items.LIME_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_SLAB, Items.LIME_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.LIME_TERRACOTTA_WALL, Items.LIME_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_WALL, Items.LIME_TERRACOTTA);

        stairBuilder(DecoBlocks.GREEN_TERRACOTTA_STAIRS, Ingredient.of(Items.GREEN_TERRACOTTA))
                .unlockedBy(getHasName(Items.GREEN_TERRACOTTA),has(Items.GREEN_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.GREEN_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_STAIRS, Items.GREEN_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_SLAB, Items.GREEN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_SLAB, Items.GREEN_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.GREEN_TERRACOTTA_WALL, Items.GREEN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_WALL, Items.GREEN_TERRACOTTA);

        stairBuilder(DecoBlocks.CYAN_TERRACOTTA_STAIRS, Ingredient.of(Items.CYAN_TERRACOTTA))
                .unlockedBy(getHasName(Items.CYAN_TERRACOTTA),has(Items.CYAN_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.CYAN_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_STAIRS, Items.CYAN_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_SLAB, Items.CYAN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_SLAB, Items.CYAN_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CYAN_TERRACOTTA_WALL, Items.CYAN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_WALL, Items.CYAN_TERRACOTTA);

        stairBuilder(DecoBlocks.BLUE_TERRACOTTA_STAIRS, Ingredient.of(Items.BLUE_TERRACOTTA))
                .unlockedBy(getHasName(Items.BLUE_TERRACOTTA),has(Items.BLUE_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.BLUE_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_STAIRS, Items.BLUE_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_SLAB, Items.BLUE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_SLAB, Items.BLUE_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BLUE_TERRACOTTA_WALL, Items.BLUE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_WALL, Items.BLUE_TERRACOTTA,2);

        stairBuilder(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Ingredient.of(Items.LIGHT_BLUE_TERRACOTTA))
                .unlockedBy(getHasName(Items.LIGHT_BLUE_TERRACOTTA),has(Items.LIGHT_BLUE_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Items.LIGHT_BLUE_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Items.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Items.LIGHT_BLUE_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Items.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Items.LIGHT_BLUE_TERRACOTTA);

        stairBuilder(DecoBlocks.PURPLE_TERRACOTTA_STAIRS, Ingredient.of(Items.PURPLE_TERRACOTTA))
                .unlockedBy(getHasName(Items.PURPLE_TERRACOTTA),has(Items.PURPLE_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.PURPLE_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_STAIRS, Items.PURPLE_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_SLAB, Items.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_SLAB, Items.PURPLE_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_TERRACOTTA_WALL, Items.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_WALL, Items.PURPLE_TERRACOTTA);

        stairBuilder(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS, Ingredient.of(Items.MAGENTA_TERRACOTTA))
                .unlockedBy(getHasName(Items.MAGENTA_TERRACOTTA),has(Items.MAGENTA_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_STAIRS, Items.MAGENTA_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_SLAB, Items.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_SLAB, Items.MAGENTA_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_TERRACOTTA_WALL, Items.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_WALL, Items.MAGENTA_TERRACOTTA);

        stairBuilder(DecoBlocks.PINK_TERRACOTTA_STAIRS, Ingredient.of(Items.PINK_TERRACOTTA))
                .unlockedBy(getHasName(Items.PINK_TERRACOTTA),has(Items.PINK_TERRACOTTA))
                .save(output,getSimpleRecipeName(DecoBlocks.PINK_TERRACOTTA_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_STAIRS, Items.PINK_TERRACOTTA);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_SLAB, Items.PINK_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_SLAB, Items.PINK_TERRACOTTA,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.PINK_TERRACOTTA_WALL, Items.PINK_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_WALL, Items.PINK_TERRACOTTA);

        stairBuilder(DecoBlocks.WHITE_CONCRETE_STAIRS, Ingredient.of(Items.WHITE_CONCRETE))
                .unlockedBy(getHasName(Items.WHITE_CONCRETE),has(Items.WHITE_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.WHITE_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_STAIRS, Items.WHITE_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);

        stairBuilder(DecoBlocks.BLACK_CONCRETE_STAIRS, Ingredient.of(Items.BLACK_CONCRETE))
                .unlockedBy(getHasName(Items.BLACK_CONCRETE),has(Items.BLACK_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.BLACK_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_STAIRS, Items.BLACK_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);

        stairBuilder(DecoBlocks.GRAY_CONCRETE_STAIRS, Ingredient.of(Items.GRAY_CONCRETE))
                .unlockedBy(getHasName(Items.GRAY_CONCRETE),has(Items.GRAY_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.GRAY_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_STAIRS, Items.GRAY_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);

        stairBuilder(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(Items.LIGHT_GRAY_CONCRETE))
                .unlockedBy(getHasName(Items.LIGHT_GRAY_CONCRETE),has(Items.LIGHT_GRAY_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Items.LIGHT_GRAY_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);

        stairBuilder(DecoBlocks.BROWN_CONCRETE_STAIRS, Ingredient.of(Items.BROWN_CONCRETE))
                .unlockedBy(getHasName(Items.BROWN_CONCRETE),has(Items.BROWN_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.BROWN_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_STAIRS, Items.BROWN_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);

        stairBuilder(DecoBlocks.RED_CONCRETE_STAIRS, Ingredient.of(Items.RED_CONCRETE))
                .unlockedBy(getHasName(Items.RED_CONCRETE),has(Items.RED_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.RED_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_STAIRS, Items.RED_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_SLAB, Items.RED_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_SLAB, Items.RED_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.RED_CONCRETE_WALL, Items.RED_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_WALL, Items.RED_CONCRETE);

        stairBuilder(DecoBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.of(Items.ORANGE_CONCRETE))
                .unlockedBy(getHasName(Items.ORANGE_CONCRETE),has(Items.ORANGE_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.ORANGE_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_STAIRS, Items.ORANGE_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE);

        stairBuilder(DecoBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.of(Items.YELLOW_CONCRETE))
                .unlockedBy(getHasName(Items.YELLOW_CONCRETE),has(Items.YELLOW_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.YELLOW_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_STAIRS, Items.YELLOW_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);

        stairBuilder(DecoBlocks.LIME_CONCRETE_STAIRS, Ingredient.of(Items.LIME_CONCRETE))
                .unlockedBy(getHasName(Items.LIME_CONCRETE),has(Items.LIME_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.LIME_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_STAIRS, Items.LIME_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_SLAB, Items.LIME_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_SLAB, Items.LIME_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.LIME_CONCRETE_WALL, Items.LIME_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_WALL, Items.LIME_CONCRETE);

        stairBuilder(DecoBlocks.GREEN_CONCRETE_STAIRS, Ingredient.of(Items.GREEN_CONCRETE))
                .unlockedBy(getHasName(Items.GREEN_CONCRETE),has(Items.GREEN_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.GREEN_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_STAIRS, Items.GREEN_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);

        stairBuilder(DecoBlocks.CYAN_CONCRETE_STAIRS, Ingredient.of(Items.CYAN_CONCRETE))
                .unlockedBy(getHasName(Items.CYAN_CONCRETE),has(Items.CYAN_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CYAN_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_STAIRS, Items.CYAN_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);

        stairBuilder(DecoBlocks.BLUE_CONCRETE_STAIRS, Ingredient.of(Items.BLUE_CONCRETE))
                .unlockedBy(getHasName(Items.BLUE_CONCRETE),has(Items.BLUE_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.BLUE_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_STAIRS, Items.BLUE_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);

        stairBuilder(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(Items.LIGHT_BLUE_CONCRETE))
                .unlockedBy(getHasName(Items.LIGHT_BLUE_CONCRETE),has(Items.LIGHT_BLUE_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Items.LIGHT_BLUE_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);

        stairBuilder(DecoBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.of(Items.PURPLE_CONCRETE))
                .unlockedBy(getHasName(Items.PURPLE_CONCRETE),has(Items.PURPLE_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.PURPLE_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_STAIRS, Items.PURPLE_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);

        stairBuilder(DecoBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.of(Items.MAGENTA_CONCRETE))
                .unlockedBy(getHasName(Items.MAGENTA_CONCRETE),has(Items.MAGENTA_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.MAGENTA_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_STAIRS, Items.MAGENTA_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);

        stairBuilder(DecoBlocks.PINK_CONCRETE_STAIRS, Ingredient.of(Items.PINK_CONCRETE))
                .unlockedBy(getHasName(Items.PINK_CONCRETE),has(Items.PINK_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.PINK_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_STAIRS, Items.PINK_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_SLAB, Items.PINK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_SLAB, Items.PINK_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.PINK_CONCRETE_WALL, Items.PINK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_WALL, Items.PINK_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICKS, Items.TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICKS, Items.TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.WHITE_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_white_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS, Items.WHITE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS, Items.WHITE_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.LIGHT_GRAY_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_light_gray_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.LIGHT_GRAY_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.GRAY_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_gray_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS, Items.GRAY_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS, Items.GRAY_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.BLACK_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_black_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS, Items.BLACK_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS, Items.BLACK_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.BROWN_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_brown_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS, Items.BROWN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS, Items.BROWN_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.RED_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_red_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICKS, Items.RED_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICKS, Items.RED_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.ORANGE_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_orange_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS, Items.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS, Items.ORANGE_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.YELLOW_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_yellow_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS, Items.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS, Items.YELLOW_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.LIME_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_lime_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICKS, Items.LIME_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICKS, Items.LIME_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.GREEN_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_green_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS, Items.GREEN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS, Items.GREEN_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.CYAN_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_cyan_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS, Items.CYAN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS, Items.CYAN_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.LIGHT_BLUE_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_light_blue_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.LIGHT_BLUE_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.BLUE_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_blue_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS, Items.BLUE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS, Items.BLUE_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.PURPLE_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_purple_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS, Items.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS, Items.PURPLE_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.MAGENTA_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_magenta_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS, Items.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS, Items.MAGENTA_TERRACOTTA);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', DecoBlocks.TERRACOTTA_BRICKS)
                .define('X', Items.PINK_DYE)
                .group("terracotta_bricks")
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),
                        has(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .save(output,"dye_pink_terracotta_bricks"+ "_recipe_create");
        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICKS, Items.PINK_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICKS, Items.PINK_TERRACOTTA);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE, Items.WHITE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE, Items.WHITE_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE, Items.GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE, Items.GRAY_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE, Items.BLACK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE, Items.BLACK_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE, Items.BROWN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE, Items.BROWN_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE, Items.RED_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE, Items.RED_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE, Items.ORANGE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE, Items.ORANGE_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE, Items.YELLOW_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE, Items.YELLOW_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE, Items.LIME_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE, Items.LIME_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE, Items.GREEN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE, Items.GREEN_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE, Items.CYAN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE, Items.CYAN_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE, Items.BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE, Items.BLUE_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE, Items.PURPLE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE, Items.PURPLE_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE, Items.PINK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE, Items.PINK_CONCRETE);

        stairBuilder(DecoBlocks.TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.TERRACOTTA_BRICKS),has(DecoBlocks.TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_STAIRS, Items.TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_STAIRS, DecoBlocks.TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_SLAB, DecoBlocks.TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_SLAB, Items.TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_SLAB, DecoBlocks.TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.TERRACOTTA_BRICK_WALL, DecoBlocks.TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_WALL, Items.TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_WALL, DecoBlocks.TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.WHITE_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.WHITE_TERRACOTTA_BRICKS),has(DecoBlocks.WHITE_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, Items.WHITE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.WHITE_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, Items.WHITE_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, DecoBlocks.WHITE_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, Items.WHITE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, DecoBlocks.WHITE_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.BLACK_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.BLACK_TERRACOTTA_BRICKS),has(DecoBlocks.BLACK_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, Items.BLACK_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BLACK_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, Items.BLACK_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLACK_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, Items.BLACK_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, DecoBlocks.BLACK_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.GRAY_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.GRAY_TERRACOTTA_BRICKS),has(DecoBlocks.GRAY_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, Items.GRAY_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, DecoBlocks.GRAY_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, Items.GRAY_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.GRAY_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, Items.GRAY_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.GRAY_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS),has(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, Items.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, Items.LIGHT_GRAY_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, Items.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.BROWN_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.BROWN_TERRACOTTA_BRICKS),has(DecoBlocks.BROWN_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, Items.BROWN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BROWN_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, Items.BROWN_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, DecoBlocks.BROWN_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, Items.BROWN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, DecoBlocks.BROWN_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.RED_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.RED_TERRACOTTA_BRICKS),has(DecoBlocks.RED_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, Items.RED_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, DecoBlocks.RED_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, DecoBlocks.RED_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, Items.RED_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, DecoBlocks.RED_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.RED_TERRACOTTA_BRICK_WALL, DecoBlocks.RED_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_WALL, Items.RED_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_WALL, DecoBlocks.RED_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.ORANGE_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.ORANGE_TERRACOTTA_BRICKS),has(DecoBlocks.ORANGE_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, Items.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, Items.ORANGE_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, DecoBlocks.ORANGE_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, Items.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.YELLOW_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.YELLOW_TERRACOTTA_BRICKS),has(DecoBlocks.YELLOW_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, Items.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, Items.YELLOW_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, DecoBlocks.YELLOW_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, Items.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.LIME_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.LIME_TERRACOTTA_BRICKS),has(DecoBlocks.LIME_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, Items.LIME_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIME_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIME_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, Items.LIME_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIME_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, DecoBlocks.LIME_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, Items.LIME_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, DecoBlocks.LIME_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.GREEN_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.GREEN_TERRACOTTA_BRICKS),has(DecoBlocks.GREEN_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, Items.GREEN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.GREEN_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, Items.GREEN_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, DecoBlocks.GREEN_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, Items.GREEN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, DecoBlocks.GREEN_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.CYAN_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.CYAN_TERRACOTTA_BRICKS),has(DecoBlocks.CYAN_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, Items.CYAN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.CYAN_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, Items.CYAN_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, DecoBlocks.CYAN_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, Items.CYAN_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, DecoBlocks.CYAN_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.BLUE_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.BLUE_TERRACOTTA_BRICKS),has(DecoBlocks.BLUE_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, Items.BLUE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BLUE_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, Items.BLUE_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLUE_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, Items.BLUE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.BLUE_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS),has(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, Items.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, Items.LIGHT_BLUE_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, Items.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.PURPLE_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.PURPLE_TERRACOTTA_BRICKS),has(DecoBlocks.PURPLE_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, Items.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, Items.PURPLE_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, DecoBlocks.PURPLE_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, Items.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS),has(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, Items.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, Items.MAGENTA_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, Items.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, Ingredient.of(DecoBlocks.PINK_TERRACOTTA_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.PINK_TERRACOTTA_BRICKS),has(DecoBlocks.PINK_TERRACOTTA_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, Items.PINK_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, DecoBlocks.PINK_TERRACOTTA_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, DecoBlocks.PINK_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, Items.PINK_TERRACOTTA,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, DecoBlocks.PINK_TERRACOTTA_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, DecoBlocks.PINK_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, Items.PINK_TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, DecoBlocks.PINK_TERRACOTTA_BRICKS);

        stairBuilder(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_WHITE_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_WHITE_CONCRETE),has(DecoBlocks.CUT_WHITE_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, Items.WHITE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, DecoBlocks.CUT_WHITE_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_SLAB, DecoBlocks.CUT_WHITE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_SLAB, DecoBlocks.CUT_WHITE_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_WHITE_CONCRETE_WALL, DecoBlocks.CUT_WHITE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_WALL, DecoBlocks.CUT_WHITE_CONCRETE);

        stairBuilder(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_BLACK_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_BLACK_CONCRETE),has(DecoBlocks.CUT_BLACK_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, Items.BLACK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, DecoBlocks.CUT_BLACK_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_SLAB, DecoBlocks.CUT_BLACK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_SLAB, DecoBlocks.CUT_BLACK_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_BLACK_CONCRETE_WALL, DecoBlocks.CUT_BLACK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_WALL, DecoBlocks.CUT_BLACK_CONCRETE);

        stairBuilder(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_GRAY_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_GRAY_CONCRETE),has(DecoBlocks.CUT_GRAY_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, Items.GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, DecoBlocks.CUT_GRAY_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_GRAY_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_GRAY_CONCRETE);

        stairBuilder(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE),has(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, Items.LIGHT_GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);

        stairBuilder(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_BROWN_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_BROWN_CONCRETE),has(DecoBlocks.CUT_BROWN_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, Items.BROWN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, DecoBlocks.CUT_BROWN_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_SLAB, DecoBlocks.CUT_BROWN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_SLAB, DecoBlocks.CUT_BROWN_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_BROWN_CONCRETE_WALL, DecoBlocks.CUT_BROWN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_WALL, DecoBlocks.CUT_BROWN_CONCRETE);

        stairBuilder(DecoBlocks.CUT_RED_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_RED_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_RED_CONCRETE),has(DecoBlocks.CUT_RED_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_RED_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_STAIRS, Items.RED_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_STAIRS, DecoBlocks.CUT_RED_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_SLAB, DecoBlocks.CUT_RED_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_SLAB, Items.RED_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_SLAB, DecoBlocks.CUT_RED_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_RED_CONCRETE_WALL, DecoBlocks.CUT_RED_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_WALL, Items.RED_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_WALL, DecoBlocks.CUT_RED_CONCRETE);

        stairBuilder(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_ORANGE_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_ORANGE_CONCRETE),has(DecoBlocks.CUT_ORANGE_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, Items.ORANGE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, DecoBlocks.CUT_ORANGE_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.CUT_ORANGE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.CUT_ORANGE_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_ORANGE_CONCRETE_WALL, DecoBlocks.CUT_ORANGE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_WALL, DecoBlocks.CUT_ORANGE_CONCRETE,2);

        stairBuilder(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_YELLOW_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_YELLOW_CONCRETE),has(DecoBlocks.CUT_YELLOW_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, Items.YELLOW_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, DecoBlocks.CUT_YELLOW_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.CUT_YELLOW_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.CUT_YELLOW_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_YELLOW_CONCRETE_WALL, DecoBlocks.CUT_YELLOW_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_WALL, DecoBlocks.CUT_YELLOW_CONCRETE);

        stairBuilder(DecoBlocks.CUT_LIME_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_LIME_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_LIME_CONCRETE),has(DecoBlocks.CUT_LIME_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_LIME_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_STAIRS, Items.LIME_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_STAIRS, DecoBlocks.CUT_LIME_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_SLAB, DecoBlocks.CUT_LIME_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_SLAB, Items.LIME_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_SLAB, DecoBlocks.CUT_LIME_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_LIME_CONCRETE_WALL, DecoBlocks.CUT_LIME_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_WALL, Items.LIME_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_WALL, DecoBlocks.CUT_LIME_CONCRETE);

        stairBuilder(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_GREEN_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_GREEN_CONCRETE),has(DecoBlocks.CUT_GREEN_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, Items.GREEN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, DecoBlocks.CUT_GREEN_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_SLAB, DecoBlocks.CUT_GREEN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_SLAB, DecoBlocks.CUT_GREEN_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_GREEN_CONCRETE_WALL, DecoBlocks.CUT_GREEN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_WALL, DecoBlocks.CUT_GREEN_CONCRETE);

        stairBuilder(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_CYAN_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_CYAN_CONCRETE),has(DecoBlocks.CUT_CYAN_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, Items.CYAN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, DecoBlocks.CUT_CYAN_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_SLAB, DecoBlocks.CUT_CYAN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_SLAB, DecoBlocks.CUT_CYAN_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_CYAN_CONCRETE_WALL, DecoBlocks.CUT_CYAN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_WALL, DecoBlocks.CUT_CYAN_CONCRETE);

        stairBuilder(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_BLUE_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_BLUE_CONCRETE),has(DecoBlocks.CUT_BLUE_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, Items.BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, DecoBlocks.CUT_BLUE_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_BLUE_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_BLUE_CONCRETE);

        stairBuilder(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE),has(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, Items.LIGHT_BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);

        stairBuilder(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_PURPLE_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_PURPLE_CONCRETE),has(DecoBlocks.CUT_PURPLE_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, Items.PURPLE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, DecoBlocks.CUT_PURPLE_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.CUT_PURPLE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.CUT_PURPLE_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_PURPLE_CONCRETE_WALL, DecoBlocks.CUT_PURPLE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_WALL, DecoBlocks.CUT_PURPLE_CONCRETE);

        stairBuilder(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_MAGENTA_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_MAGENTA_CONCRETE),has(DecoBlocks.CUT_MAGENTA_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, Items.MAGENTA_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, DecoBlocks.CUT_MAGENTA_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.CUT_MAGENTA_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.CUT_MAGENTA_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.CUT_MAGENTA_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.CUT_MAGENTA_CONCRETE);

        stairBuilder(DecoBlocks.CUT_PINK_CONCRETE_STAIRS, Ingredient.of(DecoBlocks.CUT_PINK_CONCRETE))
                .unlockedBy(getHasName(DecoBlocks.CUT_PINK_CONCRETE),has(DecoBlocks.CUT_PINK_CONCRETE))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_PINK_CONCRETE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_STAIRS, Items.PINK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_STAIRS, DecoBlocks.CUT_PINK_CONCRETE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_SLAB, DecoBlocks.CUT_PINK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_SLAB, Items.PINK_CONCRETE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_SLAB, DecoBlocks.CUT_PINK_CONCRETE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.CUT_PINK_CONCRETE_WALL, DecoBlocks.CUT_PINK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_WALL, Items.PINK_CONCRETE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_WALL, DecoBlocks.CUT_PINK_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_PILLAR, DecoBlocks.WHITE_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_PILLAR, Items.WHITE_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR, DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR, Items.LIGHT_GRAY_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_PILLAR, DecoBlocks.GRAY_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_PILLAR, Items.GRAY_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_PILLAR, DecoBlocks.BLACK_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_PILLAR, Items.BLACK_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_PILLAR, DecoBlocks.BROWN_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_PILLAR, Items.BROWN_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_PILLAR, DecoBlocks.RED_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_PILLAR, Items.RED_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_PILLAR, DecoBlocks.ORANGE_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_PILLAR, Items.ORANGE_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_PILLAR, DecoBlocks.YELLOW_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_PILLAR, Items.YELLOW_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_PILLAR, DecoBlocks.LIME_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_PILLAR, Items.LIME_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_PILLAR, DecoBlocks.GREEN_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_PILLAR, Items.GREEN_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_PILLAR, DecoBlocks.CYAN_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_PILLAR, Items.CYAN_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR, DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR, Items.LIGHT_BLUE_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_PILLAR, DecoBlocks.BLUE_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_PILLAR, Items.BLUE_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_PILLAR, DecoBlocks.PURPLE_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_PILLAR, Items.PURPLE_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_PILLAR, DecoBlocks.MAGENTA_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_PILLAR, Items.MAGENTA_CONCRETE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_PILLAR, DecoBlocks.PINK_CONCRETE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_PILLAR, Items.PINK_CONCRETE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.TINTED_GLASS_PANE,6)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .define('#', Items.AMETHYST_SHARD)
                .define('X', Items.GLASS_PANE)
                .group("tinted_glass_pane")
                .unlockedBy(getHasName(Items.AMETHYST_SHARD),
                        has(Items.AMETHYST_SHARD))
                .save(output,"tinted_glass_pane_amethyst_shard"+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.TINTED_GLASS_PANE,18)
                .pattern("###")
                .pattern("###")
                .define('#', Items.TINTED_GLASS)
                .group("tinted_glass_pane")
                .unlockedBy(getHasName(Items.TINTED_GLASS),
                        has(Items.TINTED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.TINTED_GLASS_PANE)+ "_recipe_create");

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_GLASS, Items.GLASS);

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_GLASS_PANE, DecoBlocks.HARDENED_GLASS);

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_GLASS_PANE, Items.GLASS_PANE);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_TINTED_GLASS, Items.TINTED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_TINTED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .define('#', Items.AMETHYST_SHARD)
                .define('X', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(Items.AMETHYST_SHARD),
                        has(Items.AMETHYST_SHARD))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_TINTED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_TINTED_GLASS_PANE, DecoBlocks.TINTED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_TINTED_GLASS_PANE,6)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .define('#', Items.AMETHYST_SHARD)
                .define('X', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(Items.AMETHYST_SHARD),
                        has(Items.AMETHYST_SHARD))
                .save(output,"hardened_tinted_glass_pane_amethyst_shard"+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS, DecoBlocks.HARDENED_TINTED_GLASS_PANE,18)
                .pattern("###")
                .pattern("###")
                .define('#', DecoBlocks.HARDENED_TINTED_GLASS)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_TINTED_GLASS),
                        has(DecoBlocks.HARDENED_TINTED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_TINTED_GLASS_PANE)+ "_recipe_create");

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_WHITE_STAINED_GLASS, Items.WHITE_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_WHITE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.WHITE_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_WHITE_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE, Items.WHITE_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.WHITE_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_white_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_WHITE_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS, Items.ORANGE_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.ORANGE_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE, Items.ORANGE_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.ORANGE_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_orange_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_ORANGE_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS, Items.MAGENTA_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.MAGENTA_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE, Items.MAGENTA_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.MAGENTA_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_magenta_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE, DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS, Items.LIGHT_BLUE_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.LIGHT_BLUE_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE, Items.LIGHT_BLUE_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.LIGHT_BLUE_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_light_blue_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS, Items.YELLOW_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.YELLOW_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE, Items.YELLOW_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.YELLOW_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_yellow_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE, DecoBlocks.HARDENED_YELLOW_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_LIME_STAINED_GLASS, Items.LIME_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIME_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.LIME_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_LIME_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE, Items.LIME_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.LIME_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_lime_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE, DecoBlocks.HARDENED_LIME_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_PINK_STAINED_GLASS, Items.PINK_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PINK_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.PINK_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_PINK_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE, Items.PINK_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.PINK_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_pink_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE, DecoBlocks.HARDENED_PINK_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_GRAY_STAINED_GLASS, Items.GRAY_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GRAY_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.GRAY_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_GRAY_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE, Items.GRAY_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.GRAY_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_gray_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE, DecoBlocks.HARDENED_GRAY_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS, Items.LIGHT_GRAY_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.LIGHT_GRAY_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE, Items.LIGHT_GRAY_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.LIGHT_GRAY_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_light_gray_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE, DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_CYAN_STAINED_GLASS, Items.CYAN_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_CYAN_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.CYAN_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_CYAN_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, Items.CYAN_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.CYAN_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_cyan_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, DecoBlocks.HARDENED_CYAN_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS, Items.PURPLE_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.PURPLE_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE, Items.PURPLE_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.PURPLE_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_purple_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_PURPLE_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_BLUE_STAINED_GLASS, Items.BLUE_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLUE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.BLUE_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_BLUE_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE, Items.BLUE_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.BLUE_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_blue_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_BLUE_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_BROWN_STAINED_GLASS, Items.BROWN_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BROWN_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.BROWN_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_BROWN_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE, Items.BROWN_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.BROWN_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_brown_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE, DecoBlocks.HARDENED_BROWN_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_GREEN_STAINED_GLASS, Items.GREEN_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GREEN_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.GREEN_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_GREEN_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE, Items.GREEN_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.GREEN_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_green_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE, DecoBlocks.HARDENED_GREEN_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_RED_STAINED_GLASS, Items.RED_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_RED_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.RED_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_RED_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE, Items.RED_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.RED_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_red_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE, DecoBlocks.HARDENED_RED_STAINED_GLASS);

        offerHardenedGlassRecipe(output,DecoBlocks.HARDENED_BLACK_STAINED_GLASS, Items.BLACK_STAINED_GLASS);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLACK_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.BLACK_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS),
                        has(DecoBlocks.HARDENED_GLASS))
                .save(output, getSimpleRecipeName(DecoBlocks.HARDENED_BLACK_STAINED_GLASS)+ "_recipe_create");

        offerHardenedGlassPaneRecipe(output,DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE, Items.BLACK_STAINED_GLASS_PANE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.BLACK_DYE)
                .define('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .unlockedBy(getHasName(DecoBlocks.HARDENED_GLASS_PANE),
                        has(DecoBlocks.HARDENED_GLASS_PANE))
                .save(output,"dyed_hardened_black_stained_glass_pane"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE, DecoBlocks.HARDENED_BLACK_STAINED_GLASS);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.DEEPSLATE),RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.SMOOTH_DEEPSLATE,
                        0.1f, 200).unlockedBy(getHasName(Items.DEEPSLATE), has(Items.DEEPSLATE))
                .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_DEEPSLATE)+ "_recipe_create");

        stairBuilder(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS, Ingredient.of(DecoBlocks.SMOOTH_DEEPSLATE))
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_DEEPSLATE),has(DecoBlocks.SMOOTH_DEEPSLATE))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_STAIRS, DecoBlocks.SMOOTH_DEEPSLATE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_SLAB, DecoBlocks.SMOOTH_DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_SLAB, DecoBlocks.SMOOTH_DEEPSLATE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_DEEPSLATE_WALL, DecoBlocks.SMOOTH_DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_WALL, DecoBlocks.SMOOTH_DEEPSLATE);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BLACKSTONE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.SMOOTH_BLACKSTONE,
                        0.1f, 200).unlockedBy(getHasName(Items.BLACKSTONE), has(Items.BLACKSTONE))
                .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_BLACKSTONE)+ "_recipe_create");

        stairBuilder(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS, Ingredient.of(DecoBlocks.SMOOTH_BLACKSTONE))
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_BLACKSTONE),has(DecoBlocks.SMOOTH_BLACKSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_STAIRS, DecoBlocks.SMOOTH_BLACKSTONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_SLAB, DecoBlocks.SMOOTH_BLACKSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_SLAB, DecoBlocks.SMOOTH_BLACKSTONE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_BLACKSTONE_WALL, DecoBlocks.SMOOTH_BLACKSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_WALL, DecoBlocks.SMOOTH_BLACKSTONE);

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .define('I', Items.IRON_INGOT)
                .define('X', DecoBlocks.DEEPSLATE_FURNACE)
                .define('#', DecoBlocks.SMOOTH_DEEPSLATE)
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_DEEPSLATE),
                        has(DecoBlocks.SMOOTH_DEEPSLATE))
                .save(output,getSimpleRecipeName(DecoBlocks.DEEPSLATE_BLAST_FURNACE)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.BLACKSTONE_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .define('I', Items.IRON_INGOT)
                .define('X', DecoBlocks.BLACKSTONE_FURNACE)
                .define('#', DecoBlocks.SMOOTH_BLACKSTONE)
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_BLACKSTONE),
                        has(DecoBlocks.SMOOTH_BLACKSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.BLACKSTONE_BLAST_FURNACE)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.TUFF_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .define('I', Items.IRON_INGOT)
                .define('X', DecoBlocks.TUFF_FURNACE)
                .define('#', DecoBlocks.SMOOTH_TUFF)
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_TUFF),
                        has(DecoBlocks.SMOOTH_TUFF))
                .save(output,getSimpleRecipeName(DecoBlocks.TUFF_BLAST_FURNACE)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_SMOKER)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .define('#', ItemTags.LOGS)
                .define('X', DecoBlocks.DEEPSLATE_FURNACE)
                .unlockedBy(getHasName(DecoBlocks.DEEPSLATE_FURNACE),
                        has(DecoBlocks.DEEPSLATE_FURNACE))
                .save(output,getSimpleRecipeName(DecoBlocks.DEEPSLATE_SMOKER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.BLACKSTONE_SMOKER)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .define('#', ItemTags.LOGS)
                .define('X', DecoBlocks.BLACKSTONE_FURNACE)
                .unlockedBy(getHasName(DecoBlocks.BLACKSTONE_FURNACE),
                        has(DecoBlocks.BLACKSTONE_FURNACE))
                .save(output,getSimpleRecipeName(DecoBlocks.BLACKSTONE_SMOKER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.TUFF_SMOKER)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .define('#', ItemTags.LOGS)
                .define('X', DecoBlocks.TUFF_FURNACE)
                .unlockedBy(getHasName(DecoBlocks.TUFF_FURNACE),
                        has(DecoBlocks.TUFF_FURNACE))
                .save(output,getSimpleRecipeName(DecoBlocks.TUFF_SMOKER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .define('I', Items.IRON_INGOT)
                .define('#', Items.DEEPSLATE)
                .unlockedBy(getHasName(Items.DEEPSLATE),
                        has(Items.DEEPSLATE))
                .save(output,getSimpleRecipeName(DecoBlocks.DEEPSLATE_STONECUTTER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.BLACKSTONE_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .define('I', Items.IRON_INGOT)
                .define('#', Items.BLACKSTONE)
                .unlockedBy(getHasName(Items.BLACKSTONE),
                        has(Items.BLACKSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.BLACKSTONE_STONECUTTER)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.TUFF_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .define('I', Items.IRON_INGOT)
                .define('#', Items.TUFF)
                .unlockedBy(getHasName(Items.TUFF),
                        has(Items.TUFF))
                .save(output,getSimpleRecipeName(DecoBlocks.TUFF_STONECUTTER)+ "_recipe_create");

        stairBuilder(DecoBlocks.DEEPSLATE_STAIRS, Ingredient.of(Items.DEEPSLATE))
                .unlockedBy(getHasName(Items.DEEPSLATE),has(Items.DEEPSLATE))
                .save(output,getSimpleRecipeName(DecoBlocks.DEEPSLATE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_STAIRS, Items.DEEPSLATE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_SLAB, Items.DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_SLAB, Items.DEEPSLATE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_WALL, Items.DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_WALL, Items.DEEPSLATE);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BRICKS, Items.BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BRICKS, Items.BRICKS);

        stairBuilder(DecoBlocks.END_STONE_STAIRS, Ingredient.of(Items.END_STONE))
                .unlockedBy(getHasName(Items.END_STONE),has(Items.END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.END_STONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_STAIRS, Items.END_STONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_SLAB, Items.END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_SLAB, Items.END_STONE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.END_STONE_WALL, Items.END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_WALL, Items.END_STONE);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.PURPUR_BLOCK), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.SMOOTH_PURPUR,
                        0.1f, 200).unlockedBy(getHasName(Items.PURPUR_BLOCK), has(Items.PURPUR_BLOCK))
                .save(output, getSimpleRecipeName(DecoBlocks.SMOOTH_PURPUR)+ "_recipe_create");

        stairBuilder(DecoBlocks.SMOOTH_PURPUR_STAIRS, Ingredient.of(DecoBlocks.SMOOTH_PURPUR))
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_PURPUR),has(DecoBlocks.SMOOTH_PURPUR))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_PURPUR_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_STAIRS, DecoBlocks.SMOOTH_PURPUR);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_SLAB, DecoBlocks.SMOOTH_PURPUR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_SLAB, DecoBlocks.SMOOTH_PURPUR,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_PURPUR_WALL, DecoBlocks.SMOOTH_PURPUR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_WALL, DecoBlocks.SMOOTH_PURPUR);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICKS, Items.PURPUR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICKS, Items.PURPUR_BLOCK);

        stairBuilder(DecoBlocks.PURPUR_BRICK_STAIRS, Ingredient.of(DecoBlocks.PURPUR_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.PURPUR_BRICKS),has(DecoBlocks.PURPUR_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.PURPUR_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_STAIRS, Items.PURPUR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_STAIRS, DecoBlocks.PURPUR_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_SLAB, DecoBlocks.PURPUR_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICK_SLAB, Items.PURPUR_BLOCK,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICK_SLAB, DecoBlocks.PURPUR_BRICKS,2);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.PURPUR_BRICK_WALL, DecoBlocks.PURPUR_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_WALL, Items.PURPUR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_WALL, DecoBlocks.PURPUR_BRICKS);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_PURPUR, Items.PURPUR_BLOCK);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.ENDER_PEARL)
                .define('#', Items.END_STONE)
                .unlockedBy(getHasName(Items.END_STONE),
                        has(Items.END_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.VOID_STONE)+ "_recipe_create");

        stairBuilder(DecoBlocks.VOID_STONE_STAIRS, Ingredient.of(DecoBlocks.VOID_STONE))
                .unlockedBy(getHasName(DecoBlocks.VOID_STONE),has(DecoBlocks.VOID_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.VOID_STONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_STAIRS, DecoBlocks.VOID_STONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_SLAB, DecoBlocks.VOID_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_SLAB, DecoBlocks.VOID_STONE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.VOID_STONE_WALL, DecoBlocks.VOID_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_WALL, DecoBlocks.VOID_STONE);

        shaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICKS,3)
                .pattern("##")
                .pattern("--")
                .define('-', DecoBlocks.VOID_STONE_SLAB)
                .define('#', DecoBlocks.VOID_STONE)
                .unlockedBy(getHasName(DecoBlocks.VOID_STONE),
                        has(DecoBlocks.VOID_STONE))
                .save(output,getSimpleRecipeName(DecoBlocks.VOID_STONE_BRICKS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICKS, DecoBlocks.VOID_STONE);

        stairBuilder(DecoBlocks.VOID_STONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.VOID_STONE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.VOID_STONE_BRICKS),has(DecoBlocks.VOID_STONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.VOID_STONE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_STAIRS, DecoBlocks.VOID_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_STAIRS, DecoBlocks.VOID_STONE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_SLAB, DecoBlocks.VOID_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_SLAB, DecoBlocks.VOID_STONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_SLAB, DecoBlocks.VOID_STONE_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.VOID_STONE_BRICK_WALL, DecoBlocks.VOID_STONE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_WALL, DecoBlocks.VOID_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_WALL, DecoBlocks.VOID_STONE_BRICKS);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_VOID_STONE, DecoBlocks.VOID_STONE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_VOID_STONE, DecoBlocks.VOID_STONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.PRISMARINE_BRICKS, Items.PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.PRISMARINE_BRICK_STAIRS, Items.PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.PRISMARINE_BRICK_SLAB, Items.PRISMARINE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE);

        stairBuilder(DecoBlocks.OBSIDIAN_STAIRS, Ingredient.of(Items.OBSIDIAN))
                .unlockedBy(getHasName(Items.OBSIDIAN),has(Items.OBSIDIAN))
                .save(output,getSimpleRecipeName(DecoBlocks.OBSIDIAN_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_STAIRS, Items.OBSIDIAN);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_SLAB, Items.OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_SLAB, Items.OBSIDIAN,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.OBSIDIAN_WALL, Items.OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_WALL, Items.OBSIDIAN);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICKS, DecoBlocks.SANDED_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICKS, DecoBlocks.SANDED_OBSIDIAN);

        stairBuilder(DecoBlocks.OBSIDIAN_BRICK_STAIRS, Ingredient.of(DecoBlocks.OBSIDIAN_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.OBSIDIAN_BRICKS),has(DecoBlocks.OBSIDIAN_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.OBSIDIAN_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_STAIRS, DecoBlocks.SANDED_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_STAIRS, DecoBlocks.OBSIDIAN_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_SLAB, DecoBlocks.OBSIDIAN_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_SLAB, DecoBlocks.SANDED_OBSIDIAN,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_SLAB, DecoBlocks.OBSIDIAN_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.OBSIDIAN_BRICK_WALL, DecoBlocks.OBSIDIAN_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_WALL, DecoBlocks.SANDED_OBSIDIAN);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_WALL, DecoBlocks.OBSIDIAN_BRICKS);

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_PILLAR, DecoBlocks.OBSIDIAN_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_PILLAR, DecoBlocks.SANDED_OBSIDIAN);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_OBSIDIAN,2)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.OBSIDIAN_SLAB)
                .unlockedBy(getHasName(DecoBlocks.OBSIDIAN_SLAB),
                        has(DecoBlocks.OBSIDIAN_SLAB))
                .save(output, getSimpleRecipeName(DecoBlocks.CHISELED_OBSIDIAN)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_OBSIDIAN, Items.OBSIDIAN);

        nineBlockStorageRecipes(RecipeCategory.MISC, Items.FLINT,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.FLINT_BLOCK);
        nineBlockStorageRecipes(RecipeCategory.MISC,Items.CHARCOAL,RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHARCOAL_BLOCK);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ECHO_BLOCK)
                .pattern("##")
                .pattern("##")
                .define('#', Items.ECHO_SHARD)
                .unlockedBy(getHasName(Items.ECHO_SHARD),
                        has(Items.ECHO_SHARD))
                .save(output, getSimpleRecipeName(DecoBlocks.ECHO_BLOCK)+ "_recipe_create");

        cut(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON, Items.IRON_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON, Items.IRON_BLOCK,4);

        stairBuilder(DecoBlocks.CUT_IRON_STAIRS, Ingredient.of(DecoBlocks.CUT_IRON))
                .unlockedBy(getHasName(DecoBlocks.CUT_IRON),has(DecoBlocks.CUT_IRON))
                .save(output,getSimpleRecipeName(DecoBlocks.CUT_IRON_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_STAIRS, Items.IRON_BLOCK,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_STAIRS, DecoBlocks.CUT_IRON);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_SLAB, DecoBlocks.CUT_IRON);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_SLAB, Items.IRON_BLOCK,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_SLAB, DecoBlocks.CUT_IRON,2);


        shaped(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_IRON_BARS,16)
                .pattern("###")
                .pattern("###")
                .define('#', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET),
                        has(Items.IRON_NUGGET))
                .save(output, getSimpleRecipeName(DecoBlocks.LIGHT_IRON_BARS)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.HEAVY_IRON_BARS)
                .pattern("##")
                .pattern("##")
                .define('#', Items.IRON_BARS)
                .unlockedBy(getHasName(Items.IRON_BARS),
                        has(Items.IRON_BARS))
                .save(output,getSimpleRecipeName(DecoBlocks.HEAVY_IRON_BARS)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.GOLD_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT),
                        has(Items.GOLD_INGOT))
                .save(output, getSimpleRecipeName(DecoBlocks.GOLD_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.DECORATIONS,DecoBlocks.GOLD_TRAPDOOR)
                .pattern("##")
                .pattern("##")
                .define('#', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT),
                        has(Items.GOLD_INGOT))
                .save(output, getSimpleRecipeName(DecoBlocks.GOLD_TRAPDOOR)+ "_recipe_create");

        pressurePlate(DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Items.POLISHED_DEEPSLATE);

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.POLISHED_DEEPSLATE_BUTTON)
                .requires(Items.POLISHED_DEEPSLATE)
                .unlockedBy(getHasName(Items.POLISHED_DEEPSLATE),
                        has(Items.POLISHED_DEEPSLATE))
                .save(output, getSimpleRecipeName(DecoBlocks.POLISHED_DEEPSLATE_BUTTON)+ "_recipe_create");

                shaped(RecipeCategory.DECORATIONS,DecoBlocks.HEAVY_COPPER_BARS)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.COPPER_BARS.unaffected())
                        .unlockedBy(getHasName(Items.COPPER_BARS.unaffected()),
                                has(Items.COPPER_BARS.unaffected()))
                        .save(output, getSimpleRecipeName(DecoBlocks.HEAVY_COPPER_BARS) + "_recipe_create");
                shaped(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_HEAVY_COPPER_BARS)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.COPPER_BARS.waxed())
                        .unlockedBy(getHasName(Items.COPPER_BARS.waxed()),
                                has(Items.COPPER_BARS.waxed()))
                        .save(output, getSimpleRecipeName(DecoBlocks.WAXED_HEAVY_COPPER_BARS) + "_recipe_create");

                shaped(RecipeCategory.DECORATIONS,DecoBlocks.EXPOSED_HEAVY_COPPER_BARS)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.COPPER_BARS.exposed())
                        .unlockedBy(getHasName(Items.COPPER_BARS.exposed()),
                                has(Items.COPPER_BARS.exposed()))
                        .save(output, getSimpleRecipeName(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS) + "_recipe_create");
                shaped(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.COPPER_BARS.waxedExposed())
                        .unlockedBy(getHasName(Items.COPPER_BARS.waxedExposed()),
                                has(Items.COPPER_BARS.waxedExposed()))
                        .save(output, getSimpleRecipeName(DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS) + "_recipe_create");

                shaped(RecipeCategory.DECORATIONS,DecoBlocks.WEATHERED_HEAVY_COPPER_BARS)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.COPPER_BARS.weathered())
                        .unlockedBy(getHasName(Items.COPPER_BARS.weathered()),
                                has(Items.COPPER_BARS.weathered()))
                        .save(output, getSimpleRecipeName(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS) + "_recipe_create");
                shaped(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.COPPER_BARS.waxedWeathered())
                        .unlockedBy(getHasName(Items.COPPER_BARS.waxedWeathered()),
                                has(Items.COPPER_BARS.waxedWeathered()))
                        .save(output, getSimpleRecipeName(DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS) + "_recipe_create");

                shaped(RecipeCategory.DECORATIONS,DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.COPPER_BARS.oxidized())
                        .unlockedBy(getHasName(Items.COPPER_BARS.oxidized()),
                                has(Items.COPPER_BARS.oxidized()))
                        .save(output, getSimpleRecipeName(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS) + "_recipe_create");
                shaped(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.COPPER_BARS.waxedOxidized())
                        .unlockedBy(getHasName(Items.COPPER_BARS.waxedOxidized()),
                                has(Items.COPPER_BARS.waxedOxidized()))
                        .save(output, getSimpleRecipeName(DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS) + "_recipe_create");


        shaped(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .define('#', Items.COPPER_NUGGET)
                .unlockedBy(getHasName(Items.COPPER_NUGGET),
                        has(Items.COPPER_NUGGET))
                .save(output, getSimpleRecipeName(DecoBlocks.LIGHT_COPPER_BARS)+ "_recipe_create");

        pressurePlate(DecoBlocks.DEEPSLATE_PRESSURE_PLATE, Items.DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_PRESSURE_PLATE, Items.DEEPSLATE);

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.DEEPSLATE_BUTTON)
                .requires(Items.DEEPSLATE)
                .unlockedBy(getHasName(Items.DEEPSLATE),
                        has(Items.DEEPSLATE))
                .save(output, getSimpleRecipeName(DecoBlocks.DEEPSLATE_BUTTON)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_BUTTON, Items.DEEPSLATE);

        pressurePlate(DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, Items.COBBLED_DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, Items.COBBLED_DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Items.COBBLED_DEEPSLATE);

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.COBBLED_DEEPSLATE_BUTTON)
                .requires(Items.COBBLED_DEEPSLATE)
                .unlockedBy(getHasName(Items.COBBLED_DEEPSLATE),
                        has(Items.COBBLED_DEEPSLATE))
                .save(output, getSimpleRecipeName(DecoBlocks.COBBLED_DEEPSLATE_BUTTON)+ "_recipe_create");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_DEEPSLATE_BUTTON, Items.COBBLED_DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_DEEPSLATE_BUTTON, Items.COBBLED_DEEPSLATE);

        pressurePlate(DecoBlocks.COBBLESTONE_PRESSURE_PLATE, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLESTONE_PRESSURE_PLATE, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_PRESSURE_PLATE, Items.COBBLESTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.STONE_PRESSURE_PLATE, Items.STONE);

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.COBBLESTONE_BUTTON)
                .requires(Items.COBBLESTONE)
                .unlockedBy(getHasName(Items.COBBLESTONE),
                        has(Items.COBBLESTONE))
                .save(output, getSimpleRecipeName(DecoBlocks.COBBLESTONE_BUTTON)+ "_recipe_create");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLESTONE_BUTTON, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_BUTTON, Items.COBBLESTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.STONE_BUTTON, Items.STONE);

        pressurePlate(DecoBlocks.BLACKSTONE_PRESSURE_PLATE, Items.BLACKSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACKSTONE_PRESSURE_PLATE, Items.BLACKSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.POLISHED_BLACKSTONE_PRESSURE_PLATE, Items.BLACKSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.POLISHED_BLACKSTONE_PRESSURE_PLATE, Items.POLISHED_BLACKSTONE);

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.BLACKSTONE_BUTTON)
                .requires(Items.BLACKSTONE)
                .unlockedBy(getHasName(Items.BLACKSTONE),
                        has(Items.BLACKSTONE))
                .save(output, getSimpleRecipeName(DecoBlocks.BLACKSTONE_BUTTON)+ "_recipe_create");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACKSTONE_BUTTON, Items.BLACKSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.POLISHED_BLACKSTONE_BUTTON, Items.BLACKSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.POLISHED_BLACKSTONE_BUTTON, Items.POLISHED_BLACKSTONE);

        pressurePlate(DecoBlocks.POLISHED_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_STONE);

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.POLISHED_STONE_BUTTON)
                .requires(DecoBlocks.POLISHED_STONE)
                .unlockedBy(getHasName(DecoBlocks.POLISHED_STONE),
                        has(DecoBlocks.POLISHED_STONE))
                .save(output, getSimpleRecipeName(DecoBlocks.POLISHED_STONE_BUTTON)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_BUTTON, DecoBlocks.POLISHED_STONE);

        shapeless(RecipeCategory.MISC,Items.YELLOW_DYE)
                .requires(DecoBlocks.YELLOW_TULIP)
                .group("yellow_dye")
                .unlockedBy(getHasName(DecoBlocks.YELLOW_TULIP),
                        has(DecoBlocks.YELLOW_TULIP))
                .save(output,"yellow_dye_from_yellow_tulip"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.PURPLE_DYE)
                .requires(DecoBlocks.PURPLE_TULIP)
                .group("purple_dye")
                .unlockedBy(getHasName(DecoBlocks.PURPLE_TULIP),
                        has(DecoBlocks.PURPLE_TULIP))
                .save(output,"purple_dye_from_purple_tulip"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.MAGENTA_DYE)
                .requires(DecoBlocks.MAGENTA_TULIP)
                .group("magenta_dye")
                .unlockedBy(getHasName(DecoBlocks.MAGENTA_TULIP),
                        has(DecoBlocks.MAGENTA_TULIP))
                .save(output,"magenta_dye_from_magenta_tulip"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.BLACK_DYE)
                .requires(DecoBlocks.BLACK_TULIP)
                .group("black_dye")
                .unlockedBy(getHasName(DecoBlocks.BLACK_TULIP),
                        has(DecoBlocks.BLACK_TULIP))
                .save(output,"black_dye_from_black_tulip"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.LIME_DYE)
                .requires(DecoBlocks.GREEN_TULIP)
                .group("lime_dye")
                .unlockedBy(getHasName(DecoBlocks.GREEN_TULIP),
                        has(DecoBlocks.GREEN_TULIP))
                .save(output,"lime_dye_from_green_tulip"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.LIGHT_BLUE_DYE)
                .requires(DecoBlocks.BLUE_TULIP)
                .group("light_blue_dye")
                .unlockedBy(getHasName(DecoBlocks.BLUE_TULIP),
                        has(DecoBlocks.BLUE_TULIP))
                .save(output,"light_blue_dye_from_blue_tulip"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.CYAN_DYE)
                .requires(DecoBlocks.CYAN_TULIP)
                .group("cyan_dye")
                .unlockedBy(getHasName(DecoBlocks.CYAN_TULIP),
                        has(DecoBlocks.CYAN_TULIP))
                .save(output,"cyan_dye_from_cyan_tulip"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.RED_DYE)
                .requires(DecoBlocks.BARBERTON_DAISY)
                .group("red_dye")
                .unlockedBy(getHasName(DecoBlocks.BARBERTON_DAISY),
                        has(DecoBlocks.BARBERTON_DAISY))
                .save(output,"red_dye_from_barberton_daisy"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.YELLOW_DYE)
                .requires(DecoBlocks.BLUE_EYED_DAISY)
                .group("yellow_dye")
                .unlockedBy(getHasName(DecoBlocks.BLUE_EYED_DAISY),
                        has(DecoBlocks.BLUE_EYED_DAISY))
                .save(output,"yellow_dye_from_blue_eyed_daisy"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.PINK_DYE)
                .requires(DecoBlocks.GERBERA_DAISY)
                .group("pink_dye")
                .unlockedBy(getHasName(DecoBlocks.GERBERA_DAISY),
                        has(DecoBlocks.GERBERA_DAISY))
                .save(output,"pink_dye_from_gerbera_daisy"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.PURPLE_DYE)
                .requires(DecoBlocks.MICHAELMAS_DAISY)
                .group("purple_dye")
                .unlockedBy(getHasName(DecoBlocks.MICHAELMAS_DAISY),
                        has(DecoBlocks.MICHAELMAS_DAISY))
                .save(output,"purple_dye_from_michaelmas_daisy"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.ORANGE_DYE)
                .requires(DecoBlocks.CALIFORNIA_POPPY)
                .group("orange_dye")
                .unlockedBy(getHasName(DecoBlocks.CALIFORNIA_POPPY),
                        has(DecoBlocks.CALIFORNIA_POPPY))
                .save(output,"orange_dye_from_california_poppy"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.PINK_DYE)
                .requires(DecoBlocks.SALMON_POPPY)
                .group("pink_dye")
                .unlockedBy(getHasName(DecoBlocks.SALMON_POPPY),
                        has(DecoBlocks.SALMON_POPPY))
                .save(output,"pink_dye_from_salmon_poppy"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.WHITE_DYE)
                .requires(DecoBlocks.WHITE_ORCHID)
                .group("white_dye")
                .unlockedBy(getHasName(DecoBlocks.WHITE_ORCHID),
                        has(DecoBlocks.WHITE_ORCHID))
                .save(output,"white_dye_from_white_orchid"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.PINK_DYE)
                .requires(DecoBlocks.PINK_ORCHID)
                .group("pink_dye")
                .unlockedBy(getHasName(DecoBlocks.PINK_ORCHID),
                        has(DecoBlocks.PINK_ORCHID))
                .save(output,"pink_dye_from_pink_orchid"+ "_recipe_create");
        shapeless(RecipeCategory.MISC,Items.YELLOW_DYE)
                .requires(DecoBlocks.YELLOW_ORCHID)
                .group("yellow_dye")
                .unlockedBy(getHasName(DecoBlocks.YELLOW_ORCHID),
                        has(DecoBlocks.YELLOW_ORCHID))
                .save(output,"yellow_dye_from_yellow_orchid"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.RED_DYE)
                .requires(DecoBlocks.ROSE)
                .group("red_dye")
                .unlockedBy(getHasName(DecoBlocks.ROSE),
                        has(DecoBlocks.ROSE))
                .save(output, "red_dye_from_rose");
        shapeless(RecipeCategory.MISC,Items.BLACK_DYE,4)
                .requires(DecoBlocks.WITHER_ROSE_BUSH)
                .group("black_dye")
                .unlockedBy(getHasName(DecoBlocks.WITHER_ROSE_BUSH),
                        has(DecoBlocks.WITHER_ROSE_BUSH))
                .save(output,"black_dye_from_wither_rose_bush"+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,Items.ROSE_BUSH)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.ROSE)
                .unlockedBy(getHasName(DecoBlocks.ROSE),
                        has(DecoBlocks.ROSE))
                .save(output, getSimpleRecipeName(Items.ROSE_BUSH)+ "_recipe_create");
        shaped(RecipeCategory.DECORATIONS,DecoBlocks.ENDER_ROSE_BUSH)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.ENDER_ROSE)
                .unlockedBy(getHasName(DecoBlocks.ENDER_ROSE),
                        has(DecoBlocks.ENDER_ROSE))
                .save(output, getSimpleRecipeName(DecoBlocks.ENDER_ROSE_BUSH)+ "_recipe_create");
        shaped(RecipeCategory.DECORATIONS,DecoBlocks.WITHER_ROSE_BUSH)
                .pattern("##")
                .pattern("##")
                .define('#', Items.WITHER_ROSE)
                .unlockedBy(getHasName(Items.WITHER_ROSE),
                        has(Items.WITHER_ROSE))
                .save(output, getSimpleRecipeName(DecoBlocks.WITHER_ROSE_BUSH)+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.RED_DYE,2)
                .requires(DecoBlocks.RED_SUNFLOWER)
                .group("red_dye")
                .unlockedBy(getHasName(DecoBlocks.RED_SUNFLOWER),
                        has(DecoBlocks.RED_SUNFLOWER))
                .save(output,"red_dye_from_red_sunflower"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.WHITE_DYE,2)
                .requires(DecoBlocks.NOVA_STARFLOWER)
                .group("white_dye")
                .unlockedBy(getHasName(DecoBlocks.NOVA_STARFLOWER),
                        has(DecoBlocks.NOVA_STARFLOWER))
                .save(output,"white_dye_from_nova_starflower"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.PINK_DYE)
                .requires(DecoBlocks.PAEONIA)
                .group("pink_dye")
                .unlockedBy(getHasName(DecoBlocks.PAEONIA),
                        has(DecoBlocks.PAEONIA))
                .save(output,"pink_dye_from_paeonia"+ "_recipe_create");
        shaped(RecipeCategory.DECORATIONS,Items.PEONY)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.PAEONIA)
                .unlockedBy(getHasName(DecoBlocks.PAEONIA),
                        has(DecoBlocks.PAEONIA))
                .save(output, getSimpleRecipeName(Items.PEONY)+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.PURPLE_DYE)
                .requires(DecoBlocks.LAVENDER)
                .group("purple_dye")
                .unlockedBy(getHasName(DecoBlocks.LAVENDER),
                        has(DecoBlocks.LAVENDER))
                .save(output,"purple_dye_from_lavender"+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.COPPER_SOUL_LANTERN)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('X', Items.SOUL_TORCH)
                .define('#', Items.COPPER_NUGGET)
                .unlockedBy(getHasName(Items.COPPER_NUGGET),
                        has(Items.COPPER_NUGGET))
                .save(output,getSimpleRecipeName(DecoBlocks.COPPER_SOUL_LANTERN)+ "_recipe_create");

        pressurePlate(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, Items.COPPER_INGOT);

        offerReversibleCompactingFourRecipes(output,Items.WHITE_DYE, DecoBlocks.WHITE_BLOCK,
                "white_block","white_block",
                "white_dye","white_dye");

        offerReversibleCompactingFourRecipes(output,Items.LIGHT_GRAY_DYE, DecoBlocks.LIGHT_GRAY_BLOCK,
                "light_gray_block","light_gray_block",
                "light_gray_dye","light_gray_dye");

        offerReversibleCompactingFourRecipes(output,Items.GRAY_DYE, DecoBlocks.GRAY_BLOCK,
                "gray_block","gray_block",
                "gray_dye","gray_dye");

        offerReversibleCompactingFourRecipes(output,Items.BLACK_DYE, DecoBlocks.BLACK_BLOCK,
                "black_block","black_block",
                "black_dye","black_dye");

        offerReversibleCompactingFourRecipes(output,Items.BROWN_DYE, DecoBlocks.BROWN_BLOCK,
                "brown_block","brown_block",
                "brown_dye","brown_dye");

        offerReversibleCompactingFourRecipes(output,Items.RED_DYE, DecoBlocks.RED_BLOCK,
                "red_block","red_block",
                "red_dye","red_dye");

        offerReversibleCompactingFourRecipes(output,Items.ORANGE_DYE, DecoBlocks.ORANGE_BLOCK,
                "orange_block","orange_block",
                "orange_dye","orange_dye");

        offerReversibleCompactingFourRecipes(output,Items.YELLOW_DYE, DecoBlocks.YELLOW_BLOCK,
                "yellow_block","yellow_block",
                "yellow_dye","yellow_dye");

        offerReversibleCompactingFourRecipes(output,Items.LIME_DYE, DecoBlocks.LIME_BLOCK,
                "lime_block","lime_block",
                "lime_dye","lime_dye");

        offerReversibleCompactingFourRecipes(output,Items.GREEN_DYE, DecoBlocks.GREEN_BLOCK,
                "green_block","green_block",
                "green_dye","green_dye");

        offerReversibleCompactingFourRecipes(output,Items.CYAN_DYE, DecoBlocks.CYAN_BLOCK,
                "cyan_block","cyan_block",
                "cyan_dye","cyan_dye");

        offerReversibleCompactingFourRecipes(output,Items.LIGHT_BLUE_DYE, DecoBlocks.LIGHT_BLUE_BLOCK,
                "light_blue_block","light_blue_block",
                "light_blue_dye","light_blue_dye");

        offerReversibleCompactingFourRecipes(output,Items.BLUE_DYE, DecoBlocks.BLUE_BLOCK,
                "blue_block","blue_block",
                "blue_dye","blue_dye");

        offerReversibleCompactingFourRecipes(output,Items.PURPLE_DYE, DecoBlocks.PURPLE_BLOCK,
                "purple_block","purple_block",
                "purple_dye","purple_dye");

        offerReversibleCompactingFourRecipes(output,Items.MAGENTA_DYE, DecoBlocks.MAGENTA_BLOCK,
                "magenta_block","magenta_block",
                "magenta_dye","magenta_dye");

        offerReversibleCompactingFourRecipes(output,Items.PINK_DYE, DecoBlocks.PINK_BLOCK,
                "pink_block","pink_block",
                "pink_dye","pink_dye");

        shapeless(RecipeCategory.MISC,DecoBlocks.LIGHT_GRAY_BLOCK,3)
                .requires(DecoBlocks.BLACK_BLOCK)
                .requires(DecoBlocks.WHITE_BLOCK)
                .requires(DecoBlocks.WHITE_BLOCK)
                .group("light_gray_block")
                .unlockedBy(getHasName(DecoBlocks.BLACK_BLOCK),
                        has(DecoBlocks.BLACK_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.WHITE_BLOCK),
                        has(DecoBlocks.WHITE_BLOCK))
                .save(output,"light_gray_block_from_black_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.LIGHT_GRAY_BLOCK,2)
                .requires(DecoBlocks.GRAY_BLOCK)
                .requires(DecoBlocks.WHITE_BLOCK)
                .group("light_gray_block")
                .unlockedBy(getHasName(DecoBlocks.GRAY_BLOCK),
                        has(DecoBlocks.GRAY_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.WHITE_BLOCK),
                        has(DecoBlocks.WHITE_BLOCK))
                .save(output,"light_gray_block_from_gray_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.GRAY_BLOCK,2)
                .requires(DecoBlocks.BLACK_BLOCK)
                .requires(DecoBlocks.WHITE_BLOCK)
                .group("gray_block")
                .unlockedBy(getHasName(DecoBlocks.BLACK_BLOCK),
                        has(DecoBlocks.BLACK_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.WHITE_BLOCK),
                        has(DecoBlocks.WHITE_BLOCK))
                .save(output,"gray_block_from_black_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.ORANGE_BLOCK,2)
                .requires(DecoBlocks.YELLOW_BLOCK)
                .requires(DecoBlocks.RED_BLOCK)
                .group("orange_block")
                .unlockedBy(getHasName(DecoBlocks.YELLOW_BLOCK),
                        has(DecoBlocks.YELLOW_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.RED_BLOCK),
                        has(DecoBlocks.RED_BLOCK))
                .save(output,"orange_block_from_red_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.LIME_BLOCK,2)
                .requires(DecoBlocks.GREEN_BLOCK)
                .requires(DecoBlocks.WHITE_BLOCK)
                .group("lime_block")
                .unlockedBy(getHasName(DecoBlocks.GREEN_BLOCK),
                        has(DecoBlocks.GREEN_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.WHITE_BLOCK),
                        has(DecoBlocks.WHITE_BLOCK))
                .save(output,"lime_block_from_green_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.CYAN_BLOCK,2)
                .requires(DecoBlocks.GREEN_BLOCK)
                .requires(DecoBlocks.BLUE_BLOCK)
                .group("cyan_block")
                .unlockedBy(getHasName(DecoBlocks.GREEN_BLOCK),
                        has(DecoBlocks.GREEN_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.BLUE_BLOCK),
                        has(DecoBlocks.BLUE_BLOCK))
                .save(output,"cyan_block_from_green_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.CYAN_BLOCK,3)
                .requires(DecoBlocks.YELLOW_BLOCK)
                .requires(DecoBlocks.BLUE_BLOCK)
                .requires(DecoBlocks.BLUE_BLOCK)
                .group("cyan_block")
                .unlockedBy(getHasName(DecoBlocks.YELLOW_BLOCK),
                        has(DecoBlocks.YELLOW_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.BLUE_BLOCK),
                        has(DecoBlocks.BLUE_BLOCK))
                .save(output,"cyan_block_from_blue_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.CYAN_DYE,3)
                .requires(Items.YELLOW_DYE)
                .requires(Items.BLUE_DYE)
                .requires(Items.BLUE_DYE)
                .group("cyan_dye")
                .unlockedBy(getHasName(Items.YELLOW_DYE),
                        has(Items.YELLOW_DYE))
                .unlockedBy(getHasName(Items.BLUE_DYE),
                        has(Items.BLUE_DYE))
                .save(output,"cyan_dye_from_blue_dye"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.LIGHT_BLUE_BLOCK,2)
                .requires(DecoBlocks.BLUE_BLOCK)
                .requires(DecoBlocks.WHITE_BLOCK)
                .group("light_blue_block")
                .unlockedBy(getHasName(DecoBlocks.BLUE_BLOCK),
                        has(DecoBlocks.BLUE_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.WHITE_BLOCK),
                        has(DecoBlocks.WHITE_BLOCK))
                .save(output,"light_blue_block_from_blue_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.PURPLE_BLOCK,2)
                .requires(DecoBlocks.RED_BLOCK)
                .requires(DecoBlocks.BLUE_BLOCK)
                .group("purple_block")
                .unlockedBy(getHasName(DecoBlocks.RED_BLOCK),
                        has(DecoBlocks.RED_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.BLUE_BLOCK),
                        has(DecoBlocks.BLUE_BLOCK))
                .save(output,"purple_block_from_red_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.MAGENTA_BLOCK,2)
                .requires(DecoBlocks.PINK_BLOCK)
                .requires(DecoBlocks.PURPLE_BLOCK)
                .group("magenta_block")
                .unlockedBy(getHasName(DecoBlocks.PINK_BLOCK),
                        has(DecoBlocks.PINK_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.PURPLE_BLOCK),
                        has(DecoBlocks.PURPLE_BLOCK))
                .save(output,"magenta_block_from_pink_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.MAGENTA_BLOCK,3)
                .requires(DecoBlocks.PINK_BLOCK)
                .requires(DecoBlocks.RED_BLOCK)
                .requires(DecoBlocks.BLUE_BLOCK)
                .group("magenta_block")
                .unlockedBy(getHasName(DecoBlocks.PINK_BLOCK),
                        has(DecoBlocks.PINK_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.RED_BLOCK),
                        has(DecoBlocks.RED_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.BLUE_BLOCK),
                        has(DecoBlocks.BLUE_BLOCK))
                .save(output,"magenta_block_from_blue_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.MAGENTA_BLOCK,3)
                .requires(DecoBlocks.WHITE_BLOCK)
                .requires(DecoBlocks.RED_BLOCK)
                .requires(DecoBlocks.PURPLE_BLOCK)
                .group("magenta_block")
                .unlockedBy(getHasName(DecoBlocks.WHITE_BLOCK),
                        has(DecoBlocks.WHITE_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.RED_BLOCK),
                        has(DecoBlocks.RED_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.PURPLE_BLOCK),
                        has(DecoBlocks.PURPLE_BLOCK))
                .save(output,"magenta_block_from_purple_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.MAGENTA_BLOCK,4)
                .requires(DecoBlocks.WHITE_BLOCK)
                .requires(DecoBlocks.RED_BLOCK)
                .requires(DecoBlocks.RED_BLOCK)
                .requires(DecoBlocks.BLUE_BLOCK)
                .group("magenta_block")
                .unlockedBy(getHasName(DecoBlocks.WHITE_BLOCK),
                        has(DecoBlocks.WHITE_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.RED_BLOCK),
                        has(DecoBlocks.RED_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.BLUE_BLOCK),
                        has(DecoBlocks.BLUE_BLOCK))
                .save(output,"magenta_block_from_white_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.MAGENTA_DYE,3)
                .requires(Items.WHITE_DYE)
                .requires(Items.RED_DYE)
                .requires(Items.PURPLE_DYE)
                .group("magenta_dye")
                .unlockedBy(getHasName(Items.WHITE_DYE),
                        has(Items.WHITE_DYE))
                .unlockedBy(getHasName(Items.RED_DYE),
                        has(Items.RED_DYE))
                .unlockedBy(getHasName(Items.PURPLE_DYE),
                        has(Items.PURPLE_DYE))
                .save(output,"magenta_dye_from_purple_dye"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.PINK_BLOCK,2)
                .requires(DecoBlocks.RED_BLOCK)
                .requires(DecoBlocks.WHITE_BLOCK)
                .group("pink_block")
                .unlockedBy(getHasName(DecoBlocks.RED_BLOCK),
                        has(DecoBlocks.RED_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.WHITE_BLOCK),
                        has(DecoBlocks.WHITE_BLOCK))
                .save(output,"pink_block_from_red_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.BROWN_BLOCK,2)
                .requires(DecoBlocks.RED_BLOCK)
                .requires(DecoBlocks.GREEN_BLOCK)
                .group("brown_block")
                .unlockedBy(getHasName(DecoBlocks.RED_BLOCK),
                        has(DecoBlocks.RED_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.GREEN_BLOCK),
                        has(DecoBlocks.GREEN_BLOCK))
                .save(output,"brown_block_from_red_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.BROWN_DYE,2)
                .requires(Items.RED_DYE)
                .requires(Items.GREEN_DYE)
                .group("brown_dye")
                .unlockedBy(getHasName(Items.RED_DYE),
                        has(Items.RED_DYE))
                .unlockedBy(getHasName(Items.GREEN_DYE),
                        has(Items.GREEN_DYE))
                .save(output,"brown_dye_from_red_dye"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.BROWN_BLOCK,3)
                .requires(DecoBlocks.RED_BLOCK)
                .requires(DecoBlocks.YELLOW_BLOCK)
                .requires(DecoBlocks.BLUE_BLOCK)
                .group("brown_block")
                .unlockedBy(getHasName(DecoBlocks.RED_BLOCK),
                        has(DecoBlocks.RED_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.YELLOW_BLOCK),
                        has(DecoBlocks.YELLOW_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.BLUE_BLOCK),
                        has(DecoBlocks.BLUE_BLOCK))
                .save(output,"brown_block_from_blue_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.BROWN_DYE,3)
                .requires(Items.RED_DYE)
                .requires(Items.YELLOW_DYE)
                .requires(Items.BLUE_DYE)
                .group("brown_dye")
                .unlockedBy(getHasName(Items.RED_DYE),
                        has(Items.RED_DYE))
                .unlockedBy(getHasName(Items.YELLOW_DYE),
                        has(Items.YELLOW_DYE))
                .unlockedBy(getHasName(Items.BLUE_DYE),
                        has(Items.BLUE_DYE))
                .save(output,"brown_dye_from_blue_dye"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.GREEN_BLOCK,2)
                .requires(DecoBlocks.BLUE_BLOCK)
                .requires(DecoBlocks.YELLOW_BLOCK)
                .group("green_block")
                .unlockedBy(getHasName(DecoBlocks.BLUE_BLOCK),
                        has(DecoBlocks.BLUE_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.YELLOW_BLOCK),
                        has(DecoBlocks.YELLOW_BLOCK))
                .save(output,"green_block_from_blue_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.GREEN_DYE,2)
                .requires(Items.BLUE_DYE)
                .requires(Items.YELLOW_DYE)
                .group("green_dye")
                .unlockedBy(getHasName(Items.BLUE_DYE),
                        has(Items.BLUE_DYE))
                .unlockedBy(getHasName(Items.YELLOW_DYE),
                        has(Items.YELLOW_DYE))
                .group("green_dye")
                .save(output,"green_dye_from_blue_dye"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,DecoBlocks.LIME_BLOCK,3)
                .requires(DecoBlocks.WHITE_BLOCK)
                .requires(DecoBlocks.YELLOW_BLOCK)
                .requires(DecoBlocks.BLUE_BLOCK)
                .group("lime_block")
                .unlockedBy(getHasName(DecoBlocks.WHITE_BLOCK),
                        has(DecoBlocks.WHITE_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.YELLOW_BLOCK),
                        has(DecoBlocks.YELLOW_BLOCK))
                .unlockedBy(getHasName(DecoBlocks.BLUE_BLOCK),
                        has(DecoBlocks.BLUE_BLOCK))
                .save(output,"lime_block_from_yellow_block"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.LIME_DYE,3)
                .requires(Items.WHITE_DYE)
                .requires(Items.YELLOW_DYE)
                .requires(Items.BLUE_DYE)
                .group("lime_dye")
                .unlockedBy(getHasName(Items.WHITE_DYE),
                        has(Items.WHITE_DYE))
                .unlockedBy(getHasName(Items.YELLOW_DYE),
                        has(Items.YELLOW_DYE))
                .unlockedBy(getHasName(Items.BLUE_DYE),
                        has(Items.BLUE_DYE))
                .group("lime_dye")
                .save(output,"lime_dye_from_yellow_dye"+ "_recipe_create");

        stairBuilder(DecoBlocks.WOODEN_STAIRS, Ingredient.of(DecoBlocks.WOODEN_PLANKS))
                .group("wooden_stairs")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),has(DecoBlocks.WOODEN_PLANKS))
                .save(output,getSimpleRecipeName(DecoBlocks.WOODEN_STAIRS)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_SLAB,6)
                .pattern("###")
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_slab")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.WOODEN_SLAB)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.WOODEN_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .define('/', Items.STICK)
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_fence")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.WOODEN_FENCE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .define('/', Items.STICK)
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.WOODEN_FENCE_GATE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_PRESSURE_PLATE)
                .pattern("##")
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.WOODEN_PRESSURE_PLATE)+ "_recipe_create");

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_BUTTON)
                .requires(DecoBlocks.WOODEN_PLANKS)
                .group("wooden_button")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.WOODEN_BUTTON)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_door")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.WOODEN_DOOR)+ "_recipe_create");
        shaped(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output, getSimpleRecipeName(DecoBlocks.WOODEN_TRAPDOOR)+ "_recipe_create");

        signBuilder(DecoItems.WOODEN_SIGN, Ingredient.of(DecoBlocks.WOODEN_PLANKS))
                .group("wooden_sign")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),has(DecoBlocks.WOODEN_PLANKS))
                .save(output,getSimpleRecipeName(DecoItems.WOODEN_SIGN)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_WOOD,3)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.WOODEN_LOG)
                .group("bark")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_LOG),
                        has(DecoBlocks.WOODEN_LOG))
                .save(output, getSimpleRecipeName(DecoBlocks.WOODEN_WOOD)+ "_recipe_create");
        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STRIPPED_WOODEN_WOOD,3)
                .pattern("##")
                .pattern("##")
                .define('#', DecoBlocks.STRIPPED_WOODEN_LOG)
                .group("bark")
                .unlockedBy(getHasName(DecoBlocks.STRIPPED_WOODEN_LOG),
                        has(DecoBlocks.STRIPPED_WOODEN_LOG))
                .save(output, getSimpleRecipeName(DecoBlocks.STRIPPED_WOODEN_WOOD)+ "_recipe_create");

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.COPPER_BUTTON)
                .requires(Items.COPPER_NUGGET)
                .unlockedBy(getHasName(Items.COPPER_NUGGET),
                        has(Items.COPPER_NUGGET))
                .save(output,getSimpleRecipeName(DecoBlocks.COPPER_BUTTON)+ "_recipe_create");
        shapeless(RecipeCategory.REDSTONE,DecoBlocks.IRON_BUTTON)
                .requires(Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET),
                        has(Items.IRON_NUGGET))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_BUTTON)+ "_recipe_create");
        shapeless(RecipeCategory.REDSTONE,DecoBlocks.GOLD_BUTTON)
                .requires(Items.GOLD_NUGGET)
                .unlockedBy(getHasName(Items.GOLD_NUGGET),
                        has(Items.GOLD_NUGGET))
                .save(output,getSimpleRecipeName(DecoBlocks.GOLD_BUTTON)+ "_recipe_create");

        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OAK_MOSAIC, Blocks.OAK_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SPRUCE_MOSAIC, Blocks.SPRUCE_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BIRCH_MOSAIC, Blocks.BIRCH_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.JUNGLE_MOSAIC, Blocks.JUNGLE_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ACACIA_MOSAIC, Blocks.ACACIA_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DARK_OAK_MOSAIC, Blocks.DARK_OAK_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MANGROVE_MOSAIC, Blocks.MANGROVE_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHERRY_MOSAIC, Blocks.CHERRY_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRIMSON_MOSAIC, Blocks.CRIMSON_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_MOSAIC, Blocks.WARPED_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PALE_OAK_MOSAIC, Blocks.WARPED_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CACTUS_MOSAIC, DecoBlocks.CACTUS_PLANK_SLAB);
        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WOODEN_MOSAIC, DecoBlocks.WOODEN_SLAB);

        stairBuilder(DecoBlocks.OAK_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.OAK_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.OAK_MOSAIC),has(DecoBlocks.OAK_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.OAK_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OAK_MOSAIC_SLAB, DecoBlocks.OAK_MOSAIC);

        stairBuilder(DecoBlocks.SPRUCE_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.SPRUCE_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.SPRUCE_MOSAIC),has(DecoBlocks.SPRUCE_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.SPRUCE_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SPRUCE_MOSAIC_SLAB, DecoBlocks.SPRUCE_MOSAIC);

        stairBuilder(DecoBlocks.BIRCH_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.BIRCH_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.BIRCH_MOSAIC),has(DecoBlocks.BIRCH_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.BIRCH_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BIRCH_MOSAIC_SLAB, DecoBlocks.BIRCH_MOSAIC);

        stairBuilder(DecoBlocks.JUNGLE_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.JUNGLE_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.JUNGLE_MOSAIC),has(DecoBlocks.JUNGLE_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.JUNGLE_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.JUNGLE_MOSAIC_SLAB, DecoBlocks.JUNGLE_MOSAIC);

        stairBuilder(DecoBlocks.ACACIA_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.ACACIA_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.ACACIA_MOSAIC),has(DecoBlocks.ACACIA_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.ACACIA_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ACACIA_MOSAIC_SLAB, DecoBlocks.ACACIA_MOSAIC);

        stairBuilder(DecoBlocks.DARK_OAK_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.DARK_OAK_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.DARK_OAK_MOSAIC),has(DecoBlocks.DARK_OAK_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.DARK_OAK_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DARK_OAK_MOSAIC_SLAB, DecoBlocks.DARK_OAK_MOSAIC);

        stairBuilder(DecoBlocks.MANGROVE_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.MANGROVE_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.MANGROVE_MOSAIC),has(DecoBlocks.MANGROVE_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.MANGROVE_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MANGROVE_MOSAIC_SLAB, DecoBlocks.MANGROVE_MOSAIC);

        stairBuilder(DecoBlocks.CHERRY_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.CHERRY_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.CHERRY_MOSAIC),has(DecoBlocks.CHERRY_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.CHERRY_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHERRY_MOSAIC_SLAB, DecoBlocks.CHERRY_MOSAIC);

        stairBuilder(DecoBlocks.CRIMSON_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.CRIMSON_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.CRIMSON_MOSAIC),has(DecoBlocks.CRIMSON_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.CRIMSON_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRIMSON_MOSAIC_SLAB, DecoBlocks.CRIMSON_MOSAIC);

        stairBuilder(DecoBlocks.WARPED_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.WARPED_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.WARPED_MOSAIC),has(DecoBlocks.WARPED_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.WARPED_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_MOSAIC_SLAB, DecoBlocks.WARPED_MOSAIC);

        stairBuilder(DecoBlocks.CACTUS_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.CACTUS_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.CACTUS_MOSAIC),has(DecoBlocks.CACTUS_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.CACTUS_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CACTUS_MOSAIC_SLAB, DecoBlocks.CACTUS_MOSAIC);

        stairBuilder(DecoBlocks.PALE_OAK_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.PALE_OAK_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.PALE_OAK_MOSAIC),has(DecoBlocks.PALE_OAK_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoBlocks.PALE_OAK_MOSAIC_STAIRS)+ "_recipe_create");
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PALE_OAK_MOSAIC_SLAB, DecoBlocks.PALE_OAK_MOSAIC);

        stairBuilder(DecoBlocks.WOODEN_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.WOODEN_MOSAIC))
                .unlockedBy(getHasName(DecoBlocks.WOODEN_MOSAIC),has(DecoBlocks.WOODEN_MOSAIC))
                .save(output,getSimpleRecipeName(DecoBlocks.WOODEN_MOSAIC_STAIRS)+ "_recipe_create");
        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WOODEN_MOSAIC_SLAB, DecoBlocks.WOODEN_MOSAIC);

                signBuilder(DecoItems.STRIPPED_OAK_SIGN, Ingredient.of(Blocks.STRIPPED_OAK_LOG))
                        .unlockedBy(getHasName(Blocks.STRIPPED_OAK_LOG),has(Blocks.STRIPPED_OAK_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_OAK_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_SPRUCE_SIGN, Ingredient.of(Blocks.STRIPPED_SPRUCE_LOG))
                        .unlockedBy(getHasName(Blocks.STRIPPED_SPRUCE_LOG),has(Blocks.STRIPPED_SPRUCE_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_SPRUCE_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_BIRCH_SIGN, Ingredient.of(Blocks.STRIPPED_BIRCH_LOG))
                        .unlockedBy(getHasName(Blocks.STRIPPED_BIRCH_LOG),has(Blocks.STRIPPED_BIRCH_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_BIRCH_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_JUNGLE_SIGN, Ingredient.of(Blocks.STRIPPED_JUNGLE_LOG))
                        .unlockedBy(getHasName(Blocks.STRIPPED_JUNGLE_LOG),has(Blocks.STRIPPED_JUNGLE_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_JUNGLE_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_ACACIA_SIGN, Ingredient.of(Blocks.STRIPPED_ACACIA_LOG))
                        .unlockedBy(getHasName(Blocks.STRIPPED_ACACIA_LOG),has(Blocks.STRIPPED_ACACIA_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_ACACIA_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_DARK_OAK_SIGN, Ingredient.of(Blocks.STRIPPED_DARK_OAK_LOG))
                        .unlockedBy(getHasName(Blocks.STRIPPED_DARK_OAK_LOG),has(Blocks.STRIPPED_DARK_OAK_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_DARK_OAK_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_MANGROVE_SIGN, Ingredient.of(Blocks.STRIPPED_MANGROVE_LOG))
                        .unlockedBy(getHasName(Blocks.STRIPPED_MANGROVE_LOG),has(Blocks.STRIPPED_MANGROVE_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_MANGROVE_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_CHERRY_SIGN, Ingredient.of(Blocks.STRIPPED_CHERRY_LOG))
                        .unlockedBy(getHasName(Blocks.STRIPPED_CHERRY_LOG),has(Blocks.STRIPPED_CHERRY_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_CHERRY_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_CRIMSON_SIGN, Ingredient.of(Blocks.STRIPPED_CRIMSON_STEM))
                        .unlockedBy(getHasName(Blocks.STRIPPED_CRIMSON_STEM),has(Blocks.STRIPPED_CRIMSON_STEM))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_CRIMSON_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_WARPED_SIGN, Ingredient.of(Blocks.STRIPPED_WARPED_STEM))
                        .unlockedBy(getHasName(Blocks.STRIPPED_WARPED_STEM),has(Blocks.STRIPPED_WARPED_STEM))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_WARPED_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_WOODEN_SIGN, Ingredient.of(DecoBlocks.STRIPPED_WOODEN_LOG))
                        .unlockedBy(getHasName(DecoBlocks.STRIPPED_WOODEN_LOG),has(DecoBlocks.STRIPPED_WOODEN_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_WOODEN_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_PALE_OAK_SIGN, Ingredient.of(Blocks.STRIPPED_PALE_OAK_LOG))
                        .unlockedBy(getHasName(Blocks.STRIPPED_PALE_OAK_LOG),has(Blocks.STRIPPED_PALE_OAK_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_PALE_OAK_SIGN) + "_recipe_create");
                signBuilder(Items.BAMBOO_SIGN, Ingredient.of(Blocks.STRIPPED_BAMBOO_BLOCK))
                        .unlockedBy(getHasName(Blocks.STRIPPED_BAMBOO_BLOCK),has(Blocks.STRIPPED_BAMBOO_BLOCK))
                        .save(output, getSimpleRecipeName(Items.BAMBOO_SIGN) + "_stripped_bamboo_block");

                signBuilder(DecoItems.OAK_MOSAIC_SIGN, Ingredient.of(DecoBlocks.OAK_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.OAK_MOSAIC),has(DecoBlocks.OAK_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.OAK_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.SPRUCE_MOSAIC_SIGN, Ingredient.of(DecoBlocks.SPRUCE_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.SPRUCE_MOSAIC),has(DecoBlocks.SPRUCE_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.SPRUCE_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.BIRCH_MOSAIC_SIGN, Ingredient.of(DecoBlocks.BIRCH_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.BIRCH_MOSAIC),has(DecoBlocks.BIRCH_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.BIRCH_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.JUNGLE_MOSAIC_SIGN, Ingredient.of(DecoBlocks.JUNGLE_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.JUNGLE_MOSAIC),has(DecoBlocks.JUNGLE_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.JUNGLE_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.ACACIA_MOSAIC_SIGN, Ingredient.of(DecoBlocks.ACACIA_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.ACACIA_MOSAIC),has(DecoBlocks.ACACIA_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.ACACIA_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.DARK_OAK_MOSAIC_SIGN, Ingredient.of(DecoBlocks.DARK_OAK_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.DARK_OAK_MOSAIC),has(DecoBlocks.DARK_OAK_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.DARK_OAK_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.MANGROVE_MOSAIC_SIGN, Ingredient.of(DecoBlocks.MANGROVE_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.MANGROVE_MOSAIC),has(DecoBlocks.MANGROVE_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.MANGROVE_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.CHERRY_MOSAIC_SIGN, Ingredient.of(DecoBlocks.CHERRY_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.CHERRY_MOSAIC),has(DecoBlocks.CHERRY_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.CHERRY_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.BAMBOO_MOSAIC_SIGN, Ingredient.of(Blocks.BAMBOO_MOSAIC))
                        .unlockedBy(getHasName(Blocks.BAMBOO_MOSAIC),has(Blocks.BAMBOO_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.BAMBOO_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.CRIMSON_MOSAIC_SIGN, Ingredient.of(DecoBlocks.CRIMSON_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.CRIMSON_MOSAIC),has(DecoBlocks.CRIMSON_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.CRIMSON_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.WARPED_MOSAIC_SIGN, Ingredient.of(DecoBlocks.WARPED_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.WARPED_MOSAIC),has(DecoBlocks.WARPED_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.WARPED_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.WOODEN_MOSAIC_SIGN, Ingredient.of(DecoBlocks.WOODEN_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.WOODEN_MOSAIC),has(DecoBlocks.WOODEN_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.WOODEN_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.CACTUS_MOSAIC_SIGN, Ingredient.of(DecoBlocks.CACTUS_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.CACTUS_MOSAIC),has(DecoBlocks.CACTUS_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.CACTUS_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.PALE_OAK_MOSAIC_SIGN, Ingredient.of(DecoBlocks.PALE_OAK_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.PALE_OAK_MOSAIC),has(DecoBlocks.PALE_OAK_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.PALE_OAK_MOSAIC_SIGN) + "_recipe_create");

        hangingSign(DecoItems.WOODEN_HANGING_SIGN, DecoBlocks.STRIPPED_WOODEN_LOG);

        hangingSign(DecoItems.OAK_PLANKS_HANGING_SIGN, Blocks.OAK_PLANKS);
        hangingSign(DecoItems.SPRUCE_PLANKS_HANGING_SIGN, Blocks.SPRUCE_PLANKS);
        hangingSign(DecoItems.BIRCH_PLANKS_HANGING_SIGN, Blocks.BIRCH_PLANKS);
        hangingSign(DecoItems.JUNGLE_PLANKS_HANGING_SIGN, Blocks.JUNGLE_PLANKS);
        hangingSign(DecoItems.ACACIA_PLANKS_HANGING_SIGN, Blocks.ACACIA_PLANKS);
        hangingSign(DecoItems.DARK_OAK_PLANKS_HANGING_SIGN, Blocks.DARK_OAK_PLANKS);
        hangingSign(DecoItems.MANGROVE_PLANKS_HANGING_SIGN, Blocks.MANGROVE_PLANKS);
        hangingSign(DecoItems.CHERRY_PLANKS_HANGING_SIGN, Blocks.CHERRY_PLANKS);
        hangingSign(DecoItems.CRIMSON_PLANKS_HANGING_SIGN, Blocks.CRIMSON_PLANKS);
        hangingSign(DecoItems.WARPED_PLANKS_HANGING_SIGN, Blocks.WARPED_PLANKS);
        hangingSign(DecoItems.PALE_OAK_PLANKS_HANGING_SIGN, Blocks.PALE_OAK_PLANKS);
        hangingSign(DecoItems.CACTUS_PLANKS_HANGING_SIGN, DecoBlocks.CACTUS_PLANKS);
        hangingSign(DecoItems.WOODEN_PLANKS_HANGING_SIGN, DecoBlocks.WOODEN_PLANKS);

        hangingSign(DecoItems.OAK_MOSAIC_HANGING_SIGN, DecoBlocks.OAK_MOSAIC);
        hangingSign(DecoItems.SPRUCE_MOSAIC_HANGING_SIGN, DecoBlocks.SPRUCE_MOSAIC);
        hangingSign(DecoItems.BIRCH_MOSAIC_HANGING_SIGN, DecoBlocks.BIRCH_MOSAIC);
        hangingSign(DecoItems.JUNGLE_MOSAIC_HANGING_SIGN, DecoBlocks.JUNGLE_MOSAIC);
        hangingSign(DecoItems.ACACIA_MOSAIC_HANGING_SIGN, DecoBlocks.ACACIA_MOSAIC);
        hangingSign(DecoItems.DARK_OAK_MOSAIC_HANGING_SIGN, DecoBlocks.DARK_OAK_MOSAIC);
        hangingSign(DecoItems.MANGROVE_MOSAIC_HANGING_SIGN, DecoBlocks.MANGROVE_MOSAIC);
        hangingSign(DecoItems.CHERRY_MOSAIC_HANGING_SIGN, DecoBlocks.CHERRY_MOSAIC);
        hangingSign(DecoItems.BAMBOO_MOSAIC_HANGING_SIGN, Blocks.BAMBOO_MOSAIC);
        hangingSign(DecoItems.CRIMSON_MOSAIC_HANGING_SIGN, DecoBlocks.CRIMSON_MOSAIC);
        hangingSign(DecoItems.PALE_OAK_MOSAIC_HANGING_SIGN, DecoBlocks.PALE_OAK_MOSAIC);
        hangingSign(DecoItems.WARPED_MOSAIC_HANGING_SIGN, DecoBlocks.WARPED_MOSAIC);
        hangingSign(DecoItems.CACTUS_MOSAIC_HANGING_SIGN, DecoBlocks.CACTUS_MOSAIC);
        hangingSign(DecoItems.WOODEN_MOSAIC_HANGING_SIGN, DecoBlocks.WOODEN_MOSAIC);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_WHITE_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.WHITE_STAINED_GLASS), has(Items.WHITE_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.LIGHT_GRAY_STAINED_GLASS), has(Items.LIGHT_GRAY_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_GRAY_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.GRAY_STAINED_GLASS), has(Items.GRAY_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_BLACK_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.BLACK_STAINED_GLASS), has(Items.BLACK_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_BROWN_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.BROWN_STAINED_GLASS), has(Items.BROWN_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_RED_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.RED_STAINED_GLASS), has(Items.RED_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_RED_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.ORANGE_STAINED_GLASS), has(Items.ORANGE_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.YELLOW_STAINED_GLASS), has(Items.YELLOW_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_LIME_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.LIME_STAINED_GLASS), has(Items.LIME_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_LIME_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_GREEN_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.GREEN_STAINED_GLASS), has(Items.GREEN_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_CYAN_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.CYAN_STAINED_GLASS), has(Items.CYAN_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.LIGHT_BLUE_STAINED_GLASS), has(Items.LIGHT_BLUE_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_BLUE_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.BLUE_STAINED_GLASS), has(Items.BLUE_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.PURPLE_STAINED_GLASS), has(Items.PURPLE_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.MAGENTA_STAINED_GLASS), has(Items.MAGENTA_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS)+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_PINK_STAINED_GLASS,
                        0.1f, 200).group("mosaic_glass")
                .unlockedBy(getHasName(Items.PINK_STAINED_GLASS), has(Items.PINK_STAINED_GLASS))
                .save(output,getSimpleRecipeName(DecoBlocks.MOSAIC_PINK_STAINED_GLASS)+ "_recipe_create");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.WHITE_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_WHITE_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.WHITE_STAINED_GLASS_PANE), has(Items.WHITE_STAINED_GLASS_PANE))
                .save(output,"mosaic_white_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.LIGHT_GRAY_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.LIGHT_GRAY_STAINED_GLASS_PANE), has(Items.LIGHT_GRAY_STAINED_GLASS_PANE))
                .save(output,"mosaic_light_gray_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.GRAY_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_GRAY_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.GRAY_STAINED_GLASS_PANE), has(Items.GRAY_STAINED_GLASS_PANE))
                .save(output,"mosaic_gray_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BLACK_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_BLACK_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.BLACK_STAINED_GLASS_PANE), has(Items.BLACK_STAINED_GLASS_PANE))
                .save(output,"mosaic_black_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BROWN_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_BROWN_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.BROWN_STAINED_GLASS_PANE), has(Items.BROWN_STAINED_GLASS_PANE))
                .save(output,"mosaic_brown_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.RED_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_RED_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.RED_STAINED_GLASS_PANE), has(Items.RED_STAINED_GLASS_PANE))
                .save(output,"mosaic_red_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.ORANGE_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.ORANGE_STAINED_GLASS_PANE), has(Items.ORANGE_STAINED_GLASS_PANE))
                .save(output,"mosaic_orange_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.YELLOW_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.YELLOW_STAINED_GLASS_PANE), has(Items.YELLOW_STAINED_GLASS_PANE))
                .save(output,"mosaic_yellow_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.LIME_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_LIME_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.LIME_STAINED_GLASS_PANE), has(Items.LIME_STAINED_GLASS_PANE))
                .save(output,"mosaic_lime_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.GREEN_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_GREEN_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.GREEN_STAINED_GLASS_PANE), has(Items.GREEN_STAINED_GLASS_PANE))
                .save(output,"mosaic_green_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.CYAN_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.CYAN_STAINED_GLASS_PANE), has(Items.CYAN_STAINED_GLASS_PANE))
                .save(output,"mosaic_cyan_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.LIGHT_BLUE_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.LIGHT_BLUE_STAINED_GLASS_PANE), has(Items.LIGHT_BLUE_STAINED_GLASS_PANE))
                .save(output,"mosaic_light_blue_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BLUE_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_BLUE_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.BLUE_STAINED_GLASS_PANE), has(Items.BLUE_STAINED_GLASS_PANE))
                .save(output,"mosaic_blue_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.PURPLE_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.PURPLE_STAINED_GLASS_PANE), has(Items.PURPLE_STAINED_GLASS_PANE))
                .save(output,"mosaic_purple_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.MAGENTA_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.MAGENTA_STAINED_GLASS_PANE), has(Items.MAGENTA_STAINED_GLASS_PANE))
                .save(output,"mosaic_magenta_glass_pane_from_smelting"+ "_recipe_create");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.PINK_STAINED_GLASS_PANE), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.MOSAIC_PINK_STAINED_GLASS_PANE,
                        0.1f, 200).group("mosaic_glass_pane")
                .unlockedBy(getHasName(Items.PINK_STAINED_GLASS_PANE), has(Items.PINK_STAINED_GLASS_PANE))
                .save(output,"mosaic_pink_glass_pane_from_smelting"+ "_recipe_create");

        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_WHITE_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_GRAY_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_BLACK_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_BROWN_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_RED_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_RED_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_LIME_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_LIME_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_GREEN_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_CYAN_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_BLUE_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS);
        stainedGlassPaneFromStainedGlass(DecoBlocks.MOSAIC_PINK_STAINED_GLASS_PANE, DecoBlocks.MOSAIC_PINK_STAINED_GLASS);

        shapeless(RecipeCategory.MISC,Items.LIGHT_BLUE_DYE)
                .requires(DecoBlocks.ANCIENT_ROSE)
                .group("light_blue_dye")
                .unlockedBy(getHasName(DecoBlocks.ANCIENT_ROSE),
                        has(DecoBlocks.ANCIENT_ROSE))
                .save(output,"light_blue_dye_from_ancient_rose"+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.MIGHTY_LAVENDER)
                .pattern("##")
                .pattern("##")
                .define('#', DecoItems.MIGHTY_LAVENDER_FLOWER)
                .unlockedBy(getHasName(DecoItems.MIGHTY_LAVENDER_FLOWER),
                        has(DecoItems.MIGHTY_LAVENDER_FLOWER))
                .save(output,getSimpleRecipeName(DecoBlocks.MIGHTY_LAVENDER)+ "_recipe_create");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.TUFF), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.SMOOTH_TUFF,
                        0.1f, 200).unlockedBy(getHasName(Items.TUFF), has(Items.TUFF))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_TUFF)+ "_recipe_create");

        stairBuilder(DecoBlocks.SMOOTH_TUFF_STAIRS, Ingredient.of(DecoBlocks.SMOOTH_TUFF))
                .unlockedBy(getHasName(DecoBlocks.SMOOTH_TUFF),has(DecoBlocks.SMOOTH_TUFF))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_TUFF_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_TUFF_STAIRS, DecoBlocks.SMOOTH_TUFF);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_TUFF_SLAB, DecoBlocks.SMOOTH_TUFF);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_TUFF_SLAB, DecoBlocks.SMOOTH_TUFF,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_TUFF_WALL, DecoBlocks.SMOOTH_TUFF);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_TUFF_WALL, DecoBlocks.SMOOTH_TUFF);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILES, Items.TUFF_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILES, Items.TUFF_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILES, Items.TUFF);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILES, Items.POLISHED_TUFF);

        stairBuilder(DecoBlocks.TUFF_TILE_STAIRS, Ingredient.of(DecoBlocks.TUFF_TILES))
                .unlockedBy(getHasName(DecoBlocks.TUFF_TILES),has(DecoBlocks.TUFF_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.TUFF_TILE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_STAIRS, DecoBlocks.TUFF_TILES);

        slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TUFF_TILE_SLAB, DecoBlocks.TUFF_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_SLAB, DecoBlocks.TUFF_TILES,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.TUFF_TILE_WALL, DecoBlocks.TUFF_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_WALL, DecoBlocks.TUFF_TILES);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_STAIRS, Items.TUFF);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_SLAB, Items.TUFF,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_WALL, Items.TUFF);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_STAIRS, Items.POLISHED_TUFF);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_SLAB, Items.POLISHED_TUFF,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_WALL, Items.POLISHED_TUFF);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_STAIRS, Items.TUFF_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_SLAB, Items.TUFF_BRICKS,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_TILE_WALL, Items.TUFF_BRICKS);

        pressurePlate(DecoBlocks.TUFF_PRESSURE_PLATE, Items.TUFF);

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.TUFF_BUTTON)
                .requires(Items.TUFF)
                .unlockedBy(getHasName(Items.TUFF),
                        has(Items.TUFF))
                .save(output,getSimpleRecipeName(DecoBlocks.TUFF_BUTTON)+ "_recipe_create");

        pressurePlate(DecoBlocks.POLISHED_TUFF_PRESSURE_PLATE, Items.POLISHED_TUFF);

        shapeless(RecipeCategory.REDSTONE,DecoBlocks.POLISHED_TUFF_BUTTON)
                .requires(Items.POLISHED_TUFF)
                .unlockedBy(getHasName(Items.POLISHED_TUFF),
                        has(Items.POLISHED_TUFF))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_TUFF_BUTTON)+ "_recipe_create");

        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_STONE, DecoBlocks.POLISHED_STONE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_STONE, Items.COBBLESTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_STONE, DecoBlocks.POLISHED_STONE);

        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_DEEPSLATE_BRICKS, Items.DEEPSLATE_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_DEEPSLATE_BRICKS, Items.COBBLED_DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_DEEPSLATE_BRICKS, Items.POLISHED_DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_DEEPSLATE_BRICKS, Items.DEEPSLATE_BRICKS);

        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS, Items.POLISHED_BLACKSTONE_BRICK_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS, Items.BLACKSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS, Items.POLISHED_BLACKSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS, Items.POLISHED_BLACKSTONE_BRICKS);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Items.CHISELED_DEEPSLATE, Items.POLISHED_DEEPSLATE);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_GRATE,4)
                .pattern(" X ")
                .pattern("X#X")
                .pattern(" X ")
                .define('#', Items.IRON_BLOCK)
                .define('X', DecoBlocks.LIGHT_IRON_BARS)
                .unlockedBy(getHasName(Items.IRON_BLOCK),
                        has(Items.IRON_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.IRON_GRATE)+ "_recipe_create");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_GRATE, Items.IRON_BLOCK,4);

        chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_IRON, DecoBlocks.CUT_IRON_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_IRON, Items.IRON_BLOCK,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_IRON, DecoBlocks.CUT_IRON);

        woodenBoat(DecoItems.CACTUS_BOAT, DecoBlocks.CACTUS_PLANKS);
        woodenBoat(DecoItems.WOODEN_BOAT, DecoBlocks.WOODEN_PLANKS);
        woodenBoat(DecoItems.CRIMSON_BOAT, Items.CRIMSON_PLANKS);
        woodenBoat(DecoItems.WARPED_BOAT, Items.WARPED_PLANKS);

        chestBoat(DecoItems.CACTUS_CHEST_BOAT, DecoItems.CACTUS_BOAT);
        chestBoat(DecoItems.WOODEN_CHEST_BOAT, DecoItems.WOODEN_BOAT);
        chestBoat(DecoItems.CRIMSON_CHEST_BOAT, DecoItems.CRIMSON_BOAT);
        chestBoat(DecoItems.WARPED_CHEST_BOAT, DecoItems.WARPED_BOAT);

        wall(RecipeCategory.DECORATIONS, DecoBlocks.PURPUR_WALL, Items.PURPUR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_WALL, Items.PURPUR_BLOCK);

        stairBuilder(DecoBlocks.SMOOTH_BASALT_STAIRS, Ingredient.of(Items.SMOOTH_BASALT))
                .unlockedBy(getHasName(Items.SMOOTH_BASALT),has(Items.SMOOTH_BASALT))
                .save(output,getSimpleRecipeName(DecoBlocks.SMOOTH_BASALT_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BASALT_STAIRS, Items.SMOOTH_BASALT);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BASALT_SLAB, Items.SMOOTH_BASALT);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BASALT_SLAB, Items.SMOOTH_BASALT,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_BASALT_WALL, Items.SMOOTH_BASALT);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BASALT_WALL, Items.SMOOTH_BASALT);

        shaped(RecipeCategory.MISC,Items.HEART_OF_THE_SEA)
                .pattern("#C#")
                .pattern("CEC")
                .pattern("#C#")
                .define('E', Items.ENDER_EYE)
                .define('#', DecoItems.BUBBLE_ORB)
                .define('C', Items.PRISMARINE_CRYSTALS)
                .unlockedBy(getHasName(Items.ENDER_EYE),
                        has(Items.ENDER_EYE))
                .save(output,getSimpleRecipeName(Items.HEART_OF_THE_SEA)+ "_recipe_create");

        offerReversibleCompactingFourRecipes(output,Items.BUBBLE_CORAL, Items.BUBBLE_CORAL_BLOCK,
                "bubble_coral_block","coral_block",
                "bubble_coral","coral");

        offerReversibleCompactingFourRecipes(output,Items.TUBE_CORAL, Items.TUBE_CORAL_BLOCK,
                "tube_coral_block","coral_block",
                "tube_coral","coral");

        offerReversibleCompactingFourRecipes(output,Items.HORN_CORAL, Items.HORN_CORAL_BLOCK,
                "horn_coral_block","coral_block",
                "horn_coral","coral");

        offerReversibleCompactingFourRecipes(output,Items.BRAIN_CORAL, Items.BRAIN_CORAL_BLOCK,
                "brain_coral_block","coral_block",
                "brain_coral","coral");

        offerReversibleCompactingFourRecipes(output,Items.FIRE_CORAL, Items.FIRE_CORAL_BLOCK,
                "fire_coral_block","coral_block",
                "fire_coral","coral");

        offerReversibleCompactingFourRecipes(output,Items.DEAD_BUBBLE_CORAL, Items.DEAD_BUBBLE_CORAL_BLOCK,
                "dead_bubble_coral_block","coral_block",
                "dead_bubble_coral","coral");

        offerReversibleCompactingFourRecipes(output,Items.DEAD_TUBE_CORAL, Items.DEAD_TUBE_CORAL_BLOCK,
                "dead_tube_coral_block","coral_block",
                "dead_tube_coral","coral");

        offerReversibleCompactingFourRecipes(output,Items.DEAD_HORN_CORAL, Items.DEAD_HORN_CORAL_BLOCK,
                "dead_horn_coral_block","coral_block",
                "dead_horn_coral","coral");

        offerReversibleCompactingFourRecipes(output,Items.DEAD_BRAIN_CORAL, Items.DEAD_BRAIN_CORAL_BLOCK,
                "dead_brain_coral_block","coral_block",
                "dead_brain_coral","coral");

        offerReversibleCompactingFourRecipes(output,Items.DEAD_FIRE_CORAL, Items.DEAD_FIRE_CORAL_BLOCK,
                "dead_fire_coral_block","coral_block",
                "dead_fire_coral","coral");

        shaped(RecipeCategory.MISC,Items.BUBBLE_CORAL)
                .pattern("#")
                .pattern("#")
                .define('#', Items.BUBBLE_CORAL_FAN)
                .group("coral")
                .unlockedBy(getHasName(Items.BUBBLE_CORAL_FAN),
                        has(Items.BUBBLE_CORAL_FAN))
                .save(output,"bubble_coral_from_fan"+ "_recipe_create");
        shaped(RecipeCategory.MISC,Items.TUBE_CORAL)
                .pattern("#")
                .pattern("#")
                .define('#', Items.TUBE_CORAL_FAN)
                .group("coral")
                .unlockedBy(getHasName(Items.TUBE_CORAL_FAN),
                        has(Items.TUBE_CORAL_FAN))
                .save(output,"tube_coral_from_fan"+ "_recipe_create");
        shaped(RecipeCategory.MISC,Items.BRAIN_CORAL)
                .pattern("#")
                .pattern("#")
                .define('#', Items.BRAIN_CORAL_FAN)
                .group("coral")
                .unlockedBy(getHasName(Items.BRAIN_CORAL_FAN),
                        has(Items.BRAIN_CORAL_FAN))
                .save(output,"brain_coral_from_fan"+ "_recipe_create");
        shaped(RecipeCategory.MISC,Items.FIRE_CORAL)
                .pattern("#")
                .pattern("#")
                .define('#', Items.FIRE_CORAL_FAN)
                .group("coral")
                .unlockedBy(getHasName(Items.FIRE_CORAL_FAN),
                        has(Items.FIRE_CORAL_FAN))
                .save(output,"fire_coral_from_fan"+ "_recipe_create");
        shaped(RecipeCategory.MISC,Items.HORN_CORAL)
                .pattern("#")
                .pattern("#")
                .define('#', Items.HORN_CORAL_FAN)
                .group("coral")
                .unlockedBy(getHasName(Items.HORN_CORAL_FAN),
                        has(Items.HORN_CORAL_FAN))
                .save(output,"horn_coral_from_fan"+ "_recipe_create");

        shaped(RecipeCategory.MISC,Items.DEAD_BUBBLE_CORAL)
                .pattern("#")
                .pattern("#")
                .define('#', Items.DEAD_BUBBLE_CORAL_FAN)
                .group("coral")
                .unlockedBy(getHasName(Items.DEAD_BUBBLE_CORAL_FAN),
                        has(Items.DEAD_BUBBLE_CORAL_FAN))
                .save(output,"dead_bubble_coral_from_fan"+ "_recipe_create");
        shaped(RecipeCategory.MISC,Items.DEAD_TUBE_CORAL)
                .pattern("#")
                .pattern("#")
                .define('#', Items.DEAD_TUBE_CORAL_FAN)
                .group("coral")
                .unlockedBy(getHasName(Items.DEAD_TUBE_CORAL_FAN),
                        has(Items.DEAD_TUBE_CORAL_FAN))
                .save(output,"dead_tube_coral_from_fan"+ "_recipe_create");
        shaped(RecipeCategory.MISC,Items.DEAD_BRAIN_CORAL)
                .pattern("#")
                .pattern("#")
                .define('#', Items.DEAD_BRAIN_CORAL_FAN)
                .group("coral")
                .unlockedBy(getHasName(Items.DEAD_BRAIN_CORAL_FAN),
                        has(Items.DEAD_BRAIN_CORAL_FAN))
                .save(output,"dead_brain_coral_from_fan"+ "_recipe_create");
        shaped(RecipeCategory.MISC,Items.DEAD_FIRE_CORAL)
                .pattern("#")
                .pattern("#")
                .define('#', Items.DEAD_FIRE_CORAL_FAN)
                .group("coral")
                .unlockedBy(getHasName(Items.DEAD_FIRE_CORAL_FAN),
                        has(Items.DEAD_FIRE_CORAL_FAN))
                .save(output,"dead_fire_coral_from_fan"+ "_recipe_create");
        shaped(RecipeCategory.MISC,Items.DEAD_HORN_CORAL)
                .pattern("#")
                .pattern("#")
                .define('#', Items.DEAD_HORN_CORAL_FAN)
                .group("coral")
                .unlockedBy(getHasName(Items.DEAD_HORN_CORAL_FAN),
                        has(Items.DEAD_HORN_CORAL_FAN))
                .save(output,"dead_horn_coral_from_fan"+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,Items.LILAC)
                .pattern("##")
                .pattern("##")
                .define('#', DecoItems.LILAC_FLOWER)
                .unlockedBy(getHasName(DecoItems.LILAC_FLOWER),
                        has(DecoItems.LILAC_FLOWER))
                .save(output,getSimpleRecipeName(Items.LILAC)+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.MAGENTA_DYE)
                .requires(DecoItems.LILAC_FLOWER)
                .group("magenta_dye")
                .unlockedBy(getHasName(DecoItems.LILAC_FLOWER),
                        has(DecoItems.LILAC_FLOWER))
                .save(output,"magenta_dye_from_lilac_flower"+ "_recipe_create");

        shaped(RecipeCategory.MISC,Items.TALL_GRASS)
                .pattern("#")
                .pattern("#")
                .define('#', Items.SHORT_GRASS)
                .unlockedBy(getHasName(Items.SHORT_GRASS),
                        has(Items.SHORT_GRASS))
                .save(output,getSimpleRecipeName(Items.TALL_GRASS)+ "_recipe_create");

        shaped(RecipeCategory.MISC,Items.LARGE_FERN)
                .pattern("#")
                .pattern("#")
                .define('#', Items.FERN)
                .unlockedBy(getHasName(Items.FERN),
                        has(Items.FERN))
                .save(output,getSimpleRecipeName(Items.LARGE_FERN)+ "_recipe_create");

        shaped(RecipeCategory.MISC,Items.WARPED_ROOTS)
                .pattern("#")
                .pattern("#")
                .define('#', Items.NETHER_SPROUTS)
                .unlockedBy(getHasName(Items.NETHER_SPROUTS),
                        has(Items.NETHER_SPROUTS))
                .save(output,getSimpleRecipeName(Items.WARPED_ROOTS)+ "_recipe_create");

        shaped(RecipeCategory.MISC,DecoItems.TALL_SEAGRASS)
                .pattern("#")
                .pattern("#")
                .define('#', Items.SEAGRASS)
                .unlockedBy(getHasName(Items.SEAGRASS),
                        has(Items.SEAGRASS))
                .save(output,getSimpleRecipeName(DecoItems.TALL_SEAGRASS)+ "_recipe_create");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.STONE_TILES), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.CRACKED_STONE_TILES,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.STONE_TILES), has(DecoBlocks.STONE_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_STONE_TILES)+ "_recipe_create");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.POLISHED_BLACKSTONE_TILES), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.POLISHED_BLACKSTONE_TILES), has(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_GRINDSTONE)
                .pattern("I-I")
                .pattern("# #")
                .define('I', Items.STICK)
                .define('-', DecoBlocks.DEEPSLATE_SLAB)
                .define('#', ItemTags.PLANKS)
                .unlockedBy(getHasName(DecoBlocks.DEEPSLATE_SLAB),
                        has(DecoBlocks.DEEPSLATE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.DEEPSLATE_GRINDSTONE)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.BLACKSTONE_GRINDSTONE)
                .pattern("I-I")
                .pattern("# #")
                .define('I', Items.STICK)
                .define('-', Items.BLACKSTONE_SLAB)
                .define('#', ItemTags.PLANKS)
                .unlockedBy(getHasName(Items.BLACKSTONE_SLAB),
                        has(Items.BLACKSTONE_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.BLACKSTONE_GRINDSTONE)+ "_recipe_create");

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE,4)
                .requires(Items.SANDSTONE)
                .unlockedBy(getHasName(Items.SANDSTONE),
                        has(Items.SANDSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.COBBLED_SANDSTONE)+ "_recipe_create");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE, Items.SANDSTONE,4);

        stairBuilder(DecoBlocks.COBBLED_SANDSTONE_STAIRS, Ingredient.of(DecoBlocks.COBBLED_SANDSTONE))
                .unlockedBy(getHasName(DecoBlocks.COBBLED_SANDSTONE),has(DecoBlocks.COBBLED_SANDSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.COBBLED_SANDSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_STAIRS, Items.SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_STAIRS, DecoBlocks.COBBLED_SANDSTONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_SLAB, DecoBlocks.COBBLED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_SLAB, Items.SANDSTONE,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_SLAB, DecoBlocks.COBBLED_SANDSTONE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.COBBLED_SANDSTONE_WALL, DecoBlocks.COBBLED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_WALL, Items.SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_WALL, DecoBlocks.COBBLED_SANDSTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE, DecoBlocks.COBBLED_SANDSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE, Items.SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE, DecoBlocks.COBBLED_SANDSTONE);

        stairBuilder(DecoBlocks.POLISHED_SANDSTONE_STAIRS, Ingredient.of(DecoBlocks.POLISHED_SANDSTONE))
                .unlockedBy(getHasName(DecoBlocks.POLISHED_SANDSTONE),has(DecoBlocks.POLISHED_SANDSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_SANDSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_STAIRS, Items.SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_STAIRS, DecoBlocks.COBBLED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_STAIRS, DecoBlocks.POLISHED_SANDSTONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_SLAB, DecoBlocks.POLISHED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_SLAB, Items.SANDSTONE,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_SLAB, DecoBlocks.COBBLED_SANDSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_SLAB, DecoBlocks.POLISHED_SANDSTONE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_SANDSTONE_WALL, DecoBlocks.POLISHED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_WALL, Items.SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_WALL, DecoBlocks.COBBLED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_WALL, DecoBlocks.POLISHED_SANDSTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICKS, DecoBlocks.POLISHED_SANDSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICKS, Items.SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICKS, DecoBlocks.COBBLED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICKS, DecoBlocks.POLISHED_SANDSTONE);

        stairBuilder(DecoBlocks.SANDSTONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.SANDSTONE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.SANDSTONE_BRICKS),has(DecoBlocks.SANDSTONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.SANDSTONE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_STAIRS, Items.SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_STAIRS, DecoBlocks.COBBLED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_STAIRS, DecoBlocks.POLISHED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_STAIRS, DecoBlocks.SANDSTONE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_SLAB, DecoBlocks.POLISHED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_SLAB, Items.SANDSTONE,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_SLAB, DecoBlocks.COBBLED_SANDSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_SLAB, DecoBlocks.POLISHED_SANDSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_SLAB, DecoBlocks.SANDSTONE_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SANDSTONE_BRICK_WALL, DecoBlocks.POLISHED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_WALL, Items.SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_WALL, DecoBlocks.COBBLED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_WALL, DecoBlocks.POLISHED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_WALL, DecoBlocks.SANDSTONE_BRICKS);

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE,4)
                .requires(Items.RED_SANDSTONE)
                .unlockedBy(getHasName(Items.RED_SANDSTONE),
                        has(Items.RED_SANDSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.COBBLED_RED_SANDSTONE)+ "_recipe_create");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE, Items.RED_SANDSTONE,4);

        stairBuilder(DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS, Ingredient.of(DecoBlocks.COBBLED_RED_SANDSTONE))
                .unlockedBy(getHasName(DecoBlocks.COBBLED_RED_SANDSTONE),has(DecoBlocks.COBBLED_RED_SANDSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS, DecoBlocks.COBBLED_RED_SANDSTONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_SLAB, DecoBlocks.COBBLED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_SLAB, Items.RED_SANDSTONE,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_SLAB, DecoBlocks.COBBLED_RED_SANDSTONE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.COBBLED_RED_SANDSTONE_WALL, DecoBlocks.COBBLED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_WALL, Items.RED_SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_WALL, DecoBlocks.COBBLED_RED_SANDSTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE, DecoBlocks.COBBLED_RED_SANDSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE, Items.RED_SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE, DecoBlocks.COBBLED_RED_SANDSTONE);

        stairBuilder(DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS, Ingredient.of(DecoBlocks.POLISHED_RED_SANDSTONE))
                .unlockedBy(getHasName(DecoBlocks.POLISHED_RED_SANDSTONE),has(DecoBlocks.POLISHED_RED_SANDSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS, DecoBlocks.COBBLED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS, DecoBlocks.POLISHED_RED_SANDSTONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_SLAB, DecoBlocks.POLISHED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_SLAB, Items.RED_SANDSTONE,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_SLAB, DecoBlocks.COBBLED_RED_SANDSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_SLAB, DecoBlocks.POLISHED_RED_SANDSTONE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_RED_SANDSTONE_WALL, DecoBlocks.POLISHED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_WALL, Items.RED_SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_WALL, DecoBlocks.COBBLED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_WALL, DecoBlocks.POLISHED_RED_SANDSTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICKS, DecoBlocks.POLISHED_RED_SANDSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICKS, DecoBlocks.COBBLED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICKS, DecoBlocks.POLISHED_RED_SANDSTONE);

        stairBuilder(DecoBlocks.RED_SANDSTONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.RED_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.RED_SANDSTONE_BRICKS),has(DecoBlocks.RED_SANDSTONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.RED_SANDSTONE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_STAIRS, Items.RED_SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.COBBLED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.POLISHED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.RED_SANDSTONE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_SLAB, DecoBlocks.POLISHED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_SLAB, Items.RED_SANDSTONE,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_SLAB, DecoBlocks.COBBLED_RED_SANDSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_SLAB, DecoBlocks.POLISHED_RED_SANDSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_SLAB, DecoBlocks.RED_SANDSTONE_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.RED_SANDSTONE_BRICK_WALL, DecoBlocks.POLISHED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_WALL, Items.RED_SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_WALL, DecoBlocks.COBBLED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_WALL, DecoBlocks.POLISHED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_WALL, DecoBlocks.RED_SANDSTONE_BRICKS);

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE)
                .requires(DecoBlocks.SOUL_SOILSTONE)
                .unlockedBy(getHasName(DecoBlocks.SOUL_SOILSTONE),
                        has(DecoBlocks.SOUL_SOILSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.COBBLED_SOUL_SOILSTONE)+ "_recipe_create");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE,4);

        stairBuilder(DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS, Ingredient.of(DecoBlocks.COBBLED_SOUL_SOILSTONE))
                .unlockedBy(getHasName(DecoBlocks.COBBLED_SOUL_SOILSTONE),has(DecoBlocks.COBBLED_SOUL_SOILSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS, DecoBlocks.COBBLED_SOUL_SOILSTONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB, DecoBlocks.COBBLED_SOUL_SOILSTONE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL, DecoBlocks.COBBLED_SOUL_SOILSTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE, DecoBlocks.COBBLED_SOUL_SOILSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE, DecoBlocks.COBBLED_SOUL_SOILSTONE);

        stairBuilder(DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS, Ingredient.of(DecoBlocks.POLISHED_SOUL_SOILSTONE))
                .unlockedBy(getHasName(DecoBlocks.POLISHED_SOUL_SOILSTONE),has(DecoBlocks.POLISHED_SOUL_SOILSTONE))
                .save(output,getSimpleRecipeName(DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS, DecoBlocks.POLISHED_SOUL_SOILSTONE);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB, DecoBlocks.COBBLED_SOUL_SOILSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB, DecoBlocks.POLISHED_SOUL_SOILSTONE,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL, DecoBlocks.POLISHED_SOUL_SOILSTONE);

        polished(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICKS, DecoBlocks.POLISHED_SOUL_SOILSTONE);

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICKS, DecoBlocks.SOUL_SOILSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICKS, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICKS, DecoBlocks.POLISHED_SOUL_SOILSTONE);

        stairBuilder(DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS, Ingredient.of(DecoBlocks.SOUL_SOILSTONE_BRICKS))
                .unlockedBy(getHasName(DecoBlocks.SOUL_SOILSTONE_BRICKS),has(DecoBlocks.SOUL_SOILSTONE_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS)+ "_recipe_create");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.SOUL_SOILSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.SOUL_SOILSTONE_BRICKS);

        slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.SOUL_SOILSTONE,8);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.COBBLED_SOUL_SOILSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.POLISHED_SOUL_SOILSTONE,2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.SOUL_SOILSTONE_BRICKS,2);

        wall(RecipeCategory.DECORATIONS,DecoBlocks.SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.SOUL_SOILSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.SOUL_SOILSTONE_BRICKS);

        shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.FRAGILE_ICE)
                .pattern("##")
                .pattern("##")
                .define('#', DecoItems.ICE_SHARD)
                .unlockedBy(getHasName(DecoItems.ICE_SHARD),
                        has(DecoItems.ICE_SHARD))
                .save(output,getSimpleRecipeName(DecoBlocks.FRAGILE_ICE)+ "_recipe_create");

        shaped(RecipeCategory.BUILDING_BLOCKS,Items.ICE)
                .pattern("###")
                .pattern("#W#")
                .pattern("###")
                .define('#', DecoItems.ICE_SHARD)
                .define('W', DecoTags.Items.WATER_ITEMS)
                .unlockedBy(getHasName(DecoItems.ICE_SHARD),
                        has(DecoItems.ICE_SHARD))
                .save(output,getSimpleRecipeName(Items.ICE)+ "_recipe_create");

        shaped(RecipeCategory.REDSTONE,DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE)
                .pattern("#X#")
                .pattern("BPM")
                .pattern("#/#")
                .define('#', Items.COPPER_BLOCK)
                .define('X', Items.COPPER_BARS.unaffected())
                .define('/', Items.COPPER_INGOT)
                .define('B', DecoBlocks.BUBBLE_BLOCK)
                .define('P', Items.PISTON)
                .define('M', Items.MAGMA_BLOCK)
                .unlockedBy(getHasName(DecoBlocks.BUBBLE_BLOCK),
                        has(DecoBlocks.BUBBLE_BLOCK))
                .unlockedBy(getHasName(Items.MAGMA_BLOCK),
                        has(Items.MAGMA_BLOCK))
                .save(output,getSimpleRecipeName(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE)+ "_recipe_create");

        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SANDSTONE, DecoBlocks.POLISHED_SANDSTONE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SANDSTONE, Items.SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SANDSTONE, DecoBlocks.COBBLED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SANDSTONE, DecoBlocks.POLISHED_SANDSTONE);


        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE, DecoBlocks.POLISHED_RED_SANDSTONE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE, Items.RED_SANDSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE, DecoBlocks.COBBLED_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE, DecoBlocks.POLISHED_RED_SANDSTONE);


        chiseled(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE, DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE,4);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE, DecoBlocks.POLISHED_SOUL_SOILSTONE);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.TUFF_TILES), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.CRACKED_TUFF_TILES,
                        0.1f, 200).unlockedBy(getHasName(DecoBlocks.TUFF_TILES), has(DecoBlocks.TUFF_TILES))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_TUFF_TILES)+ "_recipe_create");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.TUFF_BRICKS), RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS,
                        DecoBlocks.CRACKED_TUFF_BRICKS,
                        0.1f, 200).unlockedBy(getHasName(Blocks.TUFF_BRICKS), has(Blocks.TUFF_BRICKS))
                .save(output,getSimpleRecipeName(DecoBlocks.CRACKED_TUFF_BRICKS)+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,DecoBlocks.TUFF_GRINDSTONE)
                .pattern("I-I")
                .pattern("# #")
                .define('I', Items.STICK)
                .define('-', Items.TUFF_SLAB)
                .define('#', ItemTags.PLANKS)
                .unlockedBy(getHasName(Items.TUFF_SLAB),
                        has(Items.TUFF_SLAB))
                .save(output,getSimpleRecipeName(DecoBlocks.TUFF_GRINDSTONE)+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.BLUE_DYE)
                .requires(DecoBlocks.BLUE_HIBISCUS)
                .group("blue_dye")
                .unlockedBy(getHasName(DecoBlocks.BLUE_HIBISCUS),
                        has(DecoBlocks.BLUE_HIBISCUS))
                .save(output,"blue_dye_from_blue_hibiscus"+ "_recipe_create");

        shapeless(RecipeCategory.MISC,Items.MAGENTA_DYE)
                .requires(DecoBlocks.BROMELIAD)
                .group("magenta_dye")
                .unlockedBy(getHasName(DecoBlocks.BROMELIAD),
                        has(DecoBlocks.BROMELIAD))
                .save(output,"magenta_dye_from_bromeliad"+ "_recipe_create");

        offerCraftingTableVariantRecipe(output, DecoBlocks.OAK_CRAFTING_TABLE, Items.OAK_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.SPRUCE_CRAFTING_TABLE, Items.SPRUCE_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.BIRCH_CRAFTING_TABLE, Items.BIRCH_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.JUNGLE_CRAFTING_TABLE, Items.JUNGLE_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.ACACIA_CRAFTING_TABLE, Items.ACACIA_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.DARK_OAK_CRAFTING_TABLE, Items.DARK_OAK_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.MANGROVE_CRAFTING_TABLE, Items.MANGROVE_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.CHERRY_CRAFTING_TABLE, Items.CHERRY_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.PALE_OAK_CRAFTING_TABLE, Items.PALE_OAK_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.BAMBOO_CRAFTING_TABLE, Items.BAMBOO_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.CRIMSON_CRAFTING_TABLE, Items.CRIMSON_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.WARPED_CRAFTING_TABLE, Items.WARPED_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.CACTUS_CRAFTING_TABLE, DecoBlocks.CACTUS_PLANKS);
        offerCraftingTableVariantRecipe(output, DecoBlocks.DRIFTWOOD_CRAFTING_TABLE, DecoBlocks.DRIFTWOOD_PLANKS);

        offerBarrelVariantRecipe(output, DecoBlocks.OAK_BARREL, Items.OAK_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.SPRUCE_BARREL, Items.SPRUCE_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.BIRCH_BARREL, Items.BIRCH_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.JUNGLE_BARREL, Items.JUNGLE_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.ACACIA_BARREL, Items.ACACIA_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.DARK_OAK_BARREL, Items.DARK_OAK_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.MANGROVE_BARREL, Items.MANGROVE_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.CHERRY_BARREL, Items.CHERRY_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.BAMBOO_BARREL, Items.BAMBOO_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.CRIMSON_BARREL, Items.CRIMSON_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.PALE_OAK_BARREL, Items.PALE_OAK_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.WARPED_BARREL, Items.WARPED_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.CACTUS_BARREL, DecoBlocks.CACTUS_PLANKS);
        offerBarrelVariantRecipe(output, DecoBlocks.DRIFTWOOD_BARREL, DecoBlocks.DRIFTWOOD_PLANKS);

        offerCartographyTableVariantRecipe(output, DecoBlocks.OAK_CARTOGRAPHY_TABLE, Items.OAK_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE, Items.SPRUCE_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.BIRCH_CARTOGRAPHY_TABLE, Items.BIRCH_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE, Items.JUNGLE_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.ACACIA_CARTOGRAPHY_TABLE, Items.ACACIA_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE, Items.DARK_OAK_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE, Items.MANGROVE_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.CHERRY_CARTOGRAPHY_TABLE, Items.CHERRY_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.BAMBOO_CARTOGRAPHY_TABLE, Items.BAMBOO_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE, Items.CRIMSON_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.PALE_OAK_CARTOGRAPHY_TABLE, Items.PALE_OAK_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.WARPED_CARTOGRAPHY_TABLE, Items.WARPED_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.CACTUS_CARTOGRAPHY_TABLE, DecoBlocks.CACTUS_PLANKS);
        offerCartographyTableVariantRecipe(output, DecoBlocks.DRIFTWOOD_CARTOGRAPHY_TABLE, DecoBlocks.DRIFTWOOD_PLANKS);

        offerSmithingTableVariantRecipe(output, DecoBlocks.OAK_SMITHING_TABLE, Items.OAK_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.SPRUCE_SMITHING_TABLE, Items.SPRUCE_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.BIRCH_SMITHING_TABLE, Items.BIRCH_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.JUNGLE_SMITHING_TABLE, Items.JUNGLE_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.ACACIA_SMITHING_TABLE, Items.ACACIA_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.DARK_OAK_SMITHING_TABLE, Items.DARK_OAK_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.MANGROVE_SMITHING_TABLE, Items.MANGROVE_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.CHERRY_SMITHING_TABLE, Items.CHERRY_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.BAMBOO_SMITHING_TABLE, Items.BAMBOO_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.CRIMSON_SMITHING_TABLE, Items.CRIMSON_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.PALE_OAK_SMITHING_TABLE, Items.PALE_OAK_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.WARPED_SMITHING_TABLE, Items.WARPED_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.CACTUS_SMITHING_TABLE, DecoBlocks.CACTUS_PLANKS);
        offerSmithingTableVariantRecipe(output, DecoBlocks.DRIFTWOOD_SMITHING_TABLE, DecoBlocks.DRIFTWOOD_PLANKS);

        offerBookshelvesVariantRecipe(output, DecoBlocks.OAK_BOOKSHELF, Items.OAK_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.SPRUCE_BOOKSHELF, Items.SPRUCE_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.BIRCH_BOOKSHELF, Items.BIRCH_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.JUNGLE_BOOKSHELF, Items.JUNGLE_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.ACACIA_BOOKSHELF, Items.ACACIA_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.DARK_OAK_BOOKSHELF, Items.DARK_OAK_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.MANGROVE_BOOKSHELF, Items.MANGROVE_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.CHERRY_BOOKSHELF, Items.CHERRY_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.BAMBOO_BOOKSHELF, Items.BAMBOO_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.CRIMSON_BOOKSHELF, Items.CRIMSON_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.PALE_OAK_BOOKSHELF, Items.PALE_OAK_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.WARPED_BOOKSHELF, Items.WARPED_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.CACTUS_BOOKSHELF, DecoBlocks.CACTUS_PLANKS);
        offerBookshelvesVariantRecipe(output, DecoBlocks.DRIFTWOOD_BOOKSHELF, DecoBlocks.DRIFTWOOD_PLANKS);

        shaped(RecipeCategory.DECORATIONS,Items.CRAFTING_TABLE)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .define('$', DecoTags.Items.DECO_CRAFTING_TABLES)
                .group("wooden_crafting_tables")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output,"wooden_crafting_table"+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,Items.BARREL)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .define('$', DecoTags.Items.DECO_BARRELS)
                .group("wooden_barrels")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output,"wooden_barrel"+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,Items.CARTOGRAPHY_TABLE)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .define('$', DecoTags.Items.DECO_CARTOGRAPHY_TABLES)
                .group("wooden_cartography_tables")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output,"wooden_cartography_tables"+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,Items.SMITHING_TABLE)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .define('$', DecoTags.Items.DECO_SMITHING_TABLES)
                .group("wooden_smithing_tables")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output,"wooden_smithing_tables"+ "_recipe_create");

        shaped(RecipeCategory.DECORATIONS,Items.BOOKSHELF)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', DecoBlocks.WOODEN_PLANKS)
                .define('$', DecoTags.Items.DECO_BOOKSHELVES)
                .group("wooden_bookshelves")
                .unlockedBy(getHasName(DecoBlocks.WOODEN_PLANKS),
                        has(DecoBlocks.WOODEN_PLANKS))
                .save(output,"wooden_bookshelf"+ "_recipe_create");

        offerLadderVariantRecipe(output, DecoBlocks.SPRUCE_LADDER, Items.SPRUCE_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.BIRCH_LADDER, Items.BIRCH_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.JUNGLE_LADDER, Items.JUNGLE_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.ACACIA_LADDER, Items.ACACIA_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.DARK_OAK_LADDER, Items.DARK_OAK_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.MANGROVE_LADDER, Items.MANGROVE_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.BAMBOO_LADDER, Items.BAMBOO_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.CHERRY_LADDER, Items.CHERRY_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.CRIMSON_LADDER, Items.CRIMSON_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.WARPED_LADDER, Items.WARPED_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.PALE_OAK_LADDER, Items.PALE_OAK_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.CACTUS_LADDER, DecoBlocks.CACTUS_PLANK_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.WOODEN_LADDER, DecoBlocks.WOODEN_SLAB);
        offerLadderVariantRecipe(output, DecoBlocks.DRIFTWOOD_LADDER, DecoBlocks.DRIFTWOOD_SLAB);

        shaped(RecipeCategory.MISC,DecoBlocks.WOODEN_SAPLING)
                .pattern("OSB")
                .pattern("###")
                .pattern("JAD")
                .define('#', ItemTags.LOGS_THAT_BURN)
                .define('O', Items.OAK_SAPLING)
                .define('S', Items.SPRUCE_SAPLING)
                .define('B', Items.BIRCH_SAPLING)
                .define('J', Items.JUNGLE_SAPLING)
                .define('A', Items.ACACIA_SAPLING)
                .define('D', Items.DARK_OAK_SAPLING)
                .unlockedBy("has_saplings", has(ItemTags.SAPLINGS))
                .save(output, getSimpleRecipeName(DecoBlocks.WOODEN_SAPLING)+ "_recipe_create");

        shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_PLANKS,4)
                .requires(DecoTags.Items.WOODEN_LOGS)
                .unlockedBy("has_logs", has(DecoTags.Items.WOODEN_LOGS))
                .save(output, getSimpleRecipeName(DecoBlocks.WOODEN_PLANKS)+ "_recipe_create");


                shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIFTWOOD,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', DecoBlocks.DRIFTWOOD_LOG)
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_LOG),
                                has(DecoBlocks.DRIFTWOOD_LOG))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD) + "_recipe_create");
                shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIED_DRIFTWOOD,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', DecoBlocks.DRIED_DRIFTWOOD_LOG)
                        .unlockedBy(getHasName(DecoBlocks.DRIED_DRIFTWOOD_LOG),
                                has(DecoBlocks.DRIED_DRIFTWOOD_LOG))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIED_DRIFTWOOD) + "_recipe_create");
                shaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STRIPPED_DRIFTWOOD,4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', DecoBlocks.STRIPPED_DRIFTWOOD_LOG)
                        .unlockedBy(getHasName(DecoBlocks.STRIPPED_DRIFTWOOD_LOG),
                                has(DecoBlocks.STRIPPED_DRIFTWOOD_LOG))
                        .save(output, getSimpleRecipeName(DecoBlocks.STRIPPED_DRIFTWOOD) + "_recipe_create");

                shapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIFTWOOD_PLANKS,4)
                        .requires(DecoTags.Items.DRIFTWOOD_LOGS)
                        .unlockedBy("has_logs", has(DecoTags.Items.DRIFTWOOD_LOGS))
                        .save(output,(getSimpleRecipeName(DecoBlocks.DRIFTWOOD_PLANKS) + "_recipe_create"));

                stairBuilder(DecoBlocks.DRIFTWOOD_STAIRS, Ingredient.of(DecoBlocks.DRIFTWOOD_PLANKS))
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_PLANKS),has(DecoBlocks.DRIFTWOOD_PLANKS))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_STAIRS)+ "_recipe_create");

                slab(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIFTWOOD_SLAB, DecoBlocks.DRIFTWOOD_PLANKS);

                shaped(RecipeCategory.DECORATIONS,DecoBlocks.DRIFTWOOD_FENCE,3)
                        .pattern("#/#")
                        .pattern("#/#")
                        .define('/', Items.STICK)
                        .define('#', DecoBlocks.DRIFTWOOD_PLANKS)
                        .unlockedBy(getHasName(Items.STICK),
                                has(Items.STICK))
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_PLANKS),
                                has(DecoBlocks.DRIFTWOOD_PLANKS))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_FENCE) + "_recipe_create");

                shaped(RecipeCategory.REDSTONE,DecoBlocks.DRIFTWOOD_FENCE_GATE)
                        .pattern("/#/")
                        .pattern("/#/")
                        .define('/', Items.STICK)
                        .define('#', DecoBlocks.DRIFTWOOD_PLANKS)
                        .unlockedBy(getHasName(Items.STICK),
                                has(Items.STICK))
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_PLANKS),
                                has(DecoBlocks.DRIFTWOOD_PLANKS))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_FENCE_GATE) + "_recipe_create");

                pressurePlate(DecoBlocks.DRIFTWOOD_PRESSURE_PLATE, DecoBlocks.DRIFTWOOD_PLANKS);

                shapeless(RecipeCategory.REDSTONE,DecoBlocks.DRIFTWOOD_BUTTON)
                        .requires(DecoBlocks.DRIFTWOOD_PLANKS)
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_PLANKS),
                                has(DecoBlocks.DRIFTWOOD_PLANKS))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_BUTTON) + "_recipe_create");

                shaped(RecipeCategory.REDSTONE,DecoBlocks.DRIFTWOOD_DOOR,3)
                        .pattern("##")
                        .pattern("##")
                        .pattern("##")
                        .define('#', DecoBlocks.DRIFTWOOD_PLANKS)
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_PLANKS),
                                has(DecoBlocks.DRIFTWOOD_PLANKS))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_DOOR) + "_recipe_create");
                shaped(RecipeCategory.REDSTONE,DecoBlocks.DRIFTWOOD_TRAPDOOR,2)
                        .pattern("###")
                        .pattern("###")
                        .define('#', DecoBlocks.DRIFTWOOD_PLANKS)
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_PLANKS),
                                has(DecoBlocks.DRIFTWOOD_PLANKS))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_TRAPDOOR) + "_recipe_create");

                chiseled(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIFTWOOD_MOSAIC, DecoBlocks.DRIFTWOOD_SLAB);

                stairBuilder(DecoBlocks.DRIFTWOOD_MOSAIC_STAIRS, Ingredient.of(DecoBlocks.DRIFTWOOD_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_MOSAIC),has(DecoBlocks.DRIFTWOOD_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_MOSAIC_STAIRS)+ "_recipe_create");
                slab(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIFTWOOD_MOSAIC_SLAB, DecoBlocks.DRIFTWOOD_MOSAIC);

                signBuilder(DecoItems.DRIFTWOOD_SIGN, Ingredient.of(DecoBlocks.DRIFTWOOD_PLANKS))
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_PLANKS),has(DecoBlocks.DRIFTWOOD_PLANKS))
                        .save(output, getSimpleRecipeName(DecoItems.DRIFTWOOD_SIGN) + "_recipe_create");

                hangingSign(DecoItems.DRIFTWOOD_HANGING_SIGN, DecoBlocks.STRIPPED_DRIFTWOOD_LOG);

                hangingSign(DecoItems.DRIFTWOOD_PLANKS_HANGING_SIGN, DecoBlocks.DRIFTWOOD_PLANKS);

                hangingSign(DecoItems.DRIFTWOOD_MOSAIC_HANGING_SIGN, DecoBlocks.DRIFTWOOD_MOSAIC);

                signBuilder(DecoItems.DRIFTWOOD_MOSAIC_SIGN, Ingredient.of(DecoBlocks.DRIFTWOOD_MOSAIC))
                        .unlockedBy(getHasName(DecoBlocks.DRIFTWOOD_MOSAIC),has(DecoBlocks.DRIFTWOOD_MOSAIC))
                        .save(output, getSimpleRecipeName(DecoItems.DRIFTWOOD_MOSAIC_SIGN) + "_recipe_create");
                signBuilder(DecoItems.STRIPPED_DRIFTWOOD_SIGN, Ingredient.of(DecoBlocks.STRIPPED_DRIFTWOOD_LOG))
                        .unlockedBy(getHasName(DecoBlocks.STRIPPED_DRIFTWOOD_LOG),has(DecoBlocks.STRIPPED_DRIFTWOOD_LOG))
                        .save(output, getSimpleRecipeName(DecoItems.STRIPPED_DRIFTWOOD_SIGN) + "_recipe_create");

                woodenBoat(DecoItems.DRIFTWOOD_RAFT, DecoBlocks.DRIFTWOOD_PLANKS);
                chestBoat(DecoItems.DRIFTWOOD_CHEST_RAFT, DecoItems.DRIFTWOOD_RAFT);

                shaped(RecipeCategory.DECORATIONS,DecoBlocks.KELP_LEAVES)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.KELP)
                        .unlockedBy(getHasName(Items.KELP),
                                has(Items.KELP))
                        .save(output, getSimpleRecipeName(DecoBlocks.KELP_LEAVES) + "_recipe_create");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.KELP_LEAVES),RecipeCategory.FOOD, CookingBookCategory.BLOCKS, Items.DRIED_KELP,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.KELP_LEAVES), has(DecoBlocks.KELP_LEAVES))
                        .save(output, getSimpleRecipeName(Items.DRIED_KELP)+ "_from_smelting_kelp_leaves");

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(DecoBlocks.DEAD_KELP_LEAVES),RecipeCategory.FOOD, CookingBookCategory.BLOCKS, Items.DRIED_KELP,
                                0.1f, 200).unlockedBy(getHasName(DecoBlocks.DEAD_KELP_LEAVES), has(DecoBlocks.DEAD_KELP_LEAVES))
                        .save(output, getSimpleRecipeName(Items.DRIED_KELP)+ "_from_smelting_dead_kelp_leaves");

                SimpleCookingRecipeBuilder.smoking(Ingredient.of(DecoBlocks.KELP_LEAVES),RecipeCategory.FOOD, Items.DRIED_KELP,
                                0.1f, 100).unlockedBy(getHasName(DecoBlocks.KELP_LEAVES), has(DecoBlocks.KELP_LEAVES))
                        .save(output, getSimpleRecipeName(Items.DRIED_KELP)+ "_from_smoking_kelp_leaves");

                SimpleCookingRecipeBuilder.smoking(Ingredient.of(DecoBlocks.DEAD_KELP_LEAVES),RecipeCategory.FOOD, Items.DRIED_KELP,
                                0.1f, 100).unlockedBy(getHasName(DecoBlocks.DEAD_KELP_LEAVES), has(DecoBlocks.DEAD_KELP_LEAVES))
                        .save(output, getSimpleRecipeName(Items.DRIED_KELP)+ "_from_smoking_dead_kelp_leaves");

                SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DecoBlocks.KELP_LEAVES),RecipeCategory.FOOD, Items.DRIED_KELP,
                                0.1f, 600).unlockedBy(getHasName(DecoBlocks.KELP_LEAVES), has(DecoBlocks.KELP_LEAVES))
                        .save(output, getSimpleRecipeName(Items.DRIED_KELP)+ "_from_campfire_cooking_kelp_leaves");

                SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DecoBlocks.DEAD_KELP_LEAVES),RecipeCategory.FOOD, Items.DRIED_KELP,
                                0.1f, 600).unlockedBy(getHasName(DecoBlocks.DEAD_KELP_LEAVES), has(DecoBlocks.DEAD_KELP_LEAVES))
                        .save(output, getSimpleRecipeName(Items.DRIED_KELP)+ "_from_campfire_cooking_dead_kelp_leaves");

                shaped(RecipeCategory.DECORATIONS,DecoBlocks.DRIFTWOOD_SPROUT)
                        .pattern(" / ")
                        .pattern("/#/")
                        .define('/', Items.KELP)
                        .define('#', DecoTags.Items.WET_DRIFTWOOD_LOGS)
                        .unlockedBy("has_logs", has(DecoTags.Items.WET_DRIFTWOOD_LOGS))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIFTWOOD_SPROUT) + "_recipe_create");

                shaped(RecipeCategory.DECORATIONS,DecoBlocks.DRIED_LEAVES)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.LEAF_LITTER)
                        .unlockedBy(getHasName(Items.LEAF_LITTER),
                                has(Items.LEAF_LITTER))
                        .save(output, getSimpleRecipeName(DecoBlocks.DRIED_LEAVES) + "_recipe_create");

                shaped(RecipeCategory.MISC,Items.DRY_TALL_GRASS)
                        .pattern("#")
                        .pattern("#")
                        .define('#', Items.DRY_SHORT_GRASS)
                        .unlockedBy(getHasName(Items.DRY_SHORT_GRASS),
                                has(Items.DRY_SHORT_GRASS))
                        .save(output, getSimpleRecipeName(Items.DRY_TALL_GRASS) + "_recipe_create");
    }
    public void  offerLadderVariantRecipe(RecipeOutput exporter, ItemLike output, ItemLike woodInput) {
                shaped(RecipeCategory.DECORATIONS,output,3)
                        .define('#', Items.STICK)
                        .define('S', woodInput)
                        .pattern("# #")
                        .pattern("#S#")
                        .pattern("# #")
                        .group("wooden_ladder")
                        .unlockedBy(getHasName(Items.STICK),
                                has(Items.STICK))
                        .save(exporter, getSimpleRecipeName(output) + "_recipe_create");
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
                        .save(exporter, getSimpleRecipeName(output)+ "_recipe_create");
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
                        .save(exporter, getSimpleRecipeName(output)+ "_recipe_create");
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
                        .save(exporter, getSimpleRecipeName(output)+ "_recipe_create");
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
                        .save(exporter, getSimpleRecipeName(output)+ "_recipe_create");
            }
            public void offerBookshelvesVariantRecipe(RecipeOutput exporter, ItemLike output, ItemLike woodInput) {
                shaped(RecipeCategory.DECORATIONS,output)
                        .define('#', woodInput)
                        .define('$', DecoTags.Items.DECO_BOOKSHELVES)
                        .pattern(" # ")
                        .pattern("#$#")
                        .pattern(" # ")
                        .group("wooden_bookshelves")
                        .unlockedBy(getHasName(woodInput), has(woodInput))
                        .save(exporter, getSimpleRecipeName(output)+ "_recipe_create");
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
            public void offerHardenedGlassRecipe(RecipeOutput exporter, ItemLike output, ItemLike glassInput) {
                shaped(RecipeCategory.DECORATIONS,output, 4)
                        .define('#', Items.IRON_INGOT)
                        .define('X', glassInput)
                        .pattern(" # ")
                        .pattern("#X#")
                        .pattern(" # ")
                        .group("hardened_glass")
                        .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                        .save(exporter, getConversionRecipeName(output, glassInput));
            }

            public void offerHardenedGlassPaneRecipe(RecipeOutput exporter, ItemLike output, ItemLike glassPaneInput) {
                shaped(RecipeCategory.DECORATIONS,output, 8)
                        .define('#', Items.IRON_INGOT)
                        .define('X', glassPaneInput)
                        .pattern(" # ")
                        .pattern("#X#")
                        .pattern(" # ")
                        .group("hardened_glass_panes")
                        .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                        .save(exporter, getConversionRecipeName(output, glassPaneInput));
            }
        };
    }


    @Override
    public String getName() {
        return "";
    }
}