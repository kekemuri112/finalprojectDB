package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.FilmDao;
<<<<<<< HEAD
import com.jhta.projectdb.dao.FilmListDao;
import com.jhta.projectdb.vo.FilmVo;
import com.jhta.projectdb.vo.PurchaseFilmVo;
=======

>>>>>>> heo

@Service
public class FilmService {
	@Autowired
<<<<<<< HEAD
	private FilmListDao dao;
	@Autowired
	private FilmDao fdao;
	
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
	public List<String> getName(){
		return fdao.getName();
	}
	public List<HashMap<String, Object>> getChat(String filmName){
		return fdao.getChat(filmName);
	}
	public List<HashMap<String,Object>> getThumbnailMovie(){
		return fdao.getThumbnailMovie();
	}
	public List<FilmVo> filmbuylist(){
		return fdao.filmbuylist();
	}

=======
	private FilmDao dao;

	public List<String> getName(){
		return dao.getName();
	}
	public List<HashMap<String, Object>> getChat(String filmName){
		return dao.getChat(filmName);
	}
	public List<HashMap<String,Object>> getThumbnailMovie(){
		return dao.getThumbnailMovie();
	}
	
	public HashMap<String,Object> getTodayMoive(){
		return dao.getTodayMoive();
	}
>>>>>>> heo
}
