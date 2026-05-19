package zone.althaea.pondervanilla.neoforge.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import zone.althaea.pondervanilla.PonderVanilla;
import zone.althaea.pondervanilla.client.PonderVanillaClient;

@Mod(value = PonderVanilla.MOD_ID, dist = Dist.CLIENT)
public class NeoForgePonderVanillaClient {
    public NeoForgePonderVanillaClient(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);
        BalmClient.initializeMod(PonderVanilla.MOD_ID, context, PonderVanillaClient::initialize);
    }
}
