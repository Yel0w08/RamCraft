package net.yel0w.ramcraft.item;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.yel0w.ramcraft.RamCraft;

public class ModItemGroups {

    public static final ItemGroup RAMCRAFT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RamCraft.MOD_ID,"ramcraft_items" ),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TRANSISTOR))
                    .displayName(Text.translatable("ItemGroup.ramcraft.ramcraft_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.TRANSISTOR);
                        entries.add(ModItems.MEMORY_CELL);
                        entries.add(ModItems.ALUMINUM_INGOT);
                        entries.add(ModItems.CARBON_DUST);
                        entries.add(ModItems.GERMANIUM);
                        entries.add(ModItems.SILICON);
                        entries.add(ModItems.SILISIUM_DUST);



                    }

                    )
                    .build());


    public static void registerItemsGroup()
    {
        RamCraft.LOGGER.info("Registering item group for "+ RamCraft.MOD_ID);

    }
}
