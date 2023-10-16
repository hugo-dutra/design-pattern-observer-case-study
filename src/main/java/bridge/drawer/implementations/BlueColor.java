package bridge.drawer.implementations;

import bridge.drawer.interfaces.IColorShapes;
import bridge.drawer.interfaces.IDrawShapes;

public class BlueColor implements IColorShapes{
    @Override
    public void FillColor(IDrawShapes drawShapes) {
        System.out.println("Blue Color to shape" + drawShapes.getClass().getSimpleName());
    }
}
