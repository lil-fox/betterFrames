package net.lilfox.betterframes.gui;

import net.lilfox.betterframes.ModInfo;
import top.hendrixshen.magiclib.malilib.impl.ConfigManager;
import top.hendrixshen.magiclib.malilib.impl.gui.ConfigGui;

public class ConfigsGui extends ConfigGui {
    private static ConfigsGui INSTANCE;

    public ConfigsGui() {
        super("liltweaks", "chat", ConfigManager.get("liltweaks"), () -> {
            return ModInfo.translate("gui.title.configs", new Object[]{"liltweaks"});
        });
    }

    public ConfigsGui(String modId, String defaultTab, ConfigManager configManager) {
        super(modId, defaultTab, configManager, () -> {
            return ModInfo.translate("gui.title.configs", new Object[]{"liltweaks"});
        });
    }

    public static ConfigsGui getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConfigsGui("liltweaks", "chat", ConfigManager.get("liltweaks"));
        }

        return INSTANCE;
    }
}
