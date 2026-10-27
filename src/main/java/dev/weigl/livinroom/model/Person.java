package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
public abstract class Person {

    private Long id;

    @Setter
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        return Objects.equals(id, person.id)
                && Objects.equals(name, person.name)
                && Objects.equals(o.getClass(), this.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
