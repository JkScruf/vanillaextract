package jkscruf.vanillaextract.item;

import jkscruf.vanillaextract.VanillaExtract;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BAKED_APPLE = registerItem( "baked_apple", new Item(new Item.Settings().food(ModFoodComponents.BAKED_APPLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaExtract.MOD_ID, "baked_apple")))));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaExtract.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VanillaExtract.LOGGER.info("Registering Mod Items for " + VanillaExtract.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(BAKED_APPLE);
        });
    }
}
