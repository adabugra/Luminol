package me.earthme.luminol.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a region finished its tick task.
 */
public class TickRegionFinishedTickEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final long currTime;
    private final long regionId;

    public TickRegionFinishedTickEvent(long currTime, long regionId) {
        this.currTime = currTime;
        this.regionId = regionId;
    }

    /**
     * Get the time of tick end
     * @return The time of tick end in nanoseconds
     */
    public long getFinishedTime() {
        return this.currTime;
    }

    /**
     * Get the id of current region
     * Notice: The id of global region is -1 in this event
     * @return The id of current region
     */
    public long getRegionId() {
        return this.regionId;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
}
