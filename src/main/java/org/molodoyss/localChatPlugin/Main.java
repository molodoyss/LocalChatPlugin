package org.molodoyss.localChatPlugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("local-msg").setExecutor(new LocalChat());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
