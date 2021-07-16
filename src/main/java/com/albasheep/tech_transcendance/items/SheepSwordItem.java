package com.albasheep.tech_transcendance.items;

import com.google.common.collect.Multimap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class SheepSwordItem extends ItemSword {
    public SheepSwordItem () {
        super(SheepSwordItem.getToolMaterial());

        setRegistryName("sheep_sword");
        setUnlocalizedName("sheep_sword");
        setCreativeTab(CreativeTabs.COMBAT);
    }

    private static Item.ToolMaterial getToolMaterial () {
        return EnumHelper.addToolMaterial(
            "sheep_sword",
            0,
            142,
            2.0F,
            2,
            22
        );
    }

    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        multimap.removeAll(SharedMonsterAttributes.ATTACK_SPEED.getName());

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -0.86F, 0));
        }

        return multimap;
    }
}
