package me.guid118.guardianbeam;

import me.guid118.guardianbeam.CMDs.CommandFireworks;
import me.guid118.guardianbeam.CMDs.Commandlaserset;
import me.guid118.guardianbeam.CMDs.Commandlaserstop;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Guardianbeam extends JavaPlugin{

    public static Plugin instance;



    public void onEnable() {


        Objects.requireNonNull(this.getCommand("laserset")).setExecutor(new Commandlaserset());
        Objects.requireNonNull(this.getCommand("laserstop")).setExecutor(new Commandlaserstop());
        Objects.requireNonNull(this.getCommand("fireworks")).setExecutor(new CommandFireworks());
        Objects.requireNonNull(this.getCommand("fireworks")).setTabCompleter(new TabCompletion());
        //this.saveDefaultConfig();
    }
    public void onDisable() {



    }



}
