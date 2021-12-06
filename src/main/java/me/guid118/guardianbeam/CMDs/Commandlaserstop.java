package me.guid118.guardianbeam.CMDs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static me.guid118.guardianbeam.CMDs.CommandGuardianlaserset.laser;


public class Commandlaserstop implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("Guardianlaser.Laserstop"))
            laser.stop();
        return true;
    }

}
