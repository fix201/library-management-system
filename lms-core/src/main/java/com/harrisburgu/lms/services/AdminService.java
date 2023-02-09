package com.harrisburgu.lms.services;

import com.harrisburgu.lms.dao.AccessLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminService extends BaseService{
	
	@Autowired
	AccessLevelRepository accessLevelRepository;
	
	public void getAccessLevelRepository() {
		LOGGER.info("{}",accessLevelRepository.findAll());
	}
}
