package net.gecko.varandeco.util.interfaces;

import net.minecraft.block.Block;

//I had some inspiration The Mentor CodeLab
public interface SignRegisterFunction <T, S> {
    S apply(Block standingBlock, Block wallBlock, T settings);
}
