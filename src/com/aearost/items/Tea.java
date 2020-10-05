package com.aearost.items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;

import com.aearost.irohstea.Items;
import com.aearost.irohstea.Utils;

public class Tea {
	
	public static ItemStack getTea(Items teaItemName) {
		ItemStack tea = new ItemStack(Material.POTION, 1);
		PotionMeta meta = (PotionMeta) tea.getItemMeta();
		TeaItem teaItem = Utils.getTeaItem(teaItemName);
		
		meta.clearCustomEffects();
		meta.addCustomEffect(teaItem.getPotionEffect(), true);
		meta.setColor(teaItem.getColor());
		meta.setDisplayName(Utils.translateToColor(teaItem.getName()));
		if (meta.hasLore()) {
			meta.getLore().clear();
		}
		ArrayList<String> s = new ArrayList<>();
 	    s.add(Utils.translateToColor(teaItem.getLore()));
 	    meta.setLore(s);
		tea.setItemMeta(meta);
		return tea;
	}
	
}
