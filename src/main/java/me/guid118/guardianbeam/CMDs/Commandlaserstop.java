package me.guid118.guardianbeam.CMDs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class Commandlaserstop implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("Guardianlaser.Laserstop"))
            Commandlaserset.laser.stop();
        return true;
    }

}
