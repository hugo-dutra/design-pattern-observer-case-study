package adapter.joystickadapter.implementations;

import adapter.joystickadapter.interfaces.IArrowKeysController;

public class ArrowKeysController implements IArrowKeysController {
    @Override
    public void moveUp() {
        System.out.println("Moving up");
    }

    @Override
    public void moveDown() {
        System.out.println("Moving down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Moving left");
    }

    @Override
    public void moveRight() {
        System.out.println("Moving right");
    }
}
