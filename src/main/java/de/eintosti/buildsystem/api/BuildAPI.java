package de.eintosti.buildsystem.api;

import de.eintosti.buildsystem.api.settings.Settings;
import de.eintosti.buildsystem.api.world.BuildWorld;

import java.util.List;
import java.util.UUID;

public interface BuildAPI {

    List<BuildWorld> getWorlds();

    BuildWorld getWorld(String name);

    Settings getSettings(UUID uuid);
}
