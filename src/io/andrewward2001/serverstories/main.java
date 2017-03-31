package io.andrewward2001.serverstories;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		this.saveDefaultConfig();
		getConfig().options().copyDefaults(true);
		saveConfig();
		getLogger().info("ServerStories 1.3 loaded.");
	}
	
	@Override
	public void onDisable(){
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player){
			if (cmd.getName().equalsIgnoreCase("serverstory")) {
				if (getConfig().getBoolean("showservername"))
					sender.sendMessage(ChatColor.GREEN + "-----==========" + ChatColor.GOLD + getConfig().getString("servername") + ChatColor.GREEN + "==========-----");
				sender.sendMessage(ChatColor.GOLD + getConfig().getString("Story"));
			}
		} else { sender.sendMessage(ChatColor.RED + "You must be a player to do that!"); }
		return false; //return statement for boolean
	}
}
