package com.axperty.stackedblocksfarmersdelight;

import com.axperty.stackedblocksfarmersdelight.registry.BlockRegistry;
import com.axperty.stackedblocksfarmersdelight.registry.CreativeTabRegistry;
import com.axperty.stackedblocksfarmersdelight.registry.ItemRegistry;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(StackedBlocksFarmersDelight.MOD_ID)
public class StackedBlocksFarmersDelight {
    public static final String MOD_ID = "stackedblocksfarmersdelight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public StackedBlocksFarmersDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.register(modEventBus);
        ItemRegistry.register(modEventBus);
        CreativeTabRegistry.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
