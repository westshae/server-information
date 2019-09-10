package com.altoya.information;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
    	loadConfig();
    	
        this.getCommand("discordlink").setExecutor(new Discord());
        this.getCommand("serverip").setExecutor(new ServerIp());
        this.getCommand("staff").setExecutor(new Staff());
        this.getCommand("rules").setExecutor(new Rules());
        this.getCommand("store").setExecutor(new Store());
    }

    @Override
    public void onDisable() {
    }
    
    public void loadConfig() {
        File file = new File(getDataFolder(), "config.yml");
        if(!file.exists()){
            getConfig().addDefault("discord.string", "default");
            getConfig().addDefault("ipaddress.string", "default");
            getConfig().addDefault("staff.string", "default");
            getConfig().addDefault("rules.string", "default");
            getConfig().addDefault("store.string", "default");
            getConfig().options().copyDefaults(true);
            saveConfig();
        }

        else{
            getConfig().options().copyDefaults(true);
            saveConfig();

        }
    }
}