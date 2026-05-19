package zone.althaea.pondervanilla;

import net.blay09.mods.balm.api.Balm;
import net.minecraft.resources.ResourceLocation;
import net.blay09.mods.balm.core.BalmRegistrars;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PonderVanilla {

    public static final Logger logger = LoggerFactory.getLogger(PonderVanilla.class);

    public static final String MOD_ID = "pondervanilla";

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static PonderVanillaConfig config() {
        return Balm.getConfig().getActiveConfig(PonderVanillaConfig.class);
    }

    public static void initialize(BalmRegistrars registrars) {
        Balm.getConfig().registerConfig(PonderVanillaConfig.class);
    }

}
