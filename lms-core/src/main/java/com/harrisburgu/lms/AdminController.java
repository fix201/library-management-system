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
		return adminService.getAllGenres();
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
		return adminService.getAllPublishers();
	}

	@GetMapping("/publishers/{id}")
	public Publisher getPublisher(@PathVariable("id") Long id) {
		return adminService.getPublisherById(id);
	}

	@GetMapping("/librarians")
	public List<Librarian> getAllLibrarians(){
		return adminService.getAllLibrarians();
	}

	@GetMapping("/librarians/{id}")
	public Librarian getLibrarian(@PathVariable("id") Long id){
		return adminService.getLibrarianById(id);
	}

	@GetMapping("/library-branches")
	public List<LibraryBranch> getAllBranches(){
		return adminService.getAllBranches();
	}

	@GetMapping("/library-branches/{id}")
	public LibraryBranch getBranch(@PathVariable("id") Long id){
		return adminService.getBranchById(id);
	}

	@GetMapping("/users")
	public List<User> getAllUsers(){
		return adminService.getAllUsers();
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable("id") Long id){
		return adminService.getUserById(id);
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
	public Author addOrUpdateAuthor(@RequestBody Author author) {
		return adminService.saveAuthor(author);
	}

	@PostMapping("/genre")
	public Genre addOrUpdateGenre(@RequestBody Genre genre) {
		return adminService.saveGenre(genre);
	}

	@PostMapping("/publisher")
	public Publisher addOrUpdatePublisher(@RequestBody Publisher publisher) {
		return adminService.savePublisher(publisher);
	}

	@PostMapping("/librarian")
	public Librarian addOrUpdateLibrarian(@RequestBody Librarian librarian) {
		return adminService.saveLibrarian(librarian);
	}

	@PostMapping("/library-branch")
	public LibraryBranch addOrUpdateLibraryBranch(@RequestBody LibraryBranch libraryBranch) {
		return adminService.saveLibraryBranch(libraryBranch);
	}

	@PostMapping("/user")
	public User addOrUpdateUser(@RequestBody User user) {
		return adminService.saveUser(user);
	}

	@PostMapping("/add-book-to-branch")
	public Boolean updateBookForBranch(@RequestParam Long bookId, 
									   @RequestParam Long libraryBranchId, 
									   @RequestParam Integer noOfCopies) {
		return adminService.addBookToBranch(bookId, libraryBranchId, noOfCopies);
	}

	@PostMapping("/override-loan")
	public void overrideBookLoan(@RequestBody LoanRecord loanRecord) {
		adminService.overrideLoanRecord(loanRecord);
	}

	@DeleteMapping("book")
	public void deleteBook(@RequestParam Long id) {
		adminService.removeBook(id);
	}

	@DeleteMapping("author")
	public void deleteAuthor(@RequestParam Long id) {
		adminService.removeAuthor(id);
	}

	@DeleteMapping("genre")
	public void deleteGenre(@RequestParam Long id) {
		adminService.removeGenre(id);
	}

	@DeleteMapping("publisher")
	public void deletePublisher(@RequestParam Long id) {
		adminService.removePublisher(id);
	}

	@DeleteMapping("librarian")
	public void deleteLibrarian(@RequestParam Long id) {
		adminService.removeLibrarian(id);
	}

	@DeleteMapping("libraryBranch")
	public void deleteLibraryBranch(@RequestParam Long id) {
		adminService.removeLibraryBranch(id);
	}

	@DeleteMapping("user")
	public void deleteUser(@RequestParam Long id) {
		adminService.removeUser(id);
	}
	
}
