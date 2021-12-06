package me.guid118.guardianbeam.fireworks;

import me.guid118.guardianbeam.Guardianbeam;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;


public class StageIllumination {


    public static boolean strobe = false;
    public static void Illumination(CommandSender sender, String[] args) {

        if(args.length > 3){
            sender.sendMessage("you must turn the lights on or off!");
            //TODO fix this to only send it when there is no "on" or "off" in the arguments
    } else {

            if (args[1].equalsIgnoreCase("on")) {
                Bukkit.dispatchCommand(sender, "fill 9 33 -264 9 32 -264 light[level=15] replace light[level=0]");
                Bukkit.dispatchCommand(sender, "fill -26 26 -267 42 4 -250 light[level=15] replace light[level=0]");
                sender.sendMessage("stage is now lit");
            }
            if (args[1].equalsIgnoreCase("off")) {
                Bukkit.dispatchCommand(sender, "fill 9 33 -264 9 32 -264 light[level=0] replace light[level=15]");
                Bukkit.dispatchCommand(sender, "fill -26 26 -267 42 4 -250 light[level=0] replace light[level=15]");
                sender.sendMessage("stage is now dim");
            }
            if (args[1].equalsIgnoreCase("strobe")) {

                if (args[2].equalsIgnoreCase("on")) {
                    Strobe.strobe(sender);
                    strobe = true;
                }
                if (args[2].equalsIgnoreCase("off")) {
                    strobe = false;
                }
                }
        }
    }
}






