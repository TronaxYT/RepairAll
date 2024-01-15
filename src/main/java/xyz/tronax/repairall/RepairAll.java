package xyz.tronax.repairall;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.tronax.repairall.commands.CMD_repairall;

public final class RepairAll extends JavaPlugin {

    public static String prefix = "§cRepair§7All §8| ";

    @Override
    public void onEnable() {
        // Plugin startup logic
        cmdmsg(prefix + " §aPlugin started successfully!");

        registerCmd("repairall", new CMD_repairall());

    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
        cmdmsg(prefix + " §cPlugin stopped successfully!");
    }


    public void cmdmsg(String msg) {
        Bukkit.getConsoleSender().sendMessage(msg);
    }


    private void registerCmd(String CommandName, CommandExecutor CommandClass) {
        getCommand(CommandName).setExecutor(CommandClass);
    }
}
