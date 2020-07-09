package com.jhta.projectdb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.TheatherVo;

@Repository
public class TheatherDao {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.theath";
	
	public List<TheatherVo> list(int branchNum){
		return sqlSession.selectList(NAMESPACE+".list",branchNum);
	}
}
