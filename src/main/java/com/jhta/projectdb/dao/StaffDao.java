package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.StaffVo;

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
	
	public List<String> getBrName(){
		return sqlSession.selectList(NAMESPACE+".getBrName");
	}
	
	public List<String> getSffPosition(){
		return sqlSession.selectList(NAMESPACE+".getSffPosition");
	}
	
	public List<String> getDivisionName(){
		return sqlSession.selectList(NAMESPACE+".getDivisionName");
	}	
	
	public int staffInsert(StaffVo vo) {
		return sqlSession.insert(NAMESPACE+".staffInsert",vo);
	}
}
