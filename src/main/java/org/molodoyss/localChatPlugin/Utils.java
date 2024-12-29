package org.molodoyss.localChatPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.Vector;

public class Utils {
    public static void sendMessage(String msg, int radius, Player mainPlayer) {
        for (Player player1 : mainPlayer.getLocation().getWorld().getPlayers()) {
            if (player1.getLocation().distance(mainPlayer.getLocation()) <= radius) {
                player1.sendMessage(colorize("&e[&bLocalChat&e] &8from " + mainPlayer.getName() + ": " + msg));
            }
        }
    }
    public static String colorize(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
