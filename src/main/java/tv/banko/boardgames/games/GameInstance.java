package tv.banko.boardgames.games;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GameInstance {

    private final Game game;

    private final List<UUID> players;

    public GameInstance(Game game) {
        this.game = game;
        this.players = new ArrayList<>();
    }

    public Game getGame() {
        return game;
    }

    public void addPlayer(Player player) {
        addPlayer(player.getUniqueId());
    }

    public void addPlayer(UUID uuid) {
        if(players.contains(uuid)) {
            return;
        }

        players.add(uuid);
    }

    public void removePlayer(Player player) {
        removePlayer(player.getUniqueId());
    }

    public void removePlayer(UUID uuid) {
        players.remove(uuid);
    }

    public boolean isPlayer(Player player) {
        return isPlayer(player.getUniqueId());
    }

    public boolean isPlayer(UUID uuid) {
        return players.contains(uuid);
    }

    public List<UUID> getPlayers() {
        return players;
    }
}