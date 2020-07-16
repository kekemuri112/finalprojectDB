package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.WSListVo;
import com.jhta.projectdb.vo.WSModalistVo;
import com.jhta.projectdb.vo.WScheduleVo;


@Repository
public class WScheduleDao {
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.jhta.mybatis.mapper.wschedule";
	
	public List<WSListVo> slist(String workDate) {
		List<WSListVo> list=sqlSession.selectList(NAMESPACE+".slist",workDate);
		System.out.println("dao"+list.get(0).getDivisionname());
		return list;
	}
	
	public List<WSModalistVo> modalist(String workDate){
		System.out.println("db dao 옴");
		return sqlSession.selectList(NAMESPACE+".modalist",workDate);
	}
	
	public int modalistOk(int namecheck,String startime,String endtime,String workDate) {
		//staffnum,workstart,workend
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("staffnum", namecheck);
		map.put("workstart", startime);
		map.put("workend",endtime);
		map.put("workDate",workDate);
		return sqlSession.insert(NAMESPACE+".insert",map);
	}
	
	public int update(WScheduleVo vo) {
		return sqlSession.update(NAMESPACE+".update",vo);
	}
	
	public int delete(int sNum) {
		return sqlSession.delete(NAMESPACE+".delete",sNum);
	}
	
}
