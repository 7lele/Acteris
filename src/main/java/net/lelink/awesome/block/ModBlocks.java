package net.lelink.awesome.block;

import net.lelink.awesome.Awesome;
import net.lelink.awesome.Items.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Awesome.MOD_ID);


    public static final RegistryObject<Block> RUBY_BLOCK = registerBlocks("ruby_block", //copier ca pour creer un autre block
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.FROGLIGHT)));






    private static <T extends Block> RegistryObject<T> registerBlocks(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }




    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
