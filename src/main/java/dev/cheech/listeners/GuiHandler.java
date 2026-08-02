package dev.cheech.listeners;

import dev.cheech.binders.BinderInventoryHolder;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiHandler implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getInventory().getHolder() instanceof BinderInventoryHolder && event.getCurrentItem() != null){
            event.setCancelled(event.getCurrentItem().getType() != Material.PAPER);
        }
    }
}
