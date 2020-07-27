package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.BranchService;
import com.jhta.projectdb.service.FilmService;

@RestController
public class IncomeController {
	@Autowired
	private FilmService filmService;
	@Autowired
	private BranchService branchService;
	
	@RequestMapping("/admin/income/branch.do")
	public List<String> branch() {
		return branchService.getName();
	}
	
	@RequestMapping("/admin/income/film.do")
	public List<String> film() {
		return filmService.getName();
	}
		
		
	@RequestMapping("/admin/income/getMovieChat.do")
	public List<HashMap<String,Object>> getmovieChat(@RequestParam String filmName) {
		List<HashMap<String,Object>> list = filmService.getChat(filmName);
		return list;
	}
	
	@RequestMapping("/admin/income/getBranchChat.do")
	public List<HashMap<String,Object>> getBranchChat(@RequestParam String brName) {
		List<HashMap<String,Object>> list = branchService.getChat(brName);
		return list;
	}
}
