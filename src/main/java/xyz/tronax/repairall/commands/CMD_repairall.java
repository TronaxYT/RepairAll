package xyz.tronax.repairall.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.tronax.repairall.RepairAll;

public class CMD_repairall implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(RepairAll.prefix + "§cYou are not a player!");
        } else {
            Player p = (Player) sender;

            ItemStack[] items = p.getInventory().getContents();
            ItemStack[] armor = p.getInventory().getArmorContents();

            for(int i = 0; i < items.length; i++) {
                ItemStack e = items[i];
                if(e != null) {
                    ItemMeta me = e.getItemMeta();
                    Damageable mee = (Damageable) me;
                    mee.setDamage(0);
                    e.setItemMeta(mee);
                }else{

                }
            }
            for(int i = 0; i < armor.length; i++) {
                ItemStack a = armor[i];
                if(a != null) {
                    ItemMeta ae = a.getItemMeta();
                    Damageable aee = (Damageable) ae;
                    aee.setDamage(0);
                    a.setItemMeta(aee);
                } else {

                }

            }

            p.sendMessage(RepairAll.prefix + "§aAll your items have been repaired!");
            Bukkit.getConsoleSender().sendMessage(RepairAll.prefix + "§4" +  p.getName().toString() + " §ahas repaired all his items!");

        }

        return false;
    }
}
