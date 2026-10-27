package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDate;
import java.util.*;

@Getter
public class MusicRelease extends PlayableItem<MusicGenre, Artist> {
    @Setter
    private ReleaseType type;

    @Setter
    private MusicFormat musicFormat;

    public MusicRelease(String title) {
        super(title);
    }
}
