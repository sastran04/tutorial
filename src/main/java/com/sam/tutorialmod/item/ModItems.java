package com.sam.tutorialmod.item;

import com.sam.tutorialmod.TutorialMod;
import com.sam.tutorialmod.item.custom.BlowTorchItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    //new items
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL)));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL)));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL)));
    public static final RegistryObject<Item> Tomato = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> BLOW_TORCH = ITEMS.register("blow_torch",
            () -> new BlowTorchItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL).durability(20)));


    //registry stuff
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
