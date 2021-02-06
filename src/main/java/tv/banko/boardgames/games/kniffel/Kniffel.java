package tv.banko.boardgames.games.kniffel;

import tv.banko.boardgames.games.Game;

public class Kniffel extends Game {

    private final Dice dice;

    public Kniffel() {
        super("Kniffel", "-", "1.0-SNAPSHOT", "DerBanko");

        dice = new Dice();
    }

    public Dice getDice() {
        return dice;
    }
}