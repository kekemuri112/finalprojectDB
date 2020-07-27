package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.TicketingDao;
import com.jhta.projectdb.vo.TicketingVo;

@Service
public class TicketingService {
	@Autowired
	private TicketingDao ticketingDao;

	public List<TicketingVo> ticketingtList(int memNum){
		return ticketingDao.ticketingtList(memNum);
	}
	public List<TicketingVo> ticketingtSelectList(HashMap<String, Object> map){
		return ticketingDao.ticketingtSelectList(map);
	}
	
}
