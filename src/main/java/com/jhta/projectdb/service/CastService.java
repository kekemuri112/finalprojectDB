package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.FilmListDao;
import com.jhta.projectdb.vo.CastVo;

@Service
public class CastService {
	@Autowired
	private FilmListDao dao;
	
	public CastVo getinfo1(int filmNum) {
		return dao.getinfo1(filmNum);
	}
}
