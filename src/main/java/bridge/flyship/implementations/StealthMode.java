package bridge.flyship.implementations;

import bridge.flyship.interfaces.IFlyMode;

public class StealthMode implements IFlyMode {
    @Override
    public void execute() {
        System.out.println("StealthMode: execute(): BEGIN");
    }
}
