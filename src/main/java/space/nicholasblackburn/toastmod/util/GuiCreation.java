/*
 * Copyright (c) Nicholas Blackburn 2020 -> Toast Mod 2020
 * Released under gnu public licence
 */

package space.nicholasblackburn.toastmod.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class GuiCreation extends Gui {
    public String text = "TEST";

    public GuiCreation(Minecraft mc){
        ScaledResolution scaled = new ScaledResolution(mc);
        int width = scaled.getScaledWidth();
        int height = scaled.getScaledHeight();
        drawCenteredString(mc.fontRenderer, text, width / 20, (height * 2) - 4, Integer.parseInt("FFAA00", 16));

    }
}
