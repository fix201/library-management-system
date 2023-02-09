package com.harrisburgu.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Genre {

    @Id
    @GeneratedValue
    private Integer genre;
    private String genreName;

    public Genre() {
    }

    public Genre(Integer genre, String genreName) {
        this.genre = genre;
        this.genreName = genreName;
    }

    public Integer getGenre() {
        return genre;
    }

    public void setGenre(Integer genre) {
        this.genre = genre;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre1 = (Genre) o;
        return genre.equals(genre1.genre) && genreName.equals(genre1.genreName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre, genreName);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genre=" + genre +
                ", genreName='" + genreName + '\'' +
                '}';
    }
}
