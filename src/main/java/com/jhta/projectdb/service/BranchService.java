package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.BranchDao;

@Service
public class BranchService {
	@Autowired
	private BranchDao dao;
	
	public List<String> getName(){
		return dao.getName();
	}
	
	public List<HashMap<String, Object>> getChat(String brName){
		return dao.getChat(brName);
	}
	
	public List<String> getBranchRegion(){
		return dao.getBranchRegion();
	}
	
	public List<String> getBranch(String cityAddr){
		return dao.getBranch(cityAddr);
	}
	
	public List<HashMap<String,Object>> getNewBranch(){
		return dao.getNewBranch();
	}
}
