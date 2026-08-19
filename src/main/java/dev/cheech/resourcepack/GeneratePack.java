package dev.cheech.resourcepack;

import dev.cheech.MineCards;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class GeneratePack {
    private final static JavaPlugin pluginObj = MineCards.getPluginObj();

    public static void init(){
        File folder = new File(String.valueOf(pluginObj.getConfig()) + "/resourcepack");
        if (folder.exists()) {
            folder.delete();
        }
        pluginObj.saveResource("resourcepack/pack.mcmeta", false);
    }
}
