package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Person {

    private Long id;

    @Setter
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
