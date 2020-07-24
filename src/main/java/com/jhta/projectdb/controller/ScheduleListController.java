package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.MScheduleService;
import com.jhta.projectdb.service.TheatherService;
import com.jhta.projectdb.vo.MScheduleListVo;
import com.jhta.projectdb.vo.TheatherVo;

@RestController
public class ScheduleListController {
	@Autowired
	private MScheduleService msService;
	@Autowired
	private TheatherService service;
	
	@RequestMapping("/fm/showAllMovieSchedule.do")
	public MScheduleListVo showAllMovieSchedule(@RequestBody HashMap<String, Object> map) {
		return msService.showAllMovieSchedule(map);
	}
	@RequestMapping("/fm/theatherlist.do")
	public List<TheatherVo> list(@RequestParam int branchNum){
		return service.listCount(branchNum);
	}

}



