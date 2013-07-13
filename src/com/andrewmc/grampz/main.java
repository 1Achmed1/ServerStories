package com.andrewmc.grampz;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		getCommand("satisfy").setExecutor(new GrampzPluginExecutor(this));
		this.saveDefaultConfig();
		getConfig().options().copyDefaults(true);
		saveConfig();
		getLogger().info("Grampz is starting up!");
		getLogger().info("_____-----======GRAMPZ======-----_____");
		getLogger().info("Bringing server awesomeness through the roof...");
		getLogger().info("7%... Starting fuel flow...");
		getLogger().info("18%... Lighting fuel...");
		getLogger().info("31%... Fuel lit... Starting Blast Off!");
		getLogger().info("53%... Increasing fuel flow...");
		getLogger().info("62%... 5... Getting Config file");
		getLogger().info("74%... 3... Reading Config file");
		getLogger().info("99%... 2!!!");
		getLogger().info("100%! BLAST OFF!");
		getLogger().info("Hole in roof generated. Ready to allow players on.");
		
	}
	
	@Override
	public void onDisable(){
		getLogger().warning("DISABLING GRAMPZ!");
		getLogger().warning("SERVER AWESOMENESS IS ABOUT TO GO DOWN THE DRAIN!");
		getLogger().warning("**POWER DOWN SFX**");
		getLogger().severe("GRAMPZ IS SHUT DOWN! SERVER IS NO LONGER AWESOME!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player){
			if (cmd.getName().equalsIgnoreCase("serverstory")) {
				if (getConfig().getBoolean("showservername") == true) {
					sender.sendMessage(ChatColor.GREEN + "-----==========" + ChatColor.GOLD + getConfig().getString("servername") + ChatColor.GREEN + "==========-----");
					sender.sendMessage(ChatColor.GOLD + getConfig().getString("Story"));
				} if (getConfig().getBoolean("showservername") == false) {
					sender.sendMessage(ChatColor.GOLD + getConfig().getString("Story"));
				}
			}
		} else { sender.sendMessage(ChatColor.RED + "You must be a player to do that!"); }
		return false; //return statement for boolean
	}
}
