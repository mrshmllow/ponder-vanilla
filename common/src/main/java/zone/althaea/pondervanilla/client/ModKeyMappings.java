package zone.althaea.pondervanilla.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.blay09.mods.kuma.api.InputBinding;
import net.blay09.mods.kuma.api.Kuma;
import net.blay09.mods.kuma.api.ManagedKeyMapping;
import zone.althaea.pondervanilla.PonderVanilla;

import static zone.althaea.pondervanilla.PonderVanilla.id;

public class ModKeyMappings {

    public static ManagedKeyMapping yourKey;

    public static void initialize() {
        yourKey = Kuma.createKeyMapping(id("your_key"))
                .withDefault(InputBinding.key(InputConstants.KEY_B))
                .handleScreenInput(event -> {
                    PonderVanilla.logger.info("B was pressed - " + PonderVanilla.MOD_ID);
                    return true;
                })
                .build();
    }
}
