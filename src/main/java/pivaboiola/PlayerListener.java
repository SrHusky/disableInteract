package pivaboiola;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerListener implements Listener {


    @EventHandler(priority = EventPriority.LOW)
    public void quandoAbirBau(PlayerInteractEvent event) {
        if (event.getAction() != Action.RIGHT_CLICK_BLOCK) {
            return;
        }

        if (event.getClickedBlock().getType() == Material.CHEST || event.getClickedBlock().getType() == Material.TRAPPED_CHEST);
            event.setCancelled(true);
           // event.getPlayer().sendMessage(ChatColor.DARK_RED + "Creio que não possa interagir com isso"); i

    }


}
