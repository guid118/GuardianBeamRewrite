package me.guid118.GuardianLaserRewrite.fireworks;

import java.util.concurrent.TimeUnit;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender.Spigot;

public class ultimate {
	


	public static void Wait(){
		try {
			TimeUnit.MILLISECONDS.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void fireworksultimate() {
		ultimate.Wait();
		Bukkit.dispatchCommand(Console, "summon firework_rocket 42 14 -273 {LifeTime:39,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:2,Explosions:[{Type:1,Flicker:0,Trail:1,Colors:[I;11743532,2437522,14602026],FadeColors:[I;11743532,2437522,14602026]}]}}}}");
		
		
		
		
		
	}
	
	
	
	
	
}
