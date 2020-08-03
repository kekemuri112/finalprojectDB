package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.RevenuDao;
import com.jhta.projectdb.vo.RevenueVo;

@Service
public class RevenuService {
	@Autowired
	private RevenuDao revenuDao;
	
	public List<RevenueVo> monthList(HashMap<String, Object> map){
		return revenuDao.monthList(map);
	}
	public List<RevenueVo> dayList(HashMap<String, Object> map){
		return revenuDao.dayList(map);
	}
	public List<RevenueVo> yearList(HashMap<String, Object> map){
		return revenuDao.yearList(map);
	}
}









