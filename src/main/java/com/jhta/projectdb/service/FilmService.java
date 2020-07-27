package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.FilmDao;


@Service
public class FilmService {
	@Autowired
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
}
