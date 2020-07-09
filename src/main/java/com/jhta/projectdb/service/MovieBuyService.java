package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhta.projectdb.dao.CastDao;
import com.jhta.projectdb.dao.FilmDao;
import com.jhta.projectdb.dao.MovieImgDao;
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
	
	@Transactional
	public int moviebuyservice(FilmVo fvo,MovieImgVo mvo,String[] name) {
		System.out.println("����");
		System.out.println(fvo.getFilmName());
		System.out.println(fvo.getGenreNum());
		System.out.println(mvo.getFileName());
		System.out.println(name[0]);
		
		fdao.moviebuy(fvo);
		System.out.println("film");
		mdao.moviebuy(mvo);
		System.out.println("img");
		for(int i=0;i<name.length;i++) {
			CastVo cvo=new CastVo(0, name[i], 0);
			cdao.moviebuy(cvo);
			System.out.println("cast");
		}
		
		return 1;
	}
	
}
