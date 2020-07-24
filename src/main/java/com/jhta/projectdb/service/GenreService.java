package com.jhta.projectdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.FilmListDao;
import com.jhta.projectdb.dao.GenreDao;
import com.jhta.projectdb.vo.GenreVo;

@Service
public class GenreService {
	@Autowired
	private GenreDao gdao;
	
	@Autowired
	private FilmListDao dao;
	
	public List<GenreVo> selectboxinfo() {
		return gdao.selectboxinfo();
	}
	
	public GenreVo getinfo2(int genreNum){
		return dao.getinfo2(genreNum);
	}
}
