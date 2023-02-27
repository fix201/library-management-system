package com.harrisburgu.lms.services;

import com.harrisburgu.lms.entity.Author;
import com.harrisburgu.lms.entity.Book;
import com.harrisburgu.lms.entity.BookCopies;
import com.harrisburgu.lms.entity.Genre;
import com.harrisburgu.lms.entity.Librarian;
import com.harrisburgu.lms.entity.LoanRecord;
import com.harrisburgu.lms.entity.LibraryBranch;
import com.harrisburgu.lms.entity.Publisher;
import com.harrisburgu.lms.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AdminService extends BaseService {

	private final Logger logger = LoggerFactory.getLogger(AdminService.class);

	/**
	 * Creates a new book if it doesn't exist or Updates existing book
	 * @param book {@link Book} object
	 * @return Newly created or updated {@link Book} object
	 */
	public Book saveBook(Book book) {
		Book tempBook;

		if (book.getId() != null && bookRepo.existsById(book.getId())) {
			tempBook = (Book) getObjectFromOptional(bookRepo.findById(book.getId()));
			CopyUtil.copyProperties(book, tempBook);
			logger.info("Updating Book: {} to {}", tempBook, book);
		} else {
			tempBook = book;
			logger.info("Adding Book: {}", tempBook);
		}

		try {
			tempBook = bookRepo.save(tempBook);
		} catch (DataIntegrityViolationException e) {
			logger.error("Book with same ISBN '{}' already exists!", book.getIsbn());
			logger.debug("",e.fillInStackTrace());
			return null;
		}

		return tempBook;
	}

	/**
	 * Creates a new author if it doesn't exist or Updates existing author
	 * @param author {@link Author} object
	 * @return Newly created or updated {@link Author} object
	 */
	public Author saveAuthor(Author author) {
		Author tempAuthor;

		if (author.getId() != null && authorRepo.existsById(author.getId())) {
			tempAuthor = (Author) getObjectFromOptional(authorRepo.findById(author.getId()));
			CopyUtil.copyProperties(author, tempAuthor);
			logger.info("Updating Author: {} to {}", tempAuthor, author);
		} else {
			tempAuthor = author;
			logger.info("Adding Author: {}", tempAuthor);
		}

		try {
			tempAuthor = authorRepo.save(tempAuthor);
		} catch (DataIntegrityViolationException e) {
			logger.error("Author with same email '{}' already exists!", author.getEmail());
			logger.debug("",e.fillInStackTrace());
			return null;
		}

		return tempAuthor;
	}

	/**
	 * Creates a new genre if it doesn't exist or Updates existing genre
	 * @param genre {@link Genre} object
	 * @return Newly created or updated {@link Genre} object
	 */
	public Genre saveGenre(Genre genre) {
		Genre tempGenre;

		if (genre.getGenreId() != null && genreRepo.existsById(genre.getGenreId())) {
			tempGenre = (Genre) getObjectFromOptional(genreRepo.findById(genre.getGenreId()));
			CopyUtil.copyProperties(genre, tempGenre);
			logger.info("Updating Genre: {} to {}", tempGenre, genre);
		} else {
			tempGenre = genre;
			logger.info("Adding Genre: {}", tempGenre);
		}

		return genreRepo.save(tempGenre);
	}

	/**
	 * Creates a new publisher if it doesn't exist or Updates existing publisher
	 * @param publisher {@link Publisher} object
	 * @return Newly created or updated {@link Publisher} object
	 */
	public Publisher savePublisher(Publisher publisher) {
		Publisher tempPublisher;

		if (publisher.getId() != null && publisherRepo.existsById(publisher.getId())) {
			tempPublisher = (Publisher) getObjectFromOptional(publisherRepo.findById(publisher.getId()));
			CopyUtil.copyProperties(publisher, tempPublisher);
			logger.info("Updating Publisher: {} to {}", tempPublisher, publisher);
		} else {
			tempPublisher = publisher;
			logger.info("Adding Publisher: {}", tempPublisher);
		}

		try {
			tempPublisher = publisherRepo.save(tempPublisher);
		} catch (DataIntegrityViolationException e) {
			logger.error("Publisher with same name '{}', phone number '{}', or email '{}' already exists!",
					publisher.getName(), publisher.getPhoneNumber(), publisher.getEmail());
			logger.debug("",e.fillInStackTrace());
			return null;
		}

		return tempPublisher;
	}

	/**
	 * Creates a new librarian if it doesn't exist or Updates existing librarian
	 * @param librarian {@link Librarian} object
	 * @return Newly created or updated {@link Librarian} object
	 */
	public Librarian saveLibrarian(Librarian librarian) {
		Librarian tempLibrarian;

		if (librarian.getId() != null && librarianRepo.existsById(librarian.getId())) {
			tempLibrarian = (Librarian) getObjectFromOptional(librarianRepo.findById(librarian.getId()));
			CopyUtil.copyProperties(librarian, tempLibrarian);
			logger.info("Updating Librarian: {} to {}", tempLibrarian, librarian);
		} else {
			tempLibrarian = librarian;
			logger.info("Adding Librarian: {}", tempLibrarian);
		}

		return tempLibrarian;
	}

	/**
	 * Creates a new libraryBranch if it doesn't exist or Updates existing libraryBranch
	 * @param libraryBranch {@link LibraryBranch} object
	 * @return Newly created or updated {@link LibraryBranch} object
	 */
	public LibraryBranch saveLibraryBranch(LibraryBranch libraryBranch) {
		LibraryBranch tempLibraryBranch;

		if (libraryBranch.getId() != null && libraryBranchRepo.existsById(libraryBranch.getId())) {
			tempLibraryBranch = (LibraryBranch) getObjectFromOptional(libraryBranchRepo.findById(libraryBranch.getId()));
			CopyUtil.copyProperties(libraryBranch, tempLibraryBranch);
			logger.info("Updating Library Branch: {} to {}", tempLibraryBranch, libraryBranch);
		} else {
			tempLibraryBranch = libraryBranch;
			logger.info("Adding Library Branch: {}", tempLibraryBranch);
		}

		return tempLibraryBranch;
	}

	/**
	 * Creates a new user if it doesn't exist or Updates existing user
	 * @param user {@link User} object
	 * @return Newly created or updated {@link User} object
	 */
	public User saveUser(User user) {
		User tempUser;

		if (user.getId() != null && userRepo.existsById(user.getId())) {
			tempUser = (User) getObjectFromOptional(userRepo.findById(user.getId()));
			CopyUtil.copyProperties(user, tempUser);
			logger.info("Updating User: {} to {}", tempUser, user);
		} else {
			tempUser = user;
			logger.info("Adding User: {}", tempUser);
		}

		try {
			tempUser = userRepo.save(tempUser);
		} catch (DataIntegrityViolationException e) {
			logger.error("User with same phone number '{}', or email '{}' already exists!",
						user.getPhone(), user.getEmail());
			logger.debug("",e.fillInStackTrace());
			return null;
		}

		return tempUser;
	}

	/**
	 * Get all loan records
	 *
	 * @return List of {@link com.harrisburgu.lms.entity.LoanRecord} objects
	 */
	public List<LoanRecord> getAllLoanRecords() {
		List<LoanRecord> records = loanRecordRepo.findAll();
		logger.info("Loan Records: {}", records);
		return records;
	}

	/**
	 * Adds a book to a library branch or updates the branch's book copies
	 * @param bookId id of the {@link Book}
	 * @param branchId id of the {@link LibraryBranch}
	 * @param noOfCopies number of book copies
	 * @return true if operation completed successfully, false otherwise
	 */
	public Boolean addBookToBranch(Long bookId, Long branchId, Integer noOfCopies) {
		if (bookId != null && branchId != null && noOfCopies != null) {
			if(bookRepo.existsById(bookId) && libraryBranchRepo.existsById(branchId)) {
				bookCopiesRepo.save(new BookCopies(bookId, branchId, noOfCopies));
				return true;
			} else {
				logger.error("Book with id '{}' or Library Branch with id '{}' does not exist", bookId, branchId);
			}
		} else {
			logger.error("bookId'{}' or branchId '{}' or noOfCopies '{}' is null",
					bookId, branchId, noOfCopies);
		}
		
		return false;
	}

	public LoanRecord overrideBookLoan(LoanRecord loanRecord) {
		LoanRecord tempLoanRecord = null;
		
		if (loanRecord.getDueDate() == null) {
			loanRecord.setDueDate(loanRecord.getLoanDate().plusDays(8));
		}
		
		if(loanRecord.getBookId() != null && loanRecord.getBookId() != null 
				&& loanRecord.getUserId() != null) {
			tempLoanRecord = loanRecordRepo.findByLoanRecordKeys(loanRecord.getUserId(), loanRecord.getLibraryBranchId(), 
					loanRecord.getBookId(), loanRecord.getLoanDate());
			logger.info("Current Loan Record: {}", tempLoanRecord);
			CopyUtil.copyProperties(loanRecord, tempLoanRecord);
			logger.info("Updated Loan Record: {}", tempLoanRecord);
			tempLoanRecord = loanRecordRepo.save(tempLoanRecord);
		} else {
			logger.error("One or more of '{}' is null", loanRecord);
		}
		
		return tempLoanRecord;
	}
}
