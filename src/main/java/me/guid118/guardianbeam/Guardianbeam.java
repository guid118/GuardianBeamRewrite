package me.guid118.guardianbeam;

import me.guid118.guardianbeam.CMDs.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Level;

public class Guardianbeam extends JavaPlugin{

    public static Plugin instance;



    public void onEnable() {
        instance = this;
        Bukkit.getLogger().log(Level.INFO, "Guardianbeam is now enabled!");

        Objects.requireNonNull(this.getCommand("guardianlaserset")).setExecutor(new CommandGuardianlaserset());
        Objects.requireNonNull(this.getCommand("crystallaserset")).setExecutor(new CommandCrystallaserset());
        Objects.requireNonNull(this.getCommand("laserstop")).setExecutor(new Commandlaserstop());
        Objects.requireNonNull(this.getCommand("fireworks")).setExecutor(new CommandFireworks());
        Objects.requireNonNull(this.getCommand("fireworks")).setTabCompleter(new TabCompletion());
        Objects.requireNonNull(this.getCommand("laserpreset")).setExecutor(new Commandlaserpreset());
        //this.saveDefaultConfig();
    }
    public void onDisable() {
    Bukkit.getLogger().info("Goodbye!");


    }



}
