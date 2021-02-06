package tv.banko.boardgames.games;

import org.bukkit.event.Listener;

public class GameListener implements Listener {

    private final Game game;

    public GameListener(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }
}