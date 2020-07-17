package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BranchDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.branch";
	
	public List<String> getName(){
		return sqlSession.selectList(NAMESPACE+".getName");
	}
	
	public List<HashMap<String, Object>> getChat(String brName){
		return sqlSession.selectList(NAMESPACE+".getChat",brName);
	}
	
	public List<String> getBranchRegion(){
		return sqlSession.selectList(NAMESPACE+".getBranchRegion");
	}
	
	public List<String> getBranch(String proAddr){
		return sqlSession.selectList(NAMESPACE+".getBranch",proAddr);
	}
	
}
