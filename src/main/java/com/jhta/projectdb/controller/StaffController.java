package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.StaffService;
import com.jhta.projectdb.vo.DivisionVo;
import com.jhta.projectdb.vo.StaffTypeVo;
import com.jhta.projectdb.vo.StaffVo;

@RestController
public class StaffController {
	@Autowired
	private StaffService staffService;
	
	@RequestMapping("/employee/getCount.do")
	public int getCount(@RequestBody HashMap<String,Object> map) {
		int count = staffService.getCount(map);
		return count;
	}
	
	@RequestMapping("/employee/emSelect.do")
	public List<HashMap<String,Object>> getStaffList(@RequestBody HashMap<String,Object> map){
		List<HashMap<String,Object>> list = staffService.getStaffList(map);
		return list;
	}
	
	@RequestMapping("/employee/getBrName.do")
	public List<String> getBrName(){
		List<String> list =  staffService.getBrName();
		return list;
	}
	
	@RequestMapping("/employee/getSffPosition.do")
	public List<StaffTypeVo> getSffPosition(){
		List<StaffTypeVo> list =  staffService.getSffPosition();
		return list;
	}
	
	@RequestMapping("/employee/getDivisionName.do")
	public List<DivisionVo> getDivisionName(){
		List<DivisionVo> list =  staffService.getDivisionName();
		return list;
	}
	
	@RequestMapping("/employee/staffInsert.do")
	public String staffInsert(@RequestBody StaffVo vo) {
		int n = staffService.staffInsert(vo);
		if(n>=0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	@RequestMapping("/employee/staffUpdate.do")
	public String staffUpdate(@RequestBody StaffVo vo) {
		int n = staffService.staffUpdate(vo);
		System.out.println("n:"+n);
		if(n>=0) {
			return "success";
		}else {
			return "fail";
		}
	}
}
