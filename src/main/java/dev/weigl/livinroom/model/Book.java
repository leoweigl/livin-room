package dev.weigl.livinroom.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Book extends MediaItem {

    @Setter
    private String isbn;

    private List<Author> authors ;

    @Setter
    private int pages;

    @Setter
    private BookGenre genre;

    public Book(String title, String description, LocalDate releaseDate, String isbn, int pages, BookGenre genre) {
        super(title, description, releaseDate);
        this.authors = new ArrayList<>();
        this.isbn = isbn;
        this.pages = pages;
        this.genre = genre;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int countAuthors() {
        return authors.size();
    }

    public List<Author> getAuthors() {
        return List.copyOf(authors);
    }
}
