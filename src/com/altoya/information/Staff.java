package com.altoya.information;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.util.List;

public class Staff implements CommandExecutor {
    private Plugin plugin = Main.getPlugin(Main.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("staff")){
            if(sender.hasPermission("information.staff")){
                List<String> staff = plugin.getConfig().getStringList("staff.string");
                for (String s : staff){
                    sender.sendMessage(ChatColor.LIGHT_PURPLE + s);
                }
                plugin.saveConfig();
            }
        }
        return true;
    }
}