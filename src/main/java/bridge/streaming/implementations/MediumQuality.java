package bridge.streaming.implementations;

import bridge.streaming.interfaces.IQuality;

public class MediumQuality implements IQuality {
    @Override
    public void setQuality() {
        System.out.println("Medium Quality setting...");
    }

    @Override
    public void getQuality() {
        System.out.println("Medium Quality getting...");
    }
}
