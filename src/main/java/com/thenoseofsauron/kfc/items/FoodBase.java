package com.thenoseofsauron.kfc.items;

import com.thenoseofsauron.kfc.KFC;
import com.thenoseofsauron.kfc.init.ModItems;
import com.thenoseofsauron.kfc.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{
	
	public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.FOODS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		KFC.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
