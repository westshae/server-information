package com.altoya.information;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class Store implements CommandExecutor {
    private Plugin plugin = Main.getPlugin(Main.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("store")){
            if(sender.hasPermission("information.store")){
                String store = plugin.getConfig().getString("store.string");
                sender.sendMessage(ChatColor.LIGHT_PURPLE + store);
                plugin.saveConfig();
            }
        }
        return true;
    }
}