package com.jhta.projectdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.StaffDao;
import com.jhta.projectdb.vo.StaffVo;
@Service
public class StaffService {
	@Autowired
	private StaffDao staffDao;
	public List<StaffVo> sadd(int branchNum) {
		List<StaffVo> list = staffDao.sadd(branchNum);
		System.out.println("service:"+list);
		return list;
	}
}
