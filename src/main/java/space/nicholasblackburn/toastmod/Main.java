package space.nicholasblackburn.toastmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/*
 * Copyright (c) Nicholas Blackburn 2020 -> Toast Mod 2020
 * Released under gnu public licence
 */

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "toastmod";
    public static final String NAME = "Nicholas Blackburn's ToastMod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        logger = event.getModLog();
        logger.info(MODID+"In the PreInit Method!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        logger.info(MODID+"In the init Method!");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

        logger.info(MODID+"In the init Method!");
    }
}