package me.guid118.GuardianLaserRewrite.fireworks;



import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import me.guid118.GuardianLaserRewrite.Main;





public abstract class stageflames implements Plugin {

	public static void stageflamessnowballs(CommandSender sender) {
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 9 5 -255 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['1']}"), 0);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 4 5 -256 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['2']}"), 2);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 14 5 -256 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['2']}"), 2);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 0 5 -257 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['3']}"), 4);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 18 5 -257 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['3']}"), 4);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball -6 5 -261 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['4']}"), 6);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 24 5 -261 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['4']}"), 6);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball -11 5 -262 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['5']}"), 8);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 29 5 -262 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['5']}"), 8);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball -15 5 -262 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['6']}"), 10);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 33 5 -262 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['6']}"), 10);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball -19 5 -262 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['7']}"), 12);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 37 5 -262 {Motion:[0.0,2.5,1.0],power:[0.0,0.05,0.0],LeftOwner:1b,Tags:['7']}"), 12);

        new BukkitRunnable() {
            private int i = 0;
            public void run() {
                if(i >= 80) {
                    cancel();
                }
                ++i;
                Bukkit.dispatchCommand(sender, "execute as @e[tag=1] at @e[type=snowball] align xyz run particle minecraft:flame ~ ~ ~ 0.3 0.3 0.3 0 30 force");
            }
        }.runTaskTimer(Main.instance, 0L, 1L);
        
        Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=snowball,tag=1]"), 28);
        Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=snowball,tag=2]"), 30);
        Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=snowball,tag=3]"), 32);
        Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=snowball,tag=4]"), 34);
        Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=snowball,tag=5]"), 36);
        Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=snowball,tag=6]"), 38);
        Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=snowball,tag=7]"), 40);

        
        
		
	}
}