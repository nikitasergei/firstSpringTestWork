package by.itStep.nikitasergei;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class RockMusic implements Music {
    private List<String> songs;


    public RockMusic() {
        this.songs = new ArrayList<>();
        this.songs.add("Wind of change");
        this.songs.add("You give love a bad name");
        this.songs.add("Wind cries Mary");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return this.songs.get(random.nextInt(3));
    }
}
