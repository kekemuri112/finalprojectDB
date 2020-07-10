package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.StaffService;

@RestController
public class StaffController {
	@Autowired
	private StaffService staffService;
	
	@RequestMapping("/employee/getCount.do")
	public int getCount(@RequestBody HashMap<String,Object> map) {
		int count = staffService.getCount(map);
		System.out.println("count의 맵");
		System.out.println(map);
		System.out.println(map.get("br"));
		return count;
	}
	
	@RequestMapping("/employee/emSelect.do")
	public List<HashMap<String,Object>> getStaffList(@RequestBody HashMap<String,Object> map){
		List<HashMap<String,Object>> list = staffService.getStaffList(map);
		System.out.println("select의 맵");
		System.out.println(map);
		System.out.println(map.get("br"));
		return list;
	}
	
}
