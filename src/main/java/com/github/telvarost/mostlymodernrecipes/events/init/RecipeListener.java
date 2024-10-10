package com.github.telvarost.mostlymodernrecipes.events.init;

import com.github.telvarost.mostlymodernrecipes.Config;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.ShapedRecipe;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.CraftingRecipe;
import net.minecraft.recipe.CraftingRecipeManager;
import net.minecraft.recipe.ShapelessRecipe;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.LinkedList;
import java.util.List;

public class RecipeListener {

    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        Identifier type = event.recipeId;

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
            List<CraftingRecipe> recipes = CraftingRecipeManager.getInstance().getRecipes();

            for (int i = 0; i < recipes.size(); i++) {
                CraftingRecipe recipe = recipes.get(i);
                int recipeItemId = recipe.getOutput().itemId;

                if (recipeItemId == Block.LADDER.asItem().id) {
                    if (Config.config.enableModernLadderRecipe) {
                        ItemStack[] inputArray = new ItemStack[9];
                        inputArray[0] = new ItemStack(Item.STICK, 1);
                        inputArray[2] = new ItemStack(Item.STICK, 1);
                        inputArray[3] = new ItemStack(Item.STICK, 1);
                        inputArray[4] = new ItemStack(Item.STICK, 1);
                        inputArray[5] = new ItemStack(Item.STICK, 1);
                        inputArray[6] = new ItemStack(Item.STICK, 1);
                        inputArray[8] = new ItemStack(Item.STICK, 1);
                        recipes.set(i, new ShapedRecipe(3, 3, inputArray, new ItemStack(Block.LADDER.asItem(), 3)));
                    }
                }

                if (recipeItemId == Block.FENCE.asItem().id) {
                    if (Config.config.enableModernFenceRecipe) {
                        ItemStack[] inputArray = new ItemStack[9];
                        inputArray[0] = new ItemStack(Block.PLANKS.asItem(), 1);
                        inputArray[1] = new ItemStack(Item.STICK, 1);
                        inputArray[2] = new ItemStack(Block.PLANKS.asItem(), 1);
                        inputArray[3] = new ItemStack(Block.PLANKS.asItem(), 1);
                        inputArray[4] = new ItemStack(Item.STICK, 1);
                        inputArray[5] = new ItemStack(Block.PLANKS.asItem(), 1);
                        recipes.set(i, new ShapedRecipe(3, 3, inputArray, new ItemStack(Block.FENCE.asItem(), 3)));
                    }
                }

                if (recipeItemId == Item.GOLDEN_APPLE.id) {
                    if (Config.config.enableModernGoldenAppleRecipe) {
                        ItemStack[] inputArray = new ItemStack[9];
                        inputArray[0] = new ItemStack(Item.GOLD_INGOT, 1);
                        inputArray[1] = new ItemStack(Item.GOLD_INGOT, 1);
                        inputArray[2] = new ItemStack(Item.GOLD_INGOT, 1);
                        inputArray[3] = new ItemStack(Item.GOLD_INGOT, 1);
                        inputArray[4] = new ItemStack(Item.APPLE, 1);
                        inputArray[5] = new ItemStack(Item.GOLD_INGOT, 1);
                        inputArray[6] = new ItemStack(Item.GOLD_INGOT, 1);
                        inputArray[7] = new ItemStack(Item.GOLD_INGOT, 1);
                        inputArray[8] = new ItemStack(Item.GOLD_INGOT, 1);
                        recipes.set(i, new ShapedRecipe(3, 3, inputArray, new ItemStack(Item.GOLDEN_APPLE, 1)));
                    }
                }

                if (recipeItemId == Item.SIGN.id) {
                    if (Config.config.enableModernSignRecipe) {
                        ItemStack[] inputArray = new ItemStack[9];
                        inputArray[0] = new ItemStack(Block.PLANKS.asItem(), 1);
                        inputArray[1] = new ItemStack(Block.PLANKS.asItem(), 1);
                        inputArray[2] = new ItemStack(Block.PLANKS.asItem(), 1);
                        inputArray[3] = new ItemStack(Block.PLANKS.asItem(), 1);
                        inputArray[4] = new ItemStack(Block.PLANKS.asItem(), 1);
                        inputArray[5] = new ItemStack(Block.PLANKS.asItem(), 1);
                        inputArray[7] = new ItemStack(Item.STICK, 1);
                        recipes.set(i, new ShapedRecipe(3, 3, inputArray, new ItemStack(Item.SIGN, 3)));
                    }
                }
            }

