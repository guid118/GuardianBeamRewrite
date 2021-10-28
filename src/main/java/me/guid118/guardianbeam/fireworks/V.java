package me.guid118.guardianbeam.fireworks;

import me.guid118.guardianbeam.Guardianbeam;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;


public class V {


    public static void summoner(CommandSender sender) {

        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon firework_rocket 9 13 -273 {LifeTime:40,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:2,Explosions:[{Type:4,Flicker:0,Trail:1,Colors:[I;11743532,2437522,14602026],FadeColors:[I;11743532,2437522,14602026]}]}}}}"), 2);
        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon firework_rocket 9 13 -273 {LifeTime:50,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:2,Explosions:[{Type:1,Flicker:0,Trail:1,Colors:[I;11743532,2437522,14602026],FadeColors:[I;11743532,2437522,14602026]}]}}}}"), 6);

        Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "kill @e[tag=v]"), 30);


        new BukkitRunnable() {
            private int i = 0;

            public void run() {
                if(i >= 3) {
                    cancel();
                }
                ++i;

                Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 37 29.5 -267 {Motion:[-1.2,1.0,0.0],Tags:['v']}"), 0);
                Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 37 29.5 -267 {Motion:[-1.6,1.4,0.0],Tags:['v']}"), 0);
                Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 37 29.5 -267 {Motion:[-1.3,1.1,0.0],Tags:['v']}"), 0);
                Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 37 29.5 -267 {Motion:[-1.5,1.3,0.0],Tags:['v']}"), 0);
                Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball 37 29.5 -267 {Motion:[-1.4,1.2,0.0],Tags:['v']}"), 0);

                Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball -19 29.5 -267 {Motion:[1.4,1.2,0.0],Tags:['v']}"), 0);
                Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball -19 29.5 -267 {Motion:[1.3,1.1,0.0],Tags:['v']}"), 0);
                Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball -19 29.5 -267 {Motion:[1.5,1.3,0.0],Tags:['v']}"), 0);
                Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball -19 29.5 -267 {Motion:[1.6,1.4,0.0],Tags:['v']}"), 0);
                Bukkit.getScheduler().runTaskLater(Guardianbeam.instance, () -> Bukkit.dispatchCommand(sender, "summon snowball -19 29.5 -267 {Motion:[1.2,1.0,0.0],Tags:['v']}"), 0);


            }
        }.runTaskTimer(Guardianbeam.instance, 0L, 1L);



    }
}
