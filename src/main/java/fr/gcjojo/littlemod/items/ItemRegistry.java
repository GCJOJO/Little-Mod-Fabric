package fr.gcjojo.littlemod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void RegisterItems()
    {
        Registry.register(Registry.ITEM, new Identifier("lm", "fabric_item"), FABRIC_ITEM);
    }

}
