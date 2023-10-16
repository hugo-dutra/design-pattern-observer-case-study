package bridge.flyship.implementations;

import bridge.flyship.interfaces.IFlyMode;
import bridge.flyship.interfaces.IStarShip;

public class PassengerShip implements IStarShip {
    IFlyMode flyMode;

    public PassengerShip(IFlyMode flyMode) {
        this.flyMode = flyMode;
    }
    @Override
    public void fly() {
        System.out.println("PassengerShip: fly(): BEGIN");
        flyMode.execute();
    }


}
