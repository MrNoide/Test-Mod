package net.francisco.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab TEST_MOD_TAB = new CreativeModeTab("testmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZINC.get());
        }
    };
}
