package com.github.carthax08.morefortune.events;

import com.github.carthax08.morefortune.Morefortune;
import com.github.carthax08.morefortune.util.Util;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;

import java.util.Random;

public class BlockBreakEventHandeler implements Listener {
    Random random;
    public BlockBreakEventHandeler(){
        random = new Random();
    }
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        if(e.getBlock().getType().equals(Material.ANCIENT_DEBRIS)){
            if(Morefortune.getConfigFile().getBoolean("settings.EnableNetherite")){
                ItemStack item = e.getPlayer().getInventory().getItemInMainHand();
                if(item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)){
                    int level = item.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS);
                    Damageable damageable = (Damageable) item.getItemMeta();
                        Util.handleFortune(random, level, e.getPlayer().getWorld(), e.getBlock(), e.getPlayer());
                }
            }
        }else if(e.getBlock().getType().equals(Material.CLAY)){
            if(Morefortune.getConfigFile().getBoolean("settings.EnableClay")){
                ItemStack item = e.getPlayer().getInventory().getItemInMainHand();
                if(item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)){
                    Damageable damageable = (Damageable) item.getItemMeta();
                    int level = item.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS);
                    e.getPlayer().sendMessage(String.valueOf(level));
                        Util.handleFortune(random, level, e.getPlayer().getWorld(), e.getBlock(), e.getPlayer());
                }
            }
        }
    }
}
