package com.github.telvarost.mostlymodernrecipes.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.mine_diver.unsafeevents.listener.ListenerPriority;
import net.minecraft.block.BlockBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeRegistry;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.ShapelessRecipe;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.recipe.FuelRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecipeListener {

    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        Identifier type = event.recipeId;

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
//            CraftingRegistry.addShapedRecipe(new ItemInstance(ItemBase.woodDoor, 3), "XX ", "XX ", "XX ", 'X', BlockBase.WOOD);
//            CraftingRegistry.addShapedRecipe(new ItemInstance(ItemBase.ironDoor, 3), "XX ", "XX ", "XX ", 'X', ItemBase.ironIngot);
//            CraftingRegistry.addShapedRecipe(new ItemInstance(ItemBase.sign, 3), "XXX", "XXX", " Y ", 'X', BlockBase.WOOD, 'Y', ItemBase.stick);
//            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.LADDER.asItem(), 3), "X X", "XXX", "X X", 'X', ItemBase.stick);
            List<Recipe> recipes = RecipeRegistry.getInstance().getRecipes();
            for (int i = 0; i < recipes.size(); i++) {
                Recipe recipe = recipes.get(i);
                if (recipe.getOutput().itemId == BlockBase.LADDER.asItem().id) {
                    ItemInstance[] inputArray = new ItemInstance[9];
                    inputArray[0] = new ItemInstance(ItemBase.stick, 1);
                    inputArray[2] = new ItemInstance(ItemBase.stick, 1);
                    inputArray[3] = new ItemInstance(ItemBase.stick, 1);
                    inputArray[4] = new ItemInstance(ItemBase.stick, 1);
                    inputArray[5] = new ItemInstance(ItemBase.stick, 1);
                    inputArray[6] = new ItemInstance(ItemBase.stick, 1);
                    inputArray[8] = new ItemInstance(ItemBase.stick, 1);
                    recipes.set(i, new ShapedRecipe(3, 3, inputArray, new ItemInstance(BlockBase.LADDER.asItem(), 3)));
                }
            }

//                      * Slabs craft 6 per craft
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6), "XXX", "   ", "   ", 'X', BlockBase.STONE);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6), "   ", "XXX", "   ", 'X', BlockBase.STONE);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6), "   ", "   ", "XXX", 'X', BlockBase.STONE);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6, 1), "XXX", "   ", "   ", 'X', BlockBase.SANDSTONE);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6, 1), "   ", "XXX", "   ", 'X', BlockBase.SANDSTONE);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6, 1), "   ", "   ", "XXX", 'X', BlockBase.SANDSTONE);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6, 2), "XXX", "   ", "   ", 'X', BlockBase.WOOD);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6, 2), "   ", "XXX", "   ", 'X', BlockBase.WOOD);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6, 2), "   ", "   ", "XXX", 'X', BlockBase.WOOD);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6, 3), "XXX", "   ", "   ", 'X', BlockBase.COBBLESTONE);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6, 3), "   ", "XXX", "   ", 'X', BlockBase.COBBLESTONE);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.STONE_SLAB.asItem(), 6, 3), "   ", "   ", "XXX", 'X', BlockBase.COBBLESTONE);

//                      * Craftable Snow layers, 6 for 3 Snow Blocks
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.SNOW.asItem(), 6), "XXX", "   ", "   ", 'X', BlockBase.SNOW_BLOCK);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.SNOW.asItem(), 6), "   ", "XXX", "   ", 'X', BlockBase.SNOW_BLOCK);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.SNOW.asItem(), 6), "   ", "   ", "XXX", 'X', BlockBase.SNOW_BLOCK);

//                      * Modern Fence recipe
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.FENCE.asItem(), 3), "XYX", "XYX", "   ", 'X', BlockBase.WOOD, 'Y', ItemBase.stick);
            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.FENCE.asItem(), 3), "   ", "XYX", "XYX", 'X', BlockBase.WOOD, 'Y', ItemBase.stick);
        }

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
//                      * Books require 1 leather and 3 paper
//                      * Shapeless Books
            List<Recipe> recipes = RecipeRegistry.getInstance().getRecipes();
            for (int i = 0; i < recipes.size(); i++) {
                Recipe recipe = recipes.get(i);
                if (recipe.getOutput().itemId == ItemBase.book.id) {
                    List<ItemInstance> inputList = new LinkedList<>();
                    inputList.add(new ItemInstance(ItemBase.paper, 1));
                    inputList.add(new ItemInstance(ItemBase.paper, 1));
                    inputList.add(new ItemInstance(ItemBase.paper, 1));
                    inputList.add(new ItemInstance(ItemBase.leather, 1));
                    recipes.set(i, new ShapelessRecipe(new ItemInstance(ItemBase.book, 1), inputList));
                }
            }

//                      * Shapeless Flint and Steel
            CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.flintAndSteel, 1), ItemBase.flint, ItemBase.ironIngot);
//                      * Shapeless Mushroom Stew
            CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.mushroomStew, 1), ItemBase.bowl, BlockBase.BROWN_MUSHROOM, BlockBase.RED_MUSHROOM);
//                      * Shapeless Minecart Chest
            CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.minecartChest, 1), ItemBase.minecart, BlockBase.CHEST);
//                      * Shapeless Minecart Furnace
            CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.minecartFurnace, 1), ItemBase.minecart, BlockBase.FURNACE);
//                      * Buttons crafted with 1 Stone
            CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.BUTTON.asItem(), 1), BlockBase.STONE);
//                      * Shapeless Jack o’ Lanterns
            CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.JACK_O_LANTERN.asItem(), 1), BlockBase.PUMPKIN, BlockBase.TORCH);
//                      * Shapeless Sticky Pistons
            CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.STICKY_PISTON, 1), BlockBase.PISTON, ItemBase.slimeball);
        }
    }
}