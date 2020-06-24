package matjojo;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VillagersFollowEmeraldsMod implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "villagers-follow-emeralds";
    public static final String MOD_NAME = "Villagers Follow Emeralds";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");

    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}