package com.moldfire.mfsummoner.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.moldfire.mfsummoner.init.ModBlocks;
import com.moldfire.mfsummoner.init.ModItems;

public class Recipes 
{
	public static void init()
	{
		//Furnace
		GameRegistry.addSmelting(ModItems.gemDust, new ItemStack(ModItems.bindingGem, 1, 0), 0);
		
		//Crafting
		GameRegistry.addRecipe(new ItemStack(ModItems.gemDust, 1), "sgs", "gsg", "sgs", 's', Blocks.sand, 'g', Items.glowstone_dust);
		GameRegistry.addRecipe(new ItemStack(ModItems.summoningStone, 1, 0), " e ", "rbr", " e ", 'r', Items.redstone, 'e', Items.ender_eye, 'b', ModItems.bindingGem);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.summonersAlter, 1), "oso", "oSo", "ooo", 's', Blocks.stone_slab, 'S', ModItems.summoningStone, 'o', Blocks.obsidian);
	}
}
