package me.daniramos.dmzplaceholders;

import me.clip.placeholderapi.PlaceholderAPIPlugin;
import me.daniramos.dmzplaceholders.expansion.DMZExpansion;
import org.bukkit.plugin.java.JavaPlugin;

public final class DMZPlaceholders extends JavaPlugin {

    private static DMZPlaceholders instance;

    @Override
    public void onEnable() {

        instance = this;

        if (getServer().getPluginManager().getPlugin("PlaceholderAPI") == null) {
            getLogger().severe("PlaceholderAPI no encontrado.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        new DMZExpansion(this).register();

        getLogger().info("DMZPlaceholders habilitado correctamente.");
    }

    @Override
    public void onDisable() {

    }

    public static DMZPlaceholders getInstance() {
        return instance;
    }

}
