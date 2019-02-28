package com.kreezcraft.thegodblock.items;

import com.kreezcraft.thegodblock.GodBlock;
import com.kreezcraft.thegodblock.client.IHasModel;
import com.kreezcraft.thegodblock.init.InitItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item implements IHasModel {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(GodBlock.MODID + "." + name);
		setRegistryName(name);
		InitItems.ITEMS.add(this);
		setCreativeTab(GodBlock.creativeTab);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	public void registerItemModel() {
		GodBlock.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void registerModels() {
		GodBlock.proxy.registerItemRenderer(this, 0, "inventory");
	}

}