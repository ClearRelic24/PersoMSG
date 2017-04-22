package me.clearrelic24.crplugins;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class crplugins extends JavaPlugin implements Listener{
	
	public void onEnable(){
		System.out.println("CR24 Plugins Démarrer avec succes");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new CommandeCR24(this), this);
		saveDefaultConfig();
		getConfig().options().copyDefaults(true);
	}
	public void onDisable(){
		System.out.println("CR24 Plugins Arrêter avec succes");
	}
}