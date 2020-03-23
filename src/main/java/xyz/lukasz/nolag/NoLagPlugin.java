package xyz.lukasz.nolag;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import xyz.lukasz.nolag.listeners.BookEditListener;
import xyz.lukasz.nolag.listeners.DispenseListener;
import xyz.lukasz.nolag.listeners.FireworkListener;
import xyz.lukasz.nolag.listeners.HopperListener;
import xyz.lukasz.nolag.listeners.RedstoneChangeListener;
import xyz.lukasz.nolag.listeners.SplashPotionListener;
import xyz.lukasz.nolag.listeners.VehicleSpawnListener;

public class NoLagPlugin extends JavaPlugin {

    public boolean blockRedstone;
    public boolean blockVehicles;
    public boolean blockDispensers;
    public boolean blockHoppers;
    public boolean blockBooks;
    public boolean blockFireworks;
    public boolean blockSplashPotions;

    @Override
    public void onEnable() {
        loadConfig();
        registerListeners();
    }

    @Override
    public void onDisable() {
    }

    private void loadConfig() {
        this.saveDefaultConfig();
        blockRedstone = this.getConfig().getBoolean("blockredstone");
        blockVehicles = this.getConfig().getBoolean("blockvehicles");
        blockDispensers = this.getConfig().getBoolean("blockdispensers");
        blockHoppers = this.getConfig().getBoolean("blockhoppers");
        blockBooks = this.getConfig().getBoolean("blockbooks");
        blockFireworks = this.getConfig().getBoolean("blockfireworks", true);
        blockSplashPotions = this.getConfig().getBoolean("blocksplashpotions", true);
    }

    private void registerListeners() {
        PluginManager pm = getServer().getPluginManager();
        if (blockRedstone) pm.registerEvents(new RedstoneChangeListener(), this);
        if (blockVehicles) pm.registerEvents(new VehicleSpawnListener(), this);
        if (blockDispensers) pm.registerEvents(new DispenseListener(), this);
        if (blockHoppers) pm.registerEvents(new HopperListener(), this);
        if (blockBooks) pm.registerEvents(new BookEditListener(), this);
        if (blockFireworks) pm.registerEvents(new FireworkListener(), this);
        if (blockSplashPotions) pm.registerEvents(new SplashPotionListener(), this);
    }
}