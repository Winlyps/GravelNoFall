package winlyps.gravelNoFall

import org.bukkit.Material
import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityChangeBlockEvent

class GravelListener(private val plugin: GravelNoFall) : Listener {

    @EventHandler
    fun onEntityChangeBlock(event: EntityChangeBlockEvent) {
        if (event.entityType == EntityType.FALLING_BLOCK) {
            val fallingBlock = event.block.type
            if (fallingBlock == Material.GRAVEL || fallingBlock == Material.SUSPICIOUS_GRAVEL) {
                event.isCancelled = true
            }
        }
    }
}