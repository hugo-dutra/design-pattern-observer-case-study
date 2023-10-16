package bridge.streaming;

import bridge.streaming.abstractimplementations.AmazonPrime;
import bridge.streaming.abstractimplementations.Hulu;
import bridge.streaming.abstractimplementations.Netflix;
import bridge.streaming.implementations.*;
import bridge.streaming.interfaces.IQuality;
import bridge.streaming.interfaces.IStreamingPlatform;

public class ClientStreaming {
    public static void main(String[] args) {
        IQuality quality = new LowQuality();
        IStreamingPlatform platform = new WebPlatform();
        Hulu hulu = new Hulu(quality, platform);
        hulu.startStreaming();
        hulu.stopStreaming();

        System.out.println("--------------------------------------------------");
        quality = new MediumQuality();
        platform = new TVPlatform();
        Netflix netflix = new Netflix(quality, platform);
        netflix.startStreaming();
        netflix.stopStreaming();

        System.out.println("--------------------------------------------------");
        quality = new HighQuality();
        platform = new MobilePlatform();
        AmazonPrime amazonPrime = new AmazonPrime(quality, platform);
        amazonPrime.startStreaming();
        amazonPrime.stopStreaming();
    }
}
