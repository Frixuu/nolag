package xyz.lukasz.nolag.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class FireworkListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onIgnite(PlayerInteractEvent e) {
        if (Material.FIREWORK_ROCKET.equals(e.getMaterial())) {
            e.setCancelled(true);
        }
    }
}