package com.moldfire.mfsummoner.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemDevWorkshop extends ItemMFS 
{
	int Width = 9;
	int Height = 9;
	
	public ItemDevWorkshop(String name)
	{
		super(name);
		this.setMaxStackSize(1);
	}
	
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else if (side != EnumFacing.UP)
        {
            return false;
        }
        else
        {
           // IBlockState iblockstate = worldIn.getBlockState(pos);
           // Block block = iblockstate.getBlock();
        	BlockPos bPos;
        	BlockPos cPos = new BlockPos(pos.getX()-(Width/2), pos.getY(), pos.getZ()-(Width/2));
        	for(int x = 0; x <Width; x++)
        	{
        		for(int z = 0; z <Width; z++)
        		{
        			//Build the floor
        			bPos = new BlockPos(cPos.getX()+x, cPos.getY(), cPos.getZ()+z);
        			worldIn.setBlockState(bPos, Blocks.stonebrick.getDefaultState(), 0);
        			
        			//Build the ceiling
        			bPos = new BlockPos(cPos.getX()+x, cPos.getY()+8, cPos.getZ()+z);
        			worldIn.setBlockState(bPos, Blocks.stonebrick.getDefaultState(), 0);
        			
        			//Build the walls
        			if(z == 0 ||  x == 0 || z == 8 ||  x == 8 )
        			{
        				for(int y = 0; y <Height; y++)
        				{
        					bPos = new BlockPos(cPos.getX()+x, cPos.getY()+y, cPos.getZ()+z);
        					if(y > 1 && y < 5 && x != 0)
        					{
        						worldIn.setBlockState(bPos, Blocks.glass_pane.getDefaultState(), 0);
        					}
        					else
        					{
        						if(z == 4 && y > 0 && y < 3)
        						{
        							worldIn.setBlockState(bPos, Blocks.air.getDefaultState(), 0);
        						}
        						else
        						{
        							worldIn.setBlockState(bPos, Blocks.stonebrick.getDefaultState(), 0);
        						}
        					}
        					
        				}
        			}
        		}
        	}
        	
        	bPos = new BlockPos(cPos.getX()+1, cPos.getY()+1, cPos.getZ()+1);
        	worldIn.setBlockState(bPos, Blocks.crafting_table.getDefaultState(), 0);
        	bPos = new BlockPos(cPos.getX()+1, cPos.getY()+1, cPos.getZ()+2);
        	worldIn.setBlockState(bPos, Blocks.furnace.getDefaultState(), 0);
        	bPos = new BlockPos(cPos.getX()+1, cPos.getY()+1, cPos.getZ()+3);
        	worldIn.setBlockState(bPos, Blocks.chest.getDefaultState(), 0);
            --stack.stackSize;
            return true;
        }
    }
}
