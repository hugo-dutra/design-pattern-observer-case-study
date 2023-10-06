package facades.smarthome.interfaces;

public interface IAirConditioning {
    public void turnOn();
    public void turnOff();
    public void setTemperature(int temperature);
    public void setFanSpeed(int speed);
}
