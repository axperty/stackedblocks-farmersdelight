package com.axperty.stackedblocksfarmersdelight;

import com.axperty.stackedblocksfarmersdelight.register.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackedBlocksFarmersDelight implements ModInitializer {
	public static final String MOD_ID = "stackedblocksfarmersdelight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRegistry.registerModBlocks();
	}
}
