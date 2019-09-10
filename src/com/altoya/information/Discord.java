package com.altoya.information;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class Discord implements CommandExecutor {
    private Plugin plugin = Main.getPlugin(Main.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("discordlink")){
            if(sender.hasPermission("information.discord")){
                String discord = plugin.getConfig().getString("discord.string");
                sender.sendMessage(ChatColor.LIGHT_PURPLE + discord);
                plugin.saveConfig();
            }
        }
        return true;
    }
}