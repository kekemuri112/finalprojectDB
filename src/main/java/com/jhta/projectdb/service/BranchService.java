package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.BranchDao;
import com.jhta.projectdb.vo.BranchVo;

@Service
public class BranchService {
	@Autowired
	private BranchDao dao;
	public List<BranchVo> list(HashMap<String,Object> map){
		return dao.list(map);
	}
	public int count(HashMap<String,Object> map) {
		return dao.count(map);
	}
	public List<BranchVo> searchCity(String cityaddr){
		return dao.searchCity(cityaddr);
	}

	public List<String> getName(){
		return dao.getName();
	}
	
	public List<HashMap<String, Object>> getChat(String brName){
		return dao.getChat(brName);
	}
	
	public List<String> getBranchRegion(){
		return dao.getBranchRegion();
	}
	
	public List<String> getBranch(String proAddr){
		return dao.getBranch(proAddr);
	}
	
	public List<HashMap<String,Object>> getNewBranch(){
		return dao.getNewBranch();
	}
	
	public BranchVo loginOk(HashMap<String, Object> map) {
		return dao.loginOk(map);
	}
}
