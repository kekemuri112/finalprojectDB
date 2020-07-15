package com.jhta.projectdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhta.projectdb.dao.WScheduleDao;
import com.jhta.projectdb.vo.WSListVo;
import com.jhta.projectdb.vo.WSModalistOkVo;
import com.jhta.projectdb.vo.WSModalistVo;
@Service
public class WScheduleService {
	@Autowired
	private WScheduleDao dao;
	
	public List<WSListVo> slist(String workDate) {
		List<WSListVo> list = dao.slist(workDate);
		System.out.println("service:"+list.get(0).getDivisionname());
		return list;
	}
	
	public List<WSModalistVo> modalist(String workDate){
		System.out.println("db 서비스 완료");
		return dao.modalist(workDate);
	}
	@Transactional
	public int modalistOk(WSModalistOkVo vo) {
		int namecheck[] = vo.getNamecheck();
		String startime = vo.getStartime();
		String endtime = vo.getEndtime();
		String workdate = vo.getWorkDate();
		int n=0;
		for(int i=0;i<namecheck.length;i++) {
			n += dao.modalistOk(namecheck[i],startime,endtime,workdate);
		}
		return n;
	}
}
