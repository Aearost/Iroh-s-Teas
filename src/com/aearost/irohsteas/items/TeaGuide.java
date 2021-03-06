package com.aearost.irohsteas.items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.aearost.irohsteas.utils.ChatUtils;

public class TeaGuide {

	/**
	 * Creates and returns an ItemStack, representing the recipe book given to a
	 * player through the /teas book command.
	 * 
	 * @return
	 */
	public static ItemStack getGuide() {
		ItemStack book = new ItemStack(Material.WRITTEN_BOOK, 1);
		BookMeta meta = (BookMeta) book.getItemMeta();
		meta.setTitle(ChatUtils.translateToColor("&2A Guide to Happiness"));
		meta.setAuthor(ChatUtils.translateToColor("&8Uncle Iroh"));
		ArrayList<String> pages = new ArrayList<String>();

		// Intro Pages
		pages.add(ChatUtils.translateToColor(
				"\n\n&l  --+--+--+--+--\n\n&8&l    Iroh's Teas\n\n&r&l  --+--+--+--+--\n\n\n\n\n&r&7&oA guide to brewing tea"));
		pages.add(ChatUtils.translateToColor(
				"&l&nTea Leaves & Plants\n\n&rWithout tea leaves, one cannot make a proper tea base!\n\nWith enough luck, a tea plant may drop by foraging through grass - just like seeds! Once planted, it will flower and one will be able to harvest it for its leaves."));
		pages.add(ChatUtils.translateToColor(
				"&l&nTea Base\n\n&rIt's just an ordinary tea leaf until you add it to the recipe for a tea base.\n\nAll tea bag recipes contain a tea base as an essential ingredient. Without it, you will not get any tea bags!"));
		pages.add(ChatUtils.translateToColor(
				"&l&nTea Base (cont'd)\n\n&rIt is crafted in an ordinary crafting table as shown below:\n\n\n   S       S = String\n\nP T P     T = Tea Leaf\n\n   P       P = Paper"));
		pages.add(ChatUtils.translateToColor(
				"&l&nKettles\n\n&rTo create a kettle, one must place a cauldron over a hot flame. Once that is done, fill the cauldron with water and you are ready to begin brewing your tea. Right click the kettle with an empty bottle and the tea bag of your choice!"));

		// Teas
		pages.add(ChatUtils.translateToColor(
				"&l&nGreen Tea\n\n&r&oSimple, yet delicious\n\n&rIngredients:\n- 1 tea leaf\n\nEffects:\n- Luck III (30s)"));
		pages.add(ChatUtils.translateToColor(
				"&l&nApple Cinnamon Tea\n\n&r&oJust a hint of tree bark\n\n&rIngredients:\n- 1 apple\n- 1 wheat seeds\n- 1 dark oak log\n\nEffects:\n- Haste II (180s)"));
		pages.add(ChatUtils.translateToColor(
				"&l&nChamomile Tea\n\n&r&oGrandma, is that you?\n\n&rIngredients:\n- 1 oxeye daisy\n- 1 wheat\n- 1 tall grass\n- 1 honey bottle\n\nEffects:\n- Instant Health V\n- Weakness II (60s)\n- Slowness II (60s)"));
		pages.add(ChatUtils.translateToColor(
				"&l&nChocolate Tea\n\n&r&oSweet goodness!\n\n&rIngredients:\n- 1 milk bucket\n- 1 cocoa beans\n- 1 sugar\n\nEffects:\n- Speed IV (120s)"));
		pages.add(ChatUtils.translateToColor(
				"&l&nHoney Rose Tea\n\n&r&oSome say its taste is heavenly...\n\n&rIngredients:\n- 1 rose bush\n- 1 honey bottle\n- 1 poppy\n\nEffects:\n- Levitation III (5s)\n- Absorption III (8s)"));
		pages.add(ChatUtils.translateToColor(
				"&l&nJasmine Tea\n\n&r&oThe sweet taste of blossoms\n\n&rIngredients:\n- 1 white tulip\n- 1 peony\n\nEffects:\n- Invisibility (15s)"));
		pages.add(ChatUtils.translateToColor(
				"&l&nMatcha Tea\n\n&r&oThe Japanese flavor you needed\n\n&rIngredients:\n- 1 sugar\n- 1 leaves (any kind)\n\nEffects:\n- Jump III (120s)"));
		pages.add(ChatUtils.translateToColor(
				"&l&nSuspicious Tea\n\n&r&oI wonder what this does...\n\n&rIngredients:\n- 1 allium\n- 1 blue orchid\n- 1 cornflower\n- 1 dandelion\n- 1 lily of the valley\n- 1 oxeye daisy\n- 1 poppy\n- 1 tulip (any color)"));
		pages.add(ChatUtils.translateToColor(
				"&l&nT8 Tea\n\n&r&oEver hear of V8?\n\n&rIngredients:\n- 2 carrots\n- 2 beetroots\n- 2 sweet berries\n- 1 melon slice\n\nEffects:\n- Regeneration II (60s)"));
		pages.add(ChatUtils.translateToColor(
				"&l&nTulip Tea\n\n&r&oGot tulips?\n\n&rIngredients:\n- 1 white tulip\n- 1 pink tulip\n- 1 orange tulip\n 1 red tulip\n\nEffects:\n- Strength II (30s)\n- Absorption III (30s)"));
		pages.add(ChatUtils.translateToColor(
				"&l&nWhite Dragon Tea\n\n&r&oDelicious tea?\n\n&rIngredients:\n- 1 tea leaf\n- 1 azure bluet\n- 1 white tulip\n\nEffects:\n- Instant Health III"));
		pages.add(ChatUtils.translateToColor(
				"&l&nWhite Jade Tea\n\n&r&oDeadly poison?\n\n&rIngredients:\n- 1 tea leaf\n- 1 lily of the valley\n- 1 white tulip\n\nEffects:\n- Slowness III (180s)"));

		pages.add(ChatUtils.translateToColor(
				"&l&nCactus Juice\n\n&r&oDesperate times call for desperate measures...\n\n&rIngredients:\n - 4 cactus\n\nEffects:\n- Nausea V (120s)\n- Slowness III (180s)\n- Weakness V (180s)\n- Night Vision (10s)"));

		meta.setPages(pages);

		book.setItemMeta(meta);
		return book;
	}

}
