package com.harrisburgu.lms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @EqualsAndHashCode @ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;
    private Integer edition;
    private Integer totalPages;
    private String format;
    private String language;
    private LocalDate publicationDate;
    @ManyToOne
    @EqualsAndHashCode.Exclude
    private Publisher publisher;
    @ManyToMany
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Author> authors;
    @ManyToMany
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Genre> genres;
}
