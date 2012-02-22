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
 
import java.util.logging.Logger;



import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.*;
import org.getspout.spoutapi.material.MaterialData;
 
 
public class MoreRecipes extends JavaPlugin
{
 
    public MoreRecipes()
    {
        log = Logger.getLogger("Minecraft");
    }
 
    public void onEnable()
    {
        SpoutShapedRecipe recipe2 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.web, 1));
        recipe2.shape("AAA", "AAA", "AAA");
        recipe2.setIngredient('A', MaterialData.string);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
        SpoutShapelessRecipe recipe3 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.string, 2));
        recipe3.addIngredient(MaterialData.whiteWool);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
        SpoutShapedRecipe recipe4 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.chainBoots, 1));
        recipe4.shape("C C", "B B", "A A");
        recipe4.setIngredient('A', MaterialData.ironIngot);
        recipe4.setIngredient('B', MaterialData.string);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe4);
        SpoutShapedRecipe recipe5 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.chainLeggings, 1));
        recipe5.shape("ABA", "B B", "A A");
        recipe5.setIngredient('A', MaterialData.ironIngot);
        recipe5.setIngredient('B', MaterialData.string);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe5);
        SpoutShapedRecipe recipe6 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.chainChestplate, 1));
        recipe6.shape("A A", "BAB", "ABA");
        recipe6.setIngredient('A', MaterialData.ironIngot);
        recipe6.setIngredient('B', MaterialData.string);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe6);
        SpoutShapedRecipe recipe7 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.chainHelmet, 1));
        recipe7.shape("   ", "BAB", "A A");
        recipe7.setIngredient('A', MaterialData.ironIngot);
        recipe7.setIngredient('B', MaterialData.string);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe7);
        SpoutShapedRecipe recipe8 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.netherBrick, 1));
        recipe8.shape("AA ", "AA ", "   ");
        recipe8.setIngredient('A', MaterialData.netherrack);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe8);
        SpoutShapedRecipe recipe9 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.saddle, 1));
        recipe9.shape(" A ", "BAB", "CAC");
        recipe9.setIngredient('A', MaterialData.leather);
        recipe9.setIngredient('B', MaterialData.ironIngot);
        recipe9.setIngredient('C', MaterialData.string);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe9);
        SpoutShapelessRecipe recipe10 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.grass, 1));
        recipe10.addIngredient(MaterialData.seeds);
        recipe10.addIngredient(MaterialData.dirt);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe10);
        SpoutShapedRecipe recipe11 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.mossStone, 5));
        recipe11.shape("ABA", "BAB", "ABA");
        recipe11.setIngredient('A', MaterialData.cobblestone);
        recipe11.setIngredient('B', MaterialData.seeds);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe11);
        SpoutShapedRecipe recipe12 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.ice, 3));
        recipe12.shape("AAA", "ABA", "AAA");
        recipe12.setIngredient('A', MaterialData.snowball);
        recipe12.setIngredient('B', MaterialData.waterBucket);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe12);
        SpoutShapelessRecipe recipe13 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.mycelium, 2));
        recipe13.addIngredient(MaterialData.brownMushroom);
        recipe13.addIngredient(MaterialData.redMushroom);
        recipe13.addIngredient(MaterialData.dirt);
        recipe13.addIngredient(MaterialData.dirt);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe13);
        SpoutShapedRecipe recipe14 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.crackedStoneBricks, 5));
        recipe14.shape("ABA", "BAB", "ABA");
        recipe14.setIngredient('A', MaterialData.stoneBricks);
        recipe14.setIngredient('B', MaterialData.flint);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe14);
        SpoutShapedRecipe recipe15 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.mossyStoneBricks, 5));
        recipe15.shape("ABA", "BAB", "ABA");
        recipe15.setIngredient('A', MaterialData.stoneBricks);
        recipe15.setIngredient('B', MaterialData.seeds);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe15);
        SpoutShapelessRecipe recipe18 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.sand, 4));
        recipe18.addIngredient(MaterialData.sandstone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe18);
        SpoutShapelessRecipe recipe19 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.clay, 4));
        recipe19.addIngredient(MaterialData.clayBlock);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe19);
        SpoutShapedRecipe recipe20 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.redApple, 1));
        recipe20.shape("AAA", "ABA", "AAA");
        recipe20.setIngredient('A', MaterialData.leaves);
        recipe20.setIngredient('B', MaterialData.sugar);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe20);
        SpoutShapedRecipe recipe21 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.clayBlock, 9));
        recipe21.shape("AAA", "BBB", "CCC");
        recipe21.setIngredient('A', MaterialData.sand);
        recipe21.setIngredient('B', MaterialData.gravel);
        recipe21.setIngredient('C', MaterialData.dirt);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe21);
        SpoutShapedRecipe recipe22 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.sponge, 1));
        recipe22.shape("BAB", "ABA", "BAB");
        recipe22.setIngredient('A', MaterialData.sand);
        recipe22.setIngredient('B', MaterialData.string);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe22);
        SpoutShapedRecipe recipe23 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.cocoaBeans, 2));
        recipe23.shape("AAA", "ABA", "AAA");
        recipe23.setIngredient('A', MaterialData.sugar);
        recipe23.setIngredient('B', MaterialData.cocoaBeans);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe23);
        SpoutShapedRecipe recipe24 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.blackMusicDisc, 1));
        recipe24.shape("BAB", "ACA", "BAB");
        recipe24.setIngredient('A', MaterialData.obsidian);
        recipe24.setIngredient('B', MaterialData.goldIngot);
        recipe24.setIngredient('C', MaterialData.inkSac);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe24);
        SpoutShapedRecipe recipe25 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.brokenMusicDisc, 1));
        recipe25.shape("BAB", "ACA", "BAB");
        recipe25.setIngredient('A', MaterialData.obsidian);
        recipe25.setIngredient('B', MaterialData.goldIngot);
        recipe25.setIngredient('C', MaterialData.diamond);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe25);
        SpoutShapedRecipe recipe26 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.cyanMusicDisc, 1));
        recipe26.shape("BAB", "ACA", "BAB");
        recipe26.setIngredient('A', MaterialData.obsidian);
        recipe26.setIngredient('B', MaterialData.goldIngot);
        recipe26.setIngredient('C', MaterialData.cyanDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe26);
        SpoutShapedRecipe recipe27 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.forestGreenMusicDisc, 1));
        recipe27.shape("BAB", "ACA", "BAB");
        recipe27.setIngredient('A', MaterialData.obsidian);
        recipe27.setIngredient('B', MaterialData.goldIngot);
        recipe27.setIngredient('C', MaterialData.cactusGreen);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe27);
        SpoutShapedRecipe recipe28 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.goldMusicDisc, 1));
        recipe28.shape("BAB", "ACA", "BAB");
        recipe28.setIngredient('A', MaterialData.obsidian);
        recipe28.setIngredient('B', MaterialData.goldIngot);
        recipe28.setIngredient('C', MaterialData.dandelionYellow);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe28);
        SpoutShapedRecipe recipe29 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.greenMusicDisc, 1));
        recipe29.shape("BAB", "ACA", "BAB");
        recipe29.setIngredient('A', MaterialData.obsidian);
        recipe29.setIngredient('B', MaterialData.goldIngot);
        recipe29.setIngredient('C', MaterialData.limeDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe29);
        SpoutShapedRecipe recipe30 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.orangeMusicDisc, 1));
        recipe30.shape("BAB", "ACA", "BAB");
        recipe30.setIngredient('A', MaterialData.obsidian);
        recipe30.setIngredient('B', MaterialData.goldIngot);
        recipe30.setIngredient('C', MaterialData.orangeDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe30);
        SpoutShapedRecipe recipe31 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.purpleMusicDisc, 1));
        recipe31.shape("BAB", "ACA", "BAB");
        recipe31.setIngredient('A', MaterialData.obsidian);
        recipe31.setIngredient('B', MaterialData.goldIngot);
        recipe31.setIngredient('C', MaterialData.purpleDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe31);
        SpoutShapedRecipe recipe32 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.redMusicDisc, 1));
        recipe32.shape("BAB", "ACA", "BAB");
        recipe32.setIngredient('A', MaterialData.obsidian);
        recipe32.setIngredient('B', MaterialData.goldIngot);
        recipe32.setIngredient('C', MaterialData.roseRed);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe32);
        SpoutShapedRecipe recipe33 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.whiteMusicDisc, 1));
        recipe33.shape("BAB", "ACA", "BAB");
        recipe33.setIngredient('A', MaterialData.obsidian);
        recipe33.setIngredient('B', MaterialData.goldIngot);
        recipe33.setIngredient('C', MaterialData.boneMeal);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe33);
        SpoutShapedRecipe recipe34 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.blueMusicDisc, 1));
        recipe34.shape("BAB", "ACA", "BAB");
        recipe34.setIngredient('A', MaterialData.obsidian);
        recipe34.setIngredient('B', MaterialData.goldIngot);
        recipe34.setIngredient('C', MaterialData.lapisLazuli);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe34);
        SpoutShapedRecipe recipe35 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.stick, 6));
        recipe35.shape(" A ", " A ", " A ");
        recipe35.setIngredient('A', MaterialData.sugarCane);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe35);
        SpoutShapedRecipe recipe36 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.wood, 1));
        recipe36.shape("AA ", "AA ", "   ");
        recipe36.setIngredient('A', MaterialData.stick);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe36);
        SpoutShapelessRecipe recipe37 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.glowstoneDust, 4));
        recipe37.addIngredient(MaterialData.glowstoneBlock);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe37);
        SpoutShapedRecipe recipe38 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.fern, 2));
        recipe38.shape("AAA", "AAA", " A ");
        recipe38.setIngredient('A', MaterialData.leaves);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe38);
        SpoutShapedRecipe recipe39 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.vines, 2));
        recipe39.shape("AAA", "A A", "A A");
        recipe39.setIngredient('A', MaterialData.leaves);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe39);
        SpoutShapedRecipe recipe40 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.lilyPad, 2));
        recipe40.shape("A A", "AAA", "AAA");
        recipe40.setIngredient('A', MaterialData.leaves);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe40);
        SpoutShapedRecipe recipe41 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.tallGrass, 2));
        recipe41.shape("A A", "A A", "AAA");
        recipe41.setIngredient('A', MaterialData.leaves);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe41);
        SpoutShapelessRecipe recipe42 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.ironOre, 1));
        recipe42.addIngredient(MaterialData.ironIngot);
        recipe42.addIngredient(MaterialData.stone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe42);
        SpoutShapelessRecipe recipe43 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.goldOre, 1));
        recipe43.addIngredient(MaterialData.goldIngot);
        recipe43.addIngredient(MaterialData.stone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe43);
        SpoutShapelessRecipe recipe45 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.redstoneOre, 1));
        recipe45.addIngredient(MaterialData.redstone);
        recipe45.addIngredient(MaterialData.redstone);
        recipe45.addIngredient(MaterialData.redstone);
        recipe45.addIngredient(MaterialData.redstone);
        recipe45.addIngredient(MaterialData.redstone);
        recipe45.addIngredient(MaterialData.stone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe45);
        SpoutShapelessRecipe recipe46 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.lapisOre, 1));
        recipe46.addIngredient(MaterialData.lapisLazuli);;
        recipe46.addIngredient(MaterialData.lapisLazuli);
        recipe46.addIngredient(MaterialData.lapisLazuli);
        recipe46.addIngredient(MaterialData.lapisLazuli);
        recipe46.addIngredient(MaterialData.lapisLazuli);
        recipe46.addIngredient(MaterialData.lapisLazuli);
        recipe46.addIngredient(MaterialData.lapisLazuli);
        recipe46.addIngredient(MaterialData.lapisLazuli);
        recipe46.addIngredient(MaterialData.stone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe46);
        SpoutShapelessRecipe recipe47 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.coalOre, 1));
        recipe47.addIngredient(MaterialData.coal);
        recipe47.addIngredient(MaterialData.stone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe47);
        SpoutShapedRecipe recipe48 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.redApple, 1));
        recipe48.shape("AAA", "ABA", "AAA");
        recipe48.setIngredient('A', MaterialData.spruceLeaves);
        recipe48.setIngredient('B', MaterialData.sugar);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe48);
        SpoutShapedRecipe recipe49 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.redApple, 1));
        recipe49.shape("AAA", "ABA", "AAA");
        recipe49.setIngredient('A', MaterialData.birchLeaves);
        recipe49.setIngredient('B', MaterialData.sugar);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe49);
        SpoutShapedRecipe recipe50 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.fern, 2));
        recipe50.shape("AAA", "AAA", " A ");
        recipe50.setIngredient('A', MaterialData.spruceLeaves);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe50);
        SpoutShapedRecipe recipe51 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.fern, 2));
        recipe51.shape("AAA", "AAA", " A ");
        recipe51.setIngredient('A', MaterialData.birchLeaves);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe51);
        SpoutShapedRecipe recipe52 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.tallGrass, 2));
        recipe52.shape("A A", "A A", "AAA");
        recipe52.setIngredient('A', MaterialData.birchLeaves);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe52);
        SpoutShapedRecipe recipe53 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.tallGrass, 2));
        recipe53.shape("A A", "A A", "AAA");
        recipe53.setIngredient('A', MaterialData.spruceLeaves);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe53);
        SpoutShapedRecipe recipe54 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.vines, 2));
        recipe54.shape("AAA", "A A", "A A");
        recipe54.setIngredient('A', MaterialData.birchLeaves);
        SpoutShapedRecipe recipe55 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.vines, 2));
        recipe55.shape("AAA", "A A", "A A");
        recipe55.setIngredient('A', MaterialData.spruceLeaves);
        SpoutShapedRecipe recipe56 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.lilyPad, 2));
        recipe56.shape("A A", "AAA", "AAA");
        recipe56.setIngredient('A', MaterialData.spruceLeaves);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe56);
        SpoutShapedRecipe recipe57 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.lilyPad, 2));
        recipe57.shape("A A", "AAA", "AAA");
        recipe57.setIngredient('A', MaterialData.leaves);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe57);
        log.info("MoreRecipes by Owexz (Owexz.net) Enabled");
    }
 
    public void onDisable()
    {
        log.info("MoreRecipes by Owexz (Owexz.net) disabled.");
    }
 
    Logger log;
}