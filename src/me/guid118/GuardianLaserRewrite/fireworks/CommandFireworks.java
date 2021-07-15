package me.guid118.GuardianLaserRewrite.fireworks;



import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


import me.guid118.GuardianLaserRewrite.fireworks.stageflames;
import me.guid118.GuardianLaserRewrite.fireworks.ultimate;
import me.guid118.GuardianLaserRewrite.fireworks.wall;

public class CommandFireworks implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(args.length >= 1) {
			if (args[0].equalsIgnoreCase("wall")) {
				
				wall.fireworkswall(sender);
			}
			if (args[0].equalsIgnoreCase("ultimate")) {
				
				if (args[1].equalsIgnoreCase("goaround")) {
					
					ultimate.goaround(sender);
				
				}
				if (args[1].equalsIgnoreCase("start")) {
					
					ultimate.start(sender);
					
				}
				if (args[1].equalsIgnoreCase("end")) {
					
					ultimate.end(sender);
				
				}
				if (args[1].equalsIgnoreCase("topend")) {
					
					wall.upper(sender);
					
				}
				if (args[1].equalsIgnoreCase("all")) {
					
					ultimate.all(sender, args);
					
				}
			}
			if (args[0].equalsIgnoreCase("stageflames")) {
				
				stageflames.stageflamessnowballs(sender);
				
			}
			if (args[0].equalsIgnoreCase("smokemachine")) {
				
				smoke.smokemachine(sender, args);
				
			}	
			if (args[0].equalsIgnoreCase("sparklers")) {
				
				sparklers.sparkler(sender, args);
				
			}
			if (args[0].equalsIgnoreCase("stageillumination")) {
				
				StageIllumination.Illumination(sender, args);
			}
			if (args[0].equalsIgnoreCase("whitefireworks")) {
				
				Endrodthings.summoner(sender);
				
			}
			if (args[0].equalsIgnoreCase("V")) {
				
				V.summoner(sender);
				
			}
			
			if (args[0].equalsIgnoreCase("star")) {
				
				star.summoner(sender);
				
			}
			
		} else if (args.length < 1) return false;
		
		return true;
	}
	
	
}
