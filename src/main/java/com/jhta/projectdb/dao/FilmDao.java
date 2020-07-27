package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.FilmVo;

@Repository
public class FilmDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.jhta.mybatis.mapper.film";

	public int moviebuy(FilmVo vo) {
		System.out.println("�ʸ�dao");
		return sqlSession.insert(NAMESPACE + ".moviebuy", vo);

	}

	public List<String> getName() {
		return sqlSession.selectList(NAMESPACE + ".getName");
	}

	public List<HashMap<String, Object>> getChat(String filmName) {
		return sqlSession.selectList(NAMESPACE + ".getChat", filmName);
	}

	public List<HashMap<String, Object>> getThumbnailMovie() {
		return sqlSession.selectList(NAMESPACE + ".getThumbnailMovie");
	}

	public HashMap<String, Object> getTodayMoive() {
		return sqlSession.selectOne(NAMESPACE + ".getTodayMoive");
	}

}
