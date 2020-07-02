package com.jhta.projectdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.MembersService;
import com.jhta.projectdb.vo.MembersVo;


@RestController
public class MembersController {
	@Autowired
	private MembersService service;
	
	@RequestMapping(value="/member/insert.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public String insert(@RequestBody MembersVo vo) {
		System.out.println("testA MembersController");
		int n=service.insert(vo);
		if(n>0) {
			return "home";
		}else {
			return "error";
		}
	}
	
}
