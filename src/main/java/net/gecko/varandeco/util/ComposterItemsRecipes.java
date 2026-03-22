package net.gecko.varandeco.util;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
//Terraform API Code
public class ComposterItemsRecipes {
    public static void registerCompostableItem(ItemConvertible item, float chance) {
    if (item.asItem() != Items.AIR) {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(item.asItem(), chance);
    }
}
}
