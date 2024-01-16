package net.lilfox.betterframes.integration;


import net.lilfox.betterframes.ModInfo;
import net.lilfox.betterframes.gui.ConfigsGui;
import top.hendrixshen.magiclib.compat.modmenu.ModMenuCompatApi;

public class ModMenuImplementation implements ModMenuCompatApi {
    @Override
    public ConfigScreenFactoryCompat<?> getConfigScreenFactoryCompat() {
        return (screen) -> {
            ConfigsGui gui = ConfigsGui.getInstance();
            gui.setParent(screen);
            return gui;
        };
    }

    @Override
    public String getModIdCompat() {
        return ModInfo.MOD_ID;
    }

}
