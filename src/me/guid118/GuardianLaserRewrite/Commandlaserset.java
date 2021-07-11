package me.guid118.GuardianLaserRewrite;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;



public class Commandlaserset implements CommandExecutor, Plugin {


	private Laser laser;

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender.hasPermission("GuardianLaser.set"))) { 
			 sender.sendMessage("You do not have permission to use this command (GuardianLaser.set)");
		 } else {
			 if(args.length == 9) {
				 Location loc1 = new Location(Bukkit.getWorld(args[8]), Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
				 Location loc2 = new Location(Bukkit.getWorld(args[8]), Double.parseDouble(args[3]),Double.parseDouble(args[4]),Double.parseDouble(args[5]));
				 
				 try {
					this.laser = new Laser(loc1, loc2, Integer.parseInt(args[6]), Integer.parseInt(args[7]));
					
					this.laser.start(Commandlaserset.this);
					
				} catch (ReflectiveOperationException e) {
					e.printStackTrace();
					sender.sendMessage("there was a ReflectiveOperationException!");
				}
			 } else return false;
		 }
		return true;
	}

	public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	public FileConfiguration getConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public File getDataFolder() {
		// TODO Auto-generated method stub
		return null;
	}

	public ChunkGenerator getDefaultWorldGenerator(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public PluginDescriptionFile getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public Logger getLogger() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public PluginLoader getPluginLoader() {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getResource(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Server getServer() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isNaggable() {
		// TODO Auto-generated method stub
		return false;
	}

	public void onDisable() {
		// TODO Auto-generated method stub
		
	}

	public void onEnable() {
		// TODO Auto-generated method stub
		
	}

	public void onLoad() {
		// TODO Auto-generated method stub
		
	}

	public void reloadConfig() {
		// TODO Auto-generated method stub
		
	}
	
	public void saveConfig() {
		// TODO Auto-generated method stub
		
	}

	public void saveDefaultConfig() {
		// TODO Auto-generated method stub
		
	}
	
	public void saveResource(String arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void setNaggable(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

}