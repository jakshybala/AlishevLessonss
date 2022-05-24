package alishev.lessons;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
alishev.lessons
Tarih: 20.05.2022, Saat: 19:39, Author: Grey 
*/
@Component
public class HipHop implements Music{

    public List<String> song = new ArrayList<>();
    {
        song.add("Playing: Kygo's tropical music");
        song.add("Playing: Timberland's Hip-Hop music");
        song.add("Playing: Mirbek's Hip-Hop music");
    }

    @Override
    public List<String> getMusic() {
        return song;
    }
}
