package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
		List<TicketingVo> list=ticketingService.ticketingtList(memNum);
		return list;
	}
	@RequestMapping("/mypage/selectPayment.do")
	public List<TicketingVo> selectPayment(@RequestBody HashMap<String, Object> map) {
		List<TicketingVo> list=ticketingService.ticketingtSelectList(map);
		return list;
	}
	
	//쿠폰함
	@RequestMapping("/mypage/cupon.do")
	public List<CuponVo> cupon(@RequestBody HashMap<String, Object> map) {
		List<CuponVo> list=cuponService.cuponList(map);
		return list;
	}
	
	@RequestMapping("/mypage/cuponCount.do")
	public int cuponCount(@RequestParam int memNum) {
		int totalRowCount=cuponService.cuponCount(memNum);//회원번호
		return totalRowCount;
	}
	
	//내가 본 영화
	@RequestMapping("/mypage/moviesaw.do")
	public List<MovieSawVo> moviesaw(@RequestParam int memNum) {
		List<MovieSawVo> list=movieSawService.moviesawList(memNum);
		return list;
	}
	@RequestMapping("/mypage/movieCount.do")
	public int movieCount(@RequestParam int memNum) {
		int movieCount=movieSawService.movieCount(memNum);//memNum
		return movieCount;
	}
	@RequestMapping("/mypage/selectList.do")
	public List<MovieSawVo> moviesaw(@RequestBody HashMap<String, Object> map) {
		List<MovieSawVo> list=movieSawService.selectList(map);
		return list;
	}
	@RequestMapping("/mypage/selectMovieCount.do")
	public int movieCount(@RequestBody HashMap<String, Object> map) {
		int movieCount=movieSawService.selectMovieCount(map);//memNum
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
		AskVo vo=askService.askGetinfoClient(askNum);
		return vo;
	}
	//1:1문의하기
	@RequestMapping("/mypage/inquiryInsert.do")
	public int askInsert(@RequestBody AskVo vo) {
		System.out.println("DB 컨트롤러 문의하기");
		return askService.askInsert(vo);
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












