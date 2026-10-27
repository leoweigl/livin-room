package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Artist extends Person {
    public Artist(String name) {
        super(name);
    }
}
