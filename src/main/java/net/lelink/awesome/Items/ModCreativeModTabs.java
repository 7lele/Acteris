package net.lelink.awesome.Items;

import net.lelink.awesome.Awesome;
import net.lelink.awesome.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Awesome.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AWESOME_TAB = CREATIVE_MODE_TABS.register("awesome_tab", () -> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.RUBY.get()))
            .title(Component.translatable("creativetab.acteris_tab"))
            .displayItems((itemDisplayParameters, output) -> {

                output.accept(ModBlocks.RUBY_BLOCK.get());
            })
            .build());

    public  static  void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
