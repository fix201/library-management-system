package com.harrisburgu.lms.services;

import com.harrisburgu.lms.entity.Author;
import com.harrisburgu.lms.entity.Book;
import com.harrisburgu.lms.entity.BookCopy;
import com.harrisburgu.lms.entity.Genre;
import com.harrisburgu.lms.entity.Librarian;
import com.harrisburgu.lms.entity.LibraryBranch;
import com.harrisburgu.lms.entity.Publisher;
import com.harrisburgu.lms.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DeleteService extends BaseService {

	private final Logger logger = LoggerFactory.getLogger(DeleteService.class);

	/**
	 * Remove a book from the database,
	 * along with any references to the book
	 *
	 * @param id {@link Book} object id to be removed
	 */
	public void removeBook(Long id) {

		// remove library branch references to book

		// remove loan records references to book

		bookRepo.deleteById(id);
	}

	/**
	 * Remove an author from the database, 
	 * along with any references to the author in books
	 *
	 * @param id {@link Author} object id to be removed
	 */
	public void removeAuthor(Long id) {
		authorRepo.deleteById(id);
	}

	/**
	 * Remove a genre from the database, 
	 * along with any references to the genre in books
	 *
	 * @param id {@link Genre} object id to be removed
	 */
	public void removeGenre(Long id) {
		genreRepo.deleteById(id);
	}

	/**
	 * Remove a publisher from the database, 
	 * along with any references to the publisher in books
	 *
	 * @param id {@link Publisher} object id to be removed
	 */
	public void removePublisher(Long id) {
		publisherRepo.deleteById(id);
	}

	/**
	 * Remove a librarian from the database, 
	 * along with any book loans associated with the librarian
	 *
	 * @param id {@link Librarian} object id to be removed
	 */
	public void removeLibrarian(Long id) {
		librarianRepo.deleteById(id);
	}

	/**
	 * Remove a library branch from the database, 
	 * along with any book copies or loans associated with the branch
	 *
	 * @param id {@link LibraryBranch} object id to be removed
	 */
	public void removeLibraryBranch(Long id) {
		// remove the library branch from any book copies

		// remove the library branch from any book loans

		// delete the library branch
		libraryBranchRepo.deleteById(id);
	}

	/**
	 * Remove a user from the database, 
	 * along with any book loans associated with the user
	 *
	 * @param id {@link User} object id to be removed
	 */
	public void removeUser(Long id) {
		// remove any book loans associated with the user

		// delete the user
		userRepo.deleteById(id);
	}

	/**
	 * Remove a book from a branch collection
	 * @param branchId Library Branch Id
	 * @param bookId Book Id   
	 */
	public void removeBookFromBranch(Long branchId, Long bookId) {
		bookCopyRepo.delete(new BookCopy(branchId, bookId, null));
	}
}
