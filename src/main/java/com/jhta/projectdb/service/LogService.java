package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhta.projectdb.dao.LogDao;
import com.jhta.projectdb.dao.MileDao;
import com.jhta.projectdb.vo.MembershipVo;
import com.jhta.projectdb.vo.MileVo;

@Service
//정재웅의 로그인 service입니다. 건들지 마세요
public class LogService {
	@Autowired
	private LogDao dao;
	@Autowired
	private MileDao mileDao;
	
	public int getcountJW(String memId) {
		return dao.getcountJW(memId);
	}
	
	@Transactional
	public int signmake(MembershipVo vo) {
		dao.signmake(vo);
		System.out.println(vo.getMemNum()+"yohoho");
		mileDao.mileInsert(0);
		return 1;
	}
	public MembershipVo loging(String memId, String memPwd) {
		return dao.loging(memId,memPwd);
	}
	
	public int memuserok(MembershipVo vo) {
		System.out.println("db 서비스");
		return dao.memuserok(vo);
	}
	public int mempwdok(MembershipVo vo) {
		System.out.println("db 서비스");
		return dao.mempwdok(vo);
	}
	public int memsecok(MembershipVo vo) {
		System.out.println("db 서비스");
		return dao.memsecok(vo);
	}
}
