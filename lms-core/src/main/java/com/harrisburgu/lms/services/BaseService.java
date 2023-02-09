package com.harrisburgu.lms.services;

import com.harrisburgu.lms.dao.AuthorRepository;
import com.harrisburgu.lms.entity.Author;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService {
	
	private AuthorRepository authorDao;
	protected final Logger LOGGER = LoggerFactory.getLogger(BaseService.class);
	
	public void getAuthor() {
		Author author = new Author();
		author.setId(1L);
		LOGGER.info("Author 1 is: {}", authorDao.findById(author.getId()));
	}
	
	public void getAllAuthors() {
		LOGGER.info("{}", authorDao.findAll());
	}
	
	@Autowired
	public void setAuthorDao(AuthorRepository authorDao) {
		this.authorDao = authorDao;
	}
}
