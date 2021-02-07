package tv.banko.boardgames.games;

import org.bukkit.command.*;
import tv.banko.boardgames.Main;

import java.util.Arrays;
import java.util.List;

public class GameCommand implements CommandExecutor, TabCompleter {

    private final Game game;

    private final String command;

    private final String usage;
    private final String label;
    private final String description;

    private final String[] aliases;
    private final String permission;

    public GameCommand(Game game, String command, String usage, String label, String description, String[] aliases, String permission) {
        this.game = game;

        this.command = command;
        this.usage = usage;
        this.label = label;
        this.description = description;
        this.aliases = aliases;
        this.permission = permission;

        PluginCommand pluginCommand = Main.getPlugin(Main.class).getCommand(command);

        if (pluginCommand == null) {
            return;
        }

        pluginCommand.setExecutor(this);
        pluginCommand.setTabCompleter(this);

        pluginCommand.setUsage(usage);
        pluginCommand.setLabel(label);
        pluginCommand.setDescription(description);

        pluginCommand.setAliases(Arrays.asList(aliases));
        pluginCommand.setPermission(permission);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }

    public final Game getGame() {
        return game;
    }

    public final String getCommand() {
        return command;
    }

    public final String getUsage() {
        return usage;
    }

    public final String getLabel() {
        return label;
    }

    public final String getDescription() {
        return description;
    }

    public final String[] getAliases() {
        return aliases;
    }

    public final String getPermission() {
        return permission;
    }
}