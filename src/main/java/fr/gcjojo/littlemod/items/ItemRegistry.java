package fr.gcjojo.littlemod.items;

import fr.gcjojo.littlemod.creative_tabs.CreativeTabs;

import fr.gcjojo.littlemod.items.CustomItemClasses.CustomAxeItem;
import fr.gcjojo.littlemod.items.CustomItemClasses.CustomHoeItem;
import fr.gcjojo.littlemod.items.CustomItemClasses.CustomPickaxeItem;
import fr.gcjojo.littlemod.items.materials.OrdiniteArmorMaterial;
import fr.gcjojo.littlemod.items.materials.OrdiniteToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    public static final OrdiniteArmorMaterial M_OrdiniteArmor = new OrdiniteArmorMaterial();

    //public static final Tag.Identified<Item> ORDINITE = register("ordinite");

    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(CreativeTabs.littleModItems));

    // Items

    public static final Item Ordinite = new Item(new Item.Settings().group((CreativeTabs.littleModItems)));
    public static final Item Lingonium = new Item(new Item.Settings().group((CreativeTabs.littleModItems)));
    public static final Item Omgieum = new Item(new Item.Settings().group((CreativeTabs.littleModItems)));

    // Tools

    // Ordinite
    public static ToolItem OrdiniteSword = new SwordItem(OrdiniteToolMaterial.INSTANCE, 3, -2.8f, new Item.Settings().group(CreativeTabs.LittleModTools));
    //public static ToolItem OrdinitePickaxe = new PickaxeItem(OrdiniteToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(CreativeTabs.LittleModTools));
    public static ToolItem OrdinitePickaxe = new CustomPickaxeItem(OrdiniteToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings().group(CreativeTabs.LittleModTools));
    public static ToolItem OrdiniteAxe = new CustomAxeItem(OrdiniteToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings().group(CreativeTabs.LittleModTools));
    public static ToolItem OrdiniteShovel = new ShovelItem(OrdiniteToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings().group(CreativeTabs.LittleModTools));
    public static ToolItem OrdiniteHoe = new CustomHoeItem(OrdiniteToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings().group(CreativeTabs.LittleModTools));

    // Lingonium

    // TODO : Add Lingonium Tools

    // Omgieum

    // TODO : Add Omgieum Tools

    // Armors

    // Ordinite

    public static final Item OrdiniteHelmet = new ArmorItem(M_OrdiniteArmor, EquipmentSlot.HEAD, new Item.Settings().group(CreativeTabs.LittleModArmor));
    public static final Item OrdiniteChestplate = new ArmorItem(M_OrdiniteArmor, EquipmentSlot.CHEST, new Item.Settings().group(CreativeTabs.LittleModArmor));
    public static final Item OrdiniteLeggings = new ArmorItem(M_OrdiniteArmor, EquipmentSlot.LEGS, new Item.Settings().group(CreativeTabs.LittleModArmor));
    public static final Item OrdiniteBoots = new ArmorItem(M_OrdiniteArmor, EquipmentSlot.FEET, new Item.Settings().group(CreativeTabs.LittleModArmor));

    public static void RegisterItems()
    {
        Registry.register(Registry.ITEM, new Identifier("lm", "fabric_item"), FABRIC_ITEM);

        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite"), Ordinite);
        Registry.register(Registry.ITEM, new Identifier("lm", "lingonium"), Lingonium);
        Registry.register(Registry.ITEM, new Identifier("lm", "omgieum"), Omgieum);

        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_sword"), OrdiniteSword);
        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_pickaxe"), OrdinitePickaxe);
        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_axe"), OrdiniteAxe);
        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_shovel"), OrdiniteShovel);
        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_hoe"), OrdiniteHoe);

        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_helmet"), OrdiniteHelmet);
        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_chestplate"), OrdiniteChestplate);
        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_leggings"), OrdiniteLeggings);
        Registry.register(Registry.ITEM, new Identifier("lm", "ordinite_boots"), OrdiniteBoots);

        System.out.println("Ordinite Armor Name : " + M_OrdiniteArmor.getName());
    }
    /*
    protected static final RequiredTagList<Item> REQUIRED_TAGS = RequiredTagListRegistry.register(new Identifier("item"), TagManager::getItems);

    private static Tag.Identified<Item> register(String id) {
        return REQUIRED_TAGS.add(id);
    }

    public static TagGroup<Item> getTagGroup() {
        return REQUIRED_TAGS.getGroup();
    }

    public static List<? extends Tag.Identified<Item>> getRequiredTags() {
        return REQUIRED_TAGS.getTags();
    }
    */
}
