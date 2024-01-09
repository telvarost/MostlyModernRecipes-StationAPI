package com.github.telvarost.mostlymodernrecipes.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.mine_diver.unsafeevents.listener.ListenerPriority;
import net.minecraft.block.BlockBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.recipe.FuelRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

public class RecipeListener {

    @EventListener(priority = ListenerPriority.LOWEST)
    public void registerRecipes(RecipeRegisterEvent event) {
        Identifier type = event.recipeId;

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
//            CraftingRegistry.addShapedRecipe(new ItemInstance(ItemBase.woodDoor, 3), "XX ", "XX ", "XX ", 'X', BlockBase.WOOD);
//            CraftingRegistry.addShapedRecipe(new ItemInstance(ItemBase.ironDoor, 3), "XX ", "XX ", "XX ", 'X', ItemBase.ironIngot);
//            CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.LADDER.asItem(), 3), "X X", "XXX", "X X", 'X', ItemBase.stick);
//            CraftingRegistry.addShapedRecipe(new ItemInstance(ItemBase.sign, 3), "XXX", "XXX", " Y ", 'X', BlockBase.WOOD, 'Y', ItemBase.stick);
//
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
        }
    }
}