package net.gecko.varandeco.potion;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.effects.DecoStatusEffects;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

public class DecoPotion {

    public static final Holder<Potion> WATER_BUBBLE_POTION = registerPotion("bubble_potion",
            new Potion("water_bubble",new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1800, 0),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 1800, 0)));

    public static final Holder<Potion> STRONG_WATER_BUBBLE_POTION = registerPotion("strong_bubble_potion",
            new Potion("water_bubble",new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 900, 0),
                    new MobEffectInstance(MobEffects.CONDUIT_POWER, 900, 0)));

    public static final Holder<Potion> LONG_WATER_BUBBLE_POTION  = registerPotion("long_bubble_potion",
            new Potion("water_bubble",new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 4800, 0),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 4800, 0)));

    public static final Holder<Potion> GROUNDING_POTION = registerPotion("grounding_potion",
            new Potion("grounded",new MobEffectInstance(DecoStatusEffects.GROUNDED, 1800, 0)));

    public static final Holder<Potion> LONG_GROUNDING_POTION = registerPotion("long_grounding_potion",
            new Potion("grounded",new MobEffectInstance(DecoStatusEffects.GROUNDED, 4800, 0)));

    public static final Holder<Potion> STRONG_GROUNDING_POTION = registerPotion("strong_grounding_potion",
            new Potion("grounded",new MobEffectInstance(DecoStatusEffects.GROUNDED, 400, 3)));


    private static Holder<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerForHolder(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        VaranDeco.LOGGER.info("Registering Mod Potions for " + VaranDeco.MOD_ID);
    }
}

