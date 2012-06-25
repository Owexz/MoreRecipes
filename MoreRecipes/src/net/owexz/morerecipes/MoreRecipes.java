package net.owexz.morerecipes;

import java.io.File;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class MoreRecipes extends JavaPlugin {

	public void onEnable() {
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }
        reloadConfig();
		
		if (getConfig().getBoolean("silverfish", true)) {
			ShapedRecipe recipe1 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGGS, 1));
			recipe1.shape(new String[] { "AAA", "ABA", "AAA" });
			recipe1.setIngredient('A', Material.SMOOTH_BRICK);
			recipe1.setIngredient('B', Material.COOKED_FISH);
			getServer().addRecipe(recipe1);
		}
		
		if (getConfig().getBoolean("web", true)) {
			ShapedRecipe recipe2 = new ShapedRecipe(new ItemStack(Material.WEB, 1));
			recipe2.shape(new String[] { "AAA", "AAA", "AAA" });
			recipe2.setIngredient('A', Material.STRING);
			getServer().addRecipe(recipe2);
		}

		if (getConfig().getBoolean("string", true)) {
			ShapelessRecipe recipe3 = new ShapelessRecipe(new ItemStack(Material.STRING, 2));
			recipe3.addIngredient(Material.WOOL);
			getServer().addRecipe(recipe3);
		}
		
		if (getConfig().getBoolean("chainBoots", true)) {
			ShapedRecipe recipe4 = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_BOOTS, 1));
			recipe4.shape(new String[] { "C C", "B B", "A A" });
			recipe4.setIngredient('A', Material.IRON_INGOT);
			recipe4.setIngredient('B', Material.STRING);
			getServer().addRecipe(recipe4);
		}
		
		if (getConfig().getBoolean("chainLeggings", true)) {
			ShapedRecipe recipe5 = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_LEGGINGS, 1));
			recipe5.shape(new String[] { "ABA", "B B", "A A" });
			recipe5.setIngredient('A', Material.IRON_INGOT);
			recipe5.setIngredient('B', Material.STRING);
			getServer().addRecipe(recipe5);
		}
		
		if (getConfig().getBoolean("chainChestplate", true)) {
			ShapedRecipe recipe6 = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1));
			recipe6.shape(new String[] { "A A", "BAB", "ABA" });
			recipe6.setIngredient('A', Material.IRON_INGOT);
			recipe6.setIngredient('B', Material.STRING);
			getServer().addRecipe(recipe6);
		}
		
		if (getConfig().getBoolean("chainHelmet", true)) {
			ShapedRecipe recipe7 = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_HELMET, 1));
			recipe7.shape(new String[] { "BAB", "A A" });
			recipe7.setIngredient('A', Material.IRON_INGOT);
			recipe7.setIngredient('B', Material.STRING);
			getServer().addRecipe(recipe7);
		}
		
		if (getConfig().getBoolean("netherBrick", true)) {
			ShapedRecipe recipe8 = new ShapedRecipe(new ItemStack(Material.NETHER_BRICK, 1));
			recipe8.shape(new String[] { "AA ", "AA ", "   " });
			recipe8.setIngredient('A', Material.NETHERRACK);
			getServer().addRecipe(recipe8);
		}
		
		if (getConfig().getBoolean("saddle", true)) {
			ShapedRecipe recipe9 = new ShapedRecipe(new ItemStack(Material.SADDLE, 1));
			recipe9.shape(new String[] { " A ", "BAB", "CAC" });
			recipe9.setIngredient('A', Material.LEATHER);
			recipe9.setIngredient('B', Material.IRON_INGOT);
			recipe9.setIngredient('C', Material.STRING);
			getServer().addRecipe(recipe9);
		}
		
		if (getConfig().getBoolean("grass", true)) {
			ShapelessRecipe recipe10 = new ShapelessRecipe(new ItemStack(Material.GRASS, 1));
			recipe10.addIngredient(Material.SEEDS);
			recipe10.addIngredient(Material.DIRT);
			getServer().addRecipe(recipe10);
		}
		
		if (getConfig().getBoolean("mossStone", true)) {
			ShapedRecipe recipe11 = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE, 5));
			recipe11.shape(new String[] { "ABA", "BAB", "ABA" });
			recipe11.setIngredient('A', Material.COBBLESTONE);
			recipe11.setIngredient('B', Material.SEEDS);
			getServer().addRecipe(recipe11);
		}
		
		if (getConfig().getBoolean("ice", true)) {
			ShapedRecipe recipe12 = new ShapedRecipe(new ItemStack(Material.ICE, 3));
			recipe12.shape(new String[] { "AAA", "ABA", "AAA" });
			recipe12.setIngredient('A', Material.SNOW_BALL);
			recipe12.setIngredient('B', Material.WATER_BUCKET);
			getServer().addRecipe(recipe12);
		}
		
		if (getConfig().getBoolean("mycelium", true)) {
			ShapelessRecipe recipe13 = new ShapelessRecipe(new ItemStack(Material.MYCEL, 2));
			recipe13.addIngredient(Material.BROWN_MUSHROOM);
			recipe13.addIngredient(Material.RED_MUSHROOM);
			recipe13.addIngredient(Material.DIRT);
			recipe13.addIngredient(Material.DIRT);
			getServer().addRecipe(recipe13);
		}
		
		if (getConfig().getBoolean("crackedStoneBrick", true)) {
			ShapedRecipe recipe14 = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 5, (short)0, (byte)2));
			recipe14.shape(new String[] { "ABA", "BAB", "ABA" });
			recipe14.setIngredient('A', Material.SMOOTH_BRICK);
			recipe14.setIngredient('B', Material.FLINT);
			getServer().addRecipe(recipe14);
		}
		
		if (getConfig().getBoolean("mossyStoneBricks", true)) {
			ShapedRecipe recipe15 = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 5, (short)0, (byte)1));
			recipe15.shape(new String[] { "ABA", "BAB", "ABA" });
			recipe15.setIngredient('A', Material.SMOOTH_BRICK);
			recipe15.setIngredient('B', Material.SEEDS);
			getServer().addRecipe(recipe15);
		}
		
		if (getConfig().getBoolean("circleStoneBricks", true)) {
			ShapedRecipe recipe15 = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 5, (short)0, (byte)2));
			recipe15.shape(new String[] { "ABA", "BAB", "ABA" });
			recipe15.setIngredient('A', Material.SMOOTH_BRICK);
			recipe15.setIngredient('B', Material.SEEDS);
			getServer().addRecipe(recipe15);
		}
		
		if (getConfig().getBoolean("sand", true)) {
			ShapelessRecipe recipe18 = new ShapelessRecipe(new ItemStack(Material.SAND, 4));
			recipe18.addIngredient(Material.SANDSTONE);
			getServer().addRecipe(recipe18);
		}
		
		if (getConfig().getBoolean("clay", true)) {
			ShapelessRecipe recipe19 = new ShapelessRecipe(new ItemStack(Material.CLAY_BALL, 4));
			recipe19.addIngredient(Material.CLAY);
			getServer().addRecipe(recipe19);
		}
		
		if (getConfig().getBoolean("apple", true)) {
			ShapedRecipe recipe20 = new ShapedRecipe(new ItemStack(Material.APPLE, 1));
			recipe20.shape(new String[] { "AAA", "ABA", "AAA" });
			recipe20.setIngredient('A', Material.LEAVES);
			recipe20.setIngredient('B', Material.SUGAR);
			getServer().addRecipe(recipe20);
		}
		
		if (getConfig().getBoolean("clayBlock", true)) {
			ShapedRecipe recipe21 = new ShapedRecipe(new ItemStack(Material.CLAY, 9));
			recipe21.shape(new String[] { "AAA", "BBB", "CCC" });
			recipe21.setIngredient('A', Material.SAND);
			recipe21.setIngredient('B', Material.GRAVEL);
			recipe21.setIngredient('C', Material.DIRT);
			getServer().addRecipe(recipe21);
		}
		
		if (getConfig().getBoolean("sponge", true)) {
			ShapedRecipe recipe22 = new ShapedRecipe(new ItemStack(Material.SPONGE, 1));
			recipe22.shape(new String[] { "BAB", "ABA", "BAB" });
			recipe22.setIngredient('A', Material.SAND);
			recipe22.setIngredient('B', Material.STRING);
			getServer().addRecipe(recipe22);
		}
		
		if (getConfig().getBoolean("cocoaBeans", true)) {
			ShapedRecipe recipe23 = new ShapedRecipe(new ItemStack(Material.INK_SACK, 2, (short)0, (byte)3));
			recipe23.shape(new String[] { "AAA", "ABA", "AAA" });
			recipe23.setIngredient('A', Material.SUGAR);
			recipe23.setIngredient('B', Material.INK_SACK.getNewData((byte)3));
			getServer().addRecipe(recipe23);
		}
		
		if (getConfig().getBoolean("blackMusicDisc", true)) {
			ShapedRecipe recipe24 = new ShapedRecipe(new ItemStack(Material.RECORD_8, 1));
			recipe24.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe24.setIngredient('A', Material.OBSIDIAN);
			recipe24.setIngredient('B', Material.GOLD_INGOT);
			recipe24.setIngredient('C', Material.INK_SACK);
			getServer().addRecipe(recipe24);
		}
		
		if (getConfig().getBoolean("brokenMusicDisc", true)) {
			ShapedRecipe recipe25 = new ShapedRecipe(new ItemStack(Material.RECORD_11, 1));
			recipe25.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe25.setIngredient('A', Material.OBSIDIAN);
			recipe25.setIngredient('B', Material.GOLD_INGOT);
			recipe25.setIngredient('C', Material.DIAMOND);
			getServer().addRecipe(recipe25);
		}
		
		if (getConfig().getBoolean("cyanMusicDisc", true)) {
			ShapedRecipe recipe26 = new ShapedRecipe(new ItemStack(Material.RECORD_5, 1));
			recipe26.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe26.setIngredient('A', Material.OBSIDIAN);
			recipe26.setIngredient('B', Material.GOLD_INGOT);
			recipe26.setIngredient('C', Material.INK_SACK.getNewData((byte)6));
			getServer().addRecipe(recipe26);
		}
		
		if (getConfig().getBoolean("forestGreenMusicDisc", true)) {
			ShapedRecipe recipe27 = new ShapedRecipe(new ItemStack(Material.RECORD_10, 1));
			recipe27.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe27.setIngredient('A', Material.OBSIDIAN);
			recipe27.setIngredient('B', Material.GOLD_INGOT);
			recipe27.setIngredient('C', Material.INK_SACK.getNewData((byte)2));
			getServer().addRecipe(recipe27);
		}
		
		if (getConfig().getBoolean("goldMusicDisc", true)) {
			ShapedRecipe recipe28 = new ShapedRecipe(new ItemStack(Material.GOLD_RECORD, 1));
			recipe28.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe28.setIngredient('A', Material.OBSIDIAN);
			recipe28.setIngredient('B', Material.GOLD_INGOT);
			recipe28.setIngredient('C', Material.INK_SACK.getNewData((byte)11));
			getServer().addRecipe(recipe28);
		}
		
		if (getConfig().getBoolean("greenMusicDisc", true)) {
			ShapedRecipe recipe29 = new ShapedRecipe(new ItemStack(Material.GREEN_RECORD, 1));
			recipe29.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe29.setIngredient('A', Material.OBSIDIAN);
			recipe29.setIngredient('B', Material.GOLD_INGOT);
			recipe29.setIngredient('C', Material.INK_SACK.getNewData((byte)10));
			getServer().addRecipe(recipe29);
		}
		
		if (getConfig().getBoolean("orangeMusicDisc", true)) {
			ShapedRecipe recipe30 = new ShapedRecipe(new ItemStack(Material.RECORD_3, 1));
			recipe30.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe30.setIngredient('A', Material.OBSIDIAN);
			recipe30.setIngredient('B', Material.GOLD_INGOT);
			recipe30.setIngredient('C', Material.INK_SACK.getNewData((byte)14));
			getServer().addRecipe(recipe30);
		}
		
		if (getConfig().getBoolean("purpleMusicDisc", true)) {
			ShapedRecipe recipe31 = new ShapedRecipe(new ItemStack(Material.RECORD_7, 1));
			recipe31.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe31.setIngredient('A', Material.OBSIDIAN);
			recipe31.setIngredient('B', Material.GOLD_INGOT);
			recipe31.setIngredient('C', Material.INK_SACK.getNewData((byte)5));
			getServer().addRecipe(recipe31);
		}
		
		if (getConfig().getBoolean("redMusicDisc", true)) {
			ShapedRecipe recipe32 = new ShapedRecipe(new ItemStack(Material.RECORD_4, 1));
			recipe32.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe32.setIngredient('A', Material.OBSIDIAN);
			recipe32.setIngredient('B', Material.GOLD_INGOT);
			recipe32.setIngredient('C', Material.INK_SACK.getNewData((byte)1));
			getServer().addRecipe(recipe32);
		}
		
		if (getConfig().getBoolean("whiteMusicDisc", true)) {
			ShapedRecipe recipe33 = new ShapedRecipe(new ItemStack(Material.RECORD_9, 1));
			recipe33.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe33.setIngredient('A', Material.OBSIDIAN);
			recipe33.setIngredient('B', Material.GOLD_INGOT);
			recipe33.setIngredient('C', Material.INK_SACK.getNewData((byte)15));
			getServer().addRecipe(recipe33);
		}
		
		if (getConfig().getBoolean("blueMusicDisc", true)) {
			ShapedRecipe recipe34 = new ShapedRecipe(new ItemStack(Material.RECORD_6, 1));
			recipe34.shape(new String[] { "BAB", "ACA", "BAB" });
			recipe34.setIngredient('A', Material.OBSIDIAN);
			recipe34.setIngredient('B', Material.GOLD_INGOT);
			recipe34.setIngredient('C', Material.INK_SACK.getNewData((byte)4));
			getServer().addRecipe(recipe34);
		}
		
		if (getConfig().getBoolean("stick", true)) {
			ShapedRecipe recipe35 = new ShapedRecipe(new ItemStack(Material.STICK, 6));
			recipe35.shape(new String[] { " A ", " A ", " A " });
			recipe35.setIngredient('A', Material.SUGAR_CANE);
			getServer().addRecipe(recipe35);
		}
		
		if (getConfig().getBoolean("wood", true)) {
			ShapedRecipe recipe36 = new ShapedRecipe(new ItemStack(Material.WOOD, 1));
			recipe36.shape(new String[] { "AA ", "AA ", "   " });
			recipe36.setIngredient('A', Material.STICK);
			getServer().addRecipe(recipe36);
		}
		
		if (getConfig().getBoolean("glowstoneDust", true)) {
			ShapelessRecipe recipe37 = new ShapelessRecipe(new ItemStack(Material.GLOWSTONE_DUST, 4));
			recipe37.addIngredient(Material.GLOWSTONE);
			getServer().addRecipe(recipe37);
		}
		
		if (getConfig().getBoolean("fern", true)) {
			ShapedRecipe recipe38 = new ShapedRecipe(new ItemStack(Material.LONG_GRASS, 2, (short)0, (byte)2));
			recipe38.shape(new String[] { "AAA", "AAA", " A " });
			recipe38.setIngredient('A', Material.LEAVES);
			getServer().addRecipe(recipe38);
		}
		
		if (getConfig().getBoolean("vines", true)) {
			ShapedRecipe recipe39 = new ShapedRecipe(new ItemStack(Material.VINE, 2));
			recipe39.shape(new String[] { "AAA", "A A", "A A" });
			recipe39.setIngredient('A', Material.LEAVES);
			getServer().addRecipe(recipe39);
		}
		
		if (getConfig().getBoolean("lilyPad", true)) {
			ShapedRecipe recipe40 = new ShapedRecipe(new ItemStack(Material.WATER_LILY, 2));
			recipe40.shape(new String[] { "A A", "AAA", "AAA" });
			recipe40.setIngredient('A', Material.LEAVES);
			getServer().addRecipe(recipe40);
		}
		
		if (getConfig().getBoolean("tallGrass", true)) {
			ShapedRecipe recipe41 = new ShapedRecipe(new ItemStack(Material.LONG_GRASS, (short)0, (byte)1));
			recipe41.shape(new String[] { "A A", "A A", "AAA" });
			recipe41.setIngredient('A', Material.LEAVES);
			getServer().addRecipe(recipe41);
		}
		
		if (getConfig().getBoolean("ironOre", true)) {
			ShapelessRecipe recipe42 = new ShapelessRecipe(new ItemStack(Material.IRON_ORE, 1));
			recipe42.addIngredient(Material.IRON_INGOT);
			recipe42.addIngredient(Material.STONE);
			getServer().addRecipe(recipe42);
		}
		
		if (getConfig().getBoolean("goldOre", true)) {
			ShapelessRecipe recipe43 = new ShapelessRecipe(new ItemStack(Material.GOLD_ORE, 1));
			recipe43.addIngredient(Material.GOLD_INGOT);
			recipe43.addIngredient(Material.STONE);
			getServer().addRecipe(recipe43);
		}
		
		if (getConfig().getBoolean("redstoneOre", true)) {
			ShapelessRecipe recipe45 = new ShapelessRecipe(new ItemStack(Material.REDSTONE_ORE, 1));
			recipe45.addIngredient(Material.REDSTONE);
			recipe45.addIngredient(Material.REDSTONE);
			recipe45.addIngredient(Material.REDSTONE);
			recipe45.addIngredient(Material.REDSTONE);
			recipe45.addIngredient(Material.REDSTONE);
			recipe45.addIngredient(Material.STONE);
			getServer().addRecipe(recipe45);
		}
		
		if (getConfig().getBoolean("lapisOre", true)) {
			ShapelessRecipe recipe46 = new ShapelessRecipe(new ItemStack(Material.LAPIS_ORE, 1));
			recipe46.addIngredient(Material.INK_SACK.getNewData((byte)4));
			recipe46.addIngredient(Material.INK_SACK.getNewData((byte)4));
			recipe46.addIngredient(Material.INK_SACK.getNewData((byte)4));
			recipe46.addIngredient(Material.INK_SACK.getNewData((byte)4));
			recipe46.addIngredient(Material.INK_SACK.getNewData((byte)4));
			recipe46.addIngredient(Material.INK_SACK.getNewData((byte)4));
			recipe46.addIngredient(Material.INK_SACK.getNewData((byte)4));
			recipe46.addIngredient(Material.INK_SACK.getNewData((byte)4));
			recipe46.addIngredient(Material.STONE);
			getServer().addRecipe(recipe46);
		}
		
		if (getConfig().getBoolean("coalOre", true)) {
			ShapelessRecipe recipe47 = new ShapelessRecipe(new ItemStack(Material.COAL_ORE, 1));
			recipe47.addIngredient(Material.COAL);
			recipe47.addIngredient(Material.STONE);
			getServer().addRecipe(recipe47);
		}
		
		if (getConfig().getBoolean("diamondOre", true)) {
			ShapelessRecipe recipe48bis = new ShapelessRecipe(new ItemStack(Material.DIAMOND_ORE, 1));
			recipe48bis.addIngredient(Material.DIAMOND);
			recipe48bis.addIngredient(Material.STONE);
			getServer().addRecipe(recipe48bis);
		}
		
		if (getConfig().getBoolean("otherLeaves", true)) {
			if (getConfig().getBoolean("apple", true)) {
				ShapedRecipe recipe49 = new ShapedRecipe(new ItemStack(Material.APPLE, 1));
				recipe49.shape(new String[] { "AAA", "ABA", "AAA" });
				recipe49.setIngredient('A', Material.LEAVES.getNewData((byte)2));
				recipe49.setIngredient('B', Material.SUGAR);
				getServer().addRecipe(recipe49);
				
				ShapedRecipe recipe49bis = new ShapedRecipe(new ItemStack(Material.APPLE, 1));
				recipe49bis.shape(new String[] { "AAA", "ABA", "AAA" });
				recipe49bis.setIngredient('A', Material.LEAVES.getNewData((byte)1));
				recipe49bis.setIngredient('B', Material.SUGAR);
				getServer().addRecipe(recipe49bis);
			}
			
		    if (getConfig().getBoolean("fern", true)) {
				ShapedRecipe recipe50 = new ShapedRecipe(new ItemStack(Material.LEAVES, 2, (short)0, (byte)2));
				recipe50.shape(new String[] { "AAA", "AAA", " A " });
				recipe50.setIngredient('A', Material.LEAVES.getNewData((byte)1));
				getServer().addRecipe(recipe50);
				
				ShapedRecipe recipe51 = new ShapedRecipe(new ItemStack(Material.LEAVES, 2, (short)0, (byte)2));
				recipe51.shape(new String[] { "AAA", "AAA", " A " });
				recipe51.setIngredient('A', Material.LEAVES.getNewData((byte)2));
				getServer().addRecipe(recipe51);
		    }
			
		    if (getConfig().getBoolean("tallGrass", true)) {
				ShapedRecipe recipe52 = new ShapedRecipe(new ItemStack(Material.LEAVES, 2, (short)0, (byte)1));
				recipe52.shape(new String[] { "A A", "A A", "AAA" });
				recipe52.setIngredient('A', Material.LEAVES.getNewData((byte)2));
				getServer().addRecipe(recipe52);
				
				ShapedRecipe recipe53 = new ShapedRecipe(new ItemStack(Material.LEAVES, 2, (short)0, (byte)1));
				recipe53.shape(new String[] { "A A", "A A", "AAA" });
				recipe53.setIngredient('A', Material.LEAVES.getNewData((byte)1));
				getServer().addRecipe(recipe53);
		    }
			
		    if (getConfig().getBoolean("vines", true)) {
				ShapedRecipe recipe54 = new ShapedRecipe(new ItemStack(Material.VINE, 2));
				recipe54.shape(new String[] { "AAA", "A A", "A A" });
				recipe54.setIngredient('A', Material.LEAVES.getNewData((byte)2));
				getServer().addRecipe(recipe54);
				
				ShapedRecipe recipe55 = new ShapedRecipe(new ItemStack(Material.VINE, 2));
				recipe55.shape(new String[] { "AAA", "A A", "A A" });
				recipe55.setIngredient('A', Material.LEAVES.getNewData((byte)1));
				getServer().addRecipe(recipe55);
		    }
			
		    if (getConfig().getBoolean("lilyPad", true)) {
				ShapedRecipe recipe56 = new ShapedRecipe(new ItemStack(Material.WATER_LILY, 2));
				recipe56.shape(new String[] { "A A", "AAA", "AAA" });
				recipe56.setIngredient('A', Material.LEAVES.getNewData((byte)1));
				getServer().addRecipe(recipe56);
				
				ShapedRecipe recipe57 = new ShapedRecipe(new ItemStack(Material.WATER_LILY, 2));
				recipe57.shape(new String[] { "A A", "AAA", "AAA" });
				recipe57.setIngredient('A', Material.LEAVES.getNewData((byte)2));
				getServer().addRecipe(recipe57);
		    }
		}
		
		if (getConfig().getBoolean("blazeRod", true)) {
			ShapedRecipe recipe61 = new ShapedRecipe(new ItemStack(Material.BLAZE_ROD, 1));
			recipe61.shape(new String[] { "AAB", "ABA", "BAA" });
			recipe61.setIngredient('A', Material.REDSTONE);
			recipe61.setIngredient('B', Material.GOLD_INGOT);
			getServer().addRecipe(recipe61);
		}
		
		if (getConfig().getBoolean("slimeball", true)) {
			ShapedRecipe recipe62 = new ShapedRecipe(new ItemStack(Material.SLIME_BALL, 1));
			recipe62.shape(new String[] { " C ", "BAB", "   " });
			recipe62.setIngredient('A', Material.MILK_BUCKET);
			recipe62.setIngredient('B', Material.INK_SACK.getNewData((byte)10));
			recipe62.setIngredient('C', Material.FERMENTED_SPIDER_EYE);
			getServer().addRecipe(recipe62);
		}
		
		if (getConfig().getBoolean("ghastTear", true)) {
			ShapedRecipe recipe63 = new ShapedRecipe(new ItemStack(Material.GHAST_TEAR, 1));
			recipe63.shape(new String[] { "AAA", "ABA", "AAA" });
			recipe63.setIngredient('A', Material.IRON_INGOT);
			recipe63.setIngredient('B', Material.GOLD_NUGGET);
			getServer().addRecipe(recipe63);
		}
		
		if (getConfig().getBoolean("netherWart", true)) {
			ShapedRecipe recipe64 = new ShapedRecipe(new ItemStack(Material.NETHER_STALK, 1));
			recipe64.shape(new String[] { "AAA", "ABA", "ACA" });
			recipe64.setIngredient('A', Material.REDSTONE);
			recipe64.setIngredient('B', Material.RED_MUSHROOM);
			recipe64.setIngredient('C', Material.BROWN_MUSHROOM);
			getServer().addRecipe(recipe64);
		}
		
		if (getConfig().getBoolean("gunpowder", true)) {
			ShapedRecipe recipe65 = new ShapedRecipe(new ItemStack(Material.SULPHUR, 2));
			recipe65.shape(new String[] { " A ", "AAA", " A " });
			recipe65.setIngredient('A', Material.SOUL_SAND);
			getServer().addRecipe(recipe65);
		}
		
		if (getConfig().getBoolean("enderPearl", true)) {
			ShapedRecipe recipe66 = new ShapedRecipe(new ItemStack(Material.ENDER_PEARL, 1));
			recipe66.shape(new String[] { "AAA", "ABA", "AAA" });
			recipe66.setIngredient('A', Material.INK_SACK.getNewData((byte)4));
			recipe66.setIngredient('B', Material.GLASS_BOTTLE);
			getServer().addRecipe(recipe66);
		}
		
	    if (getConfig().getBoolean("allMonsterEggs", true)) {
	    	if (getConfig().getBoolean("monsterEggs.creeper", true)) {
		    	ShapedRecipe recipe67 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)50));
		        recipe67.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe67.setIngredient('A', Material.SULPHUR);
		        recipe67.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe67);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.skeleton", true)) {
		        ShapedRecipe recipe68 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)51));
		        recipe68.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe68.setIngredient('A', Material.BONE);
		        recipe68.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe68);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.spider", true)) {
		        ShapedRecipe recipe69 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)52));
		        recipe69.shape(new String[] { "ACA", "CBC", "ACA" });
		        recipe69.setIngredient('A', Material.STRING);
		        recipe69.setIngredient('B', Material.EGG);
		        recipe69.setIngredient('C', Material.SPIDER_EYE);
		        getServer().addRecipe(recipe69);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.giant", true)) {
		        ShapedRecipe recipe70 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)53));
		        recipe70.shape(new String[] { "ACA", "CBC", "ACA" });
		        recipe70.setIngredient('A', Material.ROTTEN_FLESH);
		        recipe70.setIngredient('B', Material.EGG);
		        recipe70.setIngredient('C', Material.GOLD_INGOT);
		        getServer().addRecipe(recipe70);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.zombie", true)) {
		        ShapedRecipe recipe71 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)54));
		        recipe71.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe71.setIngredient('A', Material.ROTTEN_FLESH);
		        recipe71.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe71);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.slime", true)) {
		        ShapedRecipe recipe72 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)55));
		        recipe72.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe72.setIngredient('A', Material.SLIME_BALL);
		        recipe72.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe72);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.ghast", true)) {
		        ShapedRecipe recipe73 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)56));
		        recipe73.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe73.setIngredient('A', Material.GHAST_TEAR);
		        recipe73.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe73);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.pigzombie", true)) {
		        ShapedRecipe recipe74 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)57));
		        recipe74.shape(new String[] { "ACA", "CBC", "ACA" });
		        recipe74.setIngredient('A', Material.ROTTEN_FLESH);
		        recipe74.setIngredient('B', Material.EGG);
		        recipe74.setIngredient('C', Material.PORK);
		        getServer().addRecipe(recipe74);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.enderman", true)) {
		        ShapedRecipe recipe75 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)58));
		        recipe75.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe75.setIngredient('A', Material.ENDER_PEARL);
		        recipe75.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe75);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.cavespider", true)) {
		        ShapedRecipe recipe76 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)59));
		        recipe76.shape(new String[] { "ACA", "CBC", "ACA" });
		        recipe76.setIngredient('A', Material.SPIDER_EYE);
		        recipe76.setIngredient('B', Material.EGG);
		        recipe76.setIngredient('C', Material.STRING);
		        getServer().addRecipe(recipe76);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.silverfish", true)) {
		        ShapedRecipe recipe77 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)60));
		        recipe77.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe77.setIngredient('A', Material.IRON_INGOT);
		        recipe77.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe77);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.blaze", true)) {
		        ShapedRecipe recipe78 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)61));
		        recipe78.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe78.setIngredient('A', Material.BLAZE_ROD);
		        recipe78.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe78);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.magmacube", true)) {
		        ShapedRecipe recipe79 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)62));
		        recipe79.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe79.setIngredient('A', Material.MAGMA_CREAM);
		        recipe79.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe79);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.pig", true)) {
		        ShapedRecipe recipe81 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)90));
		        recipe81.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe81.setIngredient('A', Material.PORK);
		        recipe81.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe81);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.sheep", true)) {
		        ShapedRecipe recipe82 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)91));
		        recipe82.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe82.setIngredient('A', Material.WOOL);
		        recipe82.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe82);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.cow", true)) {
		        ShapedRecipe recipe83 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)92));
		        recipe83.shape(new String[] { "ACA", "CBC", "ACA" });
		        recipe83.setIngredient('A', Material.RAW_BEEF);
		        recipe83.setIngredient('B', Material.EGG);
		        recipe83.setIngredient('C', Material.LEATHER);
		        getServer().addRecipe(recipe83);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.chicken", true)) {
		        ShapedRecipe recipe84 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)93));
		        recipe84.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe84.setIngredient('A', Material.FEATHER);
		        recipe84.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe84);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.squid", true)) {
		        ShapedRecipe recipe85 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)94));
		        recipe85.shape(new String[] { "AAA", "ABA", "AAA" });
		        recipe85.setIngredient('A', Material.INK_SACK);
		        recipe85.setIngredient('B', Material.EGG);
		        getServer().addRecipe(recipe85);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.wolf", true)) {
		        ShapedRecipe recipe86 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)95));
		        recipe86.shape(new String[] { "ACA", "CBC", "ACA" });
		        recipe86.setIngredient('A', Material.WOOL);
		        recipe86.setIngredient('B', Material.EGG);
		        recipe86.setIngredient('C', Material.BONE);
		        getServer().addRecipe(recipe86);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.mooshroom", true)) {
		        ShapedRecipe recipe87 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)96));
		        recipe87.shape(new String[] { "ACA", "CBC", "ACA" });
		        recipe87.setIngredient('A', Material.RAW_BEEF);
		        recipe87.setIngredient('B', Material.EGG);
		        recipe87.setIngredient('C', Material.RED_MUSHROOM);
		        getServer().addRecipe(recipe87);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.snowgolem", true)) {
		        ShapedRecipe recipe88 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)97));
		        recipe88.shape(new String[] { "ACA", "ABA", "AAA" });
		        recipe88.setIngredient('A', Material.SNOW_BALL);
		        recipe88.setIngredient('B', Material.EGG);
		        recipe88.setIngredient('C', Material.PUMPKIN);
		        getServer().addRecipe(recipe88);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.ocelot", true)) {
		        ShapedRecipe recipe89 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)98));
		        recipe89.shape(new String[] { "ACA", "CBC", "ACA" });
		        recipe89.setIngredient('A', Material.WOOL);
		        recipe89.setIngredient('B', Material.EGG);
		        recipe89.setIngredient('C', Material.RAW_FISH);
		        getServer().addRecipe(recipe89);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.irongolem", true)) {
		        ShapedRecipe recipe90 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)99));
		        recipe90.shape(new String[] { " A ", "CBC", "C C" });
		        recipe90.setIngredient('A', Material.PUMPKIN);
		        recipe90.setIngredient('B', Material.EGG);
		        recipe90.setIngredient('C', Material.IRON_BLOCK);
		        getServer().addRecipe(recipe90);
	    	}
	        
	    	if (getConfig().getBoolean("monsterEggs.villager", true)) {
		        ShapedRecipe recipe92 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)0, (byte)120));
		        recipe92.shape(new String[] { "ACA", "CBC", "ACA" });
		        recipe92.setIngredient('A', Material.PORK);
		        recipe92.setIngredient('B', Material.EGG);
		        recipe92.setIngredient('C', Material.LEATHER);
		        getServer().addRecipe(recipe92);
	    	}
		}
	}

}
