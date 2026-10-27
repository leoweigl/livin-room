package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Book extends MediaItem<BookGenre, Author> {
    @Setter
    private String isbn;
    private int pages;

    public Book(String title) {
        super(title);
    }

    public void setPages(int pages) {
        if (pages < 0) {
            throw new IllegalArgumentException("pages cannot be negative");
        }

        this.pages = pages;
    }
}
