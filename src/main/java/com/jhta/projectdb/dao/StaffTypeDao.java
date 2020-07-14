package com.jhta.projectdb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.StaffTypeVo;


@Repository
public class StaffTypeDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.stafftype";
	
	public List<StaffTypeVo> slist() {
		System.out.println("dao");
		return sqlSession.selectList(NAMESPACE+".slist");
	}
}
