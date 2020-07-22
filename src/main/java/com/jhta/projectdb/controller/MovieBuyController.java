package com.jhta.projectdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.MovieBuyService;
import com.jhta.projectdb.vo.BookVo;

@RestController
public class MovieBuyController {
	@Autowired
	private MovieBuyService service;
	
	@RequestMapping(value="/buy/screen/insert.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public String insert(@RequestBody List<BookVo> list,@RequestParam int seatMoney,@RequestParam int memNum) {
		System.out.println("리스트===="+list.get(0).getChargeNum());
		int n=service.movieSeat(list, seatMoney,memNum);
		if(n>0) {
			return "success";
		}else {
			return "fail";
		}
	}
}
