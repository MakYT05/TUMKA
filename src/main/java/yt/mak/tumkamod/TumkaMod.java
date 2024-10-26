package yt.mak.tumkamod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import yt.mak.tumkamod.init.ModEntityTypes;

@Mod(TumkaMod.MODID)
public class TumkaMod {
    public static final String MODID = "tumkamod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TumkaMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEntityTypes.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::setup);
    }

    private void setup(final FMLClientSetupEvent event) {}
}
