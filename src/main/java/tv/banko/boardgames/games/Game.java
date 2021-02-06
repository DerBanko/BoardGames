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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    public String getAuthor() {
        return author;
    }

    public void addInstance(GameInstance instance) {
        if(instances.contains(instance)) {
            return;
        }

        instances.add(instance);
    }

    public void removeInstance(GameInstance instance) {
        instances.remove(instance);
    }

    public List<GameInstance> getInstances() {
        return instances;
    }

    public void addCommand(GameCommand command) {
        commands.put(command.getCommand(), command);
    }

    public Map<String, GameCommand> getCommands() {
        return commands;
    }

    public void addListener(GameListener listener) {
        listeners.add(listener);
    }

    public List<GameListener> getListeners() {
        return listeners;
    }
}