package com.jhta.projectdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.WScheduleService;
import com.jhta.projectdb.vo.WSListVo;
import com.jhta.projectdb.vo.WSModalistOkVo;
import com.jhta.projectdb.vo.WSModalistVo;
import com.jhta.projectdb.vo.WScheduleVo;

@RestController
public class SchedulerController {
	@Autowired
	private WScheduleService service;
	
	@RequestMapping("/schedule/scheduler.do")
	public String schedule() {
		return ".schedule.scheduler";
	}
	
	@RequestMapping(value="/schedule/slist.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<WSListVo> slist(@RequestParam String workDate) {
		List<WSListVo> list=service.slist(workDate);
		if(list.size()==0) {
			return null; 
		}else {
			return list;
		}
	}
	
	@RequestMapping(value="/schedule/modalist.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<WSModalistVo> sadd(@RequestParam String workDate){
		return service.modalist(workDate);
	}
	
	@RequestMapping(value="/schedule/modalistOk.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<WSModalistVo> modalistOk(@RequestBody WSModalistOkVo vo) {
		int n = service.modalistOk(vo);
		System.out.println(n);
		if (n>0) {
			return service.modalist(vo.getWorkDate());
		}else {
			return null;
			
		}
	}
	@RequestMapping(value="/schedule/updateOk.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public String update(@RequestBody WScheduleVo vo) {
		int n=service.update(vo);
		if(n>0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	@RequestMapping(value="/schedule/delete.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public String delete(@RequestParam int sNum) {
		int n=service.delete(sNum);
		if(n>0) {
			return "success";
		}else {
			return "fail";
		}
	}
}
