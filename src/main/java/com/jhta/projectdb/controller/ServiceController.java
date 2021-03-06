package com.jhta.projectdb.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.AskService;
import com.jhta.projectdb.service.AskServiceTr;
import com.jhta.projectdb.service.QnaService;
import com.jhta.projectdb.vo.AskVo;
import com.jhta.projectdb.vo.QnaVo;
import com.jhta.projectdb.vo.ReplayInfoVo;
import com.jhta.projectdb.vo.ReplyVo;

@RestController
public class ServiceController {
	@Autowired
	private QnaService qnaService;
	@Autowired
	private AskServiceTr askServiceTr;
	@Autowired
	private AskService askService;

	@RequestMapping(value="/service/qna/update.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public QnaVo qnaUpdate(@RequestParam int qnaNum) {
		QnaVo vo=qnaService.getinfo(qnaNum);
		return vo;
	}
	
	@RequestMapping(value="/service/qna/updateOk.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public String qnaUpdateOk(@RequestBody QnaVo vo) {
		int n=qnaService.update(vo);
		if(n>0) {
			return "success";
		}else {
			return "error";
		}
	}
	
	@RequestMapping(value="/service/qna/delete.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public String qnaDelete(@RequestParam int qnaNum) {
		int n=qnaService.delete(qnaNum);
		if(n>0) {
			return "success";
		}else {
			return "error";
		}
	}
	
	@RequestMapping("/service/qna/list.do")
	public List<QnaVo> qnaList(@RequestBody HashMap<String, Object> map) {
		return qnaService.list(map);
	}
	
	@RequestMapping(value="/service/qna/count.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public int qnaCount() {
		return qnaService.count();
	}
	
	@RequestMapping(value="/service/qna/insertOk.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public String qnaInsertOk(@RequestBody QnaVo vo) {
		System.out.println("vo-------"+vo.getQnaTitle());
		int n=qnaService.insert(vo);
		if(n>0) {
			return "success";
		}else {
			return "error";
		}
	}
	
	@RequestMapping(value="/service/reply/count.do",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public int askCount() {
		return askService.count();
	}
	
	@RequestMapping("/service/reply/askList.do")
	public List<AskVo> askList(@RequestBody HashMap<String, Object> map) throws ParseException {
		List<AskVo> list=askService.list(map);
		for(AskVo vo:list) {
			System.out.println(vo.getAskRegdate());
		}
		return list;
	}
	
	@RequestMapping("/service/reply/getinfo.do")
	public ReplayInfoVo getInfo(@RequestParam int askNum) {
		AskVo vo=askService.askGetinfo(askNum);
		ReplyVo vo1=askService.replyGetinfo(askNum);
		ReplayInfoVo rvo=new ReplayInfoVo();
		rvo.setVo(vo);
		rvo.setVo1(vo1);
		return rvo;
	}
	
	@RequestMapping("/service/reply/insert.do")
	public AskVo replyInsert(@RequestBody ReplyVo vo){
		int n=askServiceTr.replyInsert(vo);
		if(n>0) {
			return askService.askGetinfo(vo.getAskNum()); 
		}else {
			return null;
		}
	}
	
	//�떟蹂��닔�젙�븯湲�(�꽦吏�)
	@RequestMapping("/service/reply/update.do")
	public AskVo replyUpdate(@RequestBody ReplyVo vo) {
		int n=askService.replyUpdate(vo);
		if(n>0) {
			return askService.askGetinfo(vo.getAskNum()); 
		}else {
			return null;
		}
	}
}

