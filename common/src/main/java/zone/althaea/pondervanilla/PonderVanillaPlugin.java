package zone.althaea.pondervanilla;

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;
import zone.althaea.pondervanilla.scenes.RedstoneDustScenes;

public class PonderVanillaPlugin implements PonderPlugin {
    public static final ResourceLocation REDSTONE_COMPONENTS = ResourceLocation.fromNamespaceAndPath(PonderVanilla.MOD_ID, "redstone_components");

    @Override
    public @NotNull String getModId() {
        return PonderVanilla.MOD_ID;
    }

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        helper.addStoryBoard(ResourceLocation.withDefaultNamespace("redstone"), "redstone/dust", RedstoneDustScenes::dust);
        helper.addStoryBoard(ResourceLocation.withDefaultNamespace("repeater"), "redstone/dust", RedstoneDustScenes::dust);
        helper.addStoryBoard(ResourceLocation.withDefaultNamespace("comparator"), "redstone/dust", RedstoneDustScenes::dust);
    }

    @Override
    public void registerTags(PonderTagRegistrationHelper<ResourceLocation> helper) {
        helper.registerTag(REDSTONE_COMPONENTS).addToIndex().item(Items.REDSTONE).title(Component.translatable("itemGroup.redstone").getString()).register();
    }
}
