package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.BranchService;
import com.jhta.projectdb.vo.BranchVo;

@RestController
public class BranchController {
	@Autowired
	private BranchService service;
	
	@RequestMapping("/branch/count.do")
	public String count(@RequestParam String keyword) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("keyword", keyword);
		int totalRowCount=service.count(map);
		return totalRowCount+"";
	}
	
	@RequestMapping("/branch.do")
	public List<BranchVo> list(@RequestBody HashMap<String, Object> map) {
		List<BranchVo> list=service.list(map);
		return list;
	}
	@RequestMapping("/service/region.do")
	public List<String> getBranchRegion(){
		return service.getBranchRegion();
	}
	
	@RequestMapping("/service/branch.do")
	public List<String> getBranch(@RequestParam String proAddr){
		return service.getBranch(proAddr);
	}
	
	@RequestMapping("/getNewBranch.do")
	public List<HashMap<String,Object>> getNewBranch(){
		return service.getNewBranch();
	}
	
}
