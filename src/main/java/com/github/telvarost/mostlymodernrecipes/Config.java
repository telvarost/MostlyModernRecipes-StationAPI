package com.github.telvarost.mostlymodernrecipes;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.*;

public class Config {

    @GConfig(value = "config", visibleName = "MostlyModernRecipes")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigName("Enable Modern Book Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableModernBookRecipe = true;

        @ConfigName("Enable Modern Fence Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableModernFenceRecipe = true;

        @ConfigName("Enable Modern Golden Apple Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableModernGoldenAppleRecipe = true;

        @ConfigName("Enable Modern Iron Door Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableModernIronDoorRecipe = true;

        @ConfigName("Enable Modern Ladder Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableModernLadderRecipe = true;

        @ConfigName("Enable Modern Sign Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableModernSignRecipe = true;

        @ConfigName("Enable Modern Slab Recipes")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableModernSlabRecipes = true;

        @ConfigName("Enable Modern Stone Button Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableModernStoneButtonRecipe = true;

        @ConfigName("Enable Modern Wood Door Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableModernWoodDoorRecipe = true;

        @ConfigName("Enable Redyeing Wool Recipes")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableRedyeingWoolRecipes = true;

        @ConfigName("Enable Snow Layer Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableSnowLayerRecipe = true;

        @ConfigName("Shapeless Flint and Steel Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean shapelessFlintAndSteelRecipe = true;

        @ConfigName("Shapeless Minecart Chest Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean shapelessMinecartChestRecipe = true;

        @ConfigName("Shapeless Minecart Furnace Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean shapelessMinecartFurnaceRecipe = true;

        @ConfigName("Shapeless Mushroom Stew Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean shapelessMushroomStewRecipe = true;

        @ConfigName("Shapeless Sticky Piston Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean shapelessStickyPistonRecipe = true;
    }
}
