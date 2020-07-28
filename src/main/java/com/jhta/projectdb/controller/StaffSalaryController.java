package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.StaffSalaryService;

@RestController
public class StaffSalaryController {
	@Autowired
	private StaffSalaryService service;
	
	@RequestMapping("/salary/saManagement.do")
	public List<HashMap<String,Object>> getSaleryList(HashMap<String,Object> map){
		return service.getSaleryList(map);
	}
}
