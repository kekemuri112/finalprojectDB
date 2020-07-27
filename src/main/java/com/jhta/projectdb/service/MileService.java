package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.MileDao;
import com.jhta.projectdb.vo.MileVo;

@Service
public class MileService {
	@Autowired
	private MileDao mileDao;
	
	public MileVo mileGetinfo(int memNum){
		return mileDao.mileGetinfo(memNum);
	}
	
}
