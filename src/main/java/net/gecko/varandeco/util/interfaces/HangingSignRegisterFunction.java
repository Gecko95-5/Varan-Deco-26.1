package net.gecko.varandeco.util.interfaces;

import net.minecraft.block.Block;

//I had some inspiration The Mentor CodeLab
public interface HangingSignRegisterFunction<T, H> {
    H apply(Block hangingSign, Block wallHangingSign, T settings);
}
