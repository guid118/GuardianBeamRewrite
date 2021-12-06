package me.guid118.guardianbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class TabCompletion implements TabCompleter {

    List<String> arguments = new ArrayList<String>();
    List<String> arguments2 = new ArrayList<String>();
    List<String> arguments3 = new ArrayList<String>();
    List<String> arguments4 = new ArrayList<String>();
    List<String> arguments5 = new ArrayList<String>();
    List<String> emptyarguments = new ArrayList<String>();

    @Override
    public List <String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {

        emptyarguments.add("");
        //all possible arguments for fireworks command
        if (arguments.isEmpty()) {
            arguments.add("ultimate");
            arguments.add("wall");
            arguments.add("stageflames");
            arguments.add("smokemachine");
            arguments.add("sparklers");
            arguments.add("stageillumination");
            arguments.add("whitefireworks");
            arguments.add("V");
            arguments.add("star");
        }

        //all possible arguments for fireworks sparklers/smokemachine command
        if (args[0].equalsIgnoreCase("sparklers") || args[0].equalsIgnoreCase("smokemachine")) {
            arguments2.add("<Duration in seconds>");
            return arguments2;
        }

        //all possible arguments for the fireworks stageillumination command
        if (args[0].equalsIgnoreCase("StageIllumination")) {
            //checks if second argument is completed
            if (args[1].equalsIgnoreCase("on")){
                return emptyarguments;
            }
            if (args[1].equalsIgnoreCase("off")) {
                return emptyarguments;
            }
            //if this second argument is strobe, third argument needed
            if (args[1].equalsIgnoreCase("strobe")) {
                arguments4.add("on");
                arguments4.add("off");
                return arguments4;
            }
            arguments3.add("on");
            arguments3.add("off");
            arguments3.add("strobe");
            return arguments3;
        }

        //all possible arguments for fireworks ultimate command
        if (args[0].equalsIgnoreCase("ultimate")) {
            arguments5.add("goaround");
            arguments5.add("start");
            arguments5.add("end");
            arguments5.add("topend");
            arguments5.add("all");
            return arguments5;
        }

        List<String> result = new ArrayList<String>();
        if (args.length == 1) {
            for (String a : arguments) {
                if (a.toLowerCase().startsWith(args[0].toLowerCase())) {
                    result.add(a);
                }
            }
            return result;
        }

     return null;
    }

}
