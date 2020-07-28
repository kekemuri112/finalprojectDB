package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhta.projectdb.dao.BranchDao;
import com.jhta.projectdb.vo.BranchVo;
=======
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.BranchDao;
>>>>>>> heo

@Service
public class BranchService {
	@Autowired
	private BranchDao dao;
<<<<<<< HEAD
	public List<BranchVo> list(HashMap<String,Object> map){
		return dao.list(map);
	}
	public int count(HashMap<String,Object> map) {
		return dao.count(map);
	}
	public List<BranchVo> searchCity(String cityaddr){
		return dao.searchCity(cityaddr);
	}

=======
	
>>>>>>> heo
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
<<<<<<< HEAD

=======
>>>>>>> heo
}
