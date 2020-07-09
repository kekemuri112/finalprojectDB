package com.jhta.projectdb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.FilmVo;

@Repository
public class FilmDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.film";
	
	public int moviebuy(FilmVo vo) {
		System.out.println("�ʸ�dao");
		return sqlSession.insert(NAMESPACE+".moviebuy",vo);
	}
}