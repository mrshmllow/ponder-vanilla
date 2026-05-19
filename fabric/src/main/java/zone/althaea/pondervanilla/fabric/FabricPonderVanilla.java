package zone.althaea.pondervanilla.fabric;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ModInitializer;
import zone.althaea.pondervanilla.PonderVanilla;

public class FabricPonderVanilla implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(PonderVanilla.MOD_ID, EmptyLoadContext.INSTANCE, PonderVanilla::initialize);
    }
}
