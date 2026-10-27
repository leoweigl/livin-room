package dev.weigl.livinroom.model;

import lombok.Getter;

import java.time.Duration;
import java.time.LocalDate;

@Getter
public abstract class PlayableItem<G extends Genre, P extends Person> extends MediaItem<G, P> {
    private Duration duration;

    public PlayableItem(String title) {
        super(title);
    }

    public void setDuration(Duration duration) {
        if (duration == null || !duration.isNegative()) {
            this.duration = duration;
            return;
        }

        throw new IllegalArgumentException("duration cannot be negative");
    }
}
