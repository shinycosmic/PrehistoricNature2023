package com.aechtrob.prehistoricnature.items;

import com.aechtrob.prehistoricnature.PrehistoricNatureMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricNatureMod.MOD_ID);

    //public static final RegistryObject<Item> FOSSIL_CLEAN = ITEMS.register("fossil_clean",
    //        () -> new FossilCleanItem(new Item.Properties()));

    //public static final RegistryObject<Item> TAB_ICON = ITEMS.register("tab_icon", () -> new ItemTabIcon(new Item.Properties()));

    //public static void register(IEventBus eventBus){
    //    ITEMS.register(eventBus);
    //}

}
