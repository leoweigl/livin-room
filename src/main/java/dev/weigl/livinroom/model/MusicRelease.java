package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class MusicRelease extends PlayableItem {
    private final List<Artist> artists;

    @Setter
    private ReleaseType type;

    @Setter
    private MusicFormat musicFormat;

    @Setter
    private MusicGenre genre;

    public MusicRelease(String title, String description, LocalDate releaseDate, Duration duration, ReleaseType type, MusicGenre genre, MusicFormat musicFormat) {
        super(title, description, releaseDate, duration);
        this.artists = new ArrayList<>();
        this.type = type;
        this.genre = genre;
        this.musicFormat = musicFormat;
    }

    public void addArtists(Artist ... artists) {
        Collections.addAll(this.artists, artists);
    }

    public int countArtists() {
        return artists.size();
    }

    public List<Artist> getArtists() {
        return List.copyOf(artists);
    }
}
