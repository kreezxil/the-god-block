package com.kreezcraft.thegodblock;

import com.kreezcraft.thegodblock.init.InitItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GodBlockTab extends CreativeTabs {

	public GodBlockTab(String label) {
		super(GodBlock.MODID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(InitItems.QUANTA);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

	
}