package fr.gcjojo.littlemod.items;

import fr.gcjojo.littlemod.creative_tabs.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(CreativeTabs.littleModItems));

    public static final Item Ordinite = new Item(new Item.Settings().group((CreativeTabs.littleModItems)));
    public static final Item Lingonium = new Item(new Item.Settings().group((CreativeTabs.littleModItems)));
    public static final Item Omgieum = new Item(new Item.Settings().group((CreativeTabs.littleModItems)));

    public static void RegisterItems()
    {
        Registry.register(Registry.ITEM, new Identifier("lm", "fabric_item"), FABRIC_ITEM);

        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite"), Ordinite);
        Registry.register(Registry.ITEM, new Identifier("lm", "lingonium"), Lingonium);
        Registry.register(Registry.ITEM, new Identifier("lm", "omgieum"), Omgieum);
    }

}
