package me.guid118.guardianbeam.CMDs;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import me.guid118.guardianbeam.Guardianbeam;
import me.guid118.guardianbeam.Laser;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;



public class CommandGuardianlaserset implements CommandExecutor, Plugin {

    public static Laser laser;





    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender.hasPermission("GuardianLaser.guardianset"))) {
            sender.sendMessage("You do not have permission to use this command (GuardianLaser.guardianset)");
        } else {
            if(args.length == 10) {


                Location loc1 = new Location(Bukkit.getWorld(args[8]), Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
                Location loc2 = new Location(Bukkit.getWorld(args[8]), Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
                try {
                    Guardianbeam.lasermap.put(Integer.parseInt(args[9]), new Laser.GuardianLaser(loc1, loc2, Integer.parseInt(args[6]), Integer.parseInt(args[7])));
                } catch (ReflectiveOperationException e) {
                    e.printStackTrace();
                }
                CommandGuardianlaserset.laser = Guardianbeam.lasermap.get(args[9]);
                CommandGuardianlaserset.laser.start(CommandGuardianlaserset.this);

            } else return false;
        }




        return true;
    }


    @Override
    public List<String> onTabComplete(CommandSender arg0, Command arg1, String arg2, String[] arg3) {






        return null;
    }


    @Override
    public FileConfiguration getConfig() {
        
        return null;
    }


    @Override
    public File getDataFolder() {
        
        return null;
    }


    @Override
    public ChunkGenerator getDefaultWorldGenerator(String arg0, String arg1) {
        
        return null;
    }


    @Override
    public PluginDescriptionFile getDescription() {
        
        return null;
    }


    @Override
    public Logger getLogger() {
        
        return null;
    }


    @Override
    public String getName() {
        
        return null;
    }


    @Override
    public PluginLoader getPluginLoader() {
        
        return null;
    }


    @Override
    public InputStream getResource(String arg0) {
        
        return null;
    }


    @Override
    public Server getServer() {
        
        return null;
    }


    @Override
    public boolean isEnabled() {
        
        return true;
    }


    @Override
    public boolean isNaggable() {
        
        return false;
    }


    @Override
    public void onDisable() {
        

    }


    @Override
    public void onEnable() {
        

    }


    @Override
    public void onLoad() {
        

    }


    @Override
    public void reloadConfig() {
        

    }


    @Override
    public void saveConfig() {
        

    }


    @Override
    public void saveDefaultConfig() {
        

    }


    @Override
    public void saveResource(String arg0, boolean arg1) {
        

    }


    @Override
    public void setNaggable(boolean arg0) {
        

    }


    @Override
    public BiomeProvider getDefaultBiomeProvider(String arg0, String arg1) {
        
        return null;
    }
}