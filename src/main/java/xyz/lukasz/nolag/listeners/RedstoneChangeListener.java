package xyz.lukasz.nolag.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockRedstoneEvent;

public class RedstoneChangeListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onSignalChange(BlockRedstoneEvent e) {
        e.setNewCurrent(e.getOldCurrent());
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPistonExtend(BlockPistonExtendEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPistonRetract(BlockPistonRetractEvent e) {
        e.setCancelled(true);
    }
}