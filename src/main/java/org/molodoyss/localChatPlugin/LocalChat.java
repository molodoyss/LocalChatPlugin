package org.molodoyss.localChatPlugin;

import com.google.common.base.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LocalChat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("Only players can works with this command");
            return true;
        }
        Player player = (Player) commandSender;

        String outputMessage = "";

        for (String el : strings) {
            outputMessage += el;
        }

        Utils.sendMessage(Utils.colorize(outputMessage), 10, player);
        return false;
    }
}
