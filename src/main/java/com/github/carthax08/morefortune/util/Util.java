package com.github.carthax08.morefortune.util;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Random;

public class Util {
    public static void handleFortune(Random random, int level, World world, Block block, Player player) {
        if (level == 1) {
            int r = random.nextInt(100);
            if(r <= 66){
                if(block.getType().equals(Material.CLAY)){
                    ItemStack itemStack = new ItemStack(Material.CLAY_BALL,4);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }else{
                    ItemStack itemStack = new ItemStack(block.getType());
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }
            }else if(r <= 100){
                if(block.getType().equals(Material.CLAY)) {
                    ItemStack itemStack = new ItemStack(Material.CLAY_BALL, 8);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }else{
                    ItemStack itemStack = new ItemStack(block.getType(),2);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }
            }
        } else if (level == 2) {
            int r = random.nextInt(100);
            if(r <= 50){
                if(block.getType().equals(Material.CLAY)){
                    ItemStack itemStack = new ItemStack(Material.CLAY_BALL,4);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }else{
                    ItemStack itemStack = new ItemStack(block.getType());
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }
            }else if(r <= 75){
                if(block.getType().equals(Material.CLAY)) {
                    ItemStack itemStack = new ItemStack(Material.CLAY_BALL, 8);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }else{
                    ItemStack itemStack = new ItemStack(block.getType(),2);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }
            }else if(r <= 100){
                if(block.getType().equals(Material.CLAY)) {
                    ItemStack itemStack = new ItemStack(Material.CLAY_BALL, 12);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }else{
                    ItemStack itemStack = new ItemStack(block.getType(),3);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }
            }
        } else if (level == 3) {
            int r = random.nextInt(100);
            if (r <= 60 && r > 40) {
                if (block.getType().equals(Material.CLAY)) {
                    ItemStack itemStack = new ItemStack(Material.CLAY_BALL, 4);
                    itemStack.setAmount(itemStack.getAmount() * 2);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                } else {
                    ItemStack itemStack = new ItemStack(block.getType(), 1);
                    itemStack.setAmount(itemStack.getAmount() * 2);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }
            } else if (r <= 80) {
                if (block.getType().equals(Material.CLAY)) {
                    ItemStack itemStack = new ItemStack(Material.CLAY_BALL, 4);
                    itemStack.setAmount(itemStack.getAmount() * 3);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                } else {
                    ItemStack itemStack = new ItemStack(block.getType(), 1);
                    itemStack.setAmount(itemStack.getAmount() * 3);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }
            } else if (r <= 100) {
                if (block.getType().equals(Material.CLAY)) {
                    ItemStack itemStack = new ItemStack(Material.CLAY_BALL, 4);
                    itemStack.setAmount(itemStack.getAmount() * 4);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                } else {
                    ItemStack itemStack = new ItemStack(block.getType(), 1);
                    itemStack.setAmount(itemStack.getAmount() * 4);
                    world.dropItemNaturally(block.getLocation(), itemStack);
                }
            }
        } else {
            System.out.println(player.getName() + " has used a fortune level above 3!");
            player.sendMessage("Your fortune level is above three!");
        }
    }
}
