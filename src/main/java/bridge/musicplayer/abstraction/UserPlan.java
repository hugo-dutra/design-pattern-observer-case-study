package bridge.musicplayer.abstraction;

import bridge.musicplayer.interfaces.IPlatform;

public abstract class UserPlan {
    protected IPlatform platform;

    public UserPlan(IPlatform platform) {
        this.platform = platform;
    }

    public abstract void play(String songName);
    public abstract void showAd();
    public abstract Byte[] getSong();

}
