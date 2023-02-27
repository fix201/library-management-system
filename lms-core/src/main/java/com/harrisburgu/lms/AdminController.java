package com.harrisburgu.lms;

import com.harrisburgu.lms.entity.Author;
import com.harrisburgu.lms.entity.Book;
import com.harrisburgu.lms.entity.BookCopies;
import com.harrisburgu.lms.entity.Genre;
import com.harrisburgu.lms.entity.Librarian;
import com.harrisburgu.lms.entity.LibraryBranch;
import com.harrisburgu.lms.entity.LoanRecord;
import com.harrisburgu.lms.entity.Publisher;
import com.harrisburgu.lms.entity.User;
import com.harrisburgu.lms.services.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

	private final Logger logger = LoggerFactory.getLogger(AdminController.class);
	private AdminService adminService;
	
	@Autowired
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	@GetMapping("/authors")
	public List<Author> getAllAuthors(){
		return adminService.getAllAuthors();
	}
	
	@GetMapping("/authors/{id}")
	public Author getAuthor(@PathVariable("id") Long id) {
		return adminService.getAuthorById(id);
	}
	
	@GetMapping("/book-author/{id}")
	public List<Book> getBooksByAuthorId(@PathVariable("id") Long id) {
		return adminService.getBooksByAuthorId(id);
	}

	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return adminService.getAllBooks();
	}

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") Long id) {
		return adminService.getBookById(id);
	}

	@GetMapping("/genres")
	public List<Genre> getAllGenres(){
		return adminService.getGenresByName("Biography");
	}

	@GetMapping("/genres/{id}")
	public Book getGenre(@PathVariable("id") Long id) {
		return adminService.getBookById(id);
	}

	@GetMapping("/book-genre/{id}")
	public List<Book> getBooksByGenreId(@PathVariable("id") Long id) {
		return adminService.getBooksByGenreId(id);
	}

	@GetMapping("/publishers")
	public List<Publisher> getAllPublishers(){
		return adminService.getPublishersByName("cengage");
	}

	@GetMapping("/publishers/{id}")
	public Publisher getPublisher(@PathVariable("id") Long id) {
		return adminService.getPublisherById(id);
	}

	@GetMapping("/loan-records")
	public List<LoanRecord> getAllLoanRecords(){
		return adminService.getAllLoanRecords();
	}
	
	@GetMapping("/loan-records-user/{id}")
	public List<LoanRecord> getLoanRecordsByUser(@PathVariable("id") Long id){
		return adminService.getLoanRecordsForUser(id);
	}

	@GetMapping("/loan-records-branch/{id}")
	public List<LoanRecord> getLoanRecordsByBranch(@PathVariable("id") Long id){
		return adminService.getLoanRecordsForBranch(id);
	}

	@GetMapping("/book-copies")
	public Integer getBookCopiesForBranch(@RequestParam Long branchId, @RequestParam Long bookId){
		return adminService.getBookCopiesForBranch(branchId,bookId);
	}
	
	@PostMapping("/book")
	public Book addOrUpdateBook(@RequestBody Book book) {
		return adminService.saveBook(book);
	}

	@PostMapping("/author")
	public Author addOrUpdateAuthor(Author author) {
		return adminService.saveAuthor(author);
	}

	@PostMapping("/genre")
	public Genre addOrUpdateGenre(Genre genre) {
		return adminService.saveGenre(genre);
	}

	@PostMapping("/publisher")
	public Publisher addOrUpdatePublisher(Publisher publisher) {
		return adminService.savePublisher(publisher);
	}

	@PostMapping("/librarian")
	public Librarian addOrUpdateLibrarian(Librarian librarian) {
		return adminService.saveLibrarian(librarian);
	}

	@PostMapping("/library-branch")
	public LibraryBranch addOrUpdateLibraryBranch(LibraryBranch libraryBranch) {
		return adminService.saveLibraryBranch(libraryBranch);
	}

	@PostMapping("/user")
	public User addOrUpdateUser(User user) {
		return adminService.saveUser(user);
	}

	@PostMapping("/add-book-to-branch")
	public Boolean updateBookForBranch(@RequestBody BookCopies bookCopies) {
		return adminService.addBookToBranch(bookCopies.getBookId(), 
				bookCopies.getLibraryBranchId(), bookCopies.getNoOfCopies());
	}

	@PostMapping("/override-loan")
	public void overrideBookLoan(@RequestBody LoanRecord loanRecord) {
		adminService.overrideBookLoan(loanRecord);
	}

	@DeleteMapping("book")
	public void deleteBook(Book book) {

	}

	@DeleteMapping("author")
	public void deleteAuthor(Author author) {

	}

	@DeleteMapping("genre")
	public void deleteGenre(Genre genre) {
		
	}

	@DeleteMapping("publisher")
	public void deletePublisher(Publisher publisher) {

	}

	@DeleteMapping("librarian")
	public void deleteLibrarian(Librarian librarian) {

	}

	@DeleteMapping("libraryBranch")
	public void deleteLibraryBranch(LibraryBranch libraryBranch) {

	}

	@DeleteMapping("user")
	public void deleteUser(User user) {
		
	}
	
}
