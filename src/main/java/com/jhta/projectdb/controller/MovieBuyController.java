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
	public String insert(@RequestBody List<BookVo> list,@RequestParam int seatMoney,@RequestParam int memNum,@RequestParam int mscheduleNum) {
		System.out.println("11111111111111111111111111111111111"+seatMoney+":"+memNum+"mscheduleNum:"+mscheduleNum);
		try {
			service.movieSeat(list, seatMoney,memNum,mscheduleNum);
			return "success";
		}catch(Exception e) {
			return "error";
		}
	}
	@RequestMapping(value="/movie/deadline.do")
	public String insert() {
		return service.deadline();
	}
	
	@RequestMapping(value="/buy/ticketDate.do")
	public String filmend(@RequestParam int branchNum) {
		return service.filmend(branchNum);
	}
}
