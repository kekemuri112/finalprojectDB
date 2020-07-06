package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.AskVo;
import com.jhta.projectdb.vo.ReplyVo;

@Repository
public class AskDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.ask";
	private final String NAMESPACE2="com.jhta.mybatis.mapper.reply";
	
	
	public List<AskVo> list(HashMap<String, Object> map){
		return sqlSession.selectList(NAMESPACE+".list",map);
	}
	public AskVo askGetinfo(int askNum) {
		return sqlSession.selectOne(NAMESPACE+".getinfo",askNum);
	}
	public int replyInsert(ReplyVo vo) {
		return sqlSession.insert(NAMESPACE2+".insert",vo);
	}
	public ReplyVo replyGetinfo(int askNum) {
		return sqlSession.selectOne(NAMESPACE2+".getinfo",askNum);
	}
	//�떟蹂� �닔�젙
	public int replyUpdate(ReplyVo vo) {
		return sqlSession.update(NAMESPACE2+".update",vo);
	}
	//�떟蹂��긽�깭
	public int respUpdate(int askNum) {
		return sqlSession.update(NAMESPACE+".respUpdate",askNum);
	}
	public int count() {
		return sqlSession.selectOne(NAMESPACE+".count");
	}
}









