package bridge.flyship.implementations;

import bridge.flyship.interfaces.IFlyMode;

public class EconomicMode implements IFlyMode {
    @Override
    public void execute() {
        System.out.println("EconomicMode: execute(): BEGIN");
    }
}
