package bridge.musicplayer.implementations;

import bridge.musicplayer.abstraction.UserPlan;
import bridge.musicplayer.interfaces.IPlatform;

public class PremiumPlan extends UserPlan {

    public PremiumPlan(IPlatform platform) {
        super(platform);
    }

    @Override
    public void play(String songName) {
        platform.play(songName);
    }

    @Override
    public void showAd() {
        System.out.println("No ads on premium plan");
    }

    @Override
    public Byte[] getSong() {
        return platform.getSong();
    }
}
