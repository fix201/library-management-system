package com.harrisburgu.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class LoanRecord {

    @Id
    @GeneratedValue
    private Integer userId;
    private Integer libraryBranchId;
    private Integer bookId;
    private LocalDateTime loanDate;
    private LocalDateTime dueDate;
    private LocalDateTime dateIn;

    public LoanRecord() {
    }

    public LoanRecord(Integer userId, Integer libraryBranchId, Integer bookId, LocalDateTime loanDate, LocalDateTime dueDate, LocalDateTime dateIn) {
        this.userId = userId;
        this.libraryBranchId = libraryBranchId;
        this.bookId = bookId;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.dateIn = dateIn;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getDateIn() {
        return dateIn;
    }

    public void setDateIn(LocalDateTime dateIn) {
        this.dateIn = dateIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoanRecord that = (LoanRecord) o;

        if (!userId.equals(that.userId)) return false;
        if (!libraryBranchId.equals(that.libraryBranchId)) return false;
        if (!bookId.equals(that.bookId)) return false;
        if (!loanDate.equals(that.loanDate)) return false;
        if (!dueDate.equals(that.dueDate)) return false;
        return Objects.equals(dateIn, that.dateIn);
    }

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + libraryBranchId.hashCode();
        result = 31 * result + bookId.hashCode();
        result = 31 * result + loanDate.hashCode();
        result = 31 * result + dueDate.hashCode();
        result = 31 * result + (dateIn != null ? dateIn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LoanRecord{" +
                "userId=" + userId +
                ", libraryBranchId=" + libraryBranchId +
                ", bookId=" + bookId +
                ", loanDate=" + loanDate +
                ", dueDate=" + dueDate +
                ", dateIn=" + dateIn +
                '}';
    }
}
