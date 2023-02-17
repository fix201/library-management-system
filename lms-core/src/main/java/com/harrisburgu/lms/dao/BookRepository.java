package com.harrisburgu.lms.dao;

import com.harrisburgu.lms.entity.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {
	
	@Query("select b from Book b where b.id in " +
			"(select ba.bookId from BookAuthor ba where ba.authorId = :authorId)")
	public List<Book> findBookByAuthorId(@Param("authorId") Long authorId);

	@Query("select b from Book b where b.id in " +
			"(select ba.bookId from BookAuthor ba where ba.authorId = :publisherId)")
	public List<Book> findBookByPublisherId(@Param("publisherId") Long publisherId);

	@Query("select b from Book b where b.id in " +
			"(select bg.bookId from BookGenre bg where bg.genreId = :genreId)")
	List<Book> findBookByGenreId(@Param("genreId") Long genreId);

	@Query("select b from Book b where b.title like %:title%")
	List<Book> findBookByTitle(@Param("title") String title);
}
