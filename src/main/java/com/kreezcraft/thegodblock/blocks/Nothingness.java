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
		setHardness(3f);
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
		return 0;
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
		
//	@Override
//	public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn) {
//		super.onBlockDestroyedByExplosion(worldIn, pos, explosionIn);
//		worldIn.setBlockToAir(pos);
//		worldIn.playSound(worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 2, false), pos, SoundEvents.AMBIENT_CAVE, SoundCategory.PLAYERS, 0.3f, 0.6f);
//		int random = (int )(Math.random() * 4 + 1);
//		for (int i = 0; i < random; i++) {
//			ItemStack stack = new ItemStack(InitItems.QUANTA);
//			EntityItem spawnQuanta = new EntityItem(worldIn,pos.getX(),pos.getY(),pos.getZ(),stack);
//		}
//	}

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