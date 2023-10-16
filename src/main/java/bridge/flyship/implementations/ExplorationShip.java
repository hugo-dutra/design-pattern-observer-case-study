package bridge.flyship.implementations;

import bridge.flyship.interfaces.IFlyMode;
import bridge.flyship.interfaces.IStarShip;

public class ExplorationShip implements IStarShip{
    IFlyMode flyMode;

    public ExplorationShip(IFlyMode flyMode) {
        this.flyMode = flyMode;
    }

    @Override
    public void fly() {
        System.out.println("ExplorationShip: fly(): BEGIN");
        flyMode.execute();
    }
}
