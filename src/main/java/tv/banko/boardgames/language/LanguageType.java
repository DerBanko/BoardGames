package tv.banko.boardgames.language;

public enum LanguageType {

    DE_DE("Deutsch", "German"),
    EN_GB("English", "English");

    private final String languageName;
    private final String name;

    LanguageType(String languageName, String name) {
        this.languageName = languageName;
        this.name = name;
    }

    public String getLanguageName() {
        return languageName;
    }

    public String getName() {
        return name;
    }
}
