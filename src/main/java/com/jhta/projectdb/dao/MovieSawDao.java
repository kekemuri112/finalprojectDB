package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.jhta.projectdb.vo.MovieSawVo;

@Repository
public class MovieSawDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPASE = "com.jhta.mybatis.mapper.moviesaw";
	
	public List<MovieSawVo> moviesawList(int num){
		return session.selectList(NAMESPASE+".moviesawList",num);
	}
	public int movieCount(int memNum){
		return session.selectOne(NAMESPASE+".movieCount",memNum);
	}
	public List<MovieSawVo> selectList(HashMap<String, Object> map){
		return session.selectList(NAMESPASE+".selectList",map);
	}
	public int selectMovieCount(HashMap<String, Object> map){
		return session.selectOne(NAMESPASE+".selectMovieCount",map);
	}
	
}
