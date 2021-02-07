package tv.banko.boardgames.games;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Game {

    private final String name;
    private final String description;
    private final String version;
    private final String author;

    private final List<GameInstance> instances;
    private final Map<String, GameCommand> commands;
    private final List<GameListener> listeners;

    public Game(String name, String description, String version, String author) {
        this.name = name;
        this.description = description;
        this.version = version;
        this.author = author;

        this.instances = new ArrayList<>();
        this.commands = new HashMap<>();
        this.listeners = new ArrayList<>();
    }

    public final String getName() {
        return name;
    }

    public final String getDescription() {
        return description;
    }

    public final String getVersion() {
        return version;
    }

    public final String getAuthor() {
        return author;
    }

    public final void addInstance(GameInstance instance) {
        if(instances.contains(instance)) {
            return;
        }

        instances.add(instance);
    }

    public final void removeInstance(GameInstance instance) {
        instances.remove(instance);
    }

    public final List<GameInstance> getInstances() {
        return instances;
    }

    public final void addCommand(GameCommand command) {
        commands.put(command.getCommand(), command);
    }

    public final Map<String, GameCommand> getCommands() {
        return commands;
    }

    public final void addListener(GameListener listener) {
        listeners.add(listener);
    }

    public final List<GameListener> getListeners() {
        return listeners;
    }
}