package net.yel0w.ramcraft.item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yel0w.ramcraft.RamCraft;


public class ModItems {



    public static final Item SILISIUM_DUST = RegisterItems("silicium_dust", new Item(new Item.Settings()));
    public static final Item SILICON = RegisterItems("silicon", new Item(new Item.Settings()));
    public static final Item CARBON_DUST = RegisterItems("carbon_dust", new Item(new Item.Settings()));
    public static final Item TRANSISTOR = RegisterItems("transistor", new Item(new Item.Settings()));
    public static final Item GERMANIUM = RegisterItems("germanium", new Item(new Item.Settings()));
    public static final Item MEMORY_CELL = RegisterItems("memory_cell", new Item(new Item.Settings()));
    public static final Item ALUMINUM_INGOT = RegisterItems("aluminum_ingot", new Item(new Item.Settings()));

private static Item RegisterItems(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(RamCraft.MOD_ID, name), item);
}

public static void registerModItems()
{
    RamCraft.LOGGER.info("Registering " + RamCraft.MOD_ID +" Items...");

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        entries.add(SILISIUM_DUST);
        entries.add(SILICON);
        entries.add(CARBON_DUST);
        entries.add(TRANSISTOR);
        entries.add(GERMANIUM);
        entries.add(MEMORY_CELL);
        entries.add(ALUMINUM_INGOT);
    });

}


}
