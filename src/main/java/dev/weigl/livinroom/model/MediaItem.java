package dev.weigl.livinroom.model;

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
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title cannot be null or empty");
        }

        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }
}
