package de.jon4x.lobbysystem.listener.settings;

import de.jon4x.lobbysystem.inventories.Settings;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * Erstellt am 22 Jan 2018 - 10:21
 * Copyright (c) Jonas Laux. Alle Rechte vorbehalten.
 * Projekt >> LobbySystem
 */

public class InteractListener implements Listener {

    @EventHandler
    public void onInteract (PlayerInteractEvent e) throws InterruptedException {
        if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lEinstellungen §7(Rechtsklick)"))
                Settings.openSettings(e.getPlayer());
        }
    }
}
