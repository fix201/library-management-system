package com.harrisburgu.lms.dao;

import com.harrisburgu.lms.entity.Librarian;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
	List<Librarian> findByNameContaining(String librarianName);
}
