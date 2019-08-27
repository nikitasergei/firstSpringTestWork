package by.itStep.nikitasergei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre musicGenre) {
        Random random = new Random();
        switch (musicGenre) {
            case CLASSICAL: {
                System.out.println("Playing " + this.classicalMusic.getSong());
                break;
            }
            case ROCK: {
                System.out.println("Playing " + this.rockMusic.getSong());
                break;
            }
        }

    }
}
