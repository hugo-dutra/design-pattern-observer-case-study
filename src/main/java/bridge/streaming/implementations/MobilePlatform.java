package bridge.streaming.implementations;

import bridge.streaming.interfaces.IStreamingPlatform;

public class MobilePlatform implements IStreamingPlatform {
    @Override
    public void initializePlatform() {
        System.out.println("Initializing Mobile Platform...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video on Mobile Platform...");
    }
}
