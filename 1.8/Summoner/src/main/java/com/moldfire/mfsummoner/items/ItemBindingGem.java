package com.moldfire.mfsummoner.items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

import com.moldfire.mfsummoner.entity.ai.EntityAIMFSBound;

public class ItemBindingGem extends ItemMFS
{
	private boolean bound;
	
	public ItemBindingGem(String name)
	{
		super(name);
		this.setMaxStackSize(1);
		bound = false;
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
	{
		/*if(checkTags(stack))
		{
			if(stack.getTagCompound().getInteger("entityID") != 0 && stack.getTagCompound().getString("playerName") != "")
			{
				//EntityLiving entity = (EntityLiving) worldIn.getEntityByID(stack.getTagCompound().getInteger("entityID"));
				//EntityPlayer player = worldIn.getPlayerEntityByName(stack.getTagCompound().getString("playerName"));
				
				//if(entity.tasks.taskEntries.size() > 1)
				//{
				//entity.tasks.taskEntries.clear();
            	//entity.tasks.addTask(0, new EntityAIMFSBound(entity, player, stack));
				//}
			}
		}*/
	}
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player)
	{
		if (!stack.hasTagCompound())
		{
			stack.setTagCompound(new NBTTagCompound());
		}
		
		stack.getTagCompound().setBoolean("isBound", bound);
		stack.getTagCompound().setInteger("entityID", 0);
		stack.getTagCompound().setString("playerName", "");
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool)
	{
		if (!stack.hasTagCompound())
		{
			stack.setTagCompound(new NBTTagCompound());
		}
		
		switch(getMetadata(stack))
		{
		case 0:
			list.add("Level: §cImperfect");
			break;
			
		case 1:
			list.add("Level: Lesser");
			break;
			
		case 2:
			list.add("Level: §2Greater");
			break;
			
		case 3:
			list.add("Level: Master");
			break;
		}
		
		if(checkTags(stack))
		{
			if(stack.getTagCompound().getBoolean("isBound") == true)
			{
				list.add("§2Bound");
			}
			else if(stack.getTagCompound().getBoolean("isBound") == false)
			{
				list.add("§cUnbound");
			}
		}
		else
		{
			list.add("Key not registerd properly");
			list.add("Place in a crafting gid");
		}
	}
	
	/*@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        if(playerIn.isSneaking())
        {
        	if(checkTags(stack))
			{
				if(stack.getTagCompound().getBoolean("isBound") == false)
				{
					playerIn.setHealth((float)(playerIn.getHealth()-(Math.random()*25)));
					playerIn.hurtTime = 3;
					stack.getTagCompound().setBoolean("isBound", true);
				}
			}	
        }
        return stack;
    }*/
	
	@Override
	public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target)
	{
		/*if(!playerIn.isSneaking())
		{
			if(checkTags(stack))
			{
				if(stack.getTagCompound().getBoolean("isBound") == false)
				{
					if (target instanceof EntityLiving)
			        {
						EntityLiving entity = (EntityLiving)target;
						
						entity.spawnExplosionParticle();
						entity.tasks.taskEntries.clear();
		            	entity.tasks.addTask(0, new EntityAIMFSBound(entity, playerIn, stack));
		            	if(entity.hasCustomName())
		            	{
		            		String s = entity.getCustomNameTag();
		            		entity.setCustomNameTag("Bound "+s);
		            	}
		            	else
		            	{
		            		entity.setCustomNameTag("Bound "+entity.getName());
		            	}
			            stack.getTagCompound().setBoolean("isBound", true);
			            stack.getTagCompound().setInteger("entityID", entity.getEntityId());
			            stack.getTagCompound().setString("playerName", playerIn.getName());
			        }
				}
			}
		}*/
		return false;
	}
	
	private boolean checkTags(ItemStack stack)
	{
		if(
		stack.getTagCompound().hasKey("isBound") == true&&
		stack.getTagCompound().hasKey("entityID") == true&&
		stack.getTagCompound().hasKey("playerName") == true
		){return true;}
		return false;
	}
	
	private boolean bindCreature(EntityLivingBase target, EntityPlayer playerIn, ItemStack stack)
	{
		/*EntityLiving entity = (EntityLiving)target;
		
		switch(stack.getMetadata())
		{
			case 1:
				return false;
				
			case 0:
				if(entity.isCreatureType(EnumCreatureType.CREATURE, false))
	            {
					entity.spawnExplosionParticle();
					entity.tasks.taskEntries.clear();
	            	entity.tasks.addTask(0, new EntityAIMFSBound(entity, playerIn, stack));
	            	if(entity.hasCustomName())
	            	{
	            		String s = entity.getCustomNameTag();
	            		entity.setCustomNameTag("Bound "+s);
	            	}
	            	else
	            	{
	            		entity.setCustomNameTag("Bound "+entity.getName());
	            	}
		            stack.getTagCompound().setBoolean("isBound", true);
		            stack.getTagCompound().setInteger("entityID", entity.getEntityId());
		            stack.getTagCompound().setString("playerName", playerIn.getName());
		            return true;
	            }
				return false;
				
			case 2:
				return false;
				
			case 3:
				return false;
				
			default:
				return false;
		}*/return false;
	}
	
}
