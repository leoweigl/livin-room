package dev.weigl.livinroom.model;

import lombok.Getter;

import java.util.Locale;
import java.util.Objects;

@Getter
public abstract class Genre {
    private String name;

    public Genre(String name) {
        setName(name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Genre genre)) return false;

        return name.equalsIgnoreCase(genre.name)
                && Objects.equals(o.getClass(), this.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name.toLowerCase(Locale.ROOT));
    }

    public final void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }

        this.name = name;
    }
}
