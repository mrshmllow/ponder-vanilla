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
        scene.title("redstone_dust", "redstone");
        scene.configureBasePlate(0, 0, 6);
        scene.showBasePlate();

//        scene.world().showSection(util.select().layer(1), Direction.DOWN);

        var central_dust_pos = util.grid().at(2, 1, 3);

        var torch_pos = util.grid().at(2, 1, 2);
        var lamp_pos = util.grid().at(4, 1, 3);

        var central_dust = util.select().position(central_dust_pos);

        scene.idle(5);

        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.NORTH, RedstoneSide.SIDE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.EAST, RedstoneSide.SIDE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.SOUTH, RedstoneSide.SIDE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.WEST, RedstoneSide.SIDE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.POWER, 0), false);

        scene.world().showSection(central_dust, Direction.DOWN);

        scene.overlay().showText(60)
                .attachKeyFrame()
                .pointAt(util.vector().blockSurface(central_dust_pos, Direction.WEST))
                .placeNearTarget();

        scene.idle(50);

        scene.world().showSection(util.select().position(torch_pos).add(util.select().position(3, 1, 3)), Direction.DOWN);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.EAST, RedstoneSide.SIDE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.NORTH, RedstoneSide.SIDE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.SOUTH, RedstoneSide.NONE), false);
        scene.world().modifyBlock(central_dust_pos, s -> s.setValue(RedStoneWireBlock.WEST, RedstoneSide.NONE), false);

        scene.overlay().showText(60)
                .attachKeyFrame()
                .pointAt(util.vector().blockSurface(torch_pos, Direction.WEST))
                .placeNearTarget();

        scene.idle(50);

        scene.world().showSection(util.select().position(lamp_pos), Direction.DOWN);
        scene.idle(10);

        scene.overlay().showOutlineWithText(util.select().position(lamp_pos), 60)
                .attachKeyFrame()
                .pointAt(util.vector().blockSurface(torch_pos, Direction.WEST))
                .placeNearTarget();

        scene.idle(50);

        scene.world().toggleRedstonePower(util.select().position(torch_pos).add(util.select().position(3, 1, 3)).add(central_dust).add(util.select().position(lamp_pos)));

        scene.idle(50);
    }
}
