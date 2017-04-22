package me.clearrelic24.crplugins;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandeCR24 implements Listener {

	public crplugins pl;

	public CommandeCR24(crplugins pl) {
		this.pl = pl;
	}
	
	@EventHandler
	public void onCommandes(PlayerCommandPreprocessEvent e){
		
		Player p = e.getPlayer();
		String msg = e.getMessage();
		String[] args = msg.split(" ");
		
		
		if(args[0].equalsIgnoreCase("/Forum")){
			if (p.hasPermission("PersoMSG.Forum")){
			java.lang.String monmsg = this.pl.getConfig().getString("Forum");
		
			p.sendMessage(monmsg);
			}else{
			p.sendMessage(ChatColor.RED+"Accès Interdit Vous n'avez pas la permission");
			}
			e.setCancelled(true);
		}
		if(args[0].equalsIgnoreCase("/mdj")){
			if (p.hasPermission("PersoMSG.mdj")){
			java.lang.String monmsg = this.pl.getConfig().getString("motdujour");
		
			p.sendMessage(monmsg);
			}else{
			p.sendMessage(ChatColor.RED+"Accès Interdit Vous n'avez pas la permission");
			}
			e.setCancelled(true);
		}
		if(args[0].equalsIgnoreCase("/Youtube")){
			if (p.hasPermission("PersoMSG.YTB")){
			java.lang.String monmsg = this.pl.getConfig().getString("YTB");
		
			p.sendMessage(monmsg);
			}else{
			p.sendMessage(ChatColor.RED+"Accès Interdit Vous n'avez pas la permission");
			}
			e.setCancelled(true);
		}
		if(args[0].equalsIgnoreCase("/WebSite")){
			if (p.hasPermission("PersoMSG.website")){
			java.lang.String monmsg = this.pl.getConfig().getString("Website");
		
			p.sendMessage(monmsg);
			}else{
			p.sendMessage(ChatColor.RED+"Accès Interdit Vous n'avez pas la permission");
			}
			e.setCancelled(true);
		}
		if(args[0].equalsIgnoreCase("/Map")){
			if (p.hasPermission("PersoMSG.map")){
			java.lang.String monmsg = this.pl.getConfig().getString("map").replace("&", "§");
		
			p.sendMessage(monmsg);
			}else{
			p.sendMessage(ChatColor.RED+"Accès Interdit Vous n'avez pas la permission");
			}
			e.setCancelled(true);
		}
		
			
	}

	
}