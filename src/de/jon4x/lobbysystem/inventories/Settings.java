package de.jon4x.lobbysystem.inventories;

import de.jon4x.lobbysystem.itemmanager.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.concurrent.TimeUnit;

/**
 * Erstellt am 18 Jan 2018 - 08:50
 * Copyright (c) Jonas Laux. Alle Rechte vorbehalten.
 * Projekt >> LobbySystem
 */

public class Settings {

    public static void openSettings (Player p) throws InterruptedException {
        Inventory settings = Bukkit.createInventory(null, 9*4, "§8Einstellungen");

        p.openInventory(settings);

        for (int i = 0; i <= 9 * 4 - 1; i++) {
            settings.setItem(i, ItemManager.createItem(Material.STAINED_GLASS_PANE, 1, 14, "", null));
            p.updateInventory();
            for (int j = 0; j <= 9 * 4 - 1; j++) {
                TimeUnit.MILLISECONDS.sleep(25);
                settings.setItem(j, null);
                p.updateInventory();
            }
        }
    }

}