package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.FilmService;
import com.jhta.projectdb.vo.PurchaseFilmVo;

@RestController
public class FilmInsertController {
	@Autowired
	private FilmService service;
	
	
	@RequestMapping("/fm/insert.do")
	public String insert(@RequestBody PurchaseFilmVo vo) {
		System.out.println("여기는 레스트쪽 :"+vo.getFilmDeadline());
		return service.insert(vo)+"";
	}
	
	@RequestMapping("/fm/filminsert.do")
	public List<HashMap<String,Object>> insert(@RequestParam int branchNum) {
		System.out.println("컨트롤러 접근 못함...... ㅅㅄㅂ");
		List<HashMap<String,Object>> branchList=service.branchList(branchNum);
		return branchList;
	}
	
}
