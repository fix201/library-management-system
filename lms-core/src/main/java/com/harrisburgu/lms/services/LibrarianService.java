package com.harrisburgu.lms.services;

import com.harrisburgu.lms.dao.BookRepository;
import com.harrisburgu.lms.dao.LoanRecordRepository;
import com.harrisburgu.lms.dao.UserRepository;
import com.harrisburgu.lms.entity.Book;
import com.harrisburgu.lms.entity.LoanRecord;
import com.harrisburgu.lms.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibrarianService extends BaseService {

    @Autowired
    private LoanRecordRepository loanRecordRepository;


    public void addBook(Book book) {
        bookRepo.save(book);
    }


    public void updateBook(Book book) {
        bookRepo.save(book);
    }

    public void removeBook(Long bookId) {
        Optional<Book> result = bookRepo.findById(bookId);
        if (result.isPresent()) {
            bookRepo.delete(result.get());
        }
    }

    public List<Book> searchBooks(String query) {
        return null;//bookRepository.findByTitleContainingIgnoreCase(query);
    }


    public List<LoanRecord> getLoansForBook(int bookId) {
        return null;//bookRepository.findLoansByBookId(bookId);
    }


//    public void checkOutBook(Long bookId, String userName) {
//        Optional<Book> result = bookRepository.findById(bookId);
//        Optional<User> user = userRepository.findByName(userName);
//
//        if (result.isPresent() && user.isPresent()) {
//            Book book = result.get();
//            book.checkOut(user.get());
//            bookRepository.save(book);
//        }
//    }


//    public void checkInBook(Long bookId) {
//        Optional<Book> result = bookRepository.findById(bookId);
//        if (result.isPresent()) {
//            Book book = result.get();
//            book.checkIn();
//            bookRepository.save(book);
//        }
//    }


    public List<User> getAllBorrowers() {
        return userRepo.findAll();
    }


    public User getBorrowerById(Long userId) {
        Optional<User> result = userRepo.findById(userId);
        return result.isPresent() ? result.get() : null;
    }


    public void addBorrower(User user) {
        userRepo.save(user);
    }

    public void updateBorrower(User user) {
        userRepo.save(user);
    }


    public void removeBorrower(Long userId) {
        Optional<User> result = userRepo.findById(userId);
        if (result.isPresent()) {
            userRepo.delete(result.get());
        }
    }

    public List<User> searchBorrowers(String query) {
        return null; //userRepository.findByNameContainingIgnoreCase(query);
    }
}
