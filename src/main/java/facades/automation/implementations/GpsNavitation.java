package facades.automation.implementations;

import facades.automation.interfaces.ISystemNavigation;
import facades.automation.models.GeographicCoordinate;

public class GpsNavitation implements ISystemNavigation {
    @Override
    public void navigateTo(GeographicCoordinate coordinate) {
        System.out.println("GpsNavitation navigateTo"+coordinate.toString());
    }

    @Override
    public void turnOn() {
        System.out.println("GpsNavitation turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("GpsNavitation turnOff");
    }
}
