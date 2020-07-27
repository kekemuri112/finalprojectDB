package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.jhta.projectdb.vo.MovieSawVo;

@Repository
public class MovieSawDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPASE = "com.jhta.mybatis.mapper.moviesaw";
	
	public List<MovieSawVo> moviesawList(HashMap<String, Object> map){
		return session.selectList(NAMESPASE+".moviesawList",map);
	}
	public int movieCount(HashMap<String, Object> map){
		return session.selectOne(NAMESPASE+".movieCount",map);
	}
}
