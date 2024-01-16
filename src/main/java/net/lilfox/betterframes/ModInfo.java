package net.lilfox.betterframes;

import top.hendrixshen.magiclib.language.api.I18n;
import top.hendrixshen.magiclib.malilib.impl.ConfigHandler;

public class ModInfo {
    public static final String MOD_ID = "betterframrs";
    public static final String MOD_NAME = "Better Tweaks";
    public static ConfigHandler configHandler;

    public static String translate(String key, Object... objects) {
        return I18n.get("betterframes." + key, objects);
    }
}
