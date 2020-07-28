package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.ProPosalDao;
import com.jhta.projectdb.vo.ProposalVo;

@Service
public class ProposalService {
	@Autowired
	private ProPosalDao dao;
	
	public int insert(ProposalVo vo) {
		return dao.insert(vo);
	}
}
