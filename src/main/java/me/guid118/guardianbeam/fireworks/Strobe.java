package me.guid118.guardianbeam.fireworks;

import me.guid118.guardianbeam.Guardianbeam;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

import static me.guid118.guardianbeam.fireworks.StageIllumination.strobe;


public class Strobe {


    public static void strobe(CommandSender sender) {
        if (!strobe) {
            new BukkitRunnable() {

                public void run() {
                    if (!strobe) {
                        cancel();
                    }
                    Bukkit.dispatchCommand(sender, "fill 9 33 -264 9 32 -264 light[level=0] replace light[level=15]");
                    Bukkit.dispatchCommand(sender, "fill -26 26 -267 42 4 -250 light[level=0] replace light[level=15]");

                    Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "fill 9 33 -264 9 32 -264 light[level=15] replace light[level=0]"), 19);
                    Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "fill -26 26 -267 42 4 -250 light[level=15] replace light[level=0]"), 19);
                    //TODO rewrite these commands to make a smoother transition (copy from world)

                }
            }.runTaskTimer(Guardianbeam.instance, 0L, 38L);
        }
    }
}