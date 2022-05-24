package alishev.lessons;

import java.util.ArrayList;
import java.util.List;

/*
alishev.lessons
Tarih: 22.05.2022, Saat: 20:01, Author: Grey 
*/
public class RockMusic implements Music{
    private List<String > song = new ArrayList<>();

    {
        song.add("Playing: Rock music type 1");
        song.add("Playing: Rock music type 2");
        song.add("Playing: Rock music type 3");
    }
    @Override
    public List<String> getMusic() {
        return song;
    }
}
