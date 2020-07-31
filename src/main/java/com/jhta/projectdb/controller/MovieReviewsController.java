package com.jhta.projectdb.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.ReviewListService;
import com.jhta.projectdb.vo.MReviewVo;
import com.jhta.projectdb.vo.ReviewBoardVo;

@RestController
public class MovieReviewsController {
	@Autowired
	private ReviewListService reviewService;

	/////////////////////////////////////////평점 및 관람평 클릭하면 ajax통신하는 함수////////////////////////////////////
	@RequestMapping(value="/movie/showReviews.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<ReviewBoardVo> showReviews(@RequestBody HashMap<String, Object> map) {
		List<ReviewBoardVo> reviewListVo=reviewService.showReviews(map);
		System.out.println("db 리뷰컨트롤러"+reviewListVo);
		System.out.println(reviewListVo.get(0).getMemName()+"-0000000000000-");
		return reviewListVo;
	}
	
	@RequestMapping("/movie/chkReview.do")
	public HashMap<String, BigDecimal> chkReview(@RequestParam int filmNum,@RequestParam int memNum){
		return reviewService.chkReview(filmNum, memNum);
	}
	
	@RequestMapping("/movie/insertMReview.do")
	public int insertMReview(@RequestBody MReviewVo vo) {
		return reviewService.insertMReview(vo);
	}
	

}




