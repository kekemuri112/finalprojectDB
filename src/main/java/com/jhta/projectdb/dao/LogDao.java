package com.jhta.projectdb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.MembershipVo;

@Repository
public class LogDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPACE="com.jhta.mybatis.mapper.membership";
	
	public int getinfo(String memId) {
		return session.selectOne(NAMESPACE+".getinfo",memId);
	}
	
	public int signmake(MembershipVo vo) {
		System.out.println("db dao 도착");
		return session.insert(NAMESPACE+".signmake",vo);
	}
	
	public int loging(int memNum) {
		return session.selectOne(NAMESPACE+".loging",memNum);
	}
}
