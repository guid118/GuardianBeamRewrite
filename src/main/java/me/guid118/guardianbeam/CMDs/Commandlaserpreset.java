package me.guid118.guardianbeam.CMDs;

import me.guid118.guardianbeam.laserpresets.Monster;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commandlaserpreset implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length != 1) { sender.sendMessage("You need to select a preset!"); return true; }
        if (args[0].equalsIgnoreCase("monster")) { Monster.monster(sender); }

        return true;
    }
}
