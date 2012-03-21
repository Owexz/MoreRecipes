/*
 *  Copyright 2012 Owexz.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package net.owexz.morerecipes;
 
import java.io.File;

import java.util.logging.Logger;
import net.owexz.morerecipes.CompressedCoalBlock;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.*;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.MaterialData;
 
 
public class MoreRecipes extends JavaPlugin
{
 
    public MoreRecipes()
    {
		log = Logger.getLogger("Minecraft");
		compressedcoalBlockTexture = new Texture(this, "http://www.owexz.net/uploads/1/4/8/5/1485487/578122832.png", 64, 16, 16);
    }
 
	public void onEnable() {
    	compressedcoalBlock = new CompressedCoalBlock(this);
		File configFile = new File(getDataFolder(), "config.yml");
		if (!configFile.exists()) {
		    saveDefaultConfig();
		}
		reloadConfig();

		if (getConfig().getBoolean("web", true)) {
			SpoutShapedRecipe recipe2 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.web, 1));
			recipe2.shape("AAA", "AAA", "AAA");
			recipe2.setIngredient('A', MaterialData.string);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		}
		
		if (getConfig().getBoolean("string", true)) {
			SpoutShapelessRecipe recipe3 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.string, 2));
			recipe3.addIngredient(MaterialData.whiteWool);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		}
		
		if (getConfig().getBoolean("chainBoots", true)) {
		SpoutShapedRecipe recipe4 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.chainBoots, 1));
				recipe4.shape("C C", "B B", "A A");
			recipe4.setIngredient('A', MaterialData.ironIngot);
			recipe4.setIngredient('B', MaterialData.string);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe4);
		}

		if (getConfig().getBoolean("chainLeggings", true)) {
			SpoutShapedRecipe recipe5 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.chainLeggings, 1));
			recipe5.shape("ABA", "B B", "A A");
			recipe5.setIngredient('A', MaterialData.ironIngot);
			recipe5.setIngredient('B', MaterialData.string);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe5);
		}
		
		if (getConfig().getBoolean("chainChestplate", true)) {
			SpoutShapedRecipe recipe6 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.chainChestplate, 1));
			recipe6.shape("A A", "BAB", "ABA");
			recipe6.setIngredient('A', MaterialData.ironIngot);
			recipe6.setIngredient('B', MaterialData.string);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe6);
		}

		if (getConfig().getBoolean("chainHelmet", true)) {
			SpoutShapedRecipe recipe7 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.chainHelmet, 1));
			recipe7.shape("BAB", "A A");
			recipe7.setIngredient('A', MaterialData.ironIngot);
			recipe7.setIngredient('B', MaterialData.string);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe7);
		}

		if (getConfig().getBoolean("netherBrick", true)) {
			SpoutShapedRecipe recipe8 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.netherBrick, 1));
			recipe8.shape("AA ", "AA ", "   ");
			recipe8.setIngredient('A', MaterialData.netherrack);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe8);
		}

		if (getConfig().getBoolean("saddle", true)) {
			SpoutShapedRecipe recipe9 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.saddle, 1));
			recipe9.shape(" A ", "BAB", "CAC");
			recipe9.setIngredient('A', MaterialData.leather);
			recipe9.setIngredient('B', MaterialData.ironIngot);
			recipe9.setIngredient('C', MaterialData.string);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe9);
		}

		if (getConfig().getBoolean("grass", true)) {
			SpoutShapelessRecipe recipe10 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.grass, 1));
			recipe10.addIngredient(MaterialData.seeds);
			recipe10.addIngredient(MaterialData.dirt);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe10);
		}

		if (getConfig().getBoolean("mossStone", true)) {
			SpoutShapedRecipe recipe11 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.mossStone, 5));
			recipe11.shape("ABA", "BAB", "ABA");
			recipe11.setIngredient('A', MaterialData.cobblestone);
			recipe11.setIngredient('B', MaterialData.seeds);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe11);
		}

		if (getConfig().getBoolean("ice", true)) {
			SpoutShapedRecipe recipe12 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.ice, 3));
			recipe12.shape("AAA", "ABA", "AAA");
			recipe12.setIngredient('A', MaterialData.snowball);
			recipe12.setIngredient('B', MaterialData.waterBucket);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe12);
		}

		if (getConfig().getBoolean("mycelium", true)) {
			SpoutShapelessRecipe recipe13 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.mycelium, 2));
			recipe13.addIngredient(MaterialData.brownMushroom);
			recipe13.addIngredient(MaterialData.redMushroom);
			recipe13.addIngredient(MaterialData.dirt);
			recipe13.addIngredient(MaterialData.dirt);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe13);
		}

		if (getConfig().getBoolean("crackedStoneBrick", true)) {
			SpoutShapedRecipe recipe14 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.crackedStoneBricks, 5));
			recipe14.shape("ABA", "BAB", "ABA");
			recipe14.setIngredient('A', MaterialData.stoneBricks);
			recipe14.setIngredient('B', MaterialData.flint);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe14);
		}

		if (getConfig().getBoolean("mossyStoneBricks", true)) {
			SpoutShapedRecipe recipe15 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.mossyStoneBricks, 5));
			recipe15.shape("ABA", "BAB", "ABA");
			recipe15.setIngredient('A', MaterialData.stoneBricks);
			recipe15.setIngredient('B', MaterialData.seeds);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe15);
		}

		if (getConfig().getBoolean("sand", true)) {
			SpoutShapelessRecipe recipe18 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.sand, 4));
			recipe18.addIngredient(MaterialData.sandstone);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe18);
		}

		if (getConfig().getBoolean("clay", true)) {
			SpoutShapelessRecipe recipe19 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.clay, 4));
			recipe19.addIngredient(MaterialData.clayBlock);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe19);
		}

		if (getConfig().getBoolean("apple", true)) {
			SpoutShapedRecipe recipe20 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.redApple, 1));
			recipe20.shape("AAA", "ABA", "AAA");
			recipe20.setIngredient('A', MaterialData.leaves);
			recipe20.setIngredient('B', MaterialData.sugar);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe20);
		}

		if (getConfig().getBoolean("clayBlock", true)) {
			SpoutShapedRecipe recipe21 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.clayBlock, 9));
			recipe21.shape("AAA", "BBB", "CCC");
			recipe21.setIngredient('A', MaterialData.sand);
			recipe21.setIngredient('B', MaterialData.gravel);
			recipe21.setIngredient('C', MaterialData.dirt);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe21);
		}

		if (getConfig().getBoolean("sponge", true)) {
			SpoutShapedRecipe recipe22 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.sponge, 1));
			recipe22.shape("BAB", "ABA", "BAB");
			recipe22.setIngredient('A', MaterialData.sand);
			recipe22.setIngredient('B', MaterialData.string);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe22);
		}

		if (getConfig().getBoolean("cocoaBeans", true)) {
			SpoutShapedRecipe recipe23 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.cocoaBeans, 2));
			recipe23.shape("AAA", "ABA", "AAA");
			recipe23.setIngredient('A', MaterialData.sugar);
			recipe23.setIngredient('B', MaterialData.cocoaBeans);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe23);
		}

		if (getConfig().getBoolean("blackMusicDisc", true)) {
			SpoutShapedRecipe recipe24 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.blackMusicDisc, 1));
			recipe24.shape("BAB", "ACA", "BAB");
			recipe24.setIngredient('A', MaterialData.obsidian);
			recipe24.setIngredient('B', MaterialData.goldIngot);
			recipe24.setIngredient('C', MaterialData.inkSac);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe24);
		}

		if (getConfig().getBoolean("brokenMusicDisc", true)) {
			SpoutShapedRecipe recipe25 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.brokenMusicDisc, 1));
			recipe25.shape("BAB", "ACA", "BAB");
			recipe25.setIngredient('A', MaterialData.obsidian);
			recipe25.setIngredient('B', MaterialData.goldIngot);
			recipe25.setIngredient('C', MaterialData.diamond);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe25);
		}

		if (getConfig().getBoolean("cyanMusicDisc", true)) {
			SpoutShapedRecipe recipe26 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.cyanMusicDisc, 1));
			recipe26.shape("BAB", "ACA", "BAB");
			recipe26.setIngredient('A', MaterialData.obsidian);
			recipe26.setIngredient('B', MaterialData.goldIngot);
			recipe26.setIngredient('C', MaterialData.cyanDye);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe26);
		}

		if (getConfig().getBoolean("forestGreenMusicDisc", true)) {
			SpoutShapedRecipe recipe27 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.forestGreenMusicDisc, 1));
			recipe27.shape("BAB", "ACA", "BAB");
			recipe27.setIngredient('A', MaterialData.obsidian);
			recipe27.setIngredient('B', MaterialData.goldIngot);
			recipe27.setIngredient('C', MaterialData.cactusGreen);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe27);
		}

		if (getConfig().getBoolean("goldMusicDisc", true)) {
			SpoutShapedRecipe recipe28 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.goldMusicDisc, 1));
			recipe28.shape("BAB", "ACA", "BAB");
			recipe28.setIngredient('A', MaterialData.obsidian);
			recipe28.setIngredient('B', MaterialData.goldIngot);
			recipe28.setIngredient('C', MaterialData.dandelionYellow);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe28);
		}

		if (getConfig().getBoolean("greenMusicDisc", true)) {
			SpoutShapedRecipe recipe29 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.greenMusicDisc, 1));
			recipe29.shape("BAB", "ACA", "BAB");
			recipe29.setIngredient('A', MaterialData.obsidian);
			recipe29.setIngredient('B', MaterialData.goldIngot);
			recipe29.setIngredient('C', MaterialData.limeDye);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe29);
		}

		if (getConfig().getBoolean("orangeMusicDisc", true)) {
			SpoutShapedRecipe recipe30 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.orangeMusicDisc, 1));
			recipe30.shape("BAB", "ACA", "BAB");
			recipe30.setIngredient('A', MaterialData.obsidian);
			recipe30.setIngredient('B', MaterialData.goldIngot);
			recipe30.setIngredient('C', MaterialData.orangeDye);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe30);
		}

		if (getConfig().getBoolean("purpleMusicDisc", true)) {
			SpoutShapedRecipe recipe31 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.purpleMusicDisc, 1));
			recipe31.shape("BAB", "ACA", "BAB");
			recipe31.setIngredient('A', MaterialData.obsidian);
			recipe31.setIngredient('B', MaterialData.goldIngot);
			recipe31.setIngredient('C', MaterialData.purpleDye);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe31);
		}

		if (getConfig().getBoolean("redMusicDisc", true)) {
			SpoutShapedRecipe recipe32 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.redMusicDisc, 1));
			recipe32.shape("BAB", "ACA", "BAB");
			recipe32.setIngredient('A', MaterialData.obsidian);
			recipe32.setIngredient('B', MaterialData.goldIngot);
			recipe32.setIngredient('C', MaterialData.roseRed);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe32);
		}

		if (getConfig().getBoolean("whiteMusicDisc", true)) {
			SpoutShapedRecipe recipe33 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.whiteMusicDisc, 1));
			recipe33.shape("BAB", "ACA", "BAB");
			recipe33.setIngredient('A', MaterialData.obsidian);
			recipe33.setIngredient('B', MaterialData.goldIngot);
			recipe33.setIngredient('C', MaterialData.boneMeal);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe33);
		}

		if (getConfig().getBoolean("blueMusicDisc", true)) {
			SpoutShapedRecipe recipe34 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.blueMusicDisc, 1));
			recipe34.shape("BAB", "ACA", "BAB");
			recipe34.setIngredient('A', MaterialData.obsidian);
			recipe34.setIngredient('B', MaterialData.goldIngot);
			recipe34.setIngredient('C', MaterialData.lapisLazuli);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe34);
		}

		if (getConfig().getBoolean("stick", true)) {
			SpoutShapedRecipe recipe35 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.stick, 6));
			recipe35.shape(" A ", " A ", " A ");
			recipe35.setIngredient('A', MaterialData.sugarCane);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe35);
		}

		if (getConfig().getBoolean("wood", true)) {
			SpoutShapedRecipe recipe36 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.wood, 1));
			recipe36.shape("AA ", "AA ", "   ");
			recipe36.setIngredient('A', MaterialData.stick);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe36);
		}

		if (getConfig().getBoolean("glowstoneDust", true)) {
			SpoutShapelessRecipe recipe37 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.glowstoneDust, 4));
			recipe37.addIngredient(MaterialData.glowstoneBlock);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe37);
		}
		
		if (getConfig().getBoolean("fern", true)) {
			SpoutShapedRecipe recipe38 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.fern, 2));
			recipe38.shape("AAA", "AAA", " A ");
			recipe38.setIngredient('A', MaterialData.leaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe38);
		}

		if (getConfig().getBoolean("vines", true)) {
			SpoutShapedRecipe recipe39 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.vines, 2));
			recipe39.shape("AAA", "A A", "A A");
			recipe39.setIngredient('A', MaterialData.leaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe39);
		}

		if (getConfig().getBoolean("lilyPad", true)) {
			SpoutShapedRecipe recipe40 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.lilyPad, 2));
			recipe40.shape("A A", "AAA", "AAA");
			recipe40.setIngredient('A', MaterialData.leaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe40);
		}

		if (getConfig().getBoolean("tallGrass", true)) {
			SpoutShapedRecipe recipe41 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.tallGrass, 2));
			recipe41.shape("A A", "A A", "AAA");
			recipe41.setIngredient('A', MaterialData.leaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe41);
		}

		if (getConfig().getBoolean("ironOre", true)) {
			SpoutShapelessRecipe recipe42 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.ironOre, 1));
			recipe42.addIngredient(MaterialData.ironIngot);
			recipe42.addIngredient(MaterialData.stone);
			getServer().addRecipe(recipe42);
		}

		if (getConfig().getBoolean("goldOre", true)) {
				SpoutShapelessRecipe recipe43 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.goldOre, 1));
			recipe43.addIngredient(MaterialData.goldIngot);
			recipe43.addIngredient(MaterialData.stone);
			getServer().addRecipe(recipe43);
		}

		if (getConfig().getBoolean("redstoneOre", true)) {
			SpoutShapelessRecipe recipe45 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.redstoneOre, 1));
			recipe45.addIngredient(MaterialData.redstone);
			recipe45.addIngredient(MaterialData.redstone);
			recipe45.addIngredient(MaterialData.redstone);
			recipe45.addIngredient(MaterialData.redstone);
			recipe45.addIngredient(MaterialData.redstone);
			recipe45.addIngredient(MaterialData.stone);
			getServer().addRecipe(recipe45);
		}

		if (getConfig().getBoolean("lapisOre", true)) {
			SpoutShapelessRecipe recipe46 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.lapisOre, 1));
			recipe46.addIngredient(MaterialData.lapisLazuli);
			recipe46.addIngredient(MaterialData.lapisLazuli);
			recipe46.addIngredient(MaterialData.lapisLazuli);
			recipe46.addIngredient(MaterialData.lapisLazuli);
			recipe46.addIngredient(MaterialData.lapisLazuli);
			recipe46.addIngredient(MaterialData.lapisLazuli);
			recipe46.addIngredient(MaterialData.lapisLazuli);
			recipe46.addIngredient(MaterialData.lapisLazuli);
			recipe46.addIngredient(MaterialData.stone);
			getServer().addRecipe(recipe46);
		}

		if (getConfig().getBoolean("coalOre", true)) {
			SpoutShapelessRecipe recipe47 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.coalOre, 1));
			recipe47.addIngredient(MaterialData.coal);
			recipe47.addIngredient(MaterialData.stone);
			getServer().addRecipe(recipe47);
		}

		if (getConfig().getBoolean("diamondOre", true)) {
			SpoutShapelessRecipe recipe48 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.diamondOre, 1));
			recipe48.addIngredient(MaterialData.diamond);
			recipe48.addIngredient(MaterialData.stone);
			getServer().addRecipe(recipe48);
		}

		if (getConfig().getBoolean("apple", true)) {
			SpoutShapedRecipe recipe48 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.redApple, 1));
			recipe48.shape("AAA", "ABA", "AAA");
			recipe48.setIngredient('A', MaterialData.spruceLeaves);
			recipe48.setIngredient('B', MaterialData.sugar);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe48);
		}

		if (getConfig().getBoolean("apple", true)) {
			SpoutShapedRecipe recipe49 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.redApple, 1));
			recipe49.shape("AAA", "ABA", "AAA");
			recipe49.setIngredient('A', MaterialData.birchLeaves);
			recipe49.setIngredient('B', MaterialData.sugar);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe49);
		}

		if (getConfig().getBoolean("fern", true)) {
			SpoutShapedRecipe recipe50 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.fern, 2));
			recipe50.shape("AAA", "AAA", " A ");
			recipe50.setIngredient('A', MaterialData.spruceLeaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe50);
		}

		if (getConfig().getBoolean("fern", true)) {
			SpoutShapedRecipe recipe51 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.fern, 2));
			recipe51.shape("AAA", "AAA", " A ");
			recipe51.setIngredient('A', MaterialData.birchLeaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe51);
		}

		if (getConfig().getBoolean("tallGrass", true)) {
			SpoutShapedRecipe recipe52 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.tallGrass, 2));
			recipe52.shape("A A", "A A", "AAA");
			recipe52.setIngredient('A', MaterialData.birchLeaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe52);
		}

		if (getConfig().getBoolean("tallGrass", true)) {
			SpoutShapedRecipe recipe53 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.tallGrass, 2));
			recipe53.shape("A A", "A A", "AAA");
			recipe53.setIngredient('A', MaterialData.spruceLeaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe53);
		}
		
		if (getConfig().getBoolean("vines", true)) {
			SpoutShapedRecipe recipe54 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.vines, 2));
			recipe54.shape("AAA", "A A", "A A");
			recipe54.setIngredient('A', MaterialData.birchLeaves);
		}
		
		if (getConfig().getBoolean("vines", true)) {
			SpoutShapedRecipe recipe55 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.vines, 2));
			recipe55.shape("AAA", "A A", "A A");
			recipe55.setIngredient('A', MaterialData.spruceLeaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe55);
		}
		
		if (getConfig().getBoolean("lilyPad", true)) {
			SpoutShapedRecipe recipe56 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.lilyPad, 2));
			recipe56.shape("A A", "AAA", "AAA");
			recipe56.setIngredient('A', MaterialData.spruceLeaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe56);
		}
		
		if (getConfig().getBoolean("lilyPad", true)) {
			SpoutShapedRecipe recipe57 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.lilyPad, 2));
			recipe57.shape("A A", "AAA", "AAA");
			recipe57.setIngredient('A', MaterialData.leaves);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe57);
		}
		
		if (getConfig().getBoolean("diamond", true)) {
			SpoutShapedRecipe recipe58 = new SpoutShapedRecipe(new SpoutItemStack(compressedcoalBlock, 1));
			recipe58.shape("AAA", "ABA", "AAA");
			recipe58.setIngredient('A', MaterialData.coal);
			recipe58.setIngredient('B', MaterialData.obsidian);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe58);
		}
		
		if (getConfig().getBoolean("diamond", true)) {
			SpoutShapedRecipe recipe1S = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.diamond, 1));
			recipe1S.shape(" B ", "BAB", " B ");
			recipe1S.setIngredient('A', MaterialData.obsidian);
			recipe1S.setIngredient('B', compressedcoalBlock);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1S);
		}
		
		if (getConfig().getBoolean("diamond", true)) {
			SpoutShapedRecipe recipe2S = new SpoutShapedRecipe(new SpoutItemStack(compressedcoalBlock, 1));
			recipe2S.shape("AAA", "ABA", "AAA");
			recipe2S.setIngredient('A', MaterialData.charcoal);
			recipe2S.setIngredient('B', MaterialData.obsidian);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2S);
		}
		
		if (getConfig().getBoolean("diamond", true)) {
			SpoutShapedRecipe recipe60 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.diamond, 1));
			recipe60.shape(" B ", "BAB", " B ");
			recipe60.setIngredient('A', MaterialData.obsidian);
			recipe60.setIngredient('B', compressedcoalBlock);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe60);
		}
		
		if (getConfig().getBoolean("blazeRod", true)) {
			SpoutShapedRecipe recipe61= new SpoutShapedRecipe(new SpoutItemStack(MaterialData.blazeRod, 1));
			recipe61.shape("AAB", "ABA", "BAA");
			recipe61.setIngredient('A', MaterialData.redstone);
			recipe61.setIngredient('B', MaterialData.goldIngot);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe61);
		}
		
		if (getConfig().getBoolean("slimeball", true)) {
			SpoutShapedRecipe recipe62 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.slimeball, 1));
			recipe62.shape(" C ", "BAB", "   ");
			recipe62.setIngredient('A', MaterialData.milk);
			recipe62.setIngredient('B', MaterialData.limeDye);
			recipe62.setIngredient('C', MaterialData.fermentedSpiderEye);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe62);
		}
		
		if (getConfig().getBoolean("ghastTear", true)) {
			SpoutShapedRecipe recipe63= new SpoutShapedRecipe(new SpoutItemStack(MaterialData.ghastTear, 1));
			recipe63.shape("AAA", "ABA", "AAA");
			recipe63.setIngredient('A', MaterialData.ironIngot);
			recipe63.setIngredient('B', MaterialData.goldNugget);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe63);
		}
		
			if (getConfig().getBoolean("netherWart", true)) {
			SpoutShapelessRecipe recipe64= new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.netherWart,3));
			recipe64.addIngredient(MaterialData.rottenFlesh);
			recipe64.addIngredient(MaterialData.redMushroom);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe64);
		}
		
		if (getConfig().getBoolean("gunpowder", true)) {
			SpoutShapedRecipe recipe65= new SpoutShapedRecipe(new SpoutItemStack(MaterialData.gunpowder, 2));
			recipe65.shape(" A ", "AAA", " A ");
			recipe65.setIngredient('A', MaterialData.soulSand);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe65);
		}
		
		if (getConfig().getBoolean("enderPearl", true)) {
			SpoutShapedRecipe recipe66= new SpoutShapedRecipe(new SpoutItemStack(MaterialData.enderPearl, 1));
			recipe66.shape("AAA", "ABA", "AAA");
			recipe66.setIngredient('A', MaterialData.lapisLazuli);
			recipe66.setIngredient('B', MaterialData.glassBottle);
			SpoutManager.getMaterialManager().registerSpoutRecipe(recipe66);
		}
		
		if (getConfig().getBoolean("MonsterEggs", true)) {
			ShapedRecipe recipe67 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)50));
			recipe67.shape("AAA", "ABA", "AAA");
			recipe67.setIngredient('A', Material.SULPHUR);
			recipe67.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe67);
			ShapedRecipe recipe68 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)51));
			recipe68.shape("AAA", "ABA", "AAA");
			recipe68.setIngredient('A', Material.BONE);
			recipe68.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe68);
			ShapedRecipe recipe69 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)52));
			recipe69.shape("ACA", "CBC", "ACA");
			recipe69.setIngredient('A', Material.STRING);
			recipe69.setIngredient('B', Material.EGG);
			recipe69.setIngredient('C', Material.SPIDER_EYE);
			Bukkit.getServer().addRecipe(recipe69);
			ShapedRecipe recipe70 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)53));
			recipe70.shape("ACA", "CBC", "ACA");
			recipe70.setIngredient('A', Material.ROTTEN_FLESH);
			recipe70.setIngredient('B', Material.EGG);
			recipe70.setIngredient('C', Material.GOLD_INGOT);
			Bukkit.getServer().addRecipe(recipe70);
			ShapedRecipe recipe71 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)54));
			recipe71.shape("AAA", "ABA", "AAA");
			recipe71.setIngredient('A', Material.ROTTEN_FLESH);
			recipe71.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe71);
			ShapedRecipe recipe72 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)55));
			recipe72.shape("AAA", "ABA", "AAA");
			recipe72.setIngredient('A', Material.SLIME_BALL);
			recipe72.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe72);
			ShapedRecipe recipe73 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)56));
			recipe73.shape("AAA", "ABA", "AAA");
			recipe73.setIngredient('A', Material.GHAST_TEAR);
			recipe73.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe73);
			ShapedRecipe recipe74 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)57));
			recipe74.shape("ACA", "CBC", "ACA");
			recipe74.setIngredient('A', Material.ROTTEN_FLESH);
			recipe74.setIngredient('B', Material.EGG);
			recipe74.setIngredient('C', Material.PORK);
			Bukkit.getServer().addRecipe(recipe74);
			ShapedRecipe recipe75 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)58));
			recipe75.shape("AAA", "ABA", "AAA");
			recipe75.setIngredient('A', Material.ENDER_PEARL);
			recipe75.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe75);
			ShapedRecipe recipe76 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)59));
			recipe76.shape("ACA", "CBC", "ACA");
			recipe76.setIngredient('A', Material.SPIDER_EYE);
			recipe76.setIngredient('B', Material.EGG);
			recipe76.setIngredient('C', Material.STRING);
			Bukkit.getServer().addRecipe(recipe76);
			ShapedRecipe recipe77 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)60));
			recipe77.shape("AAA", "ABA", "AAA");
			recipe77.setIngredient('A', Material.IRON_INGOT);
			recipe77.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe77);
			ShapedRecipe recipe78 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)61));
			recipe78.shape("AAA", "ABA", "AAA");
			recipe78.setIngredient('A', Material.BLAZE_ROD);
			recipe78.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe78);
			ShapedRecipe recipe79 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)62));
			recipe79.shape("AAA", "ABA", "AAA");
			recipe79.setIngredient('A', Material.MAGMA_CREAM);
			recipe79.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe79);
			ShapedRecipe recipe80 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 0, (short)63));
			recipe80.shape("AAA", "ABA", "AAA");
			recipe80.setIngredient('A', Material.DRAGON_EGG);
			recipe80.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe80);
			ShapedRecipe recipe81 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)90));
			recipe81.shape("AAA", "ABA", "AAA");
			recipe81.setIngredient('A', Material.PORK);
			recipe81.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe81);
			ShapedRecipe recipe82 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)91));
			recipe82.shape("AAA", "ABA", "AAA");
			recipe82.setIngredient('A', Material.WOOL);
			recipe82.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe82);
			ShapedRecipe recipe83 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)92));
			recipe83.shape("ACA", "CBC", "ACA");
			recipe83.setIngredient('A', Material.RAW_BEEF);
			recipe83.setIngredient('B', Material.EGG);
			recipe83.setIngredient('C', Material.LEATHER);
			Bukkit.getServer().addRecipe(recipe83);
			ShapedRecipe recipe84 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)93));
			recipe84.shape("AAA", "ABA", "AAA");
			recipe84.setIngredient('A', Material.FEATHER);
			recipe84.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe84);
			ShapedRecipe recipe85 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)94));
			recipe85.shape("AAA", "ABA", "AAA");
			recipe85.setIngredient('A', Material.INK_SACK);
			recipe85.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe85);
			ShapedRecipe recipe86 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)95));
			recipe86.shape("ACA", "CBC", "ACA");
			recipe86.setIngredient('A', Material.WOOL);
			recipe86.setIngredient('B', Material.EGG);
			recipe86.setIngredient('C', Material.BONE);
			Bukkit.getServer().addRecipe(recipe86);
			ShapedRecipe recipe87 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)96));
			recipe87.shape("ACA", "CBC", "ACA");
			recipe87.setIngredient('A', Material.RAW_BEEF);
			recipe87.setIngredient('B', Material.EGG);
			recipe87.setIngredient('C', Material.RED_MUSHROOM);
			Bukkit.getServer().addRecipe(recipe87);
			ShapedRecipe recipe88 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)97));
			recipe88.shape("ACA", "ABA", "AAA");
			recipe88.setIngredient('A', Material.SNOW_BALL);
			recipe88.setIngredient('B', Material.EGG);
			recipe88.setIngredient('C', Material.PUMPKIN);
			Bukkit.getServer().addRecipe(recipe88);
			ShapedRecipe recipe89 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)98));
			recipe89.shape("ACA", "CBC", "ACA");
			recipe89.setIngredient('A', Material.WOOL);
			recipe89.setIngredient('B', Material.EGG);
			recipe89.setIngredient('C', Material.RAW_FISH);
			Bukkit.getServer().addRecipe(recipe89);
			ShapedRecipe recipe90 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)99));
			recipe90.shape(" A ", "CBC", "C C");
			recipe90.setIngredient('A', Material.PUMPKIN);
			recipe90.setIngredient('B', Material.EGG);
			recipe90.setIngredient('C', Material.IRON_BLOCK);
			Bukkit.getServer().addRecipe(recipe90);
			ShapedRecipe recipe91 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)200));
			recipe91.shape("AAA", "ABA", "ACA");
			recipe91.setIngredient('A', Material.GLASS);
			recipe91.setIngredient('B', Material.EGG);
			recipe91.setIngredient('C', Material.FLINT_AND_STEEL);
			Bukkit.getServer().addRecipe(recipe91);
			ShapedRecipe recipe92 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)120));
			recipe92.shape("ACA", "CBC", "ACA");
			recipe92.setIngredient('A', Material.PORK);
			recipe92.setIngredient('B', Material.EGG);
			recipe92.setIngredient('C', Material.LEATHER);
			Bukkit.getServer().addRecipe(recipe92);
			ShapedRecipe recipe93 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)99));
			recipe93.shape(" C ", "ABA", " A ");
			recipe93.setIngredient('A', Material.IRON_BLOCK);
			recipe93.setIngredient('B', Material.EGG);
			Bukkit.getServer().addRecipe(recipe92);
			recipe93.setIngredient('B', Material.PUMPKIN);
		}
		log.info("MoreRecipes by Owexz (Owexz.net) Enabled");
    }
 
    public void onDisable()
    {
		log.info("MoreRecipes by Owexz (Owexz.net) disabled.");
    }
    public static CustomBlock compressedcoalBlock;
    Logger log;
    public Texture compressedcoalBlockTexture;
}