package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.AskDao;
import com.jhta.projectdb.vo.AskVo;
import com.jhta.projectdb.vo.ReplyVo;

@Service
public class AskService {
	@Autowired
	private AskDao askDao;
	
	public List<AskVo> list(HashMap<String, Object> map){
		return askDao.list(map);
	}
	public AskVo askGetinfo(int askNum) {
		return askDao.askGetinfo(askNum);
	}
	public ReplyVo replyGetinfo(int askNum) {
		return askDao.replyGetinfo(askNum);
	}
	//�떟蹂� �닔�젙
	public int replyUpdate(ReplyVo vo) {
		return askDao.replyUpdate(vo);
	}
	//�떟蹂��긽�깭
	public int respUpdate(int askNum) {
		return askDao.respUpdate(askNum);
	}
	public int count() {
		return askDao.count();
	}
	
	public List<AskVo> askList(HashMap<String, Object> map){
		return askDao.askList(map);
	}

	public int askCount(int memNum) {
		return askDao.askCount(memNum);
	}
	
	public AskVo askGetinfoClient(int askNum) {
		return askDao.askGetinfoClient(askNum);
	}
	
	public int askInsert(AskVo vo) {
		return askDao.askInsert(vo);
	}
	
}
