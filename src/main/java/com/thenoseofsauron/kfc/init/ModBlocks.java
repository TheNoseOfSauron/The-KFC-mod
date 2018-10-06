package com.thenoseofsauron.kfc.init;

import java.util.ArrayList;
import java.util.List;

import com.thenoseofsauron.kfc.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block KFC_BLOCK = new BlockBase("kfc_block", Material.ROCK).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block KFC_BLOCK_COMPRESSED = new BlockBase("kfc_block_compressed", Material.ROCK).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
}