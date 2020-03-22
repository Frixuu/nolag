package xyz.lukasz.nolag.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.inventory.InventoryType;

public class HopperListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPickup(InventoryPickupItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onTransfer(InventoryMoveItemEvent e) {
        if (e.getDestination().getType() == InventoryType.HOPPER
            || e.getSource().getType() == InventoryType.HOPPER) {
            e.setCancelled(true);
        }
    }
}