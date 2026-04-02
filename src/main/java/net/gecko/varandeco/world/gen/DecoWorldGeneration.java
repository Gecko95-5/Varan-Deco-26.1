package net.gecko.varandeco.world.gen;

public class DecoWorldGeneration {
    public static void generateWorldGen() {
        DecoFlowerGeneration.generateFlowers();
        DecoMiscGeneration.generateMiscellaneous();
    }
}
