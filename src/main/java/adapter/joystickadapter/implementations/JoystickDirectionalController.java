package adapter.joystickadapter.implementations;

import adapter.joystickadapter.interfaces.IJoystickDirectionalController;

public class JoystickDirectionalController implements IJoystickDirectionalController {
    @Override
    public void moveDirectionUp() {
        System.out.println("Moving direction up");
    }

    @Override
    public void moveDirectionDown() {
        System.out.println("Moving direction down");
    }

    @Override
    public void moveDirectionLeft() {
        System.out.println("Moving direction left");
    }

    @Override
    public void moveDirectionRight() {
        System.out.println("Moving direction right");
    }
}
