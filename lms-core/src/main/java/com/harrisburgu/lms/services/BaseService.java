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
import com.harrisburgu.lms.entity.Genre;
import com.harrisburgu.lms.entity.LoanRecord;
import com.harrisburgu.lms.entity.Publisher;
import com.harrisburgu.lms.entity.User;
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

	/**
	 * Get a declared {@link com.harrisburgu.lms.entity Entity} from {@link java.util.Optional}
	 * @param optional
	 * @return an {@link com.harrisburgu.lms.entity Entity}
	 */
	public Object getObjectFromOptional(Optional optional) {
		return optional.isPresent() ? optional.get() : null;
	}

	/**
	 * Get author by the
	 * @param authorId author id
	 * @return {@link com.harrisburgu.lms.entity.Author} object
	 */
	public Author getAuthorById(Long authorId) {
		Author author = (Author) getObjectFromOptional(authorRepo.findById(authorId));
		LOGGER.info("Author with id {}: {}", authorId, author);
		return author;
	}

	/**
	 * Get authors by the author name
	 * @param authorName
	 * @return List of {@link com.harrisburgu.lms.entity.Author} objects with same or similar name
	 */
	public List<Author> getAuthorsByName(String authorName) {
		List<Author> authors = authorRepo.findAuthorByName(authorName.toLowerCase());
		LOGGER.info("Authors with name {}: {}", authorName, authors);
		return authors;
	}

	/**
	 * Get all authors
	 * @return List of all {@link com.harrisburgu.lms.entity.Author} objects
	 */
	public List<Author> getAllAuthors() {
		List<Author> authors = authorRepo.findAll();
		LOGGER.info("Authors: {}", authors);
		return authors;
	}

	/**
	 * Get book by the author id
	 * @param authorId
	 * @return List of {@link com.harrisburgu.lms.entity.Book} objects
	 */
	public List<Book> getBooksByAuthor(Long authorId) {
		return null;
	}

	/**
	 * Get book by the genre id
	 * @param genreId
	 * @return List of {@link com.harrisburgu.lms.entity.Book} objects
	 */
	public List<Book> getBooksByGenre(Long genreId) {
		return null;
	}

	/**
	 * Get book by the book id
	 * @param bookId
	 * @return List of {@link com.harrisburgu.lms.entity.Book} objects
	 */
	public Book getBookById(Long bookId) {
		return null;
	}

	/**
	 * Get book by the book title
	 * @param title
	 * @return List of {@link com.harrisburgu.lms.entity.Book} objects with same or similar title
	 */
	public List<Book> getBooksByTitle(String title) {
		return null;
	}

	/**
	 * Get all books
	 * @return List of {@link com.harrisburgu.lms.entity.Book} objects
	 */
	public List<Book> getAllBooks() {
		List<Book> books = bookRepo.findAll();
		LOGGER.info("Books: {}", books);
		return books;
	}

	/**
	 * Get genre by the genre id
	 * @param genreId
	 * @return List of {@link com.harrisburgu.lms.entity.Genre} objects
	 */
	public Genre getGenreById(Long genreId) {
		return null;
	}

	/**
	 * Get genre by the genre name
	 * @param genreName
	 * @return List of {@link com.harrisburgu.lms.entity.Genre} objects with same or similar name
	 */
	public List<Genre> getGenresByName(String genreName) {
		return null;
	}

	/**
	 * Get all genres
	 * @return List of {@link com.harrisburgu.lms.entity.Genre} objects
	 */
	public List<Genre> getAllGenres() {
		return null;
	}

	/**
	 * Get publisher by the publisher id
	 * @param publisherId
	 * @return List of {@link com.harrisburgu.lms.entity.Publisher} objects
	 */
	public Publisher getPublisherById(Long publisherId) {
		return null;
	}

	/**
	 * Get publisher by the publisher name
	 * @param publisherName
	 * @return List of {@link com.harrisburgu.lms.entity.Publisher} objects with same or similar name
	 */
	public List<Publisher> getPublishersByName(String publisherName) {
		return null;
	}

	/**
	 * Get all publishers
	 * @return List of {@link com.harrisburgu.lms.entity.Publisher} objects
	 */
	public List<Publisher> getAllPublishers() {
		return null;
	}

	/**
	 * Get user by the user id
	 * @param userId
	 * @return List of {@link com.harrisburgu.lms.entity.User} objects
	 */
	public User getUsersById(Long userId) {
		return null;
	}

	/**
	 * Get user by the user's name
	 * @param userName
	 * @return List of {@link com.harrisburgu.lms.entity.User} objects with same or similar name
	 */
	public List<User> getUsersByName(String userName) {
		return null;
	}

	/**
	 * Get all users
	 * @return List of {@link com.harrisburgu.lms.entity.User} objects
	 */
	public List<User> getAllUser() {
		return null;
	}

	/**
	 * Get user's loan records by their user id
	 * @param userId
	 * @return List of {@link com.harrisburgu.lms.entity.User} objects
	 */
	public List<LoanRecord> getLoanRecordsForUser(Long userId){
		return null;
	}
}
