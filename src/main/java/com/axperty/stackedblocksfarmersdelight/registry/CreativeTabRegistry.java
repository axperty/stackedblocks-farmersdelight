package com.axperty.stackedblocksfarmersdelight.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.axperty.stackedblocksfarmersdelight.StackedBlocksFarmersDelight;

public class CreativeTabRegistry {
    public static final ItemGroup STACKEDBLOCKSFARMERSDELIGHT_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(StackedBlocksFarmersDelight.MODID + ":" + "stackedblocksfarmersdelight_itemgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.stackedblocksfarmersdelight"))
                    .icon(() -> new ItemStack(BlockRegistry.STACKED_RICH_SOIL))
                    .entries((displayContext, entries) -> {

                        entries.add(BlockRegistry.STACKED_RICH_SOIL);
                        entries.add(BlockRegistry.STACKED_STONE_BLOCKS);
                        entries.add(BlockRegistry.STACKED_COBBLESTONE_BLOCKS);
                        entries.add(BlockRegistry.STACKED_NETHERRACK_BLOCKS);
                        entries.add(BlockRegistry.STACKED_BRICKS);
                        entries.add(BlockRegistry.STACKED_MELONS);
                        entries.add(BlockRegistry.STACKED_PUMPKINS);
                        entries.add(BlockRegistry.STACKED_LAPIS_BLOCKS);
                        entries.add(BlockRegistry.STACKED_REDSTONE_BLOCKS);
                        entries.add(BlockRegistry.STACKED_COAL_BLOCKS);
                        entries.add(BlockRegistry.STACKED_IRON_BLOCKS);
                        entries.add(BlockRegistry.STACKED_GOLD_BLOCKS);
                        entries.add(BlockRegistry.STACKED_EMERALD_BLOCKS);
                        entries.add(BlockRegistry.STACKED_DIAMOND_BLOCKS);
                        entries.add(BlockRegistry.STACKED_NETHERITE_BLOCKS);
                        entries.add(BlockRegistry.STACKED_QUARTZ_BLOCKS);
                        entries.add(BlockRegistry.STACKED_OAK_LOGS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_OAK_LOGS);
                        entries.add(BlockRegistry.STACKED_SPRUCE_LOGS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS);
                        entries.add(BlockRegistry.STACKED_BIRCH_LOGS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS);
                        entries.add(BlockRegistry.STACKED_JUNGLE_LOGS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS);
                        entries.add(BlockRegistry.STACKED_ACACIA_LOGS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS);
                        entries.add(BlockRegistry.STACKED_DARK_OAK_LOGS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS);
                        entries.add(BlockRegistry.STACKED_MANGROVE_LOGS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS);
                        entries.add(BlockRegistry.STACKED_CHERRY_LOGS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS);
                        entries.add(BlockRegistry.STACKED_BAMBOO_BLOCKS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS);
                        entries.add(BlockRegistry.STACKED_CRIMSON_STEMS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS);
                        entries.add(BlockRegistry.STACKED_WARPED_STEMS);
                        entries.add(BlockRegistry.STACKED_STRIPPED_WARPED_STEMS);
                    })
                    .build());

    public static void registerItemGroups() {
        StackedBlocksFarmersDelight.LOGGER.info("Registering Item Groups for " + StackedBlocksFarmersDelight.MODID);
    }
}