package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.FilmListDao;
import com.jhta.projectdb.vo.FilmVo;
import com.jhta.projectdb.vo.PurchaseFilmVo;

@Service
public class FilmService {
	@Autowired
	private FilmListDao dao;
	
	public int count() {
		return dao.count();
	}
	
	public List<HashMap<String, Object>> list(HashMap<String,Object> map){
		return dao.list(map);
	}
	
	public FilmVo getinfo(int filmNum) {
		return dao.getinfo(filmNum);
	}
	
	public int insert(PurchaseFilmVo vo) {
		return dao.insert(vo);
	}
	
	public List<HashMap<String, Object>> branchList(int branchNum){
		return dao.branchList(branchNum);
	}

}
