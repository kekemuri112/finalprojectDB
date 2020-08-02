package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.SeatVo;

@Repository
public class SeatDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPACE="com.jhta.mybatis.mapper.seat";
	
	public int insert(SeatVo vo) {
		return session.insert(NAMESPACE+".insert",vo);
	}
	public int update(SeatVo vo) {
		return session.update(NAMESPACE+".update",vo);
	}
	
	public int seatCheck(int theatherNum) {
		return session.selectOne(NAMESPACE+".seatCheck",theatherNum);
	}
	
	public List<SeatVo> searchSeat(int theatherNum){
		return session.selectList(NAMESPACE+".searchSeat",theatherNum);
	}
	
	public List<SeatVo> seatBuy(HashMap<String, Object> map){
		return session.selectList(NAMESPACE+".seatBuy",map);
	}
}
