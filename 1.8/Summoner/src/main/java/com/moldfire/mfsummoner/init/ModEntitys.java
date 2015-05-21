package com.moldfire.mfsummoner.init;

import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.moldfire.mfsummoner.entity.EntityMFSBound;

public class ModEntitys 
{	
	public static void init()
	{
		
	}
	
	public static void registerRenders()
	{

	}
	
	private static void registerEntity(Item item)
	{
		GameRegistry.registerItem(item,item.getUnlocalizedName().substring(5));
	}
	
	private static void registerRender(EntityLiving entity)
	{
		//RenderingRegistry.registerEntityRenderingHandler(EntityMFSBound.class,(Render)new ModelChicken());
	}
}
