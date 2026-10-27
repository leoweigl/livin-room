package dev.weigl.livinroom.model;

import lombok.Getter;

import java.time.Duration;
import java.time.LocalDate;

@Getter
public abstract class PlayableItem extends MediaItem {
    private Duration duration;

    public PlayableItem(String title, String description, LocalDate releaseDate, Duration duration) {
        super(title, description, releaseDate);
        this.duration = duration;
    }

    public void setDuration(Duration duration) {
        if (duration == null) {
            throw new IllegalArgumentException("duration cannot be null");
        }

        if (duration.isNegative()) {
            throw new IllegalArgumentException("duration cannot be negative");
        }

        this.duration = duration;
    }
}
