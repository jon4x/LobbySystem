package de.jon4x.lobbysystem;

import de.jon4x.lobbysystem.listener.JoinEvent;
import de.jon4x.lobbysystem.listener.Protect;
import de.jon4x.lobbysystem.listener.settings.InteractListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Erstellt am 18 Jan 2018 - 08:07
 * Copyright (c) Jonas Laux. Alle Rechte vorbehalten.
 * Projekt >> LobbySystem
 */

public class LobbySystem extends JavaPlugin {

    private static LobbySystem instance;

    // On Enable
    @Override
    public void onEnable() {
        // Print
        Bukkit.getConsoleSender().sendMessage(getPrefix() + "§7Das LobbySystem wurde §agestartet§7.");
        // instance
        instance = this;
        // Register Events
        PluginManager pm = getServer().getPluginManager();
        registerEvents(pm);
    }

    // On Disable
    @Override
    public void onDisable() {
        // Print
        Bukkit.getConsoleSender().sendMessage(getPrefix() + "§7Das LobbySystem wurde §cgestoppt§7.");
    }

    // Register Events
    private void registerEvents(PluginManager pluginManager) {
        pluginManager.registerEvents(new JoinEvent(), this);
        pluginManager.registerEvents(new Protect(), this);

        // Settings
        pluginManager.registerEvents(new InteractListener(), this);
    }

    // Register Commands
    private void registerCommands() {

    }

    // Getter
    public static LobbySystem getInstance() {
        return instance;
    }

    public static String getPrefix() {
        return "§8| §6Lobby §8\u00bb §r";
    }
}
