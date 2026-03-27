package net.yel0w.ramcraft.item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yel0w.ramcraft.RamCraft;


public class ModItems {

    public static final Item SILISIUM = RegisterItems("silicium", new Item(new Item.Settings()));



private static Item RegisterItems(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(RamCraft.MOD_ID, name), item);
}

public static void registerModItems()
{
    RamCraft.LOGGER.info("Registering " + RamCraft.MOD_ID +" Items...");

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        entries.add(SILISIUM);
    });

}


}
