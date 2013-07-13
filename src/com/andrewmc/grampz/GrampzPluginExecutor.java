package com.andrewmc.grampz;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GrampzPluginExecutor implements CommandExecutor {
	
	public GrampzPluginExecutor(main main) {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("satisfy")){
				if (args.length > 1){
					player.sendMessage("Too many arguments! Use command like this:" + ChatColor.GREEN + "/satisfy or /satisfy [player]");
				} else {
					if (args.length == 0){
						player.setHealth(20);
					} else {
						if (args.length == 1) {
							Player targetPlayer = player.getServer().getPlayer(args [0]);
							targetPlayer.setHealth(20);
						}
					}
				}
			}
		} else {
			sender.sendMessage("You must be a player to do that!");
			return false;
		}
		return false;
	}
}
