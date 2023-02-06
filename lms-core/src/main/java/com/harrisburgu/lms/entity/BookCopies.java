package com.harrisburgu.lms.entity;

import java.util.Objects;

public class BookCopies {
    private Integer library_branch_id;
    private Integer book_id;
    private Integer no_of_copies;

    public BookCopies(Integer library_branch_id, Integer book_id, Integer no_of_copies) {
        this.library_branch_id = library_branch_id;
        this.book_id = book_id;
        this.no_of_copies = no_of_copies;
    }

    public Integer getLibrary_branch_id() {
        return library_branch_id;
    }

    public void setLibrary_branch_id(Integer library_branch_id) {
        this.library_branch_id = library_branch_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getNo_of_copies() {
        return no_of_copies;
    }

    public void setNo_of_copies(Integer no_of_copies) {
        this.no_of_copies = no_of_copies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookCopies that = (BookCopies) o;
        return library_branch_id.equals(that.library_branch_id) && book_id.equals(that.book_id) && Objects.equals(no_of_copies, that.no_of_copies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(library_branch_id, book_id, no_of_copies);
    }

    @Override
    public String toString() {
        return "BookCopies{" +
                "library_branch_id=" + library_branch_id +
                ", book_id=" + book_id +
                ", no_of_copies=" + no_of_copies +
                '}';
    }
}
