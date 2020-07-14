package com.jhta.projectdb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.WSListVo;
import com.jhta.projectdb.vo.WScheduleVo;


@Repository
public class WScheduleDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.wschedule";
	
	public List<WSListVo> slist(String workDate) {
		System.out.println("dao");
		return sqlSession.selectList(NAMESPACE+".slist",workDate);
	}
}
