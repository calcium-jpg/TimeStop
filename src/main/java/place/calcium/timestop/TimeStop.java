package place.calcium.timestop;

import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public final class TimeStop extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Daylight cycle set to false initially!");

        for (World world : getServer().getWorlds()) {
            world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
        }

        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }
}