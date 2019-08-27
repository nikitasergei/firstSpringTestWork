package by.itStep.nikitasergei;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class ClassicalMusic implements Music {
     private List<String> songs;


    public ClassicalMusic() {
        this.songs = new ArrayList<>();
        this.songs.add("Concord Sonata");
        this.songs.add("La Traviata");
        this.songs.add("Carmen");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return this.songs.get(random.nextInt(3));
    }
}
