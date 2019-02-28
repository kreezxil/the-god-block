package com.kreezcraft.thegodblock;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.kreezcraft.thegodblock.proxy.CommonProxy;

@Mod(modid = GodBlock.MODID, name = GodBlock.NAME, version = GodBlock.VERSION)
public class GodBlock {
	public static final String MODID = "thegodblock";
	public static final String NAME = "The God Block";
	public static final String VERSION = "@VERSION@";
	
	public static final CreativeTabs creativeTab = new GodBlockTab("The God Block");

	private static Logger logger;

	@SidedProxy(serverSide = "com.kreezcraft.thegodblock.proxy.CommonProxy", clientSide = "com.kreezcraft.thegodblock.proxy.ClientProxy")
	public static CommonProxy proxy;
}
