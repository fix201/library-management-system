package com.harrisburgu.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class BookGenre {

    @Id
    @GeneratedValue
    private Integer bookId;
    private Integer genreId;

    public BookGenre() {
    }

    public BookGenre(Integer bookId, Integer genreId) {
        this.bookId = bookId;
        this.genreId = genreId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookGenre bookGenre = (BookGenre) o;
        return bookId.equals(bookGenre.bookId) && genreId.equals(bookGenre.genreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, genreId);
    }

    @Override
    public String toString() {
        return "BookGenre{" +
                "bookId=" + bookId +
                ", genreId=" + genreId +
                '}';
    }
}
