package com.aechtrob.prehistoricnature.item;

import com.aechtrob.prehistoricnature.creativetabs.*;
import com.ibm.icu.impl.*;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.*;

import java.util.*;

public class PrehistoricNatureItems {
    public static final RegistryObject<Item> GEOLOGIC_PICK = ItemHandler.addItem(
            "geologic_pick", () -> new GeologicPickItem(Tiers.IRON, new Item.Properties()),
            (provider, item) -> {provider.basicItem(item);}, List.of(Pair.of("prehistoricnature_building_tab",10)),"Geologic Pick");
    public static final RegistryObject<Item> CARBONIFEROUS_RAW_FOSSIL = ItemHandler.addItem("carboniferous_raw_fossil", new Item.Properties(),
            (provider, item) -> {provider.basicItem(item);}, List.of(Pair.of("prehistoricnature_building_tab",0)),
            "Carboniferous Raw Fossil");
    public static void register(){}
}
