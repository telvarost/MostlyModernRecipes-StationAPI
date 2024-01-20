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

        @ConfigName("Enable Redyeing Wool Recipes")
        @Comment("Restart required")
        public static Boolean enableRedyeingWoolRecipes = true;

        @ConfigName("Enable Snow Layer Recipe")
        @Comment("Restart required")
        public static Boolean enableSnowLayerRecipe = true;

        @ConfigName("Enable Diamond Ore Recipe")
        @Comment("Restart required")
        public static Boolean enableDiamondOreRecipe = true;

        @ConfigName("Enable Fire Recipe")
        @Comment("Restart required")
        public static Boolean enableFireRecipe = true;

        @ConfigName("Enable Grass Recipe")
        @Comment("Restart required")
        public static Boolean enableGrassRecipe = true;

        @ConfigName("Enable Apple Recipe")
        @Comment("Restart required")
        public static Boolean enableAppleRecipe = true;
    }
}
