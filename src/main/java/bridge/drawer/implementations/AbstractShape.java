package bridge.drawer.implementations;

import bridge.drawer.interfaces.IColorShapes;
import bridge.drawer.interfaces.IDrawShapes;

public abstract class AbstractShape {
    private final IDrawShapes drawShapes;
    private final IColorShapes colorShapes;

    public AbstractShape(IDrawShapes drawShapes, IColorShapes colorShapes) {
        this.drawShapes = drawShapes;
        this.colorShapes = colorShapes;
    }

    public void drawSquare() {
        colorShapes.FillColor(drawShapes);
        drawShapes.drawSquare();
    }

    public void drawCircle() {
        colorShapes.FillColor(drawShapes);
        drawShapes.drawCircle();
    }

    public void drawTriangle() {
        colorShapes.FillColor(drawShapes);
        drawShapes.drawTriangle();
    }
}
