package com.harrisburgu.lms.dao;

import com.harrisburgu.lms.entity.BookCopies;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface BookCopiesRepository extends JpaRepository<BookCopies, Long> {
	List<BookCopies> findByLibraryBranchId(Long branchId);
	BookCopies findByLibraryBranchIdAndBookId(Long branchId, Long bookId);
}