            if (Config.config.enableModernWoodDoorRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Item.WOODEN_DOOR, 3), "XX ", "XX ", "XX ", 'X', Block.PLANKS);
            }

            if (Config.config.enableModernIronDoorRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Item.IRON_DOOR, 3), "XX ", "XX ", "XX ", 'X', Item.IRON_INGOT);
            }

            if (Config.config.enableModernFenceRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.FENCE.asItem(), 3), "   ", "XYX", "XYX", 'X', Block.PLANKS, 'Y', Item.STICK);
            }

            if (Config.config.enableModernSlabRecipes) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6), "XXX", "   ", "   ", 'X', Block.STONE);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6), "   ", "XXX", "   ", 'X', Block.STONE);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6), "   ", "   ", "XXX", 'X', Block.STONE);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6, 1), "XXX", "   ", "   ", 'X', Block.SANDSTONE);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6, 1), "   ", "XXX", "   ", 'X', Block.SANDSTONE);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6, 1), "   ", "   ", "XXX", 'X', Block.SANDSTONE);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6, 2), "XXX", "   ", "   ", 'X', Block.PLANKS);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6, 2), "   ", "XXX", "   ", 'X', Block.PLANKS);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6, 2), "   ", "   ", "XXX", 'X', Block.PLANKS);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6, 3), "XXX", "   ", "   ", 'X', Block.COBBLESTONE);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6, 3), "   ", "XXX", "   ", 'X', Block.COBBLESTONE);
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SLAB.asItem(), 6, 3), "   ", "   ", "XXX", 'X', Block.COBBLESTONE);
            }

            if (Config.config.enableSnowLayerRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SNOW.asItem(), 6), "XXX", 'X', Block.SNOW_BLOCK);
            }
        }

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            List<CraftingRecipe> recipes = CraftingRecipeManager.getInstance().getRecipes();
            for (int i = 0; i < recipes.size(); i++) {
                CraftingRecipe recipe = recipes.get(i);

                if (recipe.getOutput().itemId == Item.BOOK.id) {
                    if (Config.config.enableModernBookRecipe) {
                        List<ItemStack> inputList = new LinkedList<>();
                        inputList.add(new ItemStack(Item.PAPER, 1));
                        inputList.add(new ItemStack(Item.PAPER, 1));
                        inputList.add(new ItemStack(Item.PAPER, 1));
                        inputList.add(new ItemStack(Item.LEATHER, 1));
                        recipes.set(i, new ShapelessRecipe(new ItemStack(Item.BOOK, 1), inputList));
                    }
                }


                if (recipe.getOutput().itemId == Block.BUTTON.id) {
                    if (Config.config.enableModernStoneButtonRecipe) {
                        List<ItemStack> inputList = new LinkedList<>();
                        inputList.add(new ItemStack(Block.STONE, 1));
                        recipes.set(i, new ShapelessRecipe(new ItemStack(Block.BUTTON, 1), inputList));
                    }
                }
            }

            /** - Redyeing wool is a thing in modern MC: https://minecraft.wiki/w/Dye#Dyeing_wool_and_mobs */
            if (Config.config.enableRedyeingWoolRecipes) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 0), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 15)); // white
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 1), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 14)); // orange
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 2), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 13)); // magenta
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 3), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 12)); // light blue
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 4), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 11)); // yellow
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 5), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 10)); // lime
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 6), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 9)); // pink
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 7), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 8)); // gray
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 8), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 7)); // light gray
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 9), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 6)); // cyan
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 10), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 5)); // purple
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 11), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 4)); // blue
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 12), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 3)); // brown
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 13), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 2)); // green
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 14), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 1)); // red
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.WOOL.asItem(), 1, 15), new ItemStack(Block.WOOL.asItem(), 1, -1), new ItemStack(Item.DYE, 1, 0)); // black
            }

            if (Config.config.shapelessFlintAndSteelRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Item.FLINT_AND_STEEL, 1), Item.FLINT, Item.IRON_INGOT);
            }

            if (Config.config.shapelessMushroomStewRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Item.MUSHROOM_STEW, 1), Item.BOWL, Block.BROWN_MUSHROOM, Block.RED_MUSHROOM);
            }

            if (Config.config.shapelessMinecartChestRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Item.CHEST_MINECART, 1), Item.MINECART, Block.CHEST);
            }

            if (Config.config.shapelessMinecartFurnaceRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Item.FURNACE_MINECART, 1), Item.MINECART, Block.FURNACE);
            }

            if (Config.config.shapelessStickyPistonRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.STICKY_PISTON, 1), Block.PISTON, Item.SLIMEBALL);
            }
        }
    }
}