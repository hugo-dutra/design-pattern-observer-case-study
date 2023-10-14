package bridge.musicplayer.implementations;

import bridge.musicplayer.interfaces.IPlatform;

public class Mobile implements IPlatform {
    private String name;
    @Override
    public void play(String songName) {
        this.name = songName;
        System.out.println("Playing " + songName + " on mobile");
    }

    @Override
    public void showAd() {
        System.out.println("Showing ad on mobile");
    }

    @Override
    public Byte[] getSong() {
        System.out.println("Getting song from mobile" + this.name);
        return new Byte[0];
    }
}
