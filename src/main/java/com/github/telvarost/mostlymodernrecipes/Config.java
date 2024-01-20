package com.github.telvarost.mostlymodernrecipes;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.ConfigName;
import net.glasslauncher.mods.api.gcapi.api.GConfig;

public class Config {

    @GConfig(value = "config", visibleName = "MostlyModernRecipes Config")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigName("Enable Modern Book Recipe")
        @Comment("Restart required")
        public static Boolean enableModernBookRecipe = true;

        @ConfigName("Enable Modern Fence Recipe")
        @Comment("Restart required")
        public static Boolean enableModernFenceRecipe = true;

        @ConfigName("Enable Modern Ladder Recipe")
        @Comment("Restart required")
        public static Boolean enableModernLadderRecipe = true;

        @ConfigName("Enable Modern Slab Recipes")
        @Comment("Restart required")
        public static Boolean enableModernSlabRecipes = true;

        @ConfigName("Enable Modern Stone Button Recipe")
        @Comment("Restart required")
        public static Boolean enableModernStoneButtonRecipe = true;

        @ConfigName("Enable Redyeing Wool Recipes")
        @Comment("Restart required")
        public static Boolean enableRedyeingWoolRecipes = true;

        @ConfigName("Enable Snow Layer Recipe")
        @Comment("Restart required")
        public static Boolean enableSnowLayerRecipe = true;

        @ConfigName("Shapeless Flint and Steel Recipe")
        @Comment("Restart required")
        public static Boolean shapelessFlintAndSteelRecipe = true;

        @ConfigName("Shapeless Minecart Chest Recipe")
        @Comment("Restart required")
        public static Boolean shapelessMinecartChestRecipe = true;

        @ConfigName("Shapeless Minecart Furnace Recipe")
        @Comment("Restart required")
        public static Boolean shapelessMinecartFurnaceRecipe = true;

        @ConfigName("Shapeless Mushroom Stew Recipe")
        @Comment("Restart required")
        public static Boolean shapelessMushroomStewRecipe = true;

        @ConfigName("Shapeless Sticky Piston Recipe")
        @Comment("Restart required")
        public static Boolean shapelessStickyPistonRecipe = true;
    }
}
