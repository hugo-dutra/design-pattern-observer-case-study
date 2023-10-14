package bridge.musicplayer.interfaces;

public interface IPlatform {
    void play(String songName);
    void showAd();
    Byte[] getSong();
}
