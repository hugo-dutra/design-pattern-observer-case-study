package bridge.controldevice.implementations;

import bridge.controldevice.abstractions.AbstractRemoteControl;
import bridge.controldevice.interfaces.IDevice;
import bridge.controldevice.interfaces.IDeviceControl;

public class TouchControl extends AbstractRemoteControl {

    public TouchControl(IDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on device using Touch Control"  + device.getClass().getSimpleName());
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off device using Touch Control" + device.getClass().getSimpleName());
        device.turnOff();
    }
}
