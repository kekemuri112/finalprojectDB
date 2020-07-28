package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StaffSalaryDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private final String NAMESPACE = "com.jhta.mybatis.mapper.salary";
	
	public List<HashMap<String,Object>> getSaleryList(HashMap<String,Object> map){
		return sqlSession.selectList(NAMESPACE+".getSaleryList",map);
	}
}
