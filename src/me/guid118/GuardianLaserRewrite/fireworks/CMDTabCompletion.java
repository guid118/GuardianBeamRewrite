package me.guid118.GuardianLaserRewrite.fireworks;


import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class CMDTabCompletion implements TabCompleter {
	
	List<String> arguments = new ArrayList<String>();
	
	
	@Override
	public List <String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {
		if (arguments.isEmpty()) { arguments.add("ultimate"); arguments.add("wall"); arguments.add("stageflames"); arguments.add("smokemachine"); arguments.add("sparklers"); arguments.add("StageIllumination"); arguments.add("whitefireworks"); arguments.add("V"); arguments.add("star"); return arguments;}
		List<String> arguments2 = new ArrayList<String>();
		if (args[0].equalsIgnoreCase("sparklers") || args[0].equalsIgnoreCase("smokemachine")) {arguments2.add("<Duration in seconds>"); return arguments2;}

		List<String> arguments3 = new ArrayList<String>();
		if (args[0].equalsIgnoreCase("StageIllumination")) {arguments3.add("on"); arguments3.add("off"); arguments3.add("strobe"); return arguments3;}
		
		List<String> arguments4 = new ArrayList<String>();
		if (args[0].equalsIgnoreCase("ultimate")) {arguments4.add("goaround"); arguments4.add("start"); arguments4.add("end"); arguments4.add("topend"); arguments4.add("all"); return arguments4;}
		
		return arguments;
	}
	
}
