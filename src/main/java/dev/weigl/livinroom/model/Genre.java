package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Genre {
    private String name;

    public Genre(String name) {
        this.name = name;
    }
}
