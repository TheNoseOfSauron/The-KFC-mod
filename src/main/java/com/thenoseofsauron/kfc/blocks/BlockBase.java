package com.thenoseofsauron.kfc.blocks;

import com.thenoseofsauron.kfc.KFC;
import com.thenoseofsauron.kfc.init.ModBlocks;
import com.thenoseofsauron.kfc.init.ModItems;
import com.thenoseofsauron.kfc.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		
		KFC.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "Inventory");
		
	}
	
}