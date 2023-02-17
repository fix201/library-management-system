package com.harrisburgu.lms;

import com.harrisburgu.lms.entity.Author;
import com.harrisburgu.lms.entity.Book;
import com.harrisburgu.lms.services.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/librarian")
public class LibrarianController {
    @Autowired
    private LibrarianService librarianService;

    @GetMapping("")
    public List<Book> getAllBooks() {
        return librarianService.getAllBooks();
    }

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable Long bookId) {
        return librarianService.getBookById(bookId);
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        librarianService.addBook(book);
    }

    @PutMapping("/{bookId}")
    public void updateBook(@PathVariable Long bookId, @RequestBody Book book) {
        book.setId(bookId);
        librarianService.updateBook(book);
    }

    @DeleteMapping("/{bookId}")
    public void removeBook(@PathVariable Long bookId) {
        librarianService.removeBook(bookId);
    }

}
