package com.jhta.projectdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.WScheduleDao;
import com.jhta.projectdb.vo.WSListVo;
import com.jhta.projectdb.vo.WScheduleVo;
@Service
public class WScheduleService {
	@Autowired
	private WScheduleDao wScheduleDao;
	public List<WSListVo> slist(String workDate) {
		List<WSListVo> list = wScheduleDao.slist(workDate);
		System.out.println("service:"+list.get(0).getDivisionname());
		return list;
	}
}
