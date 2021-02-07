package tv.banko.boardgames;

import org.bukkit.plugin.java.JavaPlugin;
import tv.banko.boardgames.language.LanguageType;

public final class Main extends JavaPlugin {

    private static LanguageType language;

    @Override
    public void onLoad() {
        language = LanguageType.DE_DE;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static LanguageType getLanguage() {
        return language;
    }
}
