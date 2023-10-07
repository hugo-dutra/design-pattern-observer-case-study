package facades.automation.implementations;

import facades.automation.interfaces.*;
import facades.automation.models.GeographicCoordinate;

import java.util.HashMap;

public class CarControlMode implements ICarControlModes {
    private IIgnition ignition;
    private ISumRoof sumRoof;
    private ISystemNavigation systemNavigation;
    private ISystemSound systemSound;
    private ITemperatureControl temperatureControl;

    public CarControlMode() {
        loadDevices();
    }

    @Override
    public void startTrip() {
        ignition.start();
        sumRoof.closeTo(0);
        systemNavigation.turnOn();
        systemNavigation.navigateTo(new GeographicCoordinate(0, 0));
        systemSound.play();
        temperatureControl.setTemperature(20);
        temperatureControl.setAirSpeed(1);
    }

    @Override
    public void restMode() {
        ignition.stop();
        sumRoof.openTo(50);
        systemSound.pause();
        systemNavigation.turnOff();
        temperatureControl.setTemperature(25);
        temperatureControl.setAirSpeed(0);
    }

    private void loadDevices() {
        ignition = new MecanicIgnition();
        sumRoof = new MecanicSumRoof();
        systemNavigation = new GpsNavitation();
        systemSound = new FidelitySound();
        temperatureControl = new TemperatureControl();
    }
}
