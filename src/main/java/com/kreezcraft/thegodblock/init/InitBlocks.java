package com.kreezcraft.thegodblock.init;

import java.util.ArrayList;
import java.util.List;

import com.kreezcraft.thegodblock.blocks.Nothingness;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class InitBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block NOTHINGNESS = new Nothingness(Material.WOOD, "thenothing");
	
}