package me.guid118.GuardianLaserRewrite;




import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


import me.guid118.GuardianLaserRewrite.fireworks.CMDTabCompletion;
import me.guid118.GuardianLaserRewrite.fireworks.CommandFireworks;

public class Main extends JavaPlugin{
	
	public static Plugin instance;
	
	
	
	public void onEnable() {
		
		
		this.getCommand("laserset").setExecutor(new Commandlaserset());
		this.getCommand("laserstop").setExecutor(new Commandlaserstop());
		this.getCommand("fireworks").setExecutor(new CommandFireworks());
		this.getCommand("fireworks").setTabCompleter(new CMDTabCompletion());		
		//this.saveDefaultConfig();
	}
	public void onDisable() {
		
		
		
	}
	

	
}
