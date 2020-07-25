package com.jhta.projectdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.CuponDao;
import com.jhta.projectdb.vo.CuponVo;

@Service
public class CuponService {
	@Autowired
	private CuponDao cuponDao;
	
	public List<CuponVo> cuponList(int memNum){
		return cuponDao.cuponList(memNum);
	}

}
