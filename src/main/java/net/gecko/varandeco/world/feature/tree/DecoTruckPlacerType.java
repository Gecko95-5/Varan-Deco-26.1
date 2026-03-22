package net.gecko.varandeco.world.feature.tree;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.mixin.TrunkPlacerTypeInvoker;
import net.gecko.varandeco.world.feature.tree.custom.DriftwoodTreePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class DecoTruckPlacerType {
    public static final TrunkPlacerType<?> DRIFTWOOD_TRUNK_PLACER =
            TrunkPlacerTypeInvoker.callRegister("driftwood_trunk_placer", DriftwoodTreePlacer.CODEC);

    public static void register() {
        VaranDeco.LOGGER.info("Registering Trunk Placer for " + VaranDeco.MOD_ID);
    }
}
