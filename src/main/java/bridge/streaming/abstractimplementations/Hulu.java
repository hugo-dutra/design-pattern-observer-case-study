package bridge.streaming.abstractimplementations;

import bridge.streaming.abstractions.AbstractStreamingPlatform;
import bridge.streaming.interfaces.IQuality;
import bridge.streaming.interfaces.IStreamingPlatform;

public class Hulu extends AbstractStreamingPlatform {
    public Hulu(IQuality quality, IStreamingPlatform platform) {
        super(quality, platform);
    }
    @Override
    public void startStreaming() {
        System.out.println("Starting Hulu...");
        this.quality.setQuality();
        this.platform.initializePlatform();
        this.platform.playVideo();
    }

    @Override
    public void stopStreaming() {
        System.out.println("Stopping Hulu...");
    }
}
