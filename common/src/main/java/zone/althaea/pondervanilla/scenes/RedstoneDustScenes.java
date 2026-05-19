package zone.althaea.pondervanilla.scenes;

import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.foundation.PonderSceneBuilder;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.world.level.block.state.properties.RedstoneSide;

public class RedstoneDustScenes {
    public static void dust(SceneBuilder builder, SceneBuildingUtil util) {
        PonderSceneBuilder scene = new PonderSceneBuilder(builder.getScene());
        scene.scaleSceneView(2f);
        scene.title("redstone_dust", "redstone");
        scene.configureBasePlate(0, 0, 5);
        scene.showBasePlate();

        var central_dust_pos = util.grid().at(2, 1, 2);
        var central_dust = util.select().position(central_dust_pos);

        scene.idle(10);

        scene.world().toggleRedstonePower(central_dust);

        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.NORTH, RedstoneSide.SIDE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.EAST, RedstoneSide.SIDE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.SOUTH, RedstoneSide.SIDE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.WEST, RedstoneSide.SIDE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.POWER, 0), false);

        scene.world().showSection(central_dust, Direction.DOWN);
        scene.overlay().showText(32)
                .attachKeyFrame()
                .pointAt(util.vector().blockSurface(central_dust_pos, Direction.WEST))
                .placeNearTarget();

        scene.idle(10);
    }
}
