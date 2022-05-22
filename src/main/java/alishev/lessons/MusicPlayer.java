package alishev.lessons;

import java.util.ArrayList;
import java.util.List;

/*
alishev.lessons
Tarih: 20.05.2022, Saat: 19:52, Author: Grey 
*/
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public Music getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
//        System.out.println(music.getMusic());
        musicList.stream().forEach(musicList -> System.out.println(musicList.getMusic()));


    }


}
