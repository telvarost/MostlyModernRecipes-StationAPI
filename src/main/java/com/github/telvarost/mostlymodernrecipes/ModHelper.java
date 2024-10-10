package com.github.telvarost.mostlymodernrecipes;

import net.minecraft.item.Item;

public class ModHelper {
    public static void AttemptToSetStackSizeOfItems()
    {
        if (ModHelperFields.blocksAndItemsRegistered)
        {
            Item woodDoorItem = Item.WOODEN_DOOR;
            Item ironDoorItem = Item.IRON_DOOR;
            Item signItem  = Item.SIGN;

            if (Config.config.enableModernWoodDoorRecipe) {
                if (null != woodDoorItem) {
                    if (64 != woodDoorItem.getMaxCount()) {
                        woodDoorItem.setMaxCount(64);
                    }
                }
            } else {
                if (null != woodDoorItem) {
                    if (1 != woodDoorItem.getMaxCount()) {
                        woodDoorItem.setMaxCount(1);
                    }
                }
            }

            if (Config.config.enableModernIronDoorRecipe) {
                if (null != ironDoorItem) {
                    if (64 != ironDoorItem.getMaxCount()) {
                        ironDoorItem.setMaxCount(64);
                    }
                }
            } else {
                if (null != ironDoorItem) {
                    if (1 != ironDoorItem.getMaxCount()) {
                        ironDoorItem.setMaxCount(1);
                    }
                }
            }

            if (Config.config.enableModernSignRecipe) {
                if (null != signItem) {
                    if (16 != signItem.getMaxCount()) {
                        signItem.setMaxCount(16);
                    }
                }
            } else {
                if (null != signItem) {
                    if (1 != signItem.getMaxCount()) {
                        signItem.setMaxCount(1);
                    }
                }
            }
        }
    }

    public static class ModHelperFields {
        public static Boolean blocksAndItemsRegistered = false;
    }
}
