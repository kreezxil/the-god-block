package com.kreezcraft.thegodblock.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.kreezcraft.thegodblock.GodBlock;
import com.kreezcraft.thegodblock.client.IHasModel;
import com.kreezcraft.thegodblock.init.InitBlocks;
import com.kreezcraft.thegodblock.init.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Nothingness extends BlockGlass implements IHasModel {

	protected String name;

	public Nothingness(Material material, String name) {
		super(material, true);
		setHardness(1f);
		setLightOpacity(0);
		setHarvestLevel("pickaxe", 0);
		this.name = name;
		setUnlocalizedName(GodBlock.MODID + "." + name);
		setCreativeTab(GodBlock.creativeTab);
		setRegistryName(name);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	@Override
	public int quantityDropped(Random random) {
		return (int) (Math.random() * 3) + 1;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		int chance = (int) (Math.random() * 10) + 1;
		if (chance >= 1 && chance <= 2)
			return InitItems.UNIVERSAL_BINDER;
		else if (chance >= 4 && chance <= 6)
			return InitItems.ATOMIC_STRING;
		return InitItems.QUANTA;
	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		// TODO Auto-generated method stub
		return super.quantityDropped(state, fortune, random);
	}

	@Override
	public boolean shouldSideBeRendered(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		return !(world.getBlockState(pos.offset(side)).getBlock() == this);
	}

	@Override
	public int getLightValue(IBlockState state) {
		return 7;
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public void registerModels() {
		GodBlock.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Nullable
	@Override
	public String getHarvestTool(final IBlockState state) {
		return super.getHarvestTool(state);
	}

	@Override
	public boolean isToolEffective(final String type, final IBlockState state) {
		return super.isToolEffective(type, state);
	}
}