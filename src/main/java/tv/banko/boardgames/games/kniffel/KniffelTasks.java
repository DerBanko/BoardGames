package tv.banko.boardgames.games.kniffel;

public enum KniffelTasks {

    GATHER_ONE("Sammle Einsen", "Nur Einsen zählen", new int[] { 1 }, -1),
    GATHER_TWO("Sammle Zweien", "Nur Zweien zählen", new int[] { 2 }, -1),
    GATHER_THREE("Sammle Dreien", "Nur Dreien zählen", new int[] { 3 }, -1),
    GATHER_FOUR("Sammle Vieren", "Nur Vieren zählen", new int[] { 4 }, -1),
    GATHER_FIVE("Sammle Fünfen", "Nur Fünfen zählen", new int[] { 5 }, -1),
    GATHER_SIX("Sammle Sechsen", "Nur Sechsen zählen", new int[] { 6 }, -1),

    THREE_OF_A_KIND("Dreierpasch", "3 Gleiche benötigt, alle Augen zählen", new int[] { 1, 2, 3, 4, 5, 6 }, 0),
    FOUR_OF_A_KIND("Viererpasch", "4 Gleiche benötigt, alle Augen zählen", new int[] { 1, 2, 3, 4, 5, 6 }, 0),
    FULL_HOUSE("Full House", "1x 2 Gleiche benötigt und 1x 3 Gleiche benötigt", new int[] { 1, 2, 3, 4, 5, 6 }, 25),
    SMALL_STREET("Kleine Straße", "4 Zahlen in einer Reihe benötigt", new int[] { 1, 2, 3, 4, 5, 6 }, 30),
    BIG_STREET("Große Straße", "5 Zahlen in einer Reihe benötigt", new int[] { 1, 2, 3, 4, 5, 6 }, 40),
    KNIFFEL("Kniffel", "5 Gleiche", new int[] { 1, 2, 3, 4, 5, 6 }, 50);

    private final String name;
    private final String description;
    private final int[] dices;
    private final int points;

    KniffelTasks(String name, String description, int[] dices, int points) {
        this.name = name;
        this.description = description;
        this.dices = dices;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int[] getDices() {
        return dices;
    }

    public int getPoints() {
        return points;
    }
}
