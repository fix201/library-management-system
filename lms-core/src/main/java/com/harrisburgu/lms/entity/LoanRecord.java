package com.harrisburgu.lms.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class LoanRecord {
    private Integer userID;
    private Integer libraryBranchId;
    private Integer bookID;
    private LocalDateTime loanDate;
    private LocalDateTime dueDate;
    private LocalDateTime dateIn;

    public LoanRecord() {
    }

    public LoanRecord(Integer userID, Integer libraryBranchId, Integer bookID, LocalDateTime loanDate, LocalDateTime dueDate, LocalDateTime dateIn) {
        this.userID = userID;
        this.libraryBranchId = libraryBranchId;
        this.bookID = bookID;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.dateIn = dateIn;
    }
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getLibraryBranchId() {
        return libraryBranchId;
    }

    public void setLibraryBranchId(Integer libraryBranchId) {
        this.libraryBranchId = libraryBranchId;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
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

        if (!userID.equals(that.userID)) return false;
        if (!libraryBranchId.equals(that.libraryBranchId)) return false;
        if (!bookID.equals(that.bookID)) return false;
        if (!loanDate.equals(that.loanDate)) return false;
        if (!dueDate.equals(that.dueDate)) return false;
        return Objects.equals(dateIn, that.dateIn);
    }

    @Override
    public int hashCode() {
        int result = userID.hashCode();
        result = 31 * result + libraryBranchId.hashCode();
        result = 31 * result + bookID.hashCode();
        result = 31 * result + loanDate.hashCode();
        result = 31 * result + dueDate.hashCode();
        result = 31 * result + (dateIn != null ? dateIn.hashCode() : 0);
        return result;
    }
}
