package fr.gcjojo.littlemod.blocks;

import fr.gcjojo.littlemod.creative_tabs.CreativeTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    // Test Block/Items
    public static final Block FABRIC_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).breakByTool(FabricToolTags.PICKAXES, 5));
    public static final Item FABRIC_BLOCKItem = new BlockItem(FABRIC_BLOCK, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));

    // Blocks
    public static final Block OrdiniteOre = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES, 3));
    public static final Block OrdiniteBlock = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).breakByTool(FabricToolTags.PICKAXES, 3));

    public static final Block LingoniumOre = new Block(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES, 5));
    public static final Block LingoniumBlock = new Block(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES, 5));
    public static final Block NetherLingoniumOre = new Block(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES, 5));

    public static final Block OmgieumOre = new Block(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES, 7));
    public static final Block OmgieumBlock = new Block(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES, 7));
    public static final Block NetherOmgieumOre = new Block(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES, 7));
    public static final Block EndOmgieumOre = new Block(FabricBlockSettings.of(Material.STONE).strength(8.0f).breakByTool(FabricToolTags.PICKAXES, 7));

    // Block Items
    public static final Item OrdiniteOreItem = new BlockItem(OrdiniteOre, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));
    public static final Item OrdiniteBlockItem = new BlockItem(OrdiniteBlock, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));

    public static final Item LingoniumOreItem = new BlockItem(LingoniumOre, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));
    public static final Item LingoniumBlockItem = new BlockItem(LingoniumBlock, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));
    public static final Item NetherLingoniumOreItem = new BlockItem(NetherLingoniumOre, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));

    public static final Item OmgieumOreItem = new BlockItem(OmgieumOre, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));
    public static final Item OmgieumBlockItem = new BlockItem(OmgieumBlock, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));
    public static final Item NetherOmgieumOreItem = new BlockItem(NetherOmgieumOre, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));
    public static final Item EndOmgieumOreItem = new BlockItem(EndOmgieumOre, new FabricItemSettings().group(CreativeTabs.LittleModBlocks));

    public static void RegisterBlocks()
    {
        // Registry.register(Registry.BLOCK, new Identifier(

        Registry.register(Registry.BLOCK, new Identifier("lm", "fabric_block"), FABRIC_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier("lm","ordinite_ore"), OrdiniteOre);
        Registry.register(Registry.BLOCK, new Identifier("lm","ordinite_block"), OrdiniteBlock);

        Registry.register(Registry.BLOCK, new Identifier("lm", "lingonium_ore"), LingoniumOre);
        Registry.register(Registry.BLOCK, new Identifier("lm", "nether_lingonium_ore"), NetherLingoniumOre);
        Registry.register(Registry.BLOCK, new Identifier("lm", "lingonium_block"), LingoniumBlock);

        Registry.register(Registry.BLOCK, new Identifier("lm", "omgieum_ore"), OmgieumOre);
        Registry.register(Registry.BLOCK, new Identifier("lm", "nether_omgieum_ore"), NetherOmgieumOre);
        Registry.register(Registry.BLOCK, new Identifier("lm", "end_omgieum_ore"), EndOmgieumOre);
        Registry.register(Registry.BLOCK, new Identifier("lm", "omgieum_block"), OmgieumBlock);
    }

    public static void RegisterItemBlocks()
    {
        // Registry.register(Registry.ITEM, new Identifier(

        Registry.register(Registry.ITEM, new Identifier("lm", "fabric_block"), FABRIC_BLOCKItem);

        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_ore"), OrdiniteOreItem);
        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_block"), OrdiniteBlockItem);

        Registry.register(Registry.ITEM, new Identifier("lm", "lingonium_ore"), LingoniumOreItem);
        Registry.register(Registry.ITEM, new Identifier("lm", "nether_lingonium_ore"), NetherLingoniumOreItem);
        Registry.register(Registry.ITEM, new Identifier("lm", "lingonium_block"), LingoniumBlockItem);

        Registry.register(Registry.ITEM, new Identifier("lm", "omgieum_ore"), OmgieumOreItem);
        Registry.register(Registry.ITEM, new Identifier("lm", "nether_omgieum_ore"), NetherOmgieumOreItem);
        Registry.register(Registry.ITEM, new Identifier("lm", "end_omgieum_ore"), EndOmgieumOreItem);
        Registry.register(Registry.ITEM, new Identifier("lm", "omgieum_block"), OmgieumBlockItem);
    }

    public static Item GetItemFromBlock(Block b)
    {
        return b.asItem();
    }

}
