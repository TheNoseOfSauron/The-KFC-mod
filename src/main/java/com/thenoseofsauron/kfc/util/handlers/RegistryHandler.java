package com.thenoseofsauron.kfc.util.handlers;

import com.thenoseofsauron.kfc.init.ModBlocks;
import com.thenoseofsauron.kfc.init.ModItems;
import com.thenoseofsauron.kfc.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		event.getRegistry().registerAll(ModItems.FOODS.toArray(new ItemFood[0]));
		
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		for(Item item : ModItems.ITEMS) {
			
			if(item instanceof IHasModel) {
				
				((IHasModel)item).registerModels();
				
			}
			
		}
		
		for(Item item : ModItems.FOODS) {
			
			if(item instanceof IHasModel) {
				
				((IHasModel)item).registerModels();
				
			}
			
		}
		
		for(Block block : ModBlocks.BLOCKS) {
			
			if(block instanceof IHasModel) {
				
				((IHasModel)block).registerModels();
				
			}
			
		}
		
	}
	
}