package fr.gcjojo.littlemod.creative_tabs;

import fr.gcjojo.littlemod.blocks.BlockRegistry;
import fr.gcjojo.littlemod.items.ItemRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CreativeTabs {
        public static final ItemGroup littleModItems = FabricItemGroupBuilder.build(
                new Identifier("lm", "items"),
                ()-> new ItemStack(ItemRegistry.Ordinite));
        public  static final ItemGroup LittleModBlocks = FabricItemGroupBuilder.build(
                new Identifier("lm", "blocks"),
                () -> new ItemStack(BlockRegistry.OrdiniteOreItem)
        );
        public  static final ItemGroup LittleModTools = FabricItemGroupBuilder.build(
                new Identifier("lm", "tools"),
                () -> new ItemStack(ItemRegistry.OrdiniteSword)
        );
        public  static final ItemGroup LittleModArmor = FabricItemGroupBuilder.build(
                new Identifier("lm", "armors"),
                () -> new ItemStack(ItemRegistry.OrdiniteChestplate)
        );
}
