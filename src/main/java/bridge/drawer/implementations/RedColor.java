package bridge.drawer.implementations;

import bridge.drawer.interfaces.IColorShapes;
import bridge.drawer.interfaces.IDrawShapes;

public class RedColor implements IColorShapes {


    @Override
    public void FillColor(IDrawShapes drawShapes) {
        System.out.println("Red Color to shape" + drawShapes.getClass().getSimpleName());
    }
}
