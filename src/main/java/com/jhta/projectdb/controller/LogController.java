package com.jhta.projectdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.LogService;
import com.jhta.projectdb.service.MileService;
import com.jhta.projectdb.vo.MembershipVo;
import com.jhta.projectdb.vo.TicketingVo;

@RestController

// 정재웅의 로그인 controller
public class LogController {
	@Autowired
	private LogService service;
	@Autowired
	private MileService mileService;
	
	@RequestMapping(value="/log/idcheck.do",produces={MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public String idcheck(@RequestParam String memId) {
		System.out.println("디비 컨트롤러 옴");
		if(service.getcountJW(memId)>0) {
			return "fail";
		}else {
			return "success";
		}
	}
	
	@RequestMapping("/log/signmake.do")
	public String signmake(@RequestBody MembershipVo vo) {
		int n =service.signmake(vo);
		if(n>0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	@RequestMapping("/log/loging.do")
	@ResponseBody
	public MembershipVo loging(@RequestParam String memId, String memPwd) {
		MembershipVo vo = service.loging(memId,memPwd);
		if(vo!=null) {
			return vo;
		}else {
			return null;
		}
	}
	@RequestMapping("/log/memuserok.do")
	@ResponseBody
	public String memuserok(@RequestBody MembershipVo vo) {
		int n =service.memuserok(vo);
		if(n>0) {
			return "success";
		}else {
			return "fail";
		}
	}
	@RequestMapping("/log/mempwdok.do")
	@ResponseBody
	public String mempwdok(@RequestBody MembershipVo vo) {
		int n =service.mempwdok(vo);
		if(n>0) {
			return "success";
		}else {
			return "fail";
		}
	}
	@RequestMapping("/log/memsecok.do")
	@ResponseBody
	public String memsecok(@RequestBody MembershipVo vo) {
		int n =service.memsecok(vo);
		if(n>0) {
			return "success";
		}else {
			return "fail";
		}
	}
	@RequestMapping("/log/mlie.do")
	public int payment(@RequestParam String memId) {
		return mileService.mileGetinfo(memId);
	}
}
