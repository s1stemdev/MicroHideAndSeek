package org.systemdev.microHideAndSeek.config;

import org.bukkit.plugin.java.JavaPlugin;
import org.systemdev.microHideAndSeek.MicroHideAndSeek;

public abstract class Configurable {

    public MicroHideAndSeek getPlugin() {
        return JavaPlugin.getPlugin(MicroHideAndSeek.class);
    }

    protected abstract String getName();
}
