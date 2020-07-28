package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.jhta.projectdb.dao.MovieSawDao;
import com.jhta.projectdb.vo.MovieSawVo;

@Service
public class MovieSawService {
	@Autowired
	private MovieSawDao movieSawDao;

	public List<MovieSawVo> moviesawList(int num){
		return movieSawDao.moviesawList(num);
	}
	public int movieCount(int memNum){
		return movieSawDao.movieCount(memNum);
	}
	public List<MovieSawVo> selectList(HashMap<String, Object> map){
		return movieSawDao.selectList(map);
	}
	public int selectMovieCount(HashMap<String, Object> map){
		return movieSawDao.selectMovieCount(map);
	}
	
}
