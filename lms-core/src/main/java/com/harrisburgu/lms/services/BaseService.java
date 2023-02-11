package com.harrisburgu.lms.services;

import com.harrisburgu.lms.dao.AccessLevelRepository;
import com.harrisburgu.lms.dao.AuthorRepository;
import com.harrisburgu.lms.dao.BookAuthorRepository;
import com.harrisburgu.lms.dao.BookCopiesRepository;
import com.harrisburgu.lms.dao.BookGenreRepository;
import com.harrisburgu.lms.dao.BookRepository;
import com.harrisburgu.lms.dao.GenreRepository;
import com.harrisburgu.lms.dao.LibrarianRepository;
import com.harrisburgu.lms.dao.LibraryBranchRepository;
import com.harrisburgu.lms.dao.LoanRecordRepository;
import com.harrisburgu.lms.dao.PublisherRepository;
import com.harrisburgu.lms.dao.UserRepository;
import com.harrisburgu.lms.entity.Author;
import com.harrisburgu.lms.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public abstract class BaseService {

	@Autowired
	protected AccessLevelRepository accessLevelRepo;
	@Autowired
	protected AuthorRepository authorRepo;
	@Autowired
	protected BookAuthorRepository bookAuthorRepo;
	@Autowired
	protected BookCopiesRepository bookCopiesRepo;
	@Autowired
	protected BookGenreRepository bookGenreRepo;
	@Autowired
	protected BookRepository bookRepo;
	@Autowired
	protected GenreRepository genreRepo;
	@Autowired
	protected LibrarianRepository librarianRepo;
	@Autowired
	protected LibraryBranchRepository libraryBranchRepo;
	@Autowired
	protected LoanRecordRepository loanRecordRepo;
	@Autowired
	protected PublisherRepository publisherRepo;
	@Autowired
	protected UserRepository userRepo;

	protected final Logger LOGGER = LoggerFactory.getLogger(BaseService.class);

	public Object getObjectFromOptional(Optional optional) {
		return optional.isPresent() ? optional.get() : null;
	}
	
	public Author getAuthorById(Long authorId) {
		bookAuthorRepo.findAll();
		Author author = (Author) getObjectFromOptional(authorRepo.findById(authorId));
		LOGGER.info("Author with id {}: {}", authorId, author);
		return author;
	}
	
	public List<Author> getAuthorsByName(String authorName) {
		List<Author> authors = authorRepo.findAuthorByName(authorName.toLowerCase());
		LOGGER.info("Authors with name {}: {}", authorName, authors);
		return authors;
	}
	
	public List<Author> getAllAuthors() {
		List<Author> authors = authorRepo.findAll();
		LOGGER.info("Authors: {}", authors);
		return authors;
	}
	
	public List<Book> getBooksByAuthor(Long authorId) {
		return null;
	}

	public List<Book> getBooksByGenre(Long genreId) {
		return null;
	}

	public Book getBookById(Long bookId) {
		return null;
	}
	
	public List<Book> getBooksByTitle(String title) {
		return null;
	}
	
	
	
}
