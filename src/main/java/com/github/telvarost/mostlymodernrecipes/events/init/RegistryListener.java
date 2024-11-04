package com.github.telvarost.mostlymodernrecipes.events.init;

import com.github.telvarost.mostlymodernrecipes.ModHelper;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.DimensionRegistryEvent;

public class RegistryListener {

    @EventListener
    public void handleAfterBlockAndItemRegisterEvent(DimensionRegistryEvent event)
    {
        ModHelper.ModHelperFields.blocksAndItemsRegistered = true;
        ModHelper.AttemptToSetStackSizeOfItems();
    }
}
