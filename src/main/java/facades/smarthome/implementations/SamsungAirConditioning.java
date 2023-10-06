package facades.smarthome.implementations;

import facades.smarthome.interfaces.IAirConditioning;

public class SamsungAirConditioning implements IAirConditioning {
    @Override
    public void turnOn() {
        System.out.println("SamsungAirConditioning.turnOn()");
    }

    @Override
    public void turnOff() {
        System.out.println("SamsungAirConditioning.turnOff()");
    }

    @Override
    public void setTemperature(int temperature) {
        System.out.println("SamsungAirConditioning.setTemperature()"+temperature);
    }

    @Override
    public void setFanSpeed(int speed) {
        System.out.println("SamsungAirConditioning.setFanSpeed()"+speed);
    }
}
