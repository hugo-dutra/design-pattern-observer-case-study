package bridge.streaming.implementations;

import bridge.streaming.interfaces.IQuality;

public class LowQuality implements IQuality {
    public void setQuality() {
        System.out.println("Low Quality setting...");
    }

    public void getQuality() {
        System.out.println("Low Quality getting...");
    }
}
