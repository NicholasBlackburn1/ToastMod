/*
 * Copyright (c) Nicholas Blackburn 2020 -> Toast Mod 2020
 * Released under gnu public licence
 */

package space.nicholasblackburn.toastmod.events;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import space.nicholasblackburn.toastmod.Main;

@Mod.EventBusSubscriber
public class PlayerEvents{

    @SubscribeEvent
    public static void pickupItem(EntityItemPickupEvent event) {
        Main.logger.info("Item picked up!"+event.getEntityPlayer().getName());
    }
}
