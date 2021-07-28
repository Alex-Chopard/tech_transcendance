package com.albasheep.tech_transcendance;

import com.albasheep.tech_transcendance.blocks.furnace.tier1.FurnaceTier1Block;
import com.albasheep.tech_transcendance.items.SheepSwordItem;
import com.albasheep.tech_transcendance.items.furnace.tier1.FurnaceTier1Item;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

@Mod(modid = TechTranscendance.MODID, name = TechTranscendance.NAME, version = TechTranscendance.VERSION)
@Mod.EventBusSubscriber
public class TechTranscendance
{
    public static final String MODID = "tech_transcendance";
    public static final String NAME = "Tech Transcendance";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static SheepSwordItem sheepSwordItem;

    // Tier 1
    public static FurnaceTier1Block furnaceTier1Block;
    public static FurnaceTier1Item furnaceTier1Item;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        TechTranscendance.sheepSwordItem = new SheepSwordItem();

        TechTranscendance.furnaceTier1Block = new FurnaceTier1Block(Material.SAND);
        TechTranscendance.furnaceTier1Item = new FurnaceTier1Item(TechTranscendance.furnaceTier1Block);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        TechTranscendance.registerItemRender(TechTranscendance.sheepSwordItem);
        TechTranscendance.registerItemRender(TechTranscendance.furnaceTier1Item);
        TechTranscendance.registerItemRender(Item.getItemFromBlock(TechTranscendance.furnaceTier1Block));
    }

    private static void registerItemRender(Item item) {
        if (item != null) {
            ResourceLocation resourceLocation = item.getRegistryName();
            if (resourceLocation != null) {
                ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(resourceLocation, "normal"));
            }
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            TechTranscendance.sheepSwordItem,
            TechTranscendance.furnaceTier1Item
        );
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
            TechTranscendance.furnaceTier1Block
        );
    }
}
