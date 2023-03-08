package com.harrisburgu.lms;

import com.harrisburgu.lms.entity.Book;
import com.harrisburgu.lms.services.CreateUpdateService;
import com.harrisburgu.lms.services.DeleteService;
import com.harrisburgu.lms.services.ReadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/librarian")
public class LibrarianController {

    private final Logger logger = LoggerFactory.getLogger(LibrarianController.class);
    private ReadService readService;
    private CreateUpdateService createUpdateService;
    private DeleteService deleteService;

    public LibrarianController(ReadService readService,
                           CreateUpdateService createUpdateService,
                           DeleteService deleteService) {
        this.readService = readService;
        this.createUpdateService = createUpdateService;
        this.deleteService = deleteService;
    }


    @GetMapping("")
    public List<Book> getAllBooks() {
        return readService.getAllBooks();
    }

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable Long bookId) {
        return readService.getBookById(bookId);
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        createUpdateService.saveBook(book);
    }

    @PutMapping("/{bookId}")
    public void updateBook(@PathVariable Long bookId, @RequestBody Book book) {
        book.setId(bookId);
        createUpdateService.saveBook(book);
    }

    @DeleteMapping("/{bookId}")
    public void removeBook(@PathVariable Long bookId) {
        deleteService.removeBook(bookId);
    }
}