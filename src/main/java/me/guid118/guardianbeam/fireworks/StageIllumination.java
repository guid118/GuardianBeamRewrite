package me.guid118.guardianbeam.fireworks;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;


public class StageIllumination {

    public static void Illumination(CommandSender sender, String[] args) {
        if(args[1].equalsIgnoreCase("on")) {
            Bukkit.dispatchCommand(sender, "fill 9 33 -264 9 32 -264 light[level=15] replace light[level=0]");
            Bukkit.dispatchCommand(sender, "fill -26 26 -267 42 4 -250 light[level=15] replace light[level=0]");
        }
        if(args[1].equalsIgnoreCase("off")) {
            Bukkit.dispatchCommand(sender, "fill 9 33 -264 9 32 -264 light[level=0] replace light[level=15]");
            Bukkit.dispatchCommand(sender, "fill -26 26 -267 42 4 -250 light[level=0] replace light[level=15]");
        }
    }

}
