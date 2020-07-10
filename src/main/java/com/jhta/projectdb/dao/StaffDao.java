package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StaffDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private final String NAMESPACE = "com.jhta.mybatis.mapper.staff";
	
	public List<HashMap<String,Object>> getStaffInfo(HashMap<String,Object> map){ 
		return sqlSession.selectList(NAMESPACE+".staffList",map);
	}
	
	public int getCount(HashMap<String,Object> map) {
		return sqlSession.selectOne(NAMESPACE+".getCount",map);
	}
}
