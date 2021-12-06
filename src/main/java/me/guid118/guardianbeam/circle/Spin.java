package me.guid118.guardianbeam.circle;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public class Spin {

    static Boolean spin;

    public static void spintoggle(CommandSender sender){

        if (Boolean.FALSE.equals(spin)) {boolean spin = true;}
        if (Boolean.TRUE.equals(spin)) {boolean spin = false;}

        sender.sendMessage("Spinning of armor_stands was set to " + spin);


    {
        for (Boolean.TRUE.equals(spin); Boolean.TRUE.equals(spin);) {

            Bukkit.dispatchCommand(sender, "execute as @e[tag=C1] at @s anchored eyes run tp @e[tag=C1A7] ^5 ^3 ^");
            Bukkit.dispatchCommand(sender, "execute as @e[tag=C1] at @s anchored eyes run tp @e[tag=C1A6] ^ ^3 ^-5");
            Bukkit.dispatchCommand(sender, "execute as @e[tag=C1] at @s anchored eyes run tp @e[tag=C1A8] ^-5 ^3 ^");
            Bukkit.dispatchCommand(sender, "execute as @e[tag=C1] at @s anchored eyes run tp @e[tag=C1A5] ^ ^3 ^5");
            Bukkit.dispatchCommand(sender, "execute as @e[tag=C1] at @s anchored eyes run tp @e[tag=C1A4] ^-5 ^ ^");
            Bukkit.dispatchCommand(sender, "execute as @e[tag=C1] at @s anchored eyes run tp @e[tag=C1A1] ^ ^ ^5");
            Bukkit.dispatchCommand(sender, "execute as @e[tag=C1] at @s anchored eyes run tp @e[tag=C1A3] ^5 ^ ^");
            Bukkit.dispatchCommand(sender, "execute as @e[tag=C1] at @s anchored eyes run tp @e[tag=C1A2] ^ ^ ^-5");

        //TODO make this shit work
        }
    }
}
}
