package me.guid118.guardianbeam.CMDs;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandMoveend implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 5) {
            sender.sendMessage("please provide new coordinates and amount of ticks to get there");
            return true;
        }
        try {
            Integer.parseInt(args[0]);
            Double.parseDouble(args[1]);
            Double.parseDouble(args[2]);
            Double.parseDouble(args[3]);
            Integer.parseInt(args[4]);
        } catch (NumberFormatException e) {sender.sendMessage("that didn't work!" + e); return true;}


        Location loc1 = new Location(Bukkit.getWorld("world"), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));
        CommandGuardianlaserset.laser.moveEnd(loc1,Integer.parseInt(args[4]), null);




        return true;
    }
}
