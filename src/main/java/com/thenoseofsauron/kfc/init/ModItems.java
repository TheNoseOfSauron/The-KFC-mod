package com.thenoseofsauron.kfc.init;

import java.util.ArrayList;
import java.util.List;

import com.thenoseofsauron.kfc.items.ItemBase;
import com.thenoseofsauron.kfc.items.FoodBase;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final List<ItemFood> FOODS = new ArrayList<ItemFood>();
	
	public static final ItemFood KFC = new FoodBase("KFC", 10, 1.0f, true);
	
}