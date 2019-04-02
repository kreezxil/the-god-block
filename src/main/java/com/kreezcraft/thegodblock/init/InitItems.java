package com.kreezcraft.thegodblock.init;

import java.util.ArrayList;
import java.util.List;

import com.kreezcraft.thegodblock.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class InitItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item QUANTA = new ItemBase("quanta");
	public static final Item ATOMIC_STRING = new ItemBase("atomic_string");
	public static final Item UNIVERSAL_BINDER = new ItemBase("universal_binder");

}