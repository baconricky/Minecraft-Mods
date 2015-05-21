package com.moldfire.mfsummoner.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelMFSBound extends ModelBase
{
	public ModelMFSBound()
	{
	}
	
	public void render(Entity entity, float time, float limbSwing, float blank, float headY, float headX, float posY)
    {
		ModelChicken chicken = new ModelChicken();
        chicken.head.render(posY);
        chicken.bill.render(posY);
        chicken.chin.render(posY);
        chicken.body.render(posY);
        chicken.rightLeg.render(posY);
        chicken.leftLeg.render(posY);
        chicken.rightWing.render(posY);
        chicken.leftWing.render(posY);
    }
}
