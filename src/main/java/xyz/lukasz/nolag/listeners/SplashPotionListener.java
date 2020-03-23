package xyz.lukasz.nolag.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class SplashPotionListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onThrow(PlayerInteractEvent e) {
        if (Material.SPLASH_POTION.equals(e.getMaterial())) {
            e.setCancelled(true);
        }
    }
}