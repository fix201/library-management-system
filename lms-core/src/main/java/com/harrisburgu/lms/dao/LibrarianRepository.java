package com.harrisburgu.lms.dao;

import com.harrisburgu.lms.entity.Book;
import com.harrisburgu.lms.entity.Librarian;
import com.harrisburgu.lms.entity.LoanRecord;
import com.harrisburgu.lms.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface LibrarianRepository extends JpaRepository<Librarian, Long> {

    // Book methods
    List<Librarian> findAll();
    Optional<Book> findById(int bookId);
    void save(Book book);
    void delete(Book book);
    List<Book> findByTitleContainingIgnoreCase(String query);
    List<Book> findByAuthorContainingIgnoreCase(String query);
    List<LoanRecord> findLoansByBookId(int bookId);

    // Borrower methods
    List<User> findAllBorrowers();
    Optional<User> findBorrowerById(int borrowerId);
    void save(User user);
    void delete(User user);
    List<User> findByNameContainingIgnoreCase(String query);

}
