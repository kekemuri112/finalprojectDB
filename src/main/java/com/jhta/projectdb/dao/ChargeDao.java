package com.jhta.projectdb.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChargeDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPACE="com.jhta.mybatis.mapper.charge";
	
	public int insert(HashMap<String, Object> map) {
		return session.insert(NAMESPACE+".insert",map);
	}
}
