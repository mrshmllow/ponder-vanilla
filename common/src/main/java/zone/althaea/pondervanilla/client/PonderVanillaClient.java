package zone.althaea.pondervanilla.client;

import net.createmod.ponder.foundation.PonderIndex;
import zone.althaea.pondervanilla.PonderVanillaPlugin;

public class PonderVanillaClient {
    public static void initialize() {
        PonderIndex.addPlugin(new PonderVanillaPlugin());
    }
}
