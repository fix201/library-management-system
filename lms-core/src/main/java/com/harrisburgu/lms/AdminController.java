package com.harrisburgu.lms;

import com.harrisburgu.lms.entity.Author;
import com.harrisburgu.lms.entity.Book;
import com.harrisburgu.lms.entity.Genre;
import com.harrisburgu.lms.entity.Librarian;
import com.harrisburgu.lms.entity.LibraryBranch;
import com.harrisburgu.lms.entity.LoanRecord;
import com.harrisburgu.lms.entity.Publisher;
import com.harrisburgu.lms.entity.User;
import com.harrisburgu.lms.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
	
	AdminService adminService;
	
	@Autowired
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	@RequestMapping(value = {"", "/"}, method = RequestMethod.GET, produces = "application/json")
	public List<Author> getAllAuthors(){
		return adminService.getAllAuthors();
	}
	
	@RequestMapping(value = {"/book"}, method = RequestMethod.GET, produces = "application/json")
	public List<Book> getBooksByAuthorId() {
		return adminService.getBooksByAuthorId(31L);
	}

	@RequestMapping(value = "/books", method = RequestMethod.GET, produces = "application/json")
	public List<Book> getAllBooks(){
		return adminService.getBooksByTitle("becoming");
	}

	@RequestMapping(value = "/genre", method = RequestMethod.GET, produces = "application/json")
	public List<Genre> getAllGenres(){
		return adminService.getGenresByName("Biography");
	}

	@RequestMapping(value = "/publisher", method = RequestMethod.GET, produces = "application/json")
	public List<Publisher> getAllPublishers(){
		return adminService.getPublishersByName("cengage");
	}

	@RequestMapping(value = "/loan-records", method = RequestMethod.GET, produces = "application/json")
	public List<LoanRecord> getLoanRecordsByUser(){
		return adminService.getLoanRecordsForUser(1L);
	}

	@RequestMapping(value = "/book-copies", method = RequestMethod.GET, produces = "application/json")
	public Integer getBookCopiesForBranch(){
		return adminService.getBookCopiesForBranch(1L,1L);
	}
	
	public Book createBook(Book book) {
		return book;
	}

	public Author createAuthor(Author author) {
		return author;
	}

	public Genre createGenre(Genre genre) {
		return genre;
	}

	public Publisher createPublisher(Publisher publisher) {
		return publisher;
	}

	public Librarian createLibrarian(Librarian librarian) {
		return librarian;
	}

	public LibraryBranch createLibraryBranch(LibraryBranch libraryBranch) {
		return libraryBranch;
	}

	public User createUser(User user) {
		return user;
	}

	public void addBookToBranch(Long bookId, Long branchId, Integer noOfCopies) {

	}
	
	public void updateBook(Book book) {
		
	}

	public void updateAuthor(Book book) {

	}

	public void updateGenre(Book book) {

	}

	public void updatePublisher(Book book) {

	}

	public void updateBookCopiesForBranch(Long bookId, Long branchId, Integer noOfCopies) {
		
	}
	
	public void updateLibrarianBranch(Long librarianId, Long branchId) {
		
	}

	public void overrideBookLoan(LoanRecord loanRecord) {
		
	}

	public void deleteBook(Book book) {

	}

	public void deleteAuthor(Book book) {

	}

	public void deleteGenre(Book book) {

	}

	public void deletePublisher(Book book) {

	}

	public void deleteLibrarian(Book book) {

	}

	public void deleteBookCopies(Book book) {

	}

	public void deleteLibraryBranch(Book book) {

	}

	public void deleteLoanRecord(User user) {

	}
	
	public void deleteUser(User user) {
		
	}
	
}
