package adapter.joystickadapter.implementations;

import adapter.joystickadapter.interfaces.IArrowKeysController;
import adapter.joystickadapter.interfaces.IJoystickDirectionalController;

public class JoystickToKeysAdapterController implements IArrowKeysController {
    private final IJoystickDirectionalController joystickDirectionalController;

    public JoystickToKeysAdapterController(IJoystickDirectionalController joystickDirectionalController) {
        this.joystickDirectionalController = joystickDirectionalController;
    }


    @Override
    public void moveUp() {
        joystickDirectionalController.moveDirectionUp();
    }

    @Override
    public void moveDown() {
        joystickDirectionalController.moveDirectionDown();
    }

    @Override
    public void moveLeft() {
        joystickDirectionalController.moveDirectionLeft();
    }

    @Override
    public void moveRight() {
        joystickDirectionalController.moveDirectionRight();
    }
}
