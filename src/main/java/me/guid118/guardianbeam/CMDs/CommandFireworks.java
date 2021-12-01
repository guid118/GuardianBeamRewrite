package me.guid118.guardianbeam.CMDs;

import me.guid118.guardianbeam.fireworks.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class CommandFireworks implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(args.length >= 1) {
            if (args[0].equalsIgnoreCase("wall")) {

                Wall.fireworkswall(sender);
            }
            if (args[0].equalsIgnoreCase("ultimate")) {

                if (args[1].equalsIgnoreCase("goaround")) {

                    Ultimate.goaround(sender);

                }
                if (args[1].equalsIgnoreCase("start")) {

                    Ultimate.start(sender);

                }
                if (args[1].equalsIgnoreCase("end")) {

                    Ultimate.end(sender);

                }
                if (args[1].equalsIgnoreCase("topend")) {

                    Wall.upper(sender);

                }
                if (args[1].equalsIgnoreCase("all")) {

                    Ultimate.all(sender, args);

                }
            }
            if (args[0].equalsIgnoreCase("stageflames")) {

                StageFlames.stageflamessnowballs(sender);

            }
            if (args[0].equalsIgnoreCase("smokemachine")) {

                Smoke.smokemachine(sender, args);

            }
            if (args[0].equalsIgnoreCase("sparklers")) {

                Sparklers.sparkler(sender, args);

            }
            if (args[0].equalsIgnoreCase("stageillumination")) {

                StageIllumination.Illumination(sender, args);
            }
            if (args[0].equalsIgnoreCase("whitefireworks")) {

                Endrodthings.summoner(sender);

            }
            if (args[0].equalsIgnoreCase("V")) {

                V.summoner(sender);

            }
            if (args[0].equalsIgnoreCase("star")) {

                Star.summoner(sender);

            }

        } else return false;

        return true;
    }


}
