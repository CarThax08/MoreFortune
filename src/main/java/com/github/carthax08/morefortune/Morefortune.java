package com.github.carthax08.morefortune;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Morefortune extends JavaPlugin {
    private static Morefortune instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static FileConfiguration getConfigFile(){
        return instance.getConfig();
    }
}
