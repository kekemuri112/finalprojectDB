package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.AskService;
import com.jhta.projectdb.service.QnaService;

@RestController
public class ServiceCenterController {
	@Autowired
	private QnaService qnaservice;
	@Autowired
	private AskService askservice;
	
	@RequestMapping("/service/getRepeatedQna.do")
	public List<HashMap<String,Object>> getRepeatedQna(){
		return qnaservice.getRepeatedQna();
	}
	
	@RequestMapping("/service/askInsert.do")
	public String askInsert(@RequestBody HashMap<String,Object> map) {
		int n = askservice.insert(map);
		if(n>0) {
			return "success";
		}else {
			return "fail";
		}
	}
}
