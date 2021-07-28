package com.albasheep.tech_transcendance.items.furnace.tier1;

import com.albasheep.tech_transcendance.blocks.furnace.tier1.FurnaceTier1Block;
import net.minecraft.item.ItemBlock;

public class FurnaceTier1Item extends ItemBlock {
    public FurnaceTier1Item(FurnaceTier1Block furnaceTier1Block) {
        super(furnaceTier1Block);
        setRegistryName("furnace_tier_1");
        setUnlocalizedName("furnace_tier_1");
    }
}
