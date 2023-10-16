package bridge.flyship.implementations;

import bridge.flyship.interfaces.IFlyMode;

public class SpeedMode implements IFlyMode {
    @Override
    public void execute() {
        System.out.println("SpeedMode: execute(): BEGIN");
    }
}
