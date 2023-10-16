package bridge.flyship;

import bridge.flyship.implementations.*;
import bridge.flyship.interfaces.IFlyMode;
import bridge.flyship.interfaces.IStarShip;

public class ClientFlyShip {
    public static void main(String[] args) {



        IFlyMode stealthMode = new StealthMode();
        IStarShip passengerShip = new PassengerShip(stealthMode);
        passengerShip.fly();
        System.out.println("=====================================");
        IFlyMode speedMode = new SpeedMode();
        IStarShip passengerShip2 = new ExplorationShip(speedMode);
        passengerShip2.fly();
        System.out.println("=====================================");
        IFlyMode cargoMode = new EconomicMode();
        IStarShip passengerShip3 = new CargoShip(cargoMode);
        passengerShip3.fly();






    }
}
