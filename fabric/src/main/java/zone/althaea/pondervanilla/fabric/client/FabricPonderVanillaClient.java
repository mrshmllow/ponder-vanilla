package zone.althaea.pondervanilla.fabric.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ClientModInitializer;
import zone.althaea.pondervanilla.PonderVanilla;
import zone.althaea.pondervanilla.client.PonderVanillaClient;

public class FabricPonderVanillaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(PonderVanilla.MOD_ID, EmptyLoadContext.INSTANCE, PonderVanillaClient::initialize);
    }
}
