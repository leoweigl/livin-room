package dev.weigl.livinroom.model;

import java.time.Duration;
import java.time.LocalDate;

public class Cd extends MusicRelease {
    public Cd(String title, String description, LocalDate releaseDate, ReleaseType type, Duration duration, MusicGenre genre) {
        super(title, description, releaseDate, type, duration, genre);
    }
}
