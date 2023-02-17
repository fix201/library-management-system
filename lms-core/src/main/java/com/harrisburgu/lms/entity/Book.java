package com.harrisburgu.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String isbn;
    private Long publisherId;
    private Integer edition;
    private Integer totalPages;
    private String format;
    private String language;
    private LocalDateTime publicationDate;

    public Book() {
    }

    public Book(Long id, String title, String isbn, Long publisherId, Integer edition, Integer totalPages, String format, String language, LocalDateTime publicationDate) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.publisherId = publisherId;
        this.edition = edition;
        this.totalPages = totalPages;
        this.format = format;
        this.language = language;
        this.publicationDate = publicationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDateTime publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && isbn.equals(book.isbn) && publisherId.equals(book.publisherId) && Objects.equals(edition, book.edition) && totalPages.equals(book.totalPages) && Objects.equals(format, book.format) && Objects.equals(language, book.language) && Objects.equals(publicationDate, book.publicationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isbn, publisherId, edition, totalPages, format, language, publicationDate);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisherId=" + publisherId +
                ", edition=" + edition +
                ", totalPages=" + totalPages +
                ", format='" + format + '\'' +
                ", language='" + language + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
