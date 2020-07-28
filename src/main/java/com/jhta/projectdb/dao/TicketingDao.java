package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.TicketingVo;

@Repository
public class TicketingDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPASE = "com.jhta.mybatis.mapper.ticketing";
	
	public List<TicketingVo> ticketingtList(int memNum){
		return session.selectList(NAMESPASE+".ticketingtList",memNum);
	}

	public List<TicketingVo> ticketingtSelectList(HashMap<String, Object> map) {
		return session.selectList(NAMESPASE+".ticketingtSelectList",map);
	}
}
