package com.moldfire.mfsummoner.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.moldfire.mfsummoner.creativetab.CreativeTabMFS;
import com.moldfire.mfsummoner.reference.Reference;

public class ItemMFS extends Item
{
	public ItemMFS(String name)
	{
		super();
		this.setUnlocalizedName(name);
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabMFS.MFSTab);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return String.format("item.%s%s", Reference.MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	private String getUnwrappedUnlocalizedName(String unlocalizedName) 
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
