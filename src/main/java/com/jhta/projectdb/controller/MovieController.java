package com.jhta.projectdb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.GenreService;
import com.jhta.projectdb.service.MovieBuyService;
import com.jhta.projectdb.vo.FilmVo;
import com.jhta.projectdb.vo.GenreVo;
import com.jhta.projectdb.vo.MovieImgVo;

@RestController
public class MovieController {
	@Autowired
	private GenreService genService;
	
	@Autowired
	private MovieBuyService buyService;
	
	@RequestMapping(value="/movieinfo/genre.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<GenreVo> selectboxinfo() {
		List<GenreVo> list=genService.selectboxinfo();
		return list;
	}
	
	@RequestMapping(value="/movieinfo/moviebuyOk.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public String moviebuyok(@RequestBody FilmVo fvo,@RequestBody MovieImgVo mvo,@RequestBody HashMap<String, String> map) {
		try {
			System.out.println("rest접근.."+fvo.getFilmName());
			//buyService.moviebuyservice(fvo, mvo, human);
			return "success";
		}catch(Exception e) {
			return "error";
		}
	}
	
}

