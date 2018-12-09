package mc.alk.battlescoreboardapi.scoreboard.bukkit.compat;

import org.bukkit.OfflinePlayer;

import java.util.UUID;

public interface IPlayerHelper {

    UUID getID(OfflinePlayer player);

    UUID getID(String name);
}
