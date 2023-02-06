package com.harrisburgu.lms.entity;

import java.util.Date;
import java.util.Objects;

public class Book {
    private Integer id;
    private String title;
    private String isbn;
    private Integer publisher_id;
    private Integer edition;
    private Integer total_pages;
    private String format;
    private String language;
    private Date publication;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(Integer publisher_id) {
        this.publisher_id = publisher_id;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
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

    public Date getPublication() {
        return publication;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && isbn.equals(book.isbn) && publisher_id.equals(book.publisher_id) && Objects.equals(edition, book.edition) && total_pages.equals(book.total_pages) && Objects.equals(format, book.format) && Objects.equals(language, book.language) && Objects.equals(publication, book.publication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isbn, publisher_id, edition, total_pages, format, language, publication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher_id=" + publisher_id +
                ", edition=" + edition +
                ", total_pages=" + total_pages +
                ", format='" + format + '\'' +
                ", language='" + language + '\'' +
                ", publication=" + publication +
                '}';
    }
}
