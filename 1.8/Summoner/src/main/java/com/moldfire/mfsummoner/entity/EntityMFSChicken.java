package com.moldfire.mfsummoner.entity;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityMFSChicken extends EntityChicken
{
	public EntityMFSChicken(String name, World worldIn, BlockPos pos)
	{
		super(worldIn);
		this.setCustomNameTag(name);
		this.moveToBlockPosAndAngles(pos, 0, 0);
	}
}
