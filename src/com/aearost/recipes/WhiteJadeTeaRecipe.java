package com.aearost.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

import com.aearost.items.Items;
import com.aearost.items.TeaBag;

public class WhiteJadeTeaRecipe {

	public WhiteJadeTeaRecipe(Plugin plugin) {
		createRecipe(plugin);
	}
	
	private void createRecipe(Plugin plugin) {
		NamespacedKey nk = new NamespacedKey(plugin, "WHITE_JADE_TEA");
		
		ItemStack teaBag = TeaBag.getTeaBag(Items.WHITE_JADE_TEA);
		ShapelessRecipe recipe = new ShapelessRecipe(nk, teaBag);
		
		recipe.addIngredient(1, Material.KELP);
		recipe.addIngredient(1, Material.LILY_OF_THE_VALLEY);
		recipe.addIngredient(1, Material.WHITE_TULIP);
		
        plugin.getServer().addRecipe(recipe);
	}
	
}