package com.harrisburgu.lms.entity;

import java.util.Objects;

public class BookAuthor {
    private Integer book_id;
    private Integer author_id;

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAuthor that = (BookAuthor) o;
        return book_id.equals(that.book_id) && author_id.equals(that.author_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book_id, author_id);
    }

    @Override
    public String toString() {
        return "BookAuthor{" +
                "book_id=" + book_id +
                ", author_id=" + author_id +
                '}';
    }
}
