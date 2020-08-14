package de.eintosti.buildsystem.api.event;

import de.eintosti.buildsystem.api.world.BuildWorld;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author einTosti
 */
public class BuildWorldCreateEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final BuildWorld world;

    public BuildWorldCreateEvent(Player player, BuildWorld world) {
        this.player = player;
        this.world = world;
    }

    /**
     * @return the player who created the de.eintosti.buildsystem.api.world
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return the {@link BuildWorld} which was created
     */
    public BuildWorld getWorld() {
        return world;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
