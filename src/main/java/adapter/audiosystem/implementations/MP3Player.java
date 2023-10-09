package adapter.audiosystem.implementations;

import adapter.audiosystem.interfaces.IMusicPlayer;

public class MP3Player implements IMusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Playing music from MP3 player");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music from MP3 player");
    }

    @Override
    public void nextSong() {
        System.out.println("Playing next song from MP3 player");
    }

    @Override
    public void previousSong() {
        System.out.println("Playing previous song from MP3 player");
    }

    @Override
    public void volumeUp() {
        System.out.println("Increasing volume from MP3 player");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decreasing volume from MP3 player");
    }
}
