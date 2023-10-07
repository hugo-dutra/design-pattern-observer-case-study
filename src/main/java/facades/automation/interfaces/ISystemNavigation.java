package facades.automation.interfaces;

import facades.automation.models.GeographicCoordinate;

public interface ISystemNavigation {
    void navigateTo(GeographicCoordinate coordinate);
    void turnOn();
    void turnOff();


}
