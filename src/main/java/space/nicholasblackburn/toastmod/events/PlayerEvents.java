/*
 * Copyright (c) Nicholas Blackburn 2020 -> Toast Mod 2020
 * Released under gnu public licence
 */

package space.nicholasblackburn.toastmod.events;

import net.minecraft.advancements.PlayerAdvancements;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.toasts.GuiToast;
import net.minecraft.client.gui.toasts.IToast;
import net.minecraft.client.gui.toasts.SystemToast;
import net.minecraft.client.gui.toasts.TutorialToast;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import space.nicholasblackburn.toastmod.Main;

import space.nicholasblackburn.toastmod.util.BetterGuiToast;

@Mod.EventBusSubscriber
public class PlayerEvents{

    static Minecraft mc = Minecraft.getMinecraft();
    static ScaledResolution res = new ScaledResolution(mc);

    //Toast control

    private static BetterGuiToast test_toset = new BetterGuiToast(TutorialToast.Icons.TREE, "gamer","die", false);

    @SubscribeEvent
    public static void pickupItem(EntityItemPickupEvent event) {

        Main.logger.info("Item picked up!"+event.getEntityPlayer().getName());
        try {
            test_toset.draw(mc.getToastGui(), 1);
        } catch (Exception e ) {
            Main.logger.fatal(e);
            }
    }


    @SubscribeEvent
    public static void playerInteract(PlayerInteractEvent event) {
        Main.logger.info("Player Right clicked item!"+event.getEntityPlayer().getName());

    }





}
