package net.gecko.varandeco.util.interfaces;

import net.minecraft.block.Block;

//I had some inspiration The Mentor CodeLab
public interface TallPlantItemRegisterFunction<T, P> {
    P apply(Block tallPlantBlock, T settings);
}
