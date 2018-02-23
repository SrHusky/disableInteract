package pivaboiola;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;

public class JavaBukkit extends JavaPlugin {

    PlayerListener listener = new PlayerListener();

    @Override
    public void onEnable(){
        getLogger().info("O disableInteract foi carregado!");
        getServer().getPluginManager().registerEvents(listener, this);
    }

    @Override
    public void onDisable(){

        getLogger().info("O disableInteract foi descarregado");
    }












}
