package bridge.streaming.abstractions;

import bridge.streaming.interfaces.IQuality;
import bridge.streaming.interfaces.IStreamingPlatform;

public abstract class AbstractStreamingPlatform {
    public IQuality quality;
    public IStreamingPlatform platform;

    public AbstractStreamingPlatform(IQuality quality, IStreamingPlatform platform) {
        this.quality = quality;
        this.platform = platform;
    }

    public abstract void startStreaming();
    public abstract void stopStreaming();
}
