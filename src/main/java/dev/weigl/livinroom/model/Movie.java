package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDate;

@Getter
@Setter
public class Movie extends PlayableItem {
    private Director director;
    private MovieGenre genre;
    private MovieFormat type;

    public Movie(String title, String description, LocalDate releaseDate, Duration duration, Director director, MovieGenre genre, MovieFormat type) {
        super(title, description, releaseDate, duration);
        this.director = director;
        this.genre = genre;
        this.type = type;
    }
}
