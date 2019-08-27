package by.itStep.nikitasergei;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        mp.playMusic(MusicGenre.CLASSICAL);
        mp.playMusic(MusicGenre.ROCK);
        context.close();

    }
}
