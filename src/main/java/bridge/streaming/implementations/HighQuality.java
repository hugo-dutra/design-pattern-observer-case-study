package bridge.streaming.implementations;

import bridge.streaming.interfaces.IQuality;

public class HighQuality implements IQuality {
    @Override
    public void setQuality() {
        System.out.println("High Quality setting...");
    }

    @Override
    public void getQuality() {
        System.out.println("High Quality getting...");
    }
}
