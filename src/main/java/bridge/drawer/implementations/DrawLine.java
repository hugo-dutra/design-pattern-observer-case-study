package bridge.drawer.implementations;

import bridge.drawer.interfaces.IDrawShapes;

public class DrawLine implements IDrawShapes {

    @Override
    public void drawSquare() {
        String drawSquare = "__________" +
                "\n" +
                "|          |" +
                "\n" +
                "|          |" +
                "\n" +
                "|          |" +
                "\n" +
                "|          |" +
                "\n" +
                "|          |" +
                "\n" +
                "|          |" +
                "\n" +
                "|          |" +
                "\n" +
                "|          |" +
                "\n" +
                "|__________|";
        System.out.println(drawSquare);
    }

    @Override
    public void drawCircle() {
        String drawCircle = "_" +
                "\n" +
                "          _          " +
                "\n" +
                "         _ _         " +
                "\n" +
                "       _ _ _ _       " +
                "\n" +
                "     _ _ _ _ _ _     " +
                "\n" +
                "   _ _ _ _ _ _ _ _   " +
                "\n" +
                "   _ _ _ _ _ _ _ _   " +
                "\n" +
                "     _ _ _ _ _ _     " +
                "\n" +
                "       _ _ _ _       " +
                "\n" +
                "         _ _         " +
                "\n" +
                "          _          ";

                System.out.println(drawCircle);
    }

    @Override
    public void drawTriangle() {
        String drawTriangle = "          _          " +
                "\n" +
                "         _ _         " +
                "\n" +
                "        _ _ _        " +
                "\n" +
                "       _ _ _ _       " +
                "\n" +
                "      _ _ _ _ _      " +
                "\n" +
                "     _ _ _ _ _ _     " +
                "\n" +
                "    _ _ _ _ _ _ _    " +
                "\n" +
                "   _ _ _ _ _ _ _ _   " +
                "\n" +
                "  _ _ _ _ _ _ _ _ _  " +
                "\n" +
                "_ _ _ _ _ _ _ _ _ _ _";

        System.out.println(drawTriangle);
    }
}
