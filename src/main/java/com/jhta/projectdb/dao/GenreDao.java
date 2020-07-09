package com.jhta.projectdb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.GenreVo;

@Repository
public class GenreDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.genre";
	
	public List<GenreVo> selectboxinfo() {
		return sqlSession.selectList(NAMESPACE+".list");
	}
}
