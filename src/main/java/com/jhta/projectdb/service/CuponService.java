package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.CuponDao;
import com.jhta.projectdb.vo.CuponVo;

@Service
public class CuponService {
	@Autowired
	private CuponDao cuponDao;
	
	public List<CuponVo> cuponList(HashMap<String, Object> map){
		return cuponDao.cuponList(map);
	}
	public int cuponCount(int memNum) {
		return cuponDao.cuponCount(memNum);
	}

}
