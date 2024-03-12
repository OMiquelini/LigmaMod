package com.miquelini.ligmamod.items;

import com.miquelini.ligmamod.LigmaMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class LigmaCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LigmaMod.MODID);

    public static final RegistryObject<CreativeModeTab> LIGMA_TAB = CREATIVE_MODE_TABS.register("ligma_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.LIGMA.get())).title(Component.translatable("creativetab.Ligma_tab"))
            .displayItems((pParameters,pOutput)->
            {
                pOutput.accept(ModItems.LIGMA.get());
                //add all other items here
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
