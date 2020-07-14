package com.jhta.projectdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.StaffService;
import com.jhta.projectdb.service.WScheduleService;
import com.jhta.projectdb.vo.StaffVo;
import com.jhta.projectdb.vo.WSListVo;

@RestController
public class SchedulerController {
	@Autowired
	private WScheduleService service;
	@Autowired
	private StaffService sservice;
	
	@RequestMapping("/schedule/scheduler.do")
	public String schedule() {
		return ".schedule.scheduler";
	}
	
	@RequestMapping(value="/schedule/slist.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<WSListVo> slist(@RequestParam String workDate) {
		System.out.println(workDate);
		List<WSListVo> list=service.slist(workDate);
		if(list.size()==0) {
			return null; 
		}else {
			return list;
		}
	}
	
	@RequestMapping(value="/schedule/sadd.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<StaffVo> sadd(@RequestParam int branchNum){
		System.out.println("여기 도착");
		
		return sservice.sadd(branchNum);
	}
}
