package me.guid118.GuardianLaserRewrite;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class Commandlaserset implements CommandExecutor {

	private Laser laser;

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender.hasPermission("GuardianLaser.set"))) { 
			 sender.sendMessage("You do not have permission to use this command (GuardianLaser.set)");
		 } else {
			 sender.sendMessage("This worked!");
			 if(args.length == 9) {
				 Location loc1 = new Location(Bukkit.getWorld(args[6]), Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
				 Location loc2 = new Location(Bukkit.getWorld(args[6]), Double.parseDouble(args[3]),Double.parseDouble(args[4]),Double.parseDouble(args[5]));
				 
				 try {
					this.laser = new Laser(loc1, loc2, Integer.parseInt(args[7]), Integer.parseInt(args[8]));
					
					this.laser.start(null);
					
				} catch (ReflectiveOperationException e) {
					e.printStackTrace();
					sender.sendMessage("there was a ReflectiveOperationException!");
				}
			 } else return false;
		 }
		return true;
	}
}
