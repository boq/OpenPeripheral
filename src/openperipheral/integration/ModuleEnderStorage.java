package openperipheral.integration;

import java.util.Map;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import openmods.Mods;
import openperipheral.AdapterManager;
import openperipheral.adapter.enderstorage.AdapterFrequencyOwner;
import openperipheral.api.IIntegrationModule;

public class ModuleEnderStorage implements IIntegrationModule {

	@Override
	public String getModId() {
		return Mods.ENDERSTORAGE;
	}

	@Override
	public void init() {
		AdapterManager.addPeripheralAdapter(new AdapterFrequencyOwner());
	}

	@Override
	public void appendEntityInfo(Map<String, Object> map, Entity entity, Vec3 relativePos) {}

	@Override
	public void appendItemInfo(Map<String, Object> map, ItemStack itemstack) {}
}