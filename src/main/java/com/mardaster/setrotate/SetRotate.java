package com.mardaster.setrotate;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
    modid = SetRotate.MOD_ID,
    name = SetRotate.MOD_NAME,
    version = SetRotate.VERSION
)
public class SetRotate {

    public static final String MOD_ID   = "setrotate";
    public static final String MOD_NAME = "SetRotate";
    public static final String VERSION  = "1.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("{} pre-initialization complete.", MOD_NAME);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ClientCommandHandler.instance.registerCommand(new CommandSetRotate());
        logger.info("{} initialization complete.", MOD_NAME);
    }
}
