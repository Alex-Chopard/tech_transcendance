package com.albasheep.tech_transcendance.blocks.furnace.tier1;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FurnaceTier1Block extends Block {
    public FurnaceTier1Block(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
        init();
    }

    public FurnaceTier1Block(Material materialIn) {
        super(materialIn);
        init();
    }

    private void init () {
        setCreativeTab(CreativeTabs.SEARCH);
        setRegistryName("furnace_tier_1");
        setUnlocalizedName("furnace_tier_1");
        setHardness(1.7F);
        setLightOpacity(200);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(0.0625, 0, 0.0625, 0.9375, 1, 0.9375);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
