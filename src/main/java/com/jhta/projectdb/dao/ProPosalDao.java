package com.jhta.projectdb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.ProposalVo;

@Repository
public class ProPosalDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.proposal";
	
	public int insert(ProposalVo vo) {
		return sqlSession.insert(NAMESPACE+".insert",vo);
	}
}
