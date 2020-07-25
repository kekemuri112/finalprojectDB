package com.jhta.projectdb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.MReviewVo;

@Repository
public class MReviewDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPASE = "com.jhta.mybatis.mapper.mreview";
	
	public int mreviewInsert(MReviewVo vo) {
		return sqlSession.insert(NAMESPASE+".insert",vo);
	}
	public int mreviewUpdate(MReviewVo vo) {
		return sqlSession.update(NAMESPASE+".update",vo);
	}
	public int mreviewDelete(MReviewVo vo) {
		return sqlSession.delete(NAMESPASE+".delete",vo);
	}
}
