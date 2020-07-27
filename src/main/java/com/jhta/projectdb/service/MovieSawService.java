package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.jhta.projectdb.dao.MovieSawDao;
import com.jhta.projectdb.vo.MovieSawVo;

@Service
public class MovieSawService {
	@Autowired
	private MovieSawDao movieSawDao;

	public List<MovieSawVo> moviesawList(HashMap<String, Object> map){
		return movieSawDao.moviesawList(map);
	}
	public int movieCount(HashMap<String, Object> map){
		return movieSawDao.movieCount(map);
	}
	
}
