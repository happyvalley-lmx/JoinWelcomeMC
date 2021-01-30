package cn.bdcraft.joinwelcome.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JoinWelcome implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("joinwelcome.general")){
                p.sendMessage(ChatColor.GREEN + p.getName() + " 欢迎使用JoinWelcome插件");
                p.sendMessage("/joinwelcome reload —— 重新加载配置文件(在写了)");
                return true;
            } else {
                p.sendMessage("你没有权限运行这个命令");
                return true;
            }
        } else {
            sender.sendMessage("只有玩家才能使用该命令");
        }
        return true;
    }
}
