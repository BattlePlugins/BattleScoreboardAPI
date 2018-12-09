package mc.alk.battlescoreboardapi.scoreboard.bukkit.compat;

import mc.alk.battlescoreboardapi.api.STeam;
import org.bukkit.scoreboard.Objective;

/**
 * @author alkarin
 */
public interface IScoreboardHandler {

    public static final IScoreboardHandler BLANK_HANDLER = new IScoreboardHandler() {

        @Override
        public void setDisplayName(Objective o, STeam team, String display) {
            /* do nothing */
        }
    };

    void setDisplayName(Objective o, STeam team, String display);
}
