package de.eintosti.buildsystem.api.settings;

/**
 * @author einTosti
 */
public interface Settings {
    NavigatorType getNavigatorType();

    void setNavigatorType(NavigatorType navigatorType);

    Colour getGlassColor();

    void setGlassColor(Colour glassColor);

    WorldSort getWorldSort();

    void setWorldSort(WorldSort worldSort);

    boolean isSlabBreaking();

    void setSlabBreaking(boolean enabled);

    boolean isNoClip();

    void setNoClip(boolean enabled);

    boolean isTrapDoor();

    void setTrapDoor(boolean enabled);

    boolean isNightVision();

    void setNightVision(boolean enabled);

    boolean isScoreboard();

    void setScoreboard(boolean enabled);

    boolean isDisableInteract();

    void setDisableInteract(boolean enabled);

    boolean isSpawnTeleport();

    void setSpawnTeleport(boolean enabled);

    boolean isClearInventory();

    void setClearInventory(boolean enabled);

    boolean isInstantPlaceSigns();

    void setInstantPlaceSigns(boolean enabled);

    boolean isHidePlayers();

    void setHidePlayers(boolean enabled);

    boolean isPlacePlants();

    void setPlacePlants(boolean enabled);
}
