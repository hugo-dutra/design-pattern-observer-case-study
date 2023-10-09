package adapter.audiosystem.implementations;

import adapter.audiosystem.interfaces.IMusicPlayer;

public class MP4ToMP3Adapter implements IMusicPlayer {
    private final MP4Player mp4Player;

    public MP4ToMP3Adapter(MP4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void playMusic() {
        mp4Player.playMusicMp4();
    }

    @Override
    public void stopMusic() {
        mp4Player.stopMusicMp4();
    }

    @Override
    public void nextSong() {
        mp4Player.nextSongMp4();
    }

    @Override
    public void previousSong() {
        mp4Player.previousSongMp4();
    }

    @Override
    public void volumeUp() {
        mp4Player.volumeUpMp4();
    }

    @Override
    public void volumeDown() {
        mp4Player.volumeDownMp4();
    }
}
