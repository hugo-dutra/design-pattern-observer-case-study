package facades.automation.implementations;

import facades.automation.interfaces.ITemperatureControl;

public class TemperatureControl implements ITemperatureControl {
    @Override
    public void setTemperature(int temperature) {
        System.out.println("TemperatureControl setTemperature to: "+temperature+" degrees");
    }

    @Override
    public void setAirSpeed(int speed) {
        System.out.println("TemperatureControl setAirSpeed to: "+speed+" radians/sec");
    }
}
