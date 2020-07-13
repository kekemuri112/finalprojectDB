package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.StaffDao;
import com.jhta.projectdb.vo.StaffVo;

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
	
	public List<String> getBrName(){
		return dao.getBrName();
	}
	
	public List<String> getSffPosition(){
		return dao.getSffPosition();
	}
	
	public List<String> getDivisionName(){
		return dao.getDivisionName();
	}	
	
	public int staffInsert(StaffVo vo) {
		return dao.staffInsert(vo);
	}
}
