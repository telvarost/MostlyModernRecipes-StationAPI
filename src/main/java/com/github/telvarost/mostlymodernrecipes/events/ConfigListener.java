package com.github.telvarost.mostlymodernrecipes.events;

import com.github.telvarost.mostlymodernrecipes.ModHelper;
import net.glasslauncher.mods.gcapi3.api.PreConfigSavedListener;
import net.glasslauncher.mods.gcapi3.impl.GlassYamlFile;
import net.mine_diver.unsafeevents.listener.EventListener;

@EventListener
public class ConfigListener implements PreConfigSavedListener {

    @Override
    public void onPreConfigSaved(int source, GlassYamlFile oldValues, GlassYamlFile newValues)
    {
        /** - Update max stack size on config change */
        ModHelper.AttemptToSetStackSizeOfItems();
    }
}
