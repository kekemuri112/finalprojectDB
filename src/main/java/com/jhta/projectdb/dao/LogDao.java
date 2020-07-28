package com.jhta.projectdb.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.MembershipVo;

@Repository
public class LogDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPACE="com.jhta.mybatis.mapper.membership";
	
	public int getcountJW(String memId) {
		System.out.println("dao");
		return session.selectOne(NAMESPACE+".getcountJW",memId);
	}
	
	public int signmake(MembershipVo vo) {
		System.out.println("db dao 도착");
		return session.insert(NAMESPACE+".signmake",vo);
	}
	
	public MembershipVo loging(String memId, String memPwd) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("memId", memId);
		map.put("memPwd", memPwd);
		return session.selectOne(NAMESPACE+".loging",map);
	}
	
	public int memuserok(MembershipVo vo) {
		System.out.println("db dao");
		return session.update(NAMESPACE+".memuserok",vo);
	}
	
	public int mempwdok(MembershipVo vo) {
		System.out.println("db dao");
		return session.update(NAMESPACE+".mempwdok",vo);
	}
	
	public int memsecok(MembershipVo vo) {
		System.out.println("db dao");
		return session.update(NAMESPACE+".memsecok",vo);
	}
	
}