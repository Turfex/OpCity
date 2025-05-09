package de.pixeltyles.opcity;

import de.pixeltyles.opcity.commands.AfkCommand;
import de.pixeltyles.opcity.commands.SpawnCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class OpCity extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("afk").setExecutor(new AfkCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
