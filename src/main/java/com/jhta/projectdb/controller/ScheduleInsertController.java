package com.jhta.projectdb.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.MScheduleService;
import com.jhta.projectdb.vo.MScheduleInsertVo;

@RestController
public class ScheduleInsertController {
	@Autowired
	private MScheduleService service;
	
	
	@RequestMapping("/schedule/scheduleinsert.do")
	public String scheduleInsert(@RequestBody MScheduleInsertVo vo) throws ParseException {
		return service.insert(vo.getTheatherNum(), vo.getDate(), vo.getTime(), vo.getPurchasefilmNum(), vo.getFilmDeadline())+"";
	}
	@RequestMapping("/schedule/list.do")
	public List<HashMap<String,Object>> scheduleList(@RequestParam int branchNum,@RequestParam String date){
		return service.list(branchNum, date);
	}
	@RequestMapping("/schedule/scount.do")
	public List<HashMap<String,Object>> scheduleScount(@RequestParam int branchNum){
		return service.scount(branchNum);
	}
	
}
