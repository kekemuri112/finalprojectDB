package com.jhta.projectdb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhta.projectdb.dao.SeatDao;
import com.jhta.projectdb.vo.SeatVo;

@Service
public class SeatService {
	@Autowired
	private SeatDao dao;
	
	@Transactional
	public int insert(ArrayList<SeatVo> list) {
		int n=0;
		for(int i=0;i<list.size();i++) {
			n+=dao.insert(list.get(i));
		}
		return n;
	}
	
	@Transactional
	public int update(ArrayList<SeatVo> list) {
		int n=0;
		for(int i=0;i<list.size();i++) {
			n+=dao.update(list.get(i));
		}
		return n;
	}
	
	public ArrayList<Boolean> seatCheck(ArrayList<Integer> list) {
		ArrayList<Boolean> bList=new ArrayList<Boolean>();
		for(int i=0;i<list.size();i++) {
			int n=dao.seatCheck(list.get(i));
			boolean bl=false;
			if(n>0) {
				bl=true;
			}
			bList.add(bl);
			System.out.println("bList:"+bList.get(i));
		}
		return bList;
	}
	
	public List<SeatVo> searchSeat(int theatherNum){
		return dao.searchSeat(theatherNum);
	}
	
	
}
