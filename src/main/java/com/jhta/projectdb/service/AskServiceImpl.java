package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhta.projectdb.dao.AskDao;
import com.jhta.projectdb.vo.ReplyVo;

@Service
public class AskServiceImpl implements AskServiceTr{
	@Autowired
	private AskDao dao;
	
	@Transactional
	@Override
	public int replyInsert(Object data) {
		ReplyVo vo=(ReplyVo)data;
		dao.replyInsert(vo);
		dao.respUpdate(vo.getAskNum());
		return 1;
	}
}
