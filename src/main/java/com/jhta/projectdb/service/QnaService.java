package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.QnaDao;
import com.jhta.projectdb.vo.QnaVo;

@Service
public class QnaService {
	@Autowired
	private QnaDao dao;
	
	public QnaVo getinfo(int qnaNum) {
		return dao.getinfo(qnaNum);
	}
	
	public int insert(QnaVo vo) {
		return dao.insert(vo);
	}
	
	public List<QnaVo> list(HashMap<String, Object> map){
		return dao.list(map);
	}
	
	public int update(QnaVo vo) {
		return dao.update(vo);
	}
	
	public int delete(int qnaNum) {
		return dao.delete(qnaNum);
	}
	
	public int count() {
		return dao.count();
	}
	
	public List<HashMap<String,Object>> getRepeatedQna(){
		return dao.getRepeatedQna();
	}
	
	public List<QnaVo> searchList(HashMap<String,Object> map){
		return dao.searchList(map);
	}
	
	public int searchCount(String qnaTitle) {
		return dao.searchCount(qnaTitle);
	}
	
}
