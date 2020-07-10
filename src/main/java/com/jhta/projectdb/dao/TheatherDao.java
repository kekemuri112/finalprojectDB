package com.jhta.projectdb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.TheatherVo;

@Repository
public class TheatherDao {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.theather";
	
	public List<TheatherVo> list(int branchNum){
		System.out.println(branchNum);
		return sqlSession.selectList(NAMESPACE+".list",branchNum);
	}
	
	public int delete(int theatherNum) {
		return sqlSession.delete(NAMESPACE+".delete",theatherNum);
	}
	public int update(TheatherVo vo) {
		return sqlSession.update(NAMESPACE+".update",vo);
	}
	public int insert(TheatherVo vo) {
		return sqlSession.insert(NAMESPACE+".insert",vo);
	}
	public TheatherVo getinfo(int theatherNum) {
		return sqlSession.selectOne(NAMESPACE+".getinfo",theatherNum);
	}
}
