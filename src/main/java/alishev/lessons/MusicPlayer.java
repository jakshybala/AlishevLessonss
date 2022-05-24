package alishev.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
alishev.lessons
Tarih: 20.05.2022, Saat: 19:52, Author: Grey 
*/

@Component
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;
    private ClassicalMusic classicalMusic;
    private HipHop hipHop;
    private RockMusic rockMusic;

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

//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, HipHop hipHop) {
        this.classicalMusic = classicalMusic;
        this.hipHop = hipHop;
    }
    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(MusicType musicType) {
//        System.out.println(music.getMusic());
//        musicList.stream().forEach(musicList -> System.out.println(musicList.getMusic())); -get list of music

        Random random = new Random();
        int randomMusic = random.nextInt(3);
        if (musicType == MusicType.CLASSICAL) {
            System.out.println(classicalMusic.getMusic().get(randomMusic));
        }
        else  {

            System.out.println(hipHop.getMusic().get(randomMusic));
        }

    }


}
