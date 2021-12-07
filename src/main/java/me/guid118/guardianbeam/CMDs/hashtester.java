package me.guid118.guardianbeam.CMDs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;

public class hashtester implements CommandExecutor {

    HashMap<Integer, String> UUIDs = new HashMap<>();


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //code to run when first argument is "clear"
        if (args[0].equalsIgnoreCase("clear")) {
            if (args[1].equalsIgnoreCase("all")) {
                UUIDs.clear();
            } else {
                try {
                    int key = Integer.parseInt(args[1]);
                } catch (NumberFormatException ex) {
                    sender.sendMessage("that didn't work! " + ex);
                    ex.printStackTrace();
                    return true;
                }


            }
            int key = Integer.parseInt(args[1]);
            UUIDs.remove(key);
            sender.sendMessage("removed all values from " + key);


            return true;
        }
        //test if value of second argument is a number
        try {
            Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {e.printStackTrace();}


            //code to run when first argument is "put"
            if (args[0].equalsIgnoreCase("put")) {
                int key = Integer.parseInt(args[1]);
                if (UUIDs.get(key) == null || args[3].equalsIgnoreCase("overwrite")) {
                    UUIDs.put(key, args[2]);
                    sender.sendMessage("put " + args[2] + " at " + key);
                } else {
                    sender.sendMessage("the " + args[2] + " could not be put at " + key + "because that location is already in use");
                }
                return true;
            }
            //code to run when first argument is "get"
            if (args[0].equalsIgnoreCase("get")) {
                int key = Integer.parseInt(args[1]);
                String result = UUIDs.get(key);
                if (result == null) {
                    sender.sendMessage("location " + key + " is currently not in use!");
                } else {
                    sender.sendMessage("asked for " + key + " and got " + result);
                }
                return true;
            }

        return true;
    }
}