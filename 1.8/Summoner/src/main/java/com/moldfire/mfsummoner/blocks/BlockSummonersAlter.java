package com.moldfire.mfsummoner.blocks;

import java.util.Random;

import com.moldfire.mfsummoner.init.ModItems;
import com.moldfire.mfsummoner.items.ItemSummoningStone;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;


public class BlockSummonersAlter extends BlockMFS
{
	public BlockSummonersAlter(String name, Material material, float hardness)
	{
		super(name, material, hardness);
		this.setStepSound(soundTypeStone);
	}
	
	@Override
	public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
		for (int i = 0; i < 4; ++i)
        {
            double d0 = (double)((float)pos.getX() + rand.nextFloat());
            double d1 = (double)((float)pos.getY() + rand.nextFloat());
            double d2 = (double)((float)pos.getZ() + rand.nextFloat());
            double d3 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            double d4 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            double d5 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            int j = rand.nextInt(2) * 2 - 1;

            worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5, new int[0]);
        }
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	public boolean isFullCube()
    {
        return false;
    }
}
