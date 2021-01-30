package cn.bdcraft.joinwelcome.listeners;

import cn.bdcraft.joinwelcome.Main;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Welcome implements Listener {
    @EventHandler
    public void welcome(PlayerJoinEvent event){
        String keyTitle = "Settings.Title";
        String keySubtitle = "Settings.SubTitle";
        String keyFade = "Settings.Fade";
        String keyStay = "Settings.Stay";
        String title,subTitle;
        Integer fade,stay;
        title = Main.plugin.getConfig().getString(keyTitle);
        subTitle = Main.plugin.getConfig().getString(keySubtitle);
        fade = Main.plugin.getConfig().getInt(keyFade);
        stay = Main.plugin.getConfig().getInt(keyStay);
        event.getPlayer().sendTitle(ChatColor.translateAlternateColorCodes('&',title),event.getPlayer().getName()+", "+ChatColor.translateAlternateColorCodes('&',subTitle),fade,stay,fade);
    }
}
