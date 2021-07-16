package com.albasheep.tech_transcendance;

import com.albasheep.tech_transcendance.items.SheepSwordItem;
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

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        TechTranscendance.sheepSwordItem = new SheepSwordItem();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        TechTranscendance.registerRender(TechTranscendance.sheepSwordItem);
    }

    private static void registerRender(Item item) {
        if (item != null) {
            ResourceLocation resourceLocation = item.getRegistryName();
            if (resourceLocation != null) {
                ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(resourceLocation, null));
            }
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            TechTranscendance.sheepSwordItem
        );
    }
}
