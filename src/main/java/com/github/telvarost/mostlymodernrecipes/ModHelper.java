package com.github.telvarost.mostlymodernrecipes;

import net.minecraft.block.BlockBase;
import net.minecraft.item.ItemBase;

public class ModHelper {
    public static void AttemptToSetStackSizeOfItems()
    {
        if (ModHelper.ModHelperFields.blocksAndItemsRegistered)
        {
            ItemBase woodDoorItem = ItemBase.woodDoor;
            ItemBase ironDoorItem = ItemBase.ironDoor;
            ItemBase signItem  = ItemBase.sign;

            if (Config.ConfigFields.enableModernWoodDoorRecipe) {
                if (null != woodDoorItem) {
                    if (64 != woodDoorItem.getMaxStackSize()) {
                        woodDoorItem.setMaxStackSize(64);
                    }
                }
            } else {
                if (null != woodDoorItem) {
                    if (1 != woodDoorItem.getMaxStackSize()) {
                        woodDoorItem.setMaxStackSize(1);
                    }
                }
            }

            if (Config.ConfigFields.enableModernIronDoorRecipe) {
                if (null != ironDoorItem) {
                    if (64 != ironDoorItem.getMaxStackSize()) {
                        ironDoorItem.setMaxStackSize(64);
                    }
                }
            } else {
                if (null != ironDoorItem) {
                    if (1 != ironDoorItem.getMaxStackSize()) {
                        ironDoorItem.setMaxStackSize(1);
                    }
                }
            }

            if (Config.ConfigFields.enableModernSignRecipe) {
                if (null != signItem) {
                    if (16 != signItem.getMaxStackSize()) {
                        signItem.setMaxStackSize(16);
                    }
                }
            } else {
                if (null != signItem) {
                    if (1 != signItem.getMaxStackSize()) {
                        signItem.setMaxStackSize(1);
                    }
                }
            }
        }
    }

    public static class ModHelperFields {
        public static Boolean blocksAndItemsRegistered = false;
    }
}
