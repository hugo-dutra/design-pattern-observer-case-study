package bridge.drawer.implementations;

import bridge.drawer.interfaces.IDrawShapes;

public class DrawPoints implements IDrawShapes {
    @Override
    public void drawSquare() {
        String drawSquare = ".........." +
                "\n"+
                ".          ." +
                "\n"+
                ".          ." +
                "\n"+
                ".          ." +
                "\n"+
                ".          ." +
                "\n"+
                ".          ." +
                "\n"+
                ".          ." +
                "\n"+
                ".          ." +
                "\n"+
                ".          ." +
                "\n"+
                "..........";
        System.out.println(drawSquare);
    }

    @Override
    public void drawCircle() {
        String drawCircle = "." +
                "\n"+
                "          .          " +
                "\n"+
                "         . .         " +
                "\n"+
                "       . . . .       " +
                "\n"+
                "     . . . . . .     " +
                "\n"+
                "   . . . . . . . .   " +
                "\n"+
                "   . . . . . . . .   " +
                "\n"+
                "     . . . . . .     " +
                "\n"+
                "       . . . .       " +
                "\n"+
                "         . .         " +
                "\n"+
                "          .          ";

                System.out.println(drawCircle);
    }

    @Override
    public void drawTriangle() {
        String drawTriangle = "." +
                "\n"+
                "          .          " +
                "\n"+
                "         . .         " +
                "\n"+
                "       . . . .       " +
                "\n"+
                "     . . . . . .     " +
                "\n"+
                "   . . . . . . . .   " +
                "\n"+
                "  . . . . . . . . . ." +
                "\n"+
                ". . . . . . . . . . . " +
                "\n";
                System.out.println(drawTriangle);
    }
}
