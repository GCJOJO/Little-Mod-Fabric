package fr.gcjojo.littlemod;

import fr.gcjojo.littlemod.blocks.BlockRegistry;
import fr.gcjojo.littlemod.items.ItemRegistry;
import net.fabricmc.api.ModInitializer;
/*
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
*/

public class Main implements ModInitializer{

    public static final String MOD_ID = "lm";

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.


        ItemRegistry.RegisterItems();
        BlockRegistry.RegisterBlocks();
        BlockRegistry.RegisterItemBlocks();

        System.out.println("Little Fabric mod initialized !");
    }

}
