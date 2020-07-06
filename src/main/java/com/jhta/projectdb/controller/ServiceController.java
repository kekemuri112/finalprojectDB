package com.jhta.projectdb.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.AskService;
import com.jhta.projectdb.service.AskServiceTr;
import com.jhta.projectdb.service.QnaService;
import com.jhta.projectdb.vo.AskVo;
import com.jhta.projectdb.vo.QnaVo;
import com.jhta.projectdb.vo.ReplyVo;

@RestController
public class ServiceController {
	@Autowired
	private QnaService qnaService;
	@Autowired
	private AskServiceTr askServiceTr;
	@Autowired
	private AskService askService;
	@Autowired
	private JavaMailSender mailSender;

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
	public ArrayList<Object> getInfo(@RequestParam int askNum) {
		AskVo vo=askService.askGetinfo(askNum);
		ReplyVo vo1=askService.replyGetinfo(askNum);
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(vo);
		list.add(vo1);
		return list;
	}
	
	@RequestMapping("/service/reply/insert.do")
	public HashMap<String, Object> replyInsert(ReplyVo vo,HttpServletRequest request){
		System.out.println("vo========================"+vo);
		int n=askServiceTr.replyInsert(vo);
		AskVo vo1=askService.askGetinfo(vo.getAskNum());
		HashMap<String, Object> map=new HashMap<String, Object>();
		
//		System.out.println("吏덈Ц�븳 �궗�엺 �씠硫붿씪"+vo1.getEmail());
//		
//	    String setfrom = "test@gmail.com"; //蹂대궡�뒗 �궗�엺 �씠硫붿씪
//	    String tomail  = /*vo1.getEmail();*/"test@gmail.com"; //諛쏅뒗 �궗�엺 �씠硫붿씪
//	    String title   = "硫붽�c�꽕留� : 臾몄쓽�븯�떊 吏덈Ц �떟蹂��셿猷�"; //硫붿씪 �젣紐�
//	    String content = "�젣紐�["+vo.getQnaTitle()+"]\n�궡�슜:"+vo.getReplyContent(); //硫붿씪 �궡�슜
//	    
//	    try {
//	        MimeMessage message = mailSender.createMimeMessage();
//	        MimeMessageHelper messageHelper 
//	                          = new MimeMessageHelper(message, true, "UTF-8");
//	   
//	        messageHelper.setFrom(setfrom);  // 蹂대궡�뒗�궗�엺 �깮�왂�븯嫄곕굹 �븯硫� �젙�긽�옉�룞�쓣 �븞�븿
//	        messageHelper.setTo(tomail);     // 諛쏅뒗�궗�엺 �씠硫붿씪
//	        messageHelper.setSubject(title); // 硫붿씪�젣紐⑹� �깮�왂�씠 媛��뒫�븯�떎
//	        messageHelper.setText(content);  // 硫붿씪 �궡�슜
//	       
//	        mailSender.send(message);
//	      } catch(Exception e){
//	        System.out.println(e);
//	      }
		
		return map;
	}
	//�떟蹂��닔�젙�븯湲�(�꽦吏�)
	@RequestMapping("/service/reply/update.do")
	public String replyUpdate(ReplyVo vo) {
		int n=askService.replyUpdate(vo);
		AskVo vo1=askService.askGetinfo(vo.getAskNum());
		
		System.out.println("吏덈Ц�븳 �궗�엺 �씠硫붿씪"+vo1.getEmail());
		
		String setfrom = "maple950205@gmail.com"; //蹂대궡�뒗 �궗�엺 �씠硫붿씪
	    String tomail  = /*vo1.getEmail();*/"choisungjin95@gmail.com"; //諛쏅뒗 �궗�엺 �씠硫붿씪
	    String title   = "硫붽�c�꽕留� : 臾몄쓽�븯�떊 吏덈Ц �떟蹂��씠 �닔�젙�맟�뒿�땲�떎"; //硫붿씪 �젣紐�
	    String content = "�젣紐�["+vo.getQnaTitle()+"]\n�궡�슜:"+vo.getReplyContent(); //硫붿씪 �궡�슜
	    
	    try {
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper messageHelper 
	                          = new MimeMessageHelper(message, true, "UTF-8");
	   
	        messageHelper.setFrom(setfrom);  // 蹂대궡�뒗�궗�엺 �깮�왂�븯嫄곕굹 �븯硫� �젙�긽�옉�룞�쓣 �븞�븿
	        messageHelper.setTo(tomail);     // 諛쏅뒗�궗�엺 �씠硫붿씪
	        messageHelper.setSubject(title); // 硫붿씪�젣紐⑹� �깮�왂�씠 媛��뒫�븯�떎
	        messageHelper.setText(content);  // 硫붿씪 �궡�슜
	       
	        mailSender.send(message);
	      } catch(Exception e){
	        System.out.println(e);
	      }
		
		return "redirect:/service/reply/askList.do";
	}
}

