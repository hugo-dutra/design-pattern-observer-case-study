package bridge.controldevice.implementations;

import bridge.controldevice.abstractions.AbstractRemoteControl;
import bridge.controldevice.interfaces.IDevice;
import bridge.controldevice.interfaces.IDeviceControl;

public class BasicControl extends AbstractRemoteControl {


    public BasicControl(IDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on device using Basic Control"  + device.getClass().getSimpleName());
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off device using Basic Control" + device.getClass().getSimpleName());
        device.turnOff();
    }
}
