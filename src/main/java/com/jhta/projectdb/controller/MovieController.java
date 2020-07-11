package com.jhta.projectdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.GenreService;
import com.jhta.projectdb.service.MovieBuyService;
import com.jhta.projectdb.vo.FilmVo;
import com.jhta.projectdb.vo.GenreVo;
import com.jhta.projectdb.vo.MovieBuyVo;
import com.jhta.projectdb.vo.MovieImgVo;
import com.jhta.projectdb.vo.common.Response;

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
	public Response moviebuyok(@RequestBody MovieBuyVo vo) {
		Response result = new Response();
		result.setResultCode("success");
		try {
			FilmVo fvo= vo.getFilmVo();
			MovieImgVo mvo=vo.getMovieImgVo();
			String[] human=vo.getHuman();
			result.setResult("success");
			//buyService.moviebuyservice(fvo, mvo, human);
		}catch(Exception e) {
			result.setResultCode("error");
			result.setResult(e.getCause());
		}
		
		return result;
	}
	
}

