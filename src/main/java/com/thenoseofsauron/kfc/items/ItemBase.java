package com.thenoseofsauron.kfc.items;

import com.thenoseofsauron.kfc.KFC;
import com.thenoseofsauron.kfc.init.ModItems;
import com.thenoseofsauron.kfc.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		KFC.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}