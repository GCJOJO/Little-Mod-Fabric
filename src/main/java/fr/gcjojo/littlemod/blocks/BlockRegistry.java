package fr.gcjojo.littlemod.blocks;

import fr.gcjojo.littlemod.creative_tabs.CreativeTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    // Test Block/Items
    public static final Block FABRIC_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Item FABRIC_BLOCKItem = new BlockItem(FABRIC_BLOCK, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));

    // Blocks
    public static final Block OrdiniteOre = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f));


    // Block Items
    public static final Item OrdiniteOreItem = new BlockItem(OrdiniteOre, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));


    public static void RegisterBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier("lm", "fabric_block"), FABRIC_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier("lm","ordinite_ore"), OrdiniteOre);
    }
    public static void RegisterItemBlocks()
    {
        Registry.register(Registry.ITEM, new Identifier("lm", "fabric_block"), FABRIC_BLOCKItem);

        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_ore"), OrdiniteOreItem);
    }

    public static Item GetItemFromBlock(Block b)
    {
        return b.asItem();
    }

}
