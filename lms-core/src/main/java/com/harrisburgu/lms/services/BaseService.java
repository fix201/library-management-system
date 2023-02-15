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
import com.harrisburgu.lms.entity.BookCopies;
import com.harrisburgu.lms.entity.Genre;
import com.harrisburgu.lms.entity.Librarian;
import com.harrisburgu.lms.entity.LibraryBranch;
import com.harrisburgu.lms.entity.LoanRecord;
import com.harrisburgu.lms.entity.Publisher;
import com.harrisburgu.lms.entity.User;
import org.apache.juli.logging.Log;
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
	 * Get author by the author id
	 * @param authorId
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
		List<Author> authors = authorRepo.findAuthorByName(authorName);
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
	public List<Book> getBooksByAuthorId(Long authorId) {
		List<Book> books =  bookRepo.findBookByAuthorId(authorId);
		LOGGER.info("Books: {}", books);
		return books;
	}

	/**
	 * Get book by the genre id
	 * @param genreId
	 * @return List of {@link com.harrisburgu.lms.entity.Book} objects
	 */
	public List<Book> getBooksByGenreId(Long genreId) {
		List<Book> books =  bookRepo.findBookByGenreId(genreId);
		LOGGER.info("Books: {}", books);
		return books;
	}

	/**
	 * Get book by the book id
	 * @param bookId
	 * @return {@link com.harrisburgu.lms.entity.Book} object
	 */
	public Book getBookById(Long bookId) {
		Book book = (Book) getObjectFromOptional(bookRepo.findById(bookId));
		LOGGER.info("Book with id {}: {}", bookId, book);
		return book;
	}

	/**
	 * Get book by the book title
	 * @param title
	 * @return List of {@link com.harrisburgu.lms.entity.Book} objects with same or similar title
	 */
	public List<Book> getBooksByTitle(String title) {
		List<Book> books = bookRepo.findBookByTitle(title);
		LOGGER.info("Books with name {}: {}", title, books);
		return books;
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
	 * @return {@link com.harrisburgu.lms.entity.Genre} object
	 */
	public Genre getGenreById(Long genreId) {
		Genre genre = (Genre) getObjectFromOptional(bookRepo.findById(genreId));
		LOGGER.info("Genre with id {}: {}", genreId, genre);
		return genre;
	}

	/**
	 * Get genre by the genre name
	 * @param genreName
	 * @return List of {@link com.harrisburgu.lms.entity.Genre} objects with same or similar name
	 */
	public List<Genre> getGenresByName(String genreName) {
		List<Genre> genres = genreRepo.findByGenreNameContaining(genreName);
		LOGGER.info("Genres: {}", genres);
		return genres;
	}

	/**
	 * Get all genres
	 * @return List of {@link com.harrisburgu.lms.entity.Genre} objects
	 */
	public List<Genre> getAllGenres() {
		List<Genre> genres = genreRepo.findAll();
		LOGGER.info("Genres: {}", genres);
		return genres;
	}

	/**
	 * Get publisher by the publisher id
	 * @param publisherId
	 * @return {@link com.harrisburgu.lms.entity.Publisher} object
	 */
	public Publisher getPublisherById(Long publisherId) {
		Publisher publisher = (Publisher) getObjectFromOptional(publisherRepo.findById(publisherId));
		LOGGER.info("Publisher with id {}: {}", publisherId, publisher);
		return publisher;
	}

	/**
	 * Get publisher by the publisher name
	 * @param publisherName
	 * @return List of {@link com.harrisburgu.lms.entity.Publisher} objects with same or similar name
	 */
	public List<Publisher> getPublishersByName(String publisherName) {
		List<Publisher> publishers = publisherRepo.findByNameContaining(publisherName);
		LOGGER.info("Publishers: {}", publishers);
		return publishers;
	}

	/**
	 * Get all publishers
	 * @return List of {@link com.harrisburgu.lms.entity.Publisher} objects
	 */
	public List<Publisher> getAllPublishers() {
		List<Publisher> publishers = publisherRepo.findAll();
		LOGGER.info("Publisher: {}", publishers);
		return publishers;
	}

	/**
	 * Get user by the user id
	 * @param userId
	 * @return {@link com.harrisburgu.lms.entity.User} object
	 */
	public User getUserById(Long userId) {
		User user = (User) getObjectFromOptional(userRepo.findById(userId));
		LOGGER.info("User with id {}: {}", userId, user);
		return user;
	}

	/**
	 * Get user by the user's name
	 * @param userName
	 * @return List of {@link com.harrisburgu.lms.entity.User} objects with same or similar name
	 */
	public List<User> getUsersByName(String userName) {
		List<User> users = userRepo.findByNameContaining(userName);
		LOGGER.info("Users: {}", users);
		return users;
	}

	/**
	 * Get all users
	 * @return List of {@link com.harrisburgu.lms.entity.User} objects
	 */
	public List<User> getAllUsers() {
		List<User> users = userRepo.findAll();
		LOGGER.info("Users: {}", users);
		return users;
	}

	/**
	 * Get librarian by the librarian id
	 * @param librarianId
	 * @return {@link com.harrisburgu.lms.entity.Librarian} object
	 */
	public Librarian getLibrarianById(Long librarianId) {
		Librarian librarian = (Librarian) getObjectFromOptional(librarianRepo.findById(librarianId));
		LOGGER.info("Librarian with id {}: {}", librarianId, librarian);
		return librarian;
	}

	/**
	 * Get user by the user's name
	 * @param librarianName
	 * @return List of {@link com.harrisburgu.lms.entity.User} objects with same or similar name
	 */
	public List<Librarian> getLibrariansByName(String librarianName) {
		List<Librarian> librarians = librarianRepo.findByNameContaining(librarianName);
		LOGGER.info("Librarians: {}", librarians);
		return librarians;
	}

	/**
	 * Get all librarians
	 * @return List of {@link com.harrisburgu.lms.entity.Librarian} objects
	 */
	public List<Librarian> getAllLibrarians() {
		List<Librarian> librarians = librarianRepo.findAll();
		LOGGER.info("Librarians: {}", librarians);
		return librarians;
	}

	/**
	 * Get user's loan records by their user id
	 * @param userId
	 * @return List of {@link com.harrisburgu.lms.entity.User} objects
	 */
	public List<LoanRecord> getLoanRecordsForUser(Long userId){
		List<LoanRecord> records = loanRecordRepo.findByUserId(userId);
		User user = (User) getObjectFromOptional(userRepo.findById(userId));
		LOGGER.info("Loan Records for user {}: {}", user.getName(), records);
		return records;
	}

	/**
	 * Get user's loan records by the branch id
	 * @param branchId
	 * @return List of {@link com.harrisburgu.lms.entity.LoanRecord} objects
	 */
	public List<LoanRecord> getLoanRecordsForBranch(Long branchId){
		List<LoanRecord> records = loanRecordRepo.findByLibraryBranchId(branchId);
		LOGGER.info("Loan Records for library branch {}: {}", branchId, records);
		return records;
	}

	/**
	 * Get number of copies of books a library has
	 * @param branchId
	 * @param bookId
	 * @return {@link Integer} number of books
	 */
	public Integer getBookCopiesForBranch(Long branchId, Long bookId){
		BookCopies records = bookCopiesRepo.findByLibraryBranchIdAndBookId(branchId, bookId);
		LOGGER.info("Library Branch with id {} has {} Copies of Book id {}", branchId, records.getNoOfCopies(), bookId);
		return records.getNoOfCopies();
	}
}
