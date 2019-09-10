package com.altoya.information;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class ServerIp implements CommandExecutor {
    private Plugin plugin = Main.getPlugin(Main.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("serverip")){
            if(sender.hasPermission("information.serverip")){
                String ipaddress = plugin.getConfig().getString("ipaddress.string");
                sender.sendMessage(ChatColor.LIGHT_PURPLE + ipaddress);
                plugin.saveConfig();
            }
        }
        return true;
    }
}