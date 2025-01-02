package com.axperty.stackedblocksfarmersdelight;

import com.axperty.stackedblocksfarmersdelight.registry.CreativeTabRegistry;
import com.axperty.stackedblocksfarmersdelight.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackedBlocksFarmersDelight implements ModInitializer {
    public static final String MODID = "stackedblocksfarmersdelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        CreativeTabRegistry.registerItemGroups();
        BlockRegistry.registerModBlocks();
    }
}
