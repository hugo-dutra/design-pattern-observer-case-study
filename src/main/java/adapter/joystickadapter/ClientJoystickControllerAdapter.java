package adapter.joystickadapter;

import adapter.joystickadapter.implementations.ArrowKeysController;
import adapter.joystickadapter.implementations.JoystickDirectionalController;
import adapter.joystickadapter.implementations.JoystickToKeysAdapterController;
import adapter.joystickadapter.interfaces.IArrowKeysController;
import adapter.joystickadapter.interfaces.IJoystickDirectionalController;

public class ClientJoystickControllerAdapter {
    public static void main(String[] args) {
        IArrowKeysController arrowKeysController = new ArrowKeysController();
        arrowKeysController.moveDown();
        arrowKeysController.moveLeft();
        arrowKeysController.moveRight();
        arrowKeysController.moveUp();

        IJoystickDirectionalController joystickDirectionalController = new JoystickDirectionalController();
        JoystickToKeysAdapterController joystickToKeysAdapterController = new JoystickToKeysAdapterController(joystickDirectionalController);

        joystickToKeysAdapterController.moveDown();
        joystickToKeysAdapterController.moveLeft();
        joystickToKeysAdapterController.moveRight();
        joystickToKeysAdapterController.moveUp();

    }
}
