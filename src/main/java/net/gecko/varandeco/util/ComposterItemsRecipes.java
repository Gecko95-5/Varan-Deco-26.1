package net.gecko.varandeco.util;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.ComposterBlock;
//Terraform API Code
public class ComposterItemsRecipes {
    public static void registerCompostableItem(ItemLike item, float chance) {
    if (item.asItem() != Items.AIR) {
        ComposterBlock.COMPOSTABLES.put(item.asItem(), chance);
    }
}
}
