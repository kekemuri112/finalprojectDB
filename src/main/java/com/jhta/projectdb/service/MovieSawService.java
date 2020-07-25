package com.jhta.projectdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.MovieSawDao;
import com.jhta.projectdb.vo.MovieSawVo;

@Service
public class MovieSawService {
	@Autowired
	private MovieSawDao movieSawDao;

	public List<MovieSawVo> moviesawList(int memNum){
		return movieSawDao.moviesawList(memNum);
	}
	public int movieCount(int memNum){
		return movieSawDao.movieCount(memNum);
	}
	
}
