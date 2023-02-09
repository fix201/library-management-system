package com.harrisburgu.lms.dao;

import com.harrisburgu.lms.entity.LmsAccessLevel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface BookAuthorRepository extends JpaRepository<LmsAccessLevel, Long> {
}
