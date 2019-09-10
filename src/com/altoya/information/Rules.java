package com.altoya.information;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.util.List;

public class Rules implements CommandExecutor {
    private Plugin plugin = Main.getPlugin(Main.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("rules")){
            if(sender.hasPermission("information.rules")){
                List<String> rules = plugin.getConfig().getStringList("rules.string");
                for (String s : rules){
                    sender.sendMessage(ChatColor.LIGHT_PURPLE + s);
                }
                plugin.saveConfig();
            }
        }
        return true;
    }
}