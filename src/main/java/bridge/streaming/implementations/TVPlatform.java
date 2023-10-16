package bridge.streaming.implementations;

import bridge.streaming.interfaces.IStreamingPlatform;

public class TVPlatform implements IStreamingPlatform {
    @Override
    public void initializePlatform() {
        System.out.println("Initializing TV Platform...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video on TV Platform...");
    }
}
