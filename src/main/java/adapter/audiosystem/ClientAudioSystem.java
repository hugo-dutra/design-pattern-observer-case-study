package adapter.audiosystem;

import adapter.audiosystem.implementations.*;
import adapter.audiosystem.interfaces.IMusicPlayer;

public class ClientAudioSystem {
    public static void main(String[] args) {
        IMusicPlayer mp3Player = new MP3Player();
        mp3Player.playMusic();
        mp3Player.stopMusic();
        mp3Player.nextSong();
        mp3Player.previousSong();
        mp3Player.volumeUp();
        mp3Player.volumeDown();

        System.out.println("=====================================");
        MP4Player mp4Player = new MP4Player();
        MP4ToMP3Adapter mp4ToMP3Adapter = new MP4ToMP3Adapter(mp4Player);
        mp4ToMP3Adapter.playMusic();
        mp4ToMP3Adapter.stopMusic();
        mp4ToMP3Adapter.nextSong();
        mp4ToMP3Adapter.previousSong();
        mp4ToMP3Adapter.volumeUp();
        mp4ToMP3Adapter.volumeDown();

        System.out.println("=====================================");
        VLCPlayer vlcPlayer = new VLCPlayer();
        VLCToMP3Adapter vlcToMP3Adapter = new VLCToMP3Adapter(vlcPlayer);
        vlcToMP3Adapter.playMusic();
        vlcToMP3Adapter.stopMusic();
        vlcToMP3Adapter.nextSong();
        vlcToMP3Adapter.previousSong();
        vlcToMP3Adapter.volumeUp();
        vlcToMP3Adapter.volumeDown();
    }
}
