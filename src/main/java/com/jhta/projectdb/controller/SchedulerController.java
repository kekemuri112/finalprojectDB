package com.jhta.projectdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.project.service.RestService;
import com.jhta.projectdb.service.WScheduleService;
import com.jhta.projectdb.vo.WSListVo;

@RestController
public class SchedulerController {
	@Autowired
	private WScheduleService service;
	
	
	@RequestMapping("/schedule/scheduler.do")
	public String schedule() {
		return ".schedule.scheduler";
	}
	
	@RequestMapping("/schedule/slist.do")
	public List<WSListVo> slist(@RequestParam String workDate) {
		service.slist(workDate);
		return null;
	}
}
