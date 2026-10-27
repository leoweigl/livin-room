package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Movie extends PlayableItem<MovieGenre, Director> {
    @Setter
    private MovieFormat movieFormat;

    public Movie(String title) {
        super(title);
    }
}
