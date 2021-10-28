package me.guid118.guardianbeam.fireworks;

import me.guid118.guardianbeam.Guardianbeam;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

public class Star {

    public static void summoner(CommandSender sender) {
        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon egg 37 24 -271 {NoAI:0b,NoGravity:0b,Tags:['P1','G4'],Silent:1b,ActiveEffects:[{Id:14,Amplifier:100,Duration:999999,ShowParticles:0b}],Motion:[-1.5,1.5,0.0]}"), 12);
        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon egg -19 24 -271 {NoAI:0b,NoGravity:0b,Tags:['P2','G4'],Silent:1b,ActiveEffects:[{Id:14,Amplifier:100,Duration:999999,ShowParticles:0b}],Motion:[1.5,1.5,0.0]}"), 12);
        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon egg 37 24 -271 {NoAI:0b,NoGravity:0b,Tags:['P1','G5','P1G'],Silent:1b,ActiveEffects:[{Id:14,Amplifier:100,Duration:999999,ShowParticles:0b}],Motion:[-2.0,2.5,0.0]}"), 22);
        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon egg -19 24 -271 {NoAI:0b,NoGravity:0b,Tags:['P2','G5','P2G'],Silent:1b,ActiveEffects:[{Id:14,Amplifier:100,Duration:999999,ShowParticles:0b}],Motion:[2.0,2.5,0.0]}"), 22);
        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "data merge entity @e[tag=P2G,limit=1] {Motion:[1.0,1.0,0.0]}"), 30);
        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "data merge entity @e[tag=P1G,limit=1] {Motion:[-1.0,1.0,0.0]}"), 30);

        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon egg 37 24 -271 {NoAI:0b,NoGravity:0b,Tags:['P1','G3'],Silent:1b,ActiveEffects:[{Id:14,Amplifier:100,Duration:999999,ShowParticles:0b}],Motion:[-2.0,1.5,0.0]}"), 2);
        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon egg -19 24 -271 {NoAI:0b,NoGravity:0b,Tags:['P2','G3'],Silent:1b,ActiveEffects:[{Id:14,Amplifier:100,Duration:999999,ShowParticles:0b}],Motion:[2.0,1.5,0.0]}"), 2);

        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=egg,tag=G3]"), 50);
        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=egg,tag=G4]"), 60);
        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=egg,tag=G5]"), 70);



        new BukkitRunnable() {
            private int i = 0;

            public void run() {
                if(i >= 100) {
                    cancel();
                }
                ++i;
                Bukkit.dispatchCommand(sender, "execute as @e[type=egg] at @s anchored eyes run particle end_rod ^ ^ ^ 0.5 0.5 0.4 0.01 50 force");
            }
        }.runTaskTimer(Guardianbeam.instance, 0L, 1L);


        new BukkitRunnable() {
            private int i = 0;

            public void run() {
                if(i >= 40) {
                    cancel();
                }
                ++i;
                Bukkit.dispatchCommand(sender, "execute as @e[type=egg,tag=G3] at @s anchored eyes run particle flame ^ ^ ^ 0.45 0.7 0.6 0.01 100 force");
            }
        }.runTaskTimer(Guardianbeam.instance, 44L, 1L);


        new BukkitRunnable() {
            private int i = 0;

            public void run() {
                if(i >= 40) {
                    cancel();
                }
                ++i;
                Bukkit.dispatchCommand(sender, "execute as @e[type=egg,tag=G4] at @s anchored eyes run particle flame ^ ^ ^ 0.45 0.7 0.6 0.01 50 force");

            }
        }.runTaskTimer(Guardianbeam.instance, 54L, 1L);

        new BukkitRunnable() {
            private int i = 0;

            public void run() {
                if(i >= 40) {
                    cancel();
                }
                ++i;
                Bukkit.dispatchCommand(sender, "execute as @e[type=egg,tag=G5] at @s anchored eyes run particle flame ^ ^ ^ 0.45 0.7 0.6 0.01 50 force");
            }
        }.runTaskTimer(Guardianbeam.instance, 52L, 1L);

    }
}
