package alishev.lessons;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
alishev.lessons
Tarih: 20.05.2022, Saat: 19:39, Author: Grey 
*/
@Component
public class ClassicalMusic implements Music{

    private List<String> song = new ArrayList<>();

    {
        song.add("Playing: Beethoven's classical music");
        song.add("Playing: Mozart's classical music");
        song.add("Playing: Chuikovskiy's classical music");
    }


    @Override
    public List<String> getMusic() {
        return song;
    }

//    @Override
//    public List<Music> getMusic() {
//        return "Play Classical music";
//    }

}
