package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.*;

public abstract class MediaItem<G extends Genre, P extends Person> {
    @Getter
    private Long id;

    @Getter
    private String title;

    @Getter
    private String description;

    private Set<G> genres = new LinkedHashSet<>();
    private List<P> creators = new ArrayList<>();

    @Getter
    @Setter
    private LocalDate releaseDate;

    public MediaItem(String title) {
        setTitle(title);
    }

    public final void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title cannot be null or empty");
        }

        this.title = title.strip();
    }

    public final void setDescription(String description) {
        if (description == null || !description.isBlank()) {
            this.description = description;
            return;
        }

        throw new IllegalArgumentException("description cannot be empty");
    }

    public final void addGenres(Collection<G> genres) {
        Objects.requireNonNull(genres, "genres cannot be null");
        this.genres.addAll(genres);
    }

    public final void addCreators(List<P> creators) {
        Objects.requireNonNull(creators, "writers cannot be null");
        this.creators.addAll(creators);
    }

    public final int countCreators() {
        return creators.size();
    }

    public final P removeCreator(P creator) {
        if (!creators.remove(creator)) {
            throw new IllegalArgumentException("could not remove creator " + creator);
        }

        return creator;
    }

    public final Set<G> getGenres() {
        return Collections.unmodifiableSet(genres);
    }

    public final List<P> getCreators() {
        return Collections.unmodifiableList(creators);
    }
}
