package bridge.controldevice.implementations;

import bridge.controldevice.interfaces.IDevice;

public class SystemSound implements IDevice {
    @Override
    public void turnOn() {
        System.out.println("Turning on System Sound...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off System Sound...");
    }
}
