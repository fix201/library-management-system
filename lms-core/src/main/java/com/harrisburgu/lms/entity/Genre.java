package com.harrisburgu.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Genre {

    @Id
    @GeneratedValue
    private Integer genreId;
    private String genreName;

    public Genre() {
    }

    public Genre(Integer genreId, String genreName) {
        this.genreId = genreId;
        this.genreName = genreName;
    }

    public Integer getGenre() {
        return genreId;
    }

    public void setGenre(Integer genreId) {
        this.genreId = genreId;
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
        return genreId.equals(genre1.genreId) && genreName.equals(genre1.genreName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, genreName);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreId +
                ", genreName='" + genreName + '\'' +
                '}';
    }
}
