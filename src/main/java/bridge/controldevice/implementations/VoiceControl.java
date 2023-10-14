package bridge.controldevice.implementations;

import bridge.controldevice.abstractions.AbstractRemoteControl;
import bridge.controldevice.interfaces.IDevice;

public class VoiceControl extends AbstractRemoteControl {

    public VoiceControl(IDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on device using Voice Control"  + device.getClass().getSimpleName());
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off device using Voice Control" + device.getClass().getSimpleName());
        device.turnOff();
    }
}
