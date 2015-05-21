package com.moldfire.mfsummoner.init;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.moldfire.mfsummoner.blocks.BlockMFS;
import com.moldfire.mfsummoner.blocks.BlockSummonersAlter;

public class ModBlocks 
{
	public static final BlockMFS summonersAlter = new BlockSummonersAlter("summonersAlter", Material.rock, 3.5F);
	
	public static void init()
	{
		registerItem(summonersAlter);
	}
	
	public static void registerRenders()
	{
		registerRender(summonersAlter);
	}
	
	private static void registerItem(Block block)
	{
		GameRegistry.registerBlock(block,block.getUnlocalizedName().substring(5));
	}
	
	private static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));
	}
}
