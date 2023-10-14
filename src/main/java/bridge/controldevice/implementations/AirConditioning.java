package bridge.controldevice.implementations;

import bridge.controldevice.interfaces.IDevice;

public class AirConditioning implements IDevice {
    @Override
    public void turnOn() {
        System.out.println("Turning on Air Conditioning...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Air Conditioning...");
    }
}
