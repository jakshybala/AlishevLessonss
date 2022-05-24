package alishev.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
alishev.lessons
Tarih: 20.05.2022, Saat: 18:47, Author: Grey 
*/
public class MainBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music myMusic = context.getBean("myMusic", Music.class );
//        MusicPlayer musicPlayer = new MusicPlayer(myMusic);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicType.HIPHOP);
        musicPlayer.playMusic(MusicType.CLASSICAL);

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(0);
        Random random = new Random();
        int numberRand = random.nextInt(4);
        System.out.println("List random numbers: " + numbers.get(numberRand));

    }


    }
