package jkscruf.vanillaextract;

import jkscruf.vanillaextract.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaExtract implements ModInitializer {
	public static final String MOD_ID = "vanillaextract";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}