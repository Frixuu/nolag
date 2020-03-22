package xyz.lukasz.nolag.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

public class DispenseListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onDispense(BlockDispenseEvent e) {
        e.setCancelled(true);
    }
}