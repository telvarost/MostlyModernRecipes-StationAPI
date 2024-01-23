package com.github.telvarost.mostlymodernrecipes.events.init;

import com.github.telvarost.mostlymodernrecipes.ModHelper;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.AfterBlockAndItemRegisterEvent;

public class RegistryListener {

    @EventListener
    public void handleAfterBlockAndItemRegisterEvent(AfterBlockAndItemRegisterEvent event)
    {
        ModHelper.ModHelperFields.blocksAndItemsRegistered = true;
        ModHelper.AttemptToSetStackSizeOfItems();
    }
}
