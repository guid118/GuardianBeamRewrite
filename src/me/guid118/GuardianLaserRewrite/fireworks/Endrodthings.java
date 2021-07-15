package me.guid118.GuardianLaserRewrite.fireworks;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import me.guid118.GuardianLaserRewrite.Main;

public abstract class Endrodthings implements Plugin{
	
	public static void summoner(CommandSender sender) {
		
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon egg 0 24 -271 {Invisible:1b,NoGravity:0b,Tags:['P1','G1'],Silent:1b,ActiveEffects:[{Id:14,Amplifier:100,Duration:999999,ShowParticles:0b}],Motion:[0.0,1.5,0.5]}"), 0);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon egg -8 24 -271 {Invisible:1b,NoGravity:0b,Tags:['P1','G1'],Silent:1b,ActiveEffects:[{Id:14,Amplifier:100,Duration:999999,ShowParticles:0b}],Motion:[0.0,1.5,0.5]}"), 0);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon egg 26 24 -271 {Invisible:1b,NoGravity:0b,Tags:['P1','G2'],Silent:1b,ActiveEffects:[{Id:14,Amplifier:100,Duration:999999,ShowParticles:0b}],Motion:[0.0,1.5,0.5]}"), 0);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "summon egg 18 24 -271 {Invisible:1b,NoGravity:0b,Tags:['P1','G2'],Silent:1b,ActiveEffects:[{Id:14,Amplifier:100,Duration:999999,ShowParticles:0b}],Motion:[0.0,1.5,0.5]}"), 0);

		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "execute at @e[tag=P1] run summon firework_rocket ~ ~-1 ~3 {LifeTime:3,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:2,Explosions:[{Type:4,Flicker:0,Trail:1,Colors:[I;11743532,2437522,14602026],FadeColors:[I;11743532,2437522,14602026]}]}}}}"), 26);
		Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[type=egg,tag=P1]"), 30);

		
		
		
		
	    new BukkitRunnable() {
	        private int i = 0;
	        
	        	public void run() {
	            if(i >= 100) {
	                cancel();
	            	}
	            	++i;
	            	Bukkit.getScheduler().runTaskLater(Main.instance, () -> Bukkit.dispatchCommand(sender, "execute as @e[tag=P1] at @s anchored eyes run particle end_rod ^ ^ ^5 0.15 0.5 0.4 0.01 30 force"), 0);
	        	}
	    	}.runTaskTimer(Main.instance, 0L, 1L);
		
		}
	}
