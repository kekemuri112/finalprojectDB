package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.StaffSalaryDao;

@Service
public class StaffSalaryService {
	@Autowired
	private StaffSalaryDao dao;
	
	public List<HashMap<String,Object>> getSaleryList(HashMap<String,Object> map){
		return dao.getSaleryList(map);
	}
}
