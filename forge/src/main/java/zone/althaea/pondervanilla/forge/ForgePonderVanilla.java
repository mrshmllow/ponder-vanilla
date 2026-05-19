package zone.althaea.pondervanilla.forge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.forge.ForgeLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import zone.althaea.pondervanilla.PonderVanilla;
import zone.althaea.pondervanilla.client.PonderVanillaClient;

@Mod(PonderVanilla.MOD_ID)
public class ForgePonderVanilla {

    public ForgePonderVanilla(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModEventBus());
        Balm.initializeMod(PonderVanilla.MOD_ID, loadContext, PonderVanilla::initialize);
        if (FMLEnvironment.dist.isClient()) {
            BalmClient.initializeMod(PonderVanilla.MOD_ID, loadContext, PonderVanillaClient::initialize);
        }
    }

}
