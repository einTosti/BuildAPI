package de.eintosti.buildsystem.api.world;

import java.util.UUID;

/**
 * @author einTosti
 */
public interface Builder {
    UUID getUuid();

    void setUuid(UUID uuid);

    String getName();

    void setName(String name);
}
