package com.jhta.projectdb.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhta.projectdb.dao.MScheduleDao;
import com.jhta.projectdb.vo.MScheduleListVo;
import com.jhta.projectdb.vo.MScheduleVo;

@Service
public class MScheduleService {
	@Autowired
	private MScheduleDao msDao;

	public MScheduleListVo showAllMovieSchedule(HashMap<String, Object> map){
		System.out.println("serviceŸ��");
		return msDao.showAllMovieSchedule(map);
	}
	
	public List<HashMap<String, Object>> list(int branchNum,String regDate){
		return msDao.list(branchNum,regDate);
	}
	
	public List<HashMap<String, Object>> scount(int branchNum) {
		return msDao.scount(branchNum);
	}
	
	
	@Transactional
	public int insert(int[] theatherNum, String date, String time, int purchasefilmNum, Date filmDeadline) throws ParseException {
		int n=0;
		for(int i=0;i<theatherNum.length;i++) {
			//date type > string ��ȯ
			
			Date lastDate=new Date(filmDeadline.getTime());
			String from=date+time;
			SimpleDateFormat fm=new SimpleDateFormat("yyyy-MM-ddHH:mm");
			Date to=fm.parse(from);
			Date offerDate=new Date(to.getTime());
			
			
			//�󿵽ð�
			for(long j=offerDate.getTime();j<=lastDate.getTime();j=j+86400000) {
				String[] timer=time.split(":"); //[0]�� [1]��
				int timers=Integer.parseInt(timer[0]);
				while(timers<=23) {
					SimpleDateFormat fj=new SimpleDateFormat("yyyy-MM-dd");
					String stime=fj.format(j);
					String[] day=stime.split("-");
					int days=Integer.parseInt(day[2]);
					
					String startTime=day[0]+"/"+day[1]+"/"+days+" "+timers+":"+timer[1];
					MScheduleVo vo1=new MScheduleVo(0, startTime, theatherNum[i], purchasefilmNum);
					n+=msDao.insert(vo1);
					timers += 4;
				}
			}
		}
		return n;
	}
}
