package com.jhta.projectdb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.MileVo;

@Repository
public class MileDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.mile";
	
	public MileVo mileGetinfo(int memNum){
		return sqlSession.selectOne(NAMESPACE+"getinfo",memNum);
	}
	
}
