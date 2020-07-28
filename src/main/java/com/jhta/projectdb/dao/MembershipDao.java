package com.jhta.projectdb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.MembershipVo;


@Repository
public class MembershipDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.membership";
	
	public String getEmail(String memId) {
		String email=sqlSession.selectOne(NAMESPACE+".getEmail", memId);
		System.out.println("dao 접근... 출력값"+email);
		return email;
	}
	public MembershipVo memGetinfoSJ(int memNum) {
		return sqlSession.selectOne(NAMESPACE+".getinfoSJ",memNum);
	}
}
