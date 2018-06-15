package nl.luchtgames.noboats

import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.vehicle.VehicleEnterEvent
import org.bukkit.plugin.java.JavaPlugin

class NoBoats : JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(object : Listener {
            @EventHandler(ignoreCancelled = true)
            fun onVehicleEnter(e: VehicleEnterEvent) {
                if(e.vehicle.type == EntityType.BOAT && e.entered.type == EntityType.PLAYER) e.isCancelled = true
            }
        }, this)
    }
}