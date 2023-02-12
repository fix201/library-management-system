package com.harrisburgu.lms.dao;

import com.harrisburgu.lms.entity.Publisher;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
