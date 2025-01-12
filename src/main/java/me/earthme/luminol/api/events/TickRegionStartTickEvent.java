package me.earthme.luminol.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a tick was started.
 */
public class TickRegionStartTickEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final long currTime;
    private final long regionId;

    public TickRegionStartTickEvent(long currTime, long regionId) {
        this.currTime = currTime;
        this.regionId = regionId;
    }

    /**
     * Get the id of current region
     * Notice: The id of global region is -1 in this event
     * @return The id of current region
     */
    public long getRegionId() {
        return this.regionId;
    }

    /**
     * Get the time of tick start
     * @return The time of tick start in nanoseconds
     */
    public long getStartTime(){
        return this.currTime;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
}
