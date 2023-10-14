package bridge.controldevice;

import bridge.controldevice.abstractions.AbstractRemoteControl;
import bridge.controldevice.implementations.*;
import bridge.controldevice.interfaces.IDevice;
import bridge.controldevice.interfaces.IDeviceControl;

public class ClientBridgeControlDevice {
    public static void main(String[] args) {
        IDevice tv = new TV();

        AbstractRemoteControl remoteControl = new BasicControl(tv);
        remoteControl.turnOn();
        remoteControl.turnOff();

        remoteControl = new TouchControl(tv);
        remoteControl.turnOn();
        remoteControl.turnOff();

        remoteControl = new TouchControl(tv);
        remoteControl.turnOn();
        remoteControl.turnOff();

        System.out.println("--------------------------------------------------");

        IDevice airConditioner = new AirConditioning();
        remoteControl = new BasicControl(airConditioner);
        remoteControl.turnOn();
        remoteControl.turnOff();

        remoteControl = new TouchControl(airConditioner);
        remoteControl.turnOn();
        remoteControl.turnOff();

        remoteControl = new TouchControl(airConditioner);
        remoteControl.turnOn();
        remoteControl.turnOff();

        System.out.println("--------------------------------------------------");

        IDevice systemSound = new SystemSound();
        remoteControl = new BasicControl(systemSound);
        remoteControl.turnOn();
        remoteControl.turnOff();

        remoteControl = new TouchControl(systemSound);
        remoteControl.turnOn();
        remoteControl.turnOff();

        remoteControl = new TouchControl(systemSound);
        remoteControl.turnOn();
        remoteControl.turnOff();

    }
}
