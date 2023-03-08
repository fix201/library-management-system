package com.harrisburgu.lms.dao;

import com.harrisburgu.lms.entity.BookCopy;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface BookCopyRepository extends JpaRepository<BookCopy, Long> {
	List<BookCopy> findByLibraryBranchId(Long branchId);
	BookCopy findByLibraryBranchIdAndBookId(Long branchId, Long bookId);
}
