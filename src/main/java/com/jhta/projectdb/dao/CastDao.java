package com.jhta.projectdb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CastDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.cast";
	
	public int moviebuy(String name) {
		System.out.println("dao");
		return sqlSession.insert(NAMESPACE+".moviebuy",name);
	}
}
