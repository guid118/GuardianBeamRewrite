package me.guid118.guardianbeam.CMDs;

import me.guid118.guardianbeam.circle.Spin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


public class CommandCircle {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        Spin.spintoggle(sender);

      return true;
    }


}
