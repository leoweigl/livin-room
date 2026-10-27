package dev.weigl.livinroom.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
public abstract class MediaItem {
    private Long id;

    @Setter
    private String title;

    @Setter
    private String description;

    @Setter
    private LocalDate releaseDate;

    public MediaItem(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }
}
