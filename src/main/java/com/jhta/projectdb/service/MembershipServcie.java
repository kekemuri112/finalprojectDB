package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.MembershipDao;

@Service
public class MembershipServcie {
	@Autowired
	MembershipDao memberDao;
	public String getEmail(String memId) {
		System.out.println("***********membershipService Ÿ��*****************");
		return memberDao.getEmail(memId);
	}
}
