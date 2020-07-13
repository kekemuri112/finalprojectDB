package com.jhta.projectdb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.SeatService;
import com.jhta.projectdb.service.TheatherService;
import com.jhta.projectdb.vo.SeatVo;
import com.jhta.projectdb.vo.TheatherVo;

@RestController
public class CreateSeatController {
	
	@Autowired
	private TheatherService service;
	
	@Autowired
	private SeatService sService;
	
	@RequestMapping("/room/seat/theather.do")
	public List<TheatherVo> createSeat(@RequestParam int branchNum){
		return service.list(branchNum);
	}
	
	@RequestMapping("/room/seat/createOk.do")
	public String createSeat(@RequestBody ArrayList<SeatVo> list){
		int n= sService.insert(list);
		if(n>0) {
			return "success";
		}else {
			return "error";
		}
	}
	
	@RequestMapping("/room/seat/search.do")
	public List<SeatVo> search(@RequestParam int theatherNum){
		return sService.searchSeat(theatherNum);
	}
	
	@RequestMapping("/room/seat/insertOk.do")
	public String insertSeat(@RequestBody TheatherVo vo){
		int n=service.insert(vo);
		if(n>0) {
			return "success";
		}else {
			return "error";
		}
	}
	
	@RequestMapping("/room/seat/seatCheck.do")
	public ArrayList<Boolean> seatCheck(@RequestBody ArrayList<Integer> list){
		return sService.seatCheck(list);
	}
	
	@RequestMapping("/room/seat/updateOk.do")
	public String updateSeat(@RequestBody TheatherVo vo){
		int n=service.update(vo);
		if(n>0) {
			return "success";
		}else {
			return "error";
		}
	}
	@RequestMapping("/room/seat/delete.do")
	public String deleteSeat(@RequestParam int theatherNum){
		int n=service.delete(theatherNum);
		if(n>0) {
			return "success";
		}else {
			return "error";
		}
	}
	
	@RequestMapping("/room/seat/getinfo.do")
	public TheatherVo getinfo(@RequestParam int theatherNum){
		return service.getinfo(theatherNum);
	}
	@RequestMapping("/room/seat/screen.do")
	public List<SeatVo> searchSeat(@RequestParam int theatherNum){
		return sService.searchSeat(theatherNum);
	}
	
}
