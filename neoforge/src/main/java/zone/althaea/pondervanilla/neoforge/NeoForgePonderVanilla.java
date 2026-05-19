package zone.althaea.pondervanilla.neoforge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import zone.althaea.pondervanilla.PonderVanilla;

@Mod(PonderVanilla.MOD_ID)
public class NeoForgePonderVanilla {

    public NeoForgePonderVanilla(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);
        Balm.initializeMod(PonderVanilla.MOD_ID, context, PonderVanilla::initialize);
    }
}
