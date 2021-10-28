package me.guid118.guardianbeam.fireworks;

import me.guid118.guardianbeam.Guardianbeam;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import net.md_5.bungee.api.ChatColor;

public abstract class Smoke implements Plugin {


    public static void smokemachine(CommandSender sender, String[] args) {
        if(Double.parseDouble(args[1]) < 1 ) sender.sendMessage(ChatColor.RED + "Duration must be at least one second!"); else {


            new BukkitRunnable() {
                private int i = 0;
                private Double d = Double.parseDouble(args[1]) * 20;
                public void run() {
                    if(i >= d) {
                        cancel();
                    }
                    ++i;
                    Bukkit.dispatchCommand(sender, "particle minecraft:campfire_cosy_smoke 9.5 7 -253.5 0.35 0.35 1.75 0.001 10 force");
                    Bukkit.dispatchCommand(sender, "particle minecraft:campfire_cosy_smoke 13.5 7 -253.5 0.35 0.35 1.75 0.001 10 force");
                    Bukkit.dispatchCommand(sender, "particle minecraft:campfire_cosy_smoke 5.5 7 -253.5 0.35 0.35 1.75 0.001 10 force");
                    Bukkit.dispatchCommand(sender, "particle minecraft:campfire_cosy_smoke 17.5 7 -254.5 0.35 0.35 1.75 0.001 10 force");
                    Bukkit.dispatchCommand(sender, "particle minecraft:campfire_cosy_smoke 1.5 7 -254.5 0.35 0.35 1.75 0.001 10 force");
                }
            }.runTaskTimer(Guardianbeam.instance, 0L, 1L);




        }
    }
}