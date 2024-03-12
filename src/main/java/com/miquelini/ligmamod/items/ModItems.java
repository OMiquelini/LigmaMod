package com.miquelini.ligmamod.items;

import com.miquelini.ligmamod.LigmaMod;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LigmaMod.MODID);

    public static final RegistryObject<Item> DEPLEATED_LIGMA = ITEMS.register("Depleated_Ligma",()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> LIGMA = ITEMS.register("Ligma",()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> LIGMA_ABUNDANT = ITEMS.register("Abundant_Ligma",()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> LIGMA_CRYSTAL = ITEMS.register("Ligma_Crystal",()->new Item(new Item.Properties()));

    //ore
    public static final RegistryObject<Item> LIGMA_ORE = ITEMS.register("Ligma_Ore",()->new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
