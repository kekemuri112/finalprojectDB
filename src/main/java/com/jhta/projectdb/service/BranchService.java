package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
