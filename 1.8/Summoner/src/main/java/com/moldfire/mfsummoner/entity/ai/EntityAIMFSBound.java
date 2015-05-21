package com.moldfire.mfsummoner.entity.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class EntityAIMFSBound extends EntityAIBase
{
	EntityLiving animal;
	EntityPlayer master;
	ItemStack binding;
	
	public EntityAIMFSBound(EntityLiving animal, EntityPlayer master, ItemStack binding)
	{
		this.animal = animal;
		this.master = master;
		this.binding = binding;
	}
	@Override
	public boolean shouldExecute()
	{
		return true;
	}
	
	public boolean continueExecuting()
	{
		//for(int i = 0; i < this.master.getInventory().length; i++)
		//{
			//if(this.master.getInventory()[i].equals(this.binding))
			//{
				return true;
			//}
		//}
		//return false;
	}
	
   public void updateTask()
   {
       this.animal.getNavigator().tryMoveToEntityLiving(this.master, 1.0);
   }
}
