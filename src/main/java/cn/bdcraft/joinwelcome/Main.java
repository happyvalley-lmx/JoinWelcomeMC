package cn.bdcraft.joinwelcome;

import cn.bdcraft.joinwelcome.commands.JoinWelcome;
import cn.bdcraft.joinwelcome.listeners.Welcome;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author happyvalley.video
 */
public final class Main extends JavaPlugin {

    public static JavaPlugin plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        Bukkit.getServer().getConsoleSender().sendMessage("[玩家欢迎插件]"+ChatColor.GREEN+"已成功加载");
        Bukkit.getServer().getPluginManager().registerEvents(new Welcome(),this);
        Bukkit.getPluginCommand("joinwelcome").setExecutor(new JoinWelcome());
        // "joinwelcome"为命令，joinwelcome()为方法
        saveDefaultConfig();
        //保存默认配置文件

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getServer().getConsoleSender().sendMessage("[玩家欢迎插件]"+ ChatColor.RED+"已成功卸载");
    }
}
