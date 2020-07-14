package com.jhta.projectdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.StaffTypeDao;
import com.jhta.projectdb.vo.StaffTypeVo;
@Service
public class StaffTypeService {
	@Autowired
	private StaffTypeDao staffTypeDao;
	public List<StaffTypeVo> slist() {
		List<StaffTypeVo> list = staffTypeDao.slist();
		System.out.println("service:"+list);
		return list;
	}
}
