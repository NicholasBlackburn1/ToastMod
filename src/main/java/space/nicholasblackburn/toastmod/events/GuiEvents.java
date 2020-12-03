/*
 * Copyright (c) Nicholas Blackburn 2020 -> Toast Mod 2020
 * Released under gnu public licence
 */

package space.nicholasblackburn.toastmod.events;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import space.nicholasblackburn.toastmod.Main;
import space.nicholasblackburn.toastmod.util.GuiCreation;
@Mod.EventBusSubscriber
public class GuiEvents
{
    @SubscribeEvent
    public static void onRenderGui(RenderGameOverlayEvent.Post event)
    {
        Main.logger.info("creating gui..");
        try {
            new GuiCreation(Minecraft.getMinecraft());
        }
        catch (Exception e){
            Main.logger.error(e.getMessage());
        }
        Main.logger.info("created gui");
    }

}
