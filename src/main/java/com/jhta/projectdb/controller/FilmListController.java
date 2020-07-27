package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.FilmService;
import com.jhta.projectdb.vo.FilmVo;


@RestController
public class FilmListController {
	@Autowired
	private FilmService service;
	
	@RequestMapping("/fm/listCount.do")
	public int count() {
		return service.count();
	}
	
	@RequestMapping("/fm/list.do")
	public List<HashMap<String, Object>> list(@RequestBody HashMap<String,Object> map) {
		return service.list(map);
	}
	
	@RequestMapping("/movie/filmbuylist.do")
	public List<FilmVo> filmbuylist(){
		return service.filmbuylist();
	}

}
