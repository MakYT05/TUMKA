// ModEntityTypes.java
package yt.mak.tumkamod.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import yt.mak.tumkamod.custom.entity.TumkaMob;


public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "tumkamod");

    public static final RegistryObject<EntityType<TumkaMob>> TUMKA_MOB = ENTITY_TYPES.register("tumka_mob",
            () -> EntityType.Builder.of(TumkaMob::new, MobCategory.MONSTER)
                    .sized(1.0F, 2.0F)
                    .build(new ResourceLocation("tumkamod", "tumka_mob").toString())
    );

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}