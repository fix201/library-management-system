package com.harrisburgu.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class BookCopies {
    
    @Id
    @GeneratedValue
    private Integer libraryBranchId;
    private Integer bookId;
    private Integer noOfCopies;

    public BookCopies() {
    }

    public BookCopies(Integer libraryBranchId, Integer bookId, Integer noOfCopies) {
        this.libraryBranchId = libraryBranchId;
        this.bookId = bookId;
        this.noOfCopies = noOfCopies;
    }

    public Integer getLibraryBranchId() {
        return libraryBranchId;
    }

    public void setLibraryBranchId(Integer libraryBranchId) {
        this.libraryBranchId = libraryBranchId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(Integer noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookCopies that = (BookCopies) o;
        return libraryBranchId.equals(that.libraryBranchId) && bookId.equals(that.bookId) && Objects.equals(noOfCopies, that.noOfCopies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libraryBranchId, bookId, noOfCopies);
    }
}
