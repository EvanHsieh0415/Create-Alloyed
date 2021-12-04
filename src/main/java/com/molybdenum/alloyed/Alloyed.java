package com.molybdenum.alloyed;

import com.molybdenum.alloyed.blocks.ModBlocks;
import com.molybdenum.alloyed.fluids.ModFluids;
import com.molybdenum.alloyed.items.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Alloyed.MOD_ID)
public class Alloyed {

    public static final String MOD_ID = "alloyed";



    public Alloyed() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModFluids.register(eventBus);
        //ModTileEntities.register(eventBus);
        //ModContainers.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        /*
        RenderTypeLookup.setRenderLayer(ModFluids.OIL_FLUID.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModFluids.OIL_BLOCK.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModFluids.OIL_FLOWING.get(), RenderType.getTranslucent());
        ScreenManager.registerFactory(ModContainers.LIGHTNING_CHANNELER_CONTAINER.get(), LightningChannelerScreen::new);
        */

    }


}