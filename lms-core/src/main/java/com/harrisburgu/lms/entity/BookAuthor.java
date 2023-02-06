package com.harrisburgu.lms.entity;

import java.util.Objects;

public class BookAuthor {
    private Integer bookId;
    private Integer authorId;

    public BookAuthor() {
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAuthor that = (BookAuthor) o;
        return bookId.equals(that.bookId) && authorId.equals(that.authorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, authorId);
    }

    @Override
    public String toString() {
        return "BookAuthor{" +
                "bookId=" + bookId +
                ", authorId=" + authorId +
                '}';
    }
}
