package facades.automation;

import facades.automation.implementations.CarControlMode;
import facades.automation.interfaces.ICarControlModes;

public class ClientFacadeAutomation {
    public static void main(String[] args) {
        ICarControlModes carControlModes = new CarControlMode();
        System.out.println("Trip to the beach");
        carControlModes.startTrip();
        System.out.println("==================================");
        System.out.println("Rest mode");
        carControlModes.restMode();
    }
}
