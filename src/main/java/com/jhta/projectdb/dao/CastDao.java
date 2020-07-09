package com.jhta.projectdb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.CastVo;

@Repository
public class CastDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.cast";
	
	public int moviebuy(CastVo vo) {
		System.out.println("dao");
		return sqlSession.insert(NAMESPACE+".moviebuy",vo);
	}
}
