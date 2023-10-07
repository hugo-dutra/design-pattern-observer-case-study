package facades.automation.implementations;

import facades.automation.interfaces.IIgnition;

public class MecanicIgnition implements IIgnition {
    @Override
    public void start() {
        System.out.println("MecanicIgnition start");
    }

    @Override
    public void stop() {
        System.out.println("MecanicIgnition stop");
    }
}
