package me.guid118.GuardianLaserRewrite;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		
		this.getCommand("laserset").setExecutor(new Commandlaserset());
		this.getCommand("laserstop").setExecutor(new Commandlaserstop());
		
		
		
	}
	
	
	
	
	
	
}
