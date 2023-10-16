package bridge.flyship.implementations;

import bridge.flyship.interfaces.IFlyMode;
import bridge.flyship.interfaces.IStarShip;

public class CargoShip implements IStarShip {
    IFlyMode flyMode;

    public CargoShip(IFlyMode flyMode) {
        this.flyMode = flyMode;
    }

    @Override
    public void fly() {
        System.out.println("CargoShip: fly(): BEGIN");
        flyMode.execute();
    }


}
