package facades.smarthome.implementations;

import facades.smarthome.interfaces.Iligth;

public class LedLight implements Iligth {
    @Override
    public void turnOn() {
        System.out.println("LedLight.turnOn()");
    }

    @Override
    public void turnOff() {
        System.out.println("LedLight.turnOff()");
    }

    @Override
    public void dim() {
        System.out.println("LedLight.dim()");
    }

    @Override
    public void brighten() {
        System.out.println("LedLight.brighten()");
    }
}
