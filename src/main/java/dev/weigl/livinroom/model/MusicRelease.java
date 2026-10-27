package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class MusicRelease extends MediaItem {

    @Setter
    private Duration duration;

    private final List<Artist> artists;

    @Setter
    private ReleaseType type;

    @Setter
    private MusicGenre genre;

    public MusicRelease(String title, String description, LocalDate releaseDate, ReleaseType type, Duration duration, MusicGenre genre) {
        super(title, description, releaseDate);
        this.artists = new ArrayList<>();
        this.type = type;
        this.duration = duration;
        this.genre = genre;
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public int countArtists() {
        return artists.size();
    }

    public List<Artist> getArtists() {
        return List.copyOf(artists);
    }
}
