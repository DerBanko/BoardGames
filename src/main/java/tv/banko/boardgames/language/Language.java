package tv.banko.boardgames.language;

import tv.banko.boardgames.Main;

public enum Language {

    CHOSEN("Chosen", "Ausgewählt"),
    CHOSEN_DICE_EXPLANATION("This dice will not be rolled again", "Dieser Würfel wird nicht neu gewürfelt"),
    DICE_IMPACT_ON_RATING("This dice has an impact on the raiting", "Dieser Würfel zählt in die Wertung");

    private final String enGB;
    private final String deDE;

    Language(String enGB, String deDE) {
        this.enGB = enGB;
        this.deDE = deDE;
    }

    @Override
    public String toString() {
        switch (Main.getLanguage()) {
            case DE_DE:
                return deDE;
            case EN_GB:
                return enGB;
            default:
                System.out.println("[Language] Could not find content for " + Main.getLanguage().name());
                return enGB;
        }
    }
}
