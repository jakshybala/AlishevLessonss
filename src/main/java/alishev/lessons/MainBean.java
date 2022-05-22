package alishev.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();

    }
}
