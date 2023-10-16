package bridge.drawer;

import bridge.drawer.implementations.*;
import bridge.drawer.interfaces.IColorShapes;
import bridge.drawer.interfaces.IDrawShapes;

public class ClientDrawer {
    public static void main(String[] args) {
        IColorShapes colorShapes = new BlueColor();
        IDrawShapes square = new DrawPoints();
        AbstractShape shape = new ConsoleShapes(square, colorShapes);
        shape.drawSquare();

        IDrawShapes circle = new DrawPoints();
        shape = new ConsoleShapes(circle, colorShapes);
        shape.drawCircle();

        IDrawShapes triangle = new DrawPoints();
        shape = new ConsoleShapes(triangle, colorShapes);
        shape.drawTriangle();

        System.out.println("--------------------------------------------------");

        IColorShapes colorShapes2 = new RedColor();
        IDrawShapes square2 = new DrawLine();
        shape = new ConsoleShapes(square2, colorShapes2);
        shape.drawSquare();

        IDrawShapes circle2 = new DrawLine();
        shape = new ConsoleShapes(circle2, colorShapes2);
        shape.drawCircle();

        IDrawShapes triangle2 = new DrawLine();
        shape = new ConsoleShapes(triangle2, colorShapes2);
        shape.drawTriangle();
    }
}
