package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.QnaService;

@RestController
public class ServiceCenterController {
	@Autowired
	private QnaService qnaservice;
	
	@RequestMapping("/service/getRepeatedQna.do")
	public List<HashMap<String,Object>> getRepeatedQna(){
		return qnaservice.getRepeatedQna();
	}
}
