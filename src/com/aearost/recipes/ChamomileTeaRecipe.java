package com.aearost.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

import com.aearost.items.Items;
import com.aearost.items.TeaBag;

public class ChamomileTeaRecipe {

	public ChamomileTeaRecipe(Plugin plugin) {
		createRecipe(plugin);
	}
	
	/**
	 * Creates the recipe for the Chamomile Tea Bag.
	 * 
	 * @param plugin
	 */
	private void createRecipe(Plugin plugin) {
		NamespacedKey nk = new NamespacedKey(plugin, "CHAMOMILE_TEA");
		
		ItemStack teaBag = TeaBag.getTeaBag(Items.CHAMOMILE_TEA);
		ShapelessRecipe recipe = new ShapelessRecipe(nk, teaBag);
		
		recipe.addIngredient(1, Material.KELP);
		recipe.addIngredient(1, Material.TALL_GRASS);
		recipe.addIngredient(1, Material.OXEYE_DAISY);
		recipe.addIngredient(1, Material.WHEAT);
		recipe.addIngredient(1, Material.HONEY_BOTTLE);
		
        plugin.getServer().addRecipe(recipe);
	}
	
}