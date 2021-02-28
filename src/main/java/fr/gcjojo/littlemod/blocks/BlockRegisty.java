package fr.gcjojo.littlemod.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegisty {

    public static final Block FABRIC_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    public static void RegisterBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier("lm", "fabric_block"), FABRIC_BLOCK);
    }
    public static void RegisterItemBlocks()
    {
        Registry.register(Registry.ITEM, new Identifier("lm", "fabric_block"), new BlockItem(FABRIC_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

}
