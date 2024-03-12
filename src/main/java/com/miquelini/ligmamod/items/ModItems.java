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

    //regular ligma (overworld, used for tools)
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LigmaMod.MODID);
    public static final RegistryObject<Item> DEPLEATED_LIGMA = ITEMS.register("Depleated_Ligma",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGMA = ITEMS.register("Ligma",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> ABUNDANT_LIGMA = ITEMS.register("Abundant_Ligma",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGMA_CRYSTAL = ITEMS.register("Ligma_Crystal",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGMA_BALLS = ITEMS.register("Ligma_Balls",()->new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build())));

    //red ligma (nether, used for armor and weapons)
    public static final RegistryObject<Item> DEPLEATED_RED_LIGMA = ITEMS.register("Depleated_Red_Ligma",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LIGMA = ITEMS.register("Red_Ligma",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> ABUNDANT_RED_LIGMA = ITEMS.register("Abundant_Red_Ligma",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LIGMA_CRYSTAL = ITEMS.register("Red_Ligma_Crystal",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LIGMA_BALLS = ITEMS.register("Red_Ligma_Balls",()->new Item(new Item.Properties()));

    //purple ligma (mixture of both, next level ligma, used for armor and weapons)
    public static final RegistryObject<Item> PURPLE_LIGMA_CRYSTAL = ITEMS.register("Purple_Ligma_Crystal",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_BALLS = ITEMS.register("Purple_Ligma_Balls",()->new Item(new Item.Properties()));

    //ore
    public static final RegistryObject<Item> LIGMA_ORE = ITEMS.register("Ligma_Ore",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LIGMA_ORE = ITEMS.register("Red_Ligma_Ore",()->new Item(new Item.Properties()));

    //tools + shield(only normal and purple)
    public static final RegistryObject<Item> LIGMA_PICKAXE = ITEMS.register("Ligma_Pickaxe",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGMA_AXE = ITEMS.register("Ligma_Axe",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGMA_SHOVEL = ITEMS.register("Ligma_Shovel",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGMA_HOE = ITEMS.register("Ligma_Hoe",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGMA_SHIELD = ITEMS.register("Ligma_Shield",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_PICKAXE = ITEMS.register("Purple_Ligma_Pickaxe",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_AXE = ITEMS.register("Purple_Ligma_Axe",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_SHOVEL = ITEMS.register("Purple_Ligma_Shovel",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_HOE = ITEMS.register("Purple_Ligma_Hoe",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_SHIELD = ITEMS.register("Purple_Ligma_Shield",()->new Item(new Item.Properties()));

    //armor + sword (only red and purple)
    public static final RegistryObject<Item> RED_LIGMA_HELMET = ITEMS.register("Red_Ligma_Helmet",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LIGMA_CHESTPLATE = ITEMS.register("Red_Ligma_Chestplate",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LIGMA_LEGGINGS = ITEMS.register("Red_Ligma_Leggings",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LIGMA_BOOTS = ITEMS.register("Red_Ligma_Boots",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LIGMA_SWORD = ITEMS.register("Red_Ligma_Sword",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_HELMET = ITEMS.register("Purple_Ligma_Helmet",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_CHESTPLATE = ITEMS.register("Purple_Ligma_Chestplate",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_LEGGINGS = ITEMS.register("Purple_Ligma_Leggings",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_BOOTS = ITEMS.register("Purple_Ligma_Boots",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_SWORD = ITEMS.register("Purple_Ligma_Sword",()->new Item(new Item.Properties()));
    
    //enhancers (furnace-like blocks used to enhance ligma items, regular and red works until level 3, purple works up to level 5 with all items)
    public static final RegistryObject<Item> LIGMA_ENHANCER = ITEMS.register("Ligma_Enhancer",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LIGMA_ENHANCER = ITEMS.register("Red_Ligma_Enhancer",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIGMA_ENHANCER = ITEMS.register("Purple_Ligma_Enhancer",()->new Item(new Item.Properties()));

    //purifiers (furnace-like blocks used to purify ligma to other levels, poor>regular>abundant)
    public static final RegistryObject<Item> LIGMA_PURIFIER = ITEMS.register("Ligma_Purifier",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LIGMA_PURIFIER = ITEMS.register("Red_Ligma_Purifier",()->new Item(new Item.Properties()));

    



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
