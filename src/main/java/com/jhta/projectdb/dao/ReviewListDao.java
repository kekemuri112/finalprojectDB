package com.jhta.projectdb.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.MReviewVo;
import com.jhta.projectdb.vo.ReviewBoardVo;

@Repository
public class ReviewListDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.mreview";
	public List<ReviewBoardVo> showReviews(HashMap<String, Object> map){
		System.out.println("dao진입");
		return sqlSession.selectList(NAMESPACE+".reviewList",map);
	}
	
	//한페이지에 노출되는 행의 개수 구하기
	public int count(int filmNum) {
		return sqlSession.selectOne(NAMESPACE +".count",filmNum);
	}
	
	//총 평점 구하는 함수
	public int movieGrade(int filmNum) {
		return sqlSession.selectOne(NAMESPACE+".movieGrade", filmNum);
	}
	
	//관람평작성 누르면 진입하는 함수
	public HashMap<String, BigDecimal> chkReview(int filmNum, int memNum){
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		map.put("filmNum", filmNum);
		map.put("memNum",memNum);
		return sqlSession.selectOne(NAMESPACE+".chkReview",map);
	}
	
	//관람평 작성 조건에 부합하면 리뷰테이블에 insert 시키는 함수
	public int insertMReview(MReviewVo vo){
		return sqlSession.insert(NAMESPACE+".writeReview",vo);
	}

	
}
