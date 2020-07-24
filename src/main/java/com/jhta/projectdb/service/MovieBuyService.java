package com.jhta.projectdb.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhta.projectdb.dao.BookDao;
import com.jhta.projectdb.dao.CastDao;
import com.jhta.projectdb.dao.ChargeDao;
import com.jhta.projectdb.dao.FilmDao;
import com.jhta.projectdb.dao.MovieImgDao;
import com.jhta.projectdb.vo.BookVo;
import com.jhta.projectdb.vo.CastVo;
import com.jhta.projectdb.vo.FilmVo;
import com.jhta.projectdb.vo.MovieImgVo;

@Service
public class MovieBuyService {
	@Autowired
	private FilmDao fdao;
	@Autowired
	private MovieImgDao mdao;
	@Autowired
	private CastDao cdao;
	@Autowired
	private BookDao bdao;
	@Autowired
	private ChargeDao chargedao;
	
	@Transactional
	public int moviebuyservice(FilmVo fvo,MovieImgVo mvo,String[] name) {
		fdao.moviebuy(fvo);
		mdao.moviebuy(mvo);
		for(int i=0;i<name.length;i++) {
			cdao.moviebuy(name[i]);
			System.out.println("cast");
		}
		return 1;
	}
	
	@Transactional
	public int movieSeat(List<BookVo> list, int seatMoney,int memNum){
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("seatMoney", seatMoney);
		map.put("memNum", memNum);
		int n=chargedao.insert(map);
		for(int i=0;i<list.size();i++) {
			BookVo vo=list.get(i);
			n+=bdao.insert(vo);
		}
		return n;
	}
	
	public String deadline() {
		return fdao.deadline();
	}
	
}
