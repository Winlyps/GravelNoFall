package winlyps.gravelNoFall

import org.bukkit.plugin.java.JavaPlugin

class GravelNoFall : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(GravelListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}