package com.jhta.projectdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.CastService;
import com.jhta.projectdb.service.FilmService;
import com.jhta.projectdb.service.GenreService;
import com.jhta.projectdb.service.MovieImgService;
import com.jhta.projectdb.vo.CastVo;
import com.jhta.projectdb.vo.FilmVo;
import com.jhta.projectdb.vo.GenreVo;
import com.jhta.projectdb.vo.MovieImgVo;

@RestController
public class FilmDetailController {
	@Autowired
	private FilmService service;
	@Autowired
	private CastService service1;
	@Autowired
	private GenreService service2;
	@Autowired
	private MovieImgService service3;
	
	@RequestMapping("/fm/filmgetInfo.do")
	public FilmVo filmGetInfo(@RequestParam int filmNum) {
		return service.getinfo(filmNum);
	}
	@RequestMapping("/fm/castgetInfo.do")
	public CastVo castGetInfo(@RequestParam int filmNum) {
		return service1.getinfo1(filmNum);
	}
	@RequestMapping("/fm/genregetInfo.do")
	public GenreVo genreGetInfo(@RequestParam int genreNum) {
		return service2.getinfo2(genreNum);
	}
	@RequestMapping("/fm/mimggetInfo.do")
	public MovieImgVo mimgGetInfo(@RequestParam int filmNum) {
		return service3.getinfo3(filmNum);
	}
	
}


