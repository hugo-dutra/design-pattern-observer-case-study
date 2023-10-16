package bridge.streaming.abstractimplementations;

import bridge.streaming.abstractions.AbstractStreamingPlatform;
import bridge.streaming.interfaces.IQuality;
import bridge.streaming.interfaces.IStreamingPlatform;

public class Netflix extends AbstractStreamingPlatform {
    public Netflix(IQuality quality, IStreamingPlatform platform) {
        super(quality, platform);
    }

    @Override
    public void startStreaming() {
        System.out.println("Starting Netflix...");
        this.quality.setQuality();
        this.platform.initializePlatform();
        this.platform.playVideo();
    }

    @Override
    public void stopStreaming() {
        System.out.println("Stopping Netflix...");
    }


}