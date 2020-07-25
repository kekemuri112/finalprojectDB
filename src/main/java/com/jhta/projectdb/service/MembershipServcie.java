package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.MembershipDao;
import com.jhta.projectdb.vo.MembershipVo;

@Service
public class MembershipServcie {
	@Autowired
	private MembershipDao membershipDao;
	
	public String getEmail(String memId) {
		System.out.println("레스트서비스 접근"+memId);
		return membershipDao.getEmail(memId);
	}
	
	public MembershipVo memGetinfoSJ(int memNum) {
		return membershipDao.memGetinfoSJ(memNum);
	}
	
}
