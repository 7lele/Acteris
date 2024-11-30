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
            .title(Component.translatable("creativetab.awesome_tab"))
            .displayItems((itemDisplayParameters, output) -> {
//                output.accept(Moditems.RUBY.get());
//                output.accept(Moditems.RAW_RUBY.get());
//                output.accept(Moditems.METAL_DETECTOR.get());
//                output.accept(Moditems.BISCUIT.get());
//
//                output.accept(Moditems.PINE_CONE.get());
//
//                output.accept(Moditems.RUBY_STAFF.get());
//
//
//                output.accept(Moditems.TOMATO.get());
//                output.accept(Moditems.TOMATO_SEEDS.get());
//
//// Category : stuff
//                output.accept(Moditems.RUBY_SWORD.get());
//                output.accept(Moditems.RUBY_PICKAXE.get());
//                output.accept(Moditems.RUBY_AXE.get());
//                output.accept(Moditems.RUBY_SHOVEL.get());
//                output.accept(Moditems.RUBY_HOE.get());
//                output.accept(Moditems.RUBY_HELMET.get());
//                output.accept(Moditems.RUBY_CHESTPLATE.get());
//                output.accept(Moditems.RUBY_LEGGINGS.get());
//                output.accept(Moditems.RUBY_BOOTS.get());


// Category : ruby
                output.accept(ModBlocks.RUBY_BLOCK.get());
//                output.accept(ModBlocks.RUBY_ORE.get());
//                output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
//                output.accept(ModBlocks.NETHER_RUBY_ORE.get());
//                output.accept(ModBlocks.END_STONE_RUBY_ORE.get());
//
//                output.accept(ModBlocks.SOUND_BLOCK.get());
//
//                output.accept(ModBlocks.RUBY_STAIRS.get());
//                output.accept(ModBlocks.RUBY_SLAB.get());
//                output.accept(ModBlocks.RUBY_FENCE.get());
//                output.accept(ModBlocks.RUBY_FENCE_GATE.get());
//                output.accept(ModBlocks.RUBY_BUTTON.get());
//                output.accept(ModBlocks.RUBY_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.RUBY_TRAPDOOR.get());
//                output.accept(ModBlocks.RUBY_DOOR.get());
//                output.accept(ModBlocks.RUBY_WALL.get());






            })
            .build());

    public  static  void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
