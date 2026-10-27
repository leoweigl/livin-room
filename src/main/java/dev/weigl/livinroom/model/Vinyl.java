package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDate;

@Getter
@Setter
public class Vinyl extends MusicRelease {
    private VinylType vinylType;

    public Vinyl(String title, String description, LocalDate releaseDate, ReleaseType type, Duration duration, MusicGenre genre, VinylType vinylType) {
        super(title, description, releaseDate, type, duration, genre);
        this.vinylType = vinylType;
    }
}
