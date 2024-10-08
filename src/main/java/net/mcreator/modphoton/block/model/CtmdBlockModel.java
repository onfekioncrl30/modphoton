package net.mcreator.modphoton.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.modphoton.block.entity.CtmdTileEntity;

public class CtmdBlockModel extends GeoModel<CtmdTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CtmdTileEntity animatable) {
		return new ResourceLocation("modphoton", "animations/arcane_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CtmdTileEntity animatable) {
		return new ResourceLocation("modphoton", "geo/arcane_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CtmdTileEntity animatable) {
		return new ResourceLocation("modphoton", "textures/block/arcane_table.png");
	}
}
