package bridge.streaming.implementations;


import bridge.streaming.interfaces.IQuality;
import bridge.streaming.interfaces.IStreamingPlatform;

public class WebPlatform implements IStreamingPlatform {

    @Override
    public void initializePlatform() {
        System.out.println("Initializing Web Platform...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video on Web Platform...");
    }
}
