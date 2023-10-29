package me.calciumjpg.timestop;

import org.bukkit.plugin.java.JavaPlugin;

public final class TimeStop extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
