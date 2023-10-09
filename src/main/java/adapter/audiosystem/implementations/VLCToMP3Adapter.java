package adapter.audiosystem.implementations;

import adapter.audiosystem.interfaces.IMusicPlayer;

public class VLCToMP3Adapter implements IMusicPlayer {
    private final VLCPlayer vlcPlayer;

    public VLCToMP3Adapter(VLCPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void playMusic() {
        vlcPlayer.playMusicVLC();
    }

    @Override
    public void stopMusic() {
        vlcPlayer.stopMusicVLC();
    }

    @Override
    public void nextSong() {
        vlcPlayer.nextSongVLC();
    }

    @Override
    public void previousSong() {
        vlcPlayer.previousSongVLC();
    }

    @Override
    public void volumeUp() {
        vlcPlayer.volumeUpVLC();
    }

    @Override
    public void volumeDown() {
        vlcPlayer.volumeDownVLC();
    }
}
