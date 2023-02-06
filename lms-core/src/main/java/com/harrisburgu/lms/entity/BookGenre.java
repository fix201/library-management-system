package com.harrisburgu.lms.entity;

import java.util.Objects;

public class BookGenre {
    private Integer book_id;
    private Integer genre_id;

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookGenre bookGenre = (BookGenre) o;
        return book_id.equals(bookGenre.book_id) && genre_id.equals(bookGenre.genre_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book_id, genre_id);
    }

    @Override
    public String toString() {
        return "BookGenre{" +
                "book_id=" + book_id +
                ", genre_id=" + genre_id +
                '}';
    }
}
