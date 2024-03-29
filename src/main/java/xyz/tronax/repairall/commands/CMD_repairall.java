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
            if(args.length == 0) {
                sender.sendMessage(RepairAll.prefix + "§cYou are not a player! Please provide a player name!");
            } else if(args.length == 1) {
                Player t = Bukkit.getPlayer(args[0]);
                if(t == null) {
                    sender.sendMessage(RepairAll.prefix + "§4" + args[0] + " §cis not online!");
                } else {
                    Player p = (Player) sender;
                    ItemStack[] items = t.getInventory().getContents();
                    ItemStack[] armor = t.getInventory().getArmorContents();
                    for(int i = 0; i < items.length; i++) {
                        ItemStack e = items[i];
                        if(e != null) {
                            ItemMeta me = e.getItemMeta();
                            Damageable mee = (Damageable) me;
                            mee.setDamage(0);
                            e.setItemMeta(mee);
                        }else{}
                    }
                    for(int i = 0; i < armor.length; i++) {
                        ItemStack a = armor[i];
                        if(a != null) {
                            ItemMeta ae = a.getItemMeta();
                            Damageable aee = (Damageable) ae;
                            aee.setDamage(0);
                            a.setItemMeta(aee);
                        } else {}
                    }
                    p.sendMessage(RepairAll.prefix + "§aThe items of §e" + t.getName() + " §ahave been repaired!");
                    Bukkit.getConsoleSender().sendMessage(RepairAll.prefix + "§4" +  p.getName().toString() + " §arepaired the items of §e" + t.getName());
                    t.sendMessage(RepairAll.prefix + "§aYour items were repaired!");
                }
            } else {
                sender.sendMessage(RepairAll.prefix + "§cToo many arguments!");
            }
        } else {
            if(args.length == 0) {
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
                    }else{}
                }
                for(int i = 0; i < armor.length; i++) {
                    ItemStack a = armor[i];
                    if(a != null) {
                        ItemMeta ae = a.getItemMeta();
                        Damageable aee = (Damageable) ae;
                        aee.setDamage(0);
                        a.setItemMeta(aee);
                    } else {}
                }
                p.sendMessage(RepairAll.prefix + "§aYour items were repaired!");
                Bukkit.getConsoleSender().sendMessage(RepairAll.prefix + "§4" +  p.getName().toString() + " §ahas repaired all his items!");
            } else if(args.length == 1) {
                Player t = Bukkit.getPlayer(args[0]);
                if(t == null) {
                    sender.sendMessage(RepairAll.prefix + "§4" + args[0] + " §cis not online!");
                } else {
                    Player p = (Player) sender;
                    ItemStack[] items = t.getInventory().getContents();
                    ItemStack[] armor = t.getInventory().getArmorContents();
                    for(int i = 0; i < items.length; i++) {
                        ItemStack e = items[i];
                        if(e != null) {
                            ItemMeta me = e.getItemMeta();
                            Damageable mee = (Damageable) me;
                            mee.setDamage(0);
                            e.setItemMeta(mee);
                        }else{}
                    }
                    for(int i = 0; i < armor.length; i++) {
                        ItemStack a = armor[i];
                        if(a != null) {
                            ItemMeta ae = a.getItemMeta();
                            Damageable aee = (Damageable) ae;
                            aee.setDamage(0);
                            a.setItemMeta(aee);
                        } else {}
                    }
                    p.sendMessage(RepairAll.prefix + "§aThe items of §e" + t.getName() + " §ahave been repaired!");
                    Bukkit.getConsoleSender().sendMessage(RepairAll.prefix + "§4" +  p.getName().toString() + " §arepaired the items of §e" + t.getName());
                    t.sendMessage(RepairAll.prefix + "§aYour items were repaired!");
                }
            } else {
                sender.sendMessage(RepairAll.prefix + "§cToo many arguments!");
            }



        }

        return false;
    }
}
