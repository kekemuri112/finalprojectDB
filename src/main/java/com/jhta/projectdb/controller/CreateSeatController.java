package com.jhta.projectdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.TheatherService;
import com.jhta.projectdb.vo.TheatherVo;

@RestController
public class CreateSeatController {
	
	@Autowired
	private TheatherService service;
	
	@RequestMapping("/room/seat/create.do")
	public String create() {
		return ".room.seat.create";
	}
	
	@RequestMapping("/room/seat/theather.do")
	public List<TheatherVo> createSeat(@RequestBody int branchNum){
		return service.list(branchNum);
	}
	
}
