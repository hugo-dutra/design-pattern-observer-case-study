package bridge.musicplayer;

import bridge.musicplayer.abstraction.UserPlan;
import bridge.musicplayer.implementations.Desktop;
import bridge.musicplayer.implementations.FreePlan;
import bridge.musicplayer.implementations.Mobile;
import bridge.musicplayer.implementations.PremiumPlan;
import bridge.musicplayer.interfaces.IPlatform;

public class ClientBridgeMusicPlayer {
    public static void main(String[] args) {
        IPlatform platform = new Desktop();
        UserPlan plan = new PremiumPlan(platform);
        plan.play("song.mp3");
        plan.getSong();
        plan.showAd();

        System.out.println("-----");

        plan = new FreePlan(platform);
        plan.play("song.mp3");
        plan.getSong();
        plan.showAd();

        System.out.println("=====\n\n");

        IPlatform platform2 = new Mobile();
        plan = new PremiumPlan(platform2);
        plan.play("song.mp3");
        plan.getSong();
        plan.showAd();

        System.out.println("-----");

        plan = new FreePlan(platform2);
        plan.play("song.mp3");
        plan.getSong();
        plan.showAd();
    }
}
