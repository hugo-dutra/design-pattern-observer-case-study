package bridge.controldevice.implementations;

import bridge.controldevice.interfaces.IDevice;

public class TV implements IDevice {
    @Override
    public void turnOn() {
        System.out.println("Turning on TV...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off TV...");
    }
}
