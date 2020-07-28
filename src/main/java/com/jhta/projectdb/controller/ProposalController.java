package com.jhta.projectdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.ProposalService;
import com.jhta.projectdb.vo.ProposalVo;

@RestController
public class ProposalController {
	@Autowired
	private ProposalService service;

	@RequestMapping("/service/branchApplyInsert.do")
	public String ProPosalInsert(@RequestBody ProposalVo vo) {
		int n = service.insert(vo);
		if(n>0) {
			return "success"; 
		}else {
			return "fail";
		}
	}
}
