package xyz.lukasz.nolag.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleCreateEvent;

public class VehicleSpawnListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onSpawn(VehicleCreateEvent e) {
        e.setCancelled(true);
    }
}