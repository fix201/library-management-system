package com.harrisburgu.lms.entity;

import java.util.Objects;

public class Genre {
    private Integer genre;
    private String genre_name;

    public Integer getGenre() {
        return genre;
    }

    public void setGenre(Integer genre) {
        this.genre = genre;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre1 = (Genre) o;
        return genre.equals(genre1.genre) && genre_name.equals(genre1.genre_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre, genre_name);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genre=" + genre +
                ", genre_name='" + genre_name + '\'' +
                '}';
    }
}
