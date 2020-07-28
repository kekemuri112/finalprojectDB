package com.jhta.projectdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.ProPosalService;
import com.jhta.projectdb.vo.ProposalVo;

@RestController
public class ProPosalController {
	@Autowired
	private ProPosalService service;

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
