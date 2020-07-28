package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.LogDao;
import com.jhta.projectdb.vo.MembershipVo;

@Service
//정재웅의 로그인 service입니다. 건들지 마세요
public class LogService {
	@Autowired
	private LogDao dao;
	
	public int getcountJW(String memId) {
		return dao.getcountJW(memId);
	}
	
	public int signmake(MembershipVo vo) {
		System.out.println("db 서비스");
		return dao.signmake(vo);
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
