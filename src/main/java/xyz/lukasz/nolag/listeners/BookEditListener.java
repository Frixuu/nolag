package xyz.lukasz.nolag.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.bukkit.event.player.PlayerEditBookEvent;

public class BookEditListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onEdit(PlayerEditBookEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onGetCreative(InventoryCreativeEvent e) {
        if (e.getCursor().getType().equals(Material.WRITABLE_BOOK)) {
            e.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPickup(EntityPickupItemEvent e) {
        if (e.getItem().getItemStack().getType().equals(Material.WRITABLE_BOOK)) {
            e.setCancelled(true);
        }
    }
}