package com.github.telvarost.mostlymodernrecipes;

import net.glasslauncher.mods.gcapi3.api.*;

public class Config {

    @ConfigRoot(value = "config", visibleName = "MostlyModernRecipes")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigEntry(
                name = "Enable Modern Book Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableModernBookRecipe = true;

        @ConfigEntry(
                name = "Enable Modern Fence Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableModernFenceRecipe = true;

        @ConfigEntry(
                name = "Enable Modern Golden Apple Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableModernGoldenAppleRecipe = true;

        @ConfigEntry(
                name = "Enable Modern Iron Door Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableModernIronDoorRecipe = true;

        @ConfigEntry(
                name = "Enable Modern Ladder Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableModernLadderRecipe = true;

        @ConfigEntry(
                name = "Enable Modern Sign Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableModernSignRecipe = true;

        @ConfigEntry(
                name = "Enable Modern Slab Recipes",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableModernSlabRecipes = true;

        @ConfigEntry(
                name = "Enable Modern Stone Button Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableModernStoneButtonRecipe = true;

        @ConfigEntry(
                name = "Enable Modern Wood Door Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableModernWoodDoorRecipe = true;

        @ConfigEntry(
                name = "Enable Redyeing Wool Recipes",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableRedyeingWoolRecipes = true;

        @ConfigEntry(
                name = "Enable Snow Layer Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableSnowLayerRecipe = true;

        @ConfigEntry(
                name = "Shapeless Flint and Steel Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean shapelessFlintAndSteelRecipe = true;

        @ConfigEntry(
                name = "Shapeless Minecart Chest Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean shapelessMinecartChestRecipe = true;

        @ConfigEntry(
                name = "Shapeless Minecart Furnace Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean shapelessMinecartFurnaceRecipe = true;

        @ConfigEntry(
                name = "Shapeless Mushroom Stew Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean shapelessMushroomStewRecipe = true;

        @ConfigEntry(
                name = "Shapeless Sticky Piston Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean shapelessStickyPistonRecipe = true;
    }
}
