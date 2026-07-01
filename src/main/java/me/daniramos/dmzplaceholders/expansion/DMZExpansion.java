package me.daniramos.dmzplaceholders.expansion;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.daniramos.dmzplaceholders.DMZPlaceholders;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DMZExpansion extends PlaceholderExpansion {

    private final DMZPlaceholders plugin;

    public DMZExpansion(DMZPlaceholders plugin){
        this.plugin = plugin;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "dmz";
    }

    @Override
    public @NotNull String getAuthor() {
        return "DaniRamos";
    }

    @Override
    public @NotNull String getVersion() {
        return plugin.getDescription().getVersion();
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public String onPlaceholderRequest(Player player, @NotNull String params) {

        if(player == null)
            return "";

        switch (params.toLowerCase()) {

            case "level":
                return "0";

            case "tps":
                return "0";

            case "race":
                return "Unknown";

        }

        return null;
    }

}
