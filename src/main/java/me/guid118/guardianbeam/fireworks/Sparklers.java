package me.guid118.guardianbeam.fireworks;

import me.guid118.guardianbeam.Guardianbeam;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;


import net.md_5.bungee.api.ChatColor;

public abstract class Sparklers implements Plugin{


    public static void sparkler(CommandSender sender, String[] args) {

        if(Double.parseDouble(args[1]) < 1 ) sender.sendMessage(ChatColor.RED + "Duration must be at least one second!"); else {

            new BukkitRunnable() {
                private int i = 0;
                private Double d = Double.parseDouble(args[1]) * 20;



                public void run() {
                    if(i >= d) {
                        cancel();
                    }
                    ++i;
                    Bukkit.dispatchCommand(sender, "particle minecraft:lava 13.5 8 -254.5 0.35 1.75 0.35 0 5 force");
                    Bukkit.dispatchCommand(sender, "particle minecraft:lava 9.5 8 -254.5 0.35 1.75 0.35 0 5 force");
                    Bukkit.dispatchCommand(sender, "particle minecraft:lava 5.5 8 -254.5 0.35 1.75 0.35 0 5 force");
                }
            }.runTaskTimer(Guardianbeam.instance, 0L, 1L);

        }
    }
}