package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.LogDao;

@Service
public class LogService {
	@Autowired
	private LogDao dao;
	
	public int getinfo(String memId) {
		return dao.getinfo(memId);
	}
}
