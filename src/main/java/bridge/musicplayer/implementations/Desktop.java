package bridge.musicplayer.implementations;

import bridge.musicplayer.interfaces.IPlatform;

public class Desktop implements IPlatform {
    private String name;
    @Override
    public void play(String songName) {
        this.name = songName;
        System.out.println("Playing " + songName + " on desktop");
    }

    @Override
    public void showAd() {
        System.out.println("Showing ad on desktop");
    }

    @Override
    public Byte[] getSong() {
        System.out.println("Getting song from desktop" + this.name);
        return new Byte[0];
    }
}
