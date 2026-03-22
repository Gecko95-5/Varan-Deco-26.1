package net.gecko.varandeco.block;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.Map;
import java.util.stream.Stream;

public record DecoBlockSets(
        String name,
        boolean canOpenByHand,
        boolean canOpenByWindCharge,
        boolean canButtonBeActivatedByArrows,
        BlockSetType.ActivationRule pressurePlateSensitivity,
        BlockSoundGroup soundType,
        SoundEvent doorClose,
        SoundEvent doorOpen,
        SoundEvent trapdoorClose,
        SoundEvent trapdoorOpen,
        SoundEvent pressurePlateClickOff,
        SoundEvent pressurePlateClickOn,
        SoundEvent buttonClickOff,
        SoundEvent buttonClickOn) {

    private static final Map<String, BlockSetType> VALUES = new Object2ObjectArrayMap<>();
    public static final Codec<BlockSetType> CODEC = Codec.stringResolver(BlockSetType::name, VALUES::get);

    public static final BlockSetType DEEPSLATE = registerBlockSets(new BlockSetType("deepslate", true,
                    false, false, BlockSetType.ActivationRule.MOBS, BlockSoundGroup.DEEPSLATE,
                    SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final BlockSetType POLISHED_DEEPSLATE = registerBlockSets(new BlockSetType("polished_deepslate",
                    true, false, false, BlockSetType.ActivationRule.MOBS, BlockSoundGroup.POLISHED_DEEPSLATE,
                    SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final BlockSetType END_STONE = registerBlockSets(new BlockSetType("end_stone",
            true, false, false, BlockSetType.ActivationRule.MOBS, BlockSoundGroup.STONE,
            SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
            SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final BlockSetType BLACKSTONE = registerBlockSets(new BlockSetType("blackstone", true,
                    false, false, BlockSetType.ActivationRule.MOBS, BlockSoundGroup.STONE,
                    SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final BlockSetType TUFF = registerBlockSets(new BlockSetType("tuff", true, false, false,
                    BlockSetType.ActivationRule.MOBS, BlockSoundGroup.TUFF, SoundEvents.BLOCK_IRON_DOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));
    public static final BlockSetType POLISHED_TUFF = registerBlockSets(new BlockSetType("polished_tuff", true, false,
            false, BlockSetType.ActivationRule.MOBS, BlockSoundGroup.POLISHED_TUFF, SoundEvents.BLOCK_IRON_DOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE,
                    SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
                    SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON));

    public static final BlockSetType CACUTS = registerBlockSets(new BlockSetType("cactus"));
    public static final BlockSetType MUSHROOM = registerBlockSets(new BlockSetType("mushroom"));
    public static final BlockSetType IRON_CAP = registerBlockSets(new BlockSetType("iron_cap",
            true, true, true, BlockSetType.ActivationRule.EVERYTHING,
                    BlockSoundGroup.NETHER_STEM, SoundEvents.BLOCK_NETHER_WOOD_DOOR_CLOSE,
                    SoundEvents.BLOCK_NETHER_WOOD_DOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE,
                    SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_OFF,
                    SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_ON));
    public static final BlockSetType WOODEN = registerBlockSets(new BlockSetType("wooden"));
    public static final BlockSetType DRIFTWOOD = registerBlockSets(new BlockSetType("driftwood"));

    private static BlockSetType registerBlockSets(BlockSetType blockSetType) {
        VALUES.put(blockSetType.name(), blockSetType);
        return blockSetType;
    }
    public static Stream<BlockSetType> stream() {
        return VALUES.values().stream();
    }
}
