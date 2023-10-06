package facades.smarthome.interfaces;

public interface ISystemSound {
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
    public void setChannel(int channel);
}
