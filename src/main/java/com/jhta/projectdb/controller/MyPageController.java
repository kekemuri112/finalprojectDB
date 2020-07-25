package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.AskService;
import com.jhta.projectdb.service.CuponService;
import com.jhta.projectdb.service.MReviewService;
import com.jhta.projectdb.service.MembershipServcie;
import com.jhta.projectdb.service.MovieSawService;
import com.jhta.projectdb.service.TicketingService;
import com.jhta.projectdb.vo.AskVo;
import com.jhta.projectdb.vo.CuponVo;
import com.jhta.projectdb.vo.MReviewVo;
import com.jhta.projectdb.vo.MembershipVo;
import com.jhta.projectdb.vo.MovieSawVo;
import com.jhta.projectdb.vo.TicketingVo;

@RestController
public class MyPageController {
	@Autowired
	private AskService askService;
	@Autowired
	private MovieSawService movieSawService;
	@Autowired
	private CuponService cuponService;
	@Autowired
	private MReviewService mreviewServie;
	@Autowired
	private TicketingService ticketingService;
	@Autowired
	private MembershipServcie membershipService;
	
	//결제 내역,예매 내역
	@RequestMapping("/mypage/payment.do")
	public List<TicketingVo> payment(@RequestParam int memNum) {
		System.out.println("DB 컨트롤러");
		List<TicketingVo> list=ticketingService.ticketingtList(memNum);
		return list;
	}
	
	//쿠폰함
	@RequestMapping("/mypage/cupon.do")
	public List<CuponVo> cupon(@RequestParam int memNum) {
		List<CuponVo> list=cuponService.cuponList(memNum);
		return list;
	}
	
	//내가 본 영화
	@RequestMapping("/mypage/moviesaw.do")
	public List<MovieSawVo> moviesaw(@RequestParam int memNum) {
		List<MovieSawVo> list=movieSawService.moviesawList(memNum);//memNum
		System.out.println(list.get(0).getmScore()+"---------------");
		return list;
	}
	@RequestMapping("/mypage/movieCount.do")
	public int movieCount(@RequestParam int memNum) {
		int movieCount=movieSawService.movieCount(memNum);//memNum
		return movieCount;
	}
	
	//1:1문의 리스트
	@RequestMapping("/mypage/inquiry.do")
	public List<AskVo> askList(@RequestBody HashMap<String, Object> map) {
		List<AskVo> list=askService.askList(map); //memNum
		return list;
	}
	
	@RequestMapping("/mypage/askCount.do")
	public int askCount(@RequestParam int memNum) {
		int totalRowCount=askService.askCount(memNum);//회원번호
		return totalRowCount;
	}
	
	//1:1문의 상세보기
	@RequestMapping("/mypage/inquiryDatail.do")
	public AskVo askgetInfo(@RequestParam int askNum) {
		AskVo vo=askService.askGetinfo(askNum);
		return vo;
	}
	//1:1문의하기
	@RequestMapping("/mypage/inquiryInsert.do")
	public MembershipVo askInsert(@RequestParam int askNum) {
		MembershipVo vo=membershipService.memGetinfoSJ(askNum);
		return vo;
	}
	
	//평점/리뷰 작성
	@RequestMapping(value="/mypage/reviewInsert.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public int reviewInsert(@RequestBody MReviewVo vo) {
		return mreviewServie.mreviewInsert(vo);
		
	}
	//평점/리뷰 수정
	@RequestMapping(value="/mypage/reviewUpdate.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public int reviewUpdate(@RequestBody MReviewVo vo) {
		return mreviewServie.mreviewUpdate(vo);
	}
	
}












