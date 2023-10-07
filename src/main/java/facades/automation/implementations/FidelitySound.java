package facades.automation.implementations;

import facades.automation.interfaces.ISystemSound;

public class FidelitySound implements ISystemSound {
    @Override
    public void play() {
        System.out.println("FidelitySound play");
    }

    @Override
    public void stop() {
        System.out.println("FidelitySound stop");
    }

    @Override
    public void pause() {
        System.out.println("FidelitySound pause");
    }
}
