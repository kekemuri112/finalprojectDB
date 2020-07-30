package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.LocationService;
import com.jhta.projectdb.vo.LocationBranchListVo;
import com.jhta.projectdb.vo.LocationListVo;

@RestController
public class LocationController {
	@Autowired
	private LocationService service;

	@RequestMapping("/show/locatedList.do")
	public LocationListVo locatedList(@RequestParam String cityAddr) {
		return service.locatedList(cityAddr);
	}
	
	@RequestMapping(value="/show/list.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<String> list(){
		return service.list();
	}
	
	@RequestMapping(value="/show/locMovieList.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<LocationBranchListVo> locMovieList(@RequestBody HashMap<String, Object> map){
		return service.locMovieList(map);
	}
	
	@RequestMapping("/show/scount.do")
	public List<HashMap<String, Object>> scount(@RequestParam int branchNum){
		return service.scount(branchNum);
	}
	
	@RequestMapping(value="/show/left.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public int left(@RequestBody HashMap<String, Integer> map) {
		return service.left(map);
	}
		
}
