package facades.smarthome.implementations;

import facades.smarthome.interfaces.ISystemSound;

public class DigitalSound implements ISystemSound {
    @Override
    public void turnOn() {
        System.out.println("DigitalSound.turnOn()");
    }

    @Override
    public void turnOff() {
        System.out.println("DigitalSound.turnOff()");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("DigitalSound.setVolume(): "+volume);
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DigitalSound.setChannel(): "+channel);
    }
}
