package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.StaffDao;

@Service
public class StaffService {
	@Autowired
	private StaffDao dao;
	public List<HashMap<String,Object>> getStaffList(HashMap<String,Object> map){
		return dao.getStaffInfo(map);
	}
	
	public int getCount(HashMap<String,Object> map) {
		return dao.getCount(map);
	}
}
