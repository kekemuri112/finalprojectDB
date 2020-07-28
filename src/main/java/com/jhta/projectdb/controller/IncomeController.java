package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.BranchService;
import com.jhta.projectdb.service.ChargeService;
import com.jhta.projectdb.service.FilmService;
import com.jhta.projectdb.service.RevenuService;
import com.jhta.projectdb.vo.ChargeVo;
import com.jhta.projectdb.vo.RevenueVo;

@RestController
public class IncomeController {
	@Autowired
	private RevenuService revenuService;
	@Autowired
	private ChargeService chargeService;
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
	//기간�?매출조회 ?�별
	@RequestMapping(value="/sales/dayList.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public List<RevenueVo> dayList(@RequestParam String date,@RequestParam String date1) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("date", date);
		map.put("date1", date1);
		return revenuService.dayList(map);
	}
	//기간�?매출조회 ?�별
	@RequestMapping(value="/sales/monthList.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public List<RevenueVo> monthList(@RequestParam String date,@RequestParam String date1) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("date", date);
		map.put("date1", date1);
		return revenuService.monthList(map);
	}
	//기간�?매출조회 ?�도�?
	@RequestMapping(value="/sales/yearList.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public List<RevenueVo> yearList(@RequestParam String date,@RequestParam String date1) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("date", date);
		map.put("date1", date1);
		return revenuService.yearList(map);
	}
	
	
	//?�별 매출조회 ?�도�?
	@RequestMapping(value="/sales/gender/yearList.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public List<ChargeVo> genderYearList(@RequestParam String date,@RequestParam String date1){
		HashMap<String, String> map=new HashMap<String, String>(); 
		map.put("date", date); 
		map.put("date1", date1);
		return chargeService.genderYearList(map);
	} 
	//?�별 매출조회 ?�별
	@RequestMapping(value="/sales/gender/monthList.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ResponseBody public List<ChargeVo> genderMonthList(@RequestParam String date,@RequestParam String date1){ 
		HashMap<String, String>map=new HashMap<String, String>();
		map.put("date", date);
		map.put("date1", date1);
		return chargeService.genderMonthList(map);
	 }
	 
	 
	 
	 //?�령�?매출조회 ?�도�?
	 @RequestMapping(value="/sales/age/yearList.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	 @ResponseBody public List<ChargeVo> ageYearList(@RequestParam String date,@RequestParam String date1){
		HashMap<String, String>map=new HashMap<String, String>();
		map.put("date", date);
		map.put("date1", date1);
		return chargeService.ageYearList(map);
	 }
	 //?�령�?매출조회 ?�별
	 @RequestMapping(value="/sales/age/monthList.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	 @ResponseBody public List<ChargeVo> ageMonthList(@RequestParam String date,@RequestParam String date1){ 
		HashMap<String, String>map=new HashMap<String, String>();
		map.put("date", date);
		map.put("date1", date1);
		return chargeService.ageMonthList(map);
	 }
}










