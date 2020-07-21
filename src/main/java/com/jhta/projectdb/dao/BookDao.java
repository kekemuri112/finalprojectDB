package com.jhta.projectdb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.BookVo;

@Repository
public class BookDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPACE="com.jhta.mybatis.mapper.book";
	
	public int insert(BookVo vo) {
		return session.insert(NAMESPACE+".insert",vo);
	}
}
