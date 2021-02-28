package fr.gcjojo.littlemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer{

    public static final Item  FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Block FABRIC_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));


    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        Registry.register(Registry.ITEM, new Identifier("lm", "fabric_item"), FABRIC_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("lm", "fabric_block"), FABRIC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lm", "fabric_block"), new BlockItem(FABRIC_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        System.out.println("Little Fabric mod initialized !");
    }

}
