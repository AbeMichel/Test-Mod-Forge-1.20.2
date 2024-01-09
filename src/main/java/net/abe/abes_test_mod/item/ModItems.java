package net.abe.abes_test_mod.item;

import net.abe.abes_test_mod.AbesTestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            // Deferred registers are a long list of things
            // Will then be registered by forge loading
            DeferredRegister.create(ForgeRegistries.ITEMS, AbesTestMod.MOD_ID);

    // Adding a new item called sapphire
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    // register the register
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
