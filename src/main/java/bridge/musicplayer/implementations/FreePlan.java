package bridge.musicplayer.implementations;

import bridge.musicplayer.abstraction.UserPlan;
import bridge.musicplayer.interfaces.IPlatform;

public class FreePlan extends UserPlan {
    public FreePlan(IPlatform platform) {
        super(platform);
    }

    @Override
    public void play(String songName) {
        platform.play(songName);
    }

    @Override
    public void showAd() {
        platform.showAd();
    }

    @Override
    public Byte[] getSong() {
        System.out.println("No download song on free plan");
        return new Byte[0];
    }
}
