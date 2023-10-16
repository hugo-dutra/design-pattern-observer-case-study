package bridge.drawer.implementations;

import bridge.drawer.interfaces.IColorShapes;
import bridge.drawer.interfaces.IDrawShapes;

public class ConsoleShapes extends AbstractShape {
    public ConsoleShapes(IDrawShapes drawShapes, IColorShapes colorShapes) {
        super(drawShapes, colorShapes);
    }
}
