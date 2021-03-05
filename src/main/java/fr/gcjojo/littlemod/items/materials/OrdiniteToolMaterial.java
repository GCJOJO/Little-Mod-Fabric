package fr.gcjojo.littlemod.items.materials;

import fr.gcjojo.littlemod.items.ItemRegistry;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class OrdiniteToolMaterial implements ToolMaterial {

    public static final OrdiniteToolMaterial INSTANCE = new OrdiniteToolMaterial();

    @Override
    public int getDurability() {
        return 2500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 11.0F;
    }

    @Override
    public float getAttackDamage() {
        return 6.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.Ordinite);
    }
}
