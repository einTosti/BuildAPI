package de.eintosti.buildsystem.api.world;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.UUID;

/**
 * @author einTosti
 */
public interface BuildWorld {
    String getName();

    void setName(String name);

    String getCreator();

    void setCreator(String creator);

    UUID getCreatorId();

    void setCreatorId(UUID creatorId);

    WorldType getType();

    boolean isPrivate();

    void setPrivate(boolean enabled);

    Material getMaterial();

    void setMaterial(Material material);

    WorldStatus getStatus();

    void setStatus(WorldStatus worldStatus);

    String getProject();

    void setProject(String project);

    String getPermission();

    void setPermission(String permission);

    long getCreationDate();

    boolean isPhysics();

    void setPhysics(boolean enabled);

    boolean isExplosions();

    void setExplosions(boolean enabled);

    boolean isMobAI();

    void setMobAI(boolean enabled);

    String getCustomSpawn();

    void setCustomSpawn(Location location);

    boolean isBlockBreaking();

    void setBlockBreaking(boolean enabled);

    boolean isBlockPlacement();

    void setBlockPlacement(boolean enabled);

    boolean isBlockInteractions();

    void setBlockInteractions(boolean blockInteractions);

    boolean isBuilders();

    ArrayList<Builder> getBuilders();

    void setBuilders(boolean enabled);

    ArrayList<String> getBuilderNames();

    Builder getBuilder(UUID uuid);

    boolean isBuilder(UUID uuid);

    boolean isBuilder(Player player);

    void addBuilder(Builder builder);

    void removeBuilder(Builder builder);

    void removeBuilder(UUID uuid);

    boolean isLoaded();
}
