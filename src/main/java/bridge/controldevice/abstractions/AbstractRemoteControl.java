package bridge.controldevice.abstractions;

import bridge.controldevice.interfaces.IDevice;
import bridge.controldevice.interfaces.IDeviceControl;

public abstract class AbstractRemoteControl {
    protected IDevice device;

    public AbstractRemoteControl(IDevice device) {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
